/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssociateKmsKeyResult associateKmsKey(AssociateKmsKeyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateExportTaskResult createExportTask(CreateExportTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLogGroupResult createLogGroup(CreateLogGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLogStreamResult createLogStream(CreateLogStreamRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDestinationResult deleteDestination(DeleteDestinationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteQueryDefinitionResult deleteQueryDefinition(DeleteQueryDefinitionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDestinationsResult describeDestinations() {
        return describeDestinations(new DescribeDestinationsRequest());
    }

    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups() {
        return describeLogGroups(new DescribeLogGroupsRequest());
    }

    @Override
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeQueriesResult describeQueries(DescribeQueriesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeQueryDefinitionsResult describeQueryDefinitions(DescribeQueryDefinitionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeResourcePoliciesResult describeResourcePolicies(DescribeResourcePoliciesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateKmsKeyResult disassociateKmsKey(DisassociateKmsKeyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public FilterLogEventsResult filterLogEvents(FilterLogEventsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLogEventsResult getLogEvents(GetLogEventsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLogGroupFieldsResult getLogGroupFields(GetLogGroupFieldsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLogRecordResult getLogRecord(GetLogRecordRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsLogGroupResult listTagsLogGroup(ListTagsLogGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutDestinationResult putDestination(PutDestinationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutLogEventsResult putLogEvents(PutLogEventsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutMetricFilterResult putMetricFilter(PutMetricFilterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutQueryDefinitionResult putQueryDefinition(PutQueryDefinitionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopQueryResult stopQuery(StopQueryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagLogGroupResult tagLogGroup(TagLogGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagLogGroupResult untagLogGroup(UntagLogGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
