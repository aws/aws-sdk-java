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
 * Describes the VPC attachment options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayVpcAttachmentOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayVpcAttachmentOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     */
    private String dnsSupport;
    /**
     * <p>
     * Indicates whether IPv6 support is enabled.
     * </p>
     */
    private String ipv6Support;

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @see DnsSupportValue
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @return Indicates whether DNS support is enabled.
     * @see DnsSupportValue
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayVpcAttachmentOptions withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * 
     * @param dnsSupport
     *        Indicates whether DNS support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayVpcAttachmentOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is enabled.
     * </p>
     * 
     * @param ipv6Support
     *        Indicates whether IPv6 support is enabled.
     * @see Ipv6SupportValue
     */

    public void setIpv6Support(String ipv6Support) {
        this.ipv6Support = ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is enabled.
     * </p>
     * 
     * @return Indicates whether IPv6 support is enabled.
     * @see Ipv6SupportValue
     */

    public String getIpv6Support() {
        return this.ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is enabled.
     * </p>
     * 
     * @param ipv6Support
     *        Indicates whether IPv6 support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ipv6SupportValue
     */

    public TransitGatewayVpcAttachmentOptions withIpv6Support(String ipv6Support) {
        setIpv6Support(ipv6Support);
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is enabled.
     * </p>
     * 
     * @param ipv6Support
     *        Indicates whether IPv6 support is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ipv6SupportValue
     */

    public TransitGatewayVpcAttachmentOptions withIpv6Support(Ipv6SupportValue ipv6Support) {
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

        if (obj instanceof TransitGatewayVpcAttachmentOptions == false)
            return false;
        TransitGatewayVpcAttachmentOptions other = (TransitGatewayVpcAttachmentOptions) obj;
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
    public TransitGatewayVpcAttachmentOptions clone() {
        try {
            return (TransitGatewayVpcAttachmentOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
