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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data security configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DataSecurityConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSecurityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either
     * of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String modelKmsKeyId;
    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     */
    private String volumeKmsKeyId;
    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     * </p>
     */
    private String dataLakeKmsKeyId;

    private VpcConfig vpcConfig;

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either
     * of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either
     * of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be
     *         either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getModelKmsKeyId() {
        return this.modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either
     * of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSecurityConfig withModelKmsKeyId(String modelKmsKeyId) {
        setModelKmsKeyId(modelKmsKeyId);
        return this;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * 
     * @return ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSecurityConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     * </p>
     * 
     * @param dataLakeKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     */

    public void setDataLakeKmsKeyId(String dataLakeKmsKeyId) {
        this.dataLakeKmsKeyId = dataLakeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     * </p>
     * 
     * @return ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     */

    public String getDataLakeKmsKeyId() {
        return this.dataLakeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     * </p>
     * 
     * @param dataLakeKmsKeyId
     *        ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSecurityConfig withDataLakeKmsKeyId(String dataLakeKmsKeyId) {
        setDataLakeKmsKeyId(dataLakeKmsKeyId);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSecurityConfig withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getModelKmsKeyId() != null)
            sb.append("ModelKmsKeyId: ").append(getModelKmsKeyId()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId()).append(",");
        if (getDataLakeKmsKeyId() != null)
            sb.append("DataLakeKmsKeyId: ").append(getDataLakeKmsKeyId()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSecurityConfig == false)
            return false;
        DataSecurityConfig other = (DataSecurityConfig) obj;
        if (other.getModelKmsKeyId() == null ^ this.getModelKmsKeyId() == null)
            return false;
        if (other.getModelKmsKeyId() != null && other.getModelKmsKeyId().equals(this.getModelKmsKeyId()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getDataLakeKmsKeyId() == null ^ this.getDataLakeKmsKeyId() == null)
            return false;
        if (other.getDataLakeKmsKeyId() != null && other.getDataLakeKmsKeyId().equals(this.getDataLakeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelKmsKeyId() == null) ? 0 : getModelKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataLakeKmsKeyId() == null) ? 0 : getDataLakeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public DataSecurityConfig clone() {
        try {
            return (DataSecurityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DataSecurityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
