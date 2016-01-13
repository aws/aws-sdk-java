/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
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
     *        real value
     * @return SummaryKeyType corresponding to the value
     */
    public static SummaryKeyType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Users".equals(value)) {
            return Users;
        } else if ("UsersQuota".equals(value)) {
            return UsersQuota;
        } else if ("Groups".equals(value)) {
            return Groups;
        } else if ("GroupsQuota".equals(value)) {
            return GroupsQuota;
        } else if ("ServerCertificates".equals(value)) {
            return ServerCertificates;
        } else if ("ServerCertificatesQuota".equals(value)) {
            return ServerCertificatesQuota;
        } else if ("UserPolicySizeQuota".equals(value)) {
            return UserPolicySizeQuota;
        } else if ("GroupPolicySizeQuota".equals(value)) {
            return GroupPolicySizeQuota;
        } else if ("GroupsPerUserQuota".equals(value)) {
            return GroupsPerUserQuota;
        } else if ("SigningCertificatesPerUserQuota".equals(value)) {
            return SigningCertificatesPerUserQuota;
        } else if ("AccessKeysPerUserQuota".equals(value)) {
            return AccessKeysPerUserQuota;
        } else if ("MFADevices".equals(value)) {
            return MFADevices;
        } else if ("MFADevicesInUse".equals(value)) {
            return MFADevicesInUse;
        } else if ("AccountMFAEnabled".equals(value)) {
            return AccountMFAEnabled;
        } else if ("AccountAccessKeysPresent".equals(value)) {
            return AccountAccessKeysPresent;
        } else if ("AccountSigningCertificatesPresent".equals(value)) {
            return AccountSigningCertificatesPresent;
        } else if ("AttachedPoliciesPerGroupQuota".equals(value)) {
            return AttachedPoliciesPerGroupQuota;
        } else if ("AttachedPoliciesPerRoleQuota".equals(value)) {
            return AttachedPoliciesPerRoleQuota;
        } else if ("AttachedPoliciesPerUserQuota".equals(value)) {
            return AttachedPoliciesPerUserQuota;
        } else if ("Policies".equals(value)) {
            return Policies;
        } else if ("PoliciesQuota".equals(value)) {
            return PoliciesQuota;
        } else if ("PolicySizeQuota".equals(value)) {
            return PolicySizeQuota;
        } else if ("PolicyVersionsInUse".equals(value)) {
            return PolicyVersionsInUse;
        } else if ("PolicyVersionsInUseQuota".equals(value)) {
            return PolicyVersionsInUseQuota;
        } else if ("VersionsPerPolicyQuota".equals(value)) {
            return VersionsPerPolicyQuota;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}