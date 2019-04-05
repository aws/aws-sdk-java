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
package com.amazonaws.services.route53domains.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OperationType {

    REGISTER_DOMAIN("REGISTER_DOMAIN"),
    DELETE_DOMAIN("DELETE_DOMAIN"),
    TRANSFER_IN_DOMAIN("TRANSFER_IN_DOMAIN"),
    UPDATE_DOMAIN_CONTACT("UPDATE_DOMAIN_CONTACT"),
    UPDATE_NAMESERVER("UPDATE_NAMESERVER"),
    CHANGE_PRIVACY_PROTECTION("CHANGE_PRIVACY_PROTECTION"),
    DOMAIN_LOCK("DOMAIN_LOCK"),
    ENABLE_AUTORENEW("ENABLE_AUTORENEW"),
    DISABLE_AUTORENEW("DISABLE_AUTORENEW"),
    ADD_DNSSEC("ADD_DNSSEC"),
    REMOVE_DNSSEC("REMOVE_DNSSEC"),
    EXPIRE_DOMAIN("EXPIRE_DOMAIN"),
    TRANSFER_OUT_DOMAIN("TRANSFER_OUT_DOMAIN"),
    CHANGE_DOMAIN_OWNER("CHANGE_DOMAIN_OWNER"),
    RENEW_DOMAIN("RENEW_DOMAIN"),
    PUSH_DOMAIN("PUSH_DOMAIN");

    private String value;

    private OperationType(String value) {
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
     * @return OperationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OperationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OperationType enumEntry : OperationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
