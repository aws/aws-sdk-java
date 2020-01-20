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

/**
 * <p>
 * Describes an IPv6 CIDR block association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv6CidrAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipv6CidrAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6Cidr;
    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     */
    private String associatedResource;

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6Cidr
     *        The IPv6 CIDR block.
     */

    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @return The IPv6 CIDR block.
     */

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6Cidr
     *        The IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6CidrAssociation withIpv6Cidr(String ipv6Cidr) {
        setIpv6Cidr(ipv6Cidr);
        return this;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     * 
     * @param associatedResource
     *        The resource that's associated with the IPv6 CIDR block.
     */

    public void setAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     * 
     * @return The resource that's associated with the IPv6 CIDR block.
     */

    public String getAssociatedResource() {
        return this.associatedResource;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     * 
     * @param associatedResource
     *        The resource that's associated with the IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6CidrAssociation withAssociatedResource(String associatedResource) {
        setAssociatedResource(associatedResource);
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
        if (getIpv6Cidr() != null)
            sb.append("Ipv6Cidr: ").append(getIpv6Cidr()).append(",");
        if (getAssociatedResource() != null)
            sb.append("AssociatedResource: ").append(getAssociatedResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv6CidrAssociation == false)
            return false;
        Ipv6CidrAssociation other = (Ipv6CidrAssociation) obj;
        if (other.getIpv6Cidr() == null ^ this.getIpv6Cidr() == null)
            return false;
        if (other.getIpv6Cidr() != null && other.getIpv6Cidr().equals(this.getIpv6Cidr()) == false)
            return false;
        if (other.getAssociatedResource() == null ^ this.getAssociatedResource() == null)
            return false;
        if (other.getAssociatedResource() != null && other.getAssociatedResource().equals(this.getAssociatedResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Cidr() == null) ? 0 : getIpv6Cidr().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResource() == null) ? 0 : getAssociatedResource().hashCode());
        return hashCode;
    }

    @Override
    public Ipv6CidrAssociation clone() {
        try {
            return (Ipv6CidrAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
