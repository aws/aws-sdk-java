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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Self-Managed Apache Kafka cluster for your event source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/SelfManagedEventSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedEventSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>> endpoints;

    /**
     * <p>
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     * </p>
     * 
     * @return The list of bootstrap servers for your Kafka brokers in the following format:
     *         <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     */

    public java.util.Map<String, java.util.List<String>> getEndpoints() {
        if (endpoints == null) {
            endpoints = new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>();
        }
        return endpoints;
    }

    /**
     * <p>
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     * </p>
     * 
     * @param endpoints
     *        The list of bootstrap servers for your Kafka brokers in the following format:
     *        <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     */

    public void setEndpoints(java.util.Map<String, java.util.List<String>> endpoints) {
        this.endpoints = endpoints == null ? null : new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>(endpoints);
    }

    /**
     * <p>
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     * </p>
     * 
     * @param endpoints
     *        The list of bootstrap servers for your Kafka brokers in the following format:
     *        <code>"KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedEventSource withEndpoints(java.util.Map<String, java.util.List<String>> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * Add a single Endpoints entry
     *
     * @see SelfManagedEventSource#withEndpoints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedEventSource addEndpointsEntry(String key, java.util.List<String> value) {
        if (null == this.endpoints) {
            this.endpoints = new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>();
        }
        if (this.endpoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.endpoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Endpoints.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedEventSource clearEndpointsEntries() {
        this.endpoints = null;
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedEventSource == false)
            return false;
        SelfManagedEventSource other = (SelfManagedEventSource) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedEventSource clone() {
        try {
            return (SelfManagedEventSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.SelfManagedEventSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
