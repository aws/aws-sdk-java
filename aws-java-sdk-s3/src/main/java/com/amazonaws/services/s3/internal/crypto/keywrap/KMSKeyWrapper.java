/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.keywrap;

import static com.amazonaws.util.BinaryUtils.copyAllBytesFrom;

import java.nio.ByteBuffer;
import java.security.Key;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.services.kms.model.EncryptRequest;
import com.amazonaws.services.kms.model.EncryptResult;
import com.amazonaws.services.s3.model.KMSEncryptionMaterials;

public final class KMSKeyWrapper implements KeyWrapper {
    private final KMSEncryptionMaterials encryptionMaterials;
    private final KMSKeyWrapperContext kmsKeyWrapperContext;

    private KMSKeyWrapper(Builder b) {
        this.encryptionMaterials = validateNotNull(b.encryptionMaterials, "encryptionMaterials");
        this.kmsKeyWrapperContext = validateNotNull(b.kmsKeyWrapperContext, "kmsKeyWrapperContext");
    }

    public static Builder builder() {
        return new Builder();
    }

    public KMSEncryptionMaterials encryptionMaterials() {
        return this.encryptionMaterials;
    }

    public KMSKeyWrapperContext kmsKeyWrapperContext() {
        return this.kmsKeyWrapperContext;
    }

    @Override
    public byte[] unwrapCek(byte[] encryptedCek, Key key) {
        DecryptRequest kmsreq = new DecryptRequest()
                                        .withKeyId(encryptionMaterials.getCustomerMasterKeyId())
                                        .withEncryptionContext(kmsKeyWrapperContext.kmsMaterialsDescription())
                                        .withCiphertextBlob(ByteBuffer.wrap(encryptedCek));
        DecryptResult result = kmsKeyWrapperContext.kms().decrypt(kmsreq);
        return copyAllBytesFrom(result.getPlaintext());
    }

    @Override
    public byte[] wrapCek(byte[] plaintextCek, Key key) {
        EncryptRequest encryptRequest = new EncryptRequest()
                .withEncryptionContext(kmsKeyWrapperContext.kmsMaterialsDescription())
                .withKeyId(encryptionMaterials.getCustomerMasterKeyId())
                .withPlaintext(ByteBuffer.wrap(plaintextCek));
        if (kmsKeyWrapperContext.originalRequest() != null) {
            AmazonWebServiceRequest originalRequest = kmsKeyWrapperContext.originalRequest();
            encryptRequest.withGeneralProgressListener(originalRequest.getGeneralProgressListener())
                          .withRequestMetricCollector(originalRequest.getRequestMetricCollector());
        }
        EncryptResult encryptResult = kmsKeyWrapperContext.kms().encrypt(encryptRequest);
        return copyAllBytesFrom(encryptResult.getCiphertextBlob());
    }

    private <T> T validateNotNull(T obj, String propertyName) {
        if (obj == null) {
            throw new NullPointerException("Error initializing KMSKeyWrapper: '" + propertyName +
                                               "' cannot be null");
        }

        return obj;
    }

    public final static class Builder {
        private KMSEncryptionMaterials encryptionMaterials;
        private KMSKeyWrapperContext kmsKeyWrapperContext;

        private Builder() {
        }

        public Builder encryptionMaterials(KMSEncryptionMaterials encryptionMaterials) {
            this.encryptionMaterials = encryptionMaterials;
            return this;
        }

        public Builder kmsKeyWrapperContext(KMSKeyWrapperContext kmsKeyWrapperContext) {
            this.kmsKeyWrapperContext = kmsKeyWrapperContext;
            return this;
        }

        public KMSKeyWrapper build() {
            return new KMSKeyWrapper(this);
        }
    }
}
