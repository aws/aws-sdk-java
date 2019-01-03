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
package com.amazonaws.services.elasticloadbalancing;

import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Abstract implementation of {@code AmazonElasticLoadBalancingAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticLoadBalancingAsync extends AbstractAmazonElasticLoadBalancing implements AmazonElasticLoadBalancingAsync {

    protected AbstractAmazonElasticLoadBalancingAsync() {
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
    public java.util.concurrent.Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest request) {

        return applySecurityGroupsToLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(AttachLoadBalancerToSubnetsRequest request) {

        return attachLoadBalancerToSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(AttachLoadBalancerToSubnetsRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest request) {

        return configureHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest request) {

        return createAppCookieStickinessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(CreateLBCookieStickinessPolicyRequest request) {

        return createLBCookieStickinessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(CreateLBCookieStickinessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest request) {

        return createLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(CreateLoadBalancerListenersRequest request) {

        return createLoadBalancerListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(CreateLoadBalancerListenersRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerListenersRequest, CreateLoadBalancerListenersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest request) {

        return createLoadBalancerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {

        return deleteLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(DeleteLoadBalancerListenersRequest request) {

        return deleteLoadBalancerListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(DeleteLoadBalancerListenersRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerListenersRequest, DeleteLoadBalancerListenersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest request) {

        return deleteLoadBalancerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest request) {

        return deregisterInstancesFromLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest request) {

        return describeInstanceHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(DescribeLoadBalancerAttributesRequest request) {

        return describeLoadBalancerAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(DescribeLoadBalancerAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest request) {

        return describeLoadBalancerPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicies operation.
     *
     * @see #describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync() {

        return describeLoadBalancerPoliciesAsync(new DescribeLoadBalancerPoliciesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicies operation with an AsyncHandler.
     *
     * @see #describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler) {

        return describeLoadBalancerPoliciesAsync(new DescribeLoadBalancerPoliciesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest request) {

        return describeLoadBalancerPolicyTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicyTypes operation.
     *
     * @see #describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync() {

        return describeLoadBalancerPolicyTypesAsync(new DescribeLoadBalancerPolicyTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicyTypes operation with an AsyncHandler.
     *
     * @see #describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler) {

        return describeLoadBalancerPolicyTypesAsync(new DescribeLoadBalancerPolicyTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request) {

        return describeLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancers operation.
     *
     * @see #describeLoadBalancersAsync(DescribeLoadBalancersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync() {

        return describeLoadBalancersAsync(new DescribeLoadBalancersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLoadBalancers operation with an AsyncHandler.
     *
     * @see #describeLoadBalancersAsync(DescribeLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler) {

        return describeLoadBalancersAsync(new DescribeLoadBalancersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(DetachLoadBalancerFromSubnetsRequest request) {

        return detachLoadBalancerFromSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(DetachLoadBalancerFromSubnetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest request) {

        return disableAvailabilityZonesForLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest request) {

        return enableAvailabilityZonesForLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(ModifyLoadBalancerAttributesRequest request) {

        return modifyLoadBalancerAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(ModifyLoadBalancerAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest request) {

        return registerInstancesWithLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler) {

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
    public java.util.concurrent.Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest request) {

        return setLoadBalancerListenerSSLCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, SetLoadBalancerListenerSSLCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest request) {

        return setLoadBalancerPoliciesForBackendServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest request,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest request) {

        return setLoadBalancerPoliciesOfListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest request,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
