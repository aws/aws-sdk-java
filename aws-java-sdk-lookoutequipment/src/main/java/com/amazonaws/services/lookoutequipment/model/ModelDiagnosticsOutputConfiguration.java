/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Output configuration information for the pointwise model diagnostics for an Amazon Lookout for Equipment model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ModelDiagnosticsOutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDiagnosticsOutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location for the pointwise model diagnostics.
     * </p>
     */
    private ModelDiagnosticsS3OutputConfiguration s3OutputConfiguration;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model diagnostics
     * files.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon S3 location for the pointwise model diagnostics.
     * </p>
     * 
     * @param s3OutputConfiguration
     *        The Amazon S3 location for the pointwise model diagnostics.
     */

    public void setS3OutputConfiguration(ModelDiagnosticsS3OutputConfiguration s3OutputConfiguration) {
        this.s3OutputConfiguration = s3OutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location for the pointwise model diagnostics.
     * </p>
     * 
     * @return The Amazon S3 location for the pointwise model diagnostics.
     */

    public ModelDiagnosticsS3OutputConfiguration getS3OutputConfiguration() {
        return this.s3OutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location for the pointwise model diagnostics.
     * </p>
     * 
     * @param s3OutputConfiguration
     *        The Amazon S3 location for the pointwise model diagnostics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDiagnosticsOutputConfiguration withS3OutputConfiguration(ModelDiagnosticsS3OutputConfiguration s3OutputConfiguration) {
        setS3OutputConfiguration(s3OutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model diagnostics
     * files.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model
     *        diagnostics files.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model diagnostics
     * files.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model
     *         diagnostics files.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model diagnostics
     * files.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (KMS) key identifier to encrypt the pointwise model
     *        diagnostics files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDiagnosticsOutputConfiguration withKmsKeyId(String kmsKeyId) {
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

        if (obj instanceof ModelDiagnosticsOutputConfiguration == false)
            return false;
        ModelDiagnosticsOutputConfiguration other = (ModelDiagnosticsOutputConfiguration) obj;
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
    public ModelDiagnosticsOutputConfiguration clone() {
        try {
            return (ModelDiagnosticsOutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.ModelDiagnosticsOutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
