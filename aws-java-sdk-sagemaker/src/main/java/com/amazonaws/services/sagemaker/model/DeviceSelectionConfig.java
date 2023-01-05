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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the configurations of selected devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeviceSelectionConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSelectionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of device subsets to deploy to the current stage.
     * </p>
     */
    private String deviceSubsetType;
    /**
     * <p>
     * Percentage of devices in the fleet to deploy to the current stage.
     * </p>
     */
    private Integer percentage;
    /**
     * <p>
     * List of devices chosen to deploy.
     * </p>
     */
    private java.util.List<String> deviceNames;
    /**
     * <p>
     * A filter to select devices with names containing this name.
     * </p>
     */
    private String deviceNameContains;

    /**
     * <p>
     * Type of device subsets to deploy to the current stage.
     * </p>
     * 
     * @param deviceSubsetType
     *        Type of device subsets to deploy to the current stage.
     * @see DeviceSubsetType
     */

    public void setDeviceSubsetType(String deviceSubsetType) {
        this.deviceSubsetType = deviceSubsetType;
    }

    /**
     * <p>
     * Type of device subsets to deploy to the current stage.
     * </p>
     * 
     * @return Type of device subsets to deploy to the current stage.
     * @see DeviceSubsetType
     */

    public String getDeviceSubsetType() {
        return this.deviceSubsetType;
    }

    /**
     * <p>
     * Type of device subsets to deploy to the current stage.
     * </p>
     * 
     * @param deviceSubsetType
     *        Type of device subsets to deploy to the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceSubsetType
     */

    public DeviceSelectionConfig withDeviceSubsetType(String deviceSubsetType) {
        setDeviceSubsetType(deviceSubsetType);
        return this;
    }

    /**
     * <p>
     * Type of device subsets to deploy to the current stage.
     * </p>
     * 
     * @param deviceSubsetType
     *        Type of device subsets to deploy to the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceSubsetType
     */

    public DeviceSelectionConfig withDeviceSubsetType(DeviceSubsetType deviceSubsetType) {
        this.deviceSubsetType = deviceSubsetType.toString();
        return this;
    }

    /**
     * <p>
     * Percentage of devices in the fleet to deploy to the current stage.
     * </p>
     * 
     * @param percentage
     *        Percentage of devices in the fleet to deploy to the current stage.
     */

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * Percentage of devices in the fleet to deploy to the current stage.
     * </p>
     * 
     * @return Percentage of devices in the fleet to deploy to the current stage.
     */

    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * Percentage of devices in the fleet to deploy to the current stage.
     * </p>
     * 
     * @param percentage
     *        Percentage of devices in the fleet to deploy to the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfig withPercentage(Integer percentage) {
        setPercentage(percentage);
        return this;
    }

    /**
     * <p>
     * List of devices chosen to deploy.
     * </p>
     * 
     * @return List of devices chosen to deploy.
     */

    public java.util.List<String> getDeviceNames() {
        return deviceNames;
    }

    /**
     * <p>
     * List of devices chosen to deploy.
     * </p>
     * 
     * @param deviceNames
     *        List of devices chosen to deploy.
     */

    public void setDeviceNames(java.util.Collection<String> deviceNames) {
        if (deviceNames == null) {
            this.deviceNames = null;
            return;
        }

        this.deviceNames = new java.util.ArrayList<String>(deviceNames);
    }

    /**
     * <p>
     * List of devices chosen to deploy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceNames(java.util.Collection)} or {@link #withDeviceNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceNames
     *        List of devices chosen to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfig withDeviceNames(String... deviceNames) {
        if (this.deviceNames == null) {
            setDeviceNames(new java.util.ArrayList<String>(deviceNames.length));
        }
        for (String ele : deviceNames) {
            this.deviceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of devices chosen to deploy.
     * </p>
     * 
     * @param deviceNames
     *        List of devices chosen to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfig withDeviceNames(java.util.Collection<String> deviceNames) {
        setDeviceNames(deviceNames);
        return this;
    }

    /**
     * <p>
     * A filter to select devices with names containing this name.
     * </p>
     * 
     * @param deviceNameContains
     *        A filter to select devices with names containing this name.
     */

    public void setDeviceNameContains(String deviceNameContains) {
        this.deviceNameContains = deviceNameContains;
    }

    /**
     * <p>
     * A filter to select devices with names containing this name.
     * </p>
     * 
     * @return A filter to select devices with names containing this name.
     */

    public String getDeviceNameContains() {
        return this.deviceNameContains;
    }

    /**
     * <p>
     * A filter to select devices with names containing this name.
     * </p>
     * 
     * @param deviceNameContains
     *        A filter to select devices with names containing this name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfig withDeviceNameContains(String deviceNameContains) {
        setDeviceNameContains(deviceNameContains);
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
        if (getDeviceSubsetType() != null)
            sb.append("DeviceSubsetType: ").append(getDeviceSubsetType()).append(",");
        if (getPercentage() != null)
            sb.append("Percentage: ").append(getPercentage()).append(",");
        if (getDeviceNames() != null)
            sb.append("DeviceNames: ").append(getDeviceNames()).append(",");
        if (getDeviceNameContains() != null)
            sb.append("DeviceNameContains: ").append(getDeviceNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSelectionConfig == false)
            return false;
        DeviceSelectionConfig other = (DeviceSelectionConfig) obj;
        if (other.getDeviceSubsetType() == null ^ this.getDeviceSubsetType() == null)
            return false;
        if (other.getDeviceSubsetType() != null && other.getDeviceSubsetType().equals(this.getDeviceSubsetType()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        if (other.getDeviceNames() == null ^ this.getDeviceNames() == null)
            return false;
        if (other.getDeviceNames() != null && other.getDeviceNames().equals(this.getDeviceNames()) == false)
            return false;
        if (other.getDeviceNameContains() == null ^ this.getDeviceNameContains() == null)
            return false;
        if (other.getDeviceNameContains() != null && other.getDeviceNameContains().equals(this.getDeviceNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceSubsetType() == null) ? 0 : getDeviceSubsetType().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        hashCode = prime * hashCode + ((getDeviceNames() == null) ? 0 : getDeviceNames().hashCode());
        hashCode = prime * hashCode + ((getDeviceNameContains() == null) ? 0 : getDeviceNameContains().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSelectionConfig clone() {
        try {
            return (DeviceSelectionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeviceSelectionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
