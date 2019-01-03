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
 * [EC2-VPC only] Describes an IPv6 range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv6Range" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipv6Range implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv6 address, use the /128 prefix length.
     * </p>
     */
    private String cidrIpv6;
    /**
     * <p>
     * A description for the security group rule that references this IPv6 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     */
    private String description;

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *        a single IPv6 address, use the /128 prefix length.
     */

    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @return The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *         a single IPv6 address, use the /128 prefix length.
     */

    public String getCidrIpv6() {
        return this.cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *        a single IPv6 address, use the /128 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Range withCidrIpv6(String cidrIpv6) {
        setCidrIpv6(cidrIpv6);
        return this;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group rule that references this IPv6 address range.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *        ._-:/()#,@[]+=;{}!$
     **/

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @return A description for the security group rule that references this IPv6 address range.</p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=;{}!$
     **/

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group rule that references this IPv6 address range.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *        ._-:/()#,@[]+=;{}!$*
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Range withDescription(String description) {
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
        if (getCidrIpv6() != null)
            sb.append("CidrIpv6: ").append(getCidrIpv6()).append(",");
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

        if (obj instanceof Ipv6Range == false)
            return false;
        Ipv6Range other = (Ipv6Range) obj;
        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
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

        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Ipv6Range clone() {
        try {
            return (Ipv6Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
