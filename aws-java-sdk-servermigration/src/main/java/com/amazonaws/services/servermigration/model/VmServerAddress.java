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
 * Object representing a server's location
 */
public class VmServerAddress implements Serializable, Cloneable {

    private String vmManagerId;

    private String vmId;

    /**
     * @param vmManagerId
     */

    public void setVmManagerId(String vmManagerId) {
        this.vmManagerId = vmManagerId;
    }

    /**
     * @return
     */

    public String getVmManagerId() {
        return this.vmManagerId;
    }

    /**
     * @param vmManagerId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServerAddress withVmManagerId(String vmManagerId) {
        setVmManagerId(vmManagerId);
        return this;
    }

    /**
     * @param vmId
     */

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    /**
     * @return
     */

    public String getVmId() {
        return this.vmId;
    }

    /**
     * @param vmId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmServerAddress withVmId(String vmId) {
        setVmId(vmId);
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
        if (getVmManagerId() != null)
            sb.append("VmManagerId: " + getVmManagerId() + ",");
        if (getVmId() != null)
            sb.append("VmId: " + getVmId());
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
}
