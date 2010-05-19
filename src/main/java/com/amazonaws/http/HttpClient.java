/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Map.Entry;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.HttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.NoHttpResponseException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.HeadMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.util.CountingInputStream;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.VersionInfoUtils;

public class HttpClient {

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
    private static final Log log = LogFactory.getLog(HttpClient.class);

    private static final Log unmarshallerPerformanceLog = LogFactory.getLog("com.amazonaws.unmarshaller.performance");

    /** Internal client for sending HTTP requests */
    private org.apache.commons.httpclient.HttpClient httpClient;

    private static final String DEFAULT_ENCODING = "UTF-8";

    /** Client configuration options, such as proxy settings, max retries, etc. */
    private final ClientConfiguration config;


    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc).
     *
     * @param clientConfiguration
     *            Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     */
    public HttpClient(ClientConfiguration clientConfiguration) {
        this.config = clientConfiguration;
        configureHttpClient();
    }

    public <T> T execute(HttpRequest request,
            HttpResponseHandler<ResponseMetadata<T>> responseHandler,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler)
            throws AmazonServiceException {

        URI endpoint = request.getEndpoint();
        HttpMethodBase method = createHttpMethodFromRequest(request);

        /* Set content type and encoding */
        if (method.getRequestHeader("Content-Type") == null) {
            log.debug("Setting content-type to application/x-www-form-urlencoded; " +
            		"charset=" + DEFAULT_ENCODING.toLowerCase());
            method.addRequestHeader("Content-Type",
                    "application/x-www-form-urlencoded; " +
                    "charset=" + DEFAULT_ENCODING.toLowerCase());
        } else {
            log.debug("Not overwriting Content-Type; already set to: " + method.getRequestHeader("Content-Type"));
        }

        /*
         * Depending on which response handler we end up choosing to handle the
         * HTTP response, it might require us to leave the underlying HTTP
         * connection open, depending on whether or not it reads the complete
         * HTTP response stream from the HTTP connection, or if delays reading
         * any of the content until after a response is returned to the caller.
         */
        boolean leaveHttpConnectionOpen = false;

        /*
         * Apache HttpClient omits the port number in the Host header (even if
         * we explicitly specify it) if it's the default port for the protocol
         * in use. To ensure that we use the same Host header in the request and
         * in the calculated string to sign (even if Apache HttpClient changed
         * and started honoring our explicit host with endpoint), we follow this
         * same behavior here and in the QueryString signer.
         */
        String hostHeader = endpoint.getHost();
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            hostHeader += ":" + endpoint.getPort();
        }
        method.addRequestHeader("Host", hostHeader);

        // When we release connections, the connection manager leaves them
        // open so they can be reused.  We want to close out any idle
        // connections so that they don't sit around in CLOSE_WAIT.
        httpClient.getHttpConnectionManager().closeIdleConnections(1000 * 30);

        int retries = 0;
        while (true) {
            try {
                requestLog.info("Sending Request: " + request.toString());

                retries++;
                int status = httpClient.executeMethod(method);

                if (status / 100 == HttpStatus.SC_OK / 100) {
                    /*
                     * If we get back any 2xx status code, then we know we should
                     * treat the service call as successful.
                     */
                    leaveHttpConnectionOpen = responseHandler.needsConnectionLeftOpen();
                    return handleResponse(request, responseHandler, method);
                } else if (status == HttpStatus.SC_TEMPORARY_REDIRECT) {
                    /*
                     * S3 sends 307 Temporary Redirects if you try to delete an
                     * EU bucket from the US endpoint. If we get a 307, we'll
                     * point the HTTP method to the redirected location, and let
                     * the next retry deliver the request to the right location.
                     */
                    Header locationHeader = method.getResponseHeader("location");
                    if (locationHeader != null) {
                        String redirectedLocation = locationHeader.getValue();
                        log.debug("Redirecting to: " + redirectedLocation);
                        method.setURI(new org.apache.commons.httpclient.URI(
                                redirectedLocation, false));
                    } else {
                        leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
                        handleErrorResponse(request, errorResponseHandler, method);
                    }
                } else if (status == HttpStatus.SC_INTERNAL_SERVER_ERROR
                        || status == HttpStatus.SC_SERVICE_UNAVAILABLE) {
                    /*
                     * For 500 internal server errors and 503 service
                     * unavailable errors, we want to retry, but we need to use
                     * an exponential back-off strategy so that we don't overload
                     * a server with a flood of retries. If we've surpassed our
                     * retry limit we handle the error response as a non-retryable
                     * error and go ahead and throw it back to the user as an exception.
                     */
                    if (retries >= config.getMaxErrorRetry()) {
                        leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
                        handleErrorResponse(request, errorResponseHandler, method);
                    }

                    requestLog.info("Received retryable error response: " + status
                            + ", retrying request...");
                    pauseExponentially(retries);
                } else {
                    /*
                     * Any other errors are interpreted as a service specific
                     * error (when possible) and thrown.
                     *
                     * We don't want to retry on these errors, since it's likely
                     * that retries will fail in exactly the same way.
                     */
                    leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
                    handleErrorResponse(request, errorResponseHandler, method);
                }
            } catch (IOException ioe) {
                log.error("Unable to execute HTTP request: " + ioe.getMessage());

                throw new AmazonClientException("Unable to execute HTTP request: "
                        + ioe.getMessage(), ioe);
            } finally {
                /*
                 * Some response handlers need to manually manage the HTTP
                 * connection and will take care of releasing the connection on
                 * their own, but if this response handler doesn't need the
                 * connection left open, we go ahead and release the it to free
                 * up resources.
                 */
                if (!leaveHttpConnectionOpen) {
                    try {method.getResponseBodyAsStream().close();} catch (Throwable t) {}
                    method.releaseConnection();
                }
            }
        }
    }

    /**
     * Creates an HttpClient method object based on the specified request and
     * populates any parameters, headers, etc. from the original request.
     *
     * @param request
     *            The request to convert to an HttpClient method object.
     *
     * @return The converted HttpClient method object with any parameters,
     *         headers, etc. from the original request set.
     */
    private HttpMethodBase createHttpMethodFromRequest(HttpRequest request) {
        URI endpoint = request.getEndpoint();
        String uri = endpoint.toString();
        if (request.getResourcePath() != null && request.getResourcePath().length() > 0) {
            if (request.getResourcePath().startsWith("/") == false) {
                uri += "/";
            }
            uri += request.getResourcePath();
        }

        NameValuePair[] nameValuePairs = null;
        if (request.getParameters().size() > 0) {
            nameValuePairs = new NameValuePair[request.getParameters().size()];
            int i = 0;
            for (Entry<String, String> entry : request.getParameters().entrySet()) {
                nameValuePairs[i++] = new NameValuePair(entry.getKey(), entry.getValue());
            }
        }

        HttpMethodBase method;
        if (request.getMethodName() == HttpMethodName.POST) {
            PostMethod postMethod = new PostMethod(uri);
            if (nameValuePairs != null) postMethod.addParameters(nameValuePairs);
            method = postMethod;
        } else if (request.getMethodName() == HttpMethodName.GET) {
            GetMethod getMethod = new GetMethod(uri);
            if (nameValuePairs != null) getMethod.setQueryString(nameValuePairs);
            method = getMethod;
        } else if (request.getMethodName() == HttpMethodName.PUT) {
            PutMethod putMethod = new PutMethod(uri);
            if (nameValuePairs != null) putMethod.setQueryString(nameValuePairs);
            method = putMethod;

            /*
             * Enable 100-continue support for PUT operations, since this is
             * where we're potentially uploading large amounts of data and want
             * to find out as early as possible if an operation will fail. We
             * don't want to do this for all operations since it will cause
             * extra latency in the network interaction.
             */
            putMethod.getParams().setBooleanParameter(HttpClientParams.USE_EXPECT_CONTINUE, true);

            if (request.getContent() != null) {
                putMethod.setRequestEntity(new RepeatableInputStreamRequestEntity(request));
            }
        } else if (request.getMethodName() == HttpMethodName.DELETE) {
            DeleteMethod deleteMethod = new DeleteMethod(uri);
            if (nameValuePairs != null) deleteMethod.setQueryString(nameValuePairs);
            method = deleteMethod;
        } else if (request.getMethodName() == HttpMethodName.HEAD) {
            HeadMethod headMethod = new HeadMethod(uri);
            if (nameValuePairs != null) headMethod.setQueryString(nameValuePairs);
            method = headMethod;
        } else {
            throw new AmazonClientException("Unknown HTTP method name: " + request.getMethodName());
        }

        // No matter what type of HTTP method we're creating, we need to copy
        // all the headers from the request.
        for (Entry<String, String> entry : request.getHeaders().entrySet()) {
            method.addRequestHeader(entry.getKey(), entry.getValue());
        }

        return method;
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
     *
     * @return The contents of the response, unmarshalled using the specified
     *         response handler.
     *
     * @throws IOException
     *             If any problems were encountered reading the response
     *             contents from the HTTP method object.
     */
    private <T> T handleResponse(HttpRequest request,
            HttpResponseHandler<ResponseMetadata<T>> responseHandler, HttpMethodBase method)
            throws IOException {

        HttpResponse httpResponse = createResponse(method, request);
        if (responseHandler.needsConnectionLeftOpen()) {
            httpResponse.setContent(new HttpMethodReleaseInputStream(method));
        }

        try {
            CountingInputStream countingInputStream = null;
            if (unmarshallerPerformanceLog.isTraceEnabled()) {
                countingInputStream = new CountingInputStream(httpResponse.getContent());
                httpResponse.setContent(countingInputStream);
            }

            long startTime = System.currentTimeMillis();
            ResponseMetadata<? extends T> responseMetadata = responseHandler.handle(httpResponse);
            long endTime = System.currentTimeMillis();

            if (unmarshallerPerformanceLog.isTraceEnabled()) {
                unmarshallerPerformanceLog.trace(
                        countingInputStream.getByteCount() + ", " + (endTime - startTime));
            }

            if (responseMetadata == null)
                throw new RuntimeException("Unable to unmarshall response metadata");

            requestLog.info("Received successful response: " + method.getStatusCode()
                    + ", AWS Request ID: " + responseMetadata.getRequestId());

            return responseMetadata.getResult();
        } catch (Exception e) {
            String errorMessage = "Unable to unmarshall response (" + e.getMessage() + "): "
                                + method.getResponseBodyAsString();
            log.error(errorMessage, e);
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
    private void handleErrorResponse(HttpRequest request,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            HttpMethodBase method) throws IOException {

        int status = method.getStatusCode();
        HttpResponse response = createResponse(method, request);
        if (errorResponseHandler.needsConnectionLeftOpen()) {
            response.setContent(new HttpMethodReleaseInputStream(method));
        }

        AmazonServiceException exception = null;

        try {
            exception = errorResponseHandler.handle(response);
            requestLog.info("Received error response: " + exception.toString());
        } catch (Exception e) {
            String errorMessage = "Unable to unmarshall error response (" + e.getMessage() + "): "
                                + method.getResponseBodyAsString();
            log.error(errorMessage, e);
            throw new AmazonClientException(errorMessage, e);
        }

        exception.setStatusCode(status);
        exception.setServiceName(request.getServiceName());
        exception.fillInStackTrace();
        throw exception;
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
    private HttpResponse createResponse(HttpMethodBase method, HttpRequest request) throws IOException {
        HttpResponse httpResponse = new HttpResponse(request);

        httpResponse.setContent(method.getResponseBodyAsStream());
        httpResponse.setStatusCode(method.getStatusCode());
        httpResponse.setStatusText(method.getStatusText());
        for (Header header : method.getResponseHeaders()) {
            httpResponse.addHeader(header.getName(), header.getValue());
        }

        return httpResponse;
    }

    /**
     * Exponential sleep on failed request to avoid flooding a service with
     * retries.
     *
     * @param retries
     *            Current retry count.
     */
    private void pauseExponentially(int retries) {
        long delay = (long) (Math.pow(4, retries) * 100L);
        log.debug("Retriable error detected, will retry in " + delay + "ms, attempt numer: " + retries);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            // Nothing we need to do here
        }
    }

    /**
     * Configure HttpClient with set of defaults as well as configuration.
     */
    private void configureHttpClient() {
        /* Form User-Agent information */
        String userAgent = config.getUserAgent();
        if (!(userAgent.equals(ClientConfiguration.DEFAULT_USER_AGENT))) {
            userAgent += ", " + ClientConfiguration.DEFAULT_USER_AGENT;
        }
        userAgent += "-" + VersionInfoUtils.getVersion();

        /* Set HTTP client parameters */
        HttpClientParams httpClientParams = new HttpClientParams();
        httpClientParams.setParameter(HttpMethodParams.USER_AGENT, userAgent);
        httpClientParams.setParameter(HttpClientParams.RETRY_HANDLER, new RetryHandler());

        /* Set host configuration */
        HostConfiguration hostConfiguration = new HostConfiguration();

        /* Set connection manager parameters */
        HttpConnectionManagerParams connectionManagerParams = new HttpConnectionManagerParams();
        connectionManagerParams.setConnectionTimeout(config.getConnectionTimeout());
        connectionManagerParams.setSoTimeout(config.getSocketTimeout());
        connectionManagerParams.setStaleCheckingEnabled(true);
        connectionManagerParams.setTcpNoDelay(true);
        connectionManagerParams.setMaxTotalConnections(config.getMaxConnections());
        connectionManagerParams.setMaxConnectionsPerHost(hostConfiguration, config.getMaxConnections());

        int socketSendBufferSizeHint = config.getSocketBufferSizeHints()[0];
        if (socketSendBufferSizeHint > 0) {
            connectionManagerParams.setSendBufferSize(socketSendBufferSizeHint);
        }

        int socketReceiveBufferSizeHint = config.getSocketBufferSizeHints()[1];
        if (socketReceiveBufferSizeHint > 0) {
            connectionManagerParams.setReceiveBufferSize(socketReceiveBufferSizeHint);
        }

        /* Set connection manager */
        MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
        connectionManager.setParams(connectionManagerParams);

        httpClient = new org.apache.commons.httpclient.HttpClient(
                httpClientParams, connectionManager);

        /* Set proxy if configured */
        String proxyHost = config.getProxyHost();
        int proxyPort = config.getProxyPort();
        if (proxyHost != null && proxyPort > 0) {
            log.info("Configuring Proxy. Proxy Host: " + proxyHost + " "
                    + "Proxy Port: " + proxyPort);
            hostConfiguration.setProxy(proxyHost, proxyPort);

            String proxyUsername = config.getProxyUsername();
            String proxyPassword = config.getProxyPassword();
            if (proxyUsername != null && proxyPassword != null) {
                AuthScope authScope = new AuthScope(proxyHost, proxyPort);
                UsernamePasswordCredentials credentials =
                    new UsernamePasswordCredentials(proxyUsername, proxyPassword);

                httpClient.getState().setProxyCredentials(authScope, credentials);
            }
        }
        httpClient.setHostConfiguration(hostConfiguration);
    }

    /**
     * Implementation of HttpMethodRetryHandler that determines if a specific
     * type of failure should be retried or not.
     */
    private final class RetryHandler implements HttpMethodRetryHandler {
        public boolean retryMethod(HttpMethod method,
                IOException exception, int executionCount) {
            if (executionCount > 3) {
                log.debug("Maximum Number of Retry attempts reached, will not retry");
                return false;
            }

            log.debug("Retrying request. Attempt " + executionCount);
            if (exception instanceof NoHttpResponseException) {
                log.debug("Retrying on NoHttpResponseException");
                return true;
            }

            if (exception instanceof InterruptedIOException) {
                log.debug("Will not retry on InterruptedIOException", exception);
                return false;
            }

            if (exception instanceof UnknownHostException) {
                log.debug("Will not retry on UnknownHostException", exception);
                return false;
            }

            if (!method.isRequestSent()) {
                log.debug("Retrying on failed sent request");
                return true;
            }

            return false;
        }
    }

}
