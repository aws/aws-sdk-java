/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

public class SSEAwsKeyManagementParams implements Serializable {

    /**
     * The AWS Key Management Key id to be used for Server Side Encryption of
     * the Amazon S3 object.
     */
    private final String awsKmsKeyId;

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams. The default AWS
     * KMS Key id is used for encryption.
     */
    public SSEAwsKeyManagementParams() {
        this.awsKmsKeyId = null;
    }

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams with the user
     * specified AWS Key Management System Key Id.
     */
    public SSEAwsKeyManagementParams(String awsKmsKeyId) {
        if (awsKmsKeyId == null || awsKmsKeyId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "AWS Key Management System Key id cannot be null");
        }
        this.awsKmsKeyId = awsKmsKeyId;
    }

    /**
     * Returns the AWS Key Management System Key Id used for encryption. Returns
     * null if default Key Id is used.
     */
    public String getAwsKmsKeyId() {
        return awsKmsKeyId;
    }

    /**
     * Returns the scheme used for encrypting the Amazon S3 object. Currently
     * the encryption is always "aws:kms".
     */
    public String getEncryption() {
        return SSEAlgorithm.KMS.getAlgorithm();
    }
}
