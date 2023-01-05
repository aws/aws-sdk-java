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
 * Describes a transit gateway policy table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPolicyTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyTable implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway policy table.
     * </p>
     */
    private String transitGatewayPolicyTableId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The state of the transit gateway policy table
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp when the transit gateway policy table was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * he key-value pairs associated with the transit gateway policy table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public TransitGatewayPolicyTable withTransitGatewayPolicyTableId(String transitGatewayPolicyTableId) {
        setTransitGatewayPolicyTableId(transitGatewayPolicyTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTable withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway policy table
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table
     * @see TransitGatewayPolicyTableState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway policy table
     * </p>
     * 
     * @return The state of the transit gateway policy table
     * @see TransitGatewayPolicyTableState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway policy table
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPolicyTableState
     */

    public TransitGatewayPolicyTable withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway policy table
     * </p>
     * 
     * @param state
     *        The state of the transit gateway policy table
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPolicyTableState
     */

    public TransitGatewayPolicyTable withState(TransitGatewayPolicyTableState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the transit gateway policy table was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the transit gateway policy table was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the transit gateway policy table was created.
     * </p>
     * 
     * @return The timestamp when the transit gateway policy table was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the transit gateway policy table was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the transit gateway policy table was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTable withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * he key-value pairs associated with the transit gateway policy table.
     * </p>
     * 
     * @return he key-value pairs associated with the transit gateway policy table.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * he key-value pairs associated with the transit gateway policy table.
     * </p>
     * 
     * @param tags
     *        he key-value pairs associated with the transit gateway policy table.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * he key-value pairs associated with the transit gateway policy table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        he key-value pairs associated with the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTable withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * he key-value pairs associated with the transit gateway policy table.
     * </p>
     * 
     * @param tags
     *        he key-value pairs associated with the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTable withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPolicyTable == false)
            return false;
        TransitGatewayPolicyTable other = (TransitGatewayPolicyTable) obj;
        if (other.getTransitGatewayPolicyTableId() == null ^ this.getTransitGatewayPolicyTableId() == null)
            return false;
        if (other.getTransitGatewayPolicyTableId() != null && other.getTransitGatewayPolicyTableId().equals(this.getTransitGatewayPolicyTableId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTableId() == null) ? 0 : getTransitGatewayPolicyTableId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPolicyTable clone() {
        try {
            return (TransitGatewayPolicyTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
