/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single IP address specification. This is used in the <a>MatchAttributes</a> source and destination specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     */
    private String addressDefinition;

    /**
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addressDefinition
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4. </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public void setAddressDefinition(String addressDefinition) {
        this.addressDefinition = addressDefinition;
    }

    /**
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @return Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *         Network Firewall supports all address ranges for IPv4. </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     *         <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *         <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public String getAddressDefinition() {
        return this.addressDefinition;
    }

    /**
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addressDefinition
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4. </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAddressDefinition(String addressDefinition) {
        setAddressDefinition(addressDefinition);
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
        if (getAddressDefinition() != null)
            sb.append("AddressDefinition: ").append(getAddressDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;
        if (other.getAddressDefinition() == null ^ this.getAddressDefinition() == null)
            return false;
        if (other.getAddressDefinition() != null && other.getAddressDefinition().equals(this.getAddressDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressDefinition() == null) ? 0 : getAddressDefinition().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
