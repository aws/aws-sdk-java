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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A container for resource data. The container takes only one of the following supported resource data types:
 * ''LocalDeviceResourceData'', ''LocalVolumeResourceData'', ''SageMakerMachineLearningModelResourceData'',
 * ''S3MachineLearningModelResourceData'', ''SecretsManagerSecretResourceData''.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResourceDataContainer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataContainer implements Serializable, Cloneable, StructuredPojo {

    /** Attributes that define the local device resource. */
    private LocalDeviceResourceData localDeviceResourceData;
    /** Attributes that define the local volume resource. */
    private LocalVolumeResourceData localVolumeResourceData;
    /** Attributes that define an Amazon S3 machine learning resource. */
    private S3MachineLearningModelResourceData s3MachineLearningModelResourceData;
    /** Attributes that define an Amazon SageMaker machine learning resource. */
    private SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData;
    /** Attributes that define a secret resource, which references a secret from AWS Secrets Manager. */
    private SecretsManagerSecretResourceData secretsManagerSecretResourceData;

    /**
     * Attributes that define the local device resource.
     * 
     * @param localDeviceResourceData
     *        Attributes that define the local device resource.
     */

    public void setLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
    }

    /**
     * Attributes that define the local device resource.
     * 
     * @return Attributes that define the local device resource.
     */

    public LocalDeviceResourceData getLocalDeviceResourceData() {
        return this.localDeviceResourceData;
    }

    /**
     * Attributes that define the local device resource.
     * 
     * @param localDeviceResourceData
     *        Attributes that define the local device resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        setLocalDeviceResourceData(localDeviceResourceData);
        return this;
    }

    /**
     * Attributes that define the local volume resource.
     * 
     * @param localVolumeResourceData
     *        Attributes that define the local volume resource.
     */

    public void setLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
    }

    /**
     * Attributes that define the local volume resource.
     * 
     * @return Attributes that define the local volume resource.
     */

    public LocalVolumeResourceData getLocalVolumeResourceData() {
        return this.localVolumeResourceData;
    }

    /**
     * Attributes that define the local volume resource.
     * 
     * @param localVolumeResourceData
     *        Attributes that define the local volume resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        setLocalVolumeResourceData(localVolumeResourceData);
        return this;
    }

    /**
     * Attributes that define an Amazon S3 machine learning resource.
     * 
     * @param s3MachineLearningModelResourceData
     *        Attributes that define an Amazon S3 machine learning resource.
     */

    public void setS3MachineLearningModelResourceData(S3MachineLearningModelResourceData s3MachineLearningModelResourceData) {
        this.s3MachineLearningModelResourceData = s3MachineLearningModelResourceData;
    }

    /**
     * Attributes that define an Amazon S3 machine learning resource.
     * 
     * @return Attributes that define an Amazon S3 machine learning resource.
     */

    public S3MachineLearningModelResourceData getS3MachineLearningModelResourceData() {
        return this.s3MachineLearningModelResourceData;
    }

    /**
     * Attributes that define an Amazon S3 machine learning resource.
     * 
     * @param s3MachineLearningModelResourceData
     *        Attributes that define an Amazon S3 machine learning resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withS3MachineLearningModelResourceData(S3MachineLearningModelResourceData s3MachineLearningModelResourceData) {
        setS3MachineLearningModelResourceData(s3MachineLearningModelResourceData);
        return this;
    }

    /**
     * Attributes that define an Amazon SageMaker machine learning resource.
     * 
     * @param sageMakerMachineLearningModelResourceData
     *        Attributes that define an Amazon SageMaker machine learning resource.
     */

    public void setSageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
    }

    /**
     * Attributes that define an Amazon SageMaker machine learning resource.
     * 
     * @return Attributes that define an Amazon SageMaker machine learning resource.
     */

    public SageMakerMachineLearningModelResourceData getSageMakerMachineLearningModelResourceData() {
        return this.sageMakerMachineLearningModelResourceData;
    }

    /**
     * Attributes that define an Amazon SageMaker machine learning resource.
     * 
     * @param sageMakerMachineLearningModelResourceData
     *        Attributes that define an Amazon SageMaker machine learning resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withSageMakerMachineLearningModelResourceData(
            SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData) {
        setSageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData);
        return this;
    }

    /**
     * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     * 
     * @param secretsManagerSecretResourceData
     *        Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     */

    public void setSecretsManagerSecretResourceData(SecretsManagerSecretResourceData secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
    }

    /**
     * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     * 
     * @return Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     */

    public SecretsManagerSecretResourceData getSecretsManagerSecretResourceData() {
        return this.secretsManagerSecretResourceData;
    }

    /**
     * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     * 
     * @param secretsManagerSecretResourceData
     *        Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withSecretsManagerSecretResourceData(SecretsManagerSecretResourceData secretsManagerSecretResourceData) {
        setSecretsManagerSecretResourceData(secretsManagerSecretResourceData);
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
        if (getLocalDeviceResourceData() != null)
            sb.append("LocalDeviceResourceData: ").append(getLocalDeviceResourceData()).append(",");
        if (getLocalVolumeResourceData() != null)
            sb.append("LocalVolumeResourceData: ").append(getLocalVolumeResourceData()).append(",");
        if (getS3MachineLearningModelResourceData() != null)
            sb.append("S3MachineLearningModelResourceData: ").append(getS3MachineLearningModelResourceData()).append(",");
        if (getSageMakerMachineLearningModelResourceData() != null)
            sb.append("SageMakerMachineLearningModelResourceData: ").append(getSageMakerMachineLearningModelResourceData()).append(",");
        if (getSecretsManagerSecretResourceData() != null)
            sb.append("SecretsManagerSecretResourceData: ").append(getSecretsManagerSecretResourceData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataContainer == false)
            return false;
        ResourceDataContainer other = (ResourceDataContainer) obj;
        if (other.getLocalDeviceResourceData() == null ^ this.getLocalDeviceResourceData() == null)
            return false;
        if (other.getLocalDeviceResourceData() != null && other.getLocalDeviceResourceData().equals(this.getLocalDeviceResourceData()) == false)
            return false;
        if (other.getLocalVolumeResourceData() == null ^ this.getLocalVolumeResourceData() == null)
            return false;
        if (other.getLocalVolumeResourceData() != null && other.getLocalVolumeResourceData().equals(this.getLocalVolumeResourceData()) == false)
            return false;
        if (other.getS3MachineLearningModelResourceData() == null ^ this.getS3MachineLearningModelResourceData() == null)
            return false;
        if (other.getS3MachineLearningModelResourceData() != null
                && other.getS3MachineLearningModelResourceData().equals(this.getS3MachineLearningModelResourceData()) == false)
            return false;
        if (other.getSageMakerMachineLearningModelResourceData() == null ^ this.getSageMakerMachineLearningModelResourceData() == null)
            return false;
        if (other.getSageMakerMachineLearningModelResourceData() != null
                && other.getSageMakerMachineLearningModelResourceData().equals(this.getSageMakerMachineLearningModelResourceData()) == false)
            return false;
        if (other.getSecretsManagerSecretResourceData() == null ^ this.getSecretsManagerSecretResourceData() == null)
            return false;
        if (other.getSecretsManagerSecretResourceData() != null
                && other.getSecretsManagerSecretResourceData().equals(this.getSecretsManagerSecretResourceData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalDeviceResourceData() == null) ? 0 : getLocalDeviceResourceData().hashCode());
        hashCode = prime * hashCode + ((getLocalVolumeResourceData() == null) ? 0 : getLocalVolumeResourceData().hashCode());
        hashCode = prime * hashCode + ((getS3MachineLearningModelResourceData() == null) ? 0 : getS3MachineLearningModelResourceData().hashCode());
        hashCode = prime * hashCode
                + ((getSageMakerMachineLearningModelResourceData() == null) ? 0 : getSageMakerMachineLearningModelResourceData().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretResourceData() == null) ? 0 : getSecretsManagerSecretResourceData().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataContainer clone() {
        try {
            return (ResourceDataContainer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ResourceDataContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
