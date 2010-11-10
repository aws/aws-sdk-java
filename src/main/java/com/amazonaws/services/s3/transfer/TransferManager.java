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
package com.amazonaws.services.s3.transfer;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.internal.MultipartUploadCallable;
import com.amazonaws.services.s3.transfer.internal.ProgressListenerChain;
import com.amazonaws.services.s3.transfer.internal.PutObjectCallable;
import com.amazonaws.services.s3.transfer.internal.TransferManagerUtils;
import com.amazonaws.services.s3.transfer.internal.TransferProgressImpl;
import com.amazonaws.services.s3.transfer.internal.TransferProgressUpdatingListener;
import com.amazonaws.services.s3.transfer.internal.TransferStateUpdatingCallable;
import com.amazonaws.services.s3.transfer.internal.UploadImpl;
import com.amazonaws.services.s3.transfer.model.UploadResult;

/**
 * High level utility for managing transfers to Amazon S3.
 * <p>
 * <code>TransferManager</code> provides a simple API for uploading content to
 * Amazon S3, and makes extensive use of Amazon S3 multipart uploads to achieve
 * enhanced throughput, performance and reliability.
 * <p>
 * When possible, <code>TransferManager</code> attempts to use multiple threads
 * to upload multiple parts of a single upload at once. When dealing with large
 * content sizes and high bandwidth, this can have a significant increase on
 * throughput.
 * <p>
 * <code>TransferManager</code> is responsible for managing resources such as
 * connections and threads; share a single instance of
 * <code>TransferManager</code> whenever possible. <code>TransferManager</code>,
 * like all the client classes in the AWS SDK for Java, is thread safe.
 * <p>
 * Using <code>TransferManager</code> to upload data to Amazon S3 is easy:
 * 
 * <pre>
 * AWSCredentials myCredentials = new BasicAWSCredentials(...);
 * TransferManager tx = new TransferManager(myCredentials);
 * Upload myUpload = tx.upload(myBucket, myFile.getName(), myFile);
 * 
 * while (myUpload.isDone() == false) {
 *     System.out.println("Transfer: " + myUpload.getDescription());
 *     System.out.println("  - Status: " + myUpload.getStatus());
 *     System.out.println("  - Progress: " + myUpload.getProgress().getBytesTransfered());
 *     // Do work while we wait for our upload to complete...
 *     Thread.sleep(500);     
 * }
 * </pre>
 * <p>
 * Note: Transfers are stored in memory. If the JVM is restarted, previous
 * transfers are no longer accessible. If needed, clean up any multipart uploads
 * that are incomplete.
 */
public class TransferManager {
    
    /** The low level client we use to make the actual calls to Amazon S3. */
    private AmazonS3 s3;
    
    /** Configuration for how TransferManager processes requests. */
    private TransferManagerConfiguration configuration;
    
    /** The thread pool in which transfers are uploaded or downloaded. */
    private ThreadPoolExecutor threadPool;

    /** The thread pool in which progress listeners are notified of events. */
    private ExecutorService notificationThreadPool;
    

    /**
     * Constructs a new <code>TransferManager</code> and Amazon S3 client using
     * the specified AWS security credentials.
     * <p>
     * <code>TransferManager</code> and client objects 
     * may pool connections and threads.
     * Reuse <code>TransferManager</code> and client objects
     * and share them throughout applications.
     * <p>
     * TransferManager and all AWS client objects are thread safe.
     * 
     * @param credentials
     *            The AWS security credentials to use when making authenticated
     *            requests.
     */
    public TransferManager(AWSCredentials credentials) {
        this(new AmazonS3Client(credentials));
    }

    /**
     * Constructs a new <code>TransferManager</code>, 
     * specifying the client to use when making
     * requests to Amazon S3.
     * <p>
     * <code>TransferManager</code> and client objects 
     * may pool connections and threads.
     * Reuse <code>TransferManager</code> and client objects
     * and share them throughout applications.
     * <p>
     * TransferManager and all AWS client objects are thread safe.
     * </p>
     * 
     * @param s3
     *            The client to use when making requests to Amazon S3.
     */
    public TransferManager(AmazonS3 s3) {
        this(s3, TransferManagerUtils.createDefaultExecutorService());
    }

    /**
     * Constructs a new <code>TransferManager</code> 
     * specifying the client and thread pool to use when making
     * requests to Amazon S3.
     * <p>
     * <code>TransferManager</code> and client objects 
     * may pool connections and threads.
     * Reuse <code>TransferManager</code> and client objects
     * and share them throughout applications.
     * <p>
     * TransferManager and all AWS client objects are thread safe.
     * 
     * @param s3
     *            The client to use when making requests to Amazon S3.
     * @param threadPool
     *            The thread pool in which to execute requests.
     */
    public TransferManager(AmazonS3 s3, ThreadPoolExecutor threadPool) {
        this.s3 = s3;
        this.threadPool = threadPool;
        this.configuration = new TransferManagerConfiguration();
        this.notificationThreadPool = Executors.newFixedThreadPool(1);
    }

    
    /**
     * Sets the configuration which specifies how
     * this <code>TransferManager</code> processes requests.
     * 
     * @param configuration
     *            The new configuration specifying how 
     *            this <code>TransferManager</code>
     *            processes requests.
     */
    public void setConfiguration(TransferManagerConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * Returns the configuration which specifies how
     * this <code>TransferManager</code> processes requests.
     * 
     * @return The configuration settings for this <code>TransferManager</code>.
     */
    public TransferManagerConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Returns the underlying Amazon S3 client used to make requests to
     * Amazon S3.
     * 
     * @return The underlying Amazon S3 client used to make requests to
     *         Amazon S3.
     */
    public AmazonS3 getAmazonS3Client() {
        return s3;
    }

    /**
     * <p>
     * Schedules a new transfer to upload data to Amazon S3. This method is
     * non-blocking and returns immediately (i.e. before the upload has
     * finished).
     * </p>
     * <p>
     * When uploading data from a stream, callers <b>must</b> supply the size of
     * data in the stream through the content length field in the 
     * <code>ObjectMetadata</code> parameter.
     * If no content length is specified for the input
     * stream, then TransferManager will attempt to buffer all the stream
     * contents in memory and upload the data as a traditional, single part
     * upload. Because the entire stream contents must be buffered in memory,
     * this can be very expensive, and should be avoided whenever possible.
     * </p>
     * <p>
     * Use the returned <code>Upload<code> object to query the progress of the
     * transfer, add listeners for progress events, and wait for the upload to
     * complete.
     * </p>
     * <p>
     * If resources are available, the upload will begin immediately. 
     * Otherwise, the upload is scheduled and started as soon as 
     * resources become available.
     * </p>
     * 
     * @param bucketName
     *            The name of the bucket to upload the new object to.
     * @param key
     *            The key in the specified bucket by which to store the new
     *            object.
     * @param input
     *            The input stream containing the data to upload to Amazon S3.
     * @param objectMetadata
     *            Additional information about the object being uploaded,
     *            including the size of the data, content type, additional
     *            custom user metadata, etc.
     * 
     * @return A new <code>Upload<code> object to use to check 
     * 		   the state of the upload, listen for progress notifications, 
     * 		   and otherwise manage the upload.
     * 
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Upload upload(final String bucketName, final String key, final InputStream input, ObjectMetadata objectMetadata) 
        throws AmazonServiceException, AmazonClientException {
        return upload(new PutObjectRequest(bucketName, key, input, objectMetadata));
    }

    
    /**
     * Schedules a new transfer to upload data to Amazon S3. This method is
     * non-blocking and returns immediately (i.e. before the upload has
     * finished).
     * <p>
     * The returned Upload object allows you to query the progress of the
     * transfer, add listeners for progress events, and wait for the upload to
     * complete.
     * <p>
     * If resources are available, the upload will begin immediately, otherwise
     * it will be scheduled and started as soon as resources become available.
     * 
     * @param bucketName
     *            The name of the bucket to upload the new object to.
     * @param key
     *            The key in the specified bucket by which to store the new
     *            object.
     * @param file
     *            The file to upload.
     * 
     * @return A new Upload object which can be used to check state of the
     *         upload, listen for progress notifications, and otherwise manage
     *         the upload.
     * 
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Upload upload(final String bucketName, final String key, final File file) 
        throws AmazonServiceException, AmazonClientException {
        return upload(new PutObjectRequest(bucketName, key, file));
    }
    

    /**
     * <p>
     * Schedules a new transfer to upload data to Amazon S3. This method is
     * non-blocking and returns immediately (i.e. before the upload has
     * finished).
     * </p>
     * <p>
     * Use the returned <code>Upload<code> object to query the progress of the
     * transfer, add listeners for progress events, and wait for the upload to
     * complete.
     * </p>
     * <p>
     * If resources are available, the upload will begin immediately. 
     * Otherwise, the upload is scheduled and started as soon as 
     * resources become available.
     * </p>
     * 
     * @param putObjectRequest
     *            The request containing all the parameters for the upload.
     * 
     * @return A new <code>Upload<code> object to use to check 
     * 		   the state of the upload, listen for progress notifications, 
     * 		   and otherwise manage the upload.
     * 
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Upload upload(final PutObjectRequest putObjectRequest) 
        throws AmazonServiceException, AmazonClientException {

        if (putObjectRequest.getMetadata() == null)
            putObjectRequest.setMetadata(new ObjectMetadata());
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        
        if (TransferManagerUtils.getRequestFile(putObjectRequest) != null) {
            File file = TransferManagerUtils.getRequestFile(putObjectRequest);

            // Always set the content length, even if it's already set
            metadata.setContentLength(file.length());

            // Only set the content type if it hasn't already been set
            if (metadata.getContentType() == null) {
                metadata.setContentType(Mimetypes.getInstance().getMimetype(file));
            }
        }
        
        String description = "Uploading to " + putObjectRequest.getBucketName() + "/" + putObjectRequest.getKey();
        TransferProgressImpl transferProgress = new TransferProgressImpl();
        transferProgress.setTotalBytesToTransfer(TransferManagerUtils.getContentLength(putObjectRequest));

        ProgressListenerChain listenerChain = new ProgressListenerChain(
                notificationThreadPool,
                new TransferProgressUpdatingListener(transferProgress),
                putObjectRequest.getProgressListener());
        putObjectRequest.setProgressListener(listenerChain);
        
        UploadImpl upload = new UploadImpl(description, transferProgress, listenerChain);
        
        Callable<UploadResult> callable = null;
        if (TransferManagerUtils.shouldUseMultipartUpload(putObjectRequest, configuration)) {
            callable = new MultipartUploadCallable(this, threadPool, putObjectRequest, listenerChain);
        } else {
            callable = new PutObjectCallable(s3, putObjectRequest);
        }
        
        callable = new TransferStateUpdatingCallable(callable, upload);
        upload.setFuture(threadPool.submit(callable));
        
        return upload;
    }

    /**
     * <p>
     * Aborts any multipart uploads that were initiated before the specified date.
     * </p>
     * <p>
     * This method is useful for cleaning up any interrupted multipart uploads.
     * <code>TransferManager</code> attempts to abort any failed uploads, 
     * but in some cases this may not be possible, such as if network connectivity
     * is completely lost.
     * </p>
     * 
     * @param bucketName
     *            The name of the bucket containing the multipart uploads to
     *            abort.
     * @param date
     *            The date indicating which multipart uploads should be aborted.
     */
    public void abortMultipartUploads(String bucketName, Date date)
            throws AmazonServiceException, AmazonClientException {
        MultipartUploadListing uploadListing = s3.listMultipartUploads(new ListMultipartUploadsRequest(bucketName));
        do {
            for (MultipartUpload upload : uploadListing.getMultipartUploads()) {
                if (upload.getInitiated().compareTo(date) < 0) {
                    s3.abortMultipartUpload(new AbortMultipartUploadRequest(
                            bucketName, upload.getKey(), upload.getUploadId()));
                }
            }
            
            ListMultipartUploadsRequest request = new ListMultipartUploadsRequest(bucketName)
                .withUploadIdMarker(uploadListing.getNextUploadIdMarker())
                .withKeyMarker(uploadListing.getNextKeyMarker());
            uploadListing = s3.listMultipartUploads(request);
        } while (uploadListing.isTruncated());
    }

}
