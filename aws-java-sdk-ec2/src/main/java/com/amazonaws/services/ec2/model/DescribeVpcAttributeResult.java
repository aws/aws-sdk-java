/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeVpcAttributeResult implements Serializable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     */
    private Boolean enableDnsSupport;

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     */
    private Boolean enableDnsHostnames;

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
    public DescribeVpcAttributeResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     *
     * @return Indicates whether DNS resolution is enabled for the VPC. If this
     *         attribute is <code>true</code>, the Amazon DNS server resolves DNS
     *         hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     */
    public Boolean isEnableDnsSupport() {
        return enableDnsSupport;
    }
    
    /**
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     *
     * @param enableDnsSupport Indicates whether DNS resolution is enabled for the VPC. If this
     *         attribute is <code>true</code>, the Amazon DNS server resolves DNS
     *         hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     */
    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }
    
    /**
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsSupport Indicates whether DNS resolution is enabled for the VPC. If this
     *         attribute is <code>true</code>, the Amazon DNS server resolves DNS
     *         hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcAttributeResult withEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
        return this;
    }

    /**
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     *
     * @return Indicates whether DNS resolution is enabled for the VPC. If this
     *         attribute is <code>true</code>, the Amazon DNS server resolves DNS
     *         hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     */
    public Boolean getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     *
     * @return Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not.
     */
    public Boolean isEnableDnsHostnames() {
        return enableDnsHostnames;
    }
    
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not.
     */
    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }
    
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcAttributeResult withEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     *
     * @return Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not.
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

        if (obj instanceof DescribeVpcAttributeResult == false) return false;
        DescribeVpcAttributeResult other = (DescribeVpcAttributeResult)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isEnableDnsSupport() == null ^ this.isEnableDnsSupport() == null) return false;
        if (other.isEnableDnsSupport() != null && other.isEnableDnsSupport().equals(this.isEnableDnsSupport()) == false) return false; 
        if (other.isEnableDnsHostnames() == null ^ this.isEnableDnsHostnames() == null) return false;
        if (other.isEnableDnsHostnames() != null && other.isEnableDnsHostnames().equals(this.isEnableDnsHostnames()) == false) return false; 
        return true;
    }
    
}
    