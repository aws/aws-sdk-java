/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.scheduler;

import javax.annotation.Generated;

import com.amazonaws.services.scheduler.model.*;

/**
 * Abstract implementation of {@code AmazonSchedulerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSchedulerAsync extends AbstractAmazonScheduler implements AmazonSchedulerAsync {

    protected AbstractAmazonSchedulerAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest request) {

        return createScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateScheduleRequest, CreateScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(CreateScheduleGroupRequest request) {

        return createScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(CreateScheduleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateScheduleGroupRequest, CreateScheduleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest request) {

        return deleteScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(DeleteScheduleGroupRequest request) {

        return deleteScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(DeleteScheduleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleGroupRequest, DeleteScheduleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(GetScheduleRequest request) {

        return getScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(GetScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScheduleRequest, GetScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(GetScheduleGroupRequest request) {

        return getScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(GetScheduleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScheduleGroupRequest, GetScheduleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(ListScheduleGroupsRequest request) {

        return listScheduleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(ListScheduleGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListScheduleGroupsRequest, ListScheduleGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest request) {

        return listSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSchedulesRequest, ListSchedulesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest request) {

        return updateScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
