/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyVpcAttribute(ModifyVpcAttributeRequest) ModifyVpcAttribute operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyVpcAttribute(ModifyVpcAttributeRequest)
 */
public class ModifyVpcAttributeRequest extends AmazonWebServiceRequest implements Serializable {

    private String vpcId;

    /**
     * Boolean value
     */
    private Boolean enableDnsSupport;

    /**
     * Boolean value
     */
    private Boolean enableDnsHostnames;

    /**
     * Returns the value of the VpcId property for this object.
     *
     * @return The value of the VpcId property for this object.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     *
     * @param vpcId The new value for the VpcId property for this object.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The new value for the VpcId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyVpcAttributeRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isEnableDnsSupport() {
        return enableDnsSupport;
    }
    
    /**
     * Boolean value
     *
     * @param enableDnsSupport Boolean value
     */
    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsSupport Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyVpcAttributeRequest withEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isEnableDnsHostnames() {
        return enableDnsHostnames;
    }
    
    /**
     * Boolean value
     *
     * @param enableDnsHostnames Boolean value
     */
    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsHostnames Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyVpcAttributeRequest withEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getEnableDnsHostnames() {
        return enableDnsHostnames;
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
        if (isEnableDnsSupport() != null) sb.append("EnableDnsSupport: " + isEnableDnsSupport() + ",");
        if (isEnableDnsHostnames() != null) sb.append("EnableDnsHostnames: " + isEnableDnsHostnames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((isEnableDnsSupport() == null) ? 0 : isEnableDnsSupport().hashCode()); 
        hashCode = prime * hashCode + ((isEnableDnsHostnames() == null) ? 0 : isEnableDnsHostnames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyVpcAttributeRequest == false) return false;
        ModifyVpcAttributeRequest other = (ModifyVpcAttributeRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isEnableDnsSupport() == null ^ this.isEnableDnsSupport() == null) return false;
        if (other.isEnableDnsSupport() != null && other.isEnableDnsSupport().equals(this.isEnableDnsSupport()) == false) return false; 
        if (other.isEnableDnsHostnames() == null ^ this.isEnableDnsHostnames() == null) return false;
        if (other.isEnableDnsHostnames() != null && other.isEnableDnsHostnames().equals(this.isEnableDnsHostnames()) == false) return false; 
        return true;
    }
    
}
    