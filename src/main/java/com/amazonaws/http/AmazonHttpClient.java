/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;
import static com.amazonaws.SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.PROFILING_SYSTEM_PROPERTY;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpStatus;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.CountingInputStream;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.ResponseMetadataCache;
import com.amazonaws.util.TimingInfo;

@ThreadSafe
public class AmazonHttpClient {

    private static final String HEADER_USER_AGENT = "User-Agent";

    /**
     * Logger providing detailed information on requests/responses. Users can
     * enable this logger to get access to AWS request IDs for responses,
     * individual requests and parameters sent to AWS, etc.
     */
    private static final Log requestLog = LogFactory.getLog("com.amazonaws.request");

    /**
     * Logger for more detailed debugging information, that might not be as
     * useful for end users (ex: HTTP client configuration, etc).
     */
    static final Log log = LogFactory.getLog(AmazonHttpClient.class);

    /** Internal client for sending HTTP requests */
    private final HttpClient httpClient;

    /** Client configuration options, such as proxy settings, max retries, etc. */
    private final ClientConfiguration config;

    /** Cache of metadata for recently executed requests for diagnostic purposes */
    private final ResponseMetadataCache responseMetadataCache = new ResponseMetadataCache(50);

    /**
     * A request metric collector used specifically for this http client; or
     * null if there is none. This collector, if specified, always takes
     * precedence over the one specified at the AWS SDK level.
     * 
     * @see AwsSdkMetrics
     */
    private final RequestMetricCollector requestMetricCollector;

    private static final HttpRequestFactory httpRequestFactory = new HttpRequestFactory();
    private static final HttpClientFactory httpClientFactory = new HttpClientFactory();

    static {
        // Customers have reported XML parsing issues with the following
        // JVM versions, which don't occur with more recent versions, so
        // if we detect any of these, give customers a heads up.
        List<String> problematicJvmVersions = Arrays.asList(
            "1.6.0_06", "1.6.0_13", "1.6.0_17");
        String jvmVersion = System.getProperty("java.version");
        if (problematicJvmVersions.contains(jvmVersion)) {
            log.warn("Detected a possible problem with the current JVM version (" + jvmVersion + ").  " +
                     "If you experience XML parsing problems using the SDK, try upgrading to a more recent JVM update.");
        }
    }

    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc).
     *
     * @param config
     *            Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     */
    public AmazonHttpClient(ClientConfiguration config) {
        this(config, null);
    }
    
    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc), and request metric
     * collector.
     * 
     * @param config
     *            Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     * @param requestMetricCollector
     *            client specific request metric collector, which takes
     *            precedence over the one at the AWS SDK level; or null if there
     *            is none.
     */
    public AmazonHttpClient(ClientConfiguration config, RequestMetricCollector requestMetricCollector) {
        this.config = config;
        this.httpClient = httpClientFactory.createHttpClient(config);
        this.requestMetricCollector = requestMetricCollector;
    }
    /**
     * Returns additional response metadata for an executed request. Response
     * metadata isn't considered part of the standard results returned by an
     * operation, so it's accessed instead through this diagnostic interface.
     * Response metadata is typically used for troubleshooting issues with AWS
     * support staff when services aren't acting as expected.
     *
     * @param request
     *            A previously executed AmazonWebServiceRequest object, whose
     *            response metadata is desired.
     *
     * @return The response metadata for the specified request, otherwise null
     *         if there is no response metadata available for the request.
     */
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest request) {
        return responseMetadataCache.get(request);
    }

    /**
     * Disables the default strict hostname verification in this client and
     * instead uses a browser compatible hostname verification strategy (i.e.
     * cert hostname wildcards are evaulated more liberally).
     */
    public void disableStrictHostnameVerification() {

        /*
         * If SSL cert checking for endpoints is disabled, we don't need
         * to do any changes to the SSL context.
         */
        if (System.getProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY) != null) {
            return;
        }

        try {
            SchemeRegistry schemeRegistry = httpClient.getConnectionManager().getSchemeRegistry();

            SSLSocketFactory sf = new SSLSocketFactory(
                    SSLContext.getDefault(),
                    SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            Scheme https = new Scheme("https", 443, sf);

            schemeRegistry.register(https);
        } catch (NoSuchAlgorithmException e) {
            throw new AmazonClientException("Unable to access default SSL context to disable strict hostname verification");
        }
    }
    /**
     * Executes the request and returns the result.
     *
     * @param request
     *            The AmazonWebServices request to send to the remote server
     * @param responseHandler
     *            A response handler to accept a successful response from the
     *            remote server
     * @param errorResponseHandler
     *            A response handler to accept an unsuccessful response from the
     *            remote server
     * @param executionContext
     *            Additional information about the context of this web service
     *            call
     */
    public <T> Response<T> execute(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            ExecutionContext executionContext) throws AmazonClientException, AmazonServiceException {
        if (executionContext == null)
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);

        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Response<T> response = null;
        try {
            response = executeHelper(request, responseHandler, errorResponseHandler, executionContext);
            TimingInfo timingInfo = awsRequestMetrics.getTimingInfo().endTiming();
            afterResponse(request, requestHandler2s, response, timingInfo);
            return response;
        } catch (AmazonClientException e) {
            afterError(request, response, requestHandler2s, e);
            throw e;
        }
    }

    private void afterError(Request<?> request, Response<?> response,
            List<RequestHandler2> requestHandler2s, AmazonClientException e) {
        for (RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterError(request, response, e);
        }
    }

    private <T> void afterResponse(Request<?> request,
            List<RequestHandler2> requestHandler2s,
            Response<T> response,
            TimingInfo timingInfo) {
        for (RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterResponse(request, response);
        }
    }

    private List<RequestHandler2> requestHandler2s(Request<?> request,
            ExecutionContext executionContext) {
        List<RequestHandler2> requestHandler2s = executionContext
                .getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        // Apply any additional service specific request handlers that need
        // to be run
        for (RequestHandler2 requestHandler2 : requestHandler2s) {
            requestHandler2.beforeRequest(request);
        }
        return requestHandler2s;
    }

    /**
     * Internal method to execute the HTTP method given.
     *
     * @see AmazonHttpClient#execute(Request, HttpResponseHandler, HttpResponseHandler)
     * @see AmazonHttpClient#execute(Request, HttpResponseHandler, HttpResponseHandler, ExecutionContext)
     */
    private <T> Response<T> executeHelper(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            ExecutionContext executionContext)
            throws AmazonClientException, AmazonServiceException
    {
        /*
         * Depending on which response handler we end up choosing to handle the
         * HTTP response, it might require us to leave the underlying HTTP
         * connection open, depending on whether or not it reads the complete
         * HTTP response stream from the HTTP connection, or if delays reading
         * any of the content until after a response is returned to the caller.
         */
        boolean leaveHttpConnectionOpen = false;
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        /* add the service endpoint to the logs. You can infer service name from service endpoint */
        awsRequestMetrics.addProperty(Field.ServiceName, request.getServiceName());
        awsRequestMetrics.addProperty(Field.ServiceEndpoint, request.getEndpoint());
        // Apply whatever request options we know how to handle, such as user-agent.
        setUserAgent(request);
        int requestCount = 0;
        URI redirectedURI = null;
        HttpEntity entity = null;
        AmazonClientException retriedException = null;

        // Make a copy of the original request params and headers so that we can
        // permute it in this loop and start over with the original every time.
        Map<String, String> originalParameters = new HashMap<String, String>();
        originalParameters.putAll(request.getParameters());
        Map<String, String> originalHeaders = new HashMap<String, String>();
        originalHeaders.putAll(request.getHeaders());

        while (true) {
            ++requestCount;
            awsRequestMetrics.setCounter(Field.RequestCount, requestCount);
            if (requestCount > 1) { // retry
                request.setParameters(originalParameters);
                request.setHeaders(originalHeaders);
            }

            HttpRequestBase httpRequest = null;
            org.apache.http.HttpResponse apacheResponse = null;

            try {
                // Sign the request if a signer was provided
                if (executionContext.getSigner() != null && executionContext.getCredentials() != null) {
                    awsRequestMetrics.startEvent(Field.RequestSigningTime);
                    try {
                        executionContext.getSigner().sign(request,
                                executionContext.getCredentials());
                    } finally {
                        awsRequestMetrics.endEvent(Field.RequestSigningTime);
                    }
                }

                 if (requestLog.isDebugEnabled()) {
                    requestLog.debug("Sending Request: " + request.toString());
                 }

                httpRequest = httpRequestFactory.createHttpRequest(request, config, entity, executionContext);

                if (httpRequest instanceof HttpEntityEnclosingRequest) {
                    entity = ((HttpEntityEnclosingRequest)httpRequest).getEntity();
                }

                if (redirectedURI != null) {
                    httpRequest.setURI(redirectedURI);
                }

                if (requestCount > 1) {   // retry
                    awsRequestMetrics.startEvent(Field.RetryPauseTime);
                    try {
                        pauseBeforeNextRetry(request.getOriginalRequest(),
                                             retriedException,
                                             requestCount,
                                             config.getRetryPolicy());
                    } finally {
                        awsRequestMetrics.endEvent(Field.RetryPauseTime);
                    }
                }

                if ( entity != null ) {
                    InputStream content = entity.getContent();
                    if ( requestCount > 1 ) {   // retry
                        if ( content.markSupported() ) {
                            content.reset();
                            content.mark(-1);
                        }
                    } else {
                        if ( content.markSupported() ) {
                            content.mark(-1);
                        }
                    }
                }
                
                HttpContext httpContext = new BasicHttpContext();
                httpContext.setAttribute(
                        AWSRequestMetrics.class.getSimpleName(),
                        awsRequestMetrics);
                retriedException = null;
                awsRequestMetrics.startEvent(Field.HttpRequestTime);
                try {
                    apacheResponse = httpClient.execute(httpRequest, httpContext);
                } finally {
                    awsRequestMetrics.endEvent(Field.HttpRequestTime);
                }

                if (isRequestSuccessful(apacheResponse)) {
                    awsRequestMetrics.addProperty(Field.StatusCode, apacheResponse.getStatusLine().getStatusCode());
                    /*
                     * If we get back any 2xx status code, then we know we should
                     * treat the service call as successful.
                     */
                    leaveHttpConnectionOpen = responseHandler
                            .needsConnectionLeftOpen();
                    HttpResponse httpResponse = createResponse(httpRequest,
                            request, apacheResponse);
                    T response = handleResponse(request, responseHandler,
                            httpRequest, httpResponse, apacheResponse,
                            executionContext);
                    return new Response<T>(response, httpResponse);
                } else if (isTemporaryRedirect(apacheResponse)) {
                    /*
                     * S3 sends 307 Temporary Redirects if you try to delete an
                     * EU bucket from the US endpoint. If we get a 307, we'll
                     * point the HTTP method to the redirected location, and let
                     * the next retry deliver the request to the right location.
                     */
                    Header[] locationHeaders = apacheResponse.getHeaders("location");
                    String redirectedLocation = locationHeaders[0].getValue();
                    log.debug("Redirecting to: " + redirectedLocation);
                    redirectedURI = URI.create(redirectedLocation);
                    httpRequest.setURI(redirectedURI);
                    awsRequestMetrics.addProperty(Field.StatusCode, apacheResponse.getStatusLine().getStatusCode());
                    awsRequestMetrics.addProperty(Field.RedirectLocation, redirectedLocation);
                    awsRequestMetrics.addProperty(Field.AWSRequestID, null);

                } else {
                    leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
                    AmazonServiceException ase = handleErrorResponse(request, errorResponseHandler, httpRequest, apacheResponse);
                    awsRequestMetrics.addProperty(Field.AWSRequestID, ase.getRequestId());
                    awsRequestMetrics.addProperty(Field.AWSErrorCode, ase.getErrorCode());
                    awsRequestMetrics.addProperty(Field.StatusCode, ase.getStatusCode());
                    
                    if (!shouldRetry(request.getOriginalRequest(),
                                     httpRequest,
                                     ase,
                                     requestCount,
                                     config.getRetryPolicy())) {
                        throw ase;
                    }

                    // Cache the retryable exception
                    retriedException = ase;
                    /*
                     * Checking for clock skew error again because we don't want to set the
                     * global time offset for every service exception.
                     */
                    if(RetryUtils.isClockSkewError(ase)) {
                        int timeOffset = parseClockSkewOffset(apacheResponse, ase);
                        SDKGlobalConfiguration.setGlobalTimeOffset(timeOffset);
                    }
                    resetRequestAfterError(request, ase);
                }
            } catch (IOException ioe) {
                if (log.isInfoEnabled()) {
                    log.info("Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                }
                awsRequestMetrics.incrementCounter(Field.Exception);
                awsRequestMetrics.addProperty(Field.Exception, ioe.toString());
                awsRequestMetrics.addProperty(Field.AWSRequestID, null);

                AmazonClientException ace = new AmazonClientException("Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                if (!shouldRetry(request.getOriginalRequest(),
                                httpRequest,
                                ace,
                                requestCount,
                                config.getRetryPolicy())) {
                    throw ace;
                }
                
                // Cache the retryable exception
                retriedException = ace;
                resetRequestAfterError(request, ioe);
            } catch(RuntimeException e) {
                throw handleUnexpectedFailure(e, awsRequestMetrics);
            } catch(Error e) {
                throw handleUnexpectedFailure(e, awsRequestMetrics);
            } finally {
                /*
                 * Some response handlers need to manually manage the HTTP
                 * connection and will take care of releasing the connection on
                 * their own, but if this response handler doesn't need the
                 * connection left open, we go ahead and release the it to free
                 * up resources.
                 */
                if (!leaveHttpConnectionOpen) {
                    try {
                        if (apacheResponse != null && apacheResponse.getEntity() != null
                                && apacheResponse.getEntity().getContent() != null) {
                            apacheResponse.getEntity().getContent().close();
                        }
                    } catch (IOException e) {
                        log.warn("Cannot close the response content.", e);
                    }
                }
            }
        } /* end while (true) */
    }

    /**
     * Handles an unexpected failure, returning the Throwable instance as given.
     */
    private <T extends Throwable> T handleUnexpectedFailure(T t, AWSRequestMetrics awsRequestMetrics) {
        awsRequestMetrics.incrementCounter(Field.Exception);
        return t;
    }

    /**
     * Resets the specified request, so that it can be sent again, after
     * receiving the specified error. If a problem is encountered with resetting
     * the request, then an AmazonClientException is thrown with the original
     * error as the cause (not an error about being unable to reset the stream).
     *
     * @param request
     *            The request being executed that failed and needs to be reset.
     * @param cause
     *            The original error that caused the request to fail.
     *
     * @throws AmazonClientException
     *             If the request can't be reset.
     */
    private void resetRequestAfterError(Request<?> request, Exception cause) throws AmazonClientException {
        if ( request.getContent() == null ) {
            return; // no reset needed
        }
        if ( ! request.getContent().markSupported() ) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", cause);
        }
        try {
            request.getContent().reset();
        } catch ( IOException e ) {
            // This exception comes from being unable to reset the input stream,
            // so throw the original, more meaningful exception
            throw new AmazonClientException(
                    "Encountered an exception and couldn't reset the stream to retry", cause);
        }
    }

    /**
     * Sets a User-Agent for the specified request, taking into account
     * any custom data.
     */
    private void setUserAgent(Request<?> request) {
        String userAgent = config.getUserAgent();
        if ( !userAgent.equals(ClientConfiguration.DEFAULT_USER_AGENT) ) {
            userAgent += ", " + ClientConfiguration.DEFAULT_USER_AGENT;
        }
        if ( userAgent != null ) {
            request.addHeader(HEADER_USER_AGENT, userAgent);
        }
        AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        if (awsreq != null) {
            RequestClientOptions opts = awsreq.getRequestClientOptions();
            if (opts != null) {
                String userAgentMarker = opts.getClientMarker(Marker.USER_AGENT);
                if (userAgentMarker != null) {
                    request.addHeader(HEADER_USER_AGENT,
                        createUserAgentString(userAgent, userAgentMarker));
                }
            }
        }
    }

    /**
     * Appends the given user-agent string to the existing one and returns it.
     */
    private static String createUserAgentString(String existingUserAgentString, String userAgent) {
        if (existingUserAgentString.contains(userAgent)) {
            return existingUserAgentString;
        } else {
            return existingUserAgentString.trim() + " " + userAgent.trim();
        }
    }

    /**
     * Shuts down this HTTP client object, releasing any resources that might be
     * held open. This is an optional method, and callers are not expected to
     * call it, but can if they want to explicitly release any open resources.
     * Once a client has been shutdown, it cannot be used to make more requests.
     */
    public void shutdown() {
        IdleConnectionReaper.removeConnectionManager(httpClient.getConnectionManager());
        httpClient.getConnectionManager().shutdown();
    }

    /**
     * Returns true if a failed request should be retried.
     * 
     * @param originalRequest
     *            The original service request that is being executed.
     * @param method
     *            The current HTTP method being executed.
     * @param exception
     *            The client/service exception from the failed request.
     * @param requestCount
     *            The number of times the current request has been attempted.
     * 
     * @return True if the failed request should be retried.
     */
    private boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                HttpRequestBase method, 
                                AmazonClientException exception, 
                                int requestCount,
                                RetryPolicy retryPolicy) {
        final int retries = requestCount - 1;
        
        int maxErrorRetry = config.getMaxErrorRetry();
        // We should use the maxErrorRetry in
        // the RetryPolicy if either the user has not explicitly set it in
        // ClientConfiguration, or the RetryPolicy is configured to take
        // higher precedence.
        if ( maxErrorRetry < 0
                || !retryPolicy.isMaxErrorRetryInClientConfigHonored() ) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }
        
        // Immediately fails when it has exceeds the max retry count.
        if (retries >= maxErrorRetry) return false;
        
        // Never retry on requests containing non-repeatable entity
        if (method instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest)method).getEntity();
            if (entity != null && !entity.isRepeatable()) {
                if (log.isDebugEnabled()) {
                    log.debug("Entity not repeatable");
                }
                return false;
            }
        }
        
        // Pass all the context information to the RetryCondition and let it
        // decide whether it should be retried.
        return retryPolicy.getRetryCondition().shouldRetry(originalRequest,
                                                           exception,
                                                           retries);
    }

    private static boolean isTemporaryRedirect(org.apache.http.HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status == HttpStatus.SC_TEMPORARY_REDIRECT &&
                         response.getHeaders("Location") != null &&
                         response.getHeaders("Location").length > 0;
    }

    private boolean isRequestSuccessful(org.apache.http.HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status / 100 == HttpStatus.SC_OK / 100;
    }

    /**
     * Handles a successful response from a service call by unmarshalling the
     * results using the specified response handler.
     *
     * @param <T>
     *            The type of object expected in the response.
     *
     * @param request
     *            The original request that generated the response being
     *            handled.
     * @param responseHandler
     *            The response unmarshaller used to interpret the contents of
     *            the response.
     * @param method
     *            The HTTP method that was invoked, and contains the contents of
     *            the response.
     * @param executionContext
     *            Extra state information about the request currently being
     *            executed.
     * @return The contents of the response, unmarshalled using the specified
     *         response handler.
     *
     * @throws IOException
     *             If any problems were encountered reading the response
     *             contents from the HTTP method object.
     */
    private <T> T handleResponse(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpRequestBase method, HttpResponse httpResponse,
            org.apache.http.HttpResponse apacheHttpResponse,
            ExecutionContext executionContext) throws IOException
    {
        if (responseHandler.needsConnectionLeftOpen() && method instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest)method;
            httpResponse.setContent(new HttpMethodReleaseInputStream(httpEntityEnclosingRequest));
        }

        try {
            CountingInputStream countingInputStream = null;
            if (System.getProperty(PROFILING_SYSTEM_PROPERTY) != null) {
                countingInputStream = new CountingInputStream(httpResponse.getContent());
                httpResponse.setContent(countingInputStream);
            }

            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AmazonWebServiceResponse<? extends T> awsResponse;
            awsRequestMetrics.startEvent(Field.ResponseProcessingTime);
            try {
                awsResponse = responseHandler.handle(httpResponse);
            } finally {
                awsRequestMetrics.endEvent(Field.ResponseProcessingTime);
            }
            if (countingInputStream != null) {
                awsRequestMetrics.setCounter(Field.BytesProcessed, countingInputStream.getByteCount());
            }

            if (awsResponse == null)
                throw new RuntimeException("Unable to unmarshall response metadata");

            responseMetadataCache.add(request.getOriginalRequest(), awsResponse.getResponseMetadata());

            if (requestLog.isDebugEnabled()) {
                requestLog.debug("Received successful response: " + apacheHttpResponse.getStatusLine().getStatusCode()
                        + ", AWS Request ID: " + awsResponse.getRequestId());
            }
            awsRequestMetrics.addProperty(Field.AWSRequestID, awsResponse.getRequestId());

            return awsResponse.getResult();
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (Exception e) {
            String errorMessage = "Unable to unmarshall response (" + e.getMessage() + ")";
            throw new AmazonClientException(errorMessage, e);
        }
    }


    /**
     * Responsible for handling an error response, including unmarshalling the
     * error response into the most specific exception type possible, and
     * throwing the exception.
     *
     * @param request
     *            The request that generated the error response being handled.
     * @param errorResponseHandler
     *            The response handler responsible for unmarshalling the error
     *            response.
     * @param method
     *            The HTTP method containing the actual response content.
     *
     * @throws IOException
     *             If any problems are encountering reading the error response.
     */
    private AmazonServiceException handleErrorResponse(Request<?> request,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            HttpRequestBase method, org.apache.http.HttpResponse apacheHttpResponse) throws IOException {

        int status = apacheHttpResponse.getStatusLine().getStatusCode();
        HttpResponse response = createResponse(method, request, apacheHttpResponse);
        if (errorResponseHandler.needsConnectionLeftOpen() && method instanceof HttpEntityEnclosingRequestBase) {
            HttpEntityEnclosingRequestBase entityEnclosingRequest = (HttpEntityEnclosingRequestBase)method;
            response.setContent(new HttpMethodReleaseInputStream(entityEnclosingRequest));
        }

        AmazonServiceException exception = null;
        try {
            exception = errorResponseHandler.handle(response);
            requestLog.debug("Received error response: " + exception.toString());
        } catch (Exception e) {
            // If the errorResponseHandler doesn't work, then check for error
            // responses that don't have any content
            if (status == 413) {
                exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(413);
                exception.setErrorType(ErrorType.Client);
                exception.setErrorCode("Request entity too large");
            } else if (status == 503 && "Service Unavailable".equalsIgnoreCase(apacheHttpResponse.getStatusLine().getReasonPhrase())) {
                exception = new AmazonServiceException("Service unavailable");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(503);
                exception.setErrorType(ErrorType.Service);
                exception.setErrorCode("Service unavailable");
            } else {
                String errorMessage = "Unable to unmarshall error response (" + e.getMessage() + ")";
                throw new AmazonClientException(errorMessage, e);
            }
        }

        exception.setStatusCode(status);
        exception.setServiceName(request.getServiceName());
        exception.fillInStackTrace();
        return exception;
    }

    /**
     * Creates and initializes an HttpResponse object suitable to be passed to
     * an HTTP response handler object.
     *
     * @param method
     *            The HTTP method that was invoked to get the response.
     * @param request
     *            The HTTP request associated with the response.
     *
     * @return The new, initialized HttpResponse object ready to be passed to an
     *         HTTP response handler object.
     *
     * @throws IOException
     *             If there were any problems getting any response information
     *             from the HttpClient method object.
     */
    private HttpResponse createResponse(HttpRequestBase method, Request<?> request, org.apache.http.HttpResponse apacheHttpResponse) throws IOException {
        HttpResponse httpResponse = new HttpResponse(request, method);

        if (apacheHttpResponse.getEntity() != null) {
            httpResponse.setContent(apacheHttpResponse.getEntity().getContent());
        }

        httpResponse.setStatusCode(apacheHttpResponse.getStatusLine().getStatusCode());
        httpResponse.setStatusText(apacheHttpResponse.getStatusLine().getReasonPhrase());
        for (Header header : apacheHttpResponse.getAllHeaders()) {
            httpResponse.addHeader(header.getName(), header.getValue());
        }

        return httpResponse;
    }

    /**
     * Sleep for a period of time on failed request to avoid flooding a service
     * with retries.
     * 
     * @param originalRequest
     *            The original service request that is being executed.
     * @param previousException
     *            Exception information for the previous attempt, if any.
     * @param requestCount
     *            current request count (including the next attempt after the delay)
     * @param retryPolicy
     *            The retry policy configured in this http client.
     */
    private void pauseBeforeNextRetry(AmazonWebServiceRequest originalRequest,
                                    AmazonClientException previousException,
                                    int requestCount,
                                    RetryPolicy retryPolicy) {
        final int retries = requestCount // including next attempt
                            - 1          // number of attempted requests
                            - 1;         // number of attempted retries
        
        long delay = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(
                originalRequest, previousException, retries);
        
        if (log.isDebugEnabled()) {
            log.debug("Retriable error detected, " +
                    "will retry in " + delay + "ms, attempt number: " + retries);
        }

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    /**
     * Returns date string from the exception message body in form of yyyyMMdd'T'HHmmss'Z'
     * We needed to extract date from the message body because SQS is the only service
     * that does not provide date header in the response. Example, when device time is
     * behind than the server time than we get a string that looks something like this:
     * "Signature expired: 20130401T030113Z is now earlier than 20130401T034613Z (20130401T040113Z - 15 min.)"
     * 
     * 
     * @param body
     *              The message from where the server time is being extracted
     * 
     * @return Return datetime in string format (yyyyMMdd'T'HHmmss'Z')
     */
    private String getServerDateFromException(String body) {
        int startPos = body.indexOf("(");
        int endPos = 0;
        if(body.contains(" + 15")) {
            endPos = body.indexOf(" + 15");
        } else {
            endPos = body.indexOf(" - 15");
        }
        String msg = body.substring(startPos+1, endPos);
        return msg;
    }
    
    private int parseClockSkewOffset(org.apache.http.HttpResponse response, AmazonServiceException exception) {
        DateUtils dateUtils = new DateUtils(); 
        Date deviceDate = new Date();
        Date serverDate = null;
        String serverDateStr = null;
        Header[] responseDateHeader = response.getHeaders("Date");
        
        try {

            if(responseDateHeader.length == 0) {
                // SQS doesn't return Date header
                serverDateStr = getServerDateFromException(exception.getMessage());
                serverDate = dateUtils.parseCompressedIso8601Date(serverDateStr);
            } else {
                serverDateStr = responseDateHeader[0].getValue();
                serverDate = dateUtils.parseRfc822Date(serverDateStr);
            }

        } catch (ParseException e) {
            log.warn("Unable to parse clock skew offset from response: "
                     + serverDateStr,
                     e);
            return 0;
        } catch (RuntimeException e) {
            log.warn("Unable to parse clock skew offset from response: "
                     + serverDateStr,
                     e);
            return 0;
        }
        
        long diff = deviceDate.getTime() - serverDate.getTime();
        return (int)(diff / 1000);
    }
    
    @Override
    protected void finalize() throws Throwable {
        this.shutdown();
        super.finalize();
    }

    /**
     * Returns the http client specific request metric collector; or null if
     * there is none.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }
}
