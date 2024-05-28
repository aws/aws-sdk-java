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
package com.amazonaws.services.verifiedpermissions;

import javax.annotation.Generated;

import com.amazonaws.services.verifiedpermissions.model.*;

/**
 * Abstract implementation of {@code AmazonVerifiedPermissionsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonVerifiedPermissionsAsync extends AbstractAmazonVerifiedPermissions implements AmazonVerifiedPermissionsAsync {

    protected AbstractAmazonVerifiedPermissionsAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(BatchIsAuthorizedRequest request) {

        return batchIsAuthorizedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(BatchIsAuthorizedRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedRequest, BatchIsAuthorizedResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(BatchIsAuthorizedWithTokenRequest request) {

        return batchIsAuthorizedWithTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(BatchIsAuthorizedWithTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedWithTokenRequest, BatchIsAuthorizedWithTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(CreateIdentitySourceRequest request) {

        return createIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(CreateIdentitySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateIdentitySourceRequest, CreateIdentitySourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(CreatePolicyStoreRequest request) {

        return createPolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(CreatePolicyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyStoreRequest, CreatePolicyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(CreatePolicyTemplateRequest request) {

        return createPolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(CreatePolicyTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyTemplateRequest, CreatePolicyTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(DeleteIdentitySourceRequest request) {

        return deleteIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(DeleteIdentitySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentitySourceRequest, DeleteIdentitySourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(DeletePolicyStoreRequest request) {

        return deletePolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(DeletePolicyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyStoreRequest, DeletePolicyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(DeletePolicyTemplateRequest request) {

        return deletePolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(DeletePolicyTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyTemplateRequest, DeletePolicyTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(GetIdentitySourceRequest request) {

        return getIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(GetIdentitySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentitySourceRequest, GetIdentitySourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(GetPolicyStoreRequest request) {

        return getPolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(GetPolicyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyStoreRequest, GetPolicyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(GetPolicyTemplateRequest request) {

        return getPolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(GetPolicyTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyTemplateRequest, GetPolicyTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest request) {

        return getSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(IsAuthorizedRequest request) {

        return isAuthorizedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(IsAuthorizedRequest request,
            com.amazonaws.handlers.AsyncHandler<IsAuthorizedRequest, IsAuthorizedResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(IsAuthorizedWithTokenRequest request) {

        return isAuthorizedWithTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(IsAuthorizedWithTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<IsAuthorizedWithTokenRequest, IsAuthorizedWithTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(ListIdentitySourcesRequest request) {

        return listIdentitySourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(ListIdentitySourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdentitySourcesRequest, ListIdentitySourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(ListPolicyStoresRequest request) {

        return listPolicyStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(ListPolicyStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPolicyStoresRequest, ListPolicyStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(ListPolicyTemplatesRequest request) {

        return listPolicyTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(ListPolicyTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPolicyTemplatesRequest, ListPolicyTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(PutSchemaRequest request) {

        return putSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(PutSchemaRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSchemaRequest, PutSchemaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(UpdateIdentitySourceRequest request) {

        return updateIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(UpdateIdentitySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentitySourceRequest, UpdateIdentitySourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest request) {

        return updatePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(UpdatePolicyStoreRequest request) {

        return updatePolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(UpdatePolicyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyStoreRequest, UpdatePolicyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(UpdatePolicyTemplateRequest request) {

        return updatePolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(UpdatePolicyTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
