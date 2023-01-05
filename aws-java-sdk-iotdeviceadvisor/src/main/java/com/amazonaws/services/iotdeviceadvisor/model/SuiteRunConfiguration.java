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
 * Gets suite run configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteRunConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     * </p>
     */
    private DeviceUnderTest primaryDevice;
    /**
     * <p>
     * Sets test case list.
     * </p>
     */
    private java.util.List<String> selectedTestList;
    /**
     * <p>
     * TRUE if multiple test suites run in parallel.
     * </p>
     */
    private Boolean parallelRun;

    /**
     * <p>
     * Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     * </p>
     * 
     * @param primaryDevice
     *        Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     */

    public void setPrimaryDevice(DeviceUnderTest primaryDevice) {
        this.primaryDevice = primaryDevice;
    }

    /**
     * <p>
     * Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     * </p>
     * 
     * @return Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     */

    public DeviceUnderTest getPrimaryDevice() {
        return this.primaryDevice;
    }

    /**
     * <p>
     * Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     * </p>
     * 
     * @param primaryDevice
     *        Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunConfiguration withPrimaryDevice(DeviceUnderTest primaryDevice) {
        setPrimaryDevice(primaryDevice);
        return this;
    }

    /**
     * <p>
     * Sets test case list.
     * </p>
     * 
     * @return Sets test case list.
     */

    public java.util.List<String> getSelectedTestList() {
        return selectedTestList;
    }

    /**
     * <p>
     * Sets test case list.
     * </p>
     * 
     * @param selectedTestList
     *        Sets test case list.
     */

    public void setSelectedTestList(java.util.Collection<String> selectedTestList) {
        if (selectedTestList == null) {
            this.selectedTestList = null;
            return;
        }

        this.selectedTestList = new java.util.ArrayList<String>(selectedTestList);
    }

    /**
     * <p>
     * Sets test case list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedTestList(java.util.Collection)} or {@link #withSelectedTestList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedTestList
     *        Sets test case list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunConfiguration withSelectedTestList(String... selectedTestList) {
        if (this.selectedTestList == null) {
            setSelectedTestList(new java.util.ArrayList<String>(selectedTestList.length));
        }
        for (String ele : selectedTestList) {
            this.selectedTestList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sets test case list.
     * </p>
     * 
     * @param selectedTestList
     *        Sets test case list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunConfiguration withSelectedTestList(java.util.Collection<String> selectedTestList) {
        setSelectedTestList(selectedTestList);
        return this;
    }

    /**
     * <p>
     * TRUE if multiple test suites run in parallel.
     * </p>
     * 
     * @param parallelRun
     *        TRUE if multiple test suites run in parallel.
     */

    public void setParallelRun(Boolean parallelRun) {
        this.parallelRun = parallelRun;
    }

    /**
     * <p>
     * TRUE if multiple test suites run in parallel.
     * </p>
     * 
     * @return TRUE if multiple test suites run in parallel.
     */

    public Boolean getParallelRun() {
        return this.parallelRun;
    }

    /**
     * <p>
     * TRUE if multiple test suites run in parallel.
     * </p>
     * 
     * @param parallelRun
     *        TRUE if multiple test suites run in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunConfiguration withParallelRun(Boolean parallelRun) {
        setParallelRun(parallelRun);
        return this;
    }

    /**
     * <p>
     * TRUE if multiple test suites run in parallel.
     * </p>
     * 
     * @return TRUE if multiple test suites run in parallel.
     */

    public Boolean isParallelRun() {
        return this.parallelRun;
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
        if (getPrimaryDevice() != null)
            sb.append("PrimaryDevice: ").append(getPrimaryDevice()).append(",");
        if (getSelectedTestList() != null)
            sb.append("SelectedTestList: ").append(getSelectedTestList()).append(",");
        if (getParallelRun() != null)
            sb.append("ParallelRun: ").append(getParallelRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuiteRunConfiguration == false)
            return false;
        SuiteRunConfiguration other = (SuiteRunConfiguration) obj;
        if (other.getPrimaryDevice() == null ^ this.getPrimaryDevice() == null)
            return false;
        if (other.getPrimaryDevice() != null && other.getPrimaryDevice().equals(this.getPrimaryDevice()) == false)
            return false;
        if (other.getSelectedTestList() == null ^ this.getSelectedTestList() == null)
            return false;
        if (other.getSelectedTestList() != null && other.getSelectedTestList().equals(this.getSelectedTestList()) == false)
            return false;
        if (other.getParallelRun() == null ^ this.getParallelRun() == null)
            return false;
        if (other.getParallelRun() != null && other.getParallelRun().equals(this.getParallelRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryDevice() == null) ? 0 : getPrimaryDevice().hashCode());
        hashCode = prime * hashCode + ((getSelectedTestList() == null) ? 0 : getSelectedTestList().hashCode());
        hashCode = prime * hashCode + ((getParallelRun() == null) ? 0 : getParallelRun().hashCode());
        return hashCode;
    }

    @Override
    public SuiteRunConfiguration clone() {
        try {
            return (SuiteRunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.SuiteRunConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
