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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets the suite definition configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteDefinitionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteDefinitionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Gets the suite definition name. This is a required parameter.
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
     * Verifies if the test suite is a long duration test.
     * </p>
     */
    private Boolean isLongDurationTest;
    /**
     * <p>
     * Gets the test suite root group. This is a required parameter.
     * </p>
     */
    private String rootGroup;
    /**
     * <p>
     * Gets the device permission ARN. This is a required parameter.
     * </p>
     */
    private String devicePermissionRoleArn;
    /**
     * <p>
     * Sets the MQTT protocol that is configured in the suite definition.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * Gets the suite definition name. This is a required parameter.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Gets the suite definition name. This is a required parameter.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Gets the suite definition name. This is a required parameter.
     * </p>
     * 
     * @return Gets the suite definition name. This is a required parameter.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Gets the suite definition name. This is a required parameter.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Gets the suite definition name. This is a required parameter.
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
     * Verifies if the test suite is a long duration test.
     * </p>
     * 
     * @param isLongDurationTest
     *        Verifies if the test suite is a long duration test.
     */

    public void setIsLongDurationTest(Boolean isLongDurationTest) {
        this.isLongDurationTest = isLongDurationTest;
    }

    /**
     * <p>
     * Verifies if the test suite is a long duration test.
     * </p>
     * 
     * @return Verifies if the test suite is a long duration test.
     */

    public Boolean getIsLongDurationTest() {
        return this.isLongDurationTest;
    }

    /**
     * <p>
     * Verifies if the test suite is a long duration test.
     * </p>
     * 
     * @param isLongDurationTest
     *        Verifies if the test suite is a long duration test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withIsLongDurationTest(Boolean isLongDurationTest) {
        setIsLongDurationTest(isLongDurationTest);
        return this;
    }

    /**
     * <p>
     * Verifies if the test suite is a long duration test.
     * </p>
     * 
     * @return Verifies if the test suite is a long duration test.
     */

    public Boolean isLongDurationTest() {
        return this.isLongDurationTest;
    }

    /**
     * <p>
     * Gets the test suite root group. This is a required parameter.
     * </p>
     * 
     * @param rootGroup
     *        Gets the test suite root group. This is a required parameter.
     */

    public void setRootGroup(String rootGroup) {
        this.rootGroup = rootGroup;
    }

    /**
     * <p>
     * Gets the test suite root group. This is a required parameter.
     * </p>
     * 
     * @return Gets the test suite root group. This is a required parameter.
     */

    public String getRootGroup() {
        return this.rootGroup;
    }

    /**
     * <p>
     * Gets the test suite root group. This is a required parameter.
     * </p>
     * 
     * @param rootGroup
     *        Gets the test suite root group. This is a required parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withRootGroup(String rootGroup) {
        setRootGroup(rootGroup);
        return this;
    }

    /**
     * <p>
     * Gets the device permission ARN. This is a required parameter.
     * </p>
     * 
     * @param devicePermissionRoleArn
     *        Gets the device permission ARN. This is a required parameter.
     */

    public void setDevicePermissionRoleArn(String devicePermissionRoleArn) {
        this.devicePermissionRoleArn = devicePermissionRoleArn;
    }

    /**
     * <p>
     * Gets the device permission ARN. This is a required parameter.
     * </p>
     * 
     * @return Gets the device permission ARN. This is a required parameter.
     */

    public String getDevicePermissionRoleArn() {
        return this.devicePermissionRoleArn;
    }

    /**
     * <p>
     * Gets the device permission ARN. This is a required parameter.
     * </p>
     * 
     * @param devicePermissionRoleArn
     *        Gets the device permission ARN. This is a required parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionConfiguration withDevicePermissionRoleArn(String devicePermissionRoleArn) {
        setDevicePermissionRoleArn(devicePermissionRoleArn);
        return this;
    }

    /**
     * <p>
     * Sets the MQTT protocol that is configured in the suite definition.
     * </p>
     * 
     * @param protocol
     *        Sets the MQTT protocol that is configured in the suite definition.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * Sets the MQTT protocol that is configured in the suite definition.
     * </p>
     * 
     * @return Sets the MQTT protocol that is configured in the suite definition.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * Sets the MQTT protocol that is configured in the suite definition.
     * </p>
     * 
     * @param protocol
     *        Sets the MQTT protocol that is configured in the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public SuiteDefinitionConfiguration withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Sets the MQTT protocol that is configured in the suite definition.
     * </p>
     * 
     * @param protocol
     *        Sets the MQTT protocol that is configured in the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public SuiteDefinitionConfiguration withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
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
        if (getIsLongDurationTest() != null)
            sb.append("IsLongDurationTest: ").append(getIsLongDurationTest()).append(",");
        if (getRootGroup() != null)
            sb.append("RootGroup: ").append(getRootGroup()).append(",");
        if (getDevicePermissionRoleArn() != null)
            sb.append("DevicePermissionRoleArn: ").append(getDevicePermissionRoleArn()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
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
        if (other.getIsLongDurationTest() == null ^ this.getIsLongDurationTest() == null)
            return false;
        if (other.getIsLongDurationTest() != null && other.getIsLongDurationTest().equals(this.getIsLongDurationTest()) == false)
            return false;
        if (other.getRootGroup() == null ^ this.getRootGroup() == null)
            return false;
        if (other.getRootGroup() != null && other.getRootGroup().equals(this.getRootGroup()) == false)
            return false;
        if (other.getDevicePermissionRoleArn() == null ^ this.getDevicePermissionRoleArn() == null)
            return false;
        if (other.getDevicePermissionRoleArn() != null && other.getDevicePermissionRoleArn().equals(this.getDevicePermissionRoleArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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
        hashCode = prime * hashCode + ((getIsLongDurationTest() == null) ? 0 : getIsLongDurationTest().hashCode());
        hashCode = prime * hashCode + ((getRootGroup() == null) ? 0 : getRootGroup().hashCode());
        hashCode = prime * hashCode + ((getDevicePermissionRoleArn() == null) ? 0 : getDevicePermissionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
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
