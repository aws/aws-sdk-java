/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


/**
 * <p>
 * Allows completely async operation where the calling code does not even wait
 * for the future to be complete but instead, these methods are called in
 * response to a service or client error or to request completion.
 * </p>
 * 
 * @author Usman Ismail
 * 
 */
public interface AsyncServiceHandler<RESULT, REQUEST extends AmazonWebServiceRequest> {

	/**
	 * <p>
	 * This method will be called if there is an AmazonServiceException, this is
	 * the more specific case of the overloaded handleException method because
	 * the AmazonServiceException has easier access to cause of exceptions.
	 * </p>
	 * 
	 * @param exception
	 */
	public void handleException(AmazonServiceException exception);

	/**
	 * <p>
	 * This method will be called if there is an AmazonServiceException, this is
	 * the less specific case of the overloaded handleException method because
	 * the AmazonServiceException has easier access to cause of exceptions.
	 * </p>
	 * 
	 * @param exception
	 */
	public void handleException(AmazonClientException exception);
	
	/**
	 * <p>
	 * This method will be called if there is an AmazonServiceException, this is
	 * the least specific case of the overloaded handleException method used to
	 * catch all misc exceptions.
	 * </p>
	 * 
	 * @param exception
	 */
	public void handleException(Exception exception);

	/**
	 * 
	 * @param result
	 *            The result of the operation e.g. UpdateItemResult
	 * @param request
	 *            The initial request send to aws client e.g. UpdateItemRequest
	 */
	public void handleResult(RESULT result, REQUEST request);

}
