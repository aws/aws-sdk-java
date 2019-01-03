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
package com.amazonaws.services.codedeploy;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;

/**
 * Abstract implementation of {@code AmazonCodeDeployAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeDeployAsync extends AbstractAmazonCodeDeploy implements AmazonCodeDeployAsync {

    protected AbstractAmazonCodeDeployAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(AddTagsToOnPremisesInstancesRequest request) {

        return addTagsToOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(AddTagsToOnPremisesInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToOnPremisesInstancesRequest, AddTagsToOnPremisesInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(BatchGetApplicationRevisionsRequest request) {

        return batchGetApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(BatchGetApplicationRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationRevisionsRequest, BatchGetApplicationRevisionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest request) {

        return batchGetApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync() {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation with an AsyncHandler.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest request) {

        return batchGetDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentGroupsRequest, BatchGetDeploymentGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(BatchGetDeploymentInstancesRequest request) {

        return batchGetDeploymentInstancesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(BatchGetDeploymentInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentInstancesRequest, BatchGetDeploymentInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(BatchGetDeploymentTargetsRequest request) {

        return batchGetDeploymentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(BatchGetDeploymentTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentTargetsRequest, BatchGetDeploymentTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest request) {

        return batchGetDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync() {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation with an AsyncHandler.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest request) {

        return batchGetOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync() {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(ContinueDeploymentRequest request) {

        return continueDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(ContinueDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<ContinueDeploymentRequest, ContinueDeploymentResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest request) {

        return createDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest request) {

        return createDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest request) {

        return deleteDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentConfigRequest, DeleteDeploymentConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest request) {

        return deleteDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(DeleteGitHubAccountTokenRequest request) {

        return deleteGitHubAccountTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(DeleteGitHubAccountTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGitHubAccountTokenRequest, DeleteGitHubAccountTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(DeregisterOnPremisesInstanceRequest request) {

        return deregisterOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(DeregisterOnPremisesInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterOnPremisesInstanceRequest, DeregisterOnPremisesInstanceResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest request) {

        return getApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest request) {

        return getDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest request) {

        return getDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest request) {

        return getDeploymentInstanceAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(GetDeploymentTargetRequest request) {

        return getDeploymentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(GetDeploymentTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentTargetRequest, GetDeploymentTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest request) {

        return getOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOnPremisesInstanceRequest, GetOnPremisesInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest request) {

        return listApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListApplications operation.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync() {

        return listApplicationsAsync(new ListApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListApplications operation with an AsyncHandler.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return listApplicationsAsync(new ListApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest request) {

        return listDeploymentConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync() {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation with an AsyncHandler.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest request) {

        return listDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest request) {

        return listDeploymentInstancesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(ListDeploymentTargetsRequest request) {

        return listDeploymentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(ListDeploymentTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentTargetsRequest, ListDeploymentTargetsResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListDeployments operation.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync() {

        return listDeploymentsAsync(new ListDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeployments operation with an AsyncHandler.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return listDeploymentsAsync(new ListDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(ListGitHubAccountTokenNamesRequest request) {

        return listGitHubAccountTokenNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(ListGitHubAccountTokenNamesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGitHubAccountTokenNamesRequest, ListGitHubAccountTokenNamesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest request) {

        return listOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync() {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            PutLifecycleEventHookExecutionStatusRequest request) {

        return putLifecycleEventHookExecutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            PutLifecycleEventHookExecutionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleEventHookExecutionStatusRequest, PutLifecycleEventHookExecutionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest request) {

        return registerApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, RegisterApplicationRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(RegisterOnPremisesInstanceRequest request) {

        return registerOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(RegisterOnPremisesInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterOnPremisesInstanceRequest, RegisterOnPremisesInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest request) {

        return removeTagsFromOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, RemoveTagsFromOnPremisesInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest request) {

        return skipWaitTimeForInstanceTerminationAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest request,
            com.amazonaws.handlers.AsyncHandler<SkipWaitTimeForInstanceTerminationRequest, SkipWaitTimeForInstanceTerminationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest request) {

        return stopDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the UpdateApplication operation.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync() {

        return updateApplicationAsync(new UpdateApplicationRequest());
    }

    /**
     * Simplified method form for invoking the UpdateApplication operation with an AsyncHandler.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return updateApplicationAsync(new UpdateApplicationRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest request) {

        return updateDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
