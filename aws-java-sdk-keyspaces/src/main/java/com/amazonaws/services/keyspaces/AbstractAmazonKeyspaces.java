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
package com.amazonaws.services.keyspaces;

import javax.annotation.Generated;

import com.amazonaws.services.keyspaces.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonKeyspaces}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKeyspaces implements AmazonKeyspaces {

    protected AbstractAmazonKeyspaces() {
    }

    @Override
    public CreateKeyspaceResult createKeyspace(CreateKeyspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteKeyspaceResult deleteKeyspace(DeleteKeyspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetKeyspaceResult getKeyspace(GetKeyspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTableResult getTable(GetTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTableAutoScalingSettingsResult getTableAutoScalingSettings(GetTableAutoScalingSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeyspacesResult listKeyspaces(ListKeyspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreTableResult restoreTable(RestoreTableRequest request) {
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
    public UpdateTableResult updateTable(UpdateTableRequest request) {
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
