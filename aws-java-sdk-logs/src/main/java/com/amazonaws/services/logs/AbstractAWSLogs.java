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
package com.amazonaws.services.logs;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSLogs}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
    public AssociateKmsKeyResult associateKmsKey(AssociateKmsKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateExportTaskResult createExportTask(CreateExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLogGroupResult createLogGroup(CreateLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLogStreamResult createLogStream(CreateLogStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDestinationResult deleteDestination(DeleteDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations() {
        return describeDestinations(new DescribeDestinationsRequest());
    }

    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups() {
        return describeLogGroups(new DescribeLogGroupsRequest());
    }

    @Override
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeQueriesResult describeQueries(DescribeQueriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeResourcePoliciesResult describeResourcePolicies(DescribeResourcePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateKmsKeyResult disassociateKmsKey(DisassociateKmsKeyRequest request) {
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
    public GetLogGroupFieldsResult getLogGroupFields(GetLogGroupFieldsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLogRecordResult getLogRecord(GetLogRecordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsLogGroupResult listTagsLogGroup(ListTagsLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDestinationResult putDestination(PutDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLogEventsResult putLogEvents(PutLogEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMetricFilterResult putMetricFilter(PutMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopQueryResult stopQuery(StopQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagLogGroupResult tagLogGroup(TagLogGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagLogGroupResult untagLogGroup(UntagLogGroupRequest request) {
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
