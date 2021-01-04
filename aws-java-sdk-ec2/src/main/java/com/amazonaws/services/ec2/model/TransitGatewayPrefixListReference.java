/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a prefix list reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPrefixListReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPrefixListReference implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The ID of the prefix list owner.
     * </p>
     */
    private String prefixListOwnerId;
    /**
     * <p>
     * The state of the prefix list reference.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates whether traffic that matches this route is dropped.
     * </p>
     */
    private Boolean blackhole;
    /**
     * <p>
     * Information about the transit gateway attachment.
     * </p>
     */
    private TransitGatewayPrefixListAttachment transitGatewayAttachment;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @return The ID of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPrefixListReference withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
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

    public TransitGatewayPrefixListReference withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list owner.
     * </p>
     * 
     * @param prefixListOwnerId
     *        The ID of the prefix list owner.
     */

    public void setPrefixListOwnerId(String prefixListOwnerId) {
        this.prefixListOwnerId = prefixListOwnerId;
    }

    /**
     * <p>
     * The ID of the prefix list owner.
     * </p>
     * 
     * @return The ID of the prefix list owner.
     */

    public String getPrefixListOwnerId() {
        return this.prefixListOwnerId;
    }

    /**
     * <p>
     * The ID of the prefix list owner.
     * </p>
     * 
     * @param prefixListOwnerId
     *        The ID of the prefix list owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPrefixListReference withPrefixListOwnerId(String prefixListOwnerId) {
        setPrefixListOwnerId(prefixListOwnerId);
        return this;
    }

    /**
     * <p>
     * The state of the prefix list reference.
     * </p>
     * 
     * @param state
     *        The state of the prefix list reference.
     * @see TransitGatewayPrefixListReferenceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the prefix list reference.
     * </p>
     * 
     * @return The state of the prefix list reference.
     * @see TransitGatewayPrefixListReferenceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the prefix list reference.
     * </p>
     * 
     * @param state
     *        The state of the prefix list reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPrefixListReferenceState
     */

    public TransitGatewayPrefixListReference withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the prefix list reference.
     * </p>
     * 
     * @param state
     *        The state of the prefix list reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPrefixListReferenceState
     */

    public TransitGatewayPrefixListReference withState(TransitGatewayPrefixListReferenceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic that matches this route is dropped.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether traffic that matches this route is dropped.
     */

    public void setBlackhole(Boolean blackhole) {
        this.blackhole = blackhole;
    }

    /**
     * <p>
     * Indicates whether traffic that matches this route is dropped.
     * </p>
     * 
     * @return Indicates whether traffic that matches this route is dropped.
     */

    public Boolean getBlackhole() {
        return this.blackhole;
    }

    /**
     * <p>
     * Indicates whether traffic that matches this route is dropped.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether traffic that matches this route is dropped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPrefixListReference withBlackhole(Boolean blackhole) {
        setBlackhole(blackhole);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic that matches this route is dropped.
     * </p>
     * 
     * @return Indicates whether traffic that matches this route is dropped.
     */

    public Boolean isBlackhole() {
        return this.blackhole;
    }

    /**
     * <p>
     * Information about the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachment
     *        Information about the transit gateway attachment.
     */

    public void setTransitGatewayAttachment(TransitGatewayPrefixListAttachment transitGatewayAttachment) {
        this.transitGatewayAttachment = transitGatewayAttachment;
    }

    /**
     * <p>
     * Information about the transit gateway attachment.
     * </p>
     * 
     * @return Information about the transit gateway attachment.
     */

    public TransitGatewayPrefixListAttachment getTransitGatewayAttachment() {
        return this.transitGatewayAttachment;
    }

    /**
     * <p>
     * Information about the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachment
     *        Information about the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPrefixListReference withTransitGatewayAttachment(TransitGatewayPrefixListAttachment transitGatewayAttachment) {
        setTransitGatewayAttachment(transitGatewayAttachment);
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getPrefixListOwnerId() != null)
            sb.append("PrefixListOwnerId: ").append(getPrefixListOwnerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getBlackhole() != null)
            sb.append("Blackhole: ").append(getBlackhole()).append(",");
        if (getTransitGatewayAttachment() != null)
            sb.append("TransitGatewayAttachment: ").append(getTransitGatewayAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPrefixListReference == false)
            return false;
        TransitGatewayPrefixListReference other = (TransitGatewayPrefixListReference) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getPrefixListOwnerId() == null ^ this.getPrefixListOwnerId() == null)
            return false;
        if (other.getPrefixListOwnerId() != null && other.getPrefixListOwnerId().equals(this.getPrefixListOwnerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getBlackhole() == null ^ this.getBlackhole() == null)
            return false;
        if (other.getBlackhole() != null && other.getBlackhole().equals(this.getBlackhole()) == false)
            return false;
        if (other.getTransitGatewayAttachment() == null ^ this.getTransitGatewayAttachment() == null)
            return false;
        if (other.getTransitGatewayAttachment() != null && other.getTransitGatewayAttachment().equals(this.getTransitGatewayAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getPrefixListOwnerId() == null) ? 0 : getPrefixListOwnerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getBlackhole() == null) ? 0 : getBlackhole().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachment() == null) ? 0 : getTransitGatewayAttachment().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPrefixListReference clone() {
        try {
            return (TransitGatewayPrefixListReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
