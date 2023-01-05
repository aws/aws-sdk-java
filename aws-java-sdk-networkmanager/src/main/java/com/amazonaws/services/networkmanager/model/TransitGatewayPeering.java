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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a transit gateway peering attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TransitGatewayPeering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPeering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes a transit gateway peer connection.
     * </p>
     */
    private Peering peering;
    /**
     * <p>
     * The ARN of the transit gateway.
     * </p>
     */
    private String transitGatewayArn;
    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     */
    private String transitGatewayPeeringAttachmentId;

    /**
     * <p>
     * Describes a transit gateway peer connection.
     * </p>
     * 
     * @param peering
     *        Describes a transit gateway peer connection.
     */

    public void setPeering(Peering peering) {
        this.peering = peering;
    }

    /**
     * <p>
     * Describes a transit gateway peer connection.
     * </p>
     * 
     * @return Describes a transit gateway peer connection.
     */

    public Peering getPeering() {
        return this.peering;
    }

    /**
     * <p>
     * Describes a transit gateway peer connection.
     * </p>
     * 
     * @param peering
     *        Describes a transit gateway peer connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeering withPeering(Peering peering) {
        setPeering(peering);
        return this;
    }

    /**
     * <p>
     * The ARN of the transit gateway.
     * </p>
     * 
     * @param transitGatewayArn
     *        The ARN of the transit gateway.
     */

    public void setTransitGatewayArn(String transitGatewayArn) {
        this.transitGatewayArn = transitGatewayArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway.
     * </p>
     * 
     * @return The ARN of the transit gateway.
     */

    public String getTransitGatewayArn() {
        return this.transitGatewayArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway.
     * </p>
     * 
     * @param transitGatewayArn
     *        The ARN of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeering withTransitGatewayArn(String transitGatewayArn) {
        setTransitGatewayArn(transitGatewayArn);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayPeeringAttachmentId
     *        The ID of the transit gateway peering attachment.
     */

    public void setTransitGatewayPeeringAttachmentId(String transitGatewayPeeringAttachmentId) {
        this.transitGatewayPeeringAttachmentId = transitGatewayPeeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @return The ID of the transit gateway peering attachment.
     */

    public String getTransitGatewayPeeringAttachmentId() {
        return this.transitGatewayPeeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayPeeringAttachmentId
     *        The ID of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeering withTransitGatewayPeeringAttachmentId(String transitGatewayPeeringAttachmentId) {
        setTransitGatewayPeeringAttachmentId(transitGatewayPeeringAttachmentId);
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
        if (getPeering() != null)
            sb.append("Peering: ").append(getPeering()).append(",");
        if (getTransitGatewayArn() != null)
            sb.append("TransitGatewayArn: ").append(getTransitGatewayArn()).append(",");
        if (getTransitGatewayPeeringAttachmentId() != null)
            sb.append("TransitGatewayPeeringAttachmentId: ").append(getTransitGatewayPeeringAttachmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPeering == false)
            return false;
        TransitGatewayPeering other = (TransitGatewayPeering) obj;
        if (other.getPeering() == null ^ this.getPeering() == null)
            return false;
        if (other.getPeering() != null && other.getPeering().equals(this.getPeering()) == false)
            return false;
        if (other.getTransitGatewayArn() == null ^ this.getTransitGatewayArn() == null)
            return false;
        if (other.getTransitGatewayArn() != null && other.getTransitGatewayArn().equals(this.getTransitGatewayArn()) == false)
            return false;
        if (other.getTransitGatewayPeeringAttachmentId() == null ^ this.getTransitGatewayPeeringAttachmentId() == null)
            return false;
        if (other.getTransitGatewayPeeringAttachmentId() != null
                && other.getTransitGatewayPeeringAttachmentId().equals(this.getTransitGatewayPeeringAttachmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeering() == null) ? 0 : getPeering().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayArn() == null) ? 0 : getTransitGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayPeeringAttachmentId() == null) ? 0 : getTransitGatewayPeeringAttachmentId().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPeering clone() {
        try {
            return (TransitGatewayPeering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.TransitGatewayPeeringMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
