/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.net.URI;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;

public class QueryStringSignerTest {

    private static final QueryStringSigner signer = new QueryStringSigner();
    private static final AWSCredentials credentials = new BasicAWSCredentials("123456789", "123456789");

    private static final String EXPECTED_SIGNATURE = "VjYMhf9TWp08zAxXbKDAvUhW9GjJ56QjAuSj3LBsfjM=";

    static {
        Calendar c = new GregorianCalendar();
        c.clear();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        signer.overrideDate(c.getTime());
    }


    @Test
    public void testRequestResourcePath() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.amazon.com"));
        request.addParameter("foo", "bar");
        request.setResourcePath("foo/bar");

        signer.sign(request, credentials);
        assertNotNull(request.getParameters().get("Signature"));
        assertEquals(EXPECTED_SIGNATURE, request.getParameters().get("Signature"));
    }

    @Test
    public void testRequestAndEndpointResourcePath() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.amazon.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("/bar");

        signer.sign(request, credentials);
        assertNotNull(request.getParameters().get("Signature"));
        assertEquals(EXPECTED_SIGNATURE, request.getParameters().get("Signature"));
    }

    @Test
    public void testRequestAndEndpointResourcePathNoSlash() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.amazon.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("bar");

        signer.sign(request, credentials);

        assertNotNull(request.getParameters().get("Signature"));
        assertEquals(EXPECTED_SIGNATURE, request.getParameters().get("Signature"));
    }

    @Test
    public void testAnonymous() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.amazon.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("bar");

        signer.sign(request, new AnonymousAWSCredentials());

        assertNull(request.getParameters().get("Signature"));
    }

}