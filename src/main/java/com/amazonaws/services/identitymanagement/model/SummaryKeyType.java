/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    AccountMFAEnabled("AccountMFAEnabled");

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
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    