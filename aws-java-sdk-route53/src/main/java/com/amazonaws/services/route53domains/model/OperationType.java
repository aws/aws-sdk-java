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

package com.amazonaws.services.route53domains.model;

/**
 * 
 */
public enum OperationType {

    REGISTER_DOMAIN("REGISTER_DOMAIN"),
    DELETE_DOMAIN("DELETE_DOMAIN"),
    TRANSFER_IN_DOMAIN("TRANSFER_IN_DOMAIN"),
    UPDATE_DOMAIN_CONTACT("UPDATE_DOMAIN_CONTACT"),
    UPDATE_NAMESERVER("UPDATE_NAMESERVER"),
    CHANGE_PRIVACY_PROTECTION("CHANGE_PRIVACY_PROTECTION"),
    DOMAIN_LOCK("DOMAIN_LOCK");

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
     */
    public static OperationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("REGISTER_DOMAIN".equals(value)) {
            return REGISTER_DOMAIN;
        } else if ("DELETE_DOMAIN".equals(value)) {
            return DELETE_DOMAIN;
        } else if ("TRANSFER_IN_DOMAIN".equals(value)) {
            return TRANSFER_IN_DOMAIN;
        } else if ("UPDATE_DOMAIN_CONTACT".equals(value)) {
            return UPDATE_DOMAIN_CONTACT;
        } else if ("UPDATE_NAMESERVER".equals(value)) {
            return UPDATE_NAMESERVER;
        } else if ("CHANGE_PRIVACY_PROTECTION".equals(value)) {
            return CHANGE_PRIVACY_PROTECTION;
        } else if ("DOMAIN_LOCK".equals(value)) {
            return DOMAIN_LOCK;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}