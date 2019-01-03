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
 * Describes an IPv4 range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpRange" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpRange implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv4 address, use the /32 prefix length.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * A description for the security group rule that references this IPv4 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     */
    private String description;

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *        a single IPv4 address, use the /32 prefix length.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @return The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *         a single IPv4 address, use the /32 prefix length.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a
     * single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify
     *        a single IPv4 address, use the /32 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRange withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv4 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group rule that references this IPv4 address range.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *        ._-:/()#,@[]+=;{}!$
     **/

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv4 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @return A description for the security group rule that references this IPv4 address range.</p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=;{}!$
     **/

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv4 address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group rule that references this IPv4 address range.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
     *        ._-:/()#,@[]+=;{}!$*
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRange withDescription(String description) {
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

        if (obj instanceof IpRange == false)
            return false;
        IpRange other = (IpRange) obj;
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
    public IpRange clone() {
        try {
            return (IpRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
