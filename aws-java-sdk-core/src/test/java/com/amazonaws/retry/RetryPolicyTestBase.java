/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.retry;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.junit.Assert;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.util.StringInputStream;

/** Some utility class and method for testing RetryCondition */
public class RetryPolicyTestBase {
    
    protected static ClientConfiguration clientConfiguration = new ClientConfiguration();
    protected static final AmazonWebServiceRequest originalRequest = new TestAmazonWebServiceRequest();
    protected static final HttpResponseHandler<AmazonServiceException> errorResponseHandler = new TestHttpResponseHandler();
 
    /**
     * The retry condition and back-off strategy implementations that record all
     * the context data passed into shouldRetry and calculateSleepTime methods.
     */
    protected static ContextDataCollectionRetryCondition retryCondition;
    protected static ContextDataCollectionBackoffStrategy backoffStrategy;
    
    public static void injectMockHttpClient(AmazonHttpClient amazonHttpClient, ConnectionManagerAwareHttpClient mockHttpClient) {
        try {
            Field f = AmazonHttpClient.class.getDeclaredField("httpClient");
            f.setAccessible(true);
            f.set(amazonHttpClient, mockHttpClient);
        } catch (Exception e) {
            Assert.fail("Cannot inject the mock HttpClient object. " + e.getMessage());
        }
    }
    
    @SuppressWarnings("rawtypes")
    public static Request<?> getSampleRequestWithRepeatableContent(AmazonWebServiceRequest amazonWebServiceRequest) {
        DefaultRequest<?> request = new DefaultRequest(
                amazonWebServiceRequest, "non-existent-service");
        request.setEndpoint(URI.create("http://non-existent-service.amazonaws.com"));
        // StringInputStream#markSupported() returns true
        try {
            request.setContent(new StringInputStream("Some content that could be read for multiple times."));
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Unable to set up the request content");
        }
        return request;
    }
    
    @SuppressWarnings("rawtypes")
    public static Request<?> getSampleRequestWithNonRepeatableContent(AmazonWebServiceRequest amazonWebServiceRequest) {
        DefaultRequest<?> request = new DefaultRequest(
                amazonWebServiceRequest, "non-existent-service");
        request.setEndpoint(URI.create("http://non-existent-service.amazonaws.com"));
        // NonRepeatableInputStream#markSupported() returns false
        request.setContent(new NonRepeatableInputStream("Some content that could only be read once."));
        return request;
    }
    
    public static class ContextDataCollectionRetryCondition extends
            ContextDataCollection implements RetryPolicy.RetryCondition {
        
        @Override
        public boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                   AmazonClientException exception,
                                   int retriesAttempted) {
            collect(originalRequest, exception, retriesAttempted);
            return true;
        }
    }
    
    public static class ContextDataCollectionBackoffStrategy extends
            ContextDataCollection implements RetryPolicy.BackoffStrategy {

        @Override
        public long delayBeforeNextRetry(AmazonWebServiceRequest originalRequest,
                                         AmazonClientException exception,
                                         int retriesAttempted) {
            collect(originalRequest, exception, retriesAttempted);
            return 0; // immediately retry to speed-up the test
        }
    }
    
    private static class ContextDataCollection {
        
        public List<AmazonWebServiceRequest> failedRequests = new LinkedList<AmazonWebServiceRequest>();
        public List<AmazonClientException> exceptions = new LinkedList<AmazonClientException>();
        public List<Integer> retriesAttemptedValues = new LinkedList<Integer>();
        
        public void collect(AmazonWebServiceRequest originalRequest,
                AmazonClientException exception, int retriesAttempted) {
            failedRequests.add(originalRequest);
            exceptions.add(exception);
            retriesAttemptedValues.add(retriesAttempted);
        }
    }
    
    /** Verifies the RetryCondition has collected the expected context information. */
    public static void verifyExpectedContextData(ContextDataCollection contextDataCollection,
                                                 AmazonWebServiceRequest failedRequest,
                                                 AmazonClientException expectedException,
                                                 int expectedRetries) {
        
        Assert.assertEquals(expectedRetries, contextDataCollection.failedRequests.size());
        Assert.assertEquals(expectedRetries, contextDataCollection.exceptions.size());
        Assert.assertEquals(expectedRetries, contextDataCollection.retriesAttemptedValues.size());
        
        if (expectedRetries > 0 ) {
            if (failedRequest != null) {
                // It should keep getting the same original request instance
                for (AmazonWebServiceRequest seenRequest : contextDataCollection.failedRequests) {
                    Assert.assertTrue("seeRequest=" + seenRequest
                            + ", failedRequest=" + failedRequest,
                            seenRequest == failedRequest);
                }
            }
            
            // Verify the exceptions
            if (expectedException instanceof AmazonServiceException) {
                // It should get service exceptions with the expected error and status code
                AmazonServiceException ase = (AmazonServiceException)expectedException;
                for (AmazonClientException seenException : contextDataCollection.exceptions) {
                    Assert.assertTrue(seenException instanceof AmazonServiceException);
                    Assert.assertEquals(ase.getErrorCode(), ((AmazonServiceException)seenException).getErrorCode());
                    Assert.assertEquals(ase.getStatusCode(), ((AmazonServiceException)seenException).getStatusCode());
                }
            } else if (expectedException != null) {
                // Client exceptions should have the same expected cause (the same
                // throwable instance from the mock HttpClient).
                Throwable expectedCause = expectedException.getCause();
                for (AmazonClientException seenException : contextDataCollection.exceptions) {
                    Assert.assertTrue(expectedCause == seenException.getCause());
                }
            }
            
            // It should get "retriesAttempted" values starting from 0
            int expectedRetriesAttempted = 0;
            for (int seenRetriesAttempted : contextDataCollection.retriesAttemptedValues) {
                Assert.assertEquals(expectedRetriesAttempted++, seenRetriesAttempted);
            }
        }
        
    }
    
    public static class TestAmazonWebServiceRequest extends AmazonWebServiceRequest {}
    
    /**
     * An error response handler implementation that simply
     *   - keeps the status code
     *   - sets the error code by the status text (which comes from the reason phrase in the low-level response)
     */
    public static class TestHttpResponseHandler implements HttpResponseHandler<AmazonServiceException> {

        @Override
        public AmazonServiceException handle(
                com.amazonaws.http.HttpResponse response) throws Exception {
            AmazonServiceException ase = new AmazonServiceException("Fake service exception.");
            ase.setStatusCode(response.getStatusCode());
            ase.setErrorCode(response.getStatusText());
            return ase;
        }

        @Override
        public boolean needsConnectionLeftOpen() {
            return false;
        }
    }
    /**
     * A mock HttpClient implementation that does nothing but throws the
     * specified IOException or RuntimeException upon any call on execute(...)
     * method.
     */
    public static class ThrowingExceptionHttpClient extends MockHttpClient {

        private final Throwable t;
        
        /**
         * @param t An IOException or RuntimeException object.
         */
        public ThrowingExceptionHttpClient(Throwable t) {
            this.t = t;
        }
        
        @Override
        public HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException {
            if (t instanceof IOException) {
                throw (IOException)t;
            } else if (t instanceof RuntimeException){
                throw (RuntimeException)t;
            } else {
                Assert.fail("The expected throwable should be either an IOException or RuntimeException.");
                return null;
            }
        }
        
    }
    
    /**
     * A mock HttpClient implementation that does nothing but directly returns a
     * BasicHttpResponse object with the specified status code upon any call on
     * execute(...) method.
     */
    public static class ReturnServiceErrorHttpClient extends MockHttpClient {

        private final int statusCode;
        private final String reasonPhrase;
        
        /**
         * @param statusCode The status code to be included in the error response.
         */
        public ReturnServiceErrorHttpClient(int statusCode, String reasonPhrase) {
            this.statusCode = statusCode;
            this.reasonPhrase = reasonPhrase;
        }
        
        @Override
        public HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException {
            return new BasicHttpResponse(new BasicStatusLine(
                    HttpVersion.HTTP_1_1,
                    statusCode,
                    reasonPhrase));
        }
        
    }
    
    /** A base abstract class for fake HttpClient implementations */
    public static abstract class MockHttpClient implements ConnectionManagerAwareHttpClient {

        @Override
        public abstract HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException;
        
        @Override
        public HttpResponse execute(HttpUriRequest request, HttpContext context)
                throws IOException, ClientProtocolException {
            return execute(request);
        }
        
        /*
         * Unsupported operations.
         * These operations are not used by AmazonHttpClient
         */
        
        @Override
        public HttpParams getParams() { return null; }

        @Override
        public ClientConnectionManager getConnectionManager() { return null; }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpUriRequest request,
                ResponseHandler<? extends T> responseHandler)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpUriRequest request,
                ResponseHandler<? extends T> responseHandler,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request,
                ResponseHandler<? extends T> responseHandler)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request,
                ResponseHandler<? extends T> responseHandler,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public HttpClientConnectionManager getHttpClientConnectionManager() {
            return null;
        }
    }
    
}
