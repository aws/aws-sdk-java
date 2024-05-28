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
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonTimestreamQuery}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTimestreamQuery implements AmazonTimestreamQuery {

    protected AbstractAmazonTimestreamQuery() {
    }

    @Override
    public CancelQueryResult cancelQuery(CancelQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateScheduledQueryResult createScheduledQuery(CreateScheduledQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteScheduledQueryResult deleteScheduledQuery(DeleteScheduledQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountSettingsResult describeAccountSettings(DescribeAccountSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScheduledQueryResult describeScheduledQuery(DescribeScheduledQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExecuteScheduledQueryResult executeScheduledQuery(ExecuteScheduledQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListScheduledQueriesResult listScheduledQueries(ListScheduledQueriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PrepareQueryResult prepareQuery(PrepareQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public QueryResult query(QueryRequest request) {
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
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateScheduledQueryResult updateScheduledQuery(UpdateScheduledQueryRequest request) {
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
