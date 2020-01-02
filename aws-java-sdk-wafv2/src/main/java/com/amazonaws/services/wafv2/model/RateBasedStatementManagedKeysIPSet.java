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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * The set of IP addresses that are currently blocked for a rate-based statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateBasedStatementManagedKeysIPSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatementManagedKeysIPSet implements Serializable, Cloneable, StructuredPojo {

    private String iPAddressVersion;
    /**
     * <p>
     * The IP addresses that are currently blocked.
     * </p>
     */
    private java.util.List<String> addresses;

    /**
     * @param iPAddressVersion
     * @see IPAddressVersion
     */

    public void setIPAddressVersion(String iPAddressVersion) {
        this.iPAddressVersion = iPAddressVersion;
    }

    /**
     * @return
     * @see IPAddressVersion
     */

    public String getIPAddressVersion() {
        return this.iPAddressVersion;
    }

    /**
     * @param iPAddressVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressVersion
     */

    public RateBasedStatementManagedKeysIPSet withIPAddressVersion(String iPAddressVersion) {
        setIPAddressVersion(iPAddressVersion);
        return this;
    }

    /**
     * @param iPAddressVersion
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
