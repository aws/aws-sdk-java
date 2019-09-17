/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/**
 * Contains the bucket name, file format, bucket owner (optional),
 * and prefix (optional) where inventory results are published.
 */
public class InventoryS3BucketDestination implements Serializable {

    private String accountId;

    private String bucketArn;

    private String format;

    private String prefix;

    private InventoryEncryption encryption;

    /**
     * Returns the account ID that owns the destination bucket.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the account ID that owns the destination bucket.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the account ID that owns the destination bucket
     * and returns this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    public InventoryS3BucketDestination withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * Returns the Amazon resource name (ARN) of the bucket where inventory results will be published.
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * Sets the Amazon resource name (ARN) of the bucket where inventory results will be published.
     */
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * Sets the Amazon resource name (ARN) of the bucket where inventory results will be published.
     *
     * The {@link InventoryS3BucketDestination} object is returned for method chaining.
     */
    public InventoryS3BucketDestination withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * Returns the output format of the inventory results.
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the output format of the inventory results.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Sets the output format of the inventory results.
     */
    public void setFormat(InventoryFormat format) {
        setFormat(format == null ? (String) null : format.toString());
    }

    /**
     * Sets the output format of the inventory results
     * and returns this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    public InventoryS3BucketDestination withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * Sets the output format of the inventory results
     * and returns this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    public InventoryS3BucketDestination withFormat(InventoryFormat format) {
        setFormat(format);
        return this;
    }

    /**
     * Returns the prefix that is prepended to all inventory results.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix that is prepended to all inventory results.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the prefix that is prepended to all inventory results
     * and returns this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    public InventoryS3BucketDestination withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * @return The type of encryption to use to protect the inventory contents. Will be null if encryption is not enabled.
     */
    public InventoryEncryption getEncryption() {
        return encryption;
    }

    /**
     * Set the type of encryption to use to protect the inventory contents.
     *
     * @param encryption Encryption to use. See {@link ServerSideEncryptionS3} and {@link ServerSideEncryptionKMS}.
     */
    public void setEncryption(InventoryEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * Set the type of encryption to use to protect the inventory contents.
     *
     * @param encryption Encryption to use. See {@link ServerSideEncryptionS3} and {@link ServerSideEncryptionKMS}.
     * @return This object for method chaining.
     */
    public InventoryS3BucketDestination withEncryption(InventoryEncryption encryption) {
        setEncryption(encryption);
        return this;
    }
}
