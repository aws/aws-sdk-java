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
 * A range of IPv4 addresses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2SecurityGroupIpRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupIpRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv4 address, use the /32 prefix length.
     * </p>
     */
    private String cidrIp;

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *        To specify a single IPv4 address, use the /32 prefix length.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @return The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *         To specify a single IPv4 address, use the /32 prefix length.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To
     * specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both.
     *        To specify a single IPv4 address, use the /32 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpRange withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
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
            sb.append("CidrIp: ").append(getCidrIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpRange == false)
            return false;
        AwsEc2SecurityGroupIpRange other = (AwsEc2SecurityGroupIpRange) obj;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2SecurityGroupIpRange clone() {
        try {
            return (AwsEc2SecurityGroupIpRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2SecurityGroupIpRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
