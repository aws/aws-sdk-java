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
package com.amazonaws.services.licensemanager;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;

/**
 * Abstract implementation of {@code AWSLicenseManagerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLicenseManagerAsync extends AbstractAWSLicenseManager implements AWSLicenseManagerAsync {

    protected AbstractAWSLicenseManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(CreateLicenseConfigurationRequest request) {

        return createLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(CreateLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseConfigurationRequest, CreateLicenseConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(DeleteLicenseConfigurationRequest request) {

        return deleteLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(DeleteLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLicenseConfigurationRequest, DeleteLicenseConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest request) {

        return getLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLicenseConfigurationRequest, GetLicenseConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest request) {

        return getServiceSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceSettingsRequest, GetServiceSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest request) {

        return listAssociationsForLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsForLicenseConfigurationRequest, ListAssociationsForLicenseConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(ListLicenseConfigurationsRequest request) {

        return listLicenseConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(ListLicenseConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLicenseConfigurationsRequest, ListLicenseConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest request) {

        return listLicenseSpecificationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLicenseSpecificationsForResourceRequest, ListLicenseSpecificationsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest request) {

        return listResourceInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourceInventoryRequest, ListResourceInventoryResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest request) {

        return listUsageForLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUsageForLicenseConfigurationRequest, ListUsageForLicenseConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(UpdateLicenseConfigurationRequest request) {

        return updateLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(UpdateLicenseConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseConfigurationRequest, UpdateLicenseConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest request) {

        return updateLicenseSpecificationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseSpecificationsForResourceRequest, UpdateLicenseSpecificationsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest request) {

        return updateServiceSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingsRequest, UpdateServiceSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
