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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a VM server location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/VmServerAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VmServerAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     */
    private String vmManagerId;
    /**
     * <p>
     * The identifier of the VM.
     * </p>
     */
    private String vmId;

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @param vmManagerId
     *        The identifier of the VM manager.
     */

    public void setVmManagerId(String vmManagerId) {
        this.vmManagerId = vmManagerId;
    }

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @return The identifier of the VM manager.
     */

    public String getVmManagerId() {
        return this.vmManagerId;
    }

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @param vmManagerId
     *        The identifier of the VM manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServerAddress withVmManagerId(String vmManagerId) {
        setVmManagerId(vmManagerId);
        return this;
    }

    /**
     * <p>
     * The identifier of the VM.
     * </p>
     * 
     * @param vmId
     *        The identifier of the VM.
     */

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    /**
     * <p>
     * The identifier of the VM.
     * </p>
     * 
     * @return The identifier of the VM.
     */

    public String getVmId() {
        return this.vmId;
    }

    /**
     * <p>
     * The identifier of the VM.
     * </p>
     * 
     * @param vmId
     *        The identifier of the VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServerAddress withVmId(String vmId) {
        setVmId(vmId);
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
        if (getVmManagerId() != null)
            sb.append("VmManagerId: ").append(getVmManagerId()).append(",");
        if (getVmId() != null)
            sb.append("VmId: ").append(getVmId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VmServerAddress == false)
            return false;
        VmServerAddress other = (VmServerAddress) obj;
        if (other.getVmManagerId() == null ^ this.getVmManagerId() == null)
            return false;
        if (other.getVmManagerId() != null && other.getVmManagerId().equals(this.getVmManagerId()) == false)
            return false;
        if (other.getVmId() == null ^ this.getVmId() == null)
            return false;
        if (other.getVmId() != null && other.getVmId().equals(this.getVmId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVmManagerId() == null) ? 0 : getVmManagerId().hashCode());
        hashCode = prime * hashCode + ((getVmId() == null) ? 0 : getVmId().hashCode());
        return hashCode;
    }

    @Override
    public VmServerAddress clone() {
        try {
            return (VmServerAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.VmServerAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
