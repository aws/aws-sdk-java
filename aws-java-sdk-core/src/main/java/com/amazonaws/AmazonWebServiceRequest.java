/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Base class for all user facing web service requests.
 */
@NotThreadSafe
public abstract class AmazonWebServiceRequest implements Cloneable, ReadLimitInfo, HandlerContextAware {

    public static final AmazonWebServiceRequest NOOP = new AmazonWebServiceRequest() {
    };

    /**
     * The optional progress listener for receiving updates about the progress of the request.
     */
    private ProgressListener progressListener = ProgressListener.NOOP;

    /**
     * Arbitrary options storage for individual {@link AmazonWebServiceRequest}s. This field is not
     * intended to be used by clients.
     */
    private final RequestClientOptions requestClientOptions = new RequestClientOptions();

    /**
     * A request metric collector used for this specific service request; or null if there is none.
     * This collector always takes precedence over the ones specified at the http client level and
     * AWS SDK level.
     */
    private RequestMetricCollector requestMetricCollector;

    /**
     * The optional credentials to use for this request - overrides the default credentials set at
     * the client level.
     */
    private AWSCredentialsProvider credentialsProvider;

    /**
     * A map of custom header names to header values.
     */
    private Map<String, String> customRequestHeaders;

    /**
     * Custom query parameters for the request.
     */
    private Map<String, List<String>> customQueryParameters;

    /**
     * User-defined context for the request.
     */
    private transient Map<HandlerContextKey<?>, Object> handlerContext = new HashMap<HandlerContextKey<?>, Object>();

    /**
     * The source object from which the current object was cloned; or null if there isn't one.
     */
    private AmazonWebServiceRequest cloneSource;

    private Integer sdkRequestTimeout = null;

    private Integer sdkClientExecutionTimeout = null;

    /**
     * Sets the optional credentials to use for this request, overriding the default credentials set at the client level.
     *
     * @param credentials The optional AWS security credentials to use for this request, overriding the default credentials set at
     *                    the client level.
     * @deprecated by {@link #setRequestCredentialsProvider(AWSCredentialsProvider)}. If you must use {@link AWSCredentials} you
     * can wrap it with a {@link com.amazonaws.auth.AWSStaticCredentialsProvider}.
     */
    @Deprecated
    public void setRequestCredentials(AWSCredentials credentials) {
        this.credentialsProvider = credentials == null ? null : new StaticCredentialsProvider(credentials);
    }

    /**
     * Returns the optional credentials to use to sign this request, overriding the default
     * credentials set at the client level.
     *
     * @return The optional credentials to use to sign this request, overriding the default
     *         credentials set at the client level.
     *
     * @deprecated by {@link #getRequestCredentialsProvider()}
     */
    @Deprecated
    public AWSCredentials getRequestCredentials() {
        return credentialsProvider == null ? null : credentialsProvider.getCredentials();
    }

    /**
     * Sets the optional credentials provider to use for this request, overriding the default credentials
     * provider at the client level.
     *
     * @param credentialsProvider
     *            The optional AWS security credentials provider to use for this request, overriding the
     *            default credentials provider at the client level.
     */
    public void setRequestCredentialsProvider(AWSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

    /**
     * Returns the optional credentials provider to use to sign this request, overriding the default
     * credentials provider at the client level.
     *
     * @return The optional credentials provider to use to sign this request, overriding the default
     *         credentials provider at the client level.
     */
    public AWSCredentialsProvider getRequestCredentialsProvider() {
        return credentialsProvider;
    }

    /**
     * Sets the optional credentials provider to use for this request, overriding the default credentials
     * provider at the client level.
     *
     * @param credentialsProvider
     *            The optional AWS security credentials provider to use for this request, overriding the
     *            default credentials provider at the client level.
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public <T extends AmazonWebServiceRequest> T withRequestCredentialsProvider(final AWSCredentialsProvider credentialsProvider) {
        setRequestCredentialsProvider(credentialsProvider);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }

    /**
     * Gets the options stored with this request object. Intended for internal use only.
     */
    public RequestClientOptions getRequestClientOptions() {
        return requestClientOptions;
    }

    /**
     * Returns a request level metric collector; or null if not specified.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    /**
     * Sets a request level request metric collector which takes precedence over the ones at the
     * http client level and AWS SDK level.
     */
    public void setRequestMetricCollector(RequestMetricCollector requestMetricCollector) {
        this.requestMetricCollector = requestMetricCollector;
    }

    /**
     * Specifies a request level metric collector which takes precedence over the ones at the http
     * client level and AWS SDK level.
     */
    public <T extends AmazonWebServiceRequest> T withRequestMetricCollector(RequestMetricCollector metricCollector) {
        setRequestMetricCollector(metricCollector);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }

    /**
     * Sets the optional progress listener for receiving updates about the progress of the request.
     *
     * @param progressListener
     *            The new progress listener.
     */
    public void setGeneralProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener == null ? ProgressListener.NOOP : progressListener;
    }

    /**
     * Returns the optional progress listener for receiving updates about the progress of the
     * request.
     *
     * @return the optional progress listener for receiving updates about the progress of the
     *         request.
     */
    public ProgressListener getGeneralProgressListener() {
        return progressListener;
    }

    /**
     * Sets the optional progress listener for receiving updates about the progress of the request,
     * and returns a reference to this object so that method calls can be chained together.
     *
     * @param progressListener
     *            The new progress listener.
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public <T extends AmazonWebServiceRequest> T withGeneralProgressListener(ProgressListener progressListener) {
        setGeneralProgressListener(progressListener);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }

    /**
     * Returns an immutable map of custom header names to header values.
     *
     * @return The immutable map of custom header names to header values.
     */
    public Map<String, String> getCustomRequestHeaders() {
        if (customRequestHeaders == null) {
            return null;
        }
        return Collections.unmodifiableMap(customRequestHeaders);
    }

    /**
     * Put a new custom header to the map of custom header names to custom header values, and return
     * the previous value if the header has already been set in this map.
     * <p>
     * Any custom headers that are defined are used in the HTTP request to the AWS service. These
     * headers will be silently ignored in the event that AWS does not recognize them.
     * <p>
     * NOTE: Custom header values set via this method will overwrite any conflicting values coming
     * from the request parameters.
     *
     * @param name
     *            The name of the header to add
     * @param value
     *            The value of the header to add
     * @return the previous value for the name if it was set, null otherwise
     */
    public String putCustomRequestHeader(String name, String value) {
        if (customRequestHeaders == null) {
            customRequestHeaders = new HashMap<String, String>();
        }
        return customRequestHeaders.put(name, value);
    }

    /**
     * @return the immutable map of custom query parameters. The parameter value is modeled as a
     *         list of strings because multiple values can be specified for the same parameter name.
     */
    public Map<String, List<String>> getCustomQueryParameters() {
        if (customQueryParameters == null) {
            return null;
        }
        return Collections.unmodifiableMap(customQueryParameters);
    }

    /**
     * Add a custom query parameter for the request. Since multiple values are allowed for the same
     * query parameter, this method does NOT overwrite any existing parameter values in the request.
     * <p>
     * Any custom query parameters that are defined are used in the HTTP request to the AWS service.
     *
     * @param name
     *            The name of the query parameter
     * @param value
     *            The value of the query parameter. Only the parameter name will be added in the URI
     *            if the value is set to null. For example, putCustomQueryParameter("param", null)
     *            will be serialized to "?param", while putCustomQueryParameter("param", "") will be
     *            serialized to "?param=".
     */
    public void putCustomQueryParameter(String name, String value) {
        if (customQueryParameters == null) {
            customQueryParameters = new HashMap<String, List<String>>();
        }
        List<String> paramList = customQueryParameters.get(name);
        if (paramList == null) {
            paramList = new LinkedList<String>();
            customQueryParameters.put(name, paramList);
        }
        paramList.add(value);
    }

    @Override
    public final int getReadLimit() {
        return requestClientOptions.getReadLimit();
    }

    /**
     * Copies the internal state of this base class to that of the target request.
     *
     * @return the target request
     */
    protected final <T extends AmazonWebServiceRequest> T copyBaseTo(T target) {
        if (customRequestHeaders != null) {
            for (Map.Entry<String, String> e : customRequestHeaders.entrySet())
                target.putCustomRequestHeader(e.getKey(), e.getValue());
        }
        if (customQueryParameters != null) {
            for (Map.Entry<String, List<String>> e : customQueryParameters.entrySet()) {
                if (e.getValue() != null) {
                    for (String value : e.getValue()) {
                        target.putCustomQueryParameter(e.getKey(), value);
                    }
                }
            }
        }

        target.setRequestCredentialsProvider(credentialsProvider);
        target.setGeneralProgressListener(progressListener);
        target.setRequestMetricCollector(requestMetricCollector);
        requestClientOptions.copyTo(target.getRequestClientOptions());
        return target;
    }

    /**
     * Returns the source object from which the current object was cloned; or null if there isn't
     * one.
     */
    public AmazonWebServiceRequest getCloneSource() {
        return cloneSource;
    }

    /**
     * Returns the root object from which the current object was cloned; or null if there isn't one.
     */
    public AmazonWebServiceRequest getCloneRoot() {
        AmazonWebServiceRequest cloneRoot = cloneSource;
        if (cloneRoot != null) {
            while (cloneRoot.getCloneSource() != null) {
                cloneRoot = cloneRoot.getCloneSource();
            }
        }
        return cloneRoot;
    }

    private void setCloneSource(AmazonWebServiceRequest cloneSource) {
        this.cloneSource = cloneSource;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) for the request to complete before
     * giving up and timing out. A non-positive value disables this feature.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the request timeout feature should
     * not be used when absolute precision is needed.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @return The amount of time to wait (in milliseconds) for the request to complete before
     *         giving up and timing out. A non-positive value disables the timeout for this request.
     * @see {@link AmazonWebServiceRequest#setSdkClientExecutionTimeout(int)} to enforce a timeout
     *      across all retries
     */
    public Integer getSdkRequestTimeout() {
        return sdkRequestTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for the request to complete before giving
     * up and timing out. A non-positive value disables this feature.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the request timeout feature should
     * not be used when absolute precision is needed.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param sdkRequestTimeout
     *            The amount of time to wait (in milliseconds) for the request to complete before
     *            giving up and timing out. A non-positive value disables the timeout for this
     *            request.
     * @see {@link AmazonWebServiceRequest#setSdkClientExecutionTimeout(int)} to enforce a timeout
     *      across all retries
     */
    public void setSdkRequestTimeout(int sdkRequestTimeout) {
        this.sdkRequestTimeout = sdkRequestTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for the request to complete before giving
     * up and timing out. A non-positive value disables this feature. Returns the updated
     * AmazonWebServiceRequest object so that additional method calls may be chained together.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the request timeout feature should
     * not be used when absolute precision is needed.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param sdkRequestTimeout
     *            The amount of time to wait (in milliseconds) for the request to complete before
     *            giving up and timing out. A non-positive value disables the timeout for this
     *            request.
     * @return The updated {@link AmazonWebServiceRequest} object.
     * @see {@link AmazonWebServiceRequest#setSdkClientExecutionTimeout(int)} to enforce a timeout
     *      across all retries
     */
    public <T extends AmazonWebServiceRequest> T withSdkRequestTimeout(int sdkRequestTimeout) {
        setSdkRequestTimeout(sdkRequestTimeout);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }

    /**
     * Returns the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to
     * enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
     * spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
     * disables this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @return The amount of time (in milliseconds) to allow the client to complete the execution of
     *         an API call. A non-positive value disables the timeout for this request.
     * @see {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to enforce a timeout per HTTP
     *      request
     */
    public Integer getSdkClientExecutionTimeout() {
        return this.sdkClientExecutionTimeout;
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to
     * enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
     * spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
     * disables this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param sdkClientExecutionTimeout
     *            The amount of time (in milliseconds) to allow the client to complete the execution
     *            of an API call. A non-positive value disables the timeout for this request.
     * @see {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to enforce a timeout per HTTP
     *      request
     */
    public void setSdkClientExecutionTimeout(int sdkClientExecutionTimeout) {
        this.sdkClientExecutionTimeout = sdkClientExecutionTimeout;
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to
     * enforce both a timeout on each individual HTTP request (i.e. each retry) and the total time
     * spent on all requests across retries (i.e. the 'client execution' time). A non-positive value
     * disables this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param sdkClientExecutionTimeout
     *            The amount of time (in milliseconds) to allow the client to complete the execution
     *            of an API call. A non-positive value disables the timeout for this request.
     * @return The updated AmazonWebServiceRequest object for method chaining
     * @see {@link AmazonWebServiceRequest#setSdkRequestTimeout(int)} to enforce a timeout per HTTP
     *      request
     */
    public <T extends AmazonWebServiceRequest> T withSdkClientExecutionTimeout(int sdkClientExecutionTimeout) {
        setSdkClientExecutionTimeout(sdkClientExecutionTimeout);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }

    @Override
    public <X> void addHandlerContext(HandlerContextKey<X> key, X value) {
        this.handlerContext.put(key, value);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <X> X getHandlerContext(HandlerContextKey<X> key) {
        return (X) this.handlerContext.get(key);
    }

    /**
     * Retrieve an unmodifiable collection of all handler context objects. This allows a {@link Request} derived from a
     * {@link AmazonWebServiceRequest} to inherit its context. This does not protect the objects within the map from being
     * modified.
     *
     * <p>This should not be used by customers.</p>
     */
    @SdkInternalApi
    Map<HandlerContextKey<?>, Object> getHandlerContext() {
        return Collections.unmodifiableMap(this.handlerContext);
    }

    /**
     * Creates a shallow clone of this object for all fields except the handler context. Explicitly does <em>not</em> clone the
     * deep structure of the other fields in the message.
     *
     * @see Object#clone()
     */
    @Override
    public AmazonWebServiceRequest clone() {
        try {
            AmazonWebServiceRequest cloned = (AmazonWebServiceRequest) super.clone();
            cloned.setCloneSource(this);

            // Deep-copy context to ensure modifications made by the handlers do not leak back to the caller or other uses of the
            // same request.
            cloned.handlerContext = new HashMap<HandlerContextKey<?>, Object>(cloned.handlerContext);

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
