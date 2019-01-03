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
 * The available AWS access control policy actions for IAM.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum IdentityManagementActions implements Action {

    /** Represents any action executed on IAM. */
    AllIdentityManagementActions("iam:*"),

    /** Action for the AddClientIDToOpenIDConnectProvider operation. */
    AddClientIDToOpenIDConnectProvider("iam:AddClientIDToOpenIDConnectProvider"),
    /** Action for the AddRoleToInstanceProfile operation. */
    AddRoleToInstanceProfile("iam:AddRoleToInstanceProfile"),
    /** Action for the AddUserToGroup operation. */
    AddUserToGroup("iam:AddUserToGroup"),
    /** Action for the AttachGroupPolicy operation. */
    AttachGroupPolicy("iam:AttachGroupPolicy"),
    /** Action for the AttachRolePolicy operation. */
    AttachRolePolicy("iam:AttachRolePolicy"),
    /** Action for the AttachUserPolicy operation. */
    AttachUserPolicy("iam:AttachUserPolicy"),
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
    /** Action for the CreateOpenIDConnectProvider operation. */
    CreateOpenIDConnectProvider("iam:CreateOpenIDConnectProvider"),
    /** Action for the CreatePolicy operation. */
    CreatePolicy("iam:CreatePolicy"),
    /** Action for the CreatePolicyVersion operation. */
    CreatePolicyVersion("iam:CreatePolicyVersion"),
    /** Action for the CreateRole operation. */
    CreateRole("iam:CreateRole"),
    /** Action for the CreateSAMLProvider operation. */
    CreateSAMLProvider("iam:CreateSAMLProvider"),
    /** Action for the CreateServiceLinkedRole operation. */
    CreateServiceLinkedRole("iam:CreateServiceLinkedRole"),
    /** Action for the CreateServiceSpecificCredential operation. */
    CreateServiceSpecificCredential("iam:CreateServiceSpecificCredential"),
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
    /** Action for the DeleteOpenIDConnectProvider operation. */
    DeleteOpenIDConnectProvider("iam:DeleteOpenIDConnectProvider"),
    /** Action for the DeletePolicy operation. */
    DeletePolicy("iam:DeletePolicy"),
    /** Action for the DeletePolicyVersion operation. */
    DeletePolicyVersion("iam:DeletePolicyVersion"),
    /** Action for the DeleteRole operation. */
    DeleteRole("iam:DeleteRole"),
    /** Action for the DeleteRolePermissionsBoundary operation. */
    DeleteRolePermissionsBoundary("iam:DeleteRolePermissionsBoundary"),
    /** Action for the DeleteRolePolicy operation. */
    DeleteRolePolicy("iam:DeleteRolePolicy"),
    /** Action for the DeleteSAMLProvider operation. */
    DeleteSAMLProvider("iam:DeleteSAMLProvider"),
    /** Action for the DeleteSSHPublicKey operation. */
    DeleteSSHPublicKey("iam:DeleteSSHPublicKey"),
    /** Action for the DeleteServerCertificate operation. */
    DeleteServerCertificate("iam:DeleteServerCertificate"),
    /** Action for the DeleteServiceLinkedRole operation. */
    DeleteServiceLinkedRole("iam:DeleteServiceLinkedRole"),
    /** Action for the DeleteServiceSpecificCredential operation. */
    DeleteServiceSpecificCredential("iam:DeleteServiceSpecificCredential"),
    /** Action for the DeleteSigningCertificate operation. */
    DeleteSigningCertificate("iam:DeleteSigningCertificate"),
    /** Action for the DeleteUser operation. */
    DeleteUser("iam:DeleteUser"),
    /** Action for the DeleteUserPermissionsBoundary operation. */
    DeleteUserPermissionsBoundary("iam:DeleteUserPermissionsBoundary"),
    /** Action for the DeleteUserPolicy operation. */
    DeleteUserPolicy("iam:DeleteUserPolicy"),
    /** Action for the DeleteVirtualMFADevice operation. */
    DeleteVirtualMFADevice("iam:DeleteVirtualMFADevice"),
    /** Action for the DetachGroupPolicy operation. */
    DetachGroupPolicy("iam:DetachGroupPolicy"),
    /** Action for the DetachRolePolicy operation. */
    DetachRolePolicy("iam:DetachRolePolicy"),
    /** Action for the DetachUserPolicy operation. */
    DetachUserPolicy("iam:DetachUserPolicy"),
    /** Action for the EnableMFADevice operation. */
    EnableMFADevice("iam:EnableMFADevice"),
    /** Action for the GenerateCredentialReport operation. */
    GenerateCredentialReport("iam:GenerateCredentialReport"),
    /** Action for the GenerateServiceLastAccessedDetails operation. */
    GenerateServiceLastAccessedDetails("iam:GenerateServiceLastAccessedDetails"),
    /** Action for the GetAccessKeyLastUsed operation. */
    GetAccessKeyLastUsed("iam:GetAccessKeyLastUsed"),
    /** Action for the GetAccountAuthorizationDetails operation. */
    GetAccountAuthorizationDetails("iam:GetAccountAuthorizationDetails"),
    /** Action for the GetAccountPasswordPolicy operation. */
    GetAccountPasswordPolicy("iam:GetAccountPasswordPolicy"),
    /** Action for the GetAccountSummary operation. */
    GetAccountSummary("iam:GetAccountSummary"),
    /** Action for the GetContextKeysForCustomPolicy operation. */
    GetContextKeysForCustomPolicy("iam:GetContextKeysForCustomPolicy"),
    /** Action for the GetContextKeysForPrincipalPolicy operation. */
    GetContextKeysForPrincipalPolicy("iam:GetContextKeysForPrincipalPolicy"),
    /** Action for the GetCredentialReport operation. */
    GetCredentialReport("iam:GetCredentialReport"),
    /** Action for the GetGroup operation. */
    GetGroup("iam:GetGroup"),
    /** Action for the GetGroupPolicy operation. */
    GetGroupPolicy("iam:GetGroupPolicy"),
    /** Action for the GetInstanceProfile operation. */
    GetInstanceProfile("iam:GetInstanceProfile"),
    /** Action for the GetLoginProfile operation. */
    GetLoginProfile("iam:GetLoginProfile"),
    /** Action for the GetOpenIDConnectProvider operation. */
    GetOpenIDConnectProvider("iam:GetOpenIDConnectProvider"),
    /** Action for the GetPolicy operation. */
    GetPolicy("iam:GetPolicy"),
    /** Action for the GetPolicyVersion operation. */
    GetPolicyVersion("iam:GetPolicyVersion"),
    /** Action for the GetRole operation. */
    GetRole("iam:GetRole"),
    /** Action for the GetRolePolicy operation. */
    GetRolePolicy("iam:GetRolePolicy"),
    /** Action for the GetSAMLProvider operation. */
    GetSAMLProvider("iam:GetSAMLProvider"),
    /** Action for the GetSSHPublicKey operation. */
    GetSSHPublicKey("iam:GetSSHPublicKey"),
    /** Action for the GetServerCertificate operation. */
    GetServerCertificate("iam:GetServerCertificate"),
    /** Action for the GetServiceLastAccessedDetails operation. */
    GetServiceLastAccessedDetails("iam:GetServiceLastAccessedDetails"),
    /** Action for the GetServiceLastAccessedDetailsWithEntities operation. */
    GetServiceLastAccessedDetailsWithEntities("iam:GetServiceLastAccessedDetailsWithEntities"),
    /** Action for the GetServiceLinkedRoleDeletionStatus operation. */
    GetServiceLinkedRoleDeletionStatus("iam:GetServiceLinkedRoleDeletionStatus"),
    /** Action for the GetUser operation. */
    GetUser("iam:GetUser"),
    /** Action for the GetUserPolicy operation. */
    GetUserPolicy("iam:GetUserPolicy"),
    /** Action for the ListAccessKeys operation. */
    ListAccessKeys("iam:ListAccessKeys"),
    /** Action for the ListAccountAliases operation. */
    ListAccountAliases("iam:ListAccountAliases"),
    /** Action for the ListAttachedGroupPolicies operation. */
    ListAttachedGroupPolicies("iam:ListAttachedGroupPolicies"),
    /** Action for the ListAttachedRolePolicies operation. */
    ListAttachedRolePolicies("iam:ListAttachedRolePolicies"),
    /** Action for the ListAttachedUserPolicies operation. */
    ListAttachedUserPolicies("iam:ListAttachedUserPolicies"),
    /** Action for the ListEntitiesForPolicy operation. */
    ListEntitiesForPolicy("iam:ListEntitiesForPolicy"),
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
    /** Action for the ListOpenIDConnectProviders operation. */
    ListOpenIDConnectProviders("iam:ListOpenIDConnectProviders"),
    /** Action for the ListPolicies operation. */
    ListPolicies("iam:ListPolicies"),
    /** Action for the ListPoliciesGrantingServiceAccess operation. */
    ListPoliciesGrantingServiceAccess("iam:ListPoliciesGrantingServiceAccess"),
    /** Action for the ListPolicyVersions operation. */
    ListPolicyVersions("iam:ListPolicyVersions"),
    /** Action for the ListRolePolicies operation. */
    ListRolePolicies("iam:ListRolePolicies"),
    /** Action for the ListRoleTags operation. */
    ListRoleTags("iam:ListRoleTags"),
    /** Action for the ListRoles operation. */
    ListRoles("iam:ListRoles"),
    /** Action for the ListSAMLProviders operation. */
    ListSAMLProviders("iam:ListSAMLProviders"),
    /** Action for the ListSSHPublicKeys operation. */
    ListSSHPublicKeys("iam:ListSSHPublicKeys"),
    /** Action for the ListServerCertificates operation. */
    ListServerCertificates("iam:ListServerCertificates"),
    /** Action for the ListServiceSpecificCredentials operation. */
    ListServiceSpecificCredentials("iam:ListServiceSpecificCredentials"),
    /** Action for the ListSigningCertificates operation. */
    ListSigningCertificates("iam:ListSigningCertificates"),
    /** Action for the ListUserPolicies operation. */
    ListUserPolicies("iam:ListUserPolicies"),
    /** Action for the ListUserTags operation. */
    ListUserTags("iam:ListUserTags"),
    /** Action for the ListUsers operation. */
    ListUsers("iam:ListUsers"),
    /** Action for the ListVirtualMFADevices operation. */
    ListVirtualMFADevices("iam:ListVirtualMFADevices"),
    /** Action for the PutGroupPolicy operation. */
    PutGroupPolicy("iam:PutGroupPolicy"),
    /** Action for the PutRolePermissionsBoundary operation. */
    PutRolePermissionsBoundary("iam:PutRolePermissionsBoundary"),
    /** Action for the PutRolePolicy operation. */
    PutRolePolicy("iam:PutRolePolicy"),
    /** Action for the PutUserPermissionsBoundary operation. */
    PutUserPermissionsBoundary("iam:PutUserPermissionsBoundary"),
    /** Action for the PutUserPolicy operation. */
    PutUserPolicy("iam:PutUserPolicy"),
    /** Action for the RemoveClientIDFromOpenIDConnectProvider operation. */
    RemoveClientIDFromOpenIDConnectProvider("iam:RemoveClientIDFromOpenIDConnectProvider"),
    /** Action for the RemoveRoleFromInstanceProfile operation. */
    RemoveRoleFromInstanceProfile("iam:RemoveRoleFromInstanceProfile"),
    /** Action for the RemoveUserFromGroup operation. */
    RemoveUserFromGroup("iam:RemoveUserFromGroup"),
    /** Action for the ResetServiceSpecificCredential operation. */
    ResetServiceSpecificCredential("iam:ResetServiceSpecificCredential"),
    /** Action for the ResyncMFADevice operation. */
    ResyncMFADevice("iam:ResyncMFADevice"),
    /** Action for the SetDefaultPolicyVersion operation. */
    SetDefaultPolicyVersion("iam:SetDefaultPolicyVersion"),
    /** Action for the SimulateCustomPolicy operation. */
    SimulateCustomPolicy("iam:SimulateCustomPolicy"),
    /** Action for the SimulatePrincipalPolicy operation. */
    SimulatePrincipalPolicy("iam:SimulatePrincipalPolicy"),
    /** Action for the TagRole operation. */
    TagRole("iam:TagRole"),
    /** Action for the TagUser operation. */
    TagUser("iam:TagUser"),
    /** Action for the UntagRole operation. */
    UntagRole("iam:UntagRole"),
    /** Action for the UntagUser operation. */
    UntagUser("iam:UntagUser"),
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
    /** Action for the UpdateOpenIDConnectProviderThumbprint operation. */
    UpdateOpenIDConnectProviderThumbprint("iam:UpdateOpenIDConnectProviderThumbprint"),
    /** Action for the UpdateRole operation. */
    UpdateRole("iam:UpdateRole"),
    /** Action for the UpdateRoleDescription operation. */
    UpdateRoleDescription("iam:UpdateRoleDescription"),
    /** Action for the UpdateSAMLProvider operation. */
    UpdateSAMLProvider("iam:UpdateSAMLProvider"),
    /** Action for the UpdateSSHPublicKey operation. */
    UpdateSSHPublicKey("iam:UpdateSSHPublicKey"),
    /** Action for the UpdateServerCertificate operation. */
    UpdateServerCertificate("iam:UpdateServerCertificate"),
    /** Action for the UpdateServiceSpecificCredential operation. */
    UpdateServiceSpecificCredential("iam:UpdateServiceSpecificCredential"),
    /** Action for the UpdateSigningCertificate operation. */
    UpdateSigningCertificate("iam:UpdateSigningCertificate"),
    /** Action for the UpdateUser operation. */
    UpdateUser("iam:UpdateUser"),
    /** Action for the UploadSSHPublicKey operation. */
    UploadSSHPublicKey("iam:UploadSSHPublicKey"),
    /** Action for the UploadServerCertificate operation. */
    UploadServerCertificate("iam:UploadServerCertificate"),
    /** Action for the UploadSigningCertificate operation. */
    UploadSigningCertificate("iam:UploadSigningCertificate"),
    PassRole("iam:PassRole"),

    ;

    private final String action;

    private IdentityManagementActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
