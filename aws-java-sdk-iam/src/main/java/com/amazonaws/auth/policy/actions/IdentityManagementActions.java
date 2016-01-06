/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The available AWS access control policy actions for AWS Identity and Access Management.
 */
public enum IdentityManagementActions implements Action {
    /** Represents any action executed on AWS Identity and Access Management. */
    AllIdentityManagementActions("iam:*"),

    /** Action for the AddRoleToInstanceProfile operation. */
    AddRoleToInstanceProfile("iam:AddRoleToInstanceProfile"),

    /** Action for the AddUserToGroup operation. */
    AddUserToGroup("iam:AddUserToGroup"),

    /** Action for the ChangePassword operation. */
    ChangePassword("iam:ChangePassword"),

    /** Action for the CreateAccessKey operation. */
    CreateAccessKey("iam:CreateAccessKey"),

    /** Action for the CreateAccountAlias operation. */
    CreateAccountAlias("iam:CreateAccountAlias"),

    /** Action for the CreateGroup operation. */
    CreateGroup("iam:CreateGroup"),

    /** Action for the CreateInstanceProfile operation. */
    CreateInstanceProfile("iam:CreateInstanceProfile"),

    /** Action for the CreateLoginProfile operation. */
    CreateLoginProfile("iam:CreateLoginProfile"),

    /** Action for the CreateRole operation. */
    CreateRole("iam:CreateRole"),

    /** Action for the CreateUser operation. */
    CreateUser("iam:CreateUser"),

    /** Action for the CreateVirtualMFADevice operation. */
    CreateVirtualMFADevice("iam:CreateVirtualMFADevice"),

    /** Action for the DeactivateMFADevice operation. */
    DeactivateMFADevice("iam:DeactivateMFADevice"),

    /** Action for the DeleteAccessKey operation. */
    DeleteAccessKey("iam:DeleteAccessKey"),

    /** Action for the DeleteAccountAlias operation. */
    DeleteAccountAlias("iam:DeleteAccountAlias"),

    /** Action for the DeleteAccountPasswordPolicy operation. */
    DeleteAccountPasswordPolicy("iam:DeleteAccountPasswordPolicy"),

    /** Action for the DeleteGroup operation. */
    DeleteGroup("iam:DeleteGroup"),

    /** Action for the DeleteGroupPolicy operation. */
    DeleteGroupPolicy("iam:DeleteGroupPolicy"),

    /** Action for the DeleteInstanceProfile operation. */
    DeleteInstanceProfile("iam:DeleteInstanceProfile"),

    /** Action for the DeleteLoginProfile operation. */
    DeleteLoginProfile("iam:DeleteLoginProfile"),

    /** Action for the DeleteRole operation. */
    DeleteRole("iam:DeleteRole"),

    /** Action for the DeleteRolePolicy operation. */
    DeleteRolePolicy("iam:DeleteRolePolicy"),

    /** Action for the DeleteServerCertificate operation. */
    DeleteServerCertificate("iam:DeleteServerCertificate"),

    /** Action for the DeleteSigningCertificate operation. */
    DeleteSigningCertificate("iam:DeleteSigningCertificate"),

    /** Action for the DeleteUser operation. */
    DeleteUser("iam:DeleteUser"),

    /** Action for the DeleteUserPolicy operation. */
    DeleteUserPolicy("iam:DeleteUserPolicy"),

    /** Action for the DeleteVirtualMFADevice operation. */
    DeleteVirtualMFADevice("iam:DeleteVirtualMFADevice"),

    /** Action for the EnableMFADevice operation. */
    EnableMFADevice("iam:EnableMFADevice"),

    /** Action for the GetAccountPasswordPolicy operation. */
    GetAccountPasswordPolicy("iam:GetAccountPasswordPolicy"),

    /** Action for the GetAccountSummary operation. */
    GetAccountSummary("iam:GetAccountSummary"),

    /** Action for the GetGroup operation. */
    GetGroup("iam:GetGroup"),

    /** Action for the GetGroupPolicy operation. */
    GetGroupPolicy("iam:GetGroupPolicy"),

    /** Action for the GetInstanceProfile operation. */
    GetInstanceProfile("iam:GetInstanceProfile"),

    /** Action for the GetLoginProfile operation. */
    GetLoginProfile("iam:GetLoginProfile"),

    /** Action for the GetRole operation. */
    GetRole("iam:GetRole"),

    /** Action for the GetRolePolicy operation. */
    GetRolePolicy("iam:GetRolePolicy"),

    /** Action for the GetServerCertificate operation. */
    GetServerCertificate("iam:GetServerCertificate"),

    /** Action for the GetUser operation. */
    GetUser("iam:GetUser"),

    /** Action for the GetUserPolicy operation. */
    GetUserPolicy("iam:GetUserPolicy"),

    /** Action for the ListAccessKeys operation. */
    ListAccessKeys("iam:ListAccessKeys"),

    /** Action for the ListAccountAliases operation. */
    ListAccountAliases("iam:ListAccountAliases"),

    /** Action for the ListGroupPolicies operation. */
    ListGroupPolicies("iam:ListGroupPolicies"),

    /** Action for the ListGroups operation. */
    ListGroups("iam:ListGroups"),

    /** Action for the ListGroupsForUser operation. */
    ListGroupsForUser("iam:ListGroupsForUser"),

    /** Action for the ListInstanceProfiles operation. */
    ListInstanceProfiles("iam:ListInstanceProfiles"),

    /** Action for the ListInstanceProfilesForRole operation. */
    ListInstanceProfilesForRole("iam:ListInstanceProfilesForRole"),

    /** Action for the ListMFADevices operation. */
    ListMFADevices("iam:ListMFADevices"),

    /** Action for the ListRolePolicies operation. */
    ListRolePolicies("iam:ListRolePolicies"),

    /** Action for the ListRoles operation. */
    ListRoles("iam:ListRoles"),

    /** Action for the ListServerCertificates operation. */
    ListServerCertificates("iam:ListServerCertificates"),

    /** Action for the ListSigningCertificates operation. */
    ListSigningCertificates("iam:ListSigningCertificates"),

    /** Action for the ListUserPolicies operation. */
    ListUserPolicies("iam:ListUserPolicies"),

    /** Action for the ListUsers operation. */
    ListUsers("iam:ListUsers"),

    /** Action for the ListVirtualMFADevices operation. */
    ListVirtualMFADevices("iam:ListVirtualMFADevices"),

    /** Action for the PassRole operation. */
    PassRole("iam:PassRole"),

    /** Action for the PutGroupPolicy operation. */
    PutGroupPolicy("iam:PutGroupPolicy"),

    /** Action for the PutRolePolicy operation. */
    PutRolePolicy("iam:PutRolePolicy"),

    /** Action for the PutUserPolicy operation. */
    PutUserPolicy("iam:PutUserPolicy"),

    /** Action for the RemoveRoleFromInstanceProfile operation. */
    RemoveRoleFromInstanceProfile("iam:RemoveRoleFromInstanceProfile"),

    /** Action for the RemoveUserFromGroup operation. */
    RemoveUserFromGroup("iam:RemoveUserFromGroup"),

    /** Action for the ResyncMFADevice operation. */
    ResyncMFADevice("iam:ResyncMFADevice"),

    /** Action for the UpdateAccessKey operation. */
    UpdateAccessKey("iam:UpdateAccessKey"),

    /** Action for the UpdateAccountPasswordPolicy operation. */
    UpdateAccountPasswordPolicy("iam:UpdateAccountPasswordPolicy"),

    /** Action for the UpdateAssumeRolePolicy operation. */
    UpdateAssumeRolePolicy("iam:UpdateAssumeRolePolicy"),

    /** Action for the UpdateGroup operation. */
    UpdateGroup("iam:UpdateGroup"),

    /** Action for the UpdateLoginProfile operation. */
    UpdateLoginProfile("iam:UpdateLoginProfile"),

    /** Action for the UpdateServerCertificate operation. */
    UpdateServerCertificate("iam:UpdateServerCertificate"),

    /** Action for the UpdateSigningCertificate operation. */
    UpdateSigningCertificate("iam:UpdateSigningCertificate"),

    /** Action for the UpdateUser operation. */
    UpdateUser("iam:UpdateUser"),

    /** Action for the UploadServerCertificate operation. */
    UploadServerCertificate("iam:UploadServerCertificate"),

    /** Action for the UploadSigningCertificate operation. */
    UploadSigningCertificate("iam:UploadSigningCertificate");

    private final String action;

    private IdentityManagementActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return action;
    }
}