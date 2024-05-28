/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;

/**
 * Abstract implementation of {@code AmazonCodeGuruSecurityAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeGuruSecurityAsync extends AbstractAmazonCodeGuruSecurity implements AmazonCodeGuruSecurityAsync {

    protected AbstractAmazonCodeGuruSecurityAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(BatchGetFindingsRequest request) {

        return batchGetFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(BatchGetFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetFindingsRequest, BatchGetFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateScanResult> createScanAsync(CreateScanRequest request) {

        return createScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScanResult> createScanAsync(CreateScanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateScanRequest, CreateScanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest request) {

        return createUploadUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUploadUrlRequest, CreateUploadUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest request) {

        return getAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountConfigurationRequest, GetAccountConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(GetMetricsSummaryRequest request) {

        return getMetricsSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(GetMetricsSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMetricsSummaryRequest, GetMetricsSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetScanResult> getScanAsync(GetScanRequest request) {

        return getScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScanResult> getScanAsync(GetScanRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScanRequest, GetScanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(ListFindingsMetricsRequest request) {

        return listFindingsMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(ListFindingsMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsMetricsRequest, ListFindingsMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListScansResult> listScansAsync(ListScansRequest request) {

        return listScansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScansResult> listScansAsync(ListScansRequest request,
            com.amazonaws.handlers.AsyncHandler<ListScansRequest, ListScansResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(UpdateAccountConfigurationRequest request) {

        return updateAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(UpdateAccountConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountConfigurationRequest, UpdateAccountConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
