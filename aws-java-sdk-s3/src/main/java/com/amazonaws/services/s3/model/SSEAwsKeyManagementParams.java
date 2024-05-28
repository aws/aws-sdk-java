/*
 * Copyright 2014-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The Amazon Web Services Key Management Key id to be used for Server Side Encryption of
     * the Amazon S3 object.
     */
    private String awsKmsKeyId;

    /**
     * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption.
     * The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
     * pairs. This value is stored as object metadata and automatically gets passed on to Amazon Web Services KMS for
     * future <code>GetObject</code> or <code>CopyObject</code> operations on this object.
     */
    private String awsKmsEncryptionContext;

    /**
     * Used to specify the encryption algorithm. use aws:kms by default
     */
    private String sseAlgorithm = SSEAlgorithm.KMS.getAlgorithm();

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams. The default Amazon Web Services
     * KMS Key id is used for encryption.
     */
    public SSEAwsKeyManagementParams() {
        this.awsKmsEncryptionContext = null;
        this.awsKmsKeyId = null;
    }

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams with the user
     * specified Amazon Web Services Key Management System Key Id.
     */
    public SSEAwsKeyManagementParams(String awsKmsKeyId) {
        if (awsKmsKeyId == null || awsKmsKeyId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "AWS Key Management System Key id cannot be null");
        }
        this.awsKmsKeyId = awsKmsKeyId;
        this.awsKmsEncryptionContext = null;
    }

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams with the user
     * specified Amazon Web Services Key Management System Key Id and SSEAlgorithm
     */
    public SSEAwsKeyManagementParams(String awsKmsKeyId, SSEAlgorithm sseAlgorithm) {
        this(awsKmsKeyId);
        setSseAlgorith(sseAlgorithm);
    }

    /**
     * Constructs a new instance of SSEAwsKeyManagementParams with the user
     * specified Amazon Web Services Key Management System Key Id and SSEAlgorithm as String
     */
    public SSEAwsKeyManagementParams(String awsKmsKeyId, String sseAlgorithm) {
        if (awsKmsKeyId == null || awsKmsKeyId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "AWS Key Management System Key id cannot be null");
        }
        setAwsKmsKeyId(awsKmsKeyId);
        setSseAlgorith(sseAlgorithm);
    }

    /**
     * Use Default KMS key with SSE-KMS or SSE-DSSE
     */
    public SSEAwsKeyManagementParams(SSEAlgorithm sseAlgorithm) {
        this();
        setSseAlgorith(sseAlgorithm);
    }

    /**
     * Returns the Amazon Web Services Key Management System Key Id used for encryption. Returns
     * null if default Key Id is used.
     */
    public String getAwsKmsKeyId() {
        return awsKmsKeyId;
    }

    /**
     * Sets the awsKmsKeyId
     *
     * @param awsKmsKeyId The new awsKmsKeyId value.
     * @return This object for method chaining.
     */
    public SSEAwsKeyManagementParams withAwsKmsKeyId(String awsKmsKeyId) {
        setAwsKmsKeyId(awsKmsKeyId);
        return this;
    }

    /**
     * Sets the sseAlgorithm
     *
     * @param sseAlgorithm The new sseAlgorithm value.
     * @return This object for method chaining.
     */
    public SSEAwsKeyManagementParams withSseAlgorithm(String sseAlgorithm) {
        setSseAlgorith(sseAlgorithm);
        return this;
    }

    private void setSseAlgorith(String sseAlgorithm) {
        if (sseAlgorithm == null) {
            throw new IllegalArgumentException(
                    "AWS Key Management System SSEAlgorithm cannot be null");
        }
        this.sseAlgorithm = sseAlgorithm;
    }

    private void setSseAlgorith(SSEAlgorithm sseAlgorithm) {
        if (sseAlgorithm == null) {
            throw new IllegalArgumentException(
                    "AWS Key Management System SSEAlgorithm cannot be null");
        }
        this.sseAlgorithm = sseAlgorithm.getAlgorithm();
    }

    private void setAwsKmsKeyId(String awsKmsKeyId) {
        this.awsKmsKeyId = awsKmsKeyId;
    }

    /**
     * Returns the scheme used for encrypting the Amazon S3 object.
     * the encryption is either the default value "aws:kms" or "aws:kms:dsse".
     */
    public String getEncryption() {
        return sseAlgorithm;
    }


    public String getAwsKmsEncryptionContext() {
        return awsKmsEncryptionContext;
    }

    /**
     * Sets the awsKmsEncryptionContext
     *
     * @param awsKmsEncryptionContext The new awsKmsEncryptionContext value.
     * @return This object for method chaining.
     */
    public SSEAwsKeyManagementParams withAwsKmsEncryptionContext(String awsKmsEncryptionContext) {
        setAwsKmsEncryptionContext(awsKmsEncryptionContext);
        return this;
    }

    private void setAwsKmsEncryptionContext(String awsKmsEncryptionContext) {
        this.awsKmsEncryptionContext = awsKmsEncryptionContext;
    }
}
