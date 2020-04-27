/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Encryption configuration of the export job. Includes the encryption type as well as the AWS KMS key. The KMS key is
 * only necessary if you chose the KMS encryption type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ExportServerSideEncryption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportServerSideEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This
     * parameter is required if you choose aws:kms as an encryption type.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in Amazon S3.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This
     * parameter is required if you choose aws:kms as an encryption type.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects.
     *        This parameter is required if you choose aws:kms as an encryption type.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This
     * parameter is required if you choose aws:kms as an encryption type.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects.
     *         This parameter is required if you choose aws:kms as an encryption type.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This
     * parameter is required if you choose aws:kms as an encryption type.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects.
     *        This parameter is required if you choose aws:kms as an encryption type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerSideEncryption withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in Amazon S3.
     * </p>
     * 
     * @param type
     *        The type of server side encryption used for encrypting the objects in Amazon S3.
     * @see ServerSideEncryptionTypes
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in Amazon S3.
     * </p>
     * 
     * @return The type of server side encryption used for encrypting the objects in Amazon S3.
     * @see ServerSideEncryptionTypes
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in Amazon S3.
     * </p>
     * 
     * @param type
     *        The type of server side encryption used for encrypting the objects in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionTypes
     */

    public ExportServerSideEncryption withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in Amazon S3.
     * </p>
     * 
     * @param type
     *        The type of server side encryption used for encrypting the objects in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionTypes
     */

    public ExportServerSideEncryption withType(ServerSideEncryptionTypes type) {
        this.type = type.toString();
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerSideEncryption == false)
            return false;
        ExportServerSideEncryption other = (ExportServerSideEncryption) obj;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ExportServerSideEncryption clone() {
        try {
            return (ExportServerSideEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ExportServerSideEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
