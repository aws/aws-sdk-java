/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for KMS.
 */

public enum KMSActions implements Action {

    /** Represents any action executed on KMS. */
    AllKMSActions("kms:*"),

    /** Action for the CancelKeyDeletion operation. */
    CancelKeyDeletion("kms:CancelKeyDeletion"),
    /** Action for the CreateAlias operation. */
    CreateAlias("kms:CreateAlias"),
    /** Action for the CreateGrant operation. */
    CreateGrant("kms:CreateGrant"),
    /** Action for the CreateKey operation. */
    CreateKey("kms:CreateKey"),
    /** Action for the Decrypt operation. */
    Decrypt("kms:Decrypt"),
    /** Action for the DeleteAlias operation. */
    DeleteAlias("kms:DeleteAlias"),
    /** Action for the DeleteImportedKeyMaterial operation. */
    DeleteImportedKeyMaterial("kms:DeleteImportedKeyMaterial"),
    /** Action for the DescribeKey operation. */
    DescribeKey("kms:DescribeKey"),
    /** Action for the DisableKey operation. */
    DisableKey("kms:DisableKey"),
    /** Action for the DisableKeyRotation operation. */
    DisableKeyRotation("kms:DisableKeyRotation"),
    /** Action for the EnableKey operation. */
    EnableKey("kms:EnableKey"),
    /** Action for the EnableKeyRotation operation. */
    EnableKeyRotation("kms:EnableKeyRotation"),
    /** Action for the Encrypt operation. */
    Encrypt("kms:Encrypt"),
    /** Action for the GenerateDataKey operation. */
    GenerateDataKey("kms:GenerateDataKey"),
    /** Action for the GenerateDataKeyWithoutPlaintext operation. */
    GenerateDataKeyWithoutPlaintext("kms:GenerateDataKeyWithoutPlaintext"),
    /** Action for the GenerateRandom operation. */
    GenerateRandom("kms:GenerateRandom"),
    /** Action for the GetKeyPolicy operation. */
    GetKeyPolicy("kms:GetKeyPolicy"),
    /** Action for the GetKeyRotationStatus operation. */
    GetKeyRotationStatus("kms:GetKeyRotationStatus"),
    /** Action for the GetParametersForImport operation. */
    GetParametersForImport("kms:GetParametersForImport"),
    /** Action for the ImportKeyMaterial operation. */
    ImportKeyMaterial("kms:ImportKeyMaterial"),
    /** Action for the ListAliases operation. */
    ListAliases("kms:ListAliases"),
    /** Action for the ListGrants operation. */
    ListGrants("kms:ListGrants"),
    /** Action for the ListKeyPolicies operation. */
    ListKeyPolicies("kms:ListKeyPolicies"),
    /** Action for the ListKeys operation. */
    ListKeys("kms:ListKeys"),
    /** Action for the ListRetirableGrants operation. */
    ListRetirableGrants("kms:ListRetirableGrants"),
    /** Action for the PutKeyPolicy operation. */
    PutKeyPolicy("kms:PutKeyPolicy"),
    /** Action for the ReEncryptFrom operation. */
    ReEncryptFrom("kms:ReEncryptFrom"),
    /** Action for the ReEncryptTo operation. */
    ReEncryptTo("kms:ReEncryptTo"),
    /** Action for the RevokeGrant operation. */
    RevokeGrant("kms:RevokeGrant"),
    /** Action for the ScheduleKeyDeletion operation. */
    ScheduleKeyDeletion("kms:ScheduleKeyDeletion"),
    /** Action for the UpdateAlias operation. */
    UpdateAlias("kms:UpdateAlias"),
    /** Action for the UpdateKeyDescription operation. */
    UpdateKeyDescription("kms:UpdateKeyDescription");

    private final String action;

    private KMSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
