/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon Elastic Load Balancing.
 */
public enum ElasticLoadBalancingActions implements Action {
    /** Represents any action executed on Amazon Elastic Load Balancing. */
    AllElasticLoadBalancingActions("elasticloadbalancing:*"),

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

    /** Action for the DeleteLoadBalancer operation. */
    DeleteLoadBalancer("elasticloadbalancing:DeleteLoadBalancer"),

    /** Action for the DeleteLoadBalancerListeners operation. */
    DeleteLoadBalancerListeners("elasticloadbalancing:DeleteLoadBalancerListeners"),

    /** Action for the DeleteLoadBalancerPolicy operation. */
    DeleteLoadBalancerPolicy("elasticloadbalancing:DeleteLoadBalancerPolicy"),

    /** Action for the DeregisterInstancesFromLoadBalancer operation. */
    DeregisterInstancesFromLoadBalancer("elasticloadbalancing:DeregisterInstancesFromLoadBalancer"),

    /** Action for the DescribeInstanceHealth operation. */
    DescribeInstanceHealth("elasticloadbalancing:DescribeInstanceHealth"),

    /** Action for the DescribeLoadBalancers operation. */
    DescribeLoadBalancers("elasticloadbalancing:DescribeLoadBalancers"),

    /** Action for the DisableAvailabilityZonesForLoadBalancer operation. */
    DisableAvailabilityZonesForLoadBalancer("elasticloadbalancing:DisableAvailabilityZonesForLoadBalancer"),

    /** Action for the EnableAvailabilityZonesForLoadBalancer operation. */
    EnableAvailabilityZonesForLoadBalancer("elasticloadbalancing:EnableAvailabilityZonesForLoadBalancer"),

    /** Action for the RegisterInstancesWithLoadBalancer operation. */
    RegisterInstancesWithLoadBalancer("elasticloadbalancing:RegisterInstancesWithLoadBalancer"),

    /** Action for the SetLoadBalancerListenerSSLCertificate operation. */
    SetLoadBalancerListenerSSLCertificate("elasticloadbalancing:SetLoadBalancerListenerSSLCertificate"),

    /** Action for the SetLoadBalancerPoliciesOfListener operation. */
    SetLoadBalancerPoliciesOfListener("elasticloadbalancing:SetLoadBalancerPoliciesOfListener");

    private final String action;

    private ElasticLoadBalancingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
