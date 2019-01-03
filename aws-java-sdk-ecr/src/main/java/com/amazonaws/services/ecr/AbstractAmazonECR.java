/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecr;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonECR}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonECR implements AmazonECR {

    protected AbstractAmazonECR() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetImageResult batchGetImage(BatchGetImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRepositoryPolicyResult deleteRepositoryPolicy(DeleteRepositoryPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDownloadUrlForLayerResult getDownloadUrlForLayer(GetDownloadUrlForLayerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRepositoryPolicyResult getRepositoryPolicy(GetRepositoryPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListImagesResult listImages(ListImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutImageResult putImage(PutImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartLifecyclePolicyPreviewResult startLifecyclePolicyPreview(StartLifecyclePolicyPreviewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
