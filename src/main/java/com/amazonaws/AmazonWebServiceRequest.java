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
package com.amazonaws;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

/**
 * Base class for all user facing web service requests.
 */
@NotThreadSafe
public abstract class AmazonWebServiceRequest {
    public static final AmazonWebServiceRequest NOOP = new AmazonWebServiceRequest() {};
    /**
     * The optional progress listener for receiving updates about the progress
     * of the request.
     */
    private ProgressListener progressListener = ProgressListener.NOOP;

    /**
     * Arbitrary options storage for individual {@link AmazonWebServiceRequest}s. This
     * field is not intended to be used by clients.
     */
    private final RequestClientOptions requestClientOptions = new RequestClientOptions();

    /**
     * A request metric collector used for this specific service request; or
     * null if there is none.  This collector always takes precedence over the
     * ones specified at the http client level and AWS SDK level.
     */
    private RequestMetricCollector requestMetricCollector;

    /**
     * The optional credentials to use for this request - overrides the
     * default credentials set at the client level.
     */
    private AWSCredentials credentials;


    /**
     * Sets the optional credentials to use for this request, overriding the
     * default credentials set at the client level.
     *
     * @param credentials
     *            The optional AWS security credentials to use for this request,
     *            overriding the default credentials set at the client level.
     */
    public void setRequestCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Returns the optional credentials to use to sign this request, overriding
     * the default credentials set at the client level.
     *
     * @return The optional credentials to use to sign this request, overriding
     *         the default credentials set at the client level.
     */
    public AWSCredentials getRequestCredentials() {
        return credentials;
    }

    /**
     * Internal only method for accessing private, internal request parameters.
     * Not intended for direct use by callers.
     *
     * @return private, internal request parameter information.
     */
    public Map<String, String> copyPrivateRequestParameters() {
        return new HashMap<String, String>();
    }

    /**
     * Gets the options stored with this request object. Intended for internal
     * use only.
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
     * Sets a request level request metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     */
    public void setRequestMetricCollector(RequestMetricCollector requestMetricCollector) {
        this.requestMetricCollector = requestMetricCollector;
    }

    /**
     * Specifies a request level metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     */
    public <T extends AmazonWebServiceRequest> T withRequestMetricCollector(RequestMetricCollector metricCollector) {
        setRequestMetricCollector(metricCollector);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Sets the optional progress listener for receiving updates about the
     * progress of the request.
     *
     * @param progressListener
     *            The new progress listener.
     */
    public void setGeneralProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener == null
                              ? ProgressListener.NOOP
                              : progressListener;
    }

    /**
     * Returns the optional progress listener for receiving updates about the
     * progress of the request.
     *
     * @return the optional progress listener for receiving updates about the
     *         progress of the request.
     */
    public ProgressListener getGeneralProgressListener() {
        return progressListener;
    }

    /**
     * Sets the optional progress listener for receiving updates about the
     * progress of the request, and returns a reference to this object so that
     * method calls can be chained together.
     *
     * @param progressListener
     *            The new progress listener.
     *
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public <T extends AmazonWebServiceRequest> T withGeneralProgressListener(ProgressListener progressListener) {
        setGeneralProgressListener(progressListener);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }
}
