/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportS3DataInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportS3DataInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The URL to the Amazon S3 data input.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Key Management Service (KMS) key ID for server-side encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @return The Amazon Key Management Service (KMS) key ID for server-side encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportS3DataInput withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data input.
     * </p>
     * 
     * @param s3Uri
     *        The URL to the Amazon S3 data input.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data input.
     * </p>
     * 
     * @return The URL to the Amazon S3 data input.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data input.
     * </p>
     * 
     * @param s3Uri
     *        The URL to the Amazon S3 data input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportS3DataInput withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportS3DataInput == false)
            return false;
        ExportS3DataInput other = (ExportS3DataInput) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public ExportS3DataInput clone() {
        try {
            return (ExportS3DataInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ExportS3DataInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
