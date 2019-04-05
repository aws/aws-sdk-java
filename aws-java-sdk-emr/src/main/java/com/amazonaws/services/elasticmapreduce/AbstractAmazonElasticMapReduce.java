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
import com.amazonaws.*;
import com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters;

/**
 * Abstract implementation of {@code AmazonElasticMapReduce}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticMapReduce implements AmazonElasticMapReduce {

    protected AbstractAmazonElasticMapReduce() {
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
    public AddInstanceFleetResult addInstanceFleet(AddInstanceFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelStepsResult cancelSteps(CancelStepsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSecurityConfigurationResult deleteSecurityConfiguration(DeleteSecurityConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows() {
        return describeJobFlows(new DescribeJobFlowsRequest());
    }

    @Override
    public DescribeSecurityConfigurationResult describeSecurityConfiguration(DescribeSecurityConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStepResult describeStep(DescribeStepRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBootstrapActionsResult listBootstrapActions(ListBootstrapActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters() {
        return listClusters(new ListClustersRequest());
    }

    @Override
    public ListInstanceFleetsResult listInstanceFleets(ListInstanceFleetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstanceGroupsResult listInstanceGroups(ListInstanceGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSecurityConfigurationsResult listSecurityConfigurations(ListSecurityConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStepsResult listSteps(ListStepsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceFleetResult modifyInstanceFleet(ModifyInstanceFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceGroupsResult modifyInstanceGroups(ModifyInstanceGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceGroupsResult modifyInstanceGroups() {
        return modifyInstanceGroups(new ModifyInstanceGroupsRequest());
    }

    @Override
    public PutAutoScalingPolicyResult putAutoScalingPolicy(PutAutoScalingPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveAutoScalingPolicyResult removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RunJobFlowResult runJobFlow(RunJobFlowRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetVisibleToAllUsersResult setVisibleToAllUsers(SetVisibleToAllUsersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateJobFlowsResult terminateJobFlows(TerminateJobFlowsRequest request) {
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

    @Override
    public AmazonElasticMapReduceWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
