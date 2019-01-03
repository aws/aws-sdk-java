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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the device instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeviceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * An array of strings describing the device instance.
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * The status of the device instance. Valid values are listed below.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Unique device identifier for the device instance.
     * </p>
     */
    private String udid;
    /**
     * <p>
     * A object containing information about the instance profile.
     * </p>
     */
    private InstanceProfile instanceProfile;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * An array of strings describing the device instance.
     * </p>
     * 
     * @return An array of strings describing the device instance.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of strings describing the device instance.
     * </p>
     * 
     * @param labels
     *        An array of strings describing the device instance.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * An array of strings describing the device instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of strings describing the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings describing the device instance.
     * </p>
     * 
     * @param labels
     *        An array of strings describing the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The status of the device instance. Valid values are listed below.
     * </p>
     * 
     * @param status
     *        The status of the device instance. Valid values are listed below.
     * @see InstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the device instance. Valid values are listed below.
     * </p>
     * 
     * @return The status of the device instance. Valid values are listed below.
     * @see InstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the device instance. Valid values are listed below.
     * </p>
     * 
     * @param status
     *        The status of the device instance. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public DeviceInstance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the device instance. Valid values are listed below.
     * </p>
     * 
     * @param status
     *        The status of the device instance. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public DeviceInstance withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Unique device identifier for the device instance.
     * </p>
     * 
     * @param udid
     *        Unique device identifier for the device instance.
     */

    public void setUdid(String udid) {
        this.udid = udid;
    }

    /**
     * <p>
     * Unique device identifier for the device instance.
     * </p>
     * 
     * @return Unique device identifier for the device instance.
     */

    public String getUdid() {
        return this.udid;
    }

    /**
     * <p>
     * Unique device identifier for the device instance.
     * </p>
     * 
     * @param udid
     *        Unique device identifier for the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withUdid(String udid) {
        setUdid(udid);
        return this;
    }

    /**
     * <p>
     * A object containing information about the instance profile.
     * </p>
     * 
     * @param instanceProfile
     *        A object containing information about the instance profile.
     */

    public void setInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
    }

    /**
     * <p>
     * A object containing information about the instance profile.
     * </p>
     * 
     * @return A object containing information about the instance profile.
     */

    public InstanceProfile getInstanceProfile() {
        return this.instanceProfile;
    }

    /**
     * <p>
     * A object containing information about the instance profile.
     * </p>
     * 
     * @param instanceProfile
     *        A object containing information about the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInstance withInstanceProfile(InstanceProfile instanceProfile) {
        setInstanceProfile(instanceProfile);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUdid() != null)
            sb.append("Udid: ").append(getUdid()).append(",");
        if (getInstanceProfile() != null)
            sb.append("InstanceProfile: ").append(getInstanceProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceInstance == false)
            return false;
        DeviceInstance other = (DeviceInstance) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUdid() == null ^ this.getUdid() == null)
            return false;
        if (other.getUdid() != null && other.getUdid().equals(this.getUdid()) == false)
            return false;
        if (other.getInstanceProfile() == null ^ this.getInstanceProfile() == null)
            return false;
        if (other.getInstanceProfile() != null && other.getInstanceProfile().equals(this.getInstanceProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUdid() == null) ? 0 : getUdid().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfile() == null) ? 0 : getInstanceProfile().hashCode());
        return hashCode;
    }

    @Override
    public DeviceInstance clone() {
        try {
            return (DeviceInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
