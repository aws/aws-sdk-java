/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OcsfEventClass {

    ACCESS_ACTIVITY("ACCESS_ACTIVITY"),
    FILE_ACTIVITY("FILE_ACTIVITY"),
    KERNEL_ACTIVITY("KERNEL_ACTIVITY"),
    KERNEL_EXTENSION("KERNEL_EXTENSION"),
    MEMORY_ACTIVITY("MEMORY_ACTIVITY"),
    MODULE_ACTIVITY("MODULE_ACTIVITY"),
    PROCESS_ACTIVITY("PROCESS_ACTIVITY"),
    REGISTRY_KEY_ACTIVITY("REGISTRY_KEY_ACTIVITY"),
    REGISTRY_VALUE_ACTIVITY("REGISTRY_VALUE_ACTIVITY"),
    RESOURCE_ACTIVITY("RESOURCE_ACTIVITY"),
    SCHEDULED_JOB_ACTIVITY("SCHEDULED_JOB_ACTIVITY"),
    SECURITY_FINDING("SECURITY_FINDING"),
    ACCOUNT_CHANGE("ACCOUNT_CHANGE"),
    AUTHENTICATION("AUTHENTICATION"),
    AUTHORIZATION("AUTHORIZATION"),
    ENTITY_MANAGEMENT_AUDIT("ENTITY_MANAGEMENT_AUDIT"),
    DHCP_ACTIVITY("DHCP_ACTIVITY"),
    NETWORK_ACTIVITY("NETWORK_ACTIVITY"),
    DNS_ACTIVITY("DNS_ACTIVITY"),
    FTP_ACTIVITY("FTP_ACTIVITY"),
    HTTP_ACTIVITY("HTTP_ACTIVITY"),
    RDP_ACTIVITY("RDP_ACTIVITY"),
    SMB_ACTIVITY("SMB_ACTIVITY"),
    SSH_ACTIVITY("SSH_ACTIVITY"),
    CLOUD_API("CLOUD_API"),
    CONTAINER_LIFECYCLE("CONTAINER_LIFECYCLE"),
    DATABASE_LIFECYCLE("DATABASE_LIFECYCLE"),
    CONFIG_STATE("CONFIG_STATE"),
    CLOUD_STORAGE("CLOUD_STORAGE"),
    INVENTORY_INFO("INVENTORY_INFO"),
    RFB_ACTIVITY("RFB_ACTIVITY"),
    SMTP_ACTIVITY("SMTP_ACTIVITY"),
    VIRTUAL_MACHINE_ACTIVITY("VIRTUAL_MACHINE_ACTIVITY");

    private String value;

    private OcsfEventClass(String value) {
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
     * @return OcsfEventClass corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OcsfEventClass fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OcsfEventClass enumEntry : OcsfEventClass.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
