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
package com.amazonaws.services.s3.transfer.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;
import com.amazonaws.services.s3.transfer.model.UploadResult;

public class MultipartUploadCallable implements Callable<UploadResult> {
    private final AmazonS3 s3;
    private final ExecutorService threadPool;
    private final PutObjectRequest putObjectRequest;
    
    private static final Log log = LogFactory.getLog(MultipartUploadCallable.class);
    private final TransferManagerConfiguration configuration;
    private final ProgressListenerChain progressListenerChain;

    public MultipartUploadCallable(TransferManager transferManager, ExecutorService threadPool, PutObjectRequest putObjectRequest, ProgressListenerChain progressListenerChain) {
        this.s3 = transferManager.getAmazonS3Client();
        this.configuration = transferManager.getConfiguration();
        
        this.threadPool = threadPool;
        this.putObjectRequest = putObjectRequest;
        this.progressListenerChain = progressListenerChain;
    }
    
    public UploadResult call() throws Exception {
        final String bucketName = putObjectRequest.getBucketName();
        final String key        = putObjectRequest.getKey();

        fireProgressEvent(ProgressEvent.STARTED_EVENT_CODE);
        
        String uploadId = initiateMultipartUpload(putObjectRequest); 

        long optimalPartSize = TransferManagerUtils.calculateOptimalPartSize(putObjectRequest, configuration);
        log.debug("Calculated optimal part size: " + optimalPartSize);
        
        try {
            final List<PartETag> partETags = new ArrayList<PartETag>();
            UploadPartRequestFactory requestFactory = new UploadPartRequestFactory(putObjectRequest, uploadId, optimalPartSize);
            
            if (TransferManagerUtils.isUploadParallelizable(putObjectRequest)) {
                List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();
                while (requestFactory.hasMoreRequests()) {
                    UploadPartRequest request = requestFactory.getNextUploadPartRequest();
                    futures.add(threadPool.submit(new UploadPartCallable(s3, request)));
                }
                this.collectPartETags(futures, partETags);
            } else {
                while (requestFactory.hasMoreRequests()) {
                    partETags.add(s3.uploadPart(requestFactory.getNextUploadPartRequest()).getPartETag());
                }
            }
            
            CompleteMultipartUploadResult completeMultipartUploadResult = s3.completeMultipartUpload(
                    new CompleteMultipartUploadRequest(bucketName, key, uploadId, partETags));
            fireProgressEvent(ProgressEvent.COMPLETED_EVENT_CODE);
            
            UploadResult uploadResult = new UploadResult();
            uploadResult.setBucketName(completeMultipartUploadResult.getBucketName());
            uploadResult.setKey(completeMultipartUploadResult.getKey());
            uploadResult.setETag(completeMultipartUploadResult.getETag());
            uploadResult.setVersionId(completeMultipartUploadResult.getVersionId());
            return uploadResult;
        } catch (Exception e) {
            fireProgressEvent(ProgressEvent.FAILED_EVENT_CODE);
            
            try {
                s3.abortMultipartUpload(new AbortMultipartUploadRequest(bucketName, key, uploadId));
            } catch (Exception e2) {
                log.info("Unable to abort multipart upload, you may need to manually remove uploaded parts: " + e2.getMessage(), e2);
            }
            throw e;
        } finally {
            if (putObjectRequest.getInputStream() != null) {
                try {putObjectRequest.getInputStream().close(); } catch (Exception e) {
                    log.warn("Unable to cleanly close input stream: " + e.getMessage(), e);
                }
            }
        }
    }

    private String initiateMultipartUpload(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = 
            new InitiateMultipartUploadRequest(putObjectRequest.getBucketName(), putObjectRequest.getKey())
                .withCannedACL(putObjectRequest.getCannedAcl())
                .withObjectMetadata(putObjectRequest.getMetadata());
        
        if (putObjectRequest.getStorageClass() != null) {
            initiateMultipartUploadRequest.setStorageClass(
                    StorageClass.fromValue(putObjectRequest.getStorageClass()));
        }
        
        String uploadId = s3.initiateMultipartUpload(initiateMultipartUploadRequest).getUploadId();
        log.debug("Initiated new multipart upload: " + uploadId);
        
        return uploadId;
    }
    
    private void fireProgressEvent(int eventType) {
        if (progressListenerChain == null) return;
        ProgressEvent event = new ProgressEvent(0);
        event.setEventCode(eventType);
        progressListenerChain.progressChanged(event);
    }
    
   private void collectPartETags(final List<Future<PartETag>> futures, final List<PartETag> partETags) {
        for (Future<PartETag> future : futures) {
            try {
                partETags.add(future.get());
            } catch (Exception e) {
                throw new AmazonClientException("Unable to upload part: " + e.getCause().getMessage(), e.getCause());
            }
        }
    }
}