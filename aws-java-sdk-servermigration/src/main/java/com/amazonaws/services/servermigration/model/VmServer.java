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
 * Represents a VM server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/VmServer" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VmServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the VM server location.
     * </p>
     */
    private VmServerAddress vmServerAddress;
    /**
     * <p>
     * The name of the VM.
     * </p>
     */
    private String vmName;
    /**
     * <p>
     * The name of the VM manager.
     * </p>
     */
    private String vmManagerName;
    /**
     * <p>
     * The type of VM management product.
     * </p>
     */
    private String vmManagerType;
    /**
     * <p>
     * The VM folder path in the vCenter Server virtual machine inventory tree.
     * </p>
     */
    private String vmPath;

    /**
     * <p>
     * Information about the VM server location.
     * </p>
     * 
     * @param vmServerAddress
     *        Information about the VM server location.
     */

    public void setVmServerAddress(VmServerAddress vmServerAddress) {
        this.vmServerAddress = vmServerAddress;
    }

    /**
     * <p>
     * Information about the VM server location.
     * </p>
     * 
     * @return Information about the VM server location.
     */

    public VmServerAddress getVmServerAddress() {
        return this.vmServerAddress;
    }

    /**
     * <p>
     * Information about the VM server location.
     * </p>
     * 
     * @param vmServerAddress
     *        Information about the VM server location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmServerAddress(VmServerAddress vmServerAddress) {
        setVmServerAddress(vmServerAddress);
        return this;
    }

    /**
     * <p>
     * The name of the VM.
     * </p>
     * 
     * @param vmName
     *        The name of the VM.
     */

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    /**
     * <p>
     * The name of the VM.
     * </p>
     * 
     * @return The name of the VM.
     */

    public String getVmName() {
        return this.vmName;
    }

    /**
     * <p>
     * The name of the VM.
     * </p>
     * 
     * @param vmName
     *        The name of the VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmName(String vmName) {
        setVmName(vmName);
        return this;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @param vmManagerName
     *        The name of the VM manager.
     */

    public void setVmManagerName(String vmManagerName) {
        this.vmManagerName = vmManagerName;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @return The name of the VM manager.
     */

    public String getVmManagerName() {
        return this.vmManagerName;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @param vmManagerName
     *        The name of the VM manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmManagerName(String vmManagerName) {
        setVmManagerName(vmManagerName);
        return this;
    }

    /**
     * <p>
     * The type of VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The type of VM management product.
     * @see VmManagerType
     */

    public void setVmManagerType(String vmManagerType) {
        this.vmManagerType = vmManagerType;
    }

    /**
     * <p>
     * The type of VM management product.
     * </p>
     * 
     * @return The type of VM management product.
     * @see VmManagerType
     */

    public String getVmManagerType() {
        return this.vmManagerType;
    }

    /**
     * <p>
     * The type of VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The type of VM management product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public VmServer withVmManagerType(String vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * <p>
     * The type of VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The type of VM management product.
     * @see VmManagerType
     */

    public void setVmManagerType(VmManagerType vmManagerType) {
        withVmManagerType(vmManagerType);
    }

    /**
     * <p>
     * The type of VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The type of VM management product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public VmServer withVmManagerType(VmManagerType vmManagerType) {
        this.vmManagerType = vmManagerType.toString();
        return this;
    }

    /**
     * <p>
     * The VM folder path in the vCenter Server virtual machine inventory tree.
     * </p>
     * 
     * @param vmPath
     *        The VM folder path in the vCenter Server virtual machine inventory tree.
     */

    public void setVmPath(String vmPath) {
        this.vmPath = vmPath;
    }

    /**
     * <p>
     * The VM folder path in the vCenter Server virtual machine inventory tree.
     * </p>
     * 
     * @return The VM folder path in the vCenter Server virtual machine inventory tree.
     */

    public String getVmPath() {
        return this.vmPath;
    }

    /**
     * <p>
     * The VM folder path in the vCenter Server virtual machine inventory tree.
     * </p>
     * 
     * @param vmPath
     *        The VM folder path in the vCenter Server virtual machine inventory tree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmPath(String vmPath) {
        setVmPath(vmPath);
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
        if (getVmServerAddress() != null)
            sb.append("VmServerAddress: ").append(getVmServerAddress()).append(",");
        if (getVmName() != null)
            sb.append("VmName: ").append(getVmName()).append(",");
        if (getVmManagerName() != null)
            sb.append("VmManagerName: ").append(getVmManagerName()).append(",");
        if (getVmManagerType() != null)
            sb.append("VmManagerType: ").append(getVmManagerType()).append(",");
        if (getVmPath() != null)
            sb.append("VmPath: ").append(getVmPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VmServer == false)
            return false;
        VmServer other = (VmServer) obj;
        if (other.getVmServerAddress() == null ^ this.getVmServerAddress() == null)
            return false;
        if (other.getVmServerAddress() != null && other.getVmServerAddress().equals(this.getVmServerAddress()) == false)
            return false;
        if (other.getVmName() == null ^ this.getVmName() == null)
            return false;
        if (other.getVmName() != null && other.getVmName().equals(this.getVmName()) == false)
            return false;
        if (other.getVmManagerName() == null ^ this.getVmManagerName() == null)
            return false;
        if (other.getVmManagerName() != null && other.getVmManagerName().equals(this.getVmManagerName()) == false)
            return false;
        if (other.getVmManagerType() == null ^ this.getVmManagerType() == null)
            return false;
        if (other.getVmManagerType() != null && other.getVmManagerType().equals(this.getVmManagerType()) == false)
            return false;
        if (other.getVmPath() == null ^ this.getVmPath() == null)
            return false;
        if (other.getVmPath() != null && other.getVmPath().equals(this.getVmPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVmServerAddress() == null) ? 0 : getVmServerAddress().hashCode());
        hashCode = prime * hashCode + ((getVmName() == null) ? 0 : getVmName().hashCode());
        hashCode = prime * hashCode + ((getVmManagerName() == null) ? 0 : getVmManagerName().hashCode());
        hashCode = prime * hashCode + ((getVmManagerType() == null) ? 0 : getVmManagerType().hashCode());
        hashCode = prime * hashCode + ((getVmPath() == null) ? 0 : getVmPath().hashCode());
        return hashCode;
    }

    @Override
    public VmServer clone() {
        try {
            return (VmServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.VmServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
