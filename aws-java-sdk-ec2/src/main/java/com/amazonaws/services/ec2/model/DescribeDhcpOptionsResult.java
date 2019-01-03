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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDhcpOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more DHCP options sets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DhcpOptions> dhcpOptions;

    /**
     * <p>
     * Information about one or more DHCP options sets.
     * </p>
     * 
     * @return Information about one or more DHCP options sets.
     */

    public java.util.List<DhcpOptions> getDhcpOptions() {
        if (dhcpOptions == null) {
            dhcpOptions = new com.amazonaws.internal.SdkInternalList<DhcpOptions>();
        }
        return dhcpOptions;
    }

    /**
     * <p>
     * Information about one or more DHCP options sets.
     * </p>
     * 
     * @param dhcpOptions
     *        Information about one or more DHCP options sets.
     */

    public void setDhcpOptions(java.util.Collection<DhcpOptions> dhcpOptions) {
        if (dhcpOptions == null) {
            this.dhcpOptions = null;
            return;
        }

        this.dhcpOptions = new com.amazonaws.internal.SdkInternalList<DhcpOptions>(dhcpOptions);
    }

    /**
     * <p>
     * Information about one or more DHCP options sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDhcpOptions(java.util.Collection)} or {@link #withDhcpOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dhcpOptions
     *        Information about one or more DHCP options sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsResult withDhcpOptions(DhcpOptions... dhcpOptions) {
        if (this.dhcpOptions == null) {
            setDhcpOptions(new com.amazonaws.internal.SdkInternalList<DhcpOptions>(dhcpOptions.length));
        }
        for (DhcpOptions ele : dhcpOptions) {
            this.dhcpOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more DHCP options sets.
     * </p>
     * 
     * @param dhcpOptions
     *        Information about one or more DHCP options sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsResult withDhcpOptions(java.util.Collection<DhcpOptions> dhcpOptions) {
        setDhcpOptions(dhcpOptions);
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
        if (getDhcpOptions() != null)
            sb.append("DhcpOptions: ").append(getDhcpOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDhcpOptionsResult == false)
            return false;
        DescribeDhcpOptionsResult other = (DescribeDhcpOptionsResult) obj;
        if (other.getDhcpOptions() == null ^ this.getDhcpOptions() == null)
            return false;
        if (other.getDhcpOptions() != null && other.getDhcpOptions().equals(this.getDhcpOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDhcpOptions() == null) ? 0 : getDhcpOptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDhcpOptionsResult clone() {
        try {
            return (DescribeDhcpOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
