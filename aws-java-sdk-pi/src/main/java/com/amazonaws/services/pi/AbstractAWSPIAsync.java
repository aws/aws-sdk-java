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
package com.amazonaws.services.pi;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;

/**
 * Abstract implementation of {@code AWSPIAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSPIAsync extends AbstractAWSPI implements AWSPIAsync {

    protected AbstractAWSPIAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreatePerformanceAnalysisReportResult> createPerformanceAnalysisReportAsync(
            CreatePerformanceAnalysisReportRequest request) {

        return createPerformanceAnalysisReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePerformanceAnalysisReportResult> createPerformanceAnalysisReportAsync(
            CreatePerformanceAnalysisReportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePerformanceAnalysisReportRequest, CreatePerformanceAnalysisReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePerformanceAnalysisReportResult> deletePerformanceAnalysisReportAsync(
            DeletePerformanceAnalysisReportRequest request) {

        return deletePerformanceAnalysisReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePerformanceAnalysisReportResult> deletePerformanceAnalysisReportAsync(
            DeletePerformanceAnalysisReportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePerformanceAnalysisReportRequest, DeletePerformanceAnalysisReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest request) {

        return describeDimensionKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDimensionKeysRequest, DescribeDimensionKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDimensionKeyDetailsResult> getDimensionKeyDetailsAsync(GetDimensionKeyDetailsRequest request) {

        return getDimensionKeyDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDimensionKeyDetailsResult> getDimensionKeyDetailsAsync(GetDimensionKeyDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDimensionKeyDetailsRequest, GetDimensionKeyDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPerformanceAnalysisReportResult> getPerformanceAnalysisReportAsync(GetPerformanceAnalysisReportRequest request) {

        return getPerformanceAnalysisReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPerformanceAnalysisReportResult> getPerformanceAnalysisReportAsync(GetPerformanceAnalysisReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPerformanceAnalysisReportRequest, GetPerformanceAnalysisReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceMetadataResult> getResourceMetadataAsync(GetResourceMetadataRequest request) {

        return getResourceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceMetadataResult> getResourceMetadataAsync(GetResourceMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceMetadataRequest, GetResourceMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest request) {

        return getResourceMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceMetricsRequest, GetResourceMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAvailableResourceDimensionsResult> listAvailableResourceDimensionsAsync(
            ListAvailableResourceDimensionsRequest request) {

        return listAvailableResourceDimensionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableResourceDimensionsResult> listAvailableResourceDimensionsAsync(
            ListAvailableResourceDimensionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAvailableResourceDimensionsRequest, ListAvailableResourceDimensionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAvailableResourceMetricsResult> listAvailableResourceMetricsAsync(ListAvailableResourceMetricsRequest request) {

        return listAvailableResourceMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableResourceMetricsResult> listAvailableResourceMetricsAsync(ListAvailableResourceMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAvailableResourceMetricsRequest, ListAvailableResourceMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPerformanceAnalysisReportsResult> listPerformanceAnalysisReportsAsync(ListPerformanceAnalysisReportsRequest request) {

        return listPerformanceAnalysisReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPerformanceAnalysisReportsResult> listPerformanceAnalysisReportsAsync(ListPerformanceAnalysisReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPerformanceAnalysisReportsRequest, ListPerformanceAnalysisReportsResult> asyncHandler) {

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

}
