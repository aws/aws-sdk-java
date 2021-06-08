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
package com.amazonaws.services.networkfirewall;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;

/**
 * Abstract implementation of {@code AWSNetworkFirewallAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSNetworkFirewallAsync extends AbstractAWSNetworkFirewall implements AWSNetworkFirewallAsync {

    protected AbstractAWSNetworkFirewallAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallPolicyResult> associateFirewallPolicyAsync(AssociateFirewallPolicyRequest request) {

        return associateFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallPolicyResult> associateFirewallPolicyAsync(AssociateFirewallPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateFirewallPolicyRequest, AssociateFirewallPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetsResult> associateSubnetsAsync(AssociateSubnetsRequest request) {

        return associateSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetsResult> associateSubnetsAsync(AssociateSubnetsRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateSubnetsRequest, AssociateSubnetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallResult> createFirewallAsync(CreateFirewallRequest request) {

        return createFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallResult> createFirewallAsync(CreateFirewallRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFirewallRequest, CreateFirewallResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallPolicyResult> createFirewallPolicyAsync(CreateFirewallPolicyRequest request) {

        return createFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallPolicyResult> createFirewallPolicyAsync(CreateFirewallPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFirewallPolicyRequest, CreateFirewallPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request) {

        return createRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallResult> deleteFirewallAsync(DeleteFirewallRequest request) {

        return deleteFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallResult> deleteFirewallAsync(DeleteFirewallRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallRequest, DeleteFirewallResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallPolicyResult> deleteFirewallPolicyAsync(DeleteFirewallPolicyRequest request) {

        return deleteFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallPolicyResult> deleteFirewallPolicyAsync(DeleteFirewallPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallPolicyRequest, DeleteFirewallPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {

        return deleteRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallResult> describeFirewallAsync(DescribeFirewallRequest request) {

        return describeFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallResult> describeFirewallAsync(DescribeFirewallRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFirewallRequest, DescribeFirewallResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallPolicyResult> describeFirewallPolicyAsync(DescribeFirewallPolicyRequest request) {

        return describeFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallPolicyResult> describeFirewallPolicyAsync(DescribeFirewallPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFirewallPolicyRequest, DescribeFirewallPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request) {

        return describeLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingConfigurationRequest, DescribeLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest request) {

        return describeResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourcePolicyRequest, DescribeResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupResult> describeRuleGroupAsync(DescribeRuleGroupRequest request) {

        return describeRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupResult> describeRuleGroupAsync(DescribeRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleGroupRequest, DescribeRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetsResult> disassociateSubnetsAsync(DisassociateSubnetsRequest request) {

        return disassociateSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetsResult> disassociateSubnetsAsync(DisassociateSubnetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateSubnetsRequest, DisassociateSubnetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFirewallPoliciesResult> listFirewallPoliciesAsync(ListFirewallPoliciesRequest request) {

        return listFirewallPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallPoliciesResult> listFirewallPoliciesAsync(ListFirewallPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFirewallPoliciesRequest, ListFirewallPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFirewallsResult> listFirewallsAsync(ListFirewallsRequest request) {

        return listFirewallsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallsResult> listFirewallsAsync(ListFirewallsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFirewallsRequest, ListFirewallsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request) {

        return listRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateFirewallDeleteProtectionResult> updateFirewallDeleteProtectionAsync(UpdateFirewallDeleteProtectionRequest request) {

        return updateFirewallDeleteProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDeleteProtectionResult> updateFirewallDeleteProtectionAsync(UpdateFirewallDeleteProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallDeleteProtectionRequest, UpdateFirewallDeleteProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDescriptionResult> updateFirewallDescriptionAsync(UpdateFirewallDescriptionRequest request) {

        return updateFirewallDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDescriptionResult> updateFirewallDescriptionAsync(UpdateFirewallDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallDescriptionRequest, UpdateFirewallDescriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyResult> updateFirewallPolicyAsync(UpdateFirewallPolicyRequest request) {

        return updateFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyResult> updateFirewallPolicyAsync(UpdateFirewallPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallPolicyRequest, UpdateFirewallPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyChangeProtectionResult> updateFirewallPolicyChangeProtectionAsync(
            UpdateFirewallPolicyChangeProtectionRequest request) {

        return updateFirewallPolicyChangeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyChangeProtectionResult> updateFirewallPolicyChangeProtectionAsync(
            UpdateFirewallPolicyChangeProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallPolicyChangeProtectionRequest, UpdateFirewallPolicyChangeProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request) {

        return updateRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetChangeProtectionResult> updateSubnetChangeProtectionAsync(UpdateSubnetChangeProtectionRequest request) {

        return updateSubnetChangeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetChangeProtectionResult> updateSubnetChangeProtectionAsync(UpdateSubnetChangeProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubnetChangeProtectionRequest, UpdateSubnetChangeProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
