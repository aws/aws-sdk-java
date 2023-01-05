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
package com.amazonaws.services.appintegrations;

import javax.annotation.Generated;

import com.amazonaws.services.appintegrations.model.*;

/**
 * Abstract implementation of {@code AmazonAppIntegrationsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAppIntegrationsAsync extends AbstractAmazonAppIntegrations implements AmazonAppIntegrationsAsync {

    protected AbstractAmazonAppIntegrationsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(CreateDataIntegrationRequest request) {

        return createDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(CreateDataIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataIntegrationRequest, CreateDataIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(CreateEventIntegrationRequest request) {

        return createEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(CreateEventIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventIntegrationRequest, CreateEventIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(DeleteDataIntegrationRequest request) {

        return deleteDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(DeleteDataIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataIntegrationRequest, DeleteDataIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(DeleteEventIntegrationRequest request) {

        return deleteEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(DeleteEventIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventIntegrationRequest, DeleteEventIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(GetDataIntegrationRequest request) {

        return getDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(GetDataIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataIntegrationRequest, GetDataIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(GetEventIntegrationRequest request) {

        return getEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(GetEventIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventIntegrationRequest, GetEventIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            ListDataIntegrationAssociationsRequest request) {

        return listDataIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            ListDataIntegrationAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataIntegrationAssociationsRequest, ListDataIntegrationAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(ListDataIntegrationsRequest request) {

        return listDataIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(ListDataIntegrationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataIntegrationsRequest, ListDataIntegrationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            ListEventIntegrationAssociationsRequest request) {

        return listEventIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            ListEventIntegrationAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventIntegrationAssociationsRequest, ListEventIntegrationAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(ListEventIntegrationsRequest request) {

        return listEventIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(ListEventIntegrationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventIntegrationsRequest, ListEventIntegrationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(UpdateDataIntegrationRequest request) {

        return updateDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(UpdateDataIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataIntegrationRequest, UpdateDataIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(UpdateEventIntegrationRequest request) {

        return updateEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(UpdateEventIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEventIntegrationRequest, UpdateEventIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
