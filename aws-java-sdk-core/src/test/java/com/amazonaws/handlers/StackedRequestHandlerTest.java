/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.apache.http.client.methods.HttpGet;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.http.HttpResponse;

@RunWith(Enclosed.class)
public class StackedRequestHandlerTest {

    /**
     * Tests a {@link StackedRequestHandler} with no {@link RequestHandler2}'s added. Mainly tests
     * that things don't blow up as nothing should happen when no request handlers are added
     */
    public static class NoRequestHandlers {

        private StackedRequestHandler stackedRequestHandler;

        @Mock
        private Request<?> request;

        private Response<?> response;

        @Before
        public void setup() {
            MockitoAnnotations.initMocks(this);
            stackedRequestHandler = new StackedRequestHandler(new ArrayList<RequestHandler2>());

            response = new Response<String>("Dummy response", new HttpResponse(request, new HttpGet()));
        }

        @Test
        public void beforeMarshalling() {
            final AmazonWebServiceRequest inputRequest = mock(AmazonWebServiceRequest.class);
            stackedRequestHandler.beforeMarshalling(inputRequest);
        }

        @Test
        public void beforeRequest() {
            stackedRequestHandler.beforeRequest(request);
        }

        @Test
        public void beforeUnmarshalling() {
            stackedRequestHandler.beforeUnmarshalling(request, new HttpResponse(request, null));
        }

        @Test
        public void afterResponse() {
            stackedRequestHandler.afterResponse(request, response);
        }

        @Test
        public void afterError() {
            final Exception exception = new AmazonServiceException("Some service failure");
            stackedRequestHandler.afterError(request, response, exception);
        }
    }

    /**
     * Tests a {@link StackedRequestHandler} with a single {@link RequestHandler2} added. Tests that
     * only that request handler is delegated to.
     */
    public static class SingleRequestHandler {

        private StackedRequestHandler stackedRequestHandler;

        @Mock
        private RequestHandler2 only;

        @Mock
        private Request<?> request;

        private Response<?> response;

        @Before
        public void setup() {
            MockitoAnnotations.initMocks(this);
            stackedRequestHandler = new StackedRequestHandler(only);

            response = new Response<String>("Dummy response", new HttpResponse(request, new HttpGet()));
        }

        @Test
        public void beforeMarshalling() {
            final AmazonWebServiceRequest inputRequest = mock(AmazonWebServiceRequest.class);
            stackedRequestHandler.beforeMarshalling(inputRequest);
            assertNull(verify(only).beforeMarshalling(inputRequest));
        }

        @Test
        public void beforeRequest() {
            stackedRequestHandler.beforeRequest(request);
            verify(only).beforeRequest(request);
        }

        @Test
        public void beforeUnmarshalling() {
            HttpResponse httpResponse = new HttpResponse(request, null);
            stackedRequestHandler.beforeUnmarshalling(request, httpResponse);
            verify(only).beforeUnmarshalling(request, httpResponse);
        }

        @Test
        public void afterResponse() {
            stackedRequestHandler.afterResponse(request, response);
            verify(only).afterResponse(request, response);
        }

        @Test
        public void afterError() {
            final Exception exception = new AmazonServiceException("Some service failure");
            stackedRequestHandler.afterError(request, response, exception);
            verify(only).afterError(request, response, exception);
        }

    }

    /**
     * Tests a {@link StackedRequestHandler} with multiple {@link RequestHandler2} added. Before
     * hooks should be executed in normal order (i.e. first, second, then third in respect to what
     * order they were added to the {@link StackedRequestHandler}) and after hooks should be
     * executed in reverse order (i.e. third, second, first)
     */
    public static class MultipleRequestHandlers {

        private StackedRequestHandler stackedRequestHandler;

        @Mock
        private RequestHandler2 first;

        @Mock
        private RequestHandler2 second;

        @Mock
        private RequestHandler2 third;

        @Mock
        private Request<?> request;

        private Response<?> response;

        @Before
        public void setup() {
            MockitoAnnotations.initMocks(this);
            stackedRequestHandler = new StackedRequestHandler(first, second, third);

            response = new Response<String>("Dummy response", new HttpResponse(request, new HttpGet()));
        }

        @Test
        public void beforeMarshalling_CalledInOrder() {
            stackedRequestHandler.beforeMarshalling(null);

            InOrder inOrder = inOrder(first, second, third);
            inOrder.verify(first).beforeMarshalling(null);
            inOrder.verify(second).beforeMarshalling(null);
            inOrder.verify(third).beforeMarshalling(null);
        }

        /**
         * The beforeMarshalling step is a bit different. It's expected to take the potentially
         * modified {@link AmazonWebServiceRequest} returned by
         * {@link RequestHandler2#beforeMarshalling(AmazonWebServiceRequest)} and forward that
         * result as input to the next request handler in the chain. This tests makes sure that each
         * request handler forwards the appropriate the result to the next in the chain and that the
         * end result is what's returned by the last request handler in the chain
         */
        @Test
        public void beforeMarshalling_ModifiedRequestForwardedToNextInChain() {
            final AmazonWebServiceRequest origAwsRequest = mock(AmazonWebServiceRequest.class);
            final AmazonWebServiceRequest afterFirstAwsRequest = mock(AmazonWebServiceRequest.class);
            final AmazonWebServiceRequest afterSecondAwsRequest = mock(AmazonWebServiceRequest.class);
            final AmazonWebServiceRequest afterThirdAwsRequest = mock(AmazonWebServiceRequest.class);

            doReturn(afterFirstAwsRequest).when(first).beforeMarshalling(origAwsRequest);
            doReturn(afterSecondAwsRequest).when(second).beforeMarshalling(afterFirstAwsRequest);
            doReturn(afterThirdAwsRequest).when(third).beforeMarshalling(afterSecondAwsRequest);

            assertEquals(afterThirdAwsRequest, stackedRequestHandler.beforeMarshalling(origAwsRequest));

            InOrder inOrder = inOrder(first, second, third);
            inOrder.verify(first).beforeMarshalling(origAwsRequest);
            inOrder.verify(second).beforeMarshalling(afterFirstAwsRequest);
            inOrder.verify(third).beforeMarshalling(afterSecondAwsRequest);
        }

        @Test
        public void beforeRequest_CalledInOrder() {
            stackedRequestHandler.beforeRequest(request);

            InOrder inOrder = inOrder(first, second, third);
            inOrder.verify(first).beforeRequest(request);
            inOrder.verify(second).beforeRequest(request);
            inOrder.verify(third).beforeRequest(request);
        }

        @Test
        public void beforeUnmarshalling_CalledInOrder() {
            stackedRequestHandler.beforeUnmarshalling(request, null);

            InOrder inOrder = inOrder(third, second, first);
            inOrder.verify(third).beforeUnmarshalling(request, null);
            inOrder.verify(second).beforeUnmarshalling(request, null);
            inOrder.verify(first).beforeUnmarshalling(request, null);
        }

        @Test
        public void beforeUnmarshalling_ModifiedResponseForwardedToNextInChain() {
            final HttpResponse origHttpResponse = mock(HttpResponse.class);
            final HttpResponse afterFirstHttpResponse = mock(HttpResponse.class);
            final HttpResponse afterSecondHttpResponse = mock(HttpResponse.class);
            final HttpResponse afterThirdHttpResponse = mock(HttpResponse.class);

            doReturn(afterThirdHttpResponse).when(third).beforeUnmarshalling(request, origHttpResponse);
            doReturn(afterSecondHttpResponse).when(second).beforeUnmarshalling(request, afterThirdHttpResponse);
            doReturn(afterFirstHttpResponse).when(first).beforeUnmarshalling(request, afterSecondHttpResponse);

            assertEquals(afterFirstHttpResponse, stackedRequestHandler.beforeUnmarshalling(request, origHttpResponse));

            InOrder inOrder = inOrder(third, second, first);
            inOrder.verify(third).beforeUnmarshalling(request, origHttpResponse);
            inOrder.verify(second).beforeUnmarshalling(request, afterThirdHttpResponse);
            inOrder.verify(first).beforeUnmarshalling(request, afterSecondHttpResponse);
        }

        @Test
        public void afterResponse_CalledInOrder() {
            stackedRequestHandler.afterResponse(request, response);

            InOrder inOrder = inOrder(third, second, first);
            inOrder.verify(third).afterResponse(request, response);
            inOrder.verify(second).afterResponse(request, response);
            inOrder.verify(first).afterResponse(request, response);
        }

        @Test
        public void afterError_CalledInOrder() {
            final Exception exception = new AmazonServiceException("Some service failure");
            stackedRequestHandler.afterError(request, response, exception);

            InOrder inOrder = inOrder(third, second, first);
            inOrder.verify(third).afterError(request, response, exception);
            inOrder.verify(second).afterError(request, response, exception);
            inOrder.verify(first).afterError(request, response, exception);
        }

    }

}
