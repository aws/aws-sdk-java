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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets Suite Definition Configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteDefinitionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteDefinitionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Gets Suite Definition Configuration name.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * Gets the devices configured.
     * </p>
     */
    private java.util.List<DeviceUnderTest> devices;
    /**
     * <p>
     * Gets the tests intended for qualification in a suite.
     * </p>
     */
    private Boolean intendedForQualification;
    /**
     * <p>
     * Gets test suite root group.
     * </p>
     */
    private String rootGroup;
    /**
     * <p>
     * Gets device permission arn.
     * </p>
     */
    private String devicePermissionRoleArn;

    /**
     * <p>
     * Gets Suite Definition Configuration name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Gets Suite Definition Configuration name.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Gets Suite Definition Configuration name.
     * </p>
     * 
     * @return Gets Suite Definition Configuration name.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Gets Suite Definition Configuration name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Gets Suite Definition Configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * Gets the devices configured.
     * </p>
     * 
     * @return Gets the devices configured.
     */

    public java.util.List<DeviceUnderTest> getDevices() {
        return devices;
    }

    /**
     * <p>
     * Gets the devices configured.
     * </p>
     * 
     * @param devices
     *        Gets the devices configured.
     */

    public void setDevices(java.util.Collection<DeviceUnderTest> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceUnderTest>(devices);
    }

    /**
     * <p>
     * Gets the devices configured.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        Gets the devices configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withDevices(DeviceUnderTest... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<DeviceUnderTest>(devices.length));
        }
        for (DeviceUnderTest ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Gets the devices configured.
     * </p>
     * 
     * @param devices
     *        Gets the devices configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withDevices(java.util.Collection<DeviceUnderTest> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * Gets the tests intended for qualification in a suite.
     * </p>
     * 
     * @param intendedForQualification
     *        Gets the tests intended for qualification in a suite.
     */

    public void setIntendedForQualification(Boolean intendedForQualification) {
        this.intendedForQualification = intendedForQualification;
    }

    /**
     * <p>
     * Gets the tests intended for qualification in a suite.
     * </p>
     * 
     * @return Gets the tests intended for qualification in a suite.
     */

    public Boolean getIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Gets the tests intended for qualification in a suite.
     * </p>
     * 
     * @param intendedForQualification
     *        Gets the tests intended for qualification in a suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withIntendedForQualification(Boolean intendedForQualification) {
        setIntendedForQualification(intendedForQualification);
        return this;
    }

    /**
     * <p>
     * Gets the tests intended for qualification in a suite.
     * </p>
     * 
     * @return Gets the tests intended for qualification in a suite.
     */

    public Boolean isIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Gets test suite root group.
     * </p>
     * 
     * @param rootGroup
     *        Gets test suite root group.
     */

    public void setRootGroup(String rootGroup) {
        this.rootGroup = rootGroup;
    }

    /**
     * <p>
     * Gets test suite root group.
     * </p>
     * 
     * @return Gets test suite root group.
     */

    public String getRootGroup() {
        return this.rootGroup;
    }

    /**
     * <p>
     * Gets test suite root group.
     * </p>
     * 
     * @param rootGroup
     *        Gets test suite root group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withRootGroup(String rootGroup) {
        setRootGroup(rootGroup);
        return this;
    }

    /**
     * <p>
     * Gets device permission arn.
     * </p>
     * 
     * @param devicePermissionRoleArn
     *        Gets device permission arn.
     */

    public void setDevicePermissionRoleArn(String devicePermissionRoleArn) {
        this.devicePermissionRoleArn = devicePermissionRoleArn;
    }

    /**
     * <p>
     * Gets device permission arn.
     * </p>
     * 
     * @return Gets device permission arn.
     */

    public String getDevicePermissionRoleArn() {
        return this.devicePermissionRoleArn;
    }

    /**
     * <p>
     * Gets device permission arn.
     * </p>
     * 
     * @param devicePermissionRoleArn
     *        Gets device permission arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withDevicePermissionRoleArn(String devicePermissionRoleArn) {
        setDevicePermissionRoleArn(devicePermissionRoleArn);
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
        if (getSuiteDefinitionName() != null)
            sb.append("SuiteDefinitionName: ").append(getSuiteDefinitionName()).append(",");
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getIntendedForQualification() != null)
            sb.append("IntendedForQualification: ").append(getIntendedForQualification()).append(",");
        if (getRootGroup() != null)
            sb.append("RootGroup: ").append(getRootGroup()).append(",");
        if (getDevicePermissionRoleArn() != null)
            sb.append("DevicePermissionRoleArn: ").append(getDevicePermissionRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuiteDefinitionConfiguration == false)
            return false;
        SuiteDefinitionConfiguration other = (SuiteDefinitionConfiguration) obj;
        if (other.getSuiteDefinitionName() == null ^ this.getSuiteDefinitionName() == null)
            return false;
        if (other.getSuiteDefinitionName() != null && other.getSuiteDefinitionName().equals(this.getSuiteDefinitionName()) == false)
            return false;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getIntendedForQualification() == null ^ this.getIntendedForQualification() == null)
            return false;
        if (other.getIntendedForQualification() != null && other.getIntendedForQualification().equals(this.getIntendedForQualification()) == false)
            return false;
        if (other.getRootGroup() == null ^ this.getRootGroup() == null)
            return false;
        if (other.getRootGroup() != null && other.getRootGroup().equals(this.getRootGroup()) == false)
            return false;
        if (other.getDevicePermissionRoleArn() == null ^ this.getDevicePermissionRoleArn() == null)
            return false;
        if (other.getDevicePermissionRoleArn() != null && other.getDevicePermissionRoleArn().equals(this.getDevicePermissionRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionName() == null) ? 0 : getSuiteDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getIntendedForQualification() == null) ? 0 : getIntendedForQualification().hashCode());
        hashCode = prime * hashCode + ((getRootGroup() == null) ? 0 : getRootGroup().hashCode());
        hashCode = prime * hashCode + ((getDevicePermissionRoleArn() == null) ? 0 : getDevicePermissionRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public SuiteDefinitionConfiguration clone() {
        try {
            return (SuiteDefinitionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.SuiteDefinitionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
