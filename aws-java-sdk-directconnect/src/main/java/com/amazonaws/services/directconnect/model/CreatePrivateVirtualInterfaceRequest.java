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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePrivateVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     */
    private NewPrivateVirtualInterface newPrivateVirtualInterface;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivateVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     * 
     * @param newPrivateVirtualInterface
     *        Information about the private virtual interface.
     */

    public void setNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     * 
     * @return Information about the private virtual interface.
     */

    public NewPrivateVirtualInterface getNewPrivateVirtualInterface() {
        return this.newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     * 
     * @param newPrivateVirtualInterface
     *        Information about the private virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivateVirtualInterfaceRequest withNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        setNewPrivateVirtualInterface(newPrivateVirtualInterface);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getNewPrivateVirtualInterface() != null)
            sb.append("NewPrivateVirtualInterface: ").append(getNewPrivateVirtualInterface());
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
