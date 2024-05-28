/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.net.URI;
import java.net.URL;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for utility methods in {@link RuntimeHttpUtils}.
 */
@RunWith(Enclosed.class)
public class RuntimeHttpUtilsTest {

    /**
     * Unit tests for {@link RuntimeHttpUtils#getUserAgent(ClientConfiguration, String, AWSCredentials)} .
     */
    public static class GetUserAgentTest {

        private static final String PROVIDER = "ProfileCredentialsProvider";

        @Test
        public void when_credentialsContainsProvider_authSourceIsPresent() {
            BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid", null, PROVIDER);
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, credentials);
            assertTrue(userAgent.contains("cfg/auth-source#prof"));
        }

        @Test
        public void when_credentialsDoesNotContainProvider_authSourceIsNotPresent() {
            BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid", null);
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, credentials);
            assertFalse(userAgent.contains("cfg/auth-source#prof"));
        }

        @Test
        public void when_credentialsContainsProvider_andProviderIsEmpty_unknownValueIsReturned() {
            BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid", null, "");
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, credentials);
            assertTrue(userAgent.contains("cfg/auth-source#unknown"));
        }

        @Test
        public void when_credentialsContainsProvider_andProviderIsUnknown_stringValueIsReturned() {
            BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid", null, "MyHomebrewedCredentialsProvider");
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, credentials);
            assertTrue(userAgent.contains("cfg/auth-source#MyHomebrewedCredentialsProvider"));
        }

        @Test
        public void when_credentialsContainsIllegalProviderName_authSourceIsNotPresent() {
            BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid", "My@#$%$CredentialsProvider");
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, credentials);
            assertFalse(userAgent.contains("cfg/auth-source#prof"));
        }
    }

    /**
     * Unit tests for {@link RuntimeHttpUtils#convertRequestToUrl(Request, boolean, boolean)}.
     */
    public static class ConvertRequestToUrlTest {

        private static final URI ENDPOINT = URI.create("https://test.amazonaws.com");

        @Test
        public void plainTextPathAndQuery_PathWithoutLeadingSlash() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("queryOne", "valOne")
                    .withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryOne=valOne&queryTwo=valTwo", url);
        }

        @Test
        public void pathWithLeadingSlash_RemovedWhenRemoveLeadingSlashSetToTrue() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, true, true);
            assertUrlEquals("https://test.amazonaws.com/foo/bar", url);
        }

        @Test
        public void pathWithLeadingSlash_EncodedWhenRemoveLeadingSlashSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/%2Ffoo/bar", url);
        }

        @Test
        public void pathWithWhitespace_UrlEncodedWhenFlagSetToTrue() {
            Request<?> request = newRequest();
            request.setResourcePath("foo bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/foo%20bar", url);
        }

        @Test
        public void pathWithWhitespace_NotUrlEncodedWhenFlagSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("foo bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo bar", url);
        }

        @Test
        public void pathWithLeadingSlash_DoubleSlashStillUrlEncodedWhenUrlEncodeSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/%2Ffoo/bar", url);
        }

        @Test
        public void doubleSlashWithinPath_UrlEncoded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo//bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/%2Fbar", url);
        }

        @Test
        public void queryParamValuesWithWhitespace_UrlEncoded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("queryOne", "val one");
            request.withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryOne=val%20one&queryTwo=valTwo", url);
        }

        @Test
        public void queryParamKeyWithWhitespace_UrlEnocded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("query one", "valOne");
            request.withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?query%20one=valOne&queryTwo=valTwo", url);
        }

        @Test
        public void queryParamWithMultipleValue_OrderingIsPreserved() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.addParameters("queryList", Arrays.asList("foo", "bar", "baz"));
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryList=foo&queryList=bar&queryList=baz", url);
        }

        @Test(expected = SdkClientException.class)
        public void endpointWithoutProtocol_ThrowsSdkClientException() {
            Request<?> request = new DefaultRequest<Object>("foo");
            request.setEndpoint(URI.create("foo.amazon.com"));
            request.setResourcePath("foo/bar");
            RuntimeHttpUtils.convertRequestToUrl(request, false, false);
        }



        private Request<?> newRequest() {
            Request<?> request = new DefaultRequest<Object>("foo");
            request.setEndpoint(ENDPOINT);
            return request;
        }

        private void assertUrlEquals(String expected, URL actual) {
            assertEquals(expected, actual.toExternalForm());
        }

    }

}