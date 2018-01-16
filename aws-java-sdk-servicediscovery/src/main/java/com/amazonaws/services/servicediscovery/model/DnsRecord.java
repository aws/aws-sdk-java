/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when
 * you register an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DnsRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS queries. The
     * following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the following
     * template, which can't be changed:
     * </p>
     * <p>
     * <code>priority weight port resource-record-set-name</code>
     * </p>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes from the
     * value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * </p>
     */
    private Long tTL;

    /**
     * <p>
     * The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS queries. The
     * following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the following
     * template, which can't be changed:
     * </p>
     * <p>
     * <code>priority weight port resource-record-set-name</code>
     * </p>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes from the
     * value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS
     *        queries. The following values are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the
     *        following template, which can't be changed:
     *        </p>
     *        <p>
     *        <code>priority weight port resource-record-set-name</code>
     *        </p>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes
     *        from the value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     * @see RecordType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS queries. The
     * following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the following
     * template, which can't be changed:
     * </p>
     * <p>
     * <code>priority weight port resource-record-set-name</code>
     * </p>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes from the
     * value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS
     *         queries. The following values are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     *         2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the
     *         following template, which can't be changed:
     *         </p>
     *         <p>
     *         <code>priority weight port resource-record-set-name</code>
     *         </p>
     *         <p>
     *         The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes
     *         from the value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     *         </p>
     *         </li>
     * @see RecordType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS queries. The
     * following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the following
     * template, which can't be changed:
     * </p>
     * <p>
     * <code>priority weight port resource-record-set-name</code>
     * </p>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes from the
     * value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS
     *        queries. The following values are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the
     *        following template, which can't be changed:
     *        </p>
     *        <p>
     *        <code>priority weight port resource-record-set-name</code>
     *        </p>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes
     *        from the value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public DnsRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS queries. The
     * following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the following
     * template, which can't be changed:
     * </p>
     * <p>
     * <code>priority weight port resource-record-set-name</code>
     * </p>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes from the
     * value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the resource, which indicates the value that Amazon Route 53 returns in response to DNS
     *        queries. The following values are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A</b>: Amazon Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AAAA</b>: Amazon Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SRV</b>: Amazon Route 53 returns the value for an SRV record. The value for an SRV record uses the
     *        following template, which can't be changed:
     *        </p>
     *        <p>
     *        <code>priority weight port resource-record-set-name</code>
     *        </p>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to 1. The value of port comes
     *        from the value that you specify for <code>Port</code> when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public DnsRecord withType(RecordType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * </p>
     * 
     * @param tTL
     *        The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record
     *        set.
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * </p>
     * 
     * @return The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource
     *         record set.
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * </p>
     * 
     * @param tTL
     *        The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecord withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRecord == false)
            return false;
        DnsRecord other = (DnsRecord) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        return hashCode;
    }

    @Override
    public DnsRecord clone() {
        try {
            return (DnsRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.DnsRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
