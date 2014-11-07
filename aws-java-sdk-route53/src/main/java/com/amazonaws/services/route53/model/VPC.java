/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * V P C
 */
public class VPC implements Serializable {

    private String vPCRegion;

    /**
     * A VPC ID
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String vPCId;

    /**
     * Returns the value of the VPCRegion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, eu-central-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1
     *
     * @return The value of the VPCRegion property for this object.
     *
     * @see VPCRegion
     */
    public String getVPCRegion() {
        return vPCRegion;
    }
    
    /**
     * Sets the value of the VPCRegion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, eu-central-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1
     *
     * @param vPCRegion The new value for the VPCRegion property for this object.
     *
     * @see VPCRegion
     */
    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }
    
    /**
     * Sets the value of the VPCRegion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, eu-central-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1
     *
     * @param vPCRegion The new value for the VPCRegion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VPCRegion
     */
    public VPC withVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
        return this;
    }

    /**
     * Sets the value of the VPCRegion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, eu-central-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1
     *
     * @param vPCRegion The new value for the VPCRegion property for this object.
     *
     * @see VPCRegion
     */
    public void setVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
    }
    
    /**
     * Sets the value of the VPCRegion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, eu-central-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1
     *
     * @param vPCRegion The new value for the VPCRegion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VPCRegion
     */
    public VPC withVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
        return this;
    }

    /**
     * A VPC ID
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A VPC ID
     */
    public String getVPCId() {
        return vPCId;
    }
    
    /**
     * A VPC ID
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param vPCId A VPC ID
     */
    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }
    
    /**
     * A VPC ID
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param vPCId A VPC ID
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VPC withVPCId(String vPCId) {
        this.vPCId = vPCId;
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
        if (getVPCRegion() != null) sb.append("VPCRegion: " + getVPCRegion() + ",");
        if (getVPCId() != null) sb.append("VPCId: " + getVPCId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVPCRegion() == null) ? 0 : getVPCRegion().hashCode()); 
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VPC == false) return false;
        VPC other = (VPC)obj;
        
        if (other.getVPCRegion() == null ^ this.getVPCRegion() == null) return false;
        if (other.getVPCRegion() != null && other.getVPCRegion().equals(this.getVPCRegion()) == false) return false; 
        if (other.getVPCId() == null ^ this.getVPCId() == null) return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false) return false; 
        return true;
    }
    
}
    