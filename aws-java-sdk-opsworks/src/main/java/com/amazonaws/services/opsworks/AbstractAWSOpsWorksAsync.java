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

/**
 * Abstract implementation of {@code AWSOpsWorksAsync}. Convenient method forms
 * pass through to the corresponding overload that takes a request object and an
 * {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSOpsWorksAsync extends AbstractAWSOpsWorks implements
        AWSOpsWorksAsync {

    protected AbstractAWSOpsWorksAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> assignInstanceAsync(
            AssignInstanceRequest request) {

        return assignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> assignInstanceAsync(
            AssignInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<AssignInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> assignVolumeAsync(
            AssignVolumeRequest request) {

        return assignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> assignVolumeAsync(
            AssignVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<AssignVolumeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> associateElasticIpAsync(
            AssociateElasticIpRequest request) {

        return associateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> associateElasticIpAsync(
            AssociateElasticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateElasticIpRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest request) {

        return attachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachElasticLoadBalancerRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            CloneStackRequest request) {

        return cloneStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            CloneStackRequest request,
            com.amazonaws.handlers.AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(
            CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(
            CreateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            CreateInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            CreateLayerRequest request) {

        return createLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            CreateLayerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            CreateUserProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAppAsync(
            DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAppAsync(
            DeleteAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteInstanceAsync(
            DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteInstanceAsync(
            DeleteInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLayerAsync(
            DeleteLayerRequest request) {

        return deleteLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLayerAsync(
            DeleteLayerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserProfileAsync(
            DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserProfileAsync(
            DeleteUserProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            DeregisterEcsClusterRequest request) {

        return deregisterEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            DeregisterEcsClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterEcsClusterRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            DeregisterElasticIpRequest request) {

        return deregisterElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            DeregisterElasticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterElasticIpRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterInstanceAsync(
            DeregisterInstanceRequest request) {

        return deregisterInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterInstanceAsync(
            DeregisterInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            DeregisterRdsDbInstanceRequest request) {

        return deregisterRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            DeregisterRdsDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterRdsDbInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterVolumeAsync(
            DeregisterVolumeRequest request) {

        return deregisterVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterVolumeAsync(
            DeregisterVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterVolumeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            DescribeAgentVersionsRequest request) {

        return describeAgentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            DescribeAgentVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            DescribeAppsRequest request) {

        return describeAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            DescribeAppsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            DescribeCommandsRequest request) {

        return describeCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            DescribeCommandsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            DescribeDeploymentsRequest request) {

        return describeDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            DescribeDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            DescribeEcsClustersRequest request) {

        return describeEcsClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            DescribeEcsClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEcsClustersRequest, DescribeEcsClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            DescribeElasticIpsRequest request) {

        return describeElasticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            DescribeElasticIpsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest request) {

        return describeElasticLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            DescribeInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            DescribeLayersRequest request) {

        return describeLayersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            DescribeLayersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest request) {

        return describeLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            DescribeMyUserProfileRequest request) {

        return describeMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            DescribeMyUserProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            DescribePermissionsRequest request) {

        return describePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            DescribePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            DescribeRaidArraysRequest request) {

        return describeRaidArraysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            DescribeRaidArraysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            DescribeRdsDbInstancesRequest request) {

        return describeRdsDbInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            DescribeRdsDbInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            DescribeServiceErrorsRequest request) {

        return describeServiceErrorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            DescribeServiceErrorsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest request) {

        return describeStackProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            DescribeStackSummaryRequest request) {

        return describeStackSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            DescribeStackSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest request) {

        return describeTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            DescribeUserProfilesRequest request) {

        return describeUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            DescribeUserProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            DescribeVolumesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest request) {

        return detachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachElasticLoadBalancerRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            DisassociateElasticIpRequest request) {

        return disassociateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            DisassociateElasticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateElasticIpRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            GetHostnameSuggestionRequest request) {

        return getHostnameSuggestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            GetHostnameSuggestionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            GrantAccessRequest request) {

        return grantAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            GrantAccessRequest request,
            com.amazonaws.handlers.AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> rebootInstanceAsync(
            RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> rebootInstanceAsync(
            RebootInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            RegisterEcsClusterRequest request) {

        return registerEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            RegisterEcsClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterEcsClusterRequest, RegisterEcsClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            RegisterElasticIpRequest request) {

        return registerElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            RegisterElasticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            RegisterInstanceRequest request) {

        return registerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            RegisterInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            RegisterRdsDbInstanceRequest request) {

        return registerRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            RegisterRdsDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterRdsDbInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            RegisterVolumeRequest request) {

        return registerVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            RegisterVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            SetLoadBasedAutoScalingRequest request) {

        return setLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            SetLoadBasedAutoScalingRequest request,
            com.amazonaws.handlers.AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setPermissionAsync(
            SetPermissionRequest request) {

        return setPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setPermissionAsync(
            SetPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetPermissionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            SetTimeBasedAutoScalingRequest request) {

        return setTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            SetTimeBasedAutoScalingRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> startInstanceAsync(
            StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startInstanceAsync(
            StartInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> startStackAsync(
            StartStackRequest request) {

        return startStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startStackAsync(
            StartStackRequest request,
            com.amazonaws.handlers.AsyncHandler<StartStackRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> stopInstanceAsync(
            StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopInstanceAsync(
            StopInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> stopStackAsync(
            StopStackRequest request) {

        return stopStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopStackAsync(
            StopStackRequest request,
            com.amazonaws.handlers.AsyncHandler<StopStackRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> unassignInstanceAsync(
            UnassignInstanceRequest request) {

        return unassignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unassignInstanceAsync(
            UnassignInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UnassignInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> unassignVolumeAsync(
            UnassignVolumeRequest request) {

        return unassignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unassignVolumeAsync(
            UnassignVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<UnassignVolumeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAppAsync(
            UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAppAsync(
            UpdateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateElasticIpAsync(
            UpdateElasticIpRequest request) {

        return updateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateElasticIpAsync(
            UpdateElasticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateElasticIpRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateInstanceAsync(
            UpdateInstanceRequest request) {

        return updateInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateInstanceAsync(
            UpdateInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateLayerAsync(
            UpdateLayerRequest request) {

        return updateLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateLayerAsync(
            UpdateLayerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLayerRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            UpdateMyUserProfileRequest request) {

        return updateMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            UpdateMyUserProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMyUserProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            UpdateRdsDbInstanceRequest request) {

        return updateRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            UpdateRdsDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRdsDbInstanceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateStackAsync(
            UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateStackAsync(
            UpdateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateUserProfileAsync(
            UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateUserProfileAsync(
            UpdateUserProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateVolumeAsync(
            UpdateVolumeRequest request) {

        return updateVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateVolumeAsync(
            UpdateVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
