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
package com.amazonaws.services.athena;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonAthena}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAthena implements AmazonAthena {

    protected AbstractAmazonAthena() {
    }

    @Override
    public BatchGetNamedQueryResult batchGetNamedQuery(BatchGetNamedQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetQueryExecutionResult batchGetQueryExecution(BatchGetQueryExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetNamedQueryResult getNamedQuery(GetNamedQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueryExecutionResult getQueryExecution(GetQueryExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetWorkGroupResult getWorkGroup(GetWorkGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListQueryExecutionsResult listQueryExecutions(ListQueryExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartQueryExecutionResult startQueryExecution(StartQueryExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopQueryExecutionResult stopQueryExecution(StopQueryExecutionRequest request) {
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
    public UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest request) {
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
