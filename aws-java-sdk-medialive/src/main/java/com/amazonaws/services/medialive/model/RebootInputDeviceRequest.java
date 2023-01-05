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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to reboot an AWS Elemental device.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RebootInputDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootInputDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within
     * a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume
     * streaming when the reboot completes.
     */
    private String force;
    /** The unique ID of the input device to reboot. For example, hd-123456789abcdef. */
    private String inputDeviceId;

    /**
     * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within
     * a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume
     * streaming when the reboot completes.
     * 
     * @param force
     *        Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting
     *        within a few seconds of sending the command. If the device was streaming prior to the reboot, the device
     *        will resume streaming when the reboot completes.
     * @see RebootInputDeviceForce
     */

    public void setForce(String force) {
        this.force = force;
    }

    /**
     * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within
     * a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume
     * streaming when the reboot completes.
     * 
     * @return Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting
     *         within a few seconds of sending the command. If the device was streaming prior to the reboot, the device
     *         will resume streaming when the reboot completes.
     * @see RebootInputDeviceForce
     */

    public String getForce() {
        return this.force;
    }

    /**
     * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within
     * a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume
     * streaming when the reboot completes.
     * 
     * @param force
     *        Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting
     *        within a few seconds of sending the command. If the device was streaming prior to the reboot, the device
     *        will resume streaming when the reboot completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RebootInputDeviceForce
     */

    public RebootInputDeviceRequest withForce(String force) {
        setForce(force);
        return this;
    }

    /**
     * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within
     * a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume
     * streaming when the reboot completes.
     * 
     * @param force
     *        Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting
     *        within a few seconds of sending the command. If the device was streaming prior to the reboot, the device
     *        will resume streaming when the reboot completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RebootInputDeviceForce
     */

    public RebootInputDeviceRequest withForce(RebootInputDeviceForce force) {
        this.force = force.toString();
        return this;
    }

    /**
     * The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     */

    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     * 
     * @return The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     */

    public String getInputDeviceId() {
        return this.inputDeviceId;
    }

    /**
     * The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device to reboot. For example, hd-123456789abcdef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootInputDeviceRequest withInputDeviceId(String inputDeviceId) {
        setInputDeviceId(inputDeviceId);
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
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: ").append(getInputDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootInputDeviceRequest == false)
            return false;
        RebootInputDeviceRequest other = (RebootInputDeviceRequest) obj;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public RebootInputDeviceRequest clone() {
        return (RebootInputDeviceRequest) super.clone();
    }

}
