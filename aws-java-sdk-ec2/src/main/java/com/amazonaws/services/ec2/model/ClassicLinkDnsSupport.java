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
 * Describes the ClassicLink DNS support status of a VPC.
 * </p>
 */
public class ClassicLinkDnsSupport implements Serializable, Cloneable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     */
    private Boolean classicLinkDnsSupported;

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClassicLinkDnsSupport withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     *
     * @return Indicates whether ClassicLink DNS support is enabled for the VPC.
     */
    public Boolean isClassicLinkDnsSupported() {
        return classicLinkDnsSupported;
    }
    
    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     *
     * @param classicLinkDnsSupported Indicates whether ClassicLink DNS support is enabled for the VPC.
     */
    public void setClassicLinkDnsSupported(Boolean classicLinkDnsSupported) {
        this.classicLinkDnsSupported = classicLinkDnsSupported;
    }
    
    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param classicLinkDnsSupported Indicates whether ClassicLink DNS support is enabled for the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClassicLinkDnsSupport withClassicLinkDnsSupported(Boolean classicLinkDnsSupported) {
        this.classicLinkDnsSupported = classicLinkDnsSupported;
        return this;
    }

    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     *
     * @return Indicates whether ClassicLink DNS support is enabled for the VPC.
     */
    public Boolean getClassicLinkDnsSupported() {
        return classicLinkDnsSupported;
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (isClassicLinkDnsSupported() != null) sb.append("ClassicLinkDnsSupported: " + isClassicLinkDnsSupported() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((isClassicLinkDnsSupported() == null) ? 0 : isClassicLinkDnsSupported().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClassicLinkDnsSupport == false) return false;
        ClassicLinkDnsSupport other = (ClassicLinkDnsSupport)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isClassicLinkDnsSupported() == null ^ this.isClassicLinkDnsSupported() == null) return false;
        if (other.isClassicLinkDnsSupported() != null && other.isClassicLinkDnsSupported().equals(this.isClassicLinkDnsSupported()) == false) return false; 
        return true;
    }
    
    @Override
    public ClassicLinkDnsSupport clone() {
        try {
            return (ClassicLinkDnsSupport) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    