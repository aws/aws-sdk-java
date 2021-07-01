/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Simple Storage (Amazon S3) location and and security configuration for <code>OfflineStore</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/S3StorageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3StorageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.
     * </p>
     * <p>
     * S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written into
     * the <code>OfflineStore</code> S3 location.
     * </p>
     * <p>
     * The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have below
     * permissions to the <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The S3 path where offline records are written.
     * </p>
     */
    private String resolvedOutputS3Uri;

    /**
     * <p>
     * The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.
     * </p>
     * <p>
     * S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.</p>
     *        <p>
     *        S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.
     * </p>
     * <p>
     * S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     * </p>
     * 
     * @return The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.</p>
     *         <p>
     *         S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.
     * </p>
     * <p>
     * S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI, or location in Amazon S3, of <code>OfflineStore</code>.</p>
     *        <p>
     *        S3 URIs have a format similar to the following: <code>s3://example-bucket/prefix/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3StorageConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written into
     * the <code>OfflineStore</code> S3 location.
     * </p>
     * <p>
     * The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have below
     * permissions to the <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written
     *        into the <code>OfflineStore</code> S3 location.</p>
     *        <p>
     *        The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have
     *        below permissions to the <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:GenerateDataKey"</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written into
     * the <code>OfflineStore</code> S3 location.
     * </p>
     * <p>
     * The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have below
     * permissions to the <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects
     *         written into the <code>OfflineStore</code> S3 location.</p>
     *         <p>
     *         The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have
     *         below permissions to the <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"kms:GenerateDataKey"</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written into
     * the <code>OfflineStore</code> S3 location.
     * </p>
     * <p>
     * The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have below
     * permissions to the <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written
     *        into the <code>OfflineStore</code> S3 location.</p>
     *        <p>
     *        The IAM <code>roleARN</code> that is passed as a parameter to <code>CreateFeatureGroup</code> must have
     *        below permissions to the <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:GenerateDataKey"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3StorageConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The S3 path where offline records are written.
     * </p>
     * 
     * @param resolvedOutputS3Uri
     *        The S3 path where offline records are written.
     */

    public void setResolvedOutputS3Uri(String resolvedOutputS3Uri) {
        this.resolvedOutputS3Uri = resolvedOutputS3Uri;
    }

    /**
     * <p>
     * The S3 path where offline records are written.
     * </p>
     * 
     * @return The S3 path where offline records are written.
     */

    public String getResolvedOutputS3Uri() {
        return this.resolvedOutputS3Uri;
    }

    /**
     * <p>
     * The S3 path where offline records are written.
     * </p>
     * 
     * @param resolvedOutputS3Uri
     *        The S3 path where offline records are written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3StorageConfig withResolvedOutputS3Uri(String resolvedOutputS3Uri) {
        setResolvedOutputS3Uri(resolvedOutputS3Uri);
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getResolvedOutputS3Uri() != null)
            sb.append("ResolvedOutputS3Uri: ").append(getResolvedOutputS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3StorageConfig == false)
            return false;
        S3StorageConfig other = (S3StorageConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResolvedOutputS3Uri() == null ^ this.getResolvedOutputS3Uri() == null)
            return false;
        if (other.getResolvedOutputS3Uri() != null && other.getResolvedOutputS3Uri().equals(this.getResolvedOutputS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResolvedOutputS3Uri() == null) ? 0 : getResolvedOutputS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public S3StorageConfig clone() {
        try {
            return (S3StorageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.S3StorageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
