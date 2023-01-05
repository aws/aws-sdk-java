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
 * Describes a subnet CIDR reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SubnetCidrReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetCidrReservation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     */
    private String subnetCidrReservationId;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The CIDR that has been reserved.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The type of reservation.
     * </p>
     */
    private String reservationType;
    /**
     * <p>
     * The ID of the account that owns the subnet CIDR reservation.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The description assigned to the subnet CIDR reservation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags assigned to the subnet CIDR reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservationId
     *        The ID of the subnet CIDR reservation.
     */

    public void setSubnetCidrReservationId(String subnetCidrReservationId) {
        this.subnetCidrReservationId = subnetCidrReservationId;
    }

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @return The ID of the subnet CIDR reservation.
     */

    public String getSubnetCidrReservationId() {
        return this.subnetCidrReservationId;
    }

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservationId
     *        The ID of the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withSubnetCidrReservationId(String subnetCidrReservationId) {
        setSubnetCidrReservationId(subnetCidrReservationId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The CIDR that has been reserved.
     * </p>
     * 
     * @param cidr
     *        The CIDR that has been reserved.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR that has been reserved.
     * </p>
     * 
     * @return The CIDR that has been reserved.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR that has been reserved.
     * </p>
     * 
     * @param cidr
     *        The CIDR that has been reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * 
     * @param reservationType
     *        The type of reservation.
     * @see SubnetCidrReservationType
     */

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * 
     * @return The type of reservation.
     * @see SubnetCidrReservationType
     */

    public String getReservationType() {
        return this.reservationType;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * 
     * @param reservationType
     *        The type of reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrReservationType
     */

    public SubnetCidrReservation withReservationType(String reservationType) {
        setReservationType(reservationType);
        return this;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * 
     * @param reservationType
     *        The type of reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrReservationType
     */

    public SubnetCidrReservation withReservationType(SubnetCidrReservationType reservationType) {
        this.reservationType = reservationType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the subnet CIDR reservation.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the subnet CIDR reservation.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the subnet CIDR reservation.
     * </p>
     * 
     * @return The ID of the account that owns the subnet CIDR reservation.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the subnet CIDR reservation.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The description assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @param description
     *        The description assigned to the subnet CIDR reservation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @return The description assigned to the subnet CIDR reservation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @param description
     *        The description assigned to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @return The tags assigned to the subnet CIDR reservation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the subnet CIDR reservation.
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
     * The tags assigned to the subnet CIDR reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withTags(Tag... tags) {
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
     * The tags assigned to the subnet CIDR reservation.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrReservation withTags(java.util.Collection<Tag> tags) {
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
        if (getSubnetCidrReservationId() != null)
            sb.append("SubnetCidrReservationId: ").append(getSubnetCidrReservationId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getReservationType() != null)
            sb.append("ReservationType: ").append(getReservationType()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof SubnetCidrReservation == false)
            return false;
        SubnetCidrReservation other = (SubnetCidrReservation) obj;
        if (other.getSubnetCidrReservationId() == null ^ this.getSubnetCidrReservationId() == null)
            return false;
        if (other.getSubnetCidrReservationId() != null && other.getSubnetCidrReservationId().equals(this.getSubnetCidrReservationId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getReservationType() == null ^ this.getReservationType() == null)
            return false;
        if (other.getReservationType() != null && other.getReservationType().equals(this.getReservationType()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getSubnetCidrReservationId() == null) ? 0 : getSubnetCidrReservationId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getReservationType() == null) ? 0 : getReservationType().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SubnetCidrReservation clone() {
        try {
            return (SubnetCidrReservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
