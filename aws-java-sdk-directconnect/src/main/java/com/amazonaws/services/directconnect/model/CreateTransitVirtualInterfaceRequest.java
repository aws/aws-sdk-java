/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateTransitVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     */
    private NewTransitVirtualInterface newTransitVirtualInterface;

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

    public CreateTransitVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @param newTransitVirtualInterface
     *        Information about the transit virtual interface.
     */

    public void setNewTransitVirtualInterface(NewTransitVirtualInterface newTransitVirtualInterface) {
        this.newTransitVirtualInterface = newTransitVirtualInterface;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @return Information about the transit virtual interface.
     */

    public NewTransitVirtualInterface getNewTransitVirtualInterface() {
        return this.newTransitVirtualInterface;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @param newTransitVirtualInterface
     *        Information about the transit virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitVirtualInterfaceRequest withNewTransitVirtualInterface(NewTransitVirtualInterface newTransitVirtualInterface) {
        setNewTransitVirtualInterface(newTransitVirtualInterface);
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
        if (getNewTransitVirtualInterface() != null)
            sb.append("NewTransitVirtualInterface: ").append(getNewTransitVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitVirtualInterfaceRequest == false)
            return false;
        CreateTransitVirtualInterfaceRequest other = (CreateTransitVirtualInterfaceRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewTransitVirtualInterface() == null ^ this.getNewTransitVirtualInterface() == null)
            return false;
        if (other.getNewTransitVirtualInterface() != null && other.getNewTransitVirtualInterface().equals(this.getNewTransitVirtualInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getNewTransitVirtualInterface() == null) ? 0 : getNewTransitVirtualInterface().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitVirtualInterfaceRequest clone() {
        return (CreateTransitVirtualInterfaceRequest) super.clone();
    }

}
