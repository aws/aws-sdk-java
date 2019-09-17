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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.transfer.model.CopyResult;

/**
 * Represents an asynchronous copy request from one Amazon S3 location another.
 * <p>
 * See {@link TransferManager} for more information about creating transfers.
 * </p>
 *
 * Please note that when copying data between s3 buckets there is no progress
 * updates whilst data is in transit. This means that the
 * {@link TransferProgress#getBytesTransferred()} will not be accurate until
 * the copy is complete.
 *
 * @see TransferManager#copy(String, String, String, String)
 * @see TransferManager#copy(com.amazonaws.services.s3.model.CopyObjectRequest)
 */
public interface Copy extends Transfer {

    /**
     * Waits for the copy request to complete and returns the result of this
     * request. Be prepared to handle errors when calling this method. Any
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
    public CopyResult waitForCopyResult() throws AmazonClientException,
            AmazonServiceException, InterruptedException;
}
