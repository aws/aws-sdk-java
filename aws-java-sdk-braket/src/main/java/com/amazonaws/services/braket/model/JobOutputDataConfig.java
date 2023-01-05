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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the path to the S3 location where you want to store job artifacts and the encryption key used to store
 * them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/JobOutputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobOutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts at
     * rest using Amazon S3 server-side encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     */
    private String s3Path;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts at
     * rest using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts
     *        at rest using Amazon S3 server-side encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts at
     * rest using Amazon S3 server-side encryption.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training
     *         artifacts at rest using Amazon S3 server-side encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts at
     * rest using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts
     *        at rest using Amazon S3 server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutputDataConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3Path
     *        Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     */

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @return Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     */

    public String getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3Path
     *        Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutputDataConfig withS3Path(String s3Path) {
        setS3Path(s3Path);
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
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobOutputDataConfig == false)
            return false;
        JobOutputDataConfig other = (JobOutputDataConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        return hashCode;
    }

    @Override
    public JobOutputDataConfig clone() {
        try {
            return (JobOutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.JobOutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
