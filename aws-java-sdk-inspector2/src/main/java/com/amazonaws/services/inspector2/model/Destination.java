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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of the Amazon S3 bucket and KMS key used to export findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket to export findings to.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix of the KMS key used to export findings.
     * </p>
     */
    private String keyPrefix;
    /**
     * <p>
     * The ARN of the KMS key used to encrypt data when exporting findings.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the Amazon S3 bucket to export findings to.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket to export findings to.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export findings to.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to export findings to.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export findings to.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket to export findings to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix of the KMS key used to export findings.
     * </p>
     * 
     * @param keyPrefix
     *        The prefix of the KMS key used to export findings.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The prefix of the KMS key used to export findings.
     * </p>
     * 
     * @return The prefix of the KMS key used to export findings.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The prefix of the KMS key used to export findings.
     * </p>
     * 
     * @param keyPrefix
     *        The prefix of the KMS key used to export findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt data when exporting findings.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt data when exporting findings.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt data when exporting findings.
     * </p>
     * 
     * @return The ARN of the KMS key used to encrypt data when exporting findings.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt data when exporting findings.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt data when exporting findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
