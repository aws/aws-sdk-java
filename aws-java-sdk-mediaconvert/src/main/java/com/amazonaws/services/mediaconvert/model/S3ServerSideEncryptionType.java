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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data
 * keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted
 * content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3
 * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose
 * AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master
 * key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different,
 * customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting KMS ARN
 * (kmsKeyArn).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum S3ServerSideEncryptionType {

    SERVER_SIDE_ENCRYPTION_S3("SERVER_SIDE_ENCRYPTION_S3"),
    SERVER_SIDE_ENCRYPTION_KMS("SERVER_SIDE_ENCRYPTION_KMS");

    private String value;

    private S3ServerSideEncryptionType(String value) {
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
     * @return S3ServerSideEncryptionType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static S3ServerSideEncryptionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (S3ServerSideEncryptionType enumEntry : S3ServerSideEncryptionType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
