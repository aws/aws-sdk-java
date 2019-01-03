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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a virtual private gateway for a private virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/VirtualGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayId;
    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to send
     * traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     */
    private String virtualGatewayState;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGateway withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to send
     * traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualGatewayState
     *        The state of the virtual private gateway. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: Initial state after creating the virtual private gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: Ready for use by a private virtual interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: Initial state after deleting the virtual private gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to
     *        send traffic over this gateway.
     *        </p>
     *        </li>
     */

    public void setVirtualGatewayState(String virtualGatewayState) {
        this.virtualGatewayState = virtualGatewayState;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to send
     * traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the virtual private gateway. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code>: Initial state after creating the virtual private gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: Ready for use by a private virtual interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: Initial state after deleting the virtual private gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to
     *         send traffic over this gateway.
     *         </p>
     *         </li>
     */

    public String getVirtualGatewayState() {
        return this.virtualGatewayState;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to send
     * traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualGatewayState
     *        The state of the virtual private gateway. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: Initial state after creating the virtual private gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: Ready for use by a private virtual interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: Initial state after deleting the virtual private gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The virtual private gateway is deleted. The private virtual interface is unable to
     *        send traffic over this gateway.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGateway withVirtualGatewayState(String virtualGatewayState) {
        setVirtualGatewayState(virtualGatewayState);
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
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getVirtualGatewayState() != null)
            sb.append("VirtualGatewayState: ").append(getVirtualGatewayState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGateway == false)
            return false;
        VirtualGateway other = (VirtualGateway) obj;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayState() == null ^ this.getVirtualGatewayState() == null)
            return false;
        if (other.getVirtualGatewayState() != null && other.getVirtualGatewayState().equals(this.getVirtualGatewayState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayState() == null) ? 0 : getVirtualGatewayState().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGateway clone() {
        try {
            return (VirtualGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.VirtualGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
