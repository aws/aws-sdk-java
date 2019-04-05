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
package com.amazonaws.services.elasticmapreduce;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Abstract implementation of {@code AmazonElasticMapReduceAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticMapReduceAsync extends AbstractAmazonElasticMapReduce implements AmazonElasticMapReduceAsync {

    protected AbstractAmazonElasticMapReduceAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(AddInstanceFleetRequest request) {

        return addInstanceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(AddInstanceFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<AddInstanceFleetRequest, AddInstanceFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest request) {

        return addInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest request) {

        return addJobFlowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(CancelStepsRequest request) {

        return cancelStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(CancelStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelStepsRequest, CancelStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(CreateSecurityConfigurationRequest request) {

        return createSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(CreateSecurityConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigurationRequest, CreateSecurityConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(DeleteSecurityConfigurationRequest request) {

        return deleteSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(DeleteSecurityConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigurationRequest, DeleteSecurityConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest request) {

        return describeJobFlowsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeJobFlows operation.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync() {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeJobFlows operation with an AsyncHandler.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(DescribeSecurityConfigurationRequest request) {

        return describeSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(DescribeSecurityConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityConfigurationRequest, DescribeSecurityConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(DescribeStepRequest request) {

        return describeStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(DescribeStepRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest request) {

        return listBootstrapActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync() {

        return listClustersAsync(new ListClustersRequest());
    }

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        return listClustersAsync(new ListClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(ListInstanceFleetsRequest request) {

        return listInstanceFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(ListInstanceFleetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstanceFleetsRequest, ListInstanceFleetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest request) {

        return listInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(ListSecurityConfigurationsRequest request) {

        return listSecurityConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(ListSecurityConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSecurityConfigurationsRequest, ListSecurityConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest request) {

        return listStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(ModifyInstanceFleetRequest request) {

        return modifyInstanceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(ModifyInstanceFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceFleetRequest, ModifyInstanceFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest request) {

        return modifyInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync() {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest());
    }

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation with an AsyncHandler.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler) {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(PutAutoScalingPolicyRequest request) {

        return putAutoScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(PutAutoScalingPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAutoScalingPolicyRequest, PutAutoScalingPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest request) {

        return removeAutoScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveAutoScalingPolicyRequest, RemoveAutoScalingPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest request) {

        return runJobFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest request) {

        return setTerminationProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTerminationProtectionRequest, SetTerminationProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest request) {

        return setVisibleToAllUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<SetVisibleToAllUsersRequest, SetVisibleToAllUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest request) {

        return terminateJobFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateJobFlowsRequest, TerminateJobFlowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
