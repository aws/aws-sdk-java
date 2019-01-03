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
import com.amazonaws.*;
import com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters;

/**
 * Abstract implementation of {@code AmazonElasticLoadBalancing}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticLoadBalancing implements AmazonElasticLoadBalancing {

    protected AbstractAmazonElasticLoadBalancing() {
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
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoadBalancerListenersResult createLoadBalancerListeners(CreateLoadBalancerListenersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoadBalancerPolicyResult createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLoadBalancerListenersResult deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies() {
        return describeLoadBalancerPolicies(new DescribeLoadBalancerPoliciesRequest());
    }

    @Override
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes() {
        return describeLoadBalancerPolicyTypes(new DescribeLoadBalancerPolicyTypesRequest());
    }

    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancersResult describeLoadBalancers() {
        return describeLoadBalancers(new DescribeLoadBalancersRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest request) {
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
    public AmazonElasticLoadBalancingWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
