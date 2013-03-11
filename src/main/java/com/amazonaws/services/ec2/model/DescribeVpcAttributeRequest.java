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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcAttribute(DescribeVpcAttributeRequest) DescribeVpcAttribute operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcAttribute(DescribeVpcAttributeRequest)
 */
public class DescribeVpcAttributeRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String vpcId;

    private String enableDnsSupport;

    private String enableDnsHostnames;

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
    public DescribeVpcAttributeRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Returns the value of the EnableDnsSupport property for this object.
     *
     * @return The value of the EnableDnsSupport property for this object.
     */
    public String getEnableDnsSupport() {
        return enableDnsSupport;
    }
    
    /**
     * Sets the value of the EnableDnsSupport property for this object.
     *
     * @param enableDnsSupport The new value for the EnableDnsSupport property for this object.
     */
    public void setEnableDnsSupport(String enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }
    
    /**
     * Sets the value of the EnableDnsSupport property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsSupport The new value for the EnableDnsSupport property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcAttributeRequest withEnableDnsSupport(String enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
        return this;
    }
    
    
    /**
     * Returns the value of the EnableDnsHostnames property for this object.
     *
     * @return The value of the EnableDnsHostnames property for this object.
     */
    public String getEnableDnsHostnames() {
        return enableDnsHostnames;
    }
    
    /**
     * Sets the value of the EnableDnsHostnames property for this object.
     *
     * @param enableDnsHostnames The new value for the EnableDnsHostnames property for this object.
     */
    public void setEnableDnsHostnames(String enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }
    
    /**
     * Sets the value of the EnableDnsHostnames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsHostnames The new value for the EnableDnsHostnames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcAttributeRequest withEnableDnsHostnames(String enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ", ");
        if (getEnableDnsSupport() != null) sb.append("EnableDnsSupport: " + getEnableDnsSupport() + ", ");
        if (getEnableDnsHostnames() != null) sb.append("EnableDnsHostnames: " + getEnableDnsHostnames() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getEnableDnsSupport() == null) ? 0 : getEnableDnsSupport().hashCode()); 
        hashCode = prime * hashCode + ((getEnableDnsHostnames() == null) ? 0 : getEnableDnsHostnames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcAttributeRequest == false) return false;
        DescribeVpcAttributeRequest other = (DescribeVpcAttributeRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getEnableDnsSupport() == null ^ this.getEnableDnsSupport() == null) return false;
        if (other.getEnableDnsSupport() != null && other.getEnableDnsSupport().equals(this.getEnableDnsSupport()) == false) return false; 
        if (other.getEnableDnsHostnames() == null ^ this.getEnableDnsHostnames() == null) return false;
        if (other.getEnableDnsHostnames() != null && other.getEnableDnsHostnames().equals(this.getEnableDnsHostnames()) == false) return false; 
        return true;
    }
    
}
    