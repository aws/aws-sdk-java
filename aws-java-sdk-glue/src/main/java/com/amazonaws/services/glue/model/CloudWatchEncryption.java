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
 * Specifies how CloudWatch data should be encrypted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CloudWatchEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption mode to use for CloudWatch data.
     * </p>
     */
    private String cloudWatchEncryptionMode;
    /**
     * <p>
     * The AWS ARN of the KMS key to be used to encrypt the data.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The encryption mode to use for CloudWatch data.
     * </p>
     * 
     * @param cloudWatchEncryptionMode
     *        The encryption mode to use for CloudWatch data.
     * @see CloudWatchEncryptionMode
     */

    public void setCloudWatchEncryptionMode(String cloudWatchEncryptionMode) {
        this.cloudWatchEncryptionMode = cloudWatchEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for CloudWatch data.
     * </p>
     * 
     * @return The encryption mode to use for CloudWatch data.
     * @see CloudWatchEncryptionMode
     */

    public String getCloudWatchEncryptionMode() {
        return this.cloudWatchEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for CloudWatch data.
     * </p>
     * 
     * @param cloudWatchEncryptionMode
     *        The encryption mode to use for CloudWatch data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchEncryptionMode
     */

    public CloudWatchEncryption withCloudWatchEncryptionMode(String cloudWatchEncryptionMode) {
        setCloudWatchEncryptionMode(cloudWatchEncryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption mode to use for CloudWatch data.
     * </p>
     * 
     * @param cloudWatchEncryptionMode
     *        The encryption mode to use for CloudWatch data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchEncryptionMode
     */

    public CloudWatchEncryption withCloudWatchEncryptionMode(CloudWatchEncryptionMode cloudWatchEncryptionMode) {
        this.cloudWatchEncryptionMode = cloudWatchEncryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The AWS ARN of the KMS key to be used to encrypt the data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The AWS ARN of the KMS key to be used to encrypt the data.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The AWS ARN of the KMS key to be used to encrypt the data.
     * </p>
     * 
     * @return The AWS ARN of the KMS key to be used to encrypt the data.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The AWS ARN of the KMS key to be used to encrypt the data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The AWS ARN of the KMS key to be used to encrypt the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchEncryption withKmsKeyArn(String kmsKeyArn) {
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
        if (getCloudWatchEncryptionMode() != null)
            sb.append("CloudWatchEncryptionMode: ").append(getCloudWatchEncryptionMode()).append(",");
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

        if (obj instanceof CloudWatchEncryption == false)
            return false;
        CloudWatchEncryption other = (CloudWatchEncryption) obj;
        if (other.getCloudWatchEncryptionMode() == null ^ this.getCloudWatchEncryptionMode() == null)
            return false;
        if (other.getCloudWatchEncryptionMode() != null && other.getCloudWatchEncryptionMode().equals(this.getCloudWatchEncryptionMode()) == false)
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

        hashCode = prime * hashCode + ((getCloudWatchEncryptionMode() == null) ? 0 : getCloudWatchEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchEncryption clone() {
        try {
            return (CloudWatchEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CloudWatchEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
