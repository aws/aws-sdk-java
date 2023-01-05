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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The command given to the device to execute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/Command" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Command implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reboots the device.
     * </p>
     */
    private Reboot reboot;
    /**
     * <p>
     * Unlocks the device.
     * </p>
     */
    private Unlock unlock;

    /**
     * <p>
     * Reboots the device.
     * </p>
     * 
     * @param reboot
     *        Reboots the device.
     */

    public void setReboot(Reboot reboot) {
        this.reboot = reboot;
    }

    /**
     * <p>
     * Reboots the device.
     * </p>
     * 
     * @return Reboots the device.
     */

    public Reboot getReboot() {
        return this.reboot;
    }

    /**
     * <p>
     * Reboots the device.
     * </p>
     * 
     * @param reboot
     *        Reboots the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withReboot(Reboot reboot) {
        setReboot(reboot);
        return this;
    }

    /**
     * <p>
     * Unlocks the device.
     * </p>
     * 
     * @param unlock
     *        Unlocks the device.
     */

    public void setUnlock(Unlock unlock) {
        this.unlock = unlock;
    }

    /**
     * <p>
     * Unlocks the device.
     * </p>
     * 
     * @return Unlocks the device.
     */

    public Unlock getUnlock() {
        return this.unlock;
    }

    /**
     * <p>
     * Unlocks the device.
     * </p>
     * 
     * @param unlock
     *        Unlocks the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withUnlock(Unlock unlock) {
        setUnlock(unlock);
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
        if (getReboot() != null)
            sb.append("Reboot: ").append(getReboot()).append(",");
        if (getUnlock() != null)
            sb.append("Unlock: ").append(getUnlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;
        if (other.getReboot() == null ^ this.getReboot() == null)
            return false;
        if (other.getReboot() != null && other.getReboot().equals(this.getReboot()) == false)
            return false;
        if (other.getUnlock() == null ^ this.getUnlock() == null)
            return false;
        if (other.getUnlock() != null && other.getUnlock().equals(this.getUnlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReboot() == null) ? 0 : getReboot().hashCode());
        hashCode = prime * hashCode + ((getUnlock() == null) ? 0 : getUnlock().hashCode());
        return hashCode;
    }

    @Override
    public Command clone() {
        try {
            return (Command) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.CommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
