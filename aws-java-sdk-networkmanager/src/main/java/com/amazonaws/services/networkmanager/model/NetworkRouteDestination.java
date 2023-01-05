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
 * Describes the destination of a network route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkRouteDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkRouteDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network attachment.
     * </p>
     */
    private String coreNetworkAttachmentId;
    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * The edge location for the network destination.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The ID of a core network attachment.
     * </p>
     * 
     * @param coreNetworkAttachmentId
     *        The ID of a core network attachment.
     */

    public void setCoreNetworkAttachmentId(String coreNetworkAttachmentId) {
        this.coreNetworkAttachmentId = coreNetworkAttachmentId;
    }

    /**
     * <p>
     * The ID of a core network attachment.
     * </p>
     * 
     * @return The ID of a core network attachment.
     */

    public String getCoreNetworkAttachmentId() {
        return this.coreNetworkAttachmentId;
    }

    /**
     * <p>
     * The ID of a core network attachment.
     * </p>
     * 
     * @param coreNetworkAttachmentId
     *        The ID of a core network attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withCoreNetworkAttachmentId(String coreNetworkAttachmentId) {
        setCoreNetworkAttachmentId(coreNetworkAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @return The ID of the transit gateway attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @return The name of the segment.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * The edge location for the network destination.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the network destination.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The edge location for the network destination.
     * </p>
     * 
     * @return The edge location for the network destination.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The edge location for the network destination.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the network destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRouteDestination withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getCoreNetworkAttachmentId() != null)
            sb.append("CoreNetworkAttachmentId: ").append(getCoreNetworkAttachmentId()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkRouteDestination == false)
            return false;
        NetworkRouteDestination other = (NetworkRouteDestination) obj;
        if (other.getCoreNetworkAttachmentId() == null ^ this.getCoreNetworkAttachmentId() == null)
            return false;
        if (other.getCoreNetworkAttachmentId() != null && other.getCoreNetworkAttachmentId().equals(this.getCoreNetworkAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkAttachmentId() == null) ? 0 : getCoreNetworkAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkRouteDestination clone() {
        try {
            return (NetworkRouteDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkRouteDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
