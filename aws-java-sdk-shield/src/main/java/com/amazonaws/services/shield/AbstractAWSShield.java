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
package com.amazonaws.services.shield;

import javax.annotation.Generated;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSShield}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSShield implements AWSShield {

    protected AbstractAWSShield() {
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
    public AssociateDRTLogBucketResult associateDRTLogBucket(AssociateDRTLogBucketRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateDRTRoleResult associateDRTRole(AssociateDRTRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateProtectionResult createProtection(CreateProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSubscriptionResult createSubscription(CreateSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteProtectionResult deleteProtection(DeleteProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DeleteSubscriptionResult deleteSubscription(DeleteSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAttackResult describeAttack(DescribeAttackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDRTAccessResult describeDRTAccess(DescribeDRTAccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEmergencyContactSettingsResult describeEmergencyContactSettings(DescribeEmergencyContactSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProtectionResult describeProtection(DescribeProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubscriptionResult describeSubscription(DescribeSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateDRTLogBucketResult disassociateDRTLogBucket(DisassociateDRTLogBucketRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateDRTRoleResult disassociateDRTRole(DisassociateDRTRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSubscriptionStateResult getSubscriptionState(GetSubscriptionStateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttacksResult listAttacks(ListAttacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProtectionsResult listProtections(ListProtectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEmergencyContactSettingsResult updateEmergencyContactSettings(UpdateEmergencyContactSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSubscriptionResult updateSubscription(UpdateSubscriptionRequest request) {
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

}
