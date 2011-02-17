/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * summary Key Type
 */
public enum summaryKeyType {
    
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
    AccessKeysPerUserQuota("AccessKeysPerUserQuota");

    private String value;

    private summaryKeyType(String value) {
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
     * @return summaryKeyType corresponding to the value
     */
    public static summaryKeyType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Users".equals(value)) {
            return summaryKeyType.Users;
        } else if ("UsersQuota".equals(value)) {
            return summaryKeyType.UsersQuota;
        } else if ("Groups".equals(value)) {
            return summaryKeyType.Groups;
        } else if ("GroupsQuota".equals(value)) {
            return summaryKeyType.GroupsQuota;
        } else if ("ServerCertificates".equals(value)) {
            return summaryKeyType.ServerCertificates;
        } else if ("ServerCertificatesQuota".equals(value)) {
            return summaryKeyType.ServerCertificatesQuota;
        } else if ("UserPolicySizeQuota".equals(value)) {
            return summaryKeyType.UserPolicySizeQuota;
        } else if ("GroupPolicySizeQuota".equals(value)) {
            return summaryKeyType.GroupPolicySizeQuota;
        } else if ("GroupsPerUserQuota".equals(value)) {
            return summaryKeyType.GroupsPerUserQuota;
        } else if ("SigningCertificatesPerUserQuota".equals(value)) {
            return summaryKeyType.SigningCertificatesPerUserQuota;
        } else if ("AccessKeysPerUserQuota".equals(value)) {
            return summaryKeyType.AccessKeysPerUserQuota;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    