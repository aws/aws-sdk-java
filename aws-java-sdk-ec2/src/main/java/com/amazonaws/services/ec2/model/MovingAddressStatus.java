/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the status of a moving Elastic IP address.
 * </p>
 */
public class MovingAddressStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     */
    private String moveStatus;

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @return The Elastic IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MovingAddressStatus withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     * 
     * @param moveStatus
     *        The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the
     *        EC2-Classic platform.
     * @see MoveStatus
     */

    public void setMoveStatus(String moveStatus) {
        this.moveStatus = moveStatus;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     * 
     * @return The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the
     *         EC2-Classic platform.
     * @see MoveStatus
     */

    public String getMoveStatus() {
        return this.moveStatus;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     * 
     * @param moveStatus
     *        The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the
     *        EC2-Classic platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MoveStatus
     */

    public MovingAddressStatus withMoveStatus(String moveStatus) {
        setMoveStatus(moveStatus);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     * 
     * @param moveStatus
     *        The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the
     *        EC2-Classic platform.
     * @see MoveStatus
     */

    public void setMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus.toString();
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic
     * platform.
     * </p>
     * 
     * @param moveStatus
     *        The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the
     *        EC2-Classic platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MoveStatus
     */

    public MovingAddressStatus withMoveStatus(MoveStatus moveStatus) {
        setMoveStatus(moveStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getMoveStatus() != null)
            sb.append("MoveStatus: " + getMoveStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MovingAddressStatus == false)
            return false;
        MovingAddressStatus other = (MovingAddressStatus) obj;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getMoveStatus() == null ^ this.getMoveStatus() == null)
            return false;
        if (other.getMoveStatus() != null && other.getMoveStatus().equals(this.getMoveStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getMoveStatus() == null) ? 0 : getMoveStatus().hashCode());
        return hashCode;
    }

    @Override
    public MovingAddressStatus clone() {
        try {
            return (MovingAddressStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
