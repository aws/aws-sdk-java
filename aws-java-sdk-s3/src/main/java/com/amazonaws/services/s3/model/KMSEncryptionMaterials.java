/*
 * Copyright 2010-20194 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.KeyPair;

import javax.crypto.SecretKey;

/**
 * KMS specific encryption materials.
 * <p>
 * The KEK has no relevance on the client-side, as KMS only requires the CMK
 * id to be used to uniquely identify the KEK on the server side.
 */
public class KMSEncryptionMaterials extends EncryptionMaterials implements Serializable {
    /**
     * Name of the material description to be persisted in S3 for the KMS's
     * customer master key id.
     */
    public static final String CUSTOMER_MASTER_KEY_ID = "kms_cmk_id"; 
    /**
     * @param defaultCustomerMasterKeyId
     *            KMS's customer master key id; must not be null
     */
    public KMSEncryptionMaterials(String defaultCustomerMasterKeyId) {
        super(null, null);
        if (defaultCustomerMasterKeyId == null
                || defaultCustomerMasterKeyId.length() == 0)
            throw new IllegalArgumentException(
                    "The default customer master key id must be specified");
        addDescription(CUSTOMER_MASTER_KEY_ID, defaultCustomerMasterKeyId);
    }

    /**
     * Always throws <code>UnsupportedOperationException</code>.
     */
    @Override
    public final KeyPair getKeyPair() {
        throw new UnsupportedOperationException();
    }

    /**
     * Always throws <code>UnsupportedOperationException</code>.
     */
    @Override
    public final SecretKey getSymmetricKey() {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     * 
     * Always returns true.
     * 
     * @return true
     */
    @Override
    public final boolean isKMSEnabled() {
        return true;
    }

    /**
     * Returns the default KMS's Customer Master Key ID; or null if there
     * isn't one.
     */
    @Override
    public String getCustomerMasterKeyId() {
        return getDescription(CUSTOMER_MASTER_KEY_ID);
    }

    @Override
    public String toString() {
        return String.valueOf(getMaterialsDescription());
    }
}
