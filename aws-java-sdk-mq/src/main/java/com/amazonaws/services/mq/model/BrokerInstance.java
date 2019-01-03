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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Returns information about all brokers.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/BrokerInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerInstance implements Serializable, Cloneable, StructuredPojo {

    /** The URL of the broker's ActiveMQ Web Console. */
    private String consoleURL;
    /** The broker's wire-level protocol endpoints. */
    private java.util.List<String> endpoints;
    /** The IP address of the Elastic Network Interface (ENI) attached to the broker. */
    private String ipAddress;

    /**
     * The URL of the broker's ActiveMQ Web Console.
     * 
     * @param consoleURL
     *        The URL of the broker's ActiveMQ Web Console.
     */

    public void setConsoleURL(String consoleURL) {
        this.consoleURL = consoleURL;
    }

    /**
     * The URL of the broker's ActiveMQ Web Console.
     * 
     * @return The URL of the broker's ActiveMQ Web Console.
     */

    public String getConsoleURL() {
        return this.consoleURL;
    }

    /**
     * The URL of the broker's ActiveMQ Web Console.
     * 
     * @param consoleURL
     *        The URL of the broker's ActiveMQ Web Console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstance withConsoleURL(String consoleURL) {
        setConsoleURL(consoleURL);
        return this;
    }

    /**
     * The broker's wire-level protocol endpoints.
     * 
     * @return The broker's wire-level protocol endpoints.
     */

    public java.util.List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * The broker's wire-level protocol endpoints.
     * 
     * @param endpoints
     *        The broker's wire-level protocol endpoints.
     */

    public void setEndpoints(java.util.Collection<String> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<String>(endpoints);
    }

    /**
     * The broker's wire-level protocol endpoints.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        The broker's wire-level protocol endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstance withEndpoints(String... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<String>(endpoints.length));
        }
        for (String ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * The broker's wire-level protocol endpoints.
     * 
     * @param endpoints
     *        The broker's wire-level protocol endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstance withEndpoints(java.util.Collection<String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * The IP address of the Elastic Network Interface (ENI) attached to the broker.
     * 
     * @param ipAddress
     *        The IP address of the Elastic Network Interface (ENI) attached to the broker.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * The IP address of the Elastic Network Interface (ENI) attached to the broker.
     * 
     * @return The IP address of the Elastic Network Interface (ENI) attached to the broker.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The IP address of the Elastic Network Interface (ENI) attached to the broker.
     * 
     * @param ipAddress
     *        The IP address of the Elastic Network Interface (ENI) attached to the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstance withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getConsoleURL() != null)
            sb.append("ConsoleURL: ").append(getConsoleURL()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerInstance == false)
            return false;
        BrokerInstance other = (BrokerInstance) obj;
        if (other.getConsoleURL() == null ^ this.getConsoleURL() == null)
            return false;
        if (other.getConsoleURL() != null && other.getConsoleURL().equals(this.getConsoleURL()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsoleURL() == null) ? 0 : getConsoleURL().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public BrokerInstance clone() {
        try {
            return (BrokerInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.BrokerInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
