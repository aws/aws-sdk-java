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
package com.amazonaws.services.opsworks;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.*;
import com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters;

/**
 * Abstract implementation of {@code AWSOpsWorks}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOpsWorks implements AWSOpsWorks {

    protected AbstractAWSOpsWorks() {
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
    public AssignInstanceResult assignInstance(AssignInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssignVolumeResult assignVolume(AssignVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssociateElasticIpResult associateElasticIp(AssociateElasticIpRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AttachElasticLoadBalancerResult attachElasticLoadBalancer(AttachElasticLoadBalancerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CloneStackResult cloneStack(CloneStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateInstanceResult createInstance(CreateInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLayerResult createLayer(CreateLayerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLayerResult deleteLayer(DeleteLayerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterEcsClusterResult deregisterEcsCluster(DeregisterEcsClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterElasticIpResult deregisterElasticIp(DeregisterElasticIpRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterRdsDbInstanceResult deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterVolumeResult deregisterVolume(DeregisterVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAgentVersionsResult describeAgentVersions(DescribeAgentVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAppsResult describeApps(DescribeAppsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeEcsClustersResult describeEcsClusters(DescribeEcsClustersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(DescribeElasticLoadBalancersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLayersResult describeLayers(DescribeLayersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeMyUserProfileResult describeMyUserProfile(DescribeMyUserProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOperatingSystemsResult describeOperatingSystems(DescribeOperatingSystemsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRdsDbInstancesResult describeRdsDbInstances(DescribeRdsDbInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackProvisioningParametersResult describeStackProvisioningParameters(DescribeStackProvisioningParametersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackSummaryResult describeStackSummary(DescribeStackSummaryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DetachElasticLoadBalancerResult detachElasticLoadBalancer(DetachElasticLoadBalancerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateElasticIpResult disassociateElasticIp(DisassociateElasticIpRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GrantAccessResult grantAccess(GrantAccessRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RebootInstanceResult rebootInstance(RebootInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterEcsClusterResult registerEcsCluster(RegisterEcsClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterElasticIpResult registerElasticIp(RegisterElasticIpRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterRdsDbInstanceResult registerRdsDbInstance(RegisterRdsDbInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterVolumeResult registerVolume(RegisterVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetLoadBasedAutoScalingResult setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetPermissionResult setPermission(SetPermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetTimeBasedAutoScalingResult setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartInstanceResult startInstance(StartInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartStackResult startStack(StartStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopInstanceResult stopInstance(StopInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopStackResult stopStack(StopStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UnassignInstanceResult unassignInstance(UnassignInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UnassignVolumeResult unassignVolume(UnassignVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateAppResult updateApp(UpdateAppRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateElasticIpResult updateElasticIp(UpdateElasticIpRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateInstanceResult updateInstance(UpdateInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateLayerResult updateLayer(UpdateLayerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateMyUserProfileResult updateMyUserProfile(UpdateMyUserProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateRdsDbInstanceResult updateRdsDbInstance(UpdateRdsDbInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateVolumeResult updateVolume(UpdateVolumeRequest request) {
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
    public AWSOpsWorksWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
