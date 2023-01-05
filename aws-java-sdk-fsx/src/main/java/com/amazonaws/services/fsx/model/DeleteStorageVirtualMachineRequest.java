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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStorageVirtualMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the SVM that you want to delete.
     * </p>
     */
    private String storageVirtualMachineId;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStorageVirtualMachineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the SVM that you want to delete.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM that you want to delete.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM that you want to delete.
     * </p>
     * 
     * @return The ID of the SVM that you want to delete.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM that you want to delete.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStorageVirtualMachineRequest withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getStorageVirtualMachineId() != null)
            sb.append("StorageVirtualMachineId: ").append(getStorageVirtualMachineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStorageVirtualMachineRequest == false)
            return false;
        DeleteStorageVirtualMachineRequest other = (DeleteStorageVirtualMachineRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getStorageVirtualMachineId() == null ^ this.getStorageVirtualMachineId() == null)
            return false;
        if (other.getStorageVirtualMachineId() != null && other.getStorageVirtualMachineId().equals(this.getStorageVirtualMachineId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStorageVirtualMachineRequest clone() {
        return (DeleteStorageVirtualMachineRequest) super.clone();
    }

}
