/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateVpcRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpcRequest> {

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IP addresses, or the size of the CIDR block.
     * </p>
     */
    private Boolean amazonProvidedIpv6CidrBlock;
    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     * </p>
     */
    private String ipv6Pool;
    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to
     * this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     * </p>
     */
    private String ipv6CidrBlockNetworkBorderGroup;

    /**
     * Default constructor for CreateVpcRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public CreateVpcRequest() {
    }

    /**
     * Constructs a new CreateVpcRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cidrBlock
     *        The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */
    public CreateVpcRequest(String cidrBlock) {
        setCidrBlock(cidrBlock);
    }

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @return The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IP addresses, or the size of the CIDR block.
     * </p>
     * 
     * @param amazonProvidedIpv6CidrBlock
     *        Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *        range of IP addresses, or the size of the CIDR block.
     */

    public void setAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IP addresses, or the size of the CIDR block.
     * </p>
     * 
     * @return Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *         range of IP addresses, or the size of the CIDR block.
     */

    public Boolean getAmazonProvidedIpv6CidrBlock() {
        return this.amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IP addresses, or the size of the CIDR block.
     * </p>
     * 
     * @param amazonProvidedIpv6CidrBlock
     *        Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *        range of IP addresses, or the size of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        setAmazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IP addresses, or the size of the CIDR block.
     * </p>
     * 
     * @return Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *         range of IP addresses, or the size of the CIDR block.
     */

    public Boolean isAmazonProvidedIpv6CidrBlock() {
        return this.amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6Pool
     *        The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */

    public void setIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     * </p>
     * 
     * @return The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */

    public String getIpv6Pool() {
        return this.ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6Pool
     *        The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withIpv6Pool(String ipv6Pool) {
        setIpv6Pool(ipv6Pool);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the
     *        request.</p>
     *        <p>
     *        To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     * 
     * @return The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the
     *         request.</p>
     *         <p>
     *         To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block from the IPv6 address pool. You must also specify <code>Ipv6Pool</code> in the
     *        request.</p>
     *        <p>
     *        To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @return The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *         with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *         <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *         launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *         VPC. </p>
     *         <p>
     *         <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *         <code>default</code> or <code>dedicated</code> values only.
     *         </p>
     *         <p>
     *         Default: <code>default</code>
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public CreateVpcRequest withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        withInstanceTenancy(instanceTenancy);
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public CreateVpcRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to
     * this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     * </p>
     * 
     * @param ipv6CidrBlockNetworkBorderGroup
     *        The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the
     *        address to this location.</p>
     *        <p>
     *        You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     */

    public void setIpv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to
     * this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     * </p>
     * 
     * @return The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the
     *         address to this location.</p>
     *         <p>
     *         You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     */

    public String getIpv6CidrBlockNetworkBorderGroup() {
        return this.ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to
     * this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     * </p>
     * 
     * @param ipv6CidrBlockNetworkBorderGroup
     *        The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the
     *        address to this location.</p>
     *        <p>
     *        You must set <code>AmazonProvidedIpv6CidrBlock</code> to <code>true</code> to use this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withIpv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
        setIpv6CidrBlockNetworkBorderGroup(ipv6CidrBlockNetworkBorderGroup);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcRequest> getDryRunRequest() {
        Request<CreateVpcRequest> request = new CreateVpcRequestMarshaller().marshall(this);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getAmazonProvidedIpv6CidrBlock() != null)
            sb.append("AmazonProvidedIpv6CidrBlock: ").append(getAmazonProvidedIpv6CidrBlock()).append(",");
        if (getIpv6Pool() != null)
            sb.append("Ipv6Pool: ").append(getIpv6Pool()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: ").append(getInstanceTenancy()).append(",");
        if (getIpv6CidrBlockNetworkBorderGroup() != null)
            sb.append("Ipv6CidrBlockNetworkBorderGroup: ").append(getIpv6CidrBlockNetworkBorderGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcRequest == false)
            return false;
        CreateVpcRequest other = (CreateVpcRequest) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() == null ^ this.getAmazonProvidedIpv6CidrBlock() == null)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() != null && other.getAmazonProvidedIpv6CidrBlock().equals(this.getAmazonProvidedIpv6CidrBlock()) == false)
            return false;
        if (other.getIpv6Pool() == null ^ this.getIpv6Pool() == null)
            return false;
        if (other.getIpv6Pool() != null && other.getIpv6Pool().equals(this.getIpv6Pool()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() == null ^ this.getIpv6CidrBlockNetworkBorderGroup() == null)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() != null
                && other.getIpv6CidrBlockNetworkBorderGroup().equals(this.getIpv6CidrBlockNetworkBorderGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getAmazonProvidedIpv6CidrBlock() == null) ? 0 : getAmazonProvidedIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6Pool() == null) ? 0 : getIpv6Pool().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockNetworkBorderGroup() == null) ? 0 : getIpv6CidrBlockNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcRequest clone() {
        return (CreateVpcRequest) super.clone();
    }
}
