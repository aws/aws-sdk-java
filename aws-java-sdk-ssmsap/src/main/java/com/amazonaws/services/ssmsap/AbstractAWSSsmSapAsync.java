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
package com.amazonaws.services.ssmsap;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;

/**
 * Abstract implementation of {@code AWSSsmSapAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSsmSapAsync extends AbstractAWSSsmSap implements AWSSsmSapAsync {

    protected AbstractAWSSsmSapAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(DeleteResourcePermissionRequest request) {

        return deleteResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(DeleteResourcePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePermissionRequest, DeleteResourcePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(DeregisterApplicationRequest request) {

        return deregisterApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(DeregisterApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterApplicationRequest, DeregisterApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request) {

        return getDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(GetResourcePermissionRequest request) {

        return getResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(GetResourcePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcePermissionRequest, GetResourcePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(PutResourcePermissionRequest request) {

        return putResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(PutResourcePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourcePermissionRequest, PutResourcePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(RegisterApplicationRequest request) {

        return registerApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(RegisterApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterApplicationRequest, RegisterApplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(UpdateApplicationSettingsRequest request) {

        return updateApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(UpdateApplicationSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
