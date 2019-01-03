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
 * Describes a route for a transit gateway route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The attachments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayRouteAttachment> transitGatewayAttachments;
    /**
     * <p>
     * The route type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the route.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for destination matches.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @return The CIDR block used for destination matches.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for destination matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRoute withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * 
     * @return The attachments.
     */

    public java.util.List<TransitGatewayRouteAttachment> getTransitGatewayAttachments() {
        if (transitGatewayAttachments == null) {
            transitGatewayAttachments = new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteAttachment>();
        }
        return transitGatewayAttachments;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * 
     * @param transitGatewayAttachments
     *        The attachments.
     */

    public void setTransitGatewayAttachments(java.util.Collection<TransitGatewayRouteAttachment> transitGatewayAttachments) {
        if (transitGatewayAttachments == null) {
            this.transitGatewayAttachments = null;
            return;
        }

        this.transitGatewayAttachments = new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteAttachment>(transitGatewayAttachments);
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayAttachments(java.util.Collection)} or
     * {@link #withTransitGatewayAttachments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayAttachments
     *        The attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRoute withTransitGatewayAttachments(TransitGatewayRouteAttachment... transitGatewayAttachments) {
        if (this.transitGatewayAttachments == null) {
            setTransitGatewayAttachments(new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteAttachment>(transitGatewayAttachments.length));
        }
        for (TransitGatewayRouteAttachment ele : transitGatewayAttachments) {
            this.transitGatewayAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * 
     * @param transitGatewayAttachments
     *        The attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRoute withTransitGatewayAttachments(java.util.Collection<TransitGatewayRouteAttachment> transitGatewayAttachments) {
        setTransitGatewayAttachments(transitGatewayAttachments);
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @see TransitGatewayRouteType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @return The route type.
     * @see TransitGatewayRouteType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteType
     */

    public TransitGatewayRoute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteType
     */

    public TransitGatewayRoute withType(TransitGatewayRouteType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @see TransitGatewayRouteState
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
     * @see TransitGatewayRouteState
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
     * @see TransitGatewayRouteState
     */

    public TransitGatewayRoute withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteState
     */

    public TransitGatewayRoute withState(TransitGatewayRouteState state) {
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getTransitGatewayAttachments() != null)
            sb.append("TransitGatewayAttachments: ").append(getTransitGatewayAttachments()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof TransitGatewayRoute == false)
            return false;
        TransitGatewayRoute other = (TransitGatewayRoute) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getTransitGatewayAttachments() == null ^ this.getTransitGatewayAttachments() == null)
            return false;
        if (other.getTransitGatewayAttachments() != null && other.getTransitGatewayAttachments().equals(this.getTransitGatewayAttachments()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachments() == null) ? 0 : getTransitGatewayAttachments().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRoute clone() {
        try {
            return (TransitGatewayRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
