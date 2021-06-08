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
 * Describes a carrier gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CarrierGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CarrierGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     */
    private String carrierGatewayId;
    /**
     * <p>
     * The ID of the VPC associated with the carrier gateway.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The state of the carrier gateway.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The AWS account ID of the owner of the carrier gateway.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The tags assigned to the carrier gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.
     */

    public void setCarrierGatewayId(String carrierGatewayId) {
        this.carrierGatewayId = carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @return The ID of the carrier gateway.
     */

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CarrierGateway withCarrierGatewayId(String carrierGatewayId) {
        setCarrierGatewayId(carrierGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC associated with the carrier gateway.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC associated with the carrier gateway.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC associated with the carrier gateway.
     * </p>
     * 
     * @return The ID of the VPC associated with the carrier gateway.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC associated with the carrier gateway.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC associated with the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CarrierGateway withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The state of the carrier gateway.
     * </p>
     * 
     * @param state
     *        The state of the carrier gateway.
     * @see CarrierGatewayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the carrier gateway.
     * </p>
     * 
     * @return The state of the carrier gateway.
     * @see CarrierGatewayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the carrier gateway.
     * </p>
     * 
     * @param state
     *        The state of the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CarrierGatewayState
     */

    public CarrierGateway withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the carrier gateway.
     * </p>
     * 
     * @param state
     *        The state of the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CarrierGatewayState
     */

    public CarrierGateway withState(CarrierGatewayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the carrier gateway.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the carrier gateway.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the carrier gateway.
     * </p>
     * 
     * @return The AWS account ID of the owner of the carrier gateway.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the carrier gateway.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CarrierGateway withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the carrier gateway.
     * </p>
     * 
     * @return The tags assigned to the carrier gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the carrier gateway.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the carrier gateway.
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
     * The tags assigned to the carrier gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CarrierGateway withTags(Tag... tags) {
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
     * The tags assigned to the carrier gateway.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CarrierGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getCarrierGatewayId() != null)
            sb.append("CarrierGatewayId: ").append(getCarrierGatewayId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
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

        if (obj instanceof CarrierGateway == false)
            return false;
        CarrierGateway other = (CarrierGateway) obj;
        if (other.getCarrierGatewayId() == null ^ this.getCarrierGatewayId() == null)
            return false;
        if (other.getCarrierGatewayId() != null && other.getCarrierGatewayId().equals(this.getCarrierGatewayId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
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

        hashCode = prime * hashCode + ((getCarrierGatewayId() == null) ? 0 : getCarrierGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CarrierGateway clone() {
        try {
            return (CarrierGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
