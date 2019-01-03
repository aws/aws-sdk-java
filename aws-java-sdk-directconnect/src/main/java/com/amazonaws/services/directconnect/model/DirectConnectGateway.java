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
 * Information about a Direct Connect gateway, which enables you to connect virtual interfaces and virtual private
 * gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGateway" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayName;
    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     * </p>
     * </li>
     * </ul>
     */
    private String directConnectGatewayState;
    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     */
    private String stateChangeError;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayName
     *        The name of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayName(String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     * 
     * @return The name of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayName() {
        return this.directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayName
     *        The name of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withDirectConnectGatewayName(String directConnectGatewayName) {
        setDirectConnectGatewayName(directConnectGatewayName);
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for the Amazon side of the connection.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @return The autonomous system number (ASN) for the Amazon side of the connection.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for the Amazon side of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the Direct Connect gateway.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param directConnectGatewayState
     *        The state of the Direct Connect gateway. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The Direct Connect gateway is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     *        </p>
     *        </li>
     * @see DirectConnectGatewayState
     */

    public void setDirectConnectGatewayState(String directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the Direct Connect gateway. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The Direct Connect gateway is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     *         </p>
     *         </li>
     * @see DirectConnectGatewayState
     */

    public String getDirectConnectGatewayState() {
        return this.directConnectGatewayState;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param directConnectGatewayState
     *        The state of the Direct Connect gateway. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The Direct Connect gateway is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayState
     */

    public DirectConnectGateway withDirectConnectGatewayState(String directConnectGatewayState) {
        setDirectConnectGatewayState(directConnectGatewayState);
        return this;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param directConnectGatewayState
     *        The state of the Direct Connect gateway. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The initial state after calling <a>CreateDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The Direct Connect gateway is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The Direct Connect gateway is deleted and cannot pass traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayState
     */

    public DirectConnectGateway withDirectConnectGatewayState(DirectConnectGatewayState directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState.toString();
        return this;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @param stateChangeError
     *        The error message if the state of an object failed to advance.
     */

    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @return The error message if the state of an object failed to advance.
     */

    public String getStateChangeError() {
        return this.stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @param stateChangeError
     *        The error message if the state of an object failed to advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withStateChangeError(String stateChangeError) {
        setStateChangeError(stateChangeError);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getDirectConnectGatewayName() != null)
            sb.append("DirectConnectGatewayName: ").append(getDirectConnectGatewayName()).append(",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getDirectConnectGatewayState() != null)
            sb.append("DirectConnectGatewayState: ").append(getDirectConnectGatewayState()).append(",");
        if (getStateChangeError() != null)
            sb.append("StateChangeError: ").append(getStateChangeError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGateway == false)
            return false;
        DirectConnectGateway other = (DirectConnectGateway) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayName() == null ^ this.getDirectConnectGatewayName() == null)
            return false;
        if (other.getDirectConnectGatewayName() != null && other.getDirectConnectGatewayName().equals(this.getDirectConnectGatewayName()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getDirectConnectGatewayState() == null ^ this.getDirectConnectGatewayState() == null)
            return false;
        if (other.getDirectConnectGatewayState() != null && other.getDirectConnectGatewayState().equals(this.getDirectConnectGatewayState()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayName() == null) ? 0 : getDirectConnectGatewayName().hashCode());
        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayState() == null) ? 0 : getDirectConnectGatewayState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public DirectConnectGateway clone() {
        try {
            return (DirectConnectGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.DirectConnectGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
