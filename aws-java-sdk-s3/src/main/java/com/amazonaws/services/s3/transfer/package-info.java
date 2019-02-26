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

/**
 * Transfer management.
 * <p>
 * This package provides the {@link com.amazonaws.services.s3.transfer.TransferManager} class, which
 * manages a queue of asynchronous transfers.  Callers can create a TransferManager instance, sharing
 * that same instance throughout their application, queue new uploads for TransferManager to process,
 * and continue working while TransferManager tracks the asynchronous upload progress.
 * <p>
 * The main benefits of using TransferManager are:
 * <ul>
 *   <li>Simplified API for working with, querying, and manipulating transfers.
 *   <li>Consistent interface for submitting uploads that abstracts the single part and multipart upload logic.
 *   <li>Increased throughput when multiple parts of an upload can be uploaded to Amazon S3 in parallel.
 * </ul>
 * <p>
 * The AmazonS3TransferProgress sample included in the AWS SDK for Java demonstrates how to use
 * TransferManager and how to track progress for uploads.
 * <p>
 * Using TransferManager to upload data to Amazon S3 is easy:
 * <pre class="brush: java">
 * AWSCredentials myCredentials = new BasicAWSCredentials(...);
 * TransferManager tx = new TransferManager(myCredentials);
 * Upload myUpload = tx.upload(myBucket, myFile.getName(), myFile);
 *
 * // You can poll your transfer's status to check its progress
 * if (myUpload.isDone() == false) {
 *     System.out.println("Transfer: " + myUpload.getDescription());
 *     System.out.println("  - State: " + myUpload.getState());
 *     System.out.println("  - Progress: " + myUpload.getProgress().getBytesTransferred());
 * }
 *
 * // Transfers also allow you to set a <code>ProgressListener</code> to receive
 * // asynchronous notifications about your transfer's progress.
 * myUpload.addProgressListener(myProgressListener);
 *
 * // Or you can block the current thread and wait for your transfer to
 * // to complete.  If the transfer fails, this method will throw a
 * // SdkClientException or AmazonServiceException detailing the reason.
 * myUpload.waitForCompletion();
 * </pre>
 *
 * @see com.amazonaws.services.s3.transfer.TransferManager
 */
package com.amazonaws.services.s3.transfer;
