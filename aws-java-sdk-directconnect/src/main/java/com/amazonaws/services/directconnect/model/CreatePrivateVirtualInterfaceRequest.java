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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the CreatePrivateVirtualInterface operation.
 * </p>
 */
public class CreatePrivateVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String connectionId;
    /**
     * <p>
     * Detailed information for the private virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private NewPrivateVirtualInterface newPrivateVirtualInterface;

    /**
     * @param connectionId
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * @return
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @param connectionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivateVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * Detailed information for the private virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPrivateVirtualInterface
     *        Detailed information for the private virtual interface to be created.</p>
     *        <p>
     *        Default: None
     */

    public void setNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Detailed information for the private virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Detailed information for the private virtual interface to be created.</p>
     *         <p>
     *         Default: None
     */

    public NewPrivateVirtualInterface getNewPrivateVirtualInterface() {
        return this.newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Detailed information for the private virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPrivateVirtualInterface
     *        Detailed information for the private virtual interface to be created.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivateVirtualInterfaceRequest withNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        setNewPrivateVirtualInterface(newPrivateVirtualInterface);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getNewPrivateVirtualInterface() != null)
            sb.append("NewPrivateVirtualInterface: " + getNewPrivateVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePrivateVirtualInterfaceRequest == false)
            return false;
        CreatePrivateVirtualInterfaceRequest other = (CreatePrivateVirtualInterfaceRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewPrivateVirtualInterface() == null ^ this.getNewPrivateVirtualInterface() == null)
            return false;
        if (other.getNewPrivateVirtualInterface() != null && other.getNewPrivateVirtualInterface().equals(this.getNewPrivateVirtualInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getNewPrivateVirtualInterface() == null) ? 0 : getNewPrivateVirtualInterface().hashCode());
        return hashCode;
    }

    @Override
    public CreatePrivateVirtualInterfaceRequest clone() {
        return (CreatePrivateVirtualInterfaceRequest) super.clone();
    }
}
