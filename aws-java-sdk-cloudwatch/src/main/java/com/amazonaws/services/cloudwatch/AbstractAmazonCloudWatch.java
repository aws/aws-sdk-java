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
import com.amazonaws.*;
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

/**
 * Abstract implementation of {@code AmazonCloudWatch}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudWatch implements AmazonCloudWatch {

    protected AbstractAmazonCloudWatch() {
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
    public DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDashboardsResult deleteDashboards(DeleteDashboardsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory() {
        return describeAlarmHistory(new DescribeAlarmHistoryRequest());
    }

    @Override
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAlarmsResult describeAlarms() {
        return describeAlarms(new DescribeAlarmsRequest());
    }

    @Override
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDashboardResult getDashboard(GetDashboardRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMetricDataResult getMetricData(GetMetricDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMetricWidgetImageResult getMetricWidgetImage(GetMetricWidgetImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDashboardsResult listDashboards(ListDashboardsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMetricsResult listMetrics(ListMetricsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMetricsResult listMetrics() {
        return listMetrics(new ListMetricsRequest());
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDashboardResult putDashboard(PutDashboardRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMetricDataResult putMetricData(PutMetricDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetAlarmStateResult setAlarmState(SetAlarmStateRequest request) {
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
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonCloudWatchWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
