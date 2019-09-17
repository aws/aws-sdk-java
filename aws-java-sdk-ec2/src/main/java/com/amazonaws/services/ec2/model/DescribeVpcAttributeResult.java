/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is <code>true</code>,
     * instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     */
    private Boolean enableDnsHostnames;
    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the Amazon DNS
     * server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
     * </p>
     */
    private Boolean enableDnsSupport;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcAttributeResult withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is <code>true</code>,
     * instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * 
     * @param enableDnsHostnames
     *        Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is
     *        <code>true</code>, instances in the VPC get DNS hostnames; otherwise, they do not.
     */

    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is <code>true</code>,
     * instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * 
     * @return Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is
     *         <code>true</code>, instances in the VPC get DNS hostnames; otherwise, they do not.
     */

    public Boolean getEnableDnsHostnames() {
        return this.enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is <code>true</code>,
     * instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * 
     * @param enableDnsHostnames
     *        Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is
     *        <code>true</code>, instances in the VPC get DNS hostnames; otherwise, they do not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcAttributeResult withEnableDnsHostnames(Boolean enableDnsHostnames) {
        setEnableDnsHostnames(enableDnsHostnames);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is <code>true</code>,
     * instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * 
     * @return Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is
     *         <code>true</code>, instances in the VPC get DNS hostnames; otherwise, they do not.
     */

    public Boolean isEnableDnsHostnames() {
        return this.enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the Amazon DNS
     * server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
     * </p>
     * 
     * @param enableDnsSupport
     *        Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the
     *        Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses;
     *        otherwise, it does not.
     */

    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the Amazon DNS
     * server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
     * </p>
     * 
     * @return Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the
     *         Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     */

    public Boolean getEnableDnsSupport() {
        return this.enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the Amazon DNS
     * server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
     * </p>
     * 
     * @param enableDnsSupport
     *        Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the
     *        Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses;
     *        otherwise, it does not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcAttributeResult withEnableDnsSupport(Boolean enableDnsSupport) {
        setEnableDnsSupport(enableDnsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the Amazon DNS
     * server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
     * </p>
     * 
     * @return Indicates whether DNS resolution is enabled for the VPC. If this attribute is <code>true</code>, the
     *         Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses;
     *         otherwise, it does not.
     */

    public Boolean isEnableDnsSupport() {
        return this.enableDnsSupport;
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getEnableDnsHostnames() != null)
            sb.append("EnableDnsHostnames: ").append(getEnableDnsHostnames()).append(",");
        if (getEnableDnsSupport() != null)
            sb.append("EnableDnsSupport: ").append(getEnableDnsSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcAttributeResult == false)
            return false;
        DescribeVpcAttributeResult other = (DescribeVpcAttributeResult) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEnableDnsHostnames() == null ^ this.getEnableDnsHostnames() == null)
            return false;
        if (other.getEnableDnsHostnames() != null && other.getEnableDnsHostnames().equals(this.getEnableDnsHostnames()) == false)
            return false;
        if (other.getEnableDnsSupport() == null ^ this.getEnableDnsSupport() == null)
            return false;
        if (other.getEnableDnsSupport() != null && other.getEnableDnsSupport().equals(this.getEnableDnsSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getEnableDnsHostnames() == null) ? 0 : getEnableDnsHostnames().hashCode());
        hashCode = prime * hashCode + ((getEnableDnsSupport() == null) ? 0 : getEnableDnsSupport().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcAttributeResult clone() {
        try {
            return (DescribeVpcAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
