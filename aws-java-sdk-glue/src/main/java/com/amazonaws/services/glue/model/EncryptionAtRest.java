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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the encryption-at-rest configuration for the Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EncryptionAtRest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionAtRest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     */
    private String catalogEncryptionMode;
    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     */
    private String sseAwsKmsKeyId;

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * 
     * @param catalogEncryptionMode
     *        The encryption-at-rest mode for encrypting Data Catalog data.
     * @see CatalogEncryptionMode
     */

    public void setCatalogEncryptionMode(String catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * 
     * @return The encryption-at-rest mode for encrypting Data Catalog data.
     * @see CatalogEncryptionMode
     */

    public String getCatalogEncryptionMode() {
        return this.catalogEncryptionMode;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * 
     * @param catalogEncryptionMode
     *        The encryption-at-rest mode for encrypting Data Catalog data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogEncryptionMode
     */

    public EncryptionAtRest withCatalogEncryptionMode(String catalogEncryptionMode) {
        setCatalogEncryptionMode(catalogEncryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * 
     * @param catalogEncryptionMode
     *        The encryption-at-rest mode for encrypting Data Catalog data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogEncryptionMode
     */

    public EncryptionAtRest withCatalogEncryptionMode(CatalogEncryptionMode catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * 
     * @param sseAwsKmsKeyId
     *        The ID of the AWS KMS key to use for encryption at rest.
     */

    public void setSseAwsKmsKeyId(String sseAwsKmsKeyId) {
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * 
     * @return The ID of the AWS KMS key to use for encryption at rest.
     */

    public String getSseAwsKmsKeyId() {
        return this.sseAwsKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * 
     * @param sseAwsKmsKeyId
     *        The ID of the AWS KMS key to use for encryption at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionAtRest withSseAwsKmsKeyId(String sseAwsKmsKeyId) {
        setSseAwsKmsKeyId(sseAwsKmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalogEncryptionMode() != null)
            sb.append("CatalogEncryptionMode: ").append(getCatalogEncryptionMode()).append(",");
        if (getSseAwsKmsKeyId() != null)
            sb.append("SseAwsKmsKeyId: ").append(getSseAwsKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAtRest == false)
            return false;
        EncryptionAtRest other = (EncryptionAtRest) obj;
        if (other.getCatalogEncryptionMode() == null ^ this.getCatalogEncryptionMode() == null)
            return false;
        if (other.getCatalogEncryptionMode() != null && other.getCatalogEncryptionMode().equals(this.getCatalogEncryptionMode()) == false)
            return false;
        if (other.getSseAwsKmsKeyId() == null ^ this.getSseAwsKmsKeyId() == null)
            return false;
        if (other.getSseAwsKmsKeyId() != null && other.getSseAwsKmsKeyId().equals(this.getSseAwsKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogEncryptionMode() == null) ? 0 : getCatalogEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getSseAwsKmsKeyId() == null) ? 0 : getSseAwsKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionAtRest clone() {
        try {
            return (EncryptionAtRest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EncryptionAtRestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
