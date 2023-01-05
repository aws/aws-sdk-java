/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/OriginationRoute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginationRoute implements Serializable, Cloneable, StructuredPojo {

    private String host;

    private Integer port;

    private String protocol;

    private Integer priority;

    private Integer weight;

    /**
     * @param host
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return
     */

    public String getHost() {
        return this.host;
    }

    /**
     * @param host
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * @param port
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * @return
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * @param port
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * @param protocol
     * @see OriginationRouteProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * @return
     * @see OriginationRouteProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @param protocol
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginationRouteProtocol
     */

    public OriginationRoute withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * @param protocol
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginationRouteProtocol
     */

    public OriginationRoute withProtocol(OriginationRouteProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * @param priority
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationRoute withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * @param weight
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * @return
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * @param weight
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
        com.amazonaws.services.chimesdkvoice.model.transform.OriginationRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
