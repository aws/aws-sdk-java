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
 * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR)
 * notation. AWS WAF supports any CIDR range. For information about CIDR notation, see the Wikipedia entry <a
 * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
 * </p>
 * <p>
 * AWS WAF assigns an ARN to each <code>IPSet</code> that you create. To use an IP set in a rule, you provide the ARN to
 * the <a>Rule</a> statement <a>IPSetReferenceStatement</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/IPSet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specify IPV4 or IPV6.
     * </p>
     */
    private String iPAddressVersion;
    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     */
    private java.util.List<String> addresses;

    /**
     * <p>
     * A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @return A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *         provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     * </p>
     * 
     * @return A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the IP set. You cannot change the description of an IP set after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specify IPV4 or IPV6.
     * </p>
     * 
     * @param iPAddressVersion
     *        Specify IPV4 or IPV6.
     * @see IPAddressVersion
     */

    public void setIPAddressVersion(String iPAddressVersion) {
        this.iPAddressVersion = iPAddressVersion;
    }

    /**
     * <p>
     * Specify IPV4 or IPV6.
     * </p>
     * 
     * @return Specify IPV4 or IPV6.
     * @see IPAddressVersion
     */

    public String getIPAddressVersion() {
        return this.iPAddressVersion;
    }

    /**
     * <p>
     * Specify IPV4 or IPV6.
     * </p>
     * 
     * @param iPAddressVersion
     *        Specify IPV4 or IPV6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressVersion
     */

    public IPSet withIPAddressVersion(String iPAddressVersion) {
        setIPAddressVersion(iPAddressVersion);
        return this;
    }

    /**
     * <p>
     * Specify IPV4 or IPV6.
     * </p>
     * 
     * @param iPAddressVersion
     *        Specify IPV4 or IPV6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressVersion
     */

    public IPSet withIPAddressVersion(IPAddressVersion iPAddressVersion) {
        this.iPAddressVersion = iPAddressVersion.toString();
        return this;
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @return Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *         Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     *         </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *         specify <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *         to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *         1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *         1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *         <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
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
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withAddresses(String... addresses) {
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
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withAddresses(java.util.Collection<String> addresses) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof IPSet == false)
            return false;
        IPSet other = (IPSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIPAddressVersion() == null) ? 0 : getIPAddressVersion().hashCode());
        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        return hashCode;
    }

    @Override
    public IPSet clone() {
        try {
            return (IPSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.IPSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
