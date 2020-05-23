/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.*;
import com.amazonaws.services.lambda.waiters.AWSLambdaWaiters;

/**
 * Abstract implementation of {@code AWSLambda}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLambda implements AWSLambda {

    protected AbstractAWSLambda() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddLayerVersionPermissionResult addLayerVersionPermission(AddLayerVersionPermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateFunctionResult createFunction(CreateFunctionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFunctionResult deleteFunction(DeleteFunctionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFunctionEventInvokeConfigResult deleteFunctionEventInvokeConfig(DeleteFunctionEventInvokeConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLayerVersionResult deleteLayerVersion(DeleteLayerVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteProvisionedConcurrencyConfigResult deleteProvisionedConcurrencyConfig(DeleteProvisionedConcurrencyConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAliasResult getAlias(GetAliasRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetFunctionResult getFunction(GetFunctionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetFunctionConcurrencyResult getFunctionConcurrency(GetFunctionConcurrencyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetFunctionEventInvokeConfigResult getFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionResult getLayerVersion(GetLayerVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionByArnResult getLayerVersionByArn(GetLayerVersionByArnRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionPolicyResult getLayerVersionPolicy(GetLayerVersionPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetProvisionedConcurrencyConfigResult getProvisionedConcurrencyConfig(GetProvisionedConcurrencyConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InvokeResult invoke(InvokeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings() {
        return listEventSourceMappings(new ListEventSourceMappingsRequest());
    }

    @Override
    public ListFunctionEventInvokeConfigsResult listFunctionEventInvokeConfigs(ListFunctionEventInvokeConfigsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListFunctionsResult listFunctions(ListFunctionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListFunctionsResult listFunctions() {
        return listFunctions(new ListFunctionsRequest());
    }

    @Override
    public ListLayerVersionsResult listLayerVersions(ListLayerVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListLayersResult listLayers(ListLayersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListProvisionedConcurrencyConfigsResult listProvisionedConcurrencyConfigs(ListProvisionedConcurrencyConfigsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PublishLayerVersionResult publishLayerVersion(PublishLayerVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PublishVersionResult publishVersion(PublishVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutFunctionEventInvokeConfigResult putFunctionEventInvokeConfig(PutFunctionEventInvokeConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutProvisionedConcurrencyConfigResult putProvisionedConcurrencyConfig(PutProvisionedConcurrencyConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveLayerVersionPermissionResult removeLayerVersionPermission(RemoveLayerVersionPermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateFunctionEventInvokeConfigResult updateFunctionEventInvokeConfig(UpdateFunctionEventInvokeConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AWSLambdaWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
