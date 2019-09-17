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
 * The available AWS access control policy actions for Route 53.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Route53Actions implements Action {

    /** Represents any action executed on Route 53. */
    AllRoute53Actions("route53:*"),

    /** Action for the AssociateVPCWithHostedZone operation. */
    AssociateVPCWithHostedZone("route53:AssociateVPCWithHostedZone"),
    /** Action for the ChangeResourceRecordSets operation. */
    ChangeResourceRecordSets("route53:ChangeResourceRecordSets"),
    /** Action for the ChangeTagsForResource operation. */
    ChangeTagsForResource("route53:ChangeTagsForResource"),
    /** Action for the CreateHealthCheck operation. */
    CreateHealthCheck("route53:CreateHealthCheck"),
    /** Action for the CreateHostedZone operation. */
    CreateHostedZone("route53:CreateHostedZone"),
    /** Action for the CreateQueryLoggingConfig operation. */
    CreateQueryLoggingConfig("route53:CreateQueryLoggingConfig"),
    /** Action for the CreateReusableDelegationSet operation. */
    CreateReusableDelegationSet("route53:CreateReusableDelegationSet"),
    /** Action for the CreateTrafficPolicy operation. */
    CreateTrafficPolicy("route53:CreateTrafficPolicy"),
    /** Action for the CreateTrafficPolicyInstance operation. */
    CreateTrafficPolicyInstance("route53:CreateTrafficPolicyInstance"),
    /** Action for the CreateTrafficPolicyVersion operation. */
    CreateTrafficPolicyVersion("route53:CreateTrafficPolicyVersion"),
    /** Action for the CreateVPCAssociationAuthorization operation. */
    CreateVPCAssociationAuthorization("route53:CreateVPCAssociationAuthorization"),
    /** Action for the DeleteHealthCheck operation. */
    DeleteHealthCheck("route53:DeleteHealthCheck"),
    /** Action for the DeleteHostedZone operation. */
    DeleteHostedZone("route53:DeleteHostedZone"),
    /** Action for the DeleteQueryLoggingConfig operation. */
    DeleteQueryLoggingConfig("route53:DeleteQueryLoggingConfig"),
    /** Action for the DeleteReusableDelegationSet operation. */
    DeleteReusableDelegationSet("route53:DeleteReusableDelegationSet"),
    /** Action for the DeleteTrafficPolicy operation. */
    DeleteTrafficPolicy("route53:DeleteTrafficPolicy"),
    /** Action for the DeleteTrafficPolicyInstance operation. */
    DeleteTrafficPolicyInstance("route53:DeleteTrafficPolicyInstance"),
    /** Action for the DeleteVPCAssociationAuthorization operation. */
    DeleteVPCAssociationAuthorization("route53:DeleteVPCAssociationAuthorization"),
    /** Action for the DisassociateVPCFromHostedZone operation. */
    DisassociateVPCFromHostedZone("route53:DisassociateVPCFromHostedZone"),
    /** Action for the GetAccountLimit operation. */
    GetAccountLimit("route53:GetAccountLimit"),
    /** Action for the GetChange operation. */
    GetChange("route53:GetChange"),
    /** Action for the GetCheckerIpRanges operation. */
    GetCheckerIpRanges("route53:GetCheckerIpRanges"),
    /** Action for the GetGeoLocation operation. */
    GetGeoLocation("route53:GetGeoLocation"),
    /** Action for the GetHealthCheck operation. */
    GetHealthCheck("route53:GetHealthCheck"),
    /** Action for the GetHealthCheckCount operation. */
    GetHealthCheckCount("route53:GetHealthCheckCount"),
    /** Action for the GetHealthCheckLastFailureReason operation. */
    GetHealthCheckLastFailureReason("route53:GetHealthCheckLastFailureReason"),
    /** Action for the GetHealthCheckStatus operation. */
    GetHealthCheckStatus("route53:GetHealthCheckStatus"),
    /** Action for the GetHostedZone operation. */
    GetHostedZone("route53:GetHostedZone"),
    /** Action for the GetHostedZoneCount operation. */
    GetHostedZoneCount("route53:GetHostedZoneCount"),
    /** Action for the GetHostedZoneLimit operation. */
    GetHostedZoneLimit("route53:GetHostedZoneLimit"),
    /** Action for the GetQueryLoggingConfig operation. */
    GetQueryLoggingConfig("route53:GetQueryLoggingConfig"),
    /** Action for the GetReusableDelegationSet operation. */
    GetReusableDelegationSet("route53:GetReusableDelegationSet"),
    /** Action for the GetReusableDelegationSetLimit operation. */
    GetReusableDelegationSetLimit("route53:GetReusableDelegationSetLimit"),
    /** Action for the GetTrafficPolicy operation. */
    GetTrafficPolicy("route53:GetTrafficPolicy"),
    /** Action for the GetTrafficPolicyInstance operation. */
    GetTrafficPolicyInstance("route53:GetTrafficPolicyInstance"),
    /** Action for the GetTrafficPolicyInstanceCount operation. */
    GetTrafficPolicyInstanceCount("route53:GetTrafficPolicyInstanceCount"),
    /** Action for the ListGeoLocations operation. */
    ListGeoLocations("route53:ListGeoLocations"),
    /** Action for the ListHealthChecks operation. */
    ListHealthChecks("route53:ListHealthChecks"),
    /** Action for the ListHostedZones operation. */
    ListHostedZones("route53:ListHostedZones"),
    /** Action for the ListHostedZonesByName operation. */
    ListHostedZonesByName("route53:ListHostedZonesByName"),
    /** Action for the ListQueryLoggingConfigs operation. */
    ListQueryLoggingConfigs("route53:ListQueryLoggingConfigs"),
    /** Action for the ListResourceRecordSets operation. */
    ListResourceRecordSets("route53:ListResourceRecordSets"),
    /** Action for the ListReusableDelegationSets operation. */
    ListReusableDelegationSets("route53:ListReusableDelegationSets"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("route53:ListTagsForResource"),
    /** Action for the ListTagsForResources operation. */
    ListTagsForResources("route53:ListTagsForResources"),
    /** Action for the ListTrafficPolicies operation. */
    ListTrafficPolicies("route53:ListTrafficPolicies"),
    /** Action for the ListTrafficPolicyInstances operation. */
    ListTrafficPolicyInstances("route53:ListTrafficPolicyInstances"),
    /** Action for the ListTrafficPolicyInstancesByHostedZone operation. */
    ListTrafficPolicyInstancesByHostedZone("route53:ListTrafficPolicyInstancesByHostedZone"),
    /** Action for the ListTrafficPolicyInstancesByPolicy operation. */
    ListTrafficPolicyInstancesByPolicy("route53:ListTrafficPolicyInstancesByPolicy"),
    /** Action for the ListTrafficPolicyVersions operation. */
    ListTrafficPolicyVersions("route53:ListTrafficPolicyVersions"),
    /** Action for the ListVPCAssociationAuthorizations operation. */
    ListVPCAssociationAuthorizations("route53:ListVPCAssociationAuthorizations"),
    /** Action for the TestDNSAnswer operation. */
    TestDNSAnswer("route53:TestDNSAnswer"),
    /** Action for the UpdateHealthCheck operation. */
    UpdateHealthCheck("route53:UpdateHealthCheck"),
    /** Action for the UpdateHostedZoneComment operation. */
    UpdateHostedZoneComment("route53:UpdateHostedZoneComment"),
    /** Action for the UpdateTrafficPolicyComment operation. */
    UpdateTrafficPolicyComment("route53:UpdateTrafficPolicyComment"),
    /** Action for the UpdateTrafficPolicyInstance operation. */
    UpdateTrafficPolicyInstance("route53:UpdateTrafficPolicyInstance"),

    ;

    private final String action;

    private Route53Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
