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
package com.amazonaws.services.certificatemanager.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ExtendedKeyUsageName {

    TLS_WEB_SERVER_AUTHENTICATION("TLS_WEB_SERVER_AUTHENTICATION"),
    TLS_WEB_CLIENT_AUTHENTICATION("TLS_WEB_CLIENT_AUTHENTICATION"),
    CODE_SIGNING("CODE_SIGNING"),
    EMAIL_PROTECTION("EMAIL_PROTECTION"),
    TIME_STAMPING("TIME_STAMPING"),
    OCSP_SIGNING("OCSP_SIGNING"),
    IPSEC_END_SYSTEM("IPSEC_END_SYSTEM"),
    IPSEC_TUNNEL("IPSEC_TUNNEL"),
    IPSEC_USER("IPSEC_USER"),
    ANY("ANY"),
    NONE("NONE"),
    CUSTOM("CUSTOM");

    private String value;

    private ExtendedKeyUsageName(String value) {
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
     * @return ExtendedKeyUsageName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExtendedKeyUsageName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExtendedKeyUsageName enumEntry : ExtendedKeyUsageName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
