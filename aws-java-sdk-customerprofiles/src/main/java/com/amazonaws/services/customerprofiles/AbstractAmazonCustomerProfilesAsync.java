/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;

/**
 * Abstract implementation of {@code AmazonCustomerProfilesAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCustomerProfilesAsync extends AbstractAmazonCustomerProfiles implements AmazonCustomerProfilesAsync {

    protected AbstractAmazonCustomerProfilesAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(AddProfileKeyRequest request) {

        return addProfileKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(AddProfileKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<AddProfileKeyRequest, AddProfileKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(DeleteProfileKeyRequest request) {

        return deleteProfileKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(DeleteProfileKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileKeyRequest, DeleteProfileKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(DeleteProfileObjectRequest request) {

        return deleteProfileObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(DeleteProfileObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectRequest, DeleteProfileObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(DeleteProfileObjectTypeRequest request) {

        return deleteProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(DeleteProfileObjectTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectTypeRequest, DeleteProfileObjectTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(GetMatchesRequest request) {

        return getMatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(GetMatchesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMatchesRequest, GetMatchesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(GetProfileObjectTypeRequest request) {

        return getProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(GetProfileObjectTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeRequest, GetProfileObjectTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(GetProfileObjectTypeTemplateRequest request) {

        return getProfileObjectTypeTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(GetProfileObjectTypeTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeTemplateRequest, GetProfileObjectTypeTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(ListAccountIntegrationsRequest request) {

        return listAccountIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(ListAccountIntegrationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountIntegrationsRequest, ListAccountIntegrationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(ListIntegrationsRequest request) {

        return listIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(ListIntegrationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIntegrationsRequest, ListIntegrationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(ListProfileObjectTypeTemplatesRequest request) {

        return listProfileObjectTypeTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(ListProfileObjectTypeTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypeTemplatesRequest, ListProfileObjectTypeTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(ListProfileObjectTypesRequest request) {

        return listProfileObjectTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(ListProfileObjectTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypesRequest, ListProfileObjectTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(ListProfileObjectsRequest request) {

        return listProfileObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(ListProfileObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectsRequest, ListProfileObjectsResult> asyncHandler) {

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
    public java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(MergeProfilesRequest request) {

        return mergeProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(MergeProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeProfilesRequest, MergeProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest request) {

        return putIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(PutProfileObjectRequest request) {

        return putProfileObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(PutProfileObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<PutProfileObjectRequest, PutProfileObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(PutProfileObjectTypeRequest request) {

        return putProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(PutProfileObjectTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<PutProfileObjectTypeRequest, PutProfileObjectTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest request) {

        return searchProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchProfilesRequest, SearchProfilesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
