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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageVirtualMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private StorageVirtualMachine storageVirtualMachine;

    /**
     * @param storageVirtualMachine
     */

    public void setStorageVirtualMachine(StorageVirtualMachine storageVirtualMachine) {
        this.storageVirtualMachine = storageVirtualMachine;
    }

    /**
     * @return
     */

    public StorageVirtualMachine getStorageVirtualMachine() {
        return this.storageVirtualMachine;
    }

    /**
     * @param storageVirtualMachine
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageVirtualMachineResult withStorageVirtualMachine(StorageVirtualMachine storageVirtualMachine) {
        setStorageVirtualMachine(storageVirtualMachine);
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
        if (getStorageVirtualMachine() != null)
            sb.append("StorageVirtualMachine: ").append(getStorageVirtualMachine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageVirtualMachineResult == false)
            return false;
        UpdateStorageVirtualMachineResult other = (UpdateStorageVirtualMachineResult) obj;
        if (other.getStorageVirtualMachine() == null ^ this.getStorageVirtualMachine() == null)
            return false;
        if (other.getStorageVirtualMachine() != null && other.getStorageVirtualMachine().equals(this.getStorageVirtualMachine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageVirtualMachine() == null) ? 0 : getStorageVirtualMachine().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageVirtualMachineResult clone() {
        try {
            return (UpdateStorageVirtualMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
