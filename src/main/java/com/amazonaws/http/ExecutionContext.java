/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.internal.CustomBackoffStrategy;
import com.amazonaws.util.AWSRequestMetrics;

public class ExecutionContext {
	private List<RequestHandler> requestHandlers;
	private String contextUserAgent;
	private AWSRequestMetrics awsRequestMetrics = new AWSRequestMetrics();
	private CustomBackoffStrategy backoffStrategy;

	/** Optional signer to enable the runtime layer to handle signing requests (and resigning on retries). */
	private Signer signer;

	/** Optional credentials to enable the runtime layer to handle signing requests (and resigning on retries). */
	private AWSCredentials credentials;


    public String getContextUserAgent() {
        return contextUserAgent;
    }

    public void setContextUserAgent(String contextUserAgent) {
        this.contextUserAgent = contextUserAgent;
    }

    public ExecutionContext() {}

	public ExecutionContext(List<RequestHandler> requestHandlers) {
		this.requestHandlers = requestHandlers;
	}

	/**
	 * Returns a list of request handlers that should be run for a given
	 * request's execution.
	 *
	 * @return The list of request handlers to run for the current request.
	 */
	public List<RequestHandler> getRequestHandlers() {
		return requestHandlers;
	}

    public AWSRequestMetrics getAwsRequestMetrics() {
        return awsRequestMetrics;
    }

    public void setAwsRequestMetrics(AWSRequestMetrics awsRequestMetrics) {
        this.awsRequestMetrics = awsRequestMetrics;
    }

    /**
	 * Returns the optional signer used to sign the associated request.
	 *
	 * @return The optional signer used to sign the associated request.
	 */
	public Signer getSigner() {
		return signer;
	}

	/**
	 * Sets the optional signer used to sign the associated request. If no
	 * signer is specified as part of a request's ExecutionContext, then the
	 * runtime layer will not attempt to sign (or resign on retries) requests.
	 *
	 * @param signer
	 *            The optional signer used to sign the associated request.
	 */
	public void setSigner(Signer signer) {
		this.signer = signer;
	}

	/**
	 * Returns the optional credentials used to sign the associated request.
	 *
	 * @return The optional credentials used to sign the associated request.
	 */
	public AWSCredentials getCredentials() {
		return credentials;
	}

	/**
	 * Sets the optional credentials used to sign the associated request. If no
	 * credentials are specified as part of a request's ExecutionContext, then
	 * the runtime layer will not attempt to sign (or resign on retries)
	 * requests.
	 *
	 * @param credentials
	 *            The optional credentials used to sign the associated request.
	 */
	public void setCredentials(AWSCredentials credentials) {
		this.credentials = credentials;
	}

    /**
     * Returns the optional custom backoff strategy for controlling how long
     * between retries on error responses. If no custom backoff strategy is
     * specified, a default exponential backoff strategy is used.
     *
     * @return the optional custom backoff strategy for the associated request.
     */
    public CustomBackoffStrategy getCustomBackoffStrategy() {
        return backoffStrategy;
    }

    /**
     * Sets the optional custom backoff strategy for controlling how long
     * between retries on error responses. If no custom backoff strategy is
     * specified, a default exponential backoff strategy is used.
     *
     * @param backoffStrategy
     *            The optional custom backoff strategy for the associated
     *            request.
     */
    public void setCustomBackoffStrategy(CustomBackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
    }
}
