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
package com.amazonaws.services.opsworks;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSOpsWorks}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSOpsWorks implements AWSOpsWorks {

    protected AbstractAWSOpsWorks() {
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
    public void assignInstance(AssignInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void assignVolume(AssignVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void associateElasticIp(AssociateElasticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void attachElasticLoadBalancer(
            AttachElasticLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CloneStackResult cloneStack(CloneStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentResult createDeployment(
            CreateDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstanceResult createInstance(CreateInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLayerResult createLayer(CreateLayerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserProfileResult createUserProfile(
            CreateUserProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteApp(DeleteAppRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteInstance(DeleteInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteLayer(DeleteLayerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteStack(DeleteStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUserProfile(DeleteUserProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deregisterEcsCluster(DeregisterEcsClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deregisterElasticIp(DeregisterElasticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deregisterInstance(DeregisterInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deregisterVolume(DeregisterVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAgentVersionsResult describeAgentVersions(
            DescribeAgentVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAppsResult describeApps(DescribeAppsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCommandsResult describeCommands(
            DescribeCommandsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeploymentsResult describeDeployments(
            DescribeDeploymentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEcsClustersResult describeEcsClusters(
            DescribeEcsClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticIpsResult describeElasticIps(
            DescribeElasticIpsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(
            DescribeElasticLoadBalancersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstancesResult describeInstances(
            DescribeInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLayersResult describeLayers(DescribeLayersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(
            DescribeLoadBasedAutoScalingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMyUserProfileResult describeMyUserProfile(
            DescribeMyUserProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePermissionsResult describePermissions(
            DescribePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRaidArraysResult describeRaidArrays(
            DescribeRaidArraysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRdsDbInstancesResult describeRdsDbInstances(
            DescribeRdsDbInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServiceErrorsResult describeServiceErrors(
            DescribeServiceErrorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackProvisioningParametersResult describeStackProvisioningParameters(
            DescribeStackProvisioningParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackSummaryResult describeStackSummary(
            DescribeStackSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(
            DescribeTimeBasedAutoScalingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeUserProfilesResult describeUserProfiles(
            DescribeUserProfilesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void detachElasticLoadBalancer(
            DetachElasticLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void disassociateElasticIp(DisassociateElasticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetHostnameSuggestionResult getHostnameSuggestion(
            GetHostnameSuggestionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GrantAccessResult grantAccess(GrantAccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void rebootInstance(RebootInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterEcsClusterResult registerEcsCluster(
            RegisterEcsClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterElasticIpResult registerElasticIp(
            RegisterElasticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterInstanceResult registerInstance(
            RegisterInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void registerRdsDbInstance(RegisterRdsDbInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterVolumeResult registerVolume(RegisterVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setPermission(SetPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void startInstance(StartInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void startStack(StartStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void stopInstance(StopInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void stopStack(StopStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void unassignInstance(UnassignInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void unassignVolume(UnassignVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateApp(UpdateAppRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateElasticIp(UpdateElasticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateInstance(UpdateInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateLayer(UpdateLayerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateMyUserProfile(UpdateMyUserProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateRdsDbInstance(UpdateRdsDbInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateStack(UpdateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateUserProfile(UpdateUserProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateVolume(UpdateVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
