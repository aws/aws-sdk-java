/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeviceStatusDetailCode {

    DEVICE_SOFTWARE_UPDATE_NEEDED("DEVICE_SOFTWARE_UPDATE_NEEDED"),
    DEVICE_WAS_OFFLINE("DEVICE_WAS_OFFLINE"),
    CREDENTIALS_ACCESS_FAILURE("CREDENTIALS_ACCESS_FAILURE"),
    TLS_VERSION_MISMATCH("TLS_VERSION_MISMATCH"),
    ASSOCIATION_REJECTION("ASSOCIATION_REJECTION"),
    AUTHENTICATION_FAILURE("AUTHENTICATION_FAILURE"),
    DHCP_FAILURE("DHCP_FAILURE"),
    INTERNET_UNAVAILABLE("INTERNET_UNAVAILABLE"),
    DNS_FAILURE("DNS_FAILURE"),
    UNKNOWN_FAILURE("UNKNOWN_FAILURE"),
    CERTIFICATE_ISSUING_LIMIT_EXCEEDED("CERTIFICATE_ISSUING_LIMIT_EXCEEDED"),
    INVALID_CERTIFICATE_AUTHORITY("INVALID_CERTIFICATE_AUTHORITY"),
    NETWORK_PROFILE_NOT_FOUND("NETWORK_PROFILE_NOT_FOUND"),
    INVALID_PASSWORD_STATE("INVALID_PASSWORD_STATE"),
    PASSWORD_NOT_FOUND("PASSWORD_NOT_FOUND");

    private String value;

    private DeviceStatusDetailCode(String value) {
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
     * @return DeviceStatusDetailCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeviceStatusDetailCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeviceStatusDetailCode enumEntry : DeviceStatusDetailCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
