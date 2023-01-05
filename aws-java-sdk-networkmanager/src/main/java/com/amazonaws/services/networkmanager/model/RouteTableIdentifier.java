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
 * Describes a route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RouteTableIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteTableIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableArn;
    /**
     * <p>
     * The segment edge in a core network.
     * </p>
     */
    private CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge;

    /**
     * <p>
     * The ARN of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableArn
     *        The ARN of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableArn(String transitGatewayRouteTableArn) {
        this.transitGatewayRouteTableArn = transitGatewayRouteTableArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway route table.
     * </p>
     * 
     * @return The ARN of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableArn() {
        return this.transitGatewayRouteTableArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableArn
     *        The ARN of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableIdentifier withTransitGatewayRouteTableArn(String transitGatewayRouteTableArn) {
        setTransitGatewayRouteTableArn(transitGatewayRouteTableArn);
        return this;
    }

    /**
     * <p>
     * The segment edge in a core network.
     * </p>
     * 
     * @param coreNetworkSegmentEdge
     *        The segment edge in a core network.
     */

    public void setCoreNetworkSegmentEdge(CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge) {
        this.coreNetworkSegmentEdge = coreNetworkSegmentEdge;
    }

    /**
     * <p>
     * The segment edge in a core network.
     * </p>
     * 
     * @return The segment edge in a core network.
     */

    public CoreNetworkSegmentEdgeIdentifier getCoreNetworkSegmentEdge() {
        return this.coreNetworkSegmentEdge;
    }

    /**
     * <p>
     * The segment edge in a core network.
     * </p>
     * 
     * @param coreNetworkSegmentEdge
     *        The segment edge in a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableIdentifier withCoreNetworkSegmentEdge(CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge) {
        setCoreNetworkSegmentEdge(coreNetworkSegmentEdge);
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
        if (getTransitGatewayRouteTableArn() != null)
            sb.append("TransitGatewayRouteTableArn: ").append(getTransitGatewayRouteTableArn()).append(",");
        if (getCoreNetworkSegmentEdge() != null)
            sb.append("CoreNetworkSegmentEdge: ").append(getCoreNetworkSegmentEdge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTableIdentifier == false)
            return false;
        RouteTableIdentifier other = (RouteTableIdentifier) obj;
        if (other.getTransitGatewayRouteTableArn() == null ^ this.getTransitGatewayRouteTableArn() == null)
            return false;
        if (other.getTransitGatewayRouteTableArn() != null && other.getTransitGatewayRouteTableArn().equals(this.getTransitGatewayRouteTableArn()) == false)
            return false;
        if (other.getCoreNetworkSegmentEdge() == null ^ this.getCoreNetworkSegmentEdge() == null)
            return false;
        if (other.getCoreNetworkSegmentEdge() != null && other.getCoreNetworkSegmentEdge().equals(this.getCoreNetworkSegmentEdge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableArn() == null) ? 0 : getTransitGatewayRouteTableArn().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkSegmentEdge() == null) ? 0 : getCoreNetworkSegmentEdge().hashCode());
        return hashCode;
    }

    @Override
    public RouteTableIdentifier clone() {
        try {
            return (RouteTableIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RouteTableIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
