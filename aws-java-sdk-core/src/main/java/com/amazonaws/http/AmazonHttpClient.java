/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressInputStream;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.conn.ssl.SdkTLSSocketFactory;
import com.amazonaws.http.exception.HttpRequestTimeoutException;
import com.amazonaws.http.timers.client.ClientExecutionTimeoutException;
import com.amazonaws.http.timers.client.ClientExecutionTimer;
import com.amazonaws.http.timers.client.SdkInterruptedException;
import com.amazonaws.http.timers.request.HttpRequestAbortTaskTracker;
import com.amazonaws.http.timers.request.HttpRequestTimer;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkBufferedInputStream;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.util.CapacityManager;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.retry.internal.AuthErrorRetryStrategy;
import com.amazonaws.retry.internal.AuthRetryParameters;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.*;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.*;
import java.util.Map.Entry;

import static com.amazonaws.SDKGlobalConfiguration.PROFILING_SYSTEM_PROPERTY;
import static com.amazonaws.event.SDKProgressPublisher.*;
import static com.amazonaws.util.IOUtils.closeQuietly;

@ThreadSafe
public class AmazonHttpClient {
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String HEADER_SDK_TRANSACTION_ID = "amz-sdk-invocation-id";
    public static final String HEADER_SDK_RETRY_INFO = "amz-sdk-retry";

    /**
     * Logger used for the purpose of logging the AWS request id extracted either from the http
     * header response or from the response body.
     */
    private static final Log requestIdLog = LogFactory.getLog("com.amazonaws.requestId");
    /**
     * Logger providing detailed information on requests/responses. Users can enable this logger to
     * get access to AWS request IDs for responses, individual requests and parameters sent to AWS,
     * etc.
     */
    private static final Log requestLog = LogFactory.getLog("com.amazonaws.request");

    /**
     * Logger for more detailed debugging information, that might not be as useful for end users
     * (ex: HTTP client configuration, etc).
     */
    static final Log log = LogFactory.getLog(AmazonHttpClient.class);

    private static final HttpRequestFactory httpRequestFactory = new HttpRequestFactory();
    private static final HttpClientFactory httpClientFactory = new HttpClientFactory();

    /**
     * When throttled retries are enabled, each retry attempt will consume this much capacity.
     * Successful retry attempts will release this capacity back to the pool while failed retries
     * will not.  Successful initial (non-retry) requests will always release 1 capacity unit to the pool.
     */
    private static final int THROTTLED_RETRY_COST = 5;

    /**
     * When throttled retries are enabled, this is the total number of subsequent failed retries
     * that may be attempted before retry capacity is fully drained.
     */
    private static final int THROTTLED_RETRIES = 100;

    static {
        // Customers have reported XML parsing issues with the following
        // JVM versions, which don't occur with more recent versions, so
        // if we detect any of these, give customers a heads up.
        // https://bugs.openjdk.java.net/browse/JDK-8028111
        List<String> problematicJvmVersions = Arrays.asList("1.6.0_06", "1.6.0_13", "1.6.0_17", "1.6.0_65", "1.7.0_45");
        String jvmVersion = System.getProperty("java.version");
        if (problematicJvmVersions.contains(jvmVersion)) {
            log.warn("Detected a possible problem with the current JVM version (" + jvmVersion + ").  "
                    + "If you experience XML parsing problems using the SDK, try upgrading to a more recent JVM update.");
        }
    }

    /** Internal client for sending HTTP requests */
    private final HttpClient httpClient;

    /** Client configuration options, such as proxy settings, max retries, etc. */
    private final ClientConfiguration config;

    /** Cache of metadata for recently executed requests for diagnostic purposes */
    private final ResponseMetadataCache responseMetadataCache;

    /** Timer to enforce HTTP request timeouts. */
    private final HttpRequestTimer httpRequestTimer;

    /** Retry capacity manager, used to manage throttled retry resource */
    private final CapacityManager retryCapacity;

    /**
     * Timer to enforce timeouts on the whole execution of the request (request handlers, retries,
     * backoff strategy, unmarshalling, etc)
     */
    private final ClientExecutionTimer clientExecutionTimer;

    /**
     * A request metric collector used specifically for this http client; or null if there is none.
     * This collector, if specified, always takes precedence over the one specified at the AWS SDK
     * level.
     *
     * @see AwsSdkMetrics
     */
    private final RequestMetricCollector requestMetricCollector;

    /** The time difference in seconds between this client and AWS. */
    private volatile int timeOffset = SDKGlobalTime.getGlobalTimeOffset();

    /**
     * Constructs a new AWS client using the specified client configuration options (ex: max retry
     * attempts, proxy settings, etc).
     *
     * @param config
     *            Configuration options specifying how this client will communicate with AWS (ex:
     *            proxy settings, retry count, etc.).
     */
    public AmazonHttpClient(ClientConfiguration config) {
        this(config, null);
    }

    /**
     * Constructs a new AWS client using the specified client configuration options (ex: max retry
     * attempts, proxy settings, etc), and request metric collector.
     *
     * @param config
     *            Configuration options specifying how this client will communicate with AWS (ex:
     *            proxy settings, retry count, etc.).
     * @param requestMetricCollector
     *            client specific request metric collector, which takes precedence over the one at
     *            the AWS SDK level; or null if there is none.
     */
    public AmazonHttpClient(ClientConfiguration config, RequestMetricCollector requestMetricCollector) {
        this(config, httpClientFactory.createHttpClient(config), requestMetricCollector);
    }

    /**
     * Package-protected constructor for unit test purposes.
     */
    @SdkTestInternalApi
    public AmazonHttpClient(ClientConfiguration clientConfig, HttpClient httpClient,
            RequestMetricCollector requestMetricCollector) {
        this.config = clientConfig;
        this.httpClient = httpClient;
        this.requestMetricCollector = requestMetricCollector;
        this.responseMetadataCache = new ResponseMetadataCache(clientConfig.getResponseMetadataCacheSize());
        this.httpRequestTimer = new HttpRequestTimer();
        this.clientExecutionTimer = new ClientExecutionTimer();

        // When enabled, total retry capacity is computed based on retry cost
        // and desired number of retries.
        int throttledRetryMaxCapacity = clientConfig.useThrottledRetries()
                ? THROTTLED_RETRY_COST * THROTTLED_RETRIES : -1;
        this.retryCapacity = new CapacityManager(throttledRetryMaxCapacity);
    }

    /**
     * Package protected for unit-testing
     */
    @SdkTestInternalApi
    public HttpRequestTimer getHttpRequestTimer() {
        return this.httpRequestTimer;
    }

    /**
     * Package protected for unit-testing
     */
    @SdkTestInternalApi
    public ClientExecutionTimer getClientExecutionTimer() {
        return this.clientExecutionTimer;
    }

    /**
     * Returns additional response metadata for an executed request. Response metadata isn't
     * considered part of the standard results returned by an operation, so it's accessed instead
     * through this diagnostic interface. Response metadata is typically used for troubleshooting
     * issues with AWS support staff when services aren't acting as expected.
     *
     * @param request
     *            A previously executed AmazonWebServiceRequest object, whose response metadata is
     *            desired.
     * @return The response metadata for the specified request, otherwise null if there is no
     *         response metadata available for the request.
     */
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest request) {
        return responseMetadataCache.get(request);
    }

    /**
     * Disables the default strict hostname verification in this client and instead uses a browser
     * compatible hostname verification strategy (i.e. cert hostname wildcards are evaulated more
     * liberally).
     */
    public void disableStrictHostnameVerification() {

        /*
         * If SSL cert checking for endpoints is disabled, we don't need to do any changes to the
         * SSL context.
         */
        if (SDKGlobalConfiguration.isCertCheckingDisabled()) {
            return;
        }

        SchemeRegistry schemeRegistry = httpClient.getConnectionManager().getSchemeRegistry();
        SSLSocketFactory sf = config.getApacheHttpClientConfig().getSslSocketFactory();
        if (sf == null) {
            sf = new SdkTLSSocketFactory(HttpClientFactory.createSSLContext(config),
                    SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        }
        Scheme https = new Scheme("https", 443, sf);
        schemeRegistry.register(https);
    }

    /**
     * Executes the request and returns the result.
     *
     * @param request
     *            The AmazonWebServices request to send to the remote server
     * @param responseHandler
     *            A response handler to accept a successful response from the remote server
     * @param errorResponseHandler
     *            A response handler to accept an unsuccessful response from the remote server
     * @param executionContext
     *            Additional information about the context of this web service call
     */
    public <T> Response<T> execute(Request<?> request,
                                   HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                   HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                   ExecutionContext executionContext) {
        if (executionContext == null) {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
        try {
            return executeWithTimer(request, getNonNullResponseHandler(responseHandler),
                    getNonNullResponseHandler(errorResponseHandler), executionContext);
        } catch (InterruptedException ie) {
            throw handleInterruptedException(executionContext, ie);
        }
    }

    /**
     * Ensures the response handler is not null. If it is this method returns a dummy response
     * handler.
     * 
     * @param responseHandler
     *            Response handler passed to
     *            {@link #execute(Request, HttpResponseHandler, HttpResponseHandler, ExecutionContext)}
     * @return Either original response handler or dummy response handler.
     */
    private <T> HttpResponseHandler<T> getNonNullResponseHandler(HttpResponseHandler<T> responseHandler) {
        if (responseHandler != null) {
            return responseHandler;
        } else {
            // Return a Dummy, No-Op handler
            return new HttpResponseHandler<T>() {

                @Override
                public T handle(HttpResponse response) throws Exception {
                    return null;
                }

                @Override
                public boolean needsConnectionLeftOpen() {
                    return false;
                }
            };
        }
    }

    /**
     * Start and end client execution timer around the execution of the request. It's important that
     * the client execution task is canceled before the InterruptedExecption is handled by
     * {@link #execute(Request, HttpResponseHandler, HttpResponseHandler, ExecutionContext)} so the
     * interrupt status doesn't leak out to the callers code
     * 
     * @throws InterruptedException
     */
    public <T> Response<T> executeWithTimer(Request<?> request,
                                            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                            ExecutionContext executionContext) throws InterruptedException {
        try {
            executionContext.setClientExecutionTrackerTask(
                    clientExecutionTimer.startTimer(getClientExecutionTimeout(request.getOriginalRequest())));
            return doExecute(request, responseHandler, errorResponseHandler, executionContext);
        } finally {
            executionContext.getClientExecutionTrackerTask().cancelTask();
        }
    }

    private <T> Response<T> doExecute(Request<?> request,
                                      HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                      HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                      ExecutionContext executionContext) throws InterruptedException {
        final List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);

        AmazonWebServiceRequest awsreq = request.getOriginalRequest();

        setSdkTransactionId(request);
        setUserAgent(request);

        ProgressListener listener = awsreq.getGeneralProgressListener();
        // add custom headers
        Map<String, String> customHeaders = awsreq.getCustomRequestHeaders();
        if (customHeaders != null) {
            request.getHeaders().putAll(customHeaders);
        }
        // add custom query parameters
        Map<String, List<String>> customQueryParams = awsreq.getCustomQueryParameters();
        if (customQueryParams != null) {
            mergeQueryParameters(request, customQueryParams);
        }
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Response<T> response = null;
        final InputStream origContent = request.getContent();
        final InputStream toBeClosed = beforeRequest(request); // for progress tracking
        // make "notCloseable", so reset would work with retries
        final InputStream notCloseable = (toBeClosed == null) ? null
                : ReleasableInputStream.wrap(toBeClosed).disableClose();
        request.setContent(notCloseable);
        try {
            publishProgress(listener, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
            response = executeHelper(request, responseHandler, errorResponseHandler, executionContext,
                    requestHandler2s);
            publishProgress(listener, ProgressEventType.CLIENT_REQUEST_SUCCESS_EVENT);
            TimingInfo timingInfo = awsRequestMetrics.getTimingInfo().endTiming();
            afterResponse(request, requestHandler2s, response, timingInfo);
            return response;
        } catch (AmazonClientException e) {
            publishProgress(listener, ProgressEventType.CLIENT_REQUEST_FAILED_EVENT);
            afterError(request, response, requestHandler2s, e);
            throw e;
        } finally {
            // Always close so any progress tracking would get the final events propagated.
            closeQuietly(toBeClosed, log);
            request.setContent(origContent); // restore the original content
        }
    }

    /**
     * Determine if an interrupted exception is caused by the client execution timer interrupting
     * the current thread or some other task interrupting the thread for another purpose.
     * 
     * @param executionContext
     * @param e
     * @return {@link ClientExecutionTimeoutException} if the {@link InterruptedException} was
     *         caused by the {@link ClientExecutionTimer}. Otherwise re-interrupts the current
     *         thread and returns an {@link AmazonClientException} wrapping an
     *         {@link InterruptedException}
     */
    private RuntimeException handleInterruptedException(ExecutionContext executionContext, InterruptedException e) {
        if (e instanceof SdkInterruptedException) {
            if (((SdkInterruptedException) e).getResponse() != null) {
                ((SdkInterruptedException) e).getResponse().getHttpResponse().getHttpRequest().abort();
            }
        }
        if (executionContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
            // Clear the interrupt status
            Thread.interrupted();
            return new ClientExecutionTimeoutException();
        } else {
            Thread.currentThread().interrupt();
            return new AmazonClientException(e);
        }
    }

    /**
     * Check if the thread has been interrupted. If so throw an {@link InterruptedException}. Long
     * running tasks should be periodically checked if the current thread has been interrupted and
     * handle it appropriately
     * 
     * @throws InterruptedException
     *             If thread has been interrupted
     */
    private void checkInterrupted() throws InterruptedException {
        checkInterrupted(null);
    }

    /**
     * Check if the thread has been interrupted. If so throw an {@link InterruptedException}. Long
     * running tasks should be periodically checked if the current thread has been interrupted and
     * handle it appropriately
     *
     * @param response
     *            Response to be closed before returning control to the caller to avoid leaking the
     *            connection.
     * @throws InterruptedException
     *             If thread has been interrupted
     */
    private void checkInterrupted(Response<?> response) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new SdkInterruptedException(response);
        }
    }

    /**
     * Merge query parameters into the given request.
     */
    private void mergeQueryParameters(Request<?> request, Map<String, List<String>> params) {
        Map<String, List<String>> existingParams = request.getParameters();
        for (Entry<String, List<String>> param : params.entrySet()) {
            String pName = param.getKey();
            List<String> pValues = param.getValue();
            existingParams.put(pName, CollectionUtils.mergeLists(existingParams.get(pName), pValues));
        }
    }

    /**
     * Publishes the "request content length" event, and returns an input stream, which will be made
     * mark-and-resettable if possible, for progress tracking purposes.
     *
     * @return an input stream, which will be made mark-and-resettable if possible, for progress
     *         tracking purposes; or null if the request doesn't have an input stream
     */
    private InputStream beforeRequest(Request<?> request) {
        final AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        ProgressListener listener = awsreq.getGeneralProgressListener();
        Map<String, String> headers = request.getHeaders();
        String s = headers.get("Content-Length");
        if (s != null) {
            try {
                long contentLength = Long.parseLong(s);
                publishRequestContentLength(listener, contentLength);
            } catch (NumberFormatException e) {
                log.warn("Cannot parse the Content-Length header of the request.");
            }
        }
        InputStream content = request.getContent();
        if (content == null)
            return null;
        if (!content.markSupported()) {
            // try to wrap the content input stream to become
            // mark-and-resettable for signing and retry purposes.
            if (content instanceof FileInputStream) {
                try {
                    // ResettableInputStream supports mark-and-reset without
                    // memory buffering
                    content = new ResettableInputStream((FileInputStream) content);
                } catch (IOException e) {
                    if (log.isDebugEnabled())
                        log.debug("For the record; ignore otherwise", e);
                }
            }
        }
        if (!content.markSupported())
            content = new SdkBufferedInputStream(content);
        final InputStream is = ProgressInputStream.inputStreamForRequest(content, awsreq);
        if (AmazonHttpClient.unreliableTestConfig == null)
            return is;
        return new UnreliableFilterInputStream(is, unreliableTestConfig.isFakeIOException())
                .withBytesReadBeforeException(unreliableTestConfig.getBytesReadBeforeException())
                .withMaxNumErrors(unreliableTestConfig.getMaxNumErrors())
                .withResetIntervalBeforeException(unreliableTestConfig.getResetIntervalBeforeException());
    }

    private void afterError(Request<?> request,
                            Response<?> response,
                            List<RequestHandler2> requestHandler2s,
                            AmazonClientException e) throws InterruptedException {
        for (RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterError(request, response, e);
            checkInterrupted(response);
        }
    }

    private <T> void afterResponse(Request<?> request,
                                   List<RequestHandler2> requestHandler2s,
                                   Response<T> response,
                                   TimingInfo timingInfo) throws InterruptedException {
        for (RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterResponse(request, response);
            checkInterrupted(response);
        }
    }

    private List<RequestHandler2> requestHandler2s(Request<?> request, ExecutionContext executionContext) {
        List<RequestHandler2> requestHandler2s = executionContext.getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        // Apply any additional service specific request handlers that need
        // to be run
        for (RequestHandler2 requestHandler2 : requestHandler2s) {
            // If the request handler is a type of CredentialsRequestHandler,
            // then set the credentials in the request handler.
            if (requestHandler2 instanceof CredentialsRequestHandler)
                ((CredentialsRequestHandler) requestHandler2).setCredentials(executionContext.getCredentials());
            requestHandler2.beforeRequest(request);
        }
        return requestHandler2s;
    }

    /**
     * Internal method to execute the HTTP method given.
     */
    private <T> Response<T> executeHelper(final Request<?> request,
                                          HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                          HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                          final ExecutionContext executionContext,
                                          List<RequestHandler2> requestHandlers) throws InterruptedException {
        /*
         * add the service endpoint to the logs. You can infer service name from service endpoint
         */
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics()
                .addPropertyWith(Field.ServiceName, request.getServiceName())
                .addPropertyWith(Field.ServiceEndpoint, request.getEndpoint());
        // Make a copy of the original request params and headers so that we can
        // permute it in this loop and start over with the original every time.
        final Map<String, List<String>> originalParameters = new LinkedHashMap<String, List<String>>(
                request.getParameters());
        final Map<String, String> originalHeaders = new HashMap<String, String>(request.getHeaders());
        // Always mark the input stream before execution.
        final ExecOneRequestParams execOneParams = new ExecOneRequestParams();
        final InputStream originalContent = request.getContent();
        if (originalContent != null && originalContent.markSupported()
                && !(originalContent instanceof BufferedInputStream)) {
            // Mark only once for non-BufferedInputStream
            AmazonWebServiceRequest awsreq = request.getOriginalRequest();
            final int readLimit = awsreq.getRequestClientOptions().getReadLimit();
            originalContent.mark(readLimit);
        }
        while (true) {
            checkInterrupted();
            if (originalContent instanceof BufferedInputStream && originalContent.markSupported()) {
                // Mark everytime for BufferedInputStream, since the marker could
                // have been invalidated
                AmazonWebServiceRequest awsreq = request.getOriginalRequest();
                final int readLimit = awsreq.getRequestClientOptions().getReadLimit();
                originalContent.mark(readLimit);
            }
            execOneParams.initPerRetry();
            if (execOneParams.redirectedURI != null) {
                /*
                 * [scheme:][//authority][path][?query][#fragment]
                 */
                String scheme = execOneParams.redirectedURI.getScheme();
                String beforeAuthority = scheme == null ? "" : scheme + "://";
                String authority = execOneParams.redirectedURI.getAuthority();
                String path = execOneParams.redirectedURI.getPath();

                request.setEndpoint(URI.create(beforeAuthority + authority));
                request.setResourcePath(path);
            }
            if (execOneParams.authRetryParam != null) {
                request.setEndpoint(execOneParams.authRetryParam.getEndpointForRetry());
            }
            awsRequestMetrics.setCounter(Field.RequestCount, execOneParams.requestCount);
            if (execOneParams.isRetry()) {
                request.setParameters(originalParameters);
                request.setHeaders(originalHeaders);
                request.setContent(originalContent);
            }
            try {
                Response<T> response = executeOneRequest(request, responseHandler, errorResponseHandler,
                        executionContext, awsRequestMetrics, execOneParams, requestHandlers);
                if (response != null) {
                    return response;
                }
            } catch (IOException ioe) {
                if (log.isInfoEnabled()) {
                    log.info("Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                }
                captureExceptionMetrics(ioe, awsRequestMetrics);
                awsRequestMetrics.addProperty(Field.AWSRequestID, null);
                AmazonClientException ace = new AmazonClientException(
                        "Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                if (!shouldRetry(request.getOriginalRequest(), execOneParams, ace,
                        executionContext)) {
                    throw lastReset(ace, request);
                }
                // Cache the retryable exception
                execOneParams.retriedException = ace;
            } catch (RuntimeException e) {
                throw lastReset(captureExceptionMetrics(e, awsRequestMetrics), request);
            } catch (Error e) {
                throw lastReset(captureExceptionMetrics(e, awsRequestMetrics), request);
            } finally {
                /*
                 * Some response handlers need to manually manage the HTTP connection and will take
                 * care of releasing the connection on their own, but if this response handler
                 * doesn't need the connection left open, we go ahead and release the it to free up
                 * resources.
                 */
                if (!execOneParams.leaveHttpConnectionOpen) {
                    if (execOneParams.apacheResponse != null) {
                        HttpEntity entity = execOneParams.apacheResponse.getEntity();
                        if (entity != null) {
                            try {
                                closeQuietly(entity.getContent(), log);
                            } catch (IOException e) {
                                log.warn("Cannot close the response content.", e);
                            }
                        }
                    }
                }
            }
        } /* end while (true) */
    }

    /**
     * Used to perform a last reset on the content input stream (if mark-supported); this is so
     * that, for backward compatibility reason, any "blind" retry (ie without calling reset) by user
     * of this library with the same input stream (such as ByteArrayInputStream) could still
     * succeed.
     *
     * @param t
     *            the failure
     * @param req
     *            the request, if known; or null otherwise.
     * @return the failure as given
     */
    private <T extends Throwable> T lastReset(final T t, final Request<?> req) {
        try {
            InputStream content = req.getContent();
            if (content != null) {
                if (content.markSupported())
                    content.reset();
            }
        } catch (Exception ex) {
            log.debug("FYI: failed to reset content inputstream before throwing up", ex);
        }
        return t;
    }

    /**
     * Stateful parameters that are used for executing a single http request.
     */
    private static class ExecOneRequestParams {
        private Signer signer; // cached
        private URI signerURI;
        int requestCount; // monotonic increasing
        /**
         * Last delay between retries
         */
        long lastBackoffDelay = 0;
        AmazonClientException retriedException; // last retryable exception

        HttpRequestBase apacheRequest;
        org.apache.http.HttpResponse apacheResponse;
        URI redirectedURI;

        AuthRetryParameters authRetryParam;
        /*
         * Depending on which response handler we end up choosing to handle the HTTP response, it
         * might require us to leave the underlying HTTP connection open, depending on whether or
         * not it reads the complete HTTP response stream from the HTTP connection, or if delays
         * reading any of the content until after a response is returned to the caller.
         */
        boolean leaveHttpConnectionOpen;

        boolean isRetry() {
            return requestCount > 1 || redirectedURI != null || authRetryParam != null;
        }

        void initPerRetry() {
            requestCount++;
            apacheRequest = null;
            apacheResponse = null;
            leaveHttpConnectionOpen = false;
        }

        Signer newSigner(final Request<?> request, final ExecutionContext execContext) {
            if (authRetryParam != null) {
                signerURI = authRetryParam.getEndpointForRetry();
                signer = authRetryParam.getSignerForRetry();
                // Push the local signer override back to the execution context
                execContext.setSigner(signer);
            } else if (redirectedURI != null && !redirectedURI.equals(signerURI)) {
                signerURI = redirectedURI;
                signer = execContext.getSignerByURI(signerURI);
            } else if (signer == null) {
                signerURI = request.getEndpoint();
                signer = execContext.getSignerByURI(signerURI);
            }
            return signer;
        }

        /**
         * @throws FakeIOException
         *             thrown only during test simulation
         */
        HttpRequestBase newApacheRequest(final HttpRequestFactory httpRequestFactory,
                                         final Request<?> request,
                                         final ClientConfiguration config,
                                         final ExecutionContext execContext) throws FakeIOException {
            apacheRequest = httpRequestFactory.createHttpRequest(request, config, execContext);
            if (redirectedURI != null)
                apacheRequest.setURI(redirectedURI);
            return apacheRequest;
        }

        void resetBeforeHttpRequest() {
            retriedException = null;
            authRetryParam = null;
            redirectedURI = null;
        }
    }

    /**
     * Returns the credentials from the execution if exists. Else returns null.
     */
    private AWSCredentials getCredentialsFromContext(final ExecutionContext executionContext,
                                                     final AWSRequestMetrics requestMetrics) {
        final AWSCredentialsProvider credentialsProvider = executionContext.getCredentialsProvider();

        AWSCredentials credentials = null;
        if (credentialsProvider != null) {
            requestMetrics.startEvent(Field.CredentialsRequestTime);
            try {
                credentials = credentialsProvider.getCredentials();
            } finally {
                requestMetrics.endEvent(Field.CredentialsRequestTime);
            }
        }
        return credentials;
    }

    /**
     * Returns the response from executing one http request; or null for retry.
     */
    private <T> Response<T> executeOneRequest(final Request<?> request,
                                              final HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                              final HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                              final ExecutionContext execContext,
                                              final AWSRequestMetrics awsRequestMetrics,
                                              ExecOneRequestParams execOneParams,
                                              List<RequestHandler2> requestHandlers)
                                                      throws IOException, InterruptedException {
        if (execOneParams.isRetry()) {
            resetRequestInputStream(request);
        }
        checkInterrupted();
        if (requestLog.isDebugEnabled()) {
            requestLog.debug("Sending Request: " + request);
        }
        final AWSCredentials credentials = getCredentialsFromContext(execContext, awsRequestMetrics);
        final AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        final ProgressListener listener = awsreq.getGeneralProgressListener();

        if (execOneParams.isRetry()) {
            pauseBeforeRetry(request, awsRequestMetrics, execOneParams, listener);
        }
        updateRetryHeaderInfo(request, execOneParams);

        // Sign the request if a signer was provided
        execOneParams.newSigner(request, execContext);
        if (execOneParams.signer != null && credentials != null) {
            awsRequestMetrics.startEvent(Field.RequestSigningTime);
            try {
                if (timeOffset != 0) {
                    // Always use the client level timeOffset if it was
                    // non-zero; Otherwise, we respect the timeOffset in the
                    // request, which could have been externally configured (at
                    // least for the 1st non-retry request).
                    //
                    // For retry due to clock skew, the timeOffset in the
                    // request used for the retry is assumed to have been
                    // adjusted when execution reaches here.
                    request.setTimeOffset(timeOffset);
                }
                execOneParams.signer.sign(request, credentials);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestSigningTime);
            }
        }
        checkInterrupted();
        execOneParams.newApacheRequest(httpRequestFactory, request, config, execContext);

        captureConnectionPoolMetrics(httpClient.getConnectionManager(), awsRequestMetrics);
        HttpContext httpContext = new BasicHttpContext();
        httpContext.setAttribute(AWSRequestMetrics.class.getSimpleName(), awsRequestMetrics);
        execOneParams.resetBeforeHttpRequest();
        publishProgress(listener, ProgressEventType.HTTP_REQUEST_STARTED_EVENT);
        awsRequestMetrics.startEvent(Field.HttpRequestTime);
        awsRequestMetrics.setCounter(Field.RetryCapacityConsumed, retryCapacity.consumedCapacity());

        /////////// Send HTTP request ////////////
        execContext.getClientExecutionTrackerTask().setCurrentHttpRequest(execOneParams.apacheRequest);
        final boolean isHeaderReqIdAvail;
        final HttpRequestAbortTaskTracker requestAbortTaskTracker = httpRequestTimer
                .startTimer(execOneParams.apacheRequest, getRequestTimeout(awsreq));

        try {
            execOneParams.apacheResponse = httpClient.execute(execOneParams.apacheRequest, httpContext);
            if (shouldBufferHttpEntity(responseHandler.needsConnectionLeftOpen(), execContext, execOneParams,
                    requestAbortTaskTracker)) {
                execOneParams.apacheResponse
                        .setEntity(new BufferedHttpEntity(execOneParams.apacheResponse.getEntity()));
            }
            isHeaderReqIdAvail = logHeaderRequestId(execOneParams.apacheResponse);
        } catch (IOException ioe) {
            // Client execution timeouts take precedence as it's not retryable
            if (execContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
                throw new InterruptedException();
            } else if (requestAbortTaskTracker.httpRequestAborted()) {
                throw new HttpRequestTimeoutException(ioe);
            } else {
                throw ioe;
            }
        } finally {
            requestAbortTaskTracker.cancelTask();
            awsRequestMetrics.endEvent(Field.HttpRequestTime);
        }

        publishProgress(listener, ProgressEventType.HTTP_REQUEST_COMPLETED_EVENT);
        final StatusLine statusLine = execOneParams.apacheResponse.getStatusLine();
        final int statusCode = statusLine == null ? -1 : statusLine.getStatusCode();
        if (isRequestSuccessful(execOneParams.apacheResponse)) {
            awsRequestMetrics.addProperty(Field.StatusCode, statusCode);
            /*
             * If we get back any 2xx status code, then we know we should treat the service call as
             * successful.
             */
            execOneParams.leaveHttpConnectionOpen = responseHandler.needsConnectionLeftOpen();
            HttpResponse httpResponse = createResponse(execOneParams.apacheRequest, request,
                    execOneParams.apacheResponse);
            T response = handleResponse(request, responseHandler, execOneParams.apacheRequest, httpResponse,
                    execOneParams.apacheResponse, execContext, isHeaderReqIdAvail, requestHandlers);

            /*
             * If this was a successful retry attempt we'll release the full retry capacity that
             * the attempt originally consumed.  If this was a successful initial request
             * we return a lesser amount.
             */
            if (execOneParams.isRetry() && execContext.retryCapacityConsumed()) {
                retryCapacity.release(THROTTLED_RETRY_COST);
            } else {
                retryCapacity.release();
            }
            return new Response<T>(response, httpResponse);
        }
        if (isTemporaryRedirect(execOneParams.apacheResponse)) {
            /*
             * S3 sends 307 Temporary Redirects if you try to delete an EU bucket from the US
             * endpoint. If we get a 307, we'll point the HTTP method to the redirected location,
             * and let the next retry deliver the request to the right location.
             */
            Header[] locationHeaders = execOneParams.apacheResponse.getHeaders("location");
            String redirectedLocation = locationHeaders[0].getValue();
            if (log.isDebugEnabled())
                log.debug("Redirecting to: " + redirectedLocation);
            execOneParams.redirectedURI = URI.create(redirectedLocation);
            awsRequestMetrics.addPropertyWith(Field.StatusCode, statusCode)
                    .addPropertyWith(Field.RedirectLocation, redirectedLocation)
                    .addPropertyWith(Field.AWSRequestID, null);
            return null; // => retry
        }
        execOneParams.leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
        final AmazonServiceException ase = handleErrorResponse(request, errorResponseHandler,
                execOneParams.apacheRequest, execOneParams.apacheResponse);
        awsRequestMetrics.addPropertyWith(Field.AWSRequestID, ase.getRequestId())
                .addPropertyWith(Field.AWSErrorCode, ase.getErrorCode())
                .addPropertyWith(Field.StatusCode, ase.getStatusCode());
        // Check whether we should internally retry the auth error
        execOneParams.authRetryParam = null;
        AuthErrorRetryStrategy authRetry = execContext.getAuthErrorRetryStrategy();
        if (authRetry != null) {
            HttpResponse httpResponse = createResponse(execOneParams.apacheRequest, request,
                    execOneParams.apacheResponse);
            execOneParams.authRetryParam = authRetry.shouldRetryWithAuthParam(request, httpResponse, ase);
        }
        if (execOneParams.authRetryParam == null && !shouldRetry(request.getOriginalRequest(),
                execOneParams, ase, execContext)) {
            throw ase;
        }
        // Comment out for now. Ref: CR2662349
        // Preserve the cause of retry before retrying
        // awsRequestMetrics.addProperty(RetryCause, ase);
        if (RetryUtils.isThrottlingException(ase)) {
            awsRequestMetrics.incrementCounterWith(Field.ThrottleException)
                    .addProperty(Field.ThrottleException, ase);
        }
        // Cache the retryable exception
        execOneParams.retriedException = ase;
        /*
         * Checking for clock skew error again because we don't want to set the global time offset
         * for every service exception.
         */
        if (RetryUtils.isClockSkewError(ase)) {
            int clockSkew = parseClockSkewOffset(execOneParams.apacheResponse, ase);
            SDKGlobalTime.setGlobalTimeOffset(timeOffset = clockSkew);
            request.setTimeOffset(timeOffset); // adjust time offset for the retry
        }
        return null; // => retry
    }

    /**
     * Reset the input stream of the request before a retry.
     * 
     * @param request
     *            Request containing input stream to reset
     * @throws ResetException
     *             If Input Stream can't be reset which means the request can't be retried
     */
    private void resetRequestInputStream(final Request<?> request) throws ResetException {
        InputStream requestInputStream = request.getContent();
        if (requestInputStream != null) {
            if (requestInputStream.markSupported()) {
                try {
                    requestInputStream.reset();
                } catch (IOException ex) {
                    throw new ResetException("Failed to reset the request input stream", ex);
                }
            }
        }
    }

    /**
     * @return True if the {@link HttpEntity} should be wrapped in a {@link BufferedHttpEntity}
     */
    private boolean shouldBufferHttpEntity(final boolean needsConnectionLeftOpen,
                                           final ExecutionContext execContext,
                                           ExecOneRequestParams execParams,
                                           final HttpRequestAbortTaskTracker requestAbortTaskTracker) {
        return (execContext.getClientExecutionTrackerTask().isEnabled() || requestAbortTaskTracker.isEnabled())
                && !needsConnectionLeftOpen && execParams.apacheResponse.getEntity() != null;
    }

    /**
     * Used to log the "x-amzn-RequestId" header at DEBUG level, if any, from the response. This
     * method assumes the apache http request/response has just been successfully executed. The
     * request id is logged using the "com.amazonaws.requestId" logger if it was enabled at DEBUG
     * level; otherwise, it is logged at DEBUG level using the "com.amazonaws.request" logger.
     *
     * @return true if the AWS request id is available from the http header; false otherwise.
     */
    private boolean logHeaderRequestId(final org.apache.http.HttpResponse res) {
        final Header reqIdHeader = res.getFirstHeader(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER);
        final boolean isHeaderReqIdAvail = reqIdHeader != null;

        if (requestIdLog.isDebugEnabled() || requestLog.isDebugEnabled()) {
            final String msg = HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER + ": "
                    + (isHeaderReqIdAvail ? reqIdHeader.getValue() : "not available");
            if (requestIdLog.isDebugEnabled())
                requestIdLog.debug(msg);
            else
                requestLog.debug(msg);
        }
        return isHeaderReqIdAvail;
    }

    /**
     * Used to log the request id (extracted from the response) at DEBUG level. This method is
     * called only if there is no request id present in the http response header. The request id is
     * logged using the "com.amazonaws.requestId" logger if it was enabled at DEBUG level;
     * otherwise, it is logged using at DEBUG level using the "com.amazonaws.request" logger.
     */
    private void logResponseRequestId(final String awsRequestId) {
        if (requestIdLog.isDebugEnabled() || requestLog.isDebugEnabled()) {
            final String msg = "AWS Request ID: " + (awsRequestId == null ? "not available" : awsRequestId);
            if (requestIdLog.isDebugEnabled())
                requestIdLog.debug(msg);
            else
                requestLog.debug(msg);
        }
    }

    /**
     * Captures the connection pool metrics.
     */
    private void captureConnectionPoolMetrics(ClientConnectionManager connectionManager,
                                              AWSRequestMetrics awsRequestMetrics) {
        if (awsRequestMetrics.isEnabled() && connectionManager instanceof ConnPoolControl) {
            ConnPoolControl<?> control = (ConnPoolControl<?>) connectionManager;
            PoolStats stats = control.getTotalStats();
            awsRequestMetrics.withCounter(Field.HttpClientPoolAvailableCount, stats.getAvailable())
                    .withCounter(Field.HttpClientPoolLeasedCount, stats.getLeased())
                    .withCounter(Field.HttpClientPoolPendingCount, stats.getPending());
        }
    }

    /**
     * Capture the metrics for the given throwable.
     */
    private <T extends Throwable> T captureExceptionMetrics(T t, AWSRequestMetrics awsRequestMetrics) {
        awsRequestMetrics.incrementCounterWith(Field.Exception)
                .addProperty(Field.Exception, t);
        if (t instanceof AmazonServiceException) {
            AmazonServiceException ase = (AmazonServiceException) t;
            if (RetryUtils.isThrottlingException(ase)) {
                awsRequestMetrics.incrementCounterWith(Field.ThrottleException)
                        .addProperty(Field.ThrottleException, ase);
            }
        }
        return t;
    }

    /**
     * Create a client side identifier that will be sent with the initial request and each retry.
     */
    private void setSdkTransactionId(Request<?> request) {
        request.addHeader(HEADER_SDK_TRANSACTION_ID, UUID.randomUUID().toString());
    }

    /**
     * Sets a User-Agent for the specified request, taking into account any custom data.
     */
    private void setUserAgent(Request<?> request) {
        String userAgent = config.getUserAgent();
        if (!userAgent.equals(ClientConfiguration.DEFAULT_USER_AGENT)) {
            userAgent += ", " + ClientConfiguration.DEFAULT_USER_AGENT;
        }
        if (userAgent != null) {
            request.addHeader(HEADER_USER_AGENT, userAgent);
        }
        AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        RequestClientOptions opts = awsreq.getRequestClientOptions();
        if (opts != null) {
            String userAgentMarker = opts.getClientMarker(Marker.USER_AGENT);
            if (userAgentMarker != null) {
                request.addHeader(HEADER_USER_AGENT, createUserAgentString(userAgent, userAgentMarker));
            }
        }
    }

    /**
     * Adds Retry information to the {@link #HEADER_SDK_RETRY_INFO} header. Used for analysis of
     * retry policy.
     * 
     * @param request
     *            Request to add header to
     * @param execOneRequestParams
     *            Request context containing retry information
     */
    private void updateRetryHeaderInfo(Request<?> request, ExecOneRequestParams execOneRequestParams) {
        int availableRetryCapacity = retryCapacity.availableCapacity();

        String headerValue = String.format("%s/%s/%s",
                execOneRequestParams.requestCount - 1,
                execOneRequestParams.lastBackoffDelay,
                availableRetryCapacity >= 0 ? availableRetryCapacity : "");

        request.addHeader(HEADER_SDK_RETRY_INFO, headerValue);
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
     * Shuts down this HTTP client object, releasing any resources that might be held open. This is
     * an optional method, and callers are not expected to call it, but can if they want to
     * explicitly release any open resources. Once a client has been shutdown, it cannot be used to
     * make more requests.
     */
    public void shutdown() {
        clientExecutionTimer.shutdown();
        httpRequestTimer.shutdown();
        IdleConnectionReaper.removeConnectionManager(httpClient.getConnectionManager());
        httpClient.getConnectionManager().shutdown();
    }

    /**
     * Returns true if a failed request should be retried.
     *
     * @param originalRequest
     *            The original service request that is being executed.
     * @param params
     *            Params for the individual request being executed.
     * @param exception
     *            The client/service exception from the failed request.
     * @param executionContext
     *            The execution context for the request being executed.
     * @return True if the failed request should be retried.
     */
    private boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                ExecOneRequestParams params,
                                AmazonClientException exception,
                                ExecutionContext executionContext) {
        final int retries = params.requestCount - 1;
        final RetryPolicy retryPolicy = config.getRetryPolicy();
        final HttpRequestBase method = params.apacheRequest;

        int maxErrorRetry = config.getMaxErrorRetry();
        // We should use the maxErrorRetry in
        // the RetryPolicy if either the user has not explicitly set it in
        // ClientConfiguration, or the RetryPolicy is configured to take
        // higher precedence.
        if (maxErrorRetry < 0 || !retryPolicy.isMaxErrorRetryInClientConfigHonored()) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }

        // Immediately fails when it has exceeds the max retry count.
        if (retries >= maxErrorRetry)
            return false;

        // Never retry on requests containing non-repeatable entity
        if (method instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) method).getEntity();
            if (entity != null && !entity.isRepeatable()) {
                if (log.isDebugEnabled()) {
                    log.debug("Entity not repeatable");
                }
                return false;
            }
        }

        // Do not use retry capacity for throttling exceptions
        if (!(exception instanceof AmazonServiceException &&
                RetryUtils.isThrottlingException((AmazonServiceException) exception)))
        {
            // See if we have enough available retry capacity to be able to execute
            // this retry attempt.
            if (!retryCapacity.acquire(THROTTLED_RETRY_COST)) {
                return false;
            }
            executionContext.markRetryCapacityConsumed();
        }

        // Finally, pass all the context information to the RetryCondition and let it
        // decide whether it should be retried.
        if (!retryPolicy.getRetryCondition().shouldRetry(originalRequest, exception, retries)) {
            // If the retry policy fails we immediately return consumed capacity to the pool.
            if (executionContext.retryCapacityConsumed()) {
                retryCapacity.release(THROTTLED_RETRY_COST);
            }
            return false;
        }

        return true;
    }

    private static boolean isTemporaryRedirect(org.apache.http.HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status == HttpStatus.SC_TEMPORARY_REDIRECT && response.getHeaders("Location") != null
                && response.getHeaders("Location").length > 0;
    }

    private boolean isRequestSuccessful(org.apache.http.HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status / 100 == HttpStatus.SC_OK / 100;
    }

    /**
     * Handles a successful response from a service call by unmarshalling the results using the
     * specified response handler.
     *
     * @param <T>
     *            The type of object expected in the response.
     * @param request
     *            The original request that generated the response being handled.
     * @param responseHandler
     *            The response unmarshaller used to interpret the contents of the response.
     * @param method
     *            The HTTP method that was invoked, and contains the contents of the response.
     * @param executionContext
     *            Extra state information about the request currently being executed.
     * @param isHeaderReqIdAvail
     *            true if the AWS request id is available from the http response header; false
     *            otherwise.
     * @return The contents of the response, unmarshalled using the specified response handler.
     * @throws IOException
     *             If any problems were encountered reading the response contents from the HTTP
     *             method object.
     */
    @SuppressWarnings("deprecation")
    private <T> T handleResponse(Request<?> request,
                                 HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
                                 HttpRequestBase method,
                                 HttpResponse httpResponse,
                                 org.apache.http.HttpResponse apacheHttpResponse,
                                 ExecutionContext executionContext,
                                 final boolean isHeaderReqIdAvail,
                                 List<RequestHandler2> requestHandlers) throws IOException, InterruptedException {
        AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        ProgressListener listener = awsreq.getGeneralProgressListener();
        try {
            /*
             * Apply the byte counting stream wrapper if the legacy runtime profiling is enabled.
             */
            CountingInputStream countingInputStream = null;
            InputStream is = httpResponse.getContent();
            if (is != null) {
                if (System.getProperty(PROFILING_SYSTEM_PROPERTY) != null) {
                    is = countingInputStream = new CountingInputStream(is);
                    httpResponse.setContent(is);
                }
                httpResponse.setContent(ProgressInputStream.inputStreamForResponse(is, awsreq));
            }
            Map<String, String> headers = httpResponse.getHeaders();
            String s = headers.get("Content-Length");
            if (s != null) {
                try {
                    long contentLength = Long.parseLong(s);
                    publishResponseContentLength(listener, contentLength);
                } catch (NumberFormatException e) {
                    log.warn("Cannot parse the Content-Length header of the response.");
                }
            }

            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AmazonWebServiceResponse<? extends T> awsResponse;
            awsRequestMetrics.startEvent(Field.ResponseProcessingTime);
            publishProgress(listener, ProgressEventType.HTTP_RESPONSE_STARTED_EVENT);
            try {
                awsResponse = responseHandler.handle(beforeUnmarshalling(requestHandlers, request, httpResponse));
            } finally {
                awsRequestMetrics.endEvent(Field.ResponseProcessingTime);
            }
            publishProgress(listener, ProgressEventType.HTTP_RESPONSE_COMPLETED_EVENT);

            if (countingInputStream != null) {
                awsRequestMetrics.setCounter(Field.BytesProcessed, countingInputStream.getByteCount());
            }

            if (awsResponse == null)
                throw new RuntimeException("Unable to unmarshall response metadata. Response Code: "
                        + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText());

            AmazonWebServiceRequest userRequest = request.getOriginalRequest();
            if (userRequest.getCloneRoot() != null)
                userRequest = userRequest.getCloneRoot();
            responseMetadataCache.add(userRequest, awsResponse.getResponseMetadata());
            final String awsRequestId = awsResponse.getRequestId();

            if (requestLog.isDebugEnabled()) {
                final StatusLine statusLine = apacheHttpResponse.getStatusLine();
                requestLog.debug(
                        "Received successful response: " + (statusLine == null ? null : statusLine.getStatusCode())
                                + ", AWS Request ID: " + awsRequestId);
            }

            if (!isHeaderReqIdAvail) {
                // Logs the AWS request ID extracted from the payload if
                // it is not available from the response header.
                logResponseRequestId(awsRequestId);
            }
            awsRequestMetrics.addProperty(Field.AWSRequestID, awsRequestId);
            return awsResponse.getResult();
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (AmazonClientException e) {
            throw e; // simply rethrow rather than further wrapping it
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e) {
            String errorMessage = "Unable to unmarshall response (" + e.getMessage() + "). Response Code: "
                    + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText();
            throw new AmazonClientException(errorMessage, e);
        }
    }

    /**
     * Run {@link RequestHandler2#beforeUnmarshalling(Request, HttpResponse)} callback
     * 
     * @param requestHandler2s
     *            List of request handlers to invoke
     * @param request
     *            Original request
     * @param origHttpResponse
     *            Original {@link HttpResponse}
     * @return {@link HttpResponse} object to pass to unmarshaller. May have been modified or
     *         replaced by the request handlers
     */
    private HttpResponse beforeUnmarshalling(List<RequestHandler2> requestHandler2s,
                                             Request<?> request,
                                             HttpResponse origHttpResponse) {
        HttpResponse toReturn = origHttpResponse;
        for (RequestHandler2 requestHandler : requestHandler2s) {
            toReturn = requestHandler.beforeUnmarshalling(request, toReturn);
        }
        return toReturn;
    }

    /**
     * Responsible for handling an error response, including unmarshalling the error response into
     * the most specific exception type possible, and throwing the exception.
     *
     * @param request
     *            The request that generated the error response being handled.
     * @param errorResponseHandler
     *            The response handler responsible for unmarshalling the error response.
     * @param method
     *            The HTTP method containing the actual response content.
     * @throws IOException
     *             If any problems are encountering reading the error response.
     */
    private AmazonServiceException handleErrorResponse(Request<?> request,
                                                       HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                                       HttpRequestBase method,
                                                       final org.apache.http.HttpResponse apacheHttpResponse)
                                                               throws IOException, InterruptedException {
        final StatusLine statusLine = apacheHttpResponse.getStatusLine();
        final int statusCode;
        final String reasonPhrase;
        if (statusLine == null) {
            statusCode = -1;
            reasonPhrase = null;
        } else {
            statusCode = statusLine.getStatusCode();
            reasonPhrase = statusLine.getReasonPhrase();
        }
        HttpResponse response = createResponse(method, request, apacheHttpResponse);
        AmazonServiceException exception = null;
        try {
            exception = errorResponseHandler.handle(response);
            if (requestLog.isDebugEnabled())
                requestLog.debug("Received error response: " + exception);
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e) {
            // If the errorResponseHandler doesn't work, then check for error
            // responses that don't have any content
            if (statusCode == 413) {
                exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Client);
                exception.setErrorCode("Request entity too large");
            } else if (statusCode >= 500 && statusCode < 600) {
                exception = new AmazonServiceException(reasonPhrase);
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Service);
                exception.setErrorCode(reasonPhrase);
            } else if (e instanceof IOException) {
                throw (IOException) e;
            } else {
                String errorMessage = "Unable to unmarshall error response (" + e.getMessage() + "). Response Code: "
                        + (statusLine == null ? "None" : statusCode) + ", Response Text: " + reasonPhrase;
                throw new AmazonClientException(errorMessage, e);
            }
        }

        exception.setStatusCode(statusCode);
        exception.setServiceName(request.getServiceName());
        exception.fillInStackTrace();
        return exception;
    }

    /**
     * Creates and initializes an HttpResponse object suitable to be passed to an HTTP response
     * handler object.
     *
     * @param method
     *            The HTTP method that was invoked to get the response.
     * @param request
     *            The HTTP request associated with the response.
     * @return The new, initialized HttpResponse object ready to be passed to an HTTP response
     *         handler object.
     * @throws IOException
     *             If there were any problems getting any response information from the HttpClient
     *             method object.
     */
    private HttpResponse createResponse(HttpRequestBase method,
                                        Request<?> request,
                                        org.apache.http.HttpResponse apacheHttpResponse) throws IOException {
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
     * Pause before the next retry and record metrics around retry behavior.
     */
    private void pauseBeforeRetry(final Request<?> request,
                                  final AWSRequestMetrics awsRequestMetrics,
                                  ExecOneRequestParams execOneParams,
                                  final ProgressListener listener) throws InterruptedException {
        publishProgress(listener, ProgressEventType.CLIENT_REQUEST_RETRY_EVENT);
        // Notify the progress listener of the retry
        awsRequestMetrics.startEvent(Field.RetryPauseTime);
        try {
            // don't pause if the retry was not due to a redirection
            // ie when retried exception is null
            if (execOneParams.retriedException != null) {
                doPauseBeforeRetry(request.getOriginalRequest(), execOneParams.retriedException,
                        execOneParams.requestCount, config.getRetryPolicy(), execOneParams);
            }
        } finally {
            awsRequestMetrics.endEvent(Field.RetryPauseTime);
        }
    }

    /**
     * Sleep for a period of time on failed request to avoid flooding a service with retries.
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
    private void doPauseBeforeRetry(AmazonWebServiceRequest originalRequest,
                                    AmazonClientException previousException,
                                    int requestCount,
                                    RetryPolicy retryPolicy,
                                    ExecOneRequestParams execOneParams) throws InterruptedException {
        final int retries = requestCount // including next attempt
                - 1 // number of attempted requests
                - 1; // number of attempted retries

        long delay = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(originalRequest, previousException, retries);
        execOneParams.lastBackoffDelay = delay;

        if (log.isDebugEnabled()) {
            log.debug("Retriable error detected, " + "will retry in " + delay + "ms, attempt number: " + retries);
        }

        Thread.sleep(delay);
    }

    // SWF: Signature not yet current: 20140819T173921Z is still later than 20140819T173829Z
    // (20140819T173329Z + 5 min.)
    /**
     * Returns date string from the exception message body in form of yyyyMMdd'T'HHmmss'Z' We needed
     * to extract date from the message body because SQS is the only service that does not provide
     * date header in the response. Example, when device time is behind than the server time than we
     * get a string that looks something like this:
     * "Signature expired: 20130401T030113Z is now earlier than 20130401T034613Z (20130401T040113Z - 15 min.)"
     *
     * @param body
     *            The message from where the server time is being extracted
     * @return Return datetime in string format (yyyyMMdd'T'HHmmss'Z')
     */
    private String getServerDateFromException(String body) {
        final int startPos = body.indexOf("(");
        int endPos = body.indexOf(" + ");
        if (endPos == -1)
            endPos = body.indexOf(" - ");
        return endPos == -1 ? null : body.substring(startPos + 1, endPos);
    }

    /**
     * Returns the difference between the client's clock time and the service clock time in unit of
     * seconds.
     */
    private int parseClockSkewOffset(org.apache.http.HttpResponse response, AmazonServiceException exception) {
        final long currentTimeMilli = System.currentTimeMillis();
        Date serverDate = null;
        String serverDateStr = null;
        Header[] responseDateHeader = response.getHeaders("Date");

        try {
            if (responseDateHeader.length == 0) {
                // SQS doesn't return Date header
                final String errmsg = exception.getMessage();
                serverDateStr = getServerDateFromException(errmsg);
                if (serverDateStr == null) {
                    log.warn("Unable to parse clock skew offset from errmsg: " + errmsg);
                    return 0;
                }
                serverDate = DateUtils.parseCompressedISO8601Date(serverDateStr);
            } else {
                serverDateStr = responseDateHeader[0].getValue();
                serverDate = DateUtils.parseRFC822Date(serverDateStr);
            }
        } catch (RuntimeException e) {
            log.warn("Unable to parse clock skew offset from response: " + serverDateStr, e);
            return 0;
        }

        long diff = currentTimeMilli - serverDate.getTime();
        return (int) (diff / 1000);
    }

    @Override
    protected void finalize() throws Throwable {
        this.shutdown();
        super.finalize();
    }

    /**
     * Returns the http client specific request metric collector; or null if there is none.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    /** Returns the time difference in seconds between this client and AWS. */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * Used for testing via failure injection.
     */
    private static UnreliableTestConfig unreliableTestConfig;

    /**
     * Used to configure the test conditions for injecting intermittent failures to the content
     * input stream.
     *
     * @param config
     *            unreliable test configuration for failure injection; or null to disable such test.
     */
    static void configUnreliableTestConditions(UnreliableTestConfig config) {
        unreliableTestConfig = config;

    }

    /**
     * Gets the correct request timeout taking into account precedence of the configuration in
     * {@link AmazonWebServiceRequest} versus {@link ClientConfiguration}
     * 
     * @param request
     *            Current request
     * @return Request timeout value or 0 if none is set
     */
    private int getRequestTimeout(AmazonWebServiceRequest request) {
        if (request.getSdkRequestTimeout() != null) {
            return request.getSdkRequestTimeout();
        } else {
            return config.getRequestTimeout();
        }
    }

    /**
     * Gets the correct client execution timeout taking into account precedence of the configuration
     * in {@link AmazonWebServiceRequest} versus {@link ClientConfiguration}
     * 
     * @param request
     *            Current request
     * @return Client Execution timeout value or 0 if none is set
     */
    private int getClientExecutionTimeout(AmazonWebServiceRequest request) {
        if (request.getSdkClientExecutionTimeout() != null) {
            return request.getSdkClientExecutionTimeout();
        } else {
            return config.getClientExecutionTimeout();
        }

    }
}
