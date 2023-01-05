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
package com.amazonaws.services.emrserverless;

import javax.annotation.Generated;

import com.amazonaws.services.emrserverless.model.*;

/**
 * Abstract implementation of {@code AWSEMRServerlessAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSEMRServerlessAsync extends AbstractAWSEMRServerless implements AWSEMRServerlessAsync {

    protected AbstractAWSEMRServerlessAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request) {

        return cancelJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(GetDashboardForJobRunRequest request) {

        return getDashboardForJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(GetDashboardForJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDashboardForJobRunRequest, GetDashboardForJobRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest request) {

        return getJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobRunRequest, GetJobRunResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request) {

        return listJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest request) {

        return startApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest request) {

        return stopApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
