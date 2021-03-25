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
package com.amazonaws.services.lookoutmetrics;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;

/**
 * Abstract implementation of {@code AmazonLookoutMetricsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonLookoutMetricsAsync extends AbstractAmazonLookoutMetrics implements AmazonLookoutMetricsAsync {

    protected AbstractAmazonLookoutMetricsAsync() {
    }

    @Override
    public java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(ActivateAnomalyDetectorRequest request) {

        return activateAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(ActivateAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<ActivateAnomalyDetectorRequest, ActivateAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(BackTestAnomalyDetectorRequest request) {

        return backTestAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(BackTestAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<BackTestAnomalyDetectorRequest, BackTestAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAlertResult> createAlertAsync(CreateAlertRequest request) {

        return createAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertResult> createAlertAsync(CreateAlertRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAlertRequest, CreateAlertResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(CreateAnomalyDetectorRequest request) {

        return createAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(CreateAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalyDetectorRequest, CreateAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(CreateMetricSetRequest request) {

        return createMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(CreateMetricSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMetricSetRequest, CreateMetricSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(DeleteAlertRequest request) {

        return deleteAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(DeleteAlertRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAlertRequest, DeleteAlertResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest request) {

        return deleteAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalyDetectorRequest, DeleteAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(DescribeAlertRequest request) {

        return describeAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(DescribeAlertRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlertRequest, DescribeAlertResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            DescribeAnomalyDetectionExecutionsRequest request) {

        return describeAnomalyDetectionExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            DescribeAnomalyDetectionExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectionExecutionsRequest, DescribeAnomalyDetectionExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(DescribeAnomalyDetectorRequest request) {

        return describeAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(DescribeAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectorRequest, DescribeAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(DescribeMetricSetRequest request) {

        return describeMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(DescribeMetricSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricSetRequest, DescribeMetricSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(GetAnomalyGroupRequest request) {

        return getAnomalyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(GetAnomalyGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnomalyGroupRequest, GetAnomalyGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(GetFeedbackRequest request) {

        return getFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(GetFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFeedbackRequest, GetFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(GetSampleDataRequest request) {

        return getSampleDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(GetSampleDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSampleDataRequest, GetSampleDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest request) {

        return listAlertsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAlertsRequest, ListAlertsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(ListAnomalyDetectorsRequest request) {

        return listAnomalyDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(ListAnomalyDetectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyDetectorsRequest, ListAnomalyDetectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(ListAnomalyGroupSummariesRequest request) {

        return listAnomalyGroupSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(ListAnomalyGroupSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupSummariesRequest, ListAnomalyGroupSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(ListAnomalyGroupTimeSeriesRequest request) {

        return listAnomalyGroupTimeSeriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(ListAnomalyGroupTimeSeriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupTimeSeriesRequest, ListAnomalyGroupTimeSeriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(ListMetricSetsRequest request) {

        return listMetricSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(ListMetricSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMetricSetsRequest, ListMetricSetsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request) {

        return putFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(UpdateAnomalyDetectorRequest request) {

        return updateAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(UpdateAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalyDetectorRequest, UpdateAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(UpdateMetricSetRequest request) {

        return updateMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(UpdateMetricSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMetricSetRequest, UpdateMetricSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
