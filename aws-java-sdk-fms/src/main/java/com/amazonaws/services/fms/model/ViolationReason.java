/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ViolationReason {

    WEB_ACL_MISSING_RULE_GROUP("WEB_ACL_MISSING_RULE_GROUP"),
    RESOURCE_MISSING_WEB_ACL("RESOURCE_MISSING_WEB_ACL"),
    RESOURCE_INCORRECT_WEB_ACL("RESOURCE_INCORRECT_WEB_ACL"),
    RESOURCE_MISSING_SHIELD_PROTECTION("RESOURCE_MISSING_SHIELD_PROTECTION"),
    RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION("RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION"),
    RESOURCE_MISSING_SECURITY_GROUP("RESOURCE_MISSING_SECURITY_GROUP"),
    RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP("RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP"),
    SECURITY_GROUP_UNUSED("SECURITY_GROUP_UNUSED"),
    SECURITY_GROUP_REDUNDANT("SECURITY_GROUP_REDUNDANT"),
    FMS_CREATED_SECURITY_GROUP_EDITED("FMS_CREATED_SECURITY_GROUP_EDITED"),
    MISSING_FIREWALL("MISSING_FIREWALL"),
    MISSING_FIREWALL_SUBNET_IN_AZ("MISSING_FIREWALL_SUBNET_IN_AZ"),
    MISSING_EXPECTED_ROUTE_TABLE("MISSING_EXPECTED_ROUTE_TABLE"),
    NETWORK_FIREWALL_POLICY_MODIFIED("NETWORK_FIREWALL_POLICY_MODIFIED"),
    INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE("INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE"),
    FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE("FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE"),
    UNEXPECTED_FIREWALL_ROUTES("UNEXPECTED_FIREWALL_ROUTES"),
    UNEXPECTED_TARGET_GATEWAY_ROUTES("UNEXPECTED_TARGET_GATEWAY_ROUTES"),
    TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY("TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY"),
    INVALID_ROUTE_CONFIGURATION("INVALID_ROUTE_CONFIGURATION"),
    MISSING_TARGET_GATEWAY("MISSING_TARGET_GATEWAY"),
    INTERNET_TRAFFIC_NOT_INSPECTED("INTERNET_TRAFFIC_NOT_INSPECTED"),
    BLACK_HOLE_ROUTE_DETECTED("BLACK_HOLE_ROUTE_DETECTED"),
    BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET("BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET"),
    RESOURCE_MISSING_DNS_FIREWALL("RESOURCE_MISSING_DNS_FIREWALL");

    private String value;

    private ViolationReason(String value) {
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
     * @return ViolationReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ViolationReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ViolationReason enumEntry : ViolationReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
