/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Object representing a VM server
 */
public class VmServer implements Serializable, Cloneable {

    private VmServerAddress vmServerAddress;

    private String vmName;

    private String vmManagerName;

    private String vmManagerType;

    private String vmPath;

    /**
     * @param vmServerAddress
     */

    public void setVmServerAddress(VmServerAddress vmServerAddress) {
        this.vmServerAddress = vmServerAddress;
    }

    /**
     * @return
     */

    public VmServerAddress getVmServerAddress() {
        return this.vmServerAddress;
    }

    /**
     * @param vmServerAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmServerAddress(VmServerAddress vmServerAddress) {
        setVmServerAddress(vmServerAddress);
        return this;
    }

    /**
     * @param vmName
     */

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    /**
     * @return
     */

    public String getVmName() {
        return this.vmName;
    }

    /**
     * @param vmName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmName(String vmName) {
        setVmName(vmName);
        return this;
    }

    /**
     * @param vmManagerName
     */

    public void setVmManagerName(String vmManagerName) {
        this.vmManagerName = vmManagerName;
    }

    /**
     * @return
     */

    public String getVmManagerName() {
        return this.vmManagerName;
    }

    /**
     * @param vmManagerName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmManagerName(String vmManagerName) {
        setVmManagerName(vmManagerName);
        return this;
    }

    /**
     * @param vmManagerType
     * @see VmManagerType
     */

    public void setVmManagerType(String vmManagerType) {
        this.vmManagerType = vmManagerType;
    }

    /**
     * @return
     * @see VmManagerType
     */

    public String getVmManagerType() {
        return this.vmManagerType;
    }

    /**
     * @param vmManagerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public VmServer withVmManagerType(String vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * @param vmManagerType
     * @see VmManagerType
     */

    public void setVmManagerType(VmManagerType vmManagerType) {
        this.vmManagerType = vmManagerType.toString();
    }

    /**
     * @param vmManagerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public VmServer withVmManagerType(VmManagerType vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * @param vmPath
     */

    public void setVmPath(String vmPath) {
        this.vmPath = vmPath;
    }

    /**
     * @return
     */

    public String getVmPath() {
        return this.vmPath;
    }

    /**
     * @param vmPath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServer withVmPath(String vmPath) {
        setVmPath(vmPath);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("VmServerAddress: " + getVmServerAddress() + ",");
        if (getVmName() != null)
            sb.append("VmName: " + getVmName() + ",");
        if (getVmManagerName() != null)
            sb.append("VmManagerName: " + getVmManagerName() + ",");
        if (getVmManagerType() != null)
            sb.append("VmManagerType: " + getVmManagerType() + ",");
        if (getVmPath() != null)
            sb.append("VmPath: " + getVmPath());
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
}
