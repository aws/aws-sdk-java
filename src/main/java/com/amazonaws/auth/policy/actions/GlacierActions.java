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
 * The available AWS access control policy actions for Amazon Glacier.
 */
public enum GlacierActions implements Action {
    /** Represents any action executed on Amazon Glacier. */
    AllGlacierActions("Glacier:*"),

    /** Action for the AbortMultipartUpload operation. */
    AbortMultipartUpload("Glacier:AbortMultipartUpload"),

    /** Action for the CompleteMultipartUpload operation. */
    CompleteMultipartUpload("Glacier:CompleteMultipartUpload"),

    /** Action for the CreateVault operation. */
    CreateVault("Glacier:CreateVault"),

    /** Action for the DeleteArchive operation. */
    DeleteArchive("Glacier:DeleteArchive"),

    /** Action for the DeleteVault operation. */
    DeleteVault("Glacier:DeleteVault"),

    /** Action for the DeleteVaultNotifications operation. */
    DeleteVaultNotifications("Glacier:DeleteVaultNotifications"),

    /** Action for the DescribeJob operation. */
    DescribeJob("Glacier:DescribeJob"),

    /** Action for the DescribeVault operation. */
    DescribeVault("Glacier:DescribeVault"),

    /** Action for the GetJobOutput operation. */
    GetJobOutput("Glacier:GetJobOutput"),

    /** Action for the GetVaultNotifications operation. */
    GetVaultNotifications("Glacier:GetVaultNotifications"),

    /** Action for the InitiateMultipartUpload operation. */
    InitiateMultipartUpload("Glacier:InitiateMultipartUpload"),

    /** Action for the InitiateJob operation. */
    InitiateJob("Glacier:InitiateJob"),

    /** Action for the ListJobs operation. */
    ListJobs("Glacier:ListJobs"),

    /** Action for the ListMultipartUploads operation. */
    ListMultipartUploads("Glacier:ListMultipartUploads"),

    /** Action for the ListParts operation. */
    ListParts("Glacier:ListParts"),

    /** Action for the ListVaults operation. */
    ListVaults("Glacier:ListVaults"),

    /** Action for the SetVaultNotifications operation. */
    SetVaultNotifications("Glacier:SetVaultNotifications"),

    /** Action for the UploadArchive operation. */
    UploadArchive("Glacier:UploadArchive"),

    /** Action for the UploadMultipartPart operation. */
    UploadMultipartPart("Glacier:UploadMultipartPart");

    private final String action;

    private GlacierActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
