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
package com.amazonaws.services.launchwizard;

import javax.annotation.Generated;

import com.amazonaws.services.launchwizard.model.*;

/**
 * Abstract implementation of {@code AWSLaunchWizardAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLaunchWizardAsync extends AbstractAWSLaunchWizard implements AWSLaunchWizardAsync {

    protected AbstractAWSLaunchWizardAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest request) {

        return getWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(ListDeploymentEventsRequest request) {

        return listDeploymentEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(ListDeploymentEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentEventsRequest, ListDeploymentEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(ListWorkloadDeploymentPatternsRequest request) {

        return listWorkloadDeploymentPatternsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(ListWorkloadDeploymentPatternsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadDeploymentPatternsRequest, ListWorkloadDeploymentPatternsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest request) {

        return listWorkloadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
