/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * A receipt IP address filter enables you to specify whether to accept
 * or reject mail originating from an IP address or range of IP
 * addresses.
 * </p>
 * <p>
 * For information about setting up IP address filters, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class ReceiptIpFilter implements Serializable, Cloneable {

    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     */
    private String policy;

    /**
     * A single IP address or a range of IP addresses that you want to block
     * or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     * An example of a single email address is 10.0.0.1. An example of a
     * range of IP addresses is 10.0.0.1/24. For more information about CIDR
     * notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     * 2317</a>.
     */
    private String cidr;

    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     *
     * @return Indicates whether to block or allow incoming mail from the specified
     *         IP addresses.
     *
     * @see ReceiptFilterPolicy
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     *
     * @param policy Indicates whether to block or allow incoming mail from the specified
     *         IP addresses.
     *
     * @see ReceiptFilterPolicy
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     *
     * @param policy Indicates whether to block or allow incoming mail from the specified
     *         IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReceiptFilterPolicy
     */
    public ReceiptIpFilter withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     *
     * @param policy Indicates whether to block or allow incoming mail from the specified
     *         IP addresses.
     *
     * @see ReceiptFilterPolicy
     */
    public void setPolicy(ReceiptFilterPolicy policy) {
        this.policy = policy.toString();
    }
    
    /**
     * Indicates whether to block or allow incoming mail from the specified
     * IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Block, Allow
     *
     * @param policy Indicates whether to block or allow incoming mail from the specified
     *         IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReceiptFilterPolicy
     */
    public ReceiptIpFilter withPolicy(ReceiptFilterPolicy policy) {
        this.policy = policy.toString();
        return this;
    }

    /**
     * A single IP address or a range of IP addresses that you want to block
     * or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     * An example of a single email address is 10.0.0.1. An example of a
     * range of IP addresses is 10.0.0.1/24. For more information about CIDR
     * notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     * 2317</a>.
     *
     * @return A single IP address or a range of IP addresses that you want to block
     *         or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     *         An example of a single email address is 10.0.0.1. An example of a
     *         range of IP addresses is 10.0.0.1/24. For more information about CIDR
     *         notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     *         2317</a>.
     */
    public String getCidr() {
        return cidr;
    }
    
    /**
     * A single IP address or a range of IP addresses that you want to block
     * or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     * An example of a single email address is 10.0.0.1. An example of a
     * range of IP addresses is 10.0.0.1/24. For more information about CIDR
     * notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     * 2317</a>.
     *
     * @param cidr A single IP address or a range of IP addresses that you want to block
     *         or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     *         An example of a single email address is 10.0.0.1. An example of a
     *         range of IP addresses is 10.0.0.1/24. For more information about CIDR
     *         notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     *         2317</a>.
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }
    
    /**
     * A single IP address or a range of IP addresses that you want to block
     * or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     * An example of a single email address is 10.0.0.1. An example of a
     * range of IP addresses is 10.0.0.1/24. For more information about CIDR
     * notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     * 2317</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidr A single IP address or a range of IP addresses that you want to block
     *         or allow, specified in Classless Inter-Domain Routing (CIDR) notation.
     *         An example of a single email address is 10.0.0.1. An example of a
     *         range of IP addresses is 10.0.0.1/24. For more information about CIDR
     *         notation, see <a href="https://tools.ietf.org/html/rfc2317">RFC
     *         2317</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptIpFilter withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getCidr() != null) sb.append("Cidr: " + getCidr() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReceiptIpFilter == false) return false;
        ReceiptIpFilter other = (ReceiptIpFilter)obj;
        
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getCidr() == null ^ this.getCidr() == null) return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false) return false; 
        return true;
    }
    
    @Override
    public ReceiptIpFilter clone() {
        try {
            return (ReceiptIpFilter) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    