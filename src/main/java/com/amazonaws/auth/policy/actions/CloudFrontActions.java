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
 * The available AWS access control policy actions for Amazon CloudFront.
 */
public enum CloudFrontActions implements Action {
    /** Represents any action executed on Amazon CloudFront. */
    AllCloudFrontActions("CloudFront:*"),

    /** Action for the CreateCloudFrontOriginAccessIdentity operation. */
    CreateCloudFrontOriginAccessIdentity("CloudFront:CreateCloudFrontOriginAccessIdentity"),

    /** Action for the CreateDistribution operation. */
    CreateDistribution("CloudFront:CreateDistribution"),

    /** Action for the CreateInvalidation operation. */
    CreateInvalidation("CloudFront:CreateInvalidation"),

    /** Action for the CreateStreamingDistribution operation. */
    CreateStreamingDistribution("CloudFront:CreateStreamingDistribution"),

    /** Action for the DeleteCloudFrontOriginAccessIdentity operation. */
    DeleteCloudFrontOriginAccessIdentity("CloudFront:DeleteCloudFrontOriginAccessIdentity"),

    /** Action for the DeleteDistribution operation. */
    DeleteDistribution("CloudFront:DeleteDistribution"),

    /** Action for the DeleteStreamingDistribution operation. */
    DeleteStreamingDistribution("CloudFront:DeleteStreamingDistribution"),

    /** Action for the GetCloudFrontOriginAccessIdentity operation. */
    GetCloudFrontOriginAccessIdentity("CloudFront:GetCloudFrontOriginAccessIdentity"),

    /** Action for the GetCloudFrontOriginAccessIdentityConfig operation. */
    GetCloudFrontOriginAccessIdentityConfig("CloudFront:GetCloudFrontOriginAccessIdentityConfig"),

    /** Action for the GetDistribution operation. */
    GetDistribution("CloudFront:GetDistribution"),

    /** Action for the GetDistributionConfig operation. */
    GetDistributionConfig("CloudFront:GetDistributionConfig"),

    /** Action for the GetInvalidation operation. */
    GetInvalidation("CloudFront:GetInvalidation"),

    /** Action for the GetStreamingDistribution operation. */
    GetStreamingDistribution("CloudFront:GetStreamingDistribution"),

    /** Action for the GetStreamingDistributionConfig operation. */
    GetStreamingDistributionConfig("CloudFront:GetStreamingDistributionConfig"),

    /** Action for the ListCloudFrontOriginAccessIdentities operation. */
    ListCloudFrontOriginAccessIdentities("CloudFront:ListCloudFrontOriginAccessIdentities"),

    /** Action for the ListDistributions operation. */
    ListDistributions("CloudFront:ListDistributions"),

    /** Action for the ListInvalidations operation. */
    ListInvalidations("CloudFront:ListInvalidations"),

    /** Action for the ListStreamingDistributions operation. */
    ListStreamingDistributions("CloudFront:ListStreamingDistributions"),

    /** Action for the UpdateCloudFrontOriginAccessIdentity operation. */
    UpdateCloudFrontOriginAccessIdentity("CloudFront:UpdateCloudFrontOriginAccessIdentity"),

    /** Action for the UpdateDistribution operation. */
    UpdateDistribution("CloudFront:UpdateDistribution"),

    /** Action for the UpdateStreamingDistribution operation. */
    UpdateStreamingDistribution("CloudFront:UpdateStreamingDistribution");

    private final String action;

    private CloudFrontActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
