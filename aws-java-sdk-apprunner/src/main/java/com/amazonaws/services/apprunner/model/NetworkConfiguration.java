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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes configuration settings related to network traffic of an App Runner service. Consists of embedded objects
 * for each configurable network feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/NetworkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Network configuration settings for outbound message traffic.
     * </p>
     */
    private EgressConfiguration egressConfiguration;
    /**
     * <p>
     * Network configuration settings for inbound message traffic.
     * </p>
     */
    private IngressConfiguration ingressConfiguration;
    /**
     * <p>
     * App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and <i>dual
     * stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional parameter. If you
     * do not specify an <code>IpAddressType</code>, it defaults to select IPv4.
     * </p>
     * <note>
     * <p>
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private endpoint.
     * If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App Runner service
     * will default to support only IPv4 for Private endpoint and fail to receive traffic originating from IPv6
     * endpoint.
     * </p>
     * </note>
     */
    private String ipAddressType;

    /**
     * <p>
     * Network configuration settings for outbound message traffic.
     * </p>
     * 
     * @param egressConfiguration
     *        Network configuration settings for outbound message traffic.
     */

    public void setEgressConfiguration(EgressConfiguration egressConfiguration) {
        this.egressConfiguration = egressConfiguration;
    }

    /**
     * <p>
     * Network configuration settings for outbound message traffic.
     * </p>
     * 
     * @return Network configuration settings for outbound message traffic.
     */

    public EgressConfiguration getEgressConfiguration() {
        return this.egressConfiguration;
    }

    /**
     * <p>
     * Network configuration settings for outbound message traffic.
     * </p>
     * 
     * @param egressConfiguration
     *        Network configuration settings for outbound message traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withEgressConfiguration(EgressConfiguration egressConfiguration) {
        setEgressConfiguration(egressConfiguration);
        return this;
    }

    /**
     * <p>
     * Network configuration settings for inbound message traffic.
     * </p>
     * 
     * @param ingressConfiguration
     *        Network configuration settings for inbound message traffic.
     */

    public void setIngressConfiguration(IngressConfiguration ingressConfiguration) {
        this.ingressConfiguration = ingressConfiguration;
    }

    /**
     * <p>
     * Network configuration settings for inbound message traffic.
     * </p>
     * 
     * @return Network configuration settings for inbound message traffic.
     */

    public IngressConfiguration getIngressConfiguration() {
        return this.ingressConfiguration;
    }

    /**
     * <p>
     * Network configuration settings for inbound message traffic.
     * </p>
     * 
     * @param ingressConfiguration
     *        Network configuration settings for inbound message traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withIngressConfiguration(IngressConfiguration ingressConfiguration) {
        setIngressConfiguration(ingressConfiguration);
        return this;
    }

    /**
     * <p>
     * App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and <i>dual
     * stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional parameter. If you
     * do not specify an <code>IpAddressType</code>, it defaults to select IPv4.
     * </p>
     * <note>
     * <p>
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private endpoint.
     * If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App Runner service
     * will default to support only IPv4 for Private endpoint and fail to receive traffic originating from IPv6
     * endpoint.
     * </p>
     * </note>
     * 
     * @param ipAddressType
     *        App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and
     *        <i>dual stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional
     *        parameter. If you do not specify an <code>IpAddressType</code>, it defaults to select IPv4.</p> <note>
     *        <p>
     *        Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private
     *        endpoint. If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App
     *        Runner service will default to support only IPv4 for Private endpoint and fail to receive traffic
     *        originating from IPv6 endpoint.
     *        </p>
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and <i>dual
     * stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional parameter. If you
     * do not specify an <code>IpAddressType</code>, it defaults to select IPv4.
     * </p>
     * <note>
     * <p>
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private endpoint.
     * If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App Runner service
     * will default to support only IPv4 for Private endpoint and fail to receive traffic originating from IPv6
     * endpoint.
     * </p>
     * </note>
     * 
     * @return App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and
     *         <i>dual stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional
     *         parameter. If you do not specify an <code>IpAddressType</code>, it defaults to select IPv4.</p> <note>
     *         <p>
     *         Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private
     *         endpoint. If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App
     *         Runner service will default to support only IPv4 for Private endpoint and fail to receive traffic
     *         originating from IPv6 endpoint.
     *         </p>
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and <i>dual
     * stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional parameter. If you
     * do not specify an <code>IpAddressType</code>, it defaults to select IPv4.
     * </p>
     * <note>
     * <p>
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private endpoint.
     * If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App Runner service
     * will default to support only IPv4 for Private endpoint and fail to receive traffic originating from IPv6
     * endpoint.
     * </p>
     * </note>
     * 
     * @param ipAddressType
     *        App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and
     *        <i>dual stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional
     *        parameter. If you do not specify an <code>IpAddressType</code>, it defaults to select IPv4.</p> <note>
     *        <p>
     *        Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private
     *        endpoint. If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App
     *        Runner service will default to support only IPv4 for Private endpoint and fail to receive traffic
     *        originating from IPv6 endpoint.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public NetworkConfiguration withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and <i>dual
     * stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional parameter. If you
     * do not specify an <code>IpAddressType</code>, it defaults to select IPv4.
     * </p>
     * <note>
     * <p>
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private endpoint.
     * If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App Runner service
     * will default to support only IPv4 for Private endpoint and fail to receive traffic originating from IPv6
     * endpoint.
     * </p>
     * </note>
     * 
     * @param ipAddressType
     *        App Runner provides you with the option to choose between <i>Internet Protocol version 4 (IPv4)</i> and
     *        <i>dual stack</i> (IPv4 and IPv6) for your incoming public network configuration. This is an optional
     *        parameter. If you do not specify an <code>IpAddressType</code>, it defaults to select IPv4.</p> <note>
     *        <p>
     *        Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported for Private
     *        endpoint. If you update a service that's using dual-stack Public endpoint to a Private endpoint, your App
     *        Runner service will default to support only IPv4 for Private endpoint and fail to receive traffic
     *        originating from IPv6 endpoint.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public NetworkConfiguration withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
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
        if (getEgressConfiguration() != null)
            sb.append("EgressConfiguration: ").append(getEgressConfiguration()).append(",");
        if (getIngressConfiguration() != null)
            sb.append("IngressConfiguration: ").append(getIngressConfiguration()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfiguration == false)
            return false;
        NetworkConfiguration other = (NetworkConfiguration) obj;
        if (other.getEgressConfiguration() == null ^ this.getEgressConfiguration() == null)
            return false;
        if (other.getEgressConfiguration() != null && other.getEgressConfiguration().equals(this.getEgressConfiguration()) == false)
            return false;
        if (other.getIngressConfiguration() == null ^ this.getIngressConfiguration() == null)
            return false;
        if (other.getIngressConfiguration() != null && other.getIngressConfiguration().equals(this.getIngressConfiguration()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressConfiguration() == null) ? 0 : getEgressConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIngressConfiguration() == null) ? 0 : getIngressConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public NetworkConfiguration clone() {
        try {
            return (NetworkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.NetworkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
