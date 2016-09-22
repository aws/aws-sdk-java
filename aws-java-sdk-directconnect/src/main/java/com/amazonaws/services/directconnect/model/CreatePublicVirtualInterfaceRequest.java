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
 * Container for the parameters to the CreatePublicVirtualInterface operation.
 * </p>
 */
public class CreatePublicVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String connectionId;
    /**
     * <p>
     * Detailed information for the public virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private NewPublicVirtualInterface newPublicVirtualInterface;

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

    public CreatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPublicVirtualInterface
     *        Detailed information for the public virtual interface to be created.</p>
     *        <p>
     *        Default: None
     */

    public void setNewPublicVirtualInterface(NewPublicVirtualInterface newPublicVirtualInterface) {
        this.newPublicVirtualInterface = newPublicVirtualInterface;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Detailed information for the public virtual interface to be created.</p>
     *         <p>
     *         Default: None
     */

    public NewPublicVirtualInterface getNewPublicVirtualInterface() {
        return this.newPublicVirtualInterface;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPublicVirtualInterface
     *        Detailed information for the public virtual interface to be created.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicVirtualInterfaceRequest withNewPublicVirtualInterface(NewPublicVirtualInterface newPublicVirtualInterface) {
        setNewPublicVirtualInterface(newPublicVirtualInterface);
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
        if (getNewPublicVirtualInterface() != null)
            sb.append("NewPublicVirtualInterface: " + getNewPublicVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicVirtualInterfaceRequest == false)
            return false;
        CreatePublicVirtualInterfaceRequest other = (CreatePublicVirtualInterfaceRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewPublicVirtualInterface() == null ^ this.getNewPublicVirtualInterface() == null)
            return false;
        if (other.getNewPublicVirtualInterface() != null && other.getNewPublicVirtualInterface().equals(this.getNewPublicVirtualInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getNewPublicVirtualInterface() == null) ? 0 : getNewPublicVirtualInterface().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicVirtualInterfaceRequest clone() {
        return (CreatePublicVirtualInterfaceRequest) super.clone();
    }
}
