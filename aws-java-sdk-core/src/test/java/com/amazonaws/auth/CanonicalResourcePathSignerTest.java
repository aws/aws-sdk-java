/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;

import com.amazonaws.SignableRequest;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Tests how canonical resource paths are created including normalization
 */
@RunWith(Parameterized.class)
public class CanonicalResourcePathSignerTest {

    @Parameterized.Parameter(0)
    public TestCase tc;

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object> data() {
        return Arrays.<Object>asList(

            // Handling slash
            tc("Empty path -> (initial) slash added", "", "/"),
            tc("Slash -> unchanged", "/", "/"),
            tc("Single segment with initial slash -> unchanged", "/foo", "/foo"),
            tc("Single segment no slash -> slash prepended", "foo", "/foo"),
            tc("Multiple segments -> unchanged", "/foo/bar", "/foo/bar"),
            tc("Multiple segments with trailing slash -> unchanged", "/foo/bar/", "/foo/bar/"),

            // Double URL encoding
            tc("Multiple segments, urlEncoded slash -> encodes percent", "/foo%2Fbar", "/foo%252Fbar"),

            // Normalization
            tc("Single segment, dot -> should remove dot", "/.", "/"),
            tc("Single segment, double dot -> unchanged", "/..", "/.."),
            tc("Multiple segments with dot -> should remove dot", "/foo/./bar", "/foo/bar"),
            tc("Multiple segments with ending dot -> should remove dot and trailing slash", "/foo/bar/.", "/foo/bar"),
            tc("Multiple segments with dots -> should remove dots and preceding segment", "/foo/bar/../baz", "/foo/baz"),
            tc("First segment has colon -> unchanged, url encoded first", "foo:/bar", "/foo%3A/bar"),

            // Double URL encoding and dots
            tc("Multiple segments, urlEncoded slash -> encodes percent", "/foo%2F.%2Fbar", "/foo%252F.%252Fbar"),

            // Without double url encode
            tc("No url encode, Multiple segments with dot -> unchanged", "/foo/./bar", "/foo/./bar", false),
            tc("Multiple segments with dots -> unchanged", "/foo/bar/../baz", "/foo/bar/../baz", false)
        );
    }

    @Test
    public void verifyNormalizedPath() {
        SignableRequest request = generateBasicRequestWithPath(tc.path);
        String contentSha256 = tc.signer.calculateContentHash(request);
        String canonicalRequest = tc.signer.createCanonicalRequest(request, contentSha256);
        assertCanonicalRequest(canonicalRequest, tc.expectedPath, contentSha256);
    }

    private void assertCanonicalRequest(String canonicalRequest, String expectedPath, String contentSha256) {
        String[] requestParts = canonicalRequest.split("\\n");
        String canonicalPath = requestParts[1];
        String canonicalHash = requestParts[7];
        assertEquals(expectedPath, canonicalPath);
        assertEquals(contentSha256, canonicalHash);
    }

    private SignableRequest<?> generateBasicRequestWithPath(String path) {
        return MockRequestBuilder.create()
                .withContent(new ByteArrayInputStream("{\"TableName\": \"foo\"}".getBytes()))
                .withHeader("Host", "demo.us-east-1.amazonaws.com")
                .withHeader("x-amz-archive-description", "test  test")
                .withPath(path)
                .withEndpoint("http://demo.us-east-1.amazonaws.com").build();
    }

    private static TestCase tc(String name, String path, String expectedPath) {
        return new TestCase(name, path, expectedPath, true);
    }

    private static TestCase tc(String name, String path, String expectedPath, boolean urlEncode) {
        return new TestCase(name, path, expectedPath, urlEncode);
    }

    private static class TestCase {
        private String name;
        private String path;
        private String expectedPath;
        private AWS4Signer signer;

        public TestCase(String name, String path, String expectedPath, boolean urlEncode) {
            this.name = name;
            this.path = path;
            this.expectedPath = expectedPath;
            this.signer = new AWS4Signer(urlEncode);
        }

        @Override
        public String toString() {
            return "TestCase{" +
                   "name='" + name + '\'' +
                   ", path='" + path + '\'' +
                   ", expectedPath=" + expectedPath +
                   ", urlEncode=" + signer.doubleUrlEncode +
                   '}';
        }
    }
}
