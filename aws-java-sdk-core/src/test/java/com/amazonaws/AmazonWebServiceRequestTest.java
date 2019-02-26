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

package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.handlers.HandlerContextKey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.SyncProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

import utils.model.EmptyAmazonWebServiceRequest;

public class AmazonWebServiceRequestTest {

    @Test
    public void cloneSourceAndRootBehaviorShouldBeCorrect() {
        AmazonWebServiceRequest root = new AmazonWebServiceRequest() {};
        assertNull(root.getCloneSource());
        assertNull(root.getCloneRoot());

        AmazonWebServiceRequest clone = root.clone();
        assertEquals(root, clone.getCloneSource());
        assertEquals(root, clone.getCloneRoot());

        AmazonWebServiceRequest clone2 = clone.clone();
        assertEquals(clone, clone2.getCloneSource());
        assertEquals(root, clone2.getCloneRoot());
    }

    @Test
    public void contextBehaviorShouldBeCorrect() {
        final String givenContextValue = "Hello";
        HandlerContextKey<String> context = new HandlerContextKey<String>("");
        AmazonWebServiceRequest request = new AmazonWebServiceRequest() {};

        // Requests should store context
        request.addHandlerContext(context, "Hello");

        assertEquals(request.getHandlerContext().get(context), givenContextValue);
        assertEquals(request.getHandlerContext(context), givenContextValue);

        // Clones should inherit context
        AmazonWebServiceRequest clone = request.clone();

        assertEquals(clone.getHandlerContext().get(context), givenContextValue);
        assertEquals(clone.getHandlerContext(context), givenContextValue);

        // Modifications of request and clone context should not affect each other
        clone.addHandlerContext(context, "Hello2");
        request.addHandlerContext(context, "Hello3");

        assertEquals(clone.getHandlerContext(context), "Hello2");
        assertEquals(request.getHandlerContext(context), "Hello3");
    }

    @Test
    public void copyBaseTo() {
        final ProgressListener listener = new SyncProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
            }
        };
        final AWSCredentials credentials = new BasicAWSCredentials("accesskey",
                "accessid");
        final RequestMetricCollector collector = new RequestMetricCollector() {
            @Override
            public void collectMetrics(Request<?> request, Response<?> response) {
            }
        };

        final AmazonWebServiceRequest from = new AmazonWebServiceRequest() {
        };
        from.setGeneralProgressListener(listener);
        from.setRequestCredentials(credentials);
        from.setRequestMetricCollector(collector);
        from.putCustomRequestHeader("k1", "v1");
        from.putCustomRequestHeader("k2", "v2");
        from.putCustomQueryParameter("k1", "v1");
        from.putCustomQueryParameter("k2", "v2a");
        from.putCustomQueryParameter("k2", "v2b");
        from.getRequestClientOptions().setReadLimit(1234);

        final AmazonWebServiceRequest to = new AmazonWebServiceRequest() {
        };

        // Before copy
        RequestClientOptions toOptions;
        verifyBaseBeforeCopy(to);

        // After copy
        from.copyBaseTo(to);
        verifyBaseAfterCopy(listener, credentials, collector, from, to);
    }

    @Test
    public void nullCredentialsSet_ReturnsNullProvider() {
        AmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.setRequestCredentials(null);
        assertNull(request.getRequestCredentialsProvider());
    }

    public static void verifyBaseBeforeCopy(final AmazonWebServiceRequest to) {
        assertNull(to.getCustomRequestHeaders());
        assertNull(to.getCustomQueryParameters());
        assertSame(ProgressListener.NOOP, to.getGeneralProgressListener());
        assertNull(to.getRequestCredentials());
        assertNull(to.getRequestMetricCollector());

        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == to
                .getReadLimit());
        RequestClientOptions toOptions = to.getRequestClientOptions();
        assertNull(toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == toOptions
                .getReadLimit());
    }

    private static void verifyBaseAfterCopy(final ProgressListener listener,
            final AWSCredentials credentials,
            final RequestMetricCollector collector,
            final AmazonWebServiceRequest from, final AmazonWebServiceRequest to) {
        RequestClientOptions toOptions;
        Map<String, String> headers = to.getCustomRequestHeaders();
        assertTrue(2 == headers.size());
        assertEquals("v1", headers.get("k1"));
        assertEquals("v2", headers.get("k2"));
        Map<String, List<String>> parmas = to.getCustomQueryParameters();
        assertTrue(2 == parmas.size());
        assertEquals(Arrays.asList("v1"), parmas.get("k1"));
        assertEquals(Arrays.asList("v2a", "v2b"), parmas.get("k2"));
        assertSame(listener, to.getGeneralProgressListener());
        assertSame(credentials, to.getRequestCredentials());
        assertSame(collector, to.getRequestMetricCollector());

        assertTrue(1234 == to.getReadLimit());
        toOptions = to.getRequestClientOptions();
        assertEquals(
                from.getRequestClientOptions().getClientMarker(
                        Marker.USER_AGENT),
                toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(1234 == toOptions.getReadLimit());
    }
}
