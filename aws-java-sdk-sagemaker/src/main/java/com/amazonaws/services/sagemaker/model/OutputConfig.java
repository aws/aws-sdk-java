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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the output location for the compiled model and the device (target) that the model runs on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * s3://bucket-name/key-name-prefix.
     * </p>
     */
    private String s3OutputLocation;
    /**
     * <p>
     * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * </p>
     */
    private String targetDevice;

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * s3://bucket-name/key-name-prefix.
     * </p>
     * 
     * @param s3OutputLocation
     *        Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *        s3://bucket-name/key-name-prefix.
     */

    public void setS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * s3://bucket-name/key-name-prefix.
     * </p>
     * 
     * @return Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *         s3://bucket-name/key-name-prefix.
     */

    public String getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * s3://bucket-name/key-name-prefix.
     * </p>
     * 
     * @param s3OutputLocation
     *        Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *        s3://bucket-name/key-name-prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withS3OutputLocation(String s3OutputLocation) {
        setS3OutputLocation(s3OutputLocation);
        return this;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * @see TargetDevice
     */

    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * </p>
     * 
     * @return Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * @see TargetDevice
     */

    public String getTargetDevice() {
        return this.targetDevice;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public OutputConfig withTargetDevice(String targetDevice) {
        setTargetDevice(targetDevice);
        return this;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * </p>
     * 
     * @param targetDevice
     *        Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public OutputConfig withTargetDevice(TargetDevice targetDevice) {
        this.targetDevice = targetDevice.toString();
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
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: ").append(getS3OutputLocation()).append(",");
        if (getTargetDevice() != null)
            sb.append("TargetDevice: ").append(getTargetDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfig == false)
            return false;
        OutputConfig other = (OutputConfig) obj;
        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
            return false;
        if (other.getTargetDevice() == null ^ this.getTargetDevice() == null)
            return false;
        if (other.getTargetDevice() != null && other.getTargetDevice().equals(this.getTargetDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode + ((getTargetDevice() == null) ? 0 : getTargetDevice().hashCode());
        return hashCode;
    }

    @Override
    public OutputConfig clone() {
        try {
            return (OutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
