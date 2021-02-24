/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecrpublic;

import javax.annotation.Generated;

import com.amazonaws.services.ecrpublic.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonECRPublic}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonECRPublic implements AmazonECRPublic {

    protected AbstractAmazonECRPublic() {
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
    public CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
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
    public DescribeImageTagsResult describeImageTags(DescribeImageTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRegistriesResult describeRegistries(DescribeRegistriesRequest request) {
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
    public GetRegistryCatalogDataResult getRegistryCatalogData(GetRegistryCatalogDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRepositoryCatalogDataResult getRepositoryCatalogData(GetRepositoryCatalogDataRequest request) {
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
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutImageResult putImage(PutImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRegistryCatalogDataResult putRegistryCatalogData(PutRegistryCatalogDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRepositoryCatalogDataResult putRepositoryCatalogData(PutRepositoryCatalogDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest request) {
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
