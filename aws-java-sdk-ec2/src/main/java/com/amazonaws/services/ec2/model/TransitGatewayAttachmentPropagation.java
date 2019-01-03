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

/**
 * <p>
 * Describes a propagation route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayAttachmentPropagation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayAttachmentPropagation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the propagation route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     * 
     * @return The ID of the propagation route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayAttachmentPropagation withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * 
     * @param state
     *        The state of the propagation route table.
     * @see TransitGatewayPropagationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * 
     * @return The state of the propagation route table.
     * @see TransitGatewayPropagationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * 
     * @param state
     *        The state of the propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPropagationState
     */

    public TransitGatewayAttachmentPropagation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * 
     * @param state
     *        The state of the propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayPropagationState
     */

    public TransitGatewayAttachmentPropagation withState(TransitGatewayPropagationState state) {
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
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

        if (obj instanceof TransitGatewayAttachmentPropagation == false)
            return false;
        TransitGatewayAttachmentPropagation other = (TransitGatewayAttachmentPropagation) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayAttachmentPropagation clone() {
        try {
            return (TransitGatewayAttachmentPropagation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
