/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The Elastic IP address.
     */
    private String publicIp;

    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     */
    private String moveStatus;

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param publicIp The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MovingAddressStatus withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @return The status of the Elastic IP address that's being moved to the EC2-VPC
     *         platform, or restored to the EC2-Classic platform.
     *
     * @see MoveStatus
     */
    public String getMoveStatus() {
        return moveStatus;
    }
    
    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus The status of the Elastic IP address that's being moved to the EC2-VPC
     *         platform, or restored to the EC2-Classic platform.
     *
     * @see MoveStatus
     */
    public void setMoveStatus(String moveStatus) {
        this.moveStatus = moveStatus;
    }
    
    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus The status of the Elastic IP address that's being moved to the EC2-VPC
     *         platform, or restored to the EC2-Classic platform.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MoveStatus
     */
    public MovingAddressStatus withMoveStatus(String moveStatus) {
        this.moveStatus = moveStatus;
        return this;
    }

    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus The status of the Elastic IP address that's being moved to the EC2-VPC
     *         platform, or restored to the EC2-Classic platform.
     *
     * @see MoveStatus
     */
    public void setMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus.toString();
    }
    
    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus The status of the Elastic IP address that's being moved to the EC2-VPC
     *         platform, or restored to the EC2-Classic platform.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MoveStatus
     */
    public MovingAddressStatus withMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getMoveStatus() != null) sb.append("MoveStatus: " + getMoveStatus() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MovingAddressStatus == false) return false;
        MovingAddressStatus other = (MovingAddressStatus)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getMoveStatus() == null ^ this.getMoveStatus() == null) return false;
        if (other.getMoveStatus() != null && other.getMoveStatus().equals(this.getMoveStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public MovingAddressStatus clone() {
        try {
            return (MovingAddressStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    