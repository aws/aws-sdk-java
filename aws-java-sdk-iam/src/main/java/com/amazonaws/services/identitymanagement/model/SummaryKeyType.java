/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

/**
 * Summary Key Type
 */
public enum SummaryKeyType {
    
    Users("Users"),
    UsersQuota("UsersQuota"),
    Groups("Groups"),
    GroupsQuota("GroupsQuota"),
    ServerCertificates("ServerCertificates"),
    ServerCertificatesQuota("ServerCertificatesQuota"),
    UserPolicySizeQuota("UserPolicySizeQuota"),
    GroupPolicySizeQuota("GroupPolicySizeQuota"),
    GroupsPerUserQuota("GroupsPerUserQuota"),
    SigningCertificatesPerUserQuota("SigningCertificatesPerUserQuota"),
    AccessKeysPerUserQuota("AccessKeysPerUserQuota"),
    MFADevices("MFADevices"),
    MFADevicesInUse("MFADevicesInUse"),
    AccountMFAEnabled("AccountMFAEnabled"),
    AccountAccessKeysPresent("AccountAccessKeysPresent"),
    AccountSigningCertificatesPresent("AccountSigningCertificatesPresent"),
    AttachedPoliciesPerGroupQuota("AttachedPoliciesPerGroupQuota"),
    AttachedPoliciesPerRoleQuota("AttachedPoliciesPerRoleQuota"),
    AttachedPoliciesPerUserQuota("AttachedPoliciesPerUserQuota"),
    Policies("Policies"),
    PoliciesQuota("PoliciesQuota"),
    PolicySizeQuota("PolicySizeQuota"),
    PolicyVersionsInUse("PolicyVersionsInUse"),
    PolicyVersionsInUseQuota("PolicyVersionsInUseQuota"),
    VersionsPerPolicyQuota("VersionsPerPolicyQuota");

    private String value;

    private SummaryKeyType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return SummaryKeyType corresponding to the value
     */
    public static SummaryKeyType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Users".equals(value)) {
            return SummaryKeyType.Users;
        } else if ("UsersQuota".equals(value)) {
            return SummaryKeyType.UsersQuota;
        } else if ("Groups".equals(value)) {
            return SummaryKeyType.Groups;
        } else if ("GroupsQuota".equals(value)) {
            return SummaryKeyType.GroupsQuota;
        } else if ("ServerCertificates".equals(value)) {
            return SummaryKeyType.ServerCertificates;
        } else if ("ServerCertificatesQuota".equals(value)) {
            return SummaryKeyType.ServerCertificatesQuota;
        } else if ("UserPolicySizeQuota".equals(value)) {
            return SummaryKeyType.UserPolicySizeQuota;
        } else if ("GroupPolicySizeQuota".equals(value)) {
            return SummaryKeyType.GroupPolicySizeQuota;
        } else if ("GroupsPerUserQuota".equals(value)) {
            return SummaryKeyType.GroupsPerUserQuota;
        } else if ("SigningCertificatesPerUserQuota".equals(value)) {
            return SummaryKeyType.SigningCertificatesPerUserQuota;
        } else if ("AccessKeysPerUserQuota".equals(value)) {
            return SummaryKeyType.AccessKeysPerUserQuota;
        } else if ("MFADevices".equals(value)) {
            return SummaryKeyType.MFADevices;
        } else if ("MFADevicesInUse".equals(value)) {
            return SummaryKeyType.MFADevicesInUse;
        } else if ("AccountMFAEnabled".equals(value)) {
            return SummaryKeyType.AccountMFAEnabled;
        } else if ("AccountAccessKeysPresent".equals(value)) {
            return SummaryKeyType.AccountAccessKeysPresent;
        } else if ("AccountSigningCertificatesPresent".equals(value)) {
            return SummaryKeyType.AccountSigningCertificatesPresent;
        } else if ("AttachedPoliciesPerGroupQuota".equals(value)) {
            return SummaryKeyType.AttachedPoliciesPerGroupQuota;
        } else if ("AttachedPoliciesPerRoleQuota".equals(value)) {
            return SummaryKeyType.AttachedPoliciesPerRoleQuota;
        } else if ("AttachedPoliciesPerUserQuota".equals(value)) {
            return SummaryKeyType.AttachedPoliciesPerUserQuota;
        } else if ("Policies".equals(value)) {
            return SummaryKeyType.Policies;
        } else if ("PoliciesQuota".equals(value)) {
            return SummaryKeyType.PoliciesQuota;
        } else if ("PolicySizeQuota".equals(value)) {
            return SummaryKeyType.PolicySizeQuota;
        } else if ("PolicyVersionsInUse".equals(value)) {
            return SummaryKeyType.PolicyVersionsInUse;
        } else if ("PolicyVersionsInUseQuota".equals(value)) {
            return SummaryKeyType.PolicyVersionsInUseQuota;
        } else if ("VersionsPerPolicyQuota".equals(value)) {
            return SummaryKeyType.VersionsPerPolicyQuota;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    