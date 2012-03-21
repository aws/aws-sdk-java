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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.transfer.model.UploadResult;

/**
 * Represents an asynchronous upload to Amazon S3.   
 * <p>
 * See {@link TransferManager} for more information about creating transfers.
 * </p>
 * 
 * @see TransferManager#upload(String, String, java.io.File)
 * @see TransferManager#upload(com.amazonaws.services.s3.model.PutObjectRequest)
 */
public interface Upload extends Transfer {
    
    /**
     * Waits for this upload to complete and returns the result of this
     * upload. Be prepared to handle errors when calling this method. Any
     * errors that occurred during the asynchronous transfer will be re-thrown
     * through this method.
     * 
     * @return The result of this transfer.
     * 
     * @throws AmazonClientException
     *             If any errors were encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @throws InterruptedException
     *             If this thread is interrupted while waiting for the upload to
     *             complete.
     */
    public UploadResult waitForUploadResult() 
            throws AmazonClientException, AmazonServiceException, InterruptedException;
}
