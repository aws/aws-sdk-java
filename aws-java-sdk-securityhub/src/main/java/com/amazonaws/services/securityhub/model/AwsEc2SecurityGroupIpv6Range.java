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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A range of IPv6 addresses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2SecurityGroupIpv6Range"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupIpv6Range implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv6 address, use the /128 prefix length.
     * </p>
     */
    private String cidrIpv6;

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *        To specify a single IPv6 address, use the /128 prefix length.
     */

    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @return The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *         To specify a single IPv6 address, use the /128 prefix length.
     */

    public String getCidrIpv6() {
        return this.cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *        To specify a single IPv6 address, use the /128 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpv6Range withCidrIpv6(String cidrIpv6) {
        setCidrIpv6(cidrIpv6);
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
        if (getCidrIpv6() != null)
            sb.append("CidrIpv6: ").append(getCidrIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpv6Range == false)
            return false;
        AwsEc2SecurityGroupIpv6Range other = (AwsEc2SecurityGroupIpv6Range) obj;
        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2SecurityGroupIpv6Range clone() {
        try {
            return (AwsEc2SecurityGroupIpv6Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2SecurityGroupIpv6RangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
