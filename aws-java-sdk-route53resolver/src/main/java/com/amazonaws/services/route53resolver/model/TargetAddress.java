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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In a <a>CreateResolverRule</a> request, an array of the IPs that you want to forward DNS queries to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TargetAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
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
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     * </p>
     * 
     * @param ip
     *        One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     * </p>
     * 
     * @return One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     * </p>
     * 
     * @param ip
     *        One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
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
            sb.append("Port: ").append(getPort());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
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
