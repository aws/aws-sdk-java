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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the user pool's device tracking.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeviceConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * </p>
     */
    private Boolean challengeRequiredOnNewDevice;
    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     */
    private Boolean deviceOnlyRememberedOnUserPrompt;

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * </p>
     * 
     * @param challengeRequiredOnNewDevice
     *        Indicates whether a challenge is required on a new device. Only applicable to a new device.
     */

    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * </p>
     * 
     * @return Indicates whether a challenge is required on a new device. Only applicable to a new device.
     */

    public Boolean getChallengeRequiredOnNewDevice() {
        return this.challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * </p>
     * 
     * @param challengeRequiredOnNewDevice
     *        Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceConfigurationType withChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        setChallengeRequiredOnNewDevice(challengeRequiredOnNewDevice);
        return this;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only applicable to a new device.
     * </p>
     * 
     * @return Indicates whether a challenge is required on a new device. Only applicable to a new device.
     */

    public Boolean isChallengeRequiredOnNewDevice() {
        return this.challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     * 
     * @param deviceOnlyRememberedOnUserPrompt
     *        If true, a device is only remembered on user prompt.
     */

    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     * 
     * @return If true, a device is only remembered on user prompt.
     */

    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return this.deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     * 
     * @param deviceOnlyRememberedOnUserPrompt
     *        If true, a device is only remembered on user prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceConfigurationType withDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        setDeviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt);
        return this;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     * 
     * @return If true, a device is only remembered on user prompt.
     */

    public Boolean isDeviceOnlyRememberedOnUserPrompt() {
        return this.deviceOnlyRememberedOnUserPrompt;
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
        if (getChallengeRequiredOnNewDevice() != null)
            sb.append("ChallengeRequiredOnNewDevice: ").append(getChallengeRequiredOnNewDevice()).append(",");
        if (getDeviceOnlyRememberedOnUserPrompt() != null)
            sb.append("DeviceOnlyRememberedOnUserPrompt: ").append(getDeviceOnlyRememberedOnUserPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceConfigurationType == false)
            return false;
        DeviceConfigurationType other = (DeviceConfigurationType) obj;
        if (other.getChallengeRequiredOnNewDevice() == null ^ this.getChallengeRequiredOnNewDevice() == null)
            return false;
        if (other.getChallengeRequiredOnNewDevice() != null && other.getChallengeRequiredOnNewDevice().equals(this.getChallengeRequiredOnNewDevice()) == false)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() == null ^ this.getDeviceOnlyRememberedOnUserPrompt() == null)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() != null
                && other.getDeviceOnlyRememberedOnUserPrompt().equals(this.getDeviceOnlyRememberedOnUserPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChallengeRequiredOnNewDevice() == null) ? 0 : getChallengeRequiredOnNewDevice().hashCode());
        hashCode = prime * hashCode + ((getDeviceOnlyRememberedOnUserPrompt() == null) ? 0 : getDeviceOnlyRememberedOnUserPrompt().hashCode());
        return hashCode;
    }

    @Override
    public DeviceConfigurationType clone() {
        try {
            return (DeviceConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.DeviceConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
