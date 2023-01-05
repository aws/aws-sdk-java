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
 * Describes a transit gateway route table attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TransitGatewayRouteTableAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTableAttachment implements Serializable, Cloneable, StructuredPojo {

    private Attachment attachment;
    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     */
    private String peeringId;
    /**
     * <p>
     * The ARN of the transit gateway attachment route table.
     * </p>
     */
    private String transitGatewayRouteTableArn;

    /**
     * @param attachment
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * @return
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * @param attachment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAttachment withAttachment(Attachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering attachment.
     */

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @return The ID of the peering attachment.
     */

    public String getPeeringId() {
        return this.peeringId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAttachment withPeeringId(String peeringId) {
        setPeeringId(peeringId);
        return this;
    }

    /**
     * <p>
     * The ARN of the transit gateway attachment route table.
     * </p>
     * 
     * @param transitGatewayRouteTableArn
     *        The ARN of the transit gateway attachment route table.
     */

    public void setTransitGatewayRouteTableArn(String transitGatewayRouteTableArn) {
        this.transitGatewayRouteTableArn = transitGatewayRouteTableArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway attachment route table.
     * </p>
     * 
     * @return The ARN of the transit gateway attachment route table.
     */

    public String getTransitGatewayRouteTableArn() {
        return this.transitGatewayRouteTableArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway attachment route table.
     * </p>
     * 
     * @param transitGatewayRouteTableArn
     *        The ARN of the transit gateway attachment route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAttachment withTransitGatewayRouteTableArn(String transitGatewayRouteTableArn) {
        setTransitGatewayRouteTableArn(transitGatewayRouteTableArn);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getPeeringId() != null)
            sb.append("PeeringId: ").append(getPeeringId()).append(",");
        if (getTransitGatewayRouteTableArn() != null)
            sb.append("TransitGatewayRouteTableArn: ").append(getTransitGatewayRouteTableArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRouteTableAttachment == false)
            return false;
        TransitGatewayRouteTableAttachment other = (TransitGatewayRouteTableAttachment) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getPeeringId() == null ^ this.getPeeringId() == null)
            return false;
        if (other.getPeeringId() != null && other.getPeeringId().equals(this.getPeeringId()) == false)
            return false;
        if (other.getTransitGatewayRouteTableArn() == null ^ this.getTransitGatewayRouteTableArn() == null)
            return false;
        if (other.getTransitGatewayRouteTableArn() != null && other.getTransitGatewayRouteTableArn().equals(this.getTransitGatewayRouteTableArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getPeeringId() == null) ? 0 : getPeeringId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayRouteTableArn() == null) ? 0 : getTransitGatewayRouteTableArn().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRouteTableAttachment clone() {
        try {
            return (TransitGatewayRouteTableAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.TransitGatewayRouteTableAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
