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
 * Describes a resource group to which a Capacity Reservation has been added.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     */
    private String groupArn;
    /**
     * <p>
     * The ID of the AWS account that owns the resource group.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of the resource group.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @return The ARN of the resource group.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationGroup withGroupArn(String groupArn) {
        setGroupArn(groupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource group.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the resource group.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource group.
     * </p>
     * 
     * @return The ID of the AWS account that owns the resource group.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource group.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationGroup withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationGroup == false)
            return false;
        CapacityReservationGroup other = (CapacityReservationGroup) obj;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationGroup clone() {
        try {
            return (CapacityReservationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
