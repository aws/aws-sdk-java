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

/**
 * Abstract implementation of {@code AWSShieldAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSShieldAsync extends AbstractAWSShield implements AWSShieldAsync {

    protected AbstractAWSShieldAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(AssociateDRTLogBucketRequest request) {

        return associateDRTLogBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(AssociateDRTLogBucketRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateDRTLogBucketRequest, AssociateDRTLogBucketResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(AssociateDRTRoleRequest request) {

        return associateDRTRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(AssociateDRTRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateDRTRoleRequest, AssociateDRTRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest request) {

        return createProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProtectionRequest, CreateProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest request) {

        return createSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequest, CreateSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest request) {

        return deleteProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProtectionRequest, DeleteProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest request) {

        return deleteSubscriptionAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequest, DeleteSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest request) {

        return describeAttackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAttackRequest, DescribeAttackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(DescribeDRTAccessRequest request) {

        return describeDRTAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(DescribeDRTAccessRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDRTAccessRequest, DescribeDRTAccessResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            DescribeEmergencyContactSettingsRequest request) {

        return describeEmergencyContactSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            DescribeEmergencyContactSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEmergencyContactSettingsRequest, DescribeEmergencyContactSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest request) {

        return describeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectionRequest, DescribeProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest request) {

        return describeSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionRequest, DescribeSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(DisassociateDRTLogBucketRequest request) {

        return disassociateDRTLogBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(DisassociateDRTLogBucketRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateDRTLogBucketRequest, DisassociateDRTLogBucketResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(DisassociateDRTRoleRequest request) {

        return disassociateDRTRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(DisassociateDRTRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateDRTRoleRequest, DisassociateDRTRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(GetSubscriptionStateRequest request) {

        return getSubscriptionStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(GetSubscriptionStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionStateRequest, GetSubscriptionStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest request) {

        return listAttacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttacksRequest, ListAttacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest request) {

        return listProtectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProtectionsRequest, ListProtectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(UpdateEmergencyContactSettingsRequest request) {

        return updateEmergencyContactSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(UpdateEmergencyContactSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEmergencyContactSettingsRequest, UpdateEmergencyContactSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(UpdateSubscriptionRequest request) {

        return updateSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(UpdateSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionRequest, UpdateSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
