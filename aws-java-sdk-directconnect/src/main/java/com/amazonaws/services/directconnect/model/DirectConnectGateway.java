/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A direct connect gateway is an intermediate object that enables you to connect virtual interfaces and virtual private
 * gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGateway" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGateway implements Serializable, Cloneable, StructuredPojo {

    private String directConnectGatewayId;

    private String directConnectGatewayName;
    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * The AWS account ID of the owner of the direct connect gateway.
     * </p>
     */
    private String ownerAccount;

    private String directConnectGatewayState;

    private String stateChangeError;

    /**
     * @param directConnectGatewayId
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * @return
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * @param directConnectGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * @param directConnectGatewayName
     */

    public void setDirectConnectGatewayName(String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
    }

    /**
     * @return
     */

    public String getDirectConnectGatewayName() {
        return this.directConnectGatewayName;
    }

    /**
     * @param directConnectGatewayName
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
     * The AWS account ID of the owner of the direct connect gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account ID of the owner of the direct connect gateway.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the direct connect gateway.
     * </p>
     * 
     * @return The AWS account ID of the owner of the direct connect gateway.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the direct connect gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account ID of the owner of the direct connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * @param directConnectGatewayState
     * @see DirectConnectGatewayState
     */

    public void setDirectConnectGatewayState(String directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState;
    }

    /**
     * @return
     * @see DirectConnectGatewayState
     */

    public String getDirectConnectGatewayState() {
        return this.directConnectGatewayState;
    }

    /**
     * @param directConnectGatewayState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayState
     */

    public DirectConnectGateway withDirectConnectGatewayState(String directConnectGatewayState) {
        setDirectConnectGatewayState(directConnectGatewayState);
        return this;
    }

    /**
     * @param directConnectGatewayState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayState
     */

    public DirectConnectGateway withDirectConnectGatewayState(DirectConnectGatewayState directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState.toString();
        return this;
    }

    /**
     * @param stateChangeError
     */

    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * @return
     */

    public String getStateChangeError() {
        return this.stateChangeError;
    }

    /**
     * @param stateChangeError
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGateway withStateChangeError(String stateChangeError) {
        setStateChangeError(stateChangeError);
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
