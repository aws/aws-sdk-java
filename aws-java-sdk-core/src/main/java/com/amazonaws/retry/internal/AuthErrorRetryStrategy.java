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
package com.amazonaws.retry.internal;


import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.http.HttpResponse;

/**
 * For internal use only.
 */
public interface AuthErrorRetryStrategy {

	/**
	 * Returns an alternative signing context (consists of a new signer instance
	 * and a new request endpoint) that should be used to retry the request. Or
	 * null if it should not be retried.
	 */
	AuthRetryParameters shouldRetryWithAuthParam(Request<?> originalRequest,
			HttpResponse response, AmazonServiceException ase);
}
