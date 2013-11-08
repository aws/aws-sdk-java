/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    AllElasticLoadBalancingActions("ElasticLoadBalancing:*"),

    /** Action for the ConfigureHealthCheck operation. */
    ConfigureHealthCheck("ElasticLoadBalancing:ConfigureHealthCheck"),

    /** Action for the CreateAppCookieStickinessPolicy operation. */
    CreateAppCookieStickinessPolicy("ElasticLoadBalancing:CreateAppCookieStickinessPolicy"),

    /** Action for the CreateLBCookieStickinessPolicy operation. */
    CreateLBCookieStickinessPolicy("ElasticLoadBalancing:CreateLBCookieStickinessPolicy"),

    /** Action for the CreateLoadBalancer operation. */
    CreateLoadBalancer("ElasticLoadBalancing:CreateLoadBalancer"),

    /** Action for the CreateLoadBalancerListeners operation. */
    CreateLoadBalancerListeners("ElasticLoadBalancing:CreateLoadBalancerListeners"),

    /** Action for the DeleteLoadBalancer operation. */
    DeleteLoadBalancer("ElasticLoadBalancing:DeleteLoadBalancer"),

    /** Action for the DeleteLoadBalancerListeners operation. */
    DeleteLoadBalancerListeners("ElasticLoadBalancing:DeleteLoadBalancerListeners"),

    /** Action for the DeleteLoadBalancerPolicy operation. */
    DeleteLoadBalancerPolicy("ElasticLoadBalancing:DeleteLoadBalancerPolicy"),

    /** Action for the DeregisterInstancesFromLoadBalancer operation. */
    DeregisterInstancesFromLoadBalancer("ElasticLoadBalancing:DeregisterInstancesFromLoadBalancer"),

    /** Action for the DescribeInstanceHealth operation. */
    DescribeInstanceHealth("ElasticLoadBalancing:DescribeInstanceHealth"),

    /** Action for the DescribeLoadBalancers operation. */
    DescribeLoadBalancers("ElasticLoadBalancing:DescribeLoadBalancers"),

    /** Action for the DisableAvailabilityZonesForLoadBalancer operation. */
    DisableAvailabilityZonesForLoadBalancer("ElasticLoadBalancing:DisableAvailabilityZonesForLoadBalancer"),

    /** Action for the EnableAvailabilityZonesForLoadBalancer operation. */
    EnableAvailabilityZonesForLoadBalancer("ElasticLoadBalancing:EnableAvailabilityZonesForLoadBalancer"),

    /** Action for the RegisterInstancesWithLoadBalancer operation. */
    RegisterInstancesWithLoadBalancer("ElasticLoadBalancing:RegisterInstancesWithLoadBalancer"),

    /** Action for the SetLoadBalancerListenerSSLCertificate operation. */
    SetLoadBalancerListenerSSLCertificate("ElasticLoadBalancing:SetLoadBalancerListenerSSLCertificate"),

    /** Action for the SetLoadBalancerPoliciesOfListener operation. */
    SetLoadBalancerPoliciesOfListener("ElasticLoadBalancing:SetLoadBalancerPoliciesOfListener");

    private final String action;

    private ElasticLoadBalancingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
