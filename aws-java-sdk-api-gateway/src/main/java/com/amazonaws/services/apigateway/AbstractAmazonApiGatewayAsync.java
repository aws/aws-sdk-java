/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.apigateway;

import com.amazonaws.services.apigateway.model.*;

/**
 * Abstract implementation of {@code AmazonApiGatewayAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonApiGatewayAsync extends AbstractAmazonApiGateway
        implements AmazonApiGatewayAsync {

    protected AbstractAmazonApiGatewayAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            CreateApiKeyRequest request) {

        return createApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            CreateApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            CreateBasePathMappingRequest request) {

        return createBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            CreateBasePathMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBasePathMappingRequest, CreateBasePathMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            CreateDomainNameRequest request) {

        return createDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            CreateDomainNameRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(
            CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(
            CreateModelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            CreateResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            CreateRestApiRequest request) {

        return createRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            CreateRestApiRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRestApiRequest, CreateRestApiResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(
            CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(
            CreateStageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApiKeyAsync(
            DeleteApiKeyRequest request) {

        return deleteApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApiKeyAsync(
            DeleteApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            DeleteBasePathMappingRequest request) {

        return deleteBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            DeleteBasePathMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBasePathMappingRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            DeleteClientCertificateRequest request) {

        return deleteClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            DeleteClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClientCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeploymentAsync(
            DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeploymentAsync(
            DeleteDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDomainNameAsync(
            DeleteDomainNameRequest request) {

        return deleteDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDomainNameAsync(
            DeleteDomainNameRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationAsync(
            DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationAsync(
            DeleteIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest request) {

        return deleteIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodAsync(
            DeleteMethodRequest request) {

        return deleteMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodAsync(
            DeleteMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            DeleteMethodResponseRequest request) {

        return deleteMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            DeleteMethodResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodResponseRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteModelAsync(
            DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteModelAsync(
            DeleteModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteResourceAsync(
            DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteResourceAsync(
            DeleteResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRestApiAsync(
            DeleteRestApiRequest request) {

        return deleteRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRestApiAsync(
            DeleteRestApiRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRestApiRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStageAsync(
            DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStageAsync(
            DeleteStageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> flushStageCacheAsync(
            FlushStageCacheRequest request) {

        return flushStageCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> flushStageCacheAsync(
            FlushStageCacheRequest request,
            com.amazonaws.handlers.AsyncHandler<FlushStageCacheRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest request) {

        return generateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateClientCertificateRequest, GenerateClientCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            GetAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            GetApiKeyRequest request) {

        return getApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            GetApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetApiKeyRequest, GetApiKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            GetApiKeysRequest request) {

        return getApiKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            GetApiKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<GetApiKeysRequest, GetApiKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            GetBasePathMappingRequest request) {

        return getBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            GetBasePathMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingRequest, GetBasePathMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            GetBasePathMappingsRequest request) {

        return getBasePathMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            GetBasePathMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingsRequest, GetBasePathMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            GetClientCertificateRequest request) {

        return getClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            GetClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificateRequest, GetClientCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            GetClientCertificatesRequest request) {

        return getClientCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            GetClientCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificatesRequest, GetClientCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            GetDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            GetDeploymentsRequest request) {

        return getDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            GetDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            GetDomainNameRequest request) {

        return getDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            GetDomainNameRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            GetDomainNamesRequest request) {

        return getDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            GetDomainNamesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            GetIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            GetIntegrationResponseRequest request) {

        return getIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            GetIntegrationResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            GetMethodRequest request) {

        return getMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            GetMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMethodRequest, GetMethodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            GetMethodResponseRequest request) {

        return getMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            GetMethodResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMethodResponseRequest, GetMethodResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(
            GetModelRequest request) {

        return getModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(
            GetModelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            GetModelTemplateRequest request) {

        return getModelTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            GetModelTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            GetModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            GetResourceRequest request) {

        return getResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            GetResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            GetResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            GetRestApiRequest request) {

        return getRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            GetRestApiRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRestApiRequest, GetRestApiResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            GetRestApisRequest request) {

        return getRestApisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            GetRestApisRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRestApisRequest, GetRestApisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            GetSdkRequest request) {

        return getSdkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            GetSdkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSdkRequest, GetSdkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(
            GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(
            GetStageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            GetStagesRequest request) {

        return getStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            GetStagesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            PutIntegrationRequest request) {

        return putIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            PutIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            PutIntegrationResponseRequest request) {

        return putIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            PutIntegrationResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationResponseRequest, PutIntegrationResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            PutMethodRequest request) {

        return putMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            PutMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMethodRequest, PutMethodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            PutMethodResponseRequest request) {

        return putMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            PutMethodResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMethodResponseRequest, PutMethodResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            TestInvokeMethodRequest request) {

        return testInvokeMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            TestInvokeMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<TestInvokeMethodRequest, TestInvokeMethodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            UpdateAccountRequest request) {

        return updateAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            UpdateAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            UpdateApiKeyRequest request) {

        return updateApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            UpdateApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            UpdateBasePathMappingRequest request) {

        return updateBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            UpdateBasePathMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBasePathMappingRequest, UpdateBasePathMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            UpdateClientCertificateRequest request) {

        return updateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            UpdateClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClientCertificateRequest, UpdateClientCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            UpdateDeploymentRequest request) {

        return updateDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            UpdateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            UpdateDomainNameRequest request) {

        return updateDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            UpdateDomainNameRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            UpdateIntegrationRequest request) {

        return updateIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            UpdateIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest request) {

        return updateIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            UpdateMethodRequest request) {

        return updateMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            UpdateMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodRequest, UpdateMethodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            UpdateMethodResponseRequest request) {

        return updateMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            UpdateMethodResponseRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodResponseRequest, UpdateMethodResponseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            UpdateModelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            UpdateResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            UpdateRestApiRequest request) {

        return updateRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            UpdateRestApiRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRestApiRequest, UpdateRestApiResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            UpdateStageRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
