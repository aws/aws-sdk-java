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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayRouteTableAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayRouteTableAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The route table associated with the create transit gateway route table attachment request.
     * </p>
     */
    private TransitGatewayRouteTableAttachment transitGatewayRouteTableAttachment;

    /**
     * <p>
     * The route table associated with the create transit gateway route table attachment request.
     * </p>
     * 
     * @param transitGatewayRouteTableAttachment
     *        The route table associated with the create transit gateway route table attachment request.
     */

    public void setTransitGatewayRouteTableAttachment(TransitGatewayRouteTableAttachment transitGatewayRouteTableAttachment) {
        this.transitGatewayRouteTableAttachment = transitGatewayRouteTableAttachment;
    }

    /**
     * <p>
     * The route table associated with the create transit gateway route table attachment request.
     * </p>
     * 
     * @return The route table associated with the create transit gateway route table attachment request.
     */

    public TransitGatewayRouteTableAttachment getTransitGatewayRouteTableAttachment() {
        return this.transitGatewayRouteTableAttachment;
    }

    /**
     * <p>
     * The route table associated with the create transit gateway route table attachment request.
     * </p>
     * 
     * @param transitGatewayRouteTableAttachment
     *        The route table associated with the create transit gateway route table attachment request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRouteTableAttachmentResult withTransitGatewayRouteTableAttachment(
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

        if (obj instanceof CreateTransitGatewayRouteTableAttachmentResult == false)
            return false;
        CreateTransitGatewayRouteTableAttachmentResult other = (CreateTransitGatewayRouteTableAttachmentResult) obj;
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
    public CreateTransitGatewayRouteTableAttachmentResult clone() {
        try {
            return (CreateTransitGatewayRouteTableAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
