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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Elastic Inference accelerator to use for the containers in the task.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionInferenceAcceleratorsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionInferenceAcceleratorsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Elastic Inference accelerator device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     */
    private String deviceType;

    /**
     * <p>
     * The Elastic Inference accelerator device name.
     * </p>
     * 
     * @param deviceName
     *        The Elastic Inference accelerator device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The Elastic Inference accelerator device name.
     * </p>
     * 
     * @return The Elastic Inference accelerator device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The Elastic Inference accelerator device name.
     * </p>
     * 
     * @param deviceName
     *        The Elastic Inference accelerator device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionInferenceAcceleratorsDetails withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     * 
     * @param deviceType
     *        The Elastic Inference accelerator type to use.
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     * 
     * @return The Elastic Inference accelerator type to use.
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     * 
     * @param deviceType
     *        The Elastic Inference accelerator type to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionInferenceAcceleratorsDetails withDeviceType(String deviceType) {
        setDeviceType(deviceType);
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionInferenceAcceleratorsDetails == false)
            return false;
        AwsEcsTaskDefinitionInferenceAcceleratorsDetails other = (AwsEcsTaskDefinitionInferenceAcceleratorsDetails) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionInferenceAcceleratorsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionInferenceAcceleratorsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionInferenceAcceleratorsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
