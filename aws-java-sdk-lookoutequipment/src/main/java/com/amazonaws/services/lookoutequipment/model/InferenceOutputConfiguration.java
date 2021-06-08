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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration information for the output results from for the inference, including KMS key ID and output S3
 * location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceOutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceOutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference, output S3 location.
     * </p>
     */
    private InferenceS3OutputConfiguration s3OutputConfiguration;
    /**
     * <p>
     * The ID number for the AWS KMS key used to encrypt the inference output.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference, output S3 location.
     * </p>
     * 
     * @param s3OutputConfiguration
     *        Specifies configuration information for the output results from for the inference, output S3 location.
     */

    public void setS3OutputConfiguration(InferenceS3OutputConfiguration s3OutputConfiguration) {
        this.s3OutputConfiguration = s3OutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference, output S3 location.
     * </p>
     * 
     * @return Specifies configuration information for the output results from for the inference, output S3 location.
     */

    public InferenceS3OutputConfiguration getS3OutputConfiguration() {
        return this.s3OutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference, output S3 location.
     * </p>
     * 
     * @param s3OutputConfiguration
     *        Specifies configuration information for the output results from for the inference, output S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceOutputConfiguration withS3OutputConfiguration(InferenceS3OutputConfiguration s3OutputConfiguration) {
        setS3OutputConfiguration(s3OutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID number for the AWS KMS key used to encrypt the inference output.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID number for the AWS KMS key used to encrypt the inference output.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID number for the AWS KMS key used to encrypt the inference output.
     * </p>
     * 
     * @return The ID number for the AWS KMS key used to encrypt the inference output.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID number for the AWS KMS key used to encrypt the inference output.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID number for the AWS KMS key used to encrypt the inference output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceOutputConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getS3OutputConfiguration() != null)
            sb.append("S3OutputConfiguration: ").append(getS3OutputConfiguration()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceOutputConfiguration == false)
            return false;
        InferenceOutputConfiguration other = (InferenceOutputConfiguration) obj;
        if (other.getS3OutputConfiguration() == null ^ this.getS3OutputConfiguration() == null)
            return false;
        if (other.getS3OutputConfiguration() != null && other.getS3OutputConfiguration().equals(this.getS3OutputConfiguration()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputConfiguration() == null) ? 0 : getS3OutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public InferenceOutputConfiguration clone() {
        try {
            return (InferenceOutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceOutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
