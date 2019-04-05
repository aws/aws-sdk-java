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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Elastic Load Balancing.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ElasticLoadBalancingActions implements Action {

    /** Represents any action executed on Elastic Load Balancing. */
    AllElasticLoadBalancingActions("elasticloadbalancing:*"),

    /** Action for the AddTags operation. */
    AddTags("elasticloadbalancing:AddTags"),
    /** Action for the ApplySecurityGroupsToLoadBalancer operation. */
    ApplySecurityGroupsToLoadBalancer("elasticloadbalancing:ApplySecurityGroupsToLoadBalancer"),
    /** Action for the AttachLoadBalancerToSubnets operation. */
    AttachLoadBalancerToSubnets("elasticloadbalancing:AttachLoadBalancerToSubnets"),
    /** Action for the ConfigureHealthCheck operation. */
    ConfigureHealthCheck("elasticloadbalancing:ConfigureHealthCheck"),
    /** Action for the CreateAppCookieStickinessPolicy operation. */
    CreateAppCookieStickinessPolicy("elasticloadbalancing:CreateAppCookieStickinessPolicy"),
    /** Action for the CreateLBCookieStickinessPolicy operation. */
    CreateLBCookieStickinessPolicy("elasticloadbalancing:CreateLBCookieStickinessPolicy"),
    /** Action for the CreateLoadBalancer operation. */
    CreateLoadBalancer("elasticloadbalancing:CreateLoadBalancer"),
    /** Action for the CreateLoadBalancerListeners operation. */
    CreateLoadBalancerListeners("elasticloadbalancing:CreateLoadBalancerListeners"),
    /** Action for the CreateLoadBalancerPolicy operation. */
    CreateLoadBalancerPolicy("elasticloadbalancing:CreateLoadBalancerPolicy"),
    /** Action for the DeleteLoadBalancer operation. */
    DeleteLoadBalancer("elasticloadbalancing:DeleteLoadBalancer"),
    /** Action for the DeleteLoadBalancerListeners operation. */
    DeleteLoadBalancerListeners("elasticloadbalancing:DeleteLoadBalancerListeners"),
    /** Action for the DeleteLoadBalancerPolicy operation. */
    DeleteLoadBalancerPolicy("elasticloadbalancing:DeleteLoadBalancerPolicy"),
    /** Action for the DeregisterInstancesFromLoadBalancer operation. */
    DeregisterInstancesFromLoadBalancer("elasticloadbalancing:DeregisterInstancesFromLoadBalancer"),
    /** Action for the DescribeAccountLimits operation. */
    DescribeAccountLimits("elasticloadbalancing:DescribeAccountLimits"),
    /** Action for the DescribeInstanceHealth operation. */
    DescribeInstanceHealth("elasticloadbalancing:DescribeInstanceHealth"),
    /** Action for the DescribeLoadBalancerAttributes operation. */
    DescribeLoadBalancerAttributes("elasticloadbalancing:DescribeLoadBalancerAttributes"),
    /** Action for the DescribeLoadBalancerPolicies operation. */
    DescribeLoadBalancerPolicies("elasticloadbalancing:DescribeLoadBalancerPolicies"),
    /** Action for the DescribeLoadBalancerPolicyTypes operation. */
    DescribeLoadBalancerPolicyTypes("elasticloadbalancing:DescribeLoadBalancerPolicyTypes"),
    /** Action for the DescribeLoadBalancers operation. */
    DescribeLoadBalancers("elasticloadbalancing:DescribeLoadBalancers"),
    /** Action for the DescribeTags operation. */
    DescribeTags("elasticloadbalancing:DescribeTags"),
    /** Action for the DetachLoadBalancerFromSubnets operation. */
    DetachLoadBalancerFromSubnets("elasticloadbalancing:DetachLoadBalancerFromSubnets"),
    /** Action for the DisableAvailabilityZonesForLoadBalancer operation. */
    DisableAvailabilityZonesForLoadBalancer("elasticloadbalancing:DisableAvailabilityZonesForLoadBalancer"),
    /** Action for the EnableAvailabilityZonesForLoadBalancer operation. */
    EnableAvailabilityZonesForLoadBalancer("elasticloadbalancing:EnableAvailabilityZonesForLoadBalancer"),
    /** Action for the ModifyLoadBalancerAttributes operation. */
    ModifyLoadBalancerAttributes("elasticloadbalancing:ModifyLoadBalancerAttributes"),
    /** Action for the RegisterInstancesWithLoadBalancer operation. */
    RegisterInstancesWithLoadBalancer("elasticloadbalancing:RegisterInstancesWithLoadBalancer"),
    /** Action for the RemoveTags operation. */
    RemoveTags("elasticloadbalancing:RemoveTags"),
    /** Action for the SetLoadBalancerListenerSSLCertificate operation. */
    SetLoadBalancerListenerSSLCertificate("elasticloadbalancing:SetLoadBalancerListenerSSLCertificate"),
    /** Action for the SetLoadBalancerPoliciesForBackendServer operation. */
    SetLoadBalancerPoliciesForBackendServer("elasticloadbalancing:SetLoadBalancerPoliciesForBackendServer"),
    /** Action for the SetLoadBalancerPoliciesOfListener operation. */
    SetLoadBalancerPoliciesOfListener("elasticloadbalancing:SetLoadBalancerPoliciesOfListener"),

    ;

    private final String action;

    private ElasticLoadBalancingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
