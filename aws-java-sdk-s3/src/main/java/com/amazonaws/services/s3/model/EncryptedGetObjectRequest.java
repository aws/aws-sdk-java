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
import static com.amazonaws.services.s3.model.ExtraMaterialsDescription.NONE;

import java.util.Map;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.services.s3.KeyWrapException;

/**
 * <p>
 * An extension of {@link GetObjectRequest} to allow additional encryption
 * material description to be specified on a per-request basis. In particular,
 * {@link EncryptedGetObjectRequest} is only recognized by
 * {@link AmazonS3EncryptionClient}.
 * </p>
 * <p>
 * If {@link EncryptedGetObjectRequest} is used against the non-encrypting
 * {@link AmazonS3Client}, the additional attributes will be ignored.
 * </p>
 * <p>
 * The additional material description must not conflict with the existing one
 * saved in S3 or else will cause the get request to fail fast later on.
 */
public class EncryptedGetObjectRequest extends GetObjectRequest implements Serializable {
    /**
     * Request specific additional material description; never null.
     */
    private ExtraMaterialsDescription supplemental = NONE;
    /**
     * Used to retrieve the S3 encrypted object via instruction file with
     * an explicit suffix.  Applicable only if specified (which means non-null
     * and non-blank.)
     */
    private String instructionFileSuffix;
    /**
     * True if the retrieval of the encrypted object expects the CEK to have
     * been key-wrapped; Default is false.
     * <p>
     * Note, however, that if {@link CryptoMode#StrictAuthenticatedEncryption}
     * is in use, key wrapping is always expected for the CEK regardless.
     */
    private boolean keyWrapExpected;

    public EncryptedGetObjectRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    public EncryptedGetObjectRequest(String bucketName, String key,
            String versionId) {
        super(bucketName, key, versionId);
        setKey(key);
        setVersionId(versionId);
    }

    public EncryptedGetObjectRequest(S3ObjectId s3ObjectId) {
        super(s3ObjectId);
    }

    public EncryptedGetObjectRequest(String bucketName, String key,
            boolean isRequesterPays) {
        super(bucketName, key, isRequesterPays);
    }

    /**
     * Returns the supplemental material description to be used for retrieving
     * the encryption materials.
     * 
     * @return the supplemental material description; never null.
     */
    public ExtraMaterialsDescription getExtraMaterialDescription() {
        return supplemental;
    }

    /**
     * Sets the supplemental materials description for the encryption materials
     * to be used with the current request.
     * 
     * @param supplemental
     *            the materialsDescription to set; must not conflict with the
     *            existing one saved in S3 or else will cause the get request to
     *            fail fast later on
     */
    public void setExtraMaterialDescription(
            ExtraMaterialsDescription supplemental) {
        this.supplemental = supplemental == null
            ? NONE : supplemental;
    }

    /**
     * Sets the supplemental materials description for the encryption materials
     * to be used with the current request.
     * 
     * @param supplemental
     *            the materialsDescription to set; must not conflict with the
     *            existing one saved in S3 or else will cause the get request to
     *            fail fast later on
     */
    public EncryptedGetObjectRequest withExtraMaterialsDescription(
            ExtraMaterialsDescription supplemental) {
        setExtraMaterialDescription(supplemental);
        return this;
    }

    /**
     * Fluent API to set the supplemental materials description for the
     * encryption materials to be used with the current request.
     * 
     * @param supplemental
     *            the materialsDescription to set; must not conflict with the
     *            existing one saved in S3 or else will cause the get request to
     *            fail fast later on
     */
    public EncryptedGetObjectRequest withExtraMaterialsDescription(
            Map<String, String> supplemental) {
        setExtraMaterialDescription(supplemental == null ? null
                : new ExtraMaterialsDescription(supplemental));
        return this;
    }

    public String getInstructionFileSuffix() {
        return instructionFileSuffix;
    }

    /**
     * Explicitly sets the suffix of an instruction file to be used to retrieve
     * the S3 encrypted object. Typically this is for more advanced use cases
     * where multiple crypto instruction files have been created for the same S3
     * object. Each instruction file contains the same CEK encrypted under a
     * different KEK, the IV, and other meta information (aka material
     * description).
     * 
     * @param instructionFileSuffix
     *            suffix of the instruction file to be used.
     * 
     * @see AmazonS3EncryptionClient#putInstructionFile(PutInstructionFileRequest)
     */
    public void setInstructionFileSuffix(String instructionFileSuffix) {
        this.instructionFileSuffix = instructionFileSuffix;
    }

    /**
     * Fluent API to explicitly sets the suffix of an instruction file to be
     * used to retrieve the S3 encrypted object. Typically this is for more
     * advanced use cases where multiple crypto instruction files have been
     * created for the same S3 object. Each instruction file contains the same
     * CEK encrypted under a different KEK, the IV, and other meta information
     * (aka material description).
     * 
     * @param instructionFileSuffix
     *            suffix of the instruction file to be used.
     * 
     * @see AmazonS3EncryptionClient#putInstructionFile(PutInstructionFileRequest)
     */
    public EncryptedGetObjectRequest withInstructionFileSuffix(
            String instructionFileSuffix) {
        this.instructionFileSuffix = instructionFileSuffix;
        return this;
    }

    /**
     * Returns true if key wrapping is expected; false otherwise. Note, however,
     * that if {@link CryptoMode#StrictAuthenticatedEncryption} or KMS is in
     * use, key wrapping is always expected for the CEK regardless.
     */
    public boolean isKeyWrapExpected() {
        return keyWrapExpected;
    }

    /**
     * @param keyWrapExpected
     *            true if key wrapping is expected for the CEK; false otherwse.
     *            Note, however, that if
     *            {@link CryptoMode#StrictAuthenticatedEncryption} or KMS is in
     *            use, key wrapping is always expected for the CEK regardless.
     *            <p>
     *            If keyWrapExpected is set to true but the CEK is found to be
     *            not key-wrapped, it would cause a {@link KeyWrapException} to
     *            be thrown.
     */
    public void setKeyWrapExpected(boolean keyWrapExpected) {
        this.keyWrapExpected = keyWrapExpected;
    }

    /**
     * Fluent API for {@link #setKeyWrapExpected(boolean)}.
     */
    public EncryptedGetObjectRequest withKeyWrapExpected(boolean keyWrapExpected) {
        this.keyWrapExpected = keyWrapExpected;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EncryptedGetObjectRequest)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        final EncryptedGetObjectRequest that = (EncryptedGetObjectRequest) o;

        if (keyWrapExpected != that.isKeyWrapExpected()) {
            return false;
        }
        if (supplemental != null ? !supplemental.equals(that.supplemental) : that.supplemental != null) {
            return false;
        }
        return getInstructionFileSuffix() != null ? getInstructionFileSuffix().equals(that.getInstructionFileSuffix()) : that.getInstructionFileSuffix() == null;
    }

    @Override
    public int hashCode() {
        int prime = 31;

        int result = super.hashCode();
        result = prime * result + (supplemental != null ? supplemental.hashCode() : 0);
        result = prime * result + (getInstructionFileSuffix() != null ? getInstructionFileSuffix().hashCode() : 0);
        result = prime * result + (isKeyWrapExpected() ? 1 : 0);
        return result;
    }
}
