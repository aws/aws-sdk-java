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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a route in a transit gateway route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayRouteTableRoute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTableRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     */
    private String destinationCidr;
    /**
     * <p>
     * The state of the route.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The route origin. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * static
     * </p>
     * </li>
     * <li>
     * <p>
     * propagated
     * </p>
     * </li>
     * </ul>
     */
    private String routeOrigin;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The ID of the route attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * The ID of the resource for the route attachment.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type for the route attachment.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidr
     *        The CIDR block used for destination matches.
     */

    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @return The CIDR block used for destination matches.
     */

    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidr
     *        The CIDR block used for destination matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withDestinationCidr(String destinationCidr) {
        setDestinationCidr(destinationCidr);
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @return The state of the route.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The route origin. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * static
     * </p>
     * </li>
     * <li>
     * <p>
     * propagated
     * </p>
     * </li>
     * </ul>
     * 
     * @param routeOrigin
     *        The route origin. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        static
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        propagated
     *        </p>
     *        </li>
     */

    public void setRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
    }

    /**
     * <p>
     * The route origin. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * static
     * </p>
     * </li>
     * <li>
     * <p>
     * propagated
     * </p>
     * </li>
     * </ul>
     * 
     * @return The route origin. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         static
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         propagated
     *         </p>
     *         </li>
     */

    public String getRouteOrigin() {
        return this.routeOrigin;
    }

    /**
     * <p>
     * The route origin. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * static
     * </p>
     * </li>
     * <li>
     * <p>
     * propagated
     * </p>
     * </li>
     * </ul>
     * 
     * @param routeOrigin
     *        The route origin. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        static
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        propagated
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withRouteOrigin(String routeOrigin) {
        setRouteOrigin(routeOrigin);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of the route attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the route attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the route attachment.
     * </p>
     * 
     * @return The ID of the route attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the route attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the route attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the resource for the route attachment.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for the route attachment.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for the route attachment.
     * </p>
     * 
     * @return The ID of the resource for the route attachment.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource for the route attachment.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for the route attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type for the route attachment.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the route attachment.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for the route attachment.
     * </p>
     * 
     * @return The resource type for the route attachment.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type for the route attachment.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the route attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableRoute withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: ").append(getDestinationCidr()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRouteOrigin() != null)
            sb.append("RouteOrigin: ").append(getRouteOrigin()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRouteTableRoute == false)
            return false;
        TransitGatewayRouteTableRoute other = (TransitGatewayRouteTableRoute) obj;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRouteOrigin() == null ^ this.getRouteOrigin() == null)
            return false;
        if (other.getRouteOrigin() != null && other.getRouteOrigin().equals(this.getRouteOrigin()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRouteOrigin() == null) ? 0 : getRouteOrigin().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRouteTableRoute clone() {
        try {
            return (TransitGatewayRouteTableRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
