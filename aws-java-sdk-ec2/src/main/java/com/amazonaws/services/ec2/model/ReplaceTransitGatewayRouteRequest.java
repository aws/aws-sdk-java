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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReplaceTransitGatewayRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceTransitGatewayRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ReplaceTransitGatewayRouteRequest> {

    /**
     * <p>
     * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * Indicates whether traffic matching this route is to be dropped.
     * </p>
     */
    private Boolean blackhole;

    /**
     * <p>
     * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @return The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range used for the destination match. Routing decisions are based on the most specific match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceTransitGatewayRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceTransitGatewayRouteRequest withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceTransitGatewayRouteRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic matching this route is to be dropped.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether traffic matching this route is to be dropped.
     */

    public void setBlackhole(Boolean blackhole) {
        this.blackhole = blackhole;
    }

    /**
     * <p>
     * Indicates whether traffic matching this route is to be dropped.
     * </p>
     * 
     * @return Indicates whether traffic matching this route is to be dropped.
     */

    public Boolean getBlackhole() {
        return this.blackhole;
    }

    /**
     * <p>
     * Indicates whether traffic matching this route is to be dropped.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether traffic matching this route is to be dropped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceTransitGatewayRouteRequest withBlackhole(Boolean blackhole) {
        setBlackhole(blackhole);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic matching this route is to be dropped.
     * </p>
     * 
     * @return Indicates whether traffic matching this route is to be dropped.
     */

    public Boolean isBlackhole() {
        return this.blackhole;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReplaceTransitGatewayRouteRequest> getDryRunRequest() {
        Request<ReplaceTransitGatewayRouteRequest> request = new ReplaceTransitGatewayRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getBlackhole() != null)
            sb.append("Blackhole: ").append(getBlackhole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceTransitGatewayRouteRequest == false)
            return false;
        ReplaceTransitGatewayRouteRequest other = (ReplaceTransitGatewayRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getBlackhole() == null ^ this.getBlackhole() == null)
            return false;
        if (other.getBlackhole() != null && other.getBlackhole().equals(this.getBlackhole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getBlackhole() == null) ? 0 : getBlackhole().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceTransitGatewayRouteRequest clone() {
        return (ReplaceTransitGatewayRouteRequest) super.clone();
    }
}
