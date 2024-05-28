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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In a <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html">
 * CreateResolverRule</a> request, an array of the IPs that you want to forward DNS queries to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TargetAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One IPv4 address that you want to forward DNS queries to.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The port at <code>Ip</code> that you want to forward DNS queries to.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * One IPv6 address that you want to forward DNS queries to.
     * </p>
     */
    private String ipv6;
    /**
     * <p>
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     */
    private String protocol;

    /**
     * <p>
     * One IPv4 address that you want to forward DNS queries to.
     * </p>
     * 
     * @param ip
     *        One IPv4 address that you want to forward DNS queries to.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * One IPv4 address that you want to forward DNS queries to.
     * </p>
     * 
     * @return One IPv4 address that you want to forward DNS queries to.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * One IPv4 address that you want to forward DNS queries to.
     * </p>
     * 
     * @param ip
     *        One IPv4 address that you want to forward DNS queries to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetAddress withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The port at <code>Ip</code> that you want to forward DNS queries to.
     * </p>
     * 
     * @param port
     *        The port at <code>Ip</code> that you want to forward DNS queries to.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port at <code>Ip</code> that you want to forward DNS queries to.
     * </p>
     * 
     * @return The port at <code>Ip</code> that you want to forward DNS queries to.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port at <code>Ip</code> that you want to forward DNS queries to.
     * </p>
     * 
     * @param port
     *        The port at <code>Ip</code> that you want to forward DNS queries to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetAddress withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * One IPv6 address that you want to forward DNS queries to.
     * </p>
     * 
     * @param ipv6
     *        One IPv6 address that you want to forward DNS queries to.
     */

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    /**
     * <p>
     * One IPv6 address that you want to forward DNS queries to.
     * </p>
     * 
     * @return One IPv6 address that you want to forward DNS queries to.
     */

    public String getIpv6() {
        return this.ipv6;
    }

    /**
     * <p>
     * One IPv6 address that you want to forward DNS queries to.
     * </p>
     * 
     * @param ipv6
     *        One IPv6 address that you want to forward DNS queries to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetAddress withIpv6(String ipv6) {
        setIpv6(ipv6);
        return this;
    }

    /**
     * <p>
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only. </p>
     *         <p>
     *         For an inbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 and DoH-FIPS in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH-FIPS alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For an outbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public TargetAddress withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public TargetAddress withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getIpv6() != null)
            sb.append("Ipv6: ").append(getIpv6()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetAddress == false)
            return false;
        TargetAddress other = (TargetAddress) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getIpv6() == null ^ this.getIpv6() == null)
            return false;
        if (other.getIpv6() != null && other.getIpv6().equals(this.getIpv6()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getIpv6() == null) ? 0 : getIpv6().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public TargetAddress clone() {
        try {
            return (TargetAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.TargetAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
