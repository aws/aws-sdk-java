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
package com.amazonaws.services.iotdeviceadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;

/**
 * Abstract implementation of {@code AWSIoTDeviceAdvisorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoTDeviceAdvisorAsync extends AbstractAWSIoTDeviceAdvisor implements AWSIoTDeviceAdvisorAsync {

    protected AbstractAWSIoTDeviceAdvisorAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(CreateSuiteDefinitionRequest request) {

        return createSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(CreateSuiteDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSuiteDefinitionRequest, CreateSuiteDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(DeleteSuiteDefinitionRequest request) {

        return deleteSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(DeleteSuiteDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSuiteDefinitionRequest, DeleteSuiteDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(GetSuiteDefinitionRequest request) {

        return getSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(GetSuiteDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSuiteDefinitionRequest, GetSuiteDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(GetSuiteRunRequest request) {

        return getSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(GetSuiteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRunRequest, GetSuiteRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(GetSuiteRunReportRequest request) {

        return getSuiteRunReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(GetSuiteRunReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRunReportRequest, GetSuiteRunReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(ListSuiteDefinitionsRequest request) {

        return listSuiteDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(ListSuiteDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSuiteDefinitionsRequest, ListSuiteDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(ListSuiteRunsRequest request) {

        return listSuiteRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(ListSuiteRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSuiteRunsRequest, ListSuiteRunsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(StartSuiteRunRequest request) {

        return startSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(StartSuiteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSuiteRunRequest, StartSuiteRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(StopSuiteRunRequest request) {

        return stopSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(StopSuiteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StopSuiteRunRequest, StopSuiteRunResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(UpdateSuiteDefinitionRequest request) {

        return updateSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(UpdateSuiteDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSuiteDefinitionRequest, UpdateSuiteDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
