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
 * The available AWS access control policy actions for CloudFront.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CloudFrontActions implements Action {

    /** Represents any action executed on CloudFront. */
    AllCloudFrontActions("cloudfront:*"),

    /** Action for the CreateCloudFrontOriginAccessIdentity operation. */
    CreateCloudFrontOriginAccessIdentity("cloudfront:CreateCloudFrontOriginAccessIdentity"),
    /** Action for the CreateDistribution operation. */
    CreateDistribution("cloudfront:CreateDistribution"),
    /** Action for the CreateDistributionWithTags operation. */
    CreateDistributionWithTags("cloudfront:CreateDistributionWithTags"),
    /** Action for the CreateFieldLevelEncryptionConfig operation. */
    CreateFieldLevelEncryptionConfig("cloudfront:CreateFieldLevelEncryptionConfig"),
    /** Action for the CreateFieldLevelEncryptionProfile operation. */
    CreateFieldLevelEncryptionProfile("cloudfront:CreateFieldLevelEncryptionProfile"),
    /** Action for the CreateInvalidation operation. */
    CreateInvalidation("cloudfront:CreateInvalidation"),
    /** Action for the CreatePublicKey operation. */
    CreatePublicKey("cloudfront:CreatePublicKey"),
    /** Action for the CreateStreamingDistribution operation. */
    CreateStreamingDistribution("cloudfront:CreateStreamingDistribution"),
    /** Action for the CreateStreamingDistributionWithTags operation. */
    CreateStreamingDistributionWithTags("cloudfront:CreateStreamingDistributionWithTags"),
    /** Action for the DeleteCloudFrontOriginAccessIdentity operation. */
    DeleteCloudFrontOriginAccessIdentity("cloudfront:DeleteCloudFrontOriginAccessIdentity"),
    /** Action for the DeleteDistribution operation. */
    DeleteDistribution("cloudfront:DeleteDistribution"),
    /** Action for the DeleteFieldLevelEncryptionConfig operation. */
    DeleteFieldLevelEncryptionConfig("cloudfront:DeleteFieldLevelEncryptionConfig"),
    /** Action for the DeleteFieldLevelEncryptionProfile operation. */
    DeleteFieldLevelEncryptionProfile("cloudfront:DeleteFieldLevelEncryptionProfile"),
    /** Action for the DeletePublicKey operation. */
    DeletePublicKey("cloudfront:DeletePublicKey"),
    /** Action for the DeleteStreamingDistribution operation. */
    DeleteStreamingDistribution("cloudfront:DeleteStreamingDistribution"),
    /** Action for the GetCloudFrontOriginAccessIdentity operation. */
    GetCloudFrontOriginAccessIdentity("cloudfront:GetCloudFrontOriginAccessIdentity"),
    /** Action for the GetCloudFrontOriginAccessIdentityConfig operation. */
    GetCloudFrontOriginAccessIdentityConfig("cloudfront:GetCloudFrontOriginAccessIdentityConfig"),
    /** Action for the GetDistribution operation. */
    GetDistribution("cloudfront:GetDistribution"),
    /** Action for the GetDistributionConfig operation. */
    GetDistributionConfig("cloudfront:GetDistributionConfig"),
    /** Action for the GetFieldLevelEncryption operation. */
    GetFieldLevelEncryption("cloudfront:GetFieldLevelEncryption"),
    /** Action for the GetFieldLevelEncryptionConfig operation. */
    GetFieldLevelEncryptionConfig("cloudfront:GetFieldLevelEncryptionConfig"),
    /** Action for the GetFieldLevelEncryptionProfile operation. */
    GetFieldLevelEncryptionProfile("cloudfront:GetFieldLevelEncryptionProfile"),
    /** Action for the GetFieldLevelEncryptionProfileConfig operation. */
    GetFieldLevelEncryptionProfileConfig("cloudfront:GetFieldLevelEncryptionProfileConfig"),
    /** Action for the GetInvalidation operation. */
    GetInvalidation("cloudfront:GetInvalidation"),
    /** Action for the GetPublicKey operation. */
    GetPublicKey("cloudfront:GetPublicKey"),
    /** Action for the GetPublicKeyConfig operation. */
    GetPublicKeyConfig("cloudfront:GetPublicKeyConfig"),
    /** Action for the GetStreamingDistribution operation. */
    GetStreamingDistribution("cloudfront:GetStreamingDistribution"),
    /** Action for the GetStreamingDistributionConfig operation. */
    GetStreamingDistributionConfig("cloudfront:GetStreamingDistributionConfig"),
    /** Action for the ListCloudFrontOriginAccessIdentities operation. */
    ListCloudFrontOriginAccessIdentities("cloudfront:ListCloudFrontOriginAccessIdentities"),
    /** Action for the ListDistributions operation. */
    ListDistributions("cloudfront:ListDistributions"),
    /** Action for the ListDistributionsByWebACLId operation. */
    ListDistributionsByWebACLId("cloudfront:ListDistributionsByWebACLId"),
    /** Action for the ListFieldLevelEncryptionConfigs operation. */
    ListFieldLevelEncryptionConfigs("cloudfront:ListFieldLevelEncryptionConfigs"),
    /** Action for the ListFieldLevelEncryptionProfiles operation. */
    ListFieldLevelEncryptionProfiles("cloudfront:ListFieldLevelEncryptionProfiles"),
    /** Action for the ListInvalidations operation. */
    ListInvalidations("cloudfront:ListInvalidations"),
    /** Action for the ListPublicKeys operation. */
    ListPublicKeys("cloudfront:ListPublicKeys"),
    /** Action for the ListStreamingDistributions operation. */
    ListStreamingDistributions("cloudfront:ListStreamingDistributions"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("cloudfront:ListTagsForResource"),
    /** Action for the TagResource operation. */
    TagResource("cloudfront:TagResource"),
    /** Action for the UntagResource operation. */
    UntagResource("cloudfront:UntagResource"),
    /** Action for the UpdateCloudFrontOriginAccessIdentity operation. */
    UpdateCloudFrontOriginAccessIdentity("cloudfront:UpdateCloudFrontOriginAccessIdentity"),
    /** Action for the UpdateDistribution operation. */
    UpdateDistribution("cloudfront:UpdateDistribution"),
    /** Action for the UpdateFieldLevelEncryptionConfig operation. */
    UpdateFieldLevelEncryptionConfig("cloudfront:UpdateFieldLevelEncryptionConfig"),
    /** Action for the UpdateFieldLevelEncryptionProfile operation. */
    UpdateFieldLevelEncryptionProfile("cloudfront:UpdateFieldLevelEncryptionProfile"),
    /** Action for the UpdatePublicKey operation. */
    UpdatePublicKey("cloudfront:UpdatePublicKey"),
    /** Action for the UpdateStreamingDistribution operation. */
    UpdateStreamingDistribution("cloudfront:UpdateStreamingDistribution"),

    ;

    private final String action;

    private CloudFrontActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
