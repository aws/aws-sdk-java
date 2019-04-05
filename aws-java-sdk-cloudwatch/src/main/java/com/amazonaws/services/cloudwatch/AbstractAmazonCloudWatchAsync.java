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
package com.amazonaws.services.cloudwatch;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Abstract implementation of {@code AmazonCloudWatchAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudWatchAsync extends AbstractAmazonCloudWatch implements AmazonCloudWatchAsync {

    protected AbstractAmazonCloudWatchAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest request) {

        return deleteAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmsRequest, DeleteAlarmsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest request) {

        return deleteDashboardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDashboardsRequest, DeleteDashboardsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest request) {

        return describeAlarmHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync() {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation with an AsyncHandler.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest request) {

        return describeAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync() {

        return describeAlarmsAsync(new DescribeAlarmsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarms operation with an AsyncHandler.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        return describeAlarmsAsync(new DescribeAlarmsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest request) {

        return describeAlarmsForMetricAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest request) {

        return disableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableAlarmActionsRequest, DisableAlarmActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest request) {

        return enableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableAlarmActionsRequest, EnableAlarmActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest request) {

        return getDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDashboardRequest, GetDashboardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest request) {

        return getMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest request) {

        return getMetricStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest request) {

        return getMetricWidgetImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMetricWidgetImageRequest, GetMetricWidgetImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest request) {

        return listDashboardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest request) {

        return listMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetricsAsync(ListMetricsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync() {

        return listMetricsAsync(new ListMetricsRequest());
    }

    /**
     * Simplified method form for invoking the ListMetrics operation with an AsyncHandler.
     *
     * @see #listMetricsAsync(ListMetricsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        return listMetricsAsync(new ListMetricsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest request) {

        return putDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDashboardRequest, PutDashboardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest request) {

        return putMetricAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetricAlarmRequest, PutMetricAlarmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest request) {

        return putMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetricDataRequest, PutMetricDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest request) {

        return setAlarmStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest request,
            com.amazonaws.handlers.AsyncHandler<SetAlarmStateRequest, SetAlarmStateResult> asyncHandler) {

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
