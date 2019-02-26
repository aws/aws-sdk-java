/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.handlers;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Callback interface for notification on web service requests executed with the
 * asynchronous clients in the AWS SDK for Java.
 */
public interface AsyncHandler<REQUEST extends AmazonWebServiceRequest, RESULT> {

	/**
	 * Invoked after an asynchronous request 
	 * @param exception
	 */
	public void onError(Exception exception);

	/**
	 * Invoked after an asynchronous request has completed successfully. Callers
	 * have access to the original request object and the returned response
	 * object.
	 *
	 * @param request
	 *            The initial request created by the caller
	 * @param result
	 *            The successful result of the executed operation.
	 */
	public void onSuccess(REQUEST request, RESULT result);

}