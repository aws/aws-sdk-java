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

package com.amazonaws.services.kms.model;

/**
 * 
 */
public enum GrantOperation {

    Decrypt("Decrypt"),
    Encrypt("Encrypt"),
    GenerateDataKey("GenerateDataKey"),
    GenerateDataKeyWithoutPlaintext("GenerateDataKeyWithoutPlaintext"),
    ReEncryptFrom("ReEncryptFrom"),
    ReEncryptTo("ReEncryptTo"),
    CreateGrant("CreateGrant"),
    RetireGrant("RetireGrant"),
    DescribeKey("DescribeKey");

    private String value;

    private GrantOperation(String value) {
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
     * @return GrantOperation corresponding to the value
     */
    public static GrantOperation fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Decrypt".equals(value)) {
            return Decrypt;
        } else if ("Encrypt".equals(value)) {
            return Encrypt;
        } else if ("GenerateDataKey".equals(value)) {
            return GenerateDataKey;
        } else if ("GenerateDataKeyWithoutPlaintext".equals(value)) {
            return GenerateDataKeyWithoutPlaintext;
        } else if ("ReEncryptFrom".equals(value)) {
            return ReEncryptFrom;
        } else if ("ReEncryptTo".equals(value)) {
            return ReEncryptTo;
        } else if ("CreateGrant".equals(value)) {
            return CreateGrant;
        } else if ("RetireGrant".equals(value)) {
            return RetireGrant;
        } else if ("DescribeKey".equals(value)) {
            return DescribeKey;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}