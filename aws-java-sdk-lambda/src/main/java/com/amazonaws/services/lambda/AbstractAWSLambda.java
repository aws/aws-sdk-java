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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.*;

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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddLayerVersionPermissionResult addLayerVersionPermission(AddLayerVersionPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFunctionResult createFunction(CreateFunctionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFunctionResult deleteFunction(DeleteFunctionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLayerVersionResult deleteLayerVersion(DeleteLayerVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAliasResult getAlias(GetAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetFunctionResult getFunction(GetFunctionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionResult getLayerVersion(GetLayerVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionByArnResult getLayerVersionByArn(GetLayerVersionByArnRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLayerVersionPolicyResult getLayerVersionPolicy(GetLayerVersionPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InvokeResult invoke(InvokeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings() {
        return listEventSourceMappings(new ListEventSourceMappingsRequest());
    }

    @Override
    public ListFunctionsResult listFunctions(ListFunctionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFunctionsResult listFunctions() {
        return listFunctions(new ListFunctionsRequest());
    }

    @Override
    public ListLayerVersionsResult listLayerVersions(ListLayerVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLayersResult listLayers(ListLayersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PublishLayerVersionResult publishLayerVersion(PublishLayerVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PublishVersionResult publishVersion(PublishVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveLayerVersionPermissionResult removeLayerVersionPermission(RemoveLayerVersionPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
