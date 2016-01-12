/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.logs;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSLogs}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSLogs implements AWSLogs {

    protected AbstractAWSLogs() {
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
    public void cancelExportTask(CancelExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateExportTaskResult createExportTask(
            CreateExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createLogGroup(CreateLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createLogStream(CreateLogStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteDestination(DeleteDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteLogGroup(DeleteLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteLogStream(DeleteLogStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteMetricFilter(DeleteMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteRetentionPolicy(DeleteRetentionPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteSubscriptionFilter(DeleteSubscriptionFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations(
            DescribeDestinationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations() {
        return describeDestinations(new DescribeDestinationsRequest());
    }

    @Override
    public DescribeExportTasksResult describeExportTasks(
            DescribeExportTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups(
            DescribeLogGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups() {
        return describeLogGroups(new DescribeLogGroupsRequest());
    }

    @Override
    public DescribeLogStreamsResult describeLogStreams(
            DescribeLogStreamsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMetricFiltersResult describeMetricFilters(
            DescribeMetricFiltersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(
            DescribeSubscriptionFiltersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public FilterLogEventsResult filterLogEvents(FilterLogEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLogEventsResult getLogEvents(GetLogEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDestinationResult putDestination(PutDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putDestinationPolicy(PutDestinationPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLogEventsResult putLogEvents(PutLogEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putMetricFilter(PutMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putRetentionPolicy(PutRetentionPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putSubscriptionFilter(PutSubscriptionFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestMetricFilterResult testMetricFilter(
            TestMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
