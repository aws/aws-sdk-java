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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a route filter prefix that a customer can advertise through Border Gateway Protocol (BGP) over a
 * public virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/RouteFilterPrefix" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteFilterPrefix implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or
     * shorter.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or
     * shorter.
     * </p>
     * 
     * @param cidr
     *        The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64
     *        or shorter.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or
     * shorter.
     * </p>
     * 
     * @return The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64
     *         or shorter.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or
     * shorter.
     * </p>
     * 
     * @param cidr
     *        The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64
     *        or shorter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteFilterPrefix withCidr(String cidr) {
        setCidr(cidr);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteFilterPrefix == false)
            return false;
        RouteFilterPrefix other = (RouteFilterPrefix) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public RouteFilterPrefix clone() {
        try {
            return (RouteFilterPrefix) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.RouteFilterPrefixMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
