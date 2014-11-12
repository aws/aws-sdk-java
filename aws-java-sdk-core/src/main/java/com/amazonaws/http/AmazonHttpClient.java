/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static com.amazonaws.event.SDKProgressPublisher.publishProgress;
import static com.amazonaws.event.SDKProgressPublisher.publishRequestContentLength;
import static com.amazonaws.event.SDKProgressPublisher.publishResponseContentLength;
import static com.amazonaws.util.AWSRequestMetrics.Field.AWSErrorCode;
import static com.amazonaws.util.AWSRequestMetrics.Field.AWSRequestID;
import static com.amazonaws.util.AWSRequestMetrics.Field.Exception;
import static com.amazonaws.util.AWSRequestMetrics.Field.HttpClientPoolAvailableCount;
import static com.amazonaws.util.AWSRequestMetrics.Field.HttpClientPoolLeasedCount;
import static com.amazonaws.util.AWSRequestMetrics.Field.HttpClientPoolPendingCount;
import static com.amazonaws.util.AWSRequestMetrics.Field.HttpRequestTime;
import static com.amazonaws.util.AWSRequestMetrics.Field.RedirectLocation;
import static com.amazonaws.util.AWSRequestMetrics.Field.RequestCount;
import static com.amazonaws.util.AWSRequestMetrics.Field.RequestSigningTime;
import static com.amazonaws.util.AWSRequestMetrics.Field.RetryPauseTime;
import static com.amazonaws.util.AWSRequestMetrics.Field.ServiceEndpoint;
import static com.amazonaws.util.AWSRequestMetrics.Field.ServiceName;
import static com.amazonaws.util.AWSRequestMetrics.Field.StatusCode;
import static com.amazonaws.util.AWSRequestMetrics.Field.ThrottleException;
import static com.amazonaws.util.IOUtils.closeQuietly;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
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
import com.amazonaws.ResetException;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressInputStream;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.conn.ssl.SdkTLSSocketFactory;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkBufferedInputStream;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.retry.internal.AuthErrorRetryStrategy;
import com.amazonaws.retry.internal.AuthRetryParameters;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.CountingInputStream;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.FakeIOException;
import com.amazonaws.util.ResponseMetadataCache;
import com.amazonaws.util.TimingInfo;
import com.amazonaws.util.UnreliableFilterInputStream;

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

    private static final HttpRequestFactory httpRequestFactory = new HttpRequestFactory();
    private static final HttpClientFactory httpClientFactory = new HttpClientFactory();

    static {
        // Customers have reported XML parsing issues with the following
        // JVM versions, which don't occur with more recent versions, so
        // if we detect any of these, give customers a heads up.
        // https://bugs.openjdk.java.net/browse/JDK-8028111
        List<String> problematicJvmVersions = Arrays.asList(
            "1.6.0_06", "1.6.0_13", "1.6.0_17", "1.6.0_65", "1.7.0_45");
        String jvmVersion = System.getProperty("java.version");
        if (problematicJvmVersions.contains(jvmVersion)) {
            log.warn("Detected a possible problem with the current JVM version (" + jvmVersion + ").  " +
                     "If you experience XML parsing problems using the SDK, try upgrading to a more recent JVM update.");
        }
    }

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

    /** The time difference in seconds between this client and AWS. */
    private volatile int timeOffset = SDKGlobalConfiguration.getGlobalTimeOffset();

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
        this(config, httpClientFactory.createHttpClient(config), requestMetricCollector);
    }

    /**
     * Package-protected constructor for unit test purposes.
     */
    AmazonHttpClient(
            ClientConfiguration config,
            HttpClient httpClient,
            RequestMetricCollector requestMetricCollector) {

        this.config = config;
        this.httpClient = httpClient;
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

            SdkTLSSocketFactory sf = new SdkTLSSocketFactory(
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
            ExecutionContext executionContext) {
        if (executionContext == null)
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        final List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);
        AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        ProgressListener listener = awsreq.getGeneralProgressListener();
        Map<String, String> customHeaders = awsreq.getCustomRequestHeaders();
        if (customHeaders != null) {
            request.getHeaders().putAll(customHeaders);
        }
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Response<T> response = null;
        final InputStream origContent = request.getContent();
        final InputStream toBeClosed = beforeRequest(request); // for progress tracking
        // make "notCloseable", so reset would work with retries
        final InputStream notCloseable = (toBeClosed == null)
            ? null
            : ReleasableInputStream.wrap(toBeClosed).disableClose()
            ;
        request.setContent(notCloseable);
        try {
            publishProgress(listener, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
            response = executeHelper(request, responseHandler,
                    errorResponseHandler, executionContext);
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
     * Publishes the "request content length" event, and returns an input
     * stream, which will be made mark-and-resettable if possible, for progress
     * tracking purposes.
     *
     * @return an input stream, which will be made mark-and-resettable if
     *         possible, for progress tracking purposes; or null if the request
     *         doesn't have an input stream
     */
    private InputStream beforeRequest(Request<?> request) {
        final AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        ProgressListener listener = awsreq.getGeneralProgressListener();
        Map<String,String> headers = request.getHeaders();
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
                    content = new ResettableInputStream((FileInputStream)content);
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
        return new UnreliableFilterInputStream
            (is, unreliableTestConfig.isFakeIOException())
            .withBytesReadBeforeException(
                unreliableTestConfig.getBytesReadBeforeException())
            .withMaxNumErrors(
                unreliableTestConfig.getMaxNumErrors())
            .withResetIntervalBeforeException(
                unreliableTestConfig.getResetIntervalBeforeException())
            ;
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
            // If the request handler is a type of CredentialsRequestHandler,
            // then set the credentials in the request handler.
            if (requestHandler2 instanceof CredentialsRequestHandler)
                ((CredentialsRequestHandler) requestHandler2)
                        .setCredentials(executionContext.getCredentials());
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
            final ExecutionContext executionContext) {
        /*
         * add the service endpoint to the logs. You can infer service name from
         * service endpoint
         */
        final AWSRequestMetrics awsRequestMetrics =
            executionContext.getAwsRequestMetrics()
            .addPropertyWith(ServiceName, request.getServiceName())
            .addPropertyWith(ServiceEndpoint, request.getEndpoint())
            ;
        // Apply whatever request options we know how to handle, such as
        // user-agent.
        setUserAgent(request);
        // Make a copy of the original request params and headers so that we can
        // permute it in this loop and start over with the original every time.
        final Map<String, String> originalParameters =
            new LinkedHashMap<String, String>(request.getParameters());
        final Map<String, String> originalHeaders =
            new HashMap<String, String>(request.getHeaders());
        // Always mark the input stream before execution.
        final InputStream originalContent = request.getContent();
        if (originalContent != null && originalContent.markSupported()) {
            AmazonWebServiceRequest awsreq = request.getOriginalRequest();
            final int readLimit = awsreq.getRequestClientOptions().getReadLimit();
            originalContent.mark(readLimit);
        }
        final ExecOneRequestParams p = new ExecOneRequestParams();
        while (true) {
            p.initPerRetry();
            if (p.redirectedURI != null) {
                /*
                 * [scheme:][//authority][path][?query][#fragment]
                 */
                String scheme = p.redirectedURI.getScheme();
                String beforeAuthority = scheme == null ? "" : scheme + "://";
                String authority = p.redirectedURI.getAuthority();
                String path = p.redirectedURI.getPath();

                request.setEndpoint(URI.create(beforeAuthority + authority));
                request.setResourcePath(path);
            }
            if (p.authRetryParam != null) {
                request.setEndpoint(p.authRetryParam.getEndpointForRetry());
            }
            awsRequestMetrics.setCounter(RequestCount, p.requestCount);
            if (p.isRetry()) {
                request.setParameters(originalParameters);
                request.setHeaders(originalHeaders);
                request.setContent(originalContent);
            }
            try {
                Response<T> response = executeOneRequest(request, responseHandler,
                    errorResponseHandler, executionContext, awsRequestMetrics,
                    p);
                if (response != null)
                    return response;
            } catch (IOException ioe) {
                if (log.isInfoEnabled()) {
                    log.info("Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                }
                captureExceptionMetrics(ioe, awsRequestMetrics);
                awsRequestMetrics.addProperty(AWSRequestID, null);
                AmazonClientException ace = new AmazonClientException(
                        "Unable to execute HTTP request: " + ioe.getMessage(),
                        ioe);
                if (!shouldRetry(request.getOriginalRequest(),
                                p.apacheRequest,
                                ace,
                                p.requestCount,
                                config.getRetryPolicy())) {
                    throw lastReset(ace, request);
                }
                // Cache the retryable exception
                p.retriedException = ace;
            } catch(RuntimeException e) {
                throw lastReset(
                        captureExceptionMetrics(e, awsRequestMetrics),
                        request);
            } catch(Error e) {
                throw lastReset(
                        captureExceptionMetrics(e, awsRequestMetrics),
                        request);
            } finally {
                /*
                 * Some response handlers need to manually manage the HTTP
                 * connection and will take care of releasing the connection on
                 * their own, but if this response handler doesn't need the
                 * connection left open, we go ahead and release the it to free
                 * up resources.
                 */
                if (!p.leaveHttpConnectionOpen) {
                    if (p.apacheResponse != null) {
                        HttpEntity entity = p.apacheResponse.getEntity();
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
     * Used to perform a last reset on the content input stream (if
     * mark-supported); this is so that, for backward compatibility reason, any
     * "blind" retry (ie without calling reset) by user of this library with the
     * same input stream (such as ByteArrayInputStream) could still succeed.
     *
     * @param t
     *            the failure
     * @param apacheRequest
     *            the request, if known; or null otherwise.
     * @return the failure as given
     */
    private <T extends Throwable> T lastReset(final T t,
            final Request<?> req) {
        try {
            InputStream content = req.getContent();
            if (content != null) {
                if (content.markSupported())
                    content.reset();
            }
        } catch (Exception ex) {
            log.debug(
                "FYI: failed to reset content inputstream before throwing up",
                 ex);
        }
        return t;
    }

    /**
     * Stateful parameters that are used for executing a single http request.
     */
    private static class ExecOneRequestParams {
        private Signer signer;    // cached
        private URI signerURI;
        int requestCount; // monotonic increasing
        AmazonClientException retriedException; // last retryable exception

        HttpRequestBase apacheRequest;
        org.apache.http.HttpResponse apacheResponse;
        URI redirectedURI;

        AuthRetryParameters authRetryParam;
        /*
         * Depending on which response handler we end up choosing to handle the
         * HTTP response, it might require us to leave the underlying HTTP
         * connection open, depending on whether or not it reads the complete
         * HTTP response stream from the HTTP connection, or if delays reading
         * any of the content until after a response is returned to the caller.
         */
        boolean leaveHttpConnectionOpen;

        boolean isRetry() {
            return requestCount > 1 ||
                   redirectedURI != null ||
                   authRetryParam != null;
        }

        void initPerRetry() {
            requestCount++;
            apacheRequest = null;
            apacheResponse = null;
            leaveHttpConnectionOpen = false;
        }

        Signer newSigner(final Request<?> request,
                final ExecutionContext execContext) {
            if (authRetryParam != null) {
                signerURI = authRetryParam.getEndpointForRetry();
                signer = authRetryParam.getSignerForRetry();
                // Push the local signer override back to the execution context
                execContext.setSigner(signer);
            } else if (redirectedURI != null
                    && !redirectedURI.equals(signerURI)) {
                signerURI = redirectedURI;
                signer = execContext.getSignerByURI(signerURI);
            } else if (signer == null) {
                signerURI = request.getEndpoint();
                signer = execContext.getSignerByURI(signerURI);
            }
            return signer;
        }

        /**
         * @throws FakeIOException thrown only during test simulation
         */
        HttpRequestBase newApacheRequest(
                final HttpRequestFactory httpRequestFactory,
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
     * Returns the response from executing one http request; or null for retry.
     */
    private <T> Response<T> executeOneRequest(final Request<?> request,
            final HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            final HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            final ExecutionContext execContext,
            final AWSRequestMetrics awsRequestMetrics,
            ExecOneRequestParams p)
            throws IOException {
        // Reset the request input stream
        if (p.isRetry()) {
            InputStream requestInputStream = request.getContent();
            if (requestInputStream != null) {
                if (requestInputStream.markSupported()) {
                    try {
                        requestInputStream.reset();
                    } catch(IOException ex) {
                        throw new ResetException("Failed to reset the request input stream", ex);
                    }
                }
            }
        }
        if (requestLog.isDebugEnabled())
            requestLog.debug("Sending Request: " + request);
        final AWSCredentials credentials = execContext.getCredentials();
        final AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        // Sign the request if a signer was provided
        p.newSigner(request, execContext);
        if (p.signer != null && credentials != null) {
            awsRequestMetrics.startEvent(RequestSigningTime);
            try {
                if (timeOffset != 0)
                    request.setTimeOffset(timeOffset);
                p.signer.sign(request, credentials);
            } finally {
                awsRequestMetrics.endEvent(RequestSigningTime);
            }
        }
        p.newApacheRequest(httpRequestFactory, request, config, execContext);
        final ProgressListener listener = awsreq.getGeneralProgressListener();

        if (p.isRetry()) {
            publishProgress(listener, ProgressEventType.CLIENT_REQUEST_RETRY_EVENT);
            // Notify the progress listener of the retry
            awsRequestMetrics.startEvent(RetryPauseTime);
            try {
                // don't pause if the retry was not due to a redirection
                // ie when retried exception is null
                if (p.retriedException != null) {
                    pauseBeforeNextRetry(request.getOriginalRequest(),
                        p.retriedException, p.requestCount,
                        config.getRetryPolicy());
                }
            } finally {
                awsRequestMetrics.endEvent(RetryPauseTime);
            }
        }
        captureConnectionPoolMetrics(httpClient.getConnectionManager(), awsRequestMetrics);
        HttpContext httpContext = new BasicHttpContext();
        httpContext.setAttribute(
            AWSRequestMetrics.class.getSimpleName(),
            awsRequestMetrics);
        p.resetBeforeHttpRequest();
        publishProgress(listener, ProgressEventType.HTTP_REQUEST_STARTED_EVENT);
        awsRequestMetrics.startEvent(HttpRequestTime);
        try {
            p.apacheResponse = httpClient.execute(p.apacheRequest, httpContext);
        } finally {
            awsRequestMetrics.endEvent(HttpRequestTime);
        }
        publishProgress(listener, ProgressEventType.HTTP_REQUEST_COMPLETED_EVENT);
        final StatusLine statusLine = p.apacheResponse.getStatusLine();
        final int statusCode = statusLine == null ? -1 : statusLine.getStatusCode();
        if (isRequestSuccessful(p.apacheResponse)) {
            awsRequestMetrics.addProperty(StatusCode, statusCode);
            /*
             * If we get back any 2xx status code, then we know we should
             * treat the service call as successful.
             */
            p.leaveHttpConnectionOpen = responseHandler.needsConnectionLeftOpen();
            HttpResponse httpResponse = createResponse(p.apacheRequest,
                    request, p.apacheResponse);
            T response = handleResponse(request, responseHandler,
                    p.apacheRequest, httpResponse, p.apacheResponse,
                    execContext);
            return new Response<T>(response, httpResponse);
        }
        if (isTemporaryRedirect(p.apacheResponse)) {
            /*
             * S3 sends 307 Temporary Redirects if you try to delete an
             * EU bucket from the US endpoint. If we get a 307, we'll
             * point the HTTP method to the redirected location, and let
             * the next retry deliver the request to the right location.
             */
            Header[] locationHeaders = p.apacheResponse.getHeaders("location");
            String redirectedLocation = locationHeaders[0].getValue();
            if (log.isDebugEnabled())
                log.debug("Redirecting to: " + redirectedLocation);
            p.redirectedURI = URI.create(redirectedLocation);
            awsRequestMetrics.addPropertyWith(StatusCode, statusCode)
                .addPropertyWith(RedirectLocation, redirectedLocation)
                .addPropertyWith(AWSRequestID, null)
                ;
            return null; // => retry
        }
        p.leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
        final AmazonServiceException ase = handleErrorResponse(request,
                errorResponseHandler, p.apacheRequest, p.apacheResponse);
        awsRequestMetrics
            .addPropertyWith(AWSRequestID, ase.getRequestId())
            .addPropertyWith(AWSErrorCode, ase.getErrorCode())
            .addPropertyWith(StatusCode, ase.getStatusCode());
        // Check whether we should internally retry the auth error
        p.authRetryParam = null;
        AuthErrorRetryStrategy authRetry = execContext.getAuthErrorRetryStrategy();
        if ( authRetry != null ) {
            p.authRetryParam = authRetry.shouldRetryWithAuthParam(request, ase);
        }
        if (p.authRetryParam == null &&
            !shouldRetry(request.getOriginalRequest(),
                p.apacheRequest,
                ase,
                p.requestCount,
                config.getRetryPolicy())) {
            throw ase;
        }
        // Comment out for now. Ref: CR2662349
        // Preserve the cause of retry before retrying
        // awsRequestMetrics.addProperty(RetryCause, ase);
        if (RetryUtils.isThrottlingException(ase)) {
            awsRequestMetrics.incrementCounterWith(ThrottleException)
                             .addProperty(ThrottleException, ase)
                             ;
        }
        // Cache the retryable exception
        p.retriedException = ase;
        /*
         * Checking for clock skew error again because we don't want to set the
         * global time offset for every service exception.
         */
        if (RetryUtils.isClockSkewError(ase)) {
            int clockSkew = parseClockSkewOffset(p.apacheResponse, ase);
            SDKGlobalConfiguration.setGlobalTimeOffset(timeOffset = clockSkew);
        }
        return null; // => retry
    }

    /**
     * Captures the connection pool metrics.
     */
    private void captureConnectionPoolMetrics(ClientConnectionManager connectionManager,
            AWSRequestMetrics awsRequestMetrics) {
        if (awsRequestMetrics.isEnabled()
                && connectionManager instanceof ConnPoolControl) {
            ConnPoolControl<?> control = (ConnPoolControl<?>) connectionManager;
            PoolStats stats = control.getTotalStats();
            awsRequestMetrics
                .withCounter(HttpClientPoolAvailableCount, stats.getAvailable())
                .withCounter(HttpClientPoolLeasedCount, stats.getLeased())
                .withCounter(HttpClientPoolPendingCount, stats.getPending())
                ;
        }
    }

    /**
     * Capture the metrics for the given throwable.
     */
    private <T extends Throwable> T captureExceptionMetrics(T t,
            AWSRequestMetrics awsRequestMetrics) {
        awsRequestMetrics.incrementCounterWith(Exception)
                         .addProperty(Exception, t);
        if (t instanceof AmazonServiceException) {
            AmazonServiceException ase = (AmazonServiceException) t;
            if (RetryUtils.isThrottlingException(ase)) {
                awsRequestMetrics.incrementCounterWith(ThrottleException)
                                 .addProperty(ThrottleException, ase);
            }
        }
        return t;
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
        RequestClientOptions opts = awsreq.getRequestClientOptions();
        if (opts != null) {
            String userAgentMarker = opts.getClientMarker(Marker.USER_AGENT);
            if (userAgentMarker != null) {
                request.addHeader(HEADER_USER_AGENT,
                    createUserAgentString(userAgent, userAgentMarker));
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
    @SuppressWarnings("deprecation")
    private <T> T handleResponse(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpRequestBase method, HttpResponse httpResponse,
            org.apache.http.HttpResponse apacheHttpResponse,
            ExecutionContext executionContext) throws IOException
    {
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
                httpResponse.setContent(
                    ProgressInputStream.inputStreamForResponse(is, awsreq));
            }
            Map<String,String> headers = httpResponse.getHeaders();
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
                awsResponse = responseHandler.handle(httpResponse);
            } finally {
                awsRequestMetrics.endEvent(Field.ResponseProcessingTime);
            }
            publishProgress(listener, ProgressEventType.HTTP_RESPONSE_COMPLETED_EVENT);

            if (countingInputStream != null) {
                awsRequestMetrics.setCounter(Field.BytesProcessed, countingInputStream.getByteCount());
            }

            if (awsResponse == null)
                throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " +
                        httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText());

            responseMetadataCache.add(request.getOriginalRequest(), awsResponse.getResponseMetadata());

            if (requestLog.isDebugEnabled()) {
                final StatusLine statusLine = apacheHttpResponse.getStatusLine();
                requestLog.debug("Received successful response: "
                    + (statusLine == null ? null : statusLine.getStatusCode())
                    + ", AWS Request ID: " + awsResponse.getRequestId());
            }
            awsRequestMetrics.addProperty(AWSRequestID, awsResponse.getRequestId());
            return awsResponse.getResult();
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (AmazonClientException e) {
            throw e;    // simply rethrow rather than further wrapping it
        } catch (Exception e) {
            String errorMessage = "Unable to unmarshall response (" + e.getMessage() + "). Response Code: " +
                        httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText();
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
        HttpRequestBase method,
        final org.apache.http.HttpResponse apacheHttpResponse) throws IOException
    {
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
        } catch (Exception e) {
            // If the errorResponseHandler doesn't work, then check for error
            // responses that don't have any content
            if (statusCode == 413) {
                exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Client);
                exception.setErrorCode("Request entity too large");
            } else if (statusCode == 503
                    && "Service Unavailable".equalsIgnoreCase(reasonPhrase)) {
                exception = new AmazonServiceException("Service unavailable");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Service);
                exception.setErrorCode("Service unavailable");
            } else if (e instanceof IOException) {
                throw (IOException) e;
            } else {
                String errorMessage = "Unable to unmarshall error response ("
                        + e.getMessage() + "). Response Code: "
                        + (statusLine == null ? "None" : statusCode)
                        + ", Response Text: " + reasonPhrase;
                throw new AmazonClientException(errorMessage, e);
            }
        }

        exception.setStatusCode(statusCode);
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

    // SWF: Signature not yet current: 20140819T173921Z is still later than 20140819T173829Z (20140819T173329Z + 5 min.)
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
        final int startPos = body.indexOf("(");
        int endPos = body.indexOf(" + ");
        if (endPos == -1)
            endPos = body.indexOf(" - ");
        return endPos == -1 ? null : body.substring(startPos+1, endPos);
    }

    /**
     * Returns the difference between the client's clock time and the service
     * clock time in unit of seconds.
     */
    private int parseClockSkewOffset(org.apache.http.HttpResponse response,
            AmazonServiceException exception) {
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
                    log.warn("Unable to parse clock skew offset from errmsg: "
                            + errmsg);
                    return 0;
                }
                serverDate = DateUtils.parseCompressedISO8601Date(serverDateStr);
            } else {
                serverDateStr = responseDateHeader[0].getValue();
                serverDate = DateUtils.parseRFC822Date(serverDateStr);
            }
        } catch (RuntimeException e) {
            log.warn("Unable to parse clock skew offset from response: "
                     + serverDateStr,
                     e);
            return 0;
        }

        long diff = currentTimeMilli - serverDate.getTime();
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

    /** Returns the time difference in seconds between this client and AWS. */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * Used for testing via failure injection.
     */
    private static UnreliableTestConfig unreliableTestConfig;

    /**
     * Used to configure the test conditions for injecting intermittent failures
     * to the content input stream.
     *
     * @param config
     *            unreliable test configuration for failure injection; or null
     *            to disable such test.
     */
    static void configUnreliableTestConditions(UnreliableTestConfig config) {
        unreliableTestConfig = config;
    }
}
