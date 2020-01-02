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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output configuration for monitoring jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringOutputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * </p>
     */
    private java.util.List<MonitoringOutput> monitoringOutputs;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * </p>
     * 
     * @return Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is
     *         uploaded.
     */

    public java.util.List<MonitoringOutput> getMonitoringOutputs() {
        return monitoringOutputs;
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * </p>
     * 
     * @param monitoringOutputs
     *        Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is
     *        uploaded.
     */

    public void setMonitoringOutputs(java.util.Collection<MonitoringOutput> monitoringOutputs) {
        if (monitoringOutputs == null) {
            this.monitoringOutputs = null;
            return;
        }

        this.monitoringOutputs = new java.util.ArrayList<MonitoringOutput>(monitoringOutputs);
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringOutputs(java.util.Collection)} or {@link #withMonitoringOutputs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param monitoringOutputs
     *        Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is
     *        uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringOutputConfig withMonitoringOutputs(MonitoringOutput... monitoringOutputs) {
        if (this.monitoringOutputs == null) {
            setMonitoringOutputs(new java.util.ArrayList<MonitoringOutput>(monitoringOutputs.length));
        }
        for (MonitoringOutput ele : monitoringOutputs) {
            this.monitoringOutputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * </p>
     * 
     * @param monitoringOutputs
     *        Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is
     *        uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringOutputConfig withMonitoringOutputs(java.util.Collection<MonitoringOutput> monitoringOutputs) {
        setMonitoringOutputs(monitoringOutputs);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *        rest using Amazon S3 server-side encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *         rest using Amazon S3 server-side encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *        rest using Amazon S3 server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringOutputConfig withKmsKeyId(String kmsKeyId) {
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
        if (getMonitoringOutputs() != null)
            sb.append("MonitoringOutputs: ").append(getMonitoringOutputs()).append(",");
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

        if (obj instanceof MonitoringOutputConfig == false)
            return false;
        MonitoringOutputConfig other = (MonitoringOutputConfig) obj;
        if (other.getMonitoringOutputs() == null ^ this.getMonitoringOutputs() == null)
            return false;
        if (other.getMonitoringOutputs() != null && other.getMonitoringOutputs().equals(this.getMonitoringOutputs()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringOutputs() == null) ? 0 : getMonitoringOutputs().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringOutputConfig clone() {
        try {
            return (MonitoringOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
