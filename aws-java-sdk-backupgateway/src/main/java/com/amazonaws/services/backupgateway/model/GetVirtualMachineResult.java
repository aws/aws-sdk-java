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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVirtualMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     * <code>GetVirtualMachine</code>
     * </p>
     */
    private VirtualMachineDetails virtualMachine;

    /**
     * <p>
     * This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     * <code>GetVirtualMachine</code>
     * </p>
     * 
     * @param virtualMachine
     *        This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     *        <code>GetVirtualMachine</code>
     */

    public void setVirtualMachine(VirtualMachineDetails virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    /**
     * <p>
     * This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     * <code>GetVirtualMachine</code>
     * </p>
     * 
     * @return This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     *         <code>GetVirtualMachine</code>
     */

    public VirtualMachineDetails getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     * <p>
     * This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     * <code>GetVirtualMachine</code>
     * </p>
     * 
     * @param virtualMachine
     *        This object contains the basic attributes of <code>VirtualMachine</code> contained by the output of
     *        <code>GetVirtualMachine</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVirtualMachineResult withVirtualMachine(VirtualMachineDetails virtualMachine) {
        setVirtualMachine(virtualMachine);
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
        if (getVirtualMachine() != null)
            sb.append("VirtualMachine: ").append(getVirtualMachine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVirtualMachineResult == false)
            return false;
        GetVirtualMachineResult other = (GetVirtualMachineResult) obj;
        if (other.getVirtualMachine() == null ^ this.getVirtualMachine() == null)
            return false;
        if (other.getVirtualMachine() != null && other.getVirtualMachine().equals(this.getVirtualMachine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualMachine() == null) ? 0 : getVirtualMachine().hashCode());
        return hashCode;
    }

    @Override
    public GetVirtualMachineResult clone() {
        try {
            return (GetVirtualMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
