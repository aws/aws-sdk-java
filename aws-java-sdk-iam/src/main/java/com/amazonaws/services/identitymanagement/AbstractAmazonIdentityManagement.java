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
package com.amazonaws.services.identitymanagement;

import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.*;
import com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters;

/**
 * Abstract implementation of {@code AmazonIdentityManagement}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonIdentityManagement implements AmazonIdentityManagement {

    protected AbstractAmazonIdentityManagement() {
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
    public AddClientIDToOpenIDConnectProviderResult addClientIDToOpenIDConnectProvider(AddClientIDToOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddRoleToInstanceProfileResult addRoleToInstanceProfile(AddRoleToInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddUserToGroupResult addUserToGroup(AddUserToGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachGroupPolicyResult attachGroupPolicy(AttachGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachRolePolicyResult attachRolePolicy(AttachRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachUserPolicyResult attachUserPolicy(AttachUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAccessKeyResult createAccessKey() {
        return createAccessKey(new CreateAccessKeyRequest());
    }

    @Override
    public CreateAccountAliasResult createAccountAlias(CreateAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateOpenIDConnectProviderResult createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRoleResult createRole(CreateRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateServiceLinkedRoleResult createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateServiceSpecificCredentialResult createServiceSpecificCredential(CreateServiceSpecificCredentialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeactivateMFADeviceResult deactivateMFADevice(DeactivateMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccessKeyResult deleteAccessKey(DeleteAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy() {
        return deleteAccountPasswordPolicy(new DeleteAccountPasswordPolicyRequest());
    }

    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteGroupPolicyResult deleteGroupPolicy(DeleteGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLoginProfileResult deleteLoginProfile(DeleteLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteOpenIDConnectProviderResult deleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRoleResult deleteRole(DeleteRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRolePermissionsBoundaryResult deleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRolePolicyResult deleteRolePolicy(DeleteRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSAMLProviderResult deleteSAMLProvider(DeleteSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSSHPublicKeyResult deleteSSHPublicKey(DeleteSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServerCertificateResult deleteServerCertificate(DeleteServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServiceLinkedRoleResult deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServiceSpecificCredentialResult deleteServiceSpecificCredential(DeleteServiceSpecificCredentialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSigningCertificateResult deleteSigningCertificate(DeleteSigningCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteUserPermissionsBoundaryResult deleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteUserPolicyResult deleteUserPolicy(DeleteUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVirtualMFADeviceResult deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachGroupPolicyResult detachGroupPolicy(DetachGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachRolePolicyResult detachRolePolicy(DetachRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachUserPolicyResult detachUserPolicy(DetachUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableMFADeviceResult enableMFADevice(EnableMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateCredentialReportResult generateCredentialReport(GenerateCredentialReportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateCredentialReportResult generateCredentialReport() {
        return generateCredentialReport(new GenerateCredentialReportRequest());
    }

    @Override
    public GenerateServiceLastAccessedDetailsResult generateServiceLastAccessedDetails(GenerateServiceLastAccessedDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccessKeyLastUsedResult getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails() {
        return getAccountAuthorizationDetails(new GetAccountAuthorizationDetailsRequest());
    }

    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy() {
        return getAccountPasswordPolicy(new GetAccountPasswordPolicyRequest());
    }

    @Override
    public GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountSummaryResult getAccountSummary() {
        return getAccountSummary(new GetAccountSummaryRequest());
    }

    @Override
    public GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCredentialReportResult getCredentialReport(GetCredentialReportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCredentialReportResult getCredentialReport() {
        return getCredentialReport(new GetCredentialReportRequest());
    }

    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOpenIDConnectProviderResult getOpenIDConnectProvider(GetOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRoleResult getRole(GetRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRolePolicyResult getRolePolicy(GetRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServerCertificateResult getServerCertificate(GetServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceLastAccessedDetailsResult getServiceLastAccessedDetails(GetServiceLastAccessedDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceLastAccessedDetailsWithEntitiesResult getServiceLastAccessedDetailsWithEntities(GetServiceLastAccessedDetailsWithEntitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceLinkedRoleDeletionStatusResult getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserResult getUser(GetUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserResult getUser() {
        return getUser(new GetUserRequest());
    }

    @Override
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccessKeysResult listAccessKeys() {
        return listAccessKeys(new ListAccessKeysRequest());
    }

    @Override
    public ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccountAliasesResult listAccountAliases() {
        return listAccountAliases(new ListAccountAliasesRequest());
    }

    @Override
    public ListAttachedGroupPoliciesResult listAttachedGroupPolicies(ListAttachedGroupPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedRolePoliciesResult listAttachedRolePolicies(ListAttachedRolePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedUserPoliciesResult listAttachedUserPolicies(ListAttachedUserPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEntitiesForPolicyResult listEntitiesForPolicy(ListEntitiesForPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupsResult listGroups() {
        return listGroups(new ListGroupsRequest());
    }

    @Override
    public ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstanceProfilesResult listInstanceProfiles() {
        return listInstanceProfiles(new ListInstanceProfilesRequest());
    }

    @Override
    public ListInstanceProfilesForRoleResult listInstanceProfilesForRole(ListInstanceProfilesForRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMFADevicesResult listMFADevices() {
        return listMFADevices(new ListMFADevicesRequest());
    }

    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders() {
        return listOpenIDConnectProviders(new ListOpenIDConnectProvidersRequest());
    }

    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPoliciesResult listPolicies() {
        return listPolicies(new ListPoliciesRequest());
    }

    @Override
    public ListPoliciesGrantingServiceAccessResult listPoliciesGrantingServiceAccess(ListPoliciesGrantingServiceAccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRoleTagsResult listRoleTags(ListRoleTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolesResult listRoles(ListRolesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolesResult listRoles() {
        return listRoles(new ListRolesRequest());
    }

    @Override
    public ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSAMLProvidersResult listSAMLProviders() {
        return listSAMLProviders(new ListSAMLProvidersRequest());
    }

    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys() {
        return listSSHPublicKeys(new ListSSHPublicKeysRequest());
    }

    @Override
    public ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServerCertificatesResult listServerCertificates() {
        return listServerCertificates(new ListServerCertificatesRequest());
    }

    @Override
    public ListServiceSpecificCredentialsResult listServiceSpecificCredentials(ListServiceSpecificCredentialsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSigningCertificatesResult listSigningCertificates() {
        return listSigningCertificates(new ListSigningCertificatesRequest());
    }

    @Override
    public ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUserTagsResult listUserTags(ListUserTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers() {
        return listUsers(new ListUsersRequest());
    }

    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices() {
        return listVirtualMFADevices(new ListVirtualMFADevicesRequest());
    }

    @Override
    public PutGroupPolicyResult putGroupPolicy(PutGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRolePermissionsBoundaryResult putRolePermissionsBoundary(PutRolePermissionsBoundaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRolePolicyResult putRolePolicy(PutRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutUserPermissionsBoundaryResult putUserPermissionsBoundary(PutUserPermissionsBoundaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutUserPolicyResult putUserPolicy(PutUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveClientIDFromOpenIDConnectProviderResult removeClientIDFromOpenIDConnectProvider(RemoveClientIDFromOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveRoleFromInstanceProfileResult removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveUserFromGroupResult removeUserFromGroup(RemoveUserFromGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetServiceSpecificCredentialResult resetServiceSpecificCredential(ResetServiceSpecificCredentialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResyncMFADeviceResult resyncMFADevice(ResyncMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SimulateCustomPolicyResult simulateCustomPolicy(SimulateCustomPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SimulatePrincipalPolicyResult simulatePrincipalPolicy(SimulatePrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagRoleResult tagRole(TagRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagUserResult tagUser(TagUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagRoleResult untagRole(UntagRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagUserResult untagUser(UntagUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAccessKeyResult updateAccessKey(UpdateAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAccountPasswordPolicyResult updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAssumeRolePolicyResult updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateLoginProfileResult updateLoginProfile(UpdateLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateOpenIDConnectProviderThumbprintResult updateOpenIDConnectProviderThumbprint(UpdateOpenIDConnectProviderThumbprintRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRoleResult updateRole(UpdateRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRoleDescriptionResult updateRoleDescription(UpdateRoleDescriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSSHPublicKeyResult updateSSHPublicKey(UpdateSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServerCertificateResult updateServerCertificate(UpdateServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServiceSpecificCredentialResult updateServiceSpecificCredential(UpdateServiceSpecificCredentialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSigningCertificateResult updateSigningCertificate(UpdateSigningCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest request) {
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

    @Override
    public AmazonIdentityManagementWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
