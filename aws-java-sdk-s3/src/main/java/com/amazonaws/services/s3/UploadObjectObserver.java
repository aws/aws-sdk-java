/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.internal.MultiFileOutputStream;
import com.amazonaws.services.s3.internal.PartCreationEvent;
import com.amazonaws.services.s3.internal.S3DirectSpi;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

/**
 * An observer that gets notified of ciphertext file creation for the purpose of
 * pipelined parallel multi-part uploads of encrypted data to S3. This observer
 * is responsible for uploading the files to S3 via multi-part upload, including
 * the multi-part upload initiation, individual part uploads, and multi-part
 * upload completion.
 * <p>
 * This observer is designed for extension so that custom behavior can be
 * provided. A customer observer can be configured via
 * {@link UploadObjectRequest#withUploadObjectObserver(UploadObjectObserver)}.
 *
 * @see UploadObjectRequest
 */
public class UploadObjectObserver {
    private final List<Future<UploadPartResult>> futures = new ArrayList<Future<UploadPartResult>>();
    private UploadObjectRequest req;
    private String uploadId;
    private S3DirectSpi s3direct;
    private AmazonS3 s3;
    private ExecutorService es;

    /**
     * Used to initialized this observer. This method is an SPI (service
     * provider interface) that is called from
     * <code>AmazonS3EncryptionClient</code>.
     * <p>
     * Implementation of this method should never block.
     *
     * @param req
     *            the upload object request
     * @param s3direct
     *            used to perform non-encrypting s3 operation via the current
     *            instance of s3 (encryption) client
     * @param s3
     *            the current instance of s3 (encryption) client
     * @param es
     *            the executor service to be used for concurrent uploads
     * @return this object
     */
    public UploadObjectObserver init(UploadObjectRequest req,
                                     S3DirectSpi s3direct, AmazonS3 s3, ExecutorService es) {
        this.req = req;
        this.s3direct = s3direct;
        this.s3 = s3;
        this.es = es;
        return this;
    }

    protected InitiateMultipartUploadRequest newInitiateMultipartUploadRequest(
        UploadObjectRequest req) {
        return new EncryptedInitiateMultipartUploadRequest(
            req.getBucketName(), req.getKey(), req.getMetadata())
            .withMaterialsDescription(req.getMaterialsDescription())
            .withRedirectLocation(req.getRedirectLocation())
            .withSSEAwsKeyManagementParams(req.getSSEAwsKeyManagementParams())
            .withSSECustomerKey(req.getSSECustomerKey())
            .withStorageClass(req.getStorageClass())
            .withAccessControlList(req.getAccessControlList())
            .withCannedACL(req.getCannedAcl())
            .withGeneralProgressListener(req.getGeneralProgressListener())
            .withRequestMetricCollector(req.getRequestMetricCollector())
            .withRequestCredentialsProvider(req.getRequestCredentialsProvider())
            ;
    }

    /**
     * Notified from
     * {@link AmazonS3EncryptionClient#uploadObject(UploadObjectRequest)} to
     * initiate a multi-part upload.
     *
     * @param req
     *            the upload object request
     * @return the initiated multi-part uploadId
     */
    public String onUploadInitiation(UploadObjectRequest req) {
        InitiateMultipartUploadResult res =
            s3.initiateMultipartUpload(newInitiateMultipartUploadRequest(req));
        return this.uploadId = res.getUploadId();
    }

    /**
     * Notified from {@link MultiFileOutputStream#fos()} when a part ready for
     * upload has been successfully created on disk. By default, this method
     * performs the following:
     * <ol>
     * <li>calls {@link #newUploadPartRequest(PartCreationEvent, File)} to
     * create an upload-part request for the newly created ciphertext file</li>
     * <li>call {@link #appendUserAgent(AmazonWebServiceRequest, String)} to
     * append the necessary user agent string to the request</li>
     * <li>and finally submit a concurrent task, which calls the method
     * {@link #uploadPart(UploadPartRequest)}, to be performed</li>
     * </ol>
     * <p>
     * To enable parallel uploads, implementation of this method should never
     * block.
     *
     * @param event
     *            to represent the completion of a ciphertext file creation
     *            which is ready for multipart upload to S3.
     */
    public void onPartCreate(PartCreationEvent event) {
        final File part = event.getPart();
        final UploadPartRequest reqUploadPart =
            newUploadPartRequest(event, part);
        final OnFileDelete fileDeleteObserver = event.getFileDeleteObserver();
        appendUserAgent(reqUploadPart, AmazonS3EncryptionClient.USER_AGENT);
        futures.add(es.submit(new Callable<UploadPartResult>() {
            @Override public UploadPartResult call() {
                // Upload the ciphertext directly via the non-encrypting
                // s3 client
                try {
                    return uploadPart(reqUploadPart);
                } finally {
                    // clean up part already uploaded
                    if (!part.delete()) {
                        LogFactory.getLog(getClass()).debug(
                            "Ignoring failure to delete file " + part
                            + " which has already been uploaded");
                    } else {
                        if (fileDeleteObserver != null)
                            fileDeleteObserver.onFileDelete(null);
                    }
                }
            }
        }));
    }

    /**
     * Notified from
     * {@link AmazonS3EncryptionClient#uploadObject(UploadObjectRequest)} when
     * all parts have been successfully uploaded to S3. This method is
     * responsible for finishing off the upload by making a complete multi-part
     * upload request to S3 with the given list of etags.
     *
     * @param partETags
     *            all the etags returned from S3 for the previous part uploads.
     *
     * @return the completed multi-part upload result
     */
    public CompleteMultipartUploadResult onCompletion(List<PartETag> partETags) {
        return s3.completeMultipartUpload(
            new CompleteMultipartUploadRequest(
                req.getBucketName(), req.getKey(), uploadId, partETags)
                .<CompleteMultipartUploadRequest>
                    withRequestCredentialsProvider(req.getRequestCredentialsProvider()));
    }

    /**
     * Notified from
     * {@link AmazonS3EncryptionClient#uploadObject(UploadObjectRequest)} when
     * failed to upload any part. This method is responsible for cancelling
     * ongoing uploads and aborting the multi-part upload request.
     */
    public void onAbort() {
        for (Future<?> future : getFutures()) {
            future.cancel(true);
        }
        if (uploadId != null) {
            try {
                s3.abortMultipartUpload(new AbortMultipartUploadRequest(
                    req.getBucketName(), req.getKey(), uploadId));
            } catch (Exception e) {
                LogFactory.getLog(getClass())
                          .debug("Failed to abort multi-part upload: " + uploadId, e);
            }
        }
    }
    /**
     * Creates and returns an upload-part request corresponding to a ciphertext
     * file upon a part-creation event.
     *
     * @param event
     *            the part-creation event of the ciphertxt file.
     * @param part
     *            the created ciphertext file corresponding to the upload-part
     */
    protected UploadPartRequest newUploadPartRequest(PartCreationEvent event,
                                                     final File part) {
        final UploadPartRequest reqUploadPart = new UploadPartRequest()
            .withBucketName(req.getBucketName())
            .withFile(part)
            .withKey(req.getKey())
            .withPartNumber(event.getPartNumber())
            .withPartSize(part.length())
            .withLastPart(event.isLastPart())
            .withUploadId(uploadId)
            .withObjectMetadata(req.getUploadPartMetadata())
            .withRequestCredentialsProvider(req.getRequestCredentialsProvider())
            ;
        return reqUploadPart;
    }

    /**
     * Uploads the ciphertext via the non-encrypting s3 client.
     * @param reqUploadPart part upload request
     * @return the result of the part upload when there is no exception
     */
    protected UploadPartResult uploadPart(UploadPartRequest reqUploadPart) {
        // Upload the ciphertext directly via the non-encrypting
        // s3 client
        return s3direct.uploadPart(reqUploadPart);
    }

    /**
     * Appends the given user agent to the given request.
     *
     * @return the given request.
     */
    protected <X extends AmazonWebServiceRequest> X appendUserAgent(
        X request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
        return request;
    }

    public List<Future<UploadPartResult>> getFutures() {
        return futures;
    }

    /**
     * Returns the request initialized via
     * {@link #init(UploadObjectRequest, S3DirectSpi, AmazonS3, ExecutorService)}
     */
    protected UploadObjectRequest getRequest() {
        return req;
    }

    /**
     * Returns the upload id after the multi-part upload has been initiated via
     * {@link #onUploadInitiation(UploadObjectRequest)}
     */
    protected String getUploadId() {
        return uploadId;
    }

    /**
     * Returns the <code>S3DirectSpi</code> instance initialized via
     * {@link #init(UploadObjectRequest, S3DirectSpi, AmazonS3, ExecutorService)}
     */
    protected S3DirectSpi getS3DirectSpi() {
        return s3direct;
    }

    /**
     * Returns the <code>AmazonS3</code> instance initialized via
     * {@link #init(UploadObjectRequest, S3DirectSpi, AmazonS3, ExecutorService)}
     */
    protected AmazonS3 getAmazonS3() {
        return s3;
    }

    /**
     * Returns the <code>ExecutorService</code> instance initialized via
     * {@link #init(UploadObjectRequest, S3DirectSpi, AmazonS3, ExecutorService)}
     */
    protected ExecutorService getExecutorService() {
        return es;
    }
}