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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRouteTableAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayRouteTableAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns information about the transit gateway route table attachment.
     * </p>
     */
    private TransitGatewayRouteTableAttachment transitGatewayRouteTableAttachment;

    /**
     * <p>
     * Returns information about the transit gateway route table attachment.
     * </p>
     * 
     * @param transitGatewayRouteTableAttachment
     *        Returns information about the transit gateway route table attachment.
     */

    public void setTransitGatewayRouteTableAttachment(TransitGatewayRouteTableAttachment transitGatewayRouteTableAttachment) {
        this.transitGatewayRouteTableAttachment = transitGatewayRouteTableAttachment;
    }

    /**
     * <p>
     * Returns information about the transit gateway route table attachment.
     * </p>
     * 
     * @return Returns information about the transit gateway route table attachment.
     */

    public TransitGatewayRouteTableAttachment getTransitGatewayRouteTableAttachment() {
        return this.transitGatewayRouteTableAttachment;
    }

    /**
     * <p>
     * Returns information about the transit gateway route table attachment.
     * </p>
     * 
     * @param transitGatewayRouteTableAttachment
     *        Returns information about the transit gateway route table attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayRouteTableAttachmentResult withTransitGatewayRouteTableAttachment(
            TransitGatewayRouteTableAttachment transitGatewayRouteTableAttachment) {
        setTransitGatewayRouteTableAttachment(transitGatewayRouteTableAttachment);
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
        if (getTransitGatewayRouteTableAttachment() != null)
            sb.append("TransitGatewayRouteTableAttachment: ").append(getTransitGatewayRouteTableAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTransitGatewayRouteTableAttachmentResult == false)
            return false;
        GetTransitGatewayRouteTableAttachmentResult other = (GetTransitGatewayRouteTableAttachmentResult) obj;
        if (other.getTransitGatewayRouteTableAttachment() == null ^ this.getTransitGatewayRouteTableAttachment() == null)
            return false;
        if (other.getTransitGatewayRouteTableAttachment() != null
                && other.getTransitGatewayRouteTableAttachment().equals(this.getTransitGatewayRouteTableAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableAttachment() == null) ? 0 : getTransitGatewayRouteTableAttachment().hashCode());
        return hashCode;
    }

    @Override
    public GetTransitGatewayRouteTableAttachmentResult clone() {
        try {
            return (GetTransitGatewayRouteTableAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
