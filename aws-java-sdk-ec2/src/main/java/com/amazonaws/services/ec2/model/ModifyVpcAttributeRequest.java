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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpcAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcAttributeRequest> {

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * </p>
     */
    private Boolean enableDnsHostnames;
    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS
     * server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range
     * "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to
     * IP addresses is not enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute.
     * </p>
     */
    private Boolean enableDnsSupport;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * </p>
     * 
     * @param enableDnsHostnames
     *        Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC
     *        get DNS hostnames; otherwise, they do not.</p>
     *        <p>
     *        You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *        requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     */

    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * </p>
     * 
     * @return Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC
     *         get DNS hostnames; otherwise, they do not.</p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *         requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     */

    public Boolean getEnableDnsHostnames() {
        return this.enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * </p>
     * 
     * @param enableDnsHostnames
     *        Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC
     *        get DNS hostnames; otherwise, they do not.</p>
     *        <p>
     *        You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *        requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcAttributeRequest withEnableDnsHostnames(Boolean enableDnsHostnames) {
        setEnableDnsHostnames(enableDnsHostnames);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     * </p>
     * 
     * @return Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC
     *         get DNS hostnames; otherwise, they do not.</p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *         requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
     */

    public Boolean isEnableDnsHostnames() {
        return this.enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS
     * server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range
     * "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to
     * IP addresses is not enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute.
     * </p>
     * 
     * @param enableDnsSupport
     *        Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided
     *        DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network
     *        range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS
     *        hostnames to IP addresses is not enabled.</p>
     *        <p>
     *        You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *        requests for each attribute.
     */

    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS
     * server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range
     * "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to
     * IP addresses is not enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute.
     * </p>
     * 
     * @return Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided
     *         DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network
     *         range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public
     *         DNS hostnames to IP addresses is not enabled.</p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *         requests for each attribute.
     */

    public Boolean getEnableDnsSupport() {
        return this.enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS
     * server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range
     * "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to
     * IP addresses is not enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute.
     * </p>
     * 
     * @param enableDnsSupport
     *        Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided
     *        DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network
     *        range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS
     *        hostnames to IP addresses is not enabled.</p>
     *        <p>
     *        You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *        requests for each attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcAttributeRequest withEnableDnsSupport(Boolean enableDnsSupport) {
        setEnableDnsSupport(enableDnsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS
     * server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range
     * "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to
     * IP addresses is not enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for
     * each attribute.
     * </p>
     * 
     * @return Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided
     *         DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network
     *         range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public
     *         DNS hostnames to IP addresses is not enabled.</p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate
     *         requests for each attribute.
     */

    public Boolean isEnableDnsSupport() {
        return this.enableDnsSupport;
    }

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

    public ModifyVpcAttributeRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcAttributeRequest> getDryRunRequest() {
        Request<ModifyVpcAttributeRequest> request = new ModifyVpcAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getEnableDnsHostnames() != null)
            sb.append("EnableDnsHostnames: ").append(getEnableDnsHostnames()).append(",");
        if (getEnableDnsSupport() != null)
            sb.append("EnableDnsSupport: ").append(getEnableDnsSupport()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcAttributeRequest == false)
            return false;
        ModifyVpcAttributeRequest other = (ModifyVpcAttributeRequest) obj;
        if (other.getEnableDnsHostnames() == null ^ this.getEnableDnsHostnames() == null)
            return false;
        if (other.getEnableDnsHostnames() != null && other.getEnableDnsHostnames().equals(this.getEnableDnsHostnames()) == false)
            return false;
        if (other.getEnableDnsSupport() == null ^ this.getEnableDnsSupport() == null)
            return false;
        if (other.getEnableDnsSupport() != null && other.getEnableDnsSupport().equals(this.getEnableDnsSupport()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableDnsHostnames() == null) ? 0 : getEnableDnsHostnames().hashCode());
        hashCode = prime * hashCode + ((getEnableDnsSupport() == null) ? 0 : getEnableDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcAttributeRequest clone() {
        return (ModifyVpcAttributeRequest) super.clone();
    }
}
