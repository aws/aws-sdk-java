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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyVpcAttribute(ModifyVpcAttributeRequest) ModifyVpcAttribute operation}.
 * <p>
 * Modifies the specified attribute of the specified VPC.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyVpcAttribute(ModifyVpcAttributeRequest)
 */
public class ModifyVpcAttributeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Indicates whether the DNS resolution is supported for the VPC. If this
     * attribute is <code>false</code>, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled. If this attribute is <code>true</code>, queries to the Amazon
     * provided DNS server at the 169.254.169.253 IP address, or the reserved
     * IP address at the base of the VPC network range "plus two" will
     * succeed.
     */
    private Boolean enableDnsSupport;

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not. <p>You can only set
     * <code>enableDnsHostnames</code> to <code>true</code> if you also set
     * the <code>EnableDnsSupport</code> attribute to <code>true</code>.
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
    public ModifyVpcAttributeRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Indicates whether the DNS resolution is supported for the VPC. If this
     * attribute is <code>false</code>, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled. If this attribute is <code>true</code>, queries to the Amazon
     * provided DNS server at the 169.254.169.253 IP address, or the reserved
     * IP address at the base of the VPC network range "plus two" will
     * succeed.
     *
     * @return Indicates whether the DNS resolution is supported for the VPC. If this
     *         attribute is <code>false</code>, the Amazon provided DNS service in
     *         the VPC that resolves public DNS hostnames to IP addresses is not
     *         enabled. If this attribute is <code>true</code>, queries to the Amazon
     *         provided DNS server at the 169.254.169.253 IP address, or the reserved
     *         IP address at the base of the VPC network range "plus two" will
     *         succeed.
     */
    public Boolean isEnableDnsSupport() {
        return enableDnsSupport;
    }
    
    /**
     * Indicates whether the DNS resolution is supported for the VPC. If this
     * attribute is <code>false</code>, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled. If this attribute is <code>true</code>, queries to the Amazon
     * provided DNS server at the 169.254.169.253 IP address, or the reserved
     * IP address at the base of the VPC network range "plus two" will
     * succeed.
     *
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. If this
     *         attribute is <code>false</code>, the Amazon provided DNS service in
     *         the VPC that resolves public DNS hostnames to IP addresses is not
     *         enabled. If this attribute is <code>true</code>, queries to the Amazon
     *         provided DNS server at the 169.254.169.253 IP address, or the reserved
     *         IP address at the base of the VPC network range "plus two" will
     *         succeed.
     */
    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }
    
    /**
     * Indicates whether the DNS resolution is supported for the VPC. If this
     * attribute is <code>false</code>, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled. If this attribute is <code>true</code>, queries to the Amazon
     * provided DNS server at the 169.254.169.253 IP address, or the reserved
     * IP address at the base of the VPC network range "plus two" will
     * succeed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. If this
     *         attribute is <code>false</code>, the Amazon provided DNS service in
     *         the VPC that resolves public DNS hostnames to IP addresses is not
     *         enabled. If this attribute is <code>true</code>, queries to the Amazon
     *         provided DNS server at the 169.254.169.253 IP address, or the reserved
     *         IP address at the base of the VPC network range "plus two" will
     *         succeed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyVpcAttributeRequest withEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
        return this;
    }

    /**
     * Indicates whether the DNS resolution is supported for the VPC. If this
     * attribute is <code>false</code>, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled. If this attribute is <code>true</code>, queries to the Amazon
     * provided DNS server at the 169.254.169.253 IP address, or the reserved
     * IP address at the base of the VPC network range "plus two" will
     * succeed.
     *
     * @return Indicates whether the DNS resolution is supported for the VPC. If this
     *         attribute is <code>false</code>, the Amazon provided DNS service in
     *         the VPC that resolves public DNS hostnames to IP addresses is not
     *         enabled. If this attribute is <code>true</code>, queries to the Amazon
     *         provided DNS server at the 169.254.169.253 IP address, or the reserved
     *         IP address at the base of the VPC network range "plus two" will
     *         succeed.
     */
    public Boolean getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not. <p>You can only set
     * <code>enableDnsHostnames</code> to <code>true</code> if you also set
     * the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     *
     * @return Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not. <p>You can only set
     *         <code>enableDnsHostnames</code> to <code>true</code> if you also set
     *         the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     */
    public Boolean isEnableDnsHostnames() {
        return enableDnsHostnames;
    }
    
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not. <p>You can only set
     * <code>enableDnsHostnames</code> to <code>true</code> if you also set
     * the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not. <p>You can only set
     *         <code>enableDnsHostnames</code> to <code>true</code> if you also set
     *         the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     */
    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }
    
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not. <p>You can only set
     * <code>enableDnsHostnames</code> to <code>true</code> if you also set
     * the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not. <p>You can only set
     *         <code>enableDnsHostnames</code> to <code>true</code> if you also set
     *         the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyVpcAttributeRequest withEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     * If this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not. <p>You can only set
     * <code>enableDnsHostnames</code> to <code>true</code> if you also set
     * the <code>EnableDnsSupport</code> attribute to <code>true</code>.
     *
     * @return Indicates whether the instances launched in the VPC get DNS hostnames.
     *         If this attribute is <code>true</code>, instances in the VPC get DNS
     *         hostnames; otherwise, they do not. <p>You can only set
     *         <code>enableDnsHostnames</code> to <code>true</code> if you also set
     *         the <code>EnableDnsSupport</code> attribute to <code>true</code>.
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
    