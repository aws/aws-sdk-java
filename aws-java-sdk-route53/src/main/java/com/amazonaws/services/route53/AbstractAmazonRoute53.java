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
package com.amazonaws.services.route53;

import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.*;
import com.amazonaws.services.route53.waiters.AmazonRoute53Waiters;

/**
 * Abstract implementation of {@code AmazonRoute53}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRoute53 implements AmazonRoute53 {

    protected AbstractAmazonRoute53() {
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
    public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ChangeResourceRecordSetsResult changeResourceRecordSets(ChangeResourceRecordSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ChangeTagsForResourceResult changeTagsForResource(ChangeTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateHealthCheckResult createHealthCheck(CreateHealthCheckRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateQueryLoggingConfigResult createQueryLoggingConfig(CreateQueryLoggingConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateReusableDelegationSetResult createReusableDelegationSet(CreateReusableDelegationSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTrafficPolicyVersionResult createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateVPCAssociationAuthorizationResult createVPCAssociationAuthorization(CreateVPCAssociationAuthorizationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteQueryLoggingConfigResult deleteQueryLoggingConfig(DeleteQueryLoggingConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteReusableDelegationSetResult deleteReusableDelegationSet(DeleteReusableDelegationSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(DeleteTrafficPolicyInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteVPCAssociationAuthorizationResult deleteVPCAssociationAuthorization(DeleteVPCAssociationAuthorizationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(DisassociateVPCFromHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAccountLimitResult getAccountLimit(GetAccountLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetChangeResult getChange(GetChangeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCheckerIpRangesResult getCheckerIpRanges(GetCheckerIpRangesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCheckerIpRangesResult getCheckerIpRanges() {
        return getCheckerIpRanges(new GetCheckerIpRangesRequest());
    }

    @Override
    public GetGeoLocationResult getGeoLocation(GetGeoLocationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetGeoLocationResult getGeoLocation() {
        return getGeoLocation(new GetGeoLocationRequest());
    }

    @Override
    public GetHealthCheckResult getHealthCheck(GetHealthCheckRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHealthCheckCountResult getHealthCheckCount(GetHealthCheckCountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHealthCheckCountResult getHealthCheckCount() {
        return getHealthCheckCount(new GetHealthCheckCountRequest());
    }

    @Override
    public GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(GetHealthCheckLastFailureReasonRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHealthCheckStatusResult getHealthCheckStatus(GetHealthCheckStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHostedZoneResult getHostedZone(GetHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHostedZoneCountResult getHostedZoneCount(GetHostedZoneCountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetHostedZoneCountResult getHostedZoneCount() {
        return getHostedZoneCount(new GetHostedZoneCountRequest());
    }

    @Override
    public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetQueryLoggingConfigResult getQueryLoggingConfig(GetQueryLoggingConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetReusableDelegationSetResult getReusableDelegationSet(GetReusableDelegationSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetReusableDelegationSetLimitResult getReusableDelegationSetLimit(GetReusableDelegationSetLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTrafficPolicyInstanceResult getTrafficPolicyInstance(GetTrafficPolicyInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount() {
        return getTrafficPolicyInstanceCount(new GetTrafficPolicyInstanceCountRequest());
    }

    @Override
    public ListGeoLocationsResult listGeoLocations(ListGeoLocationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListGeoLocationsResult listGeoLocations() {
        return listGeoLocations(new ListGeoLocationsRequest());
    }

    @Override
    public ListHealthChecksResult listHealthChecks(ListHealthChecksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListHealthChecksResult listHealthChecks() {
        return listHealthChecks(new ListHealthChecksRequest());
    }

    @Override
    public ListHostedZonesResult listHostedZones(ListHostedZonesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListHostedZonesResult listHostedZones() {
        return listHostedZones(new ListHostedZonesRequest());
    }

    @Override
    public ListHostedZonesByNameResult listHostedZonesByName(ListHostedZonesByNameRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListHostedZonesByNameResult listHostedZonesByName() {
        return listHostedZonesByName(new ListHostedZonesByNameRequest());
    }

    @Override
    public ListQueryLoggingConfigsResult listQueryLoggingConfigs(ListQueryLoggingConfigsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListReusableDelegationSetsResult listReusableDelegationSets(ListReusableDelegationSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListReusableDelegationSetsResult listReusableDelegationSets() {
        return listReusableDelegationSets(new ListReusableDelegationSetsRequest());
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTrafficPoliciesResult listTrafficPolicies() {
        return listTrafficPolicies(new ListTrafficPoliciesRequest());
    }

    @Override
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances() {
        return listTrafficPolicyInstances(new ListTrafficPolicyInstancesRequest());
    }

    @Override
    public ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(ListTrafficPolicyInstancesByHostedZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(ListTrafficPolicyInstancesByPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTrafficPolicyVersionsResult listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVPCAssociationAuthorizationsResult listVPCAssociationAuthorizations(ListVPCAssociationAuthorizationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TestDNSAnswerResult testDNSAnswer(TestDNSAnswerRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateHostedZoneCommentResult updateHostedZoneComment(UpdateHostedZoneCommentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest request) {
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
    public AmazonRoute53Waiters waiters() {
        throw new UnsupportedOperationException();
    }

}
