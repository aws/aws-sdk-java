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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Origination routes define call distribution properties for your SIP hosts to receive inbound calls using your Amazon
 * Chime Voice Connector. Limit: 10 origination routes per Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/OriginationRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginationRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The FODN or IP address to contact for origination traffic.
     * </p>
     */
    private String host;
    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol
     * by default.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted
     * first.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on
     * their relative weight.
     * </p>
     */
    private Integer weight;

    /**
     * <p>
     * The FODN or IP address to contact for origination traffic.
     * </p>
     * 
     * @param host
     *        The FODN or IP address to contact for origination traffic.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The FODN or IP address to contact for origination traffic.
     * </p>
     * 
     * @return The FODN or IP address to contact for origination traffic.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The FODN or IP address to contact for origination traffic.
     * </p>
     * 
     * @param host
     *        The FODN or IP address to contact for origination traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * 
     * @param port
     *        The designated origination route port. Defaults to 5060.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * 
     * @return The designated origination route port. Defaults to 5060.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * 
     * @param port
     *        The designated origination route port. Defaults to 5060.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol
     * by default.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP
     *        protocol by default.
     * @see OriginationRouteProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol
     * by default.
     * </p>
     * 
     * @return The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP
     *         protocol by default.
     * @see OriginationRouteProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol
     * by default.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP
     *        protocol by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginationRouteProtocol
     */

    public OriginationRoute withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol
     * by default.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP
     *        protocol by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginationRouteProtocol
     */

    public OriginationRoute withProtocol(OriginationRouteProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted
     * first.
     * </p>
     * 
     * @param priority
     *        The priority associated with the host, with 1 being the highest priority. Higher priority hosts are
     *        attempted first.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted
     * first.
     * </p>
     * 
     * @return The priority associated with the host, with 1 being the highest priority. Higher priority hosts are
     *         attempted first.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted
     * first.
     * </p>
     * 
     * @param priority
     *        The priority associated with the host, with 1 being the highest priority. Higher priority hosts are
     *        attempted first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on
     * their relative weight.
     * </p>
     * 
     * @param weight
     *        The weight associated with the host. If hosts are equal in priority, calls are distributed among them
     *        based on their relative weight.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on
     * their relative weight.
     * </p>
     * 
     * @return The weight associated with the host. If hosts are equal in priority, calls are distributed among them
     *         based on their relative weight.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on
     * their relative weight.
     * </p>
     * 
     * @param weight
     *        The weight associated with the host. If hosts are equal in priority, calls are distributed among them
     *        based on their relative weight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withWeight(Integer weight) {
        setWeight(weight);
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginationRoute == false)
            return false;
        OriginationRoute other = (OriginationRoute) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public OriginationRoute clone() {
        try {
            return (OriginationRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.OriginationRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
