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
 * Describes a transit gateway policy table association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPolicyTableAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyTableAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway policy table.
     * </p>
     */
    private String transitGatewayPolicyTableId;
    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The resource ID of the transit gateway attachment.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type for the transit gateway policy table association.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The state of the transit gateway policy table association.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTableId
     *        The ID of the transit gateway policy table.
     */

    public void setTransitGatewayPolicyTableId(String transitGatewayPolicyTableId) {
        this.transitGatewayPolicyTableId = transitGatewayPolicyTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway policy table.
     * </p>
     * 
     * @return The ID of the transit gateway policy table.
     */

    public String getTransitGatewayPolicyTableId() {
        return this.transitGatewayPolicyTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTableId
     *        The ID of the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTableAssociation withTransitGatewayPolicyTableId(String transitGatewayPolicyTableId) {
        setTransitGatewayPolicyTableId(transitGatewayPolicyTableId);
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

    public TransitGatewayPolicyTableAssociation withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The resource ID of the transit gateway attachment.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the transit gateway attachment.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID of the transit gateway attachment.
     * </p>
     * 
     * @return The resource ID of the transit gateway attachment.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID of the transit gateway attachment.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTableAssociation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type for the transit gateway policy table association.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the transit gateway policy table association.
     * @see TransitGatewayAttachmentResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for the transit gateway policy table association.
     * </p>
     * 
     * @return The resource type for the transit gateway policy table association.
     * @see TransitGatewayAttachmentResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type for the transit gateway policy table association.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentResourceType
     */

    public TransitGatewayPolicyTableAssociation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type for the transit gateway policy table association.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentResourceType
     */

    public TransitGatewayPolicyTableAssociation withResourceType(TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway policy table association.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table association.
     * @see TransitGatewayAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway policy table association.
     * </p>
     * 
     * @return The state of the transit gateway policy table association.
     * @see TransitGatewayAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway policy table association.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAssociationState
     */

    public TransitGatewayPolicyTableAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway policy table association.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAssociationState
     */

    public TransitGatewayPolicyTableAssociation withState(TransitGatewayAssociationState state) {
        this.state = state.toString();
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
        if (getTransitGatewayPolicyTableId() != null)
            sb.append("TransitGatewayPolicyTableId: ").append(getTransitGatewayPolicyTableId()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPolicyTableAssociation == false)
            return false;
        TransitGatewayPolicyTableAssociation other = (TransitGatewayPolicyTableAssociation) obj;
        if (other.getTransitGatewayPolicyTableId() == null ^ this.getTransitGatewayPolicyTableId() == null)
            return false;
        if (other.getTransitGatewayPolicyTableId() != null && other.getTransitGatewayPolicyTableId().equals(this.getTransitGatewayPolicyTableId()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTableId() == null) ? 0 : getTransitGatewayPolicyTableId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPolicyTableAssociation clone() {
        try {
            return (TransitGatewayPolicyTableAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
