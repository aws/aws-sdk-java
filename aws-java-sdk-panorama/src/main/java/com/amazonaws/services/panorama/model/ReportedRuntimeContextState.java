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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An application instance's state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ReportedRuntimeContextState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportedRuntimeContextState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application's desired state.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The application's reported status.
     * </p>
     */
    private String deviceReportedStatus;
    /**
     * <p>
     * When the device reported the application's state.
     * </p>
     */
    private java.util.Date deviceReportedTime;
    /**
     * <p>
     * The device's name.
     * </p>
     */
    private String runtimeContextName;

    /**
     * <p>
     * The application's desired state.
     * </p>
     * 
     * @param desiredState
     *        The application's desired state.
     * @see DesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The application's desired state.
     * </p>
     * 
     * @return The application's desired state.
     * @see DesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The application's desired state.
     * </p>
     * 
     * @param desiredState
     *        The application's desired state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public ReportedRuntimeContextState withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The application's desired state.
     * </p>
     * 
     * @param desiredState
     *        The application's desired state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public ReportedRuntimeContextState withDesiredState(DesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The application's reported status.
     * </p>
     * 
     * @param deviceReportedStatus
     *        The application's reported status.
     * @see DeviceReportedStatus
     */

    public void setDeviceReportedStatus(String deviceReportedStatus) {
        this.deviceReportedStatus = deviceReportedStatus;
    }

    /**
     * <p>
     * The application's reported status.
     * </p>
     * 
     * @return The application's reported status.
     * @see DeviceReportedStatus
     */

    public String getDeviceReportedStatus() {
        return this.deviceReportedStatus;
    }

    /**
     * <p>
     * The application's reported status.
     * </p>
     * 
     * @param deviceReportedStatus
     *        The application's reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceReportedStatus
     */

    public ReportedRuntimeContextState withDeviceReportedStatus(String deviceReportedStatus) {
        setDeviceReportedStatus(deviceReportedStatus);
        return this;
    }

    /**
     * <p>
     * The application's reported status.
     * </p>
     * 
     * @param deviceReportedStatus
     *        The application's reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceReportedStatus
     */

    public ReportedRuntimeContextState withDeviceReportedStatus(DeviceReportedStatus deviceReportedStatus) {
        this.deviceReportedStatus = deviceReportedStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the device reported the application's state.
     * </p>
     * 
     * @param deviceReportedTime
     *        When the device reported the application's state.
     */

    public void setDeviceReportedTime(java.util.Date deviceReportedTime) {
        this.deviceReportedTime = deviceReportedTime;
    }

    /**
     * <p>
     * When the device reported the application's state.
     * </p>
     * 
     * @return When the device reported the application's state.
     */

    public java.util.Date getDeviceReportedTime() {
        return this.deviceReportedTime;
    }

    /**
     * <p>
     * When the device reported the application's state.
     * </p>
     * 
     * @param deviceReportedTime
     *        When the device reported the application's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportedRuntimeContextState withDeviceReportedTime(java.util.Date deviceReportedTime) {
        setDeviceReportedTime(deviceReportedTime);
        return this;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param runtimeContextName
     *        The device's name.
     */

    public void setRuntimeContextName(String runtimeContextName) {
        this.runtimeContextName = runtimeContextName;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @return The device's name.
     */

    public String getRuntimeContextName() {
        return this.runtimeContextName;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param runtimeContextName
     *        The device's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportedRuntimeContextState withRuntimeContextName(String runtimeContextName) {
        setRuntimeContextName(runtimeContextName);
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getDeviceReportedStatus() != null)
            sb.append("DeviceReportedStatus: ").append(getDeviceReportedStatus()).append(",");
        if (getDeviceReportedTime() != null)
            sb.append("DeviceReportedTime: ").append(getDeviceReportedTime()).append(",");
        if (getRuntimeContextName() != null)
            sb.append("RuntimeContextName: ").append(getRuntimeContextName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportedRuntimeContextState == false)
            return false;
        ReportedRuntimeContextState other = (ReportedRuntimeContextState) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getDeviceReportedStatus() == null ^ this.getDeviceReportedStatus() == null)
            return false;
        if (other.getDeviceReportedStatus() != null && other.getDeviceReportedStatus().equals(this.getDeviceReportedStatus()) == false)
            return false;
        if (other.getDeviceReportedTime() == null ^ this.getDeviceReportedTime() == null)
            return false;
        if (other.getDeviceReportedTime() != null && other.getDeviceReportedTime().equals(this.getDeviceReportedTime()) == false)
            return false;
        if (other.getRuntimeContextName() == null ^ this.getRuntimeContextName() == null)
            return false;
        if (other.getRuntimeContextName() != null && other.getRuntimeContextName().equals(this.getRuntimeContextName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getDeviceReportedStatus() == null) ? 0 : getDeviceReportedStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceReportedTime() == null) ? 0 : getDeviceReportedTime().hashCode());
        hashCode = prime * hashCode + ((getRuntimeContextName() == null) ? 0 : getRuntimeContextName().hashCode());
        return hashCode;
    }

    @Override
    public ReportedRuntimeContextState clone() {
        try {
            return (ReportedRuntimeContextState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.ReportedRuntimeContextStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
