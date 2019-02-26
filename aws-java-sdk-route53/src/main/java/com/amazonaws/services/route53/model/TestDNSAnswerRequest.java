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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You
 * can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TestDNSAnswer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestDNSAnswerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     * </p>
     */
    private String recordName;
    /**
     * <p>
     * The type of the resource record set.
     * </p>
     */
    private String recordType;
    /**
     * <p>
     * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you
     * omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US East (N.
     * Virginia) Region (<code>us-east-1</code>).
     * </p>
     */
    private String resolverIP;
    /**
     * <p>
     * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in
     * the applicable location, for example, <code>192.0.2.44</code> or <code>2001:db8:85a3::8a2e:370:7334</code>.
     * </p>
     */
    private String eDNS0ClientSubnetIP;
    /**
     * <p>
     * If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number of bits
     * of the IP address that you want the checking tool to include in the DNS query. For example, if you specify
     * <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     * <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The default
     * value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.
     * </p>
     * <p>
     * The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6 address:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4</b>: Specify a value between 0 and 32
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6</b>: Specify a value between 0 and 128
     * </p>
     * </li>
     * </ul>
     */
    private String eDNS0ClientSubnetMask;

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @return The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @param recordName
     *        The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     */

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @return The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     */

    public String getRecordName() {
        return this.recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     * </p>
     * 
     * @param recordName
     *        The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerRequest withRecordName(String recordName) {
        setRecordName(recordName);
        return this;
    }

    /**
     * <p>
     * The type of the resource record set.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set.
     * @see RRType
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The type of the resource record set.
     * </p>
     * 
     * @return The type of the resource record set.
     * @see RRType
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * <p>
     * The type of the resource record set.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TestDNSAnswerRequest withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * <p>
     * The type of the resource record set.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set.
     * @see RRType
     */

    public void setRecordType(RRType recordType) {
        withRecordType(recordType);
    }

    /**
     * <p>
     * The type of the resource record set.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TestDNSAnswerRequest withRecordType(RRType recordType) {
        this.recordType = recordType.toString();
        return this;
    }

    /**
     * <p>
     * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you
     * omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US East (N.
     * Virginia) Region (<code>us-east-1</code>).
     * </p>
     * 
     * @param resolverIP
     *        If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *        If you omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *        East (N. Virginia) Region (<code>us-east-1</code>).
     */

    public void setResolverIP(String resolverIP) {
        this.resolverIP = resolverIP;
    }

    /**
     * <p>
     * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you
     * omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US East (N.
     * Virginia) Region (<code>us-east-1</code>).
     * </p>
     * 
     * @return If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *         If you omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *         East (N. Virginia) Region (<code>us-east-1</code>).
     */

    public String getResolverIP() {
        return this.resolverIP;
    }

    /**
     * <p>
     * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you
     * omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US East (N.
     * Virginia) Region (<code>us-east-1</code>).
     * </p>
     * 
     * @param resolverIP
     *        If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *        If you omit this value, <code>TestDnsAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *        East (N. Virginia) Region (<code>us-east-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerRequest withResolverIP(String resolverIP) {
        setResolverIP(resolverIP);
        return this;
    }

    /**
     * <p>
     * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in
     * the applicable location, for example, <code>192.0.2.44</code> or <code>2001:db8:85a3::8a2e:370:7334</code>.
     * </p>
     * 
     * @param eDNS0ClientSubnetIP
     *        If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a
     *        client in the applicable location, for example, <code>192.0.2.44</code> or
     *        <code>2001:db8:85a3::8a2e:370:7334</code>.
     */

    public void setEDNS0ClientSubnetIP(String eDNS0ClientSubnetIP) {
        this.eDNS0ClientSubnetIP = eDNS0ClientSubnetIP;
    }

    /**
     * <p>
     * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in
     * the applicable location, for example, <code>192.0.2.44</code> or <code>2001:db8:85a3::8a2e:370:7334</code>.
     * </p>
     * 
     * @return If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a
     *         client in the applicable location, for example, <code>192.0.2.44</code> or
     *         <code>2001:db8:85a3::8a2e:370:7334</code>.
     */

    public String getEDNS0ClientSubnetIP() {
        return this.eDNS0ClientSubnetIP;
    }

    /**
     * <p>
     * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in
     * the applicable location, for example, <code>192.0.2.44</code> or <code>2001:db8:85a3::8a2e:370:7334</code>.
     * </p>
     * 
     * @param eDNS0ClientSubnetIP
     *        If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a
     *        client in the applicable location, for example, <code>192.0.2.44</code> or
     *        <code>2001:db8:85a3::8a2e:370:7334</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerRequest withEDNS0ClientSubnetIP(String eDNS0ClientSubnetIP) {
        setEDNS0ClientSubnetIP(eDNS0ClientSubnetIP);
        return this;
    }

    /**
     * <p>
     * If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number of bits
     * of the IP address that you want the checking tool to include in the DNS query. For example, if you specify
     * <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     * <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The default
     * value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.
     * </p>
     * <p>
     * The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6 address:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4</b>: Specify a value between 0 and 32
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6</b>: Specify a value between 0 and 128
     * </p>
     * </li>
     * </ul>
     * 
     * @param eDNS0ClientSubnetMask
     *        If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *        of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you
     *        specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *        <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The
     *        default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.</p>
     *        <p>
     *        The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6
     *        address:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IPv4</b>: Specify a value between 0 and 32
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IPv6</b>: Specify a value between 0 and 128
     *        </p>
     *        </li>
     */

    public void setEDNS0ClientSubnetMask(String eDNS0ClientSubnetMask) {
        this.eDNS0ClientSubnetMask = eDNS0ClientSubnetMask;
    }

    /**
     * <p>
     * If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number of bits
     * of the IP address that you want the checking tool to include in the DNS query. For example, if you specify
     * <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     * <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The default
     * value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.
     * </p>
     * <p>
     * The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6 address:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4</b>: Specify a value between 0 and 32
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6</b>: Specify a value between 0 and 128
     * </p>
     * </li>
     * </ul>
     * 
     * @return If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *         of bits of the IP address that you want the checking tool to include in the DNS query. For example, if
     *         you specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *         <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The
     *         default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.</p>
     *         <p>
     *         The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6
     *         address:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>IPv4</b>: Specify a value between 0 and 32
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IPv6</b>: Specify a value between 0 and 128
     *         </p>
     *         </li>
     */

    public String getEDNS0ClientSubnetMask() {
        return this.eDNS0ClientSubnetMask;
    }

    /**
     * <p>
     * If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number of bits
     * of the IP address that you want the checking tool to include in the DNS query. For example, if you specify
     * <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     * <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The default
     * value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.
     * </p>
     * <p>
     * The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6 address:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4</b>: Specify a value between 0 and 32
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6</b>: Specify a value between 0 and 128
     * </p>
     * </li>
     * </ul>
     * 
     * @param eDNS0ClientSubnetMask
     *        If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *        of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you
     *        specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *        <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from 192.0.2.0/24. The
     *        default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses.</p>
     *        <p>
     *        The range of valid values depends on whether <code>edns0clientsubnetip</code> is an IPv4 or an IPv6
     *        address:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IPv4</b>: Specify a value between 0 and 32
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IPv6</b>: Specify a value between 0 and 128
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerRequest withEDNS0ClientSubnetMask(String eDNS0ClientSubnetMask) {
        setEDNS0ClientSubnetMask(eDNS0ClientSubnetMask);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getRecordName() != null)
            sb.append("RecordName: ").append(getRecordName()).append(",");
        if (getRecordType() != null)
            sb.append("RecordType: ").append(getRecordType()).append(",");
        if (getResolverIP() != null)
            sb.append("ResolverIP: ").append(getResolverIP()).append(",");
        if (getEDNS0ClientSubnetIP() != null)
            sb.append("EDNS0ClientSubnetIP: ").append(getEDNS0ClientSubnetIP()).append(",");
        if (getEDNS0ClientSubnetMask() != null)
            sb.append("EDNS0ClientSubnetMask: ").append(getEDNS0ClientSubnetMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestDNSAnswerRequest == false)
            return false;
        TestDNSAnswerRequest other = (TestDNSAnswerRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getRecordName() == null ^ this.getRecordName() == null)
            return false;
        if (other.getRecordName() != null && other.getRecordName().equals(this.getRecordName()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getResolverIP() == null ^ this.getResolverIP() == null)
            return false;
        if (other.getResolverIP() != null && other.getResolverIP().equals(this.getResolverIP()) == false)
            return false;
        if (other.getEDNS0ClientSubnetIP() == null ^ this.getEDNS0ClientSubnetIP() == null)
            return false;
        if (other.getEDNS0ClientSubnetIP() != null && other.getEDNS0ClientSubnetIP().equals(this.getEDNS0ClientSubnetIP()) == false)
            return false;
        if (other.getEDNS0ClientSubnetMask() == null ^ this.getEDNS0ClientSubnetMask() == null)
            return false;
        if (other.getEDNS0ClientSubnetMask() != null && other.getEDNS0ClientSubnetMask().equals(this.getEDNS0ClientSubnetMask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getRecordName() == null) ? 0 : getRecordName().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getResolverIP() == null) ? 0 : getResolverIP().hashCode());
        hashCode = prime * hashCode + ((getEDNS0ClientSubnetIP() == null) ? 0 : getEDNS0ClientSubnetIP().hashCode());
        hashCode = prime * hashCode + ((getEDNS0ClientSubnetMask() == null) ? 0 : getEDNS0ClientSubnetMask().hashCode());
        return hashCode;
    }

    @Override
    public TestDNSAnswerRequest clone() {
        return (TestDNSAnswerRequest) super.clone();
    }

}
