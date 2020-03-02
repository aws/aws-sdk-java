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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ProvisionByoipCidr"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionByoipCidrRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another Region.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     */
    private CidrAuthorizationContext cidrAuthorizationContext;

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another Region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24.
     *        The address range cannot overlap with another address range that you've brought to this or another Region.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another Region.
     * </p>
     * 
     * @return The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24.
     *         The address range cannot overlap with another address range that you've brought to this or another
     *         Region.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another Region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24.
     *        The address range cannot overlap with another address range that you've brought to this or another Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     */

    public void setCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @return A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *         using BYOIP.
     */

    public CidrAuthorizationContext getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        setCidrAuthorizationContext(cidrAuthorizationContext);
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
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: ").append(getCidrAuthorizationContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionByoipCidrRequest == false)
            return false;
        ProvisionByoipCidrRequest other = (ProvisionByoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionByoipCidrRequest clone() {
        return (ProvisionByoipCidrRequest) super.clone();
    }

}
