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
package com.amazonaws.services.resourcegroups;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroups.model.*;

/**
 * Abstract implementation of {@code AWSResourceGroupsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSResourceGroupsAsync extends AbstractAWSResourceGroups implements AWSResourceGroupsAsync {

    protected AbstractAWSResourceGroupsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(GetGroupQueryRequest request) {

        return getGroupQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(GetGroupQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupQueryRequest, GetGroupQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest request) {

        return listGroupResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupResourcesRequest, ListGroupResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest request) {

        return searchResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchResourcesRequest, SearchResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResult> tagAsync(TagRequest request) {

        return tagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResult> tagAsync(TagRequest request, com.amazonaws.handlers.AsyncHandler<TagRequest, TagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResult> untagAsync(UntagRequest request) {

        return untagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResult> untagAsync(UntagRequest request, com.amazonaws.handlers.AsyncHandler<UntagRequest, UntagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(UpdateGroupQueryRequest request) {

        return updateGroupQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(UpdateGroupQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupQueryRequest, UpdateGroupQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
