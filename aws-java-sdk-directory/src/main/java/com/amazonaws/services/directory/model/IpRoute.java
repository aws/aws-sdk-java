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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * IP address block. This is often the address block of the DNS server used for your on-premises domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/IpRoute" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server
     * used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example
     * 10.0.0.0/32.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * Description of the address block.
     * </p>
     */
    private String description;

    /**
     * <p>
     * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server
     * used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example
     * 10.0.0.0/32.
     * </p>
     * 
     * @param cidrIp
     *        IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS
     *        server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For
     *        example 10.0.0.0/32.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server
     * used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example
     * 10.0.0.0/32.
     * </p>
     * 
     * @return IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS
     *         server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For
     *         example 10.0.0.0/32.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server
     * used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example
     * 10.0.0.0/32.
     * </p>
     * 
     * @param cidrIp
     *        IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS
     *        server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For
     *        example 10.0.0.0/32.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRoute withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * Description of the address block.
     * </p>
     * 
     * @param description
     *        Description of the address block.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the address block.
     * </p>
     * 
     * @return Description of the address block.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the address block.
     * </p>
     * 
     * @param description
     *        Description of the address block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRoute withDescription(String description) {
        setDescription(description);
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
        if (getCidrIp() != null)
            sb.append("CidrIp: ").append(getCidrIp()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpRoute == false)
            return false;
        IpRoute other = (IpRoute) obj;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public IpRoute clone() {
        try {
            return (IpRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.IpRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
