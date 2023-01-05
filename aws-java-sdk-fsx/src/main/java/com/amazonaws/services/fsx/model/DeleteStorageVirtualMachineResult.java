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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStorageVirtualMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the SVM Amazon FSx is deleting.
     * </p>
     */
    private String storageVirtualMachineId;
    /**
     * <p>
     * Describes the lifecycle state of the SVM being deleted.
     * </p>
     */
    private String lifecycle;

    /**
     * <p>
     * The ID of the SVM Amazon FSx is deleting.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM Amazon FSx is deleting.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM Amazon FSx is deleting.
     * </p>
     * 
     * @return The ID of the SVM Amazon FSx is deleting.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM Amazon FSx is deleting.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM Amazon FSx is deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStorageVirtualMachineResult withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
        return this;
    }

    /**
     * <p>
     * Describes the lifecycle state of the SVM being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the SVM being deleted.
     * @see StorageVirtualMachineLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the lifecycle state of the SVM being deleted.
     * </p>
     * 
     * @return Describes the lifecycle state of the SVM being deleted.
     * @see StorageVirtualMachineLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the lifecycle state of the SVM being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the SVM being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineLifecycle
     */

    public DeleteStorageVirtualMachineResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the lifecycle state of the SVM being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the SVM being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineLifecycle
     */

    public DeleteStorageVirtualMachineResult withLifecycle(StorageVirtualMachineLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
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
        if (getStorageVirtualMachineId() != null)
            sb.append("StorageVirtualMachineId: ").append(getStorageVirtualMachineId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStorageVirtualMachineResult == false)
            return false;
        DeleteStorageVirtualMachineResult other = (DeleteStorageVirtualMachineResult) obj;
        if (other.getStorageVirtualMachineId() == null ^ this.getStorageVirtualMachineId() == null)
            return false;
        if (other.getStorageVirtualMachineId() != null && other.getStorageVirtualMachineId().equals(this.getStorageVirtualMachineId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStorageVirtualMachineResult clone() {
        try {
            return (DeleteStorageVirtualMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
