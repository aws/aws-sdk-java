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
package com.amazonaws.services.ivschat;

import javax.annotation.Generated;

import com.amazonaws.services.ivschat.model.*;

/**
 * Abstract implementation of {@code AmazonivschatAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonivschatAsync extends AbstractAmazonivschat implements AmazonivschatAsync {

    protected AbstractAmazonivschatAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest request) {

        return createChatTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChatTokenRequest, CreateChatTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request) {

        return createLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest request) {

        return createRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request) {

        return deleteMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest request) {

        return deleteRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest request) {

        return disconnectUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectUserRequest, DisconnectUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request) {

        return getLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest request) {

        return getRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request) {

        return listLoggingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest request) {

        return listRoomsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler) {

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
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request) {

        return sendEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request,
            com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest request) {

        return updateRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
