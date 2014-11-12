/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Grant Operation
 */
public enum GrantOperation {
    
    Decrypt("Decrypt"),
    Encrypt("Encrypt"),
    GenerateDataKey("GenerateDataKey"),
    GenerateDataKeyWithoutPlaintext("GenerateDataKeyWithoutPlaintext"),
    ReEncryptFrom("ReEncryptFrom"),
    ReEncryptTo("ReEncryptTo"),
    CreateGrant("CreateGrant"),
    RetireGrant("RetireGrant");

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
     *            real value
     * @return GrantOperation corresponding to the value
     */
    public static GrantOperation fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Decrypt".equals(value)) {
            return GrantOperation.Decrypt;
        } else if ("Encrypt".equals(value)) {
            return GrantOperation.Encrypt;
        } else if ("GenerateDataKey".equals(value)) {
            return GrantOperation.GenerateDataKey;
        } else if ("GenerateDataKeyWithoutPlaintext".equals(value)) {
            return GrantOperation.GenerateDataKeyWithoutPlaintext;
        } else if ("ReEncryptFrom".equals(value)) {
            return GrantOperation.ReEncryptFrom;
        } else if ("ReEncryptTo".equals(value)) {
            return GrantOperation.ReEncryptTo;
        } else if ("CreateGrant".equals(value)) {
            return GrantOperation.CreateGrant;
        } else if ("RetireGrant".equals(value)) {
            return GrantOperation.RetireGrant;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    