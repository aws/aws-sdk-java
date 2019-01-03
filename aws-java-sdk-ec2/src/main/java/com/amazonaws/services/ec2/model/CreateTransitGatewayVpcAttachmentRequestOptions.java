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

/**
 * <p>
 * Describes the options for a VPC attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayVpcAttachmentRequestOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayVpcAttachmentRequestOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Enable or disable DNS support. The default is <code>enable</code>.
     * </p>
     */
    private String dnsSupport;
    /**
     * <p>
     * Enable or disable IPv6 support. The default is <code>enable</code>.
     * </p>
     */
    private String ipv6Support;

    /**
     * <p>
     * Enable or disable DNS support. The default is <code>enable</code>.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. The default is <code>enable</code>.
     * @see DnsSupportValue
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support. The default is <code>enable</code>.
     * </p>
     * 
     * @return Enable or disable DNS support. The default is <code>enable</code>.
     * @see DnsSupportValue
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support. The default is <code>enable</code>.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. The default is <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public CreateTransitGatewayVpcAttachmentRequestOptions withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Enable or disable DNS support. The default is <code>enable</code>.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. The default is <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public CreateTransitGatewayVpcAttachmentRequestOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable IPv6 support. The default is <code>enable</code>.
     * </p>
     * 
     * @param ipv6Support
     *        Enable or disable IPv6 support. The default is <code>enable</code>.
     * @see Ipv6SupportValue
     */

    public void setIpv6Support(String ipv6Support) {
        this.ipv6Support = ipv6Support;
    }

    /**
     * <p>
     * Enable or disable IPv6 support. The default is <code>enable</code>.
     * </p>
     * 
     * @return Enable or disable IPv6 support. The default is <code>enable</code>.
     * @see Ipv6SupportValue
     */

    public String getIpv6Support() {
        return this.ipv6Support;
    }

    /**
     * <p>
     * Enable or disable IPv6 support. The default is <code>enable</code>.
     * </p>
     * 
     * @param ipv6Support
     *        Enable or disable IPv6 support. The default is <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ipv6SupportValue
     */

    public CreateTransitGatewayVpcAttachmentRequestOptions withIpv6Support(String ipv6Support) {
        setIpv6Support(ipv6Support);
        return this;
    }

    /**
     * <p>
     * Enable or disable IPv6 support. The default is <code>enable</code>.
     * </p>
     * 
     * @param ipv6Support
     *        Enable or disable IPv6 support. The default is <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ipv6SupportValue
     */

    public CreateTransitGatewayVpcAttachmentRequestOptions withIpv6Support(Ipv6SupportValue ipv6Support) {
        this.ipv6Support = ipv6Support.toString();
        return this;
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
        if (getDnsSupport() != null)
            sb.append("DnsSupport: ").append(getDnsSupport()).append(",");
        if (getIpv6Support() != null)
            sb.append("Ipv6Support: ").append(getIpv6Support());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayVpcAttachmentRequestOptions == false)
            return false;
        CreateTransitGatewayVpcAttachmentRequestOptions other = (CreateTransitGatewayVpcAttachmentRequestOptions) obj;
        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getIpv6Support() == null ^ this.getIpv6Support() == null)
            return false;
        if (other.getIpv6Support() != null && other.getIpv6Support().equals(this.getIpv6Support()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getIpv6Support() == null) ? 0 : getIpv6Support().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayVpcAttachmentRequestOptions clone() {
        try {
            return (CreateTransitGatewayVpcAttachmentRequestOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
