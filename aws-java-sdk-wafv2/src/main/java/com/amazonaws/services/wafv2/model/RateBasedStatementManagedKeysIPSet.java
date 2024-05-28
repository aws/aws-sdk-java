/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of IP addresses that are currently blocked for a <a>RateBasedStatement</a>. This is only available for
 * rate-based rules that aggregate on just the IP address, with the <code>AggregateKeyType</code> set to <code>IP</code>
 * or <code>FORWARDED_IP</code>.
 * </p>
 * <p>
 * A rate-based rule applies its rule action to requests from IP addresses that are in the rule's managed keys list and
 * that match the rule's scope-down statement. When a rule has no scope-down statement, it applies the action to all
 * requests from the IP addresses that are in the list. The rule applies its rule action to rate limit the matching
 * requests. The action is usually Block but it can be any valid rule action except for Allow.
 * </p>
 * <p>
 * The maximum number of IP addresses that can be rate limited by a single rate-based rule instance is 10,000. If more
 * than 10,000 addresses exceed the rate limit, WAF limits those with the highest rates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateBasedStatementManagedKeysIPSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatementManagedKeysIPSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     */
    private String iPAddressVersion;
    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     */
    private java.util.List<String> addresses;

    /**
     * <p>
     * The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param iPAddressVersion
     *        The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * @see IPAddressVersion
     */

    public void setIPAddressVersion(String iPAddressVersion) {
        this.iPAddressVersion = iPAddressVersion;
    }

    /**
     * <p>
     * The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @return The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * @see IPAddressVersion
     */

    public String getIPAddressVersion() {
        return this.iPAddressVersion;
    }

    /**
     * <p>
     * The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param iPAddressVersion
     *        The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressVersion
     */

    public RateBasedStatementManagedKeysIPSet withIPAddressVersion(String iPAddressVersion) {
        setIPAddressVersion(iPAddressVersion);
        return this;
    }

    /**
     * <p>
     * The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param iPAddressVersion
     *        The version of the IP addresses, either <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressVersion
     */

    public RateBasedStatementManagedKeysIPSet withIPAddressVersion(IPAddressVersion iPAddressVersion) {
        this.iPAddressVersion = iPAddressVersion.toString();
        return this;
    }

    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     * 
     * @return The IP addresses that are currently blocked.
     */

    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     * 
     * @param addresses
     *        The IP addresses that are currently blocked.
     */

    public void setAddresses(java.util.Collection<String> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<String>(addresses);
    }

    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        The IP addresses that are currently blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementManagedKeysIPSet withAddresses(String... addresses) {
        if (this.addresses == null) {
            setAddresses(new java.util.ArrayList<String>(addresses.length));
        }
        for (String ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     * 
     * @param addresses
     *        The IP addresses that are currently blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementManagedKeysIPSet withAddresses(java.util.Collection<String> addresses) {
        setAddresses(addresses);
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
        if (getIPAddressVersion() != null)
            sb.append("IPAddressVersion: ").append(getIPAddressVersion()).append(",");
        if (getAddresses() != null)
            sb.append("Addresses: ").append(getAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateBasedStatementManagedKeysIPSet == false)
            return false;
        RateBasedStatementManagedKeysIPSet other = (RateBasedStatementManagedKeysIPSet) obj;
        if (other.getIPAddressVersion() == null ^ this.getIPAddressVersion() == null)
            return false;
        if (other.getIPAddressVersion() != null && other.getIPAddressVersion().equals(this.getIPAddressVersion()) == false)
            return false;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPAddressVersion() == null) ? 0 : getIPAddressVersion().hashCode());
        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        return hashCode;
    }

    @Override
    public RateBasedStatementManagedKeysIPSet clone() {
        try {
            return (RateBasedStatementManagedKeysIPSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateBasedStatementManagedKeysIPSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
