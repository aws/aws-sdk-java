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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a type of connection pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualNodeTcpConnectionPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualNodeTcpConnectionPool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
     * </p>
     */
    private Integer maxConnections;

    /**
     * <p>
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
     * </p>
     * 
     * @param maxConnections
     *        Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream
     *        cluster.
     */

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * <p>
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
     * </p>
     * 
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream
     *         cluster.
     */

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * <p>
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
     * </p>
     * 
     * @param maxConnections
     *        Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeTcpConnectionPool withMaxConnections(Integer maxConnections) {
        setMaxConnections(maxConnections);
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
        if (getMaxConnections() != null)
            sb.append("MaxConnections: ").append(getMaxConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeTcpConnectionPool == false)
            return false;
        VirtualNodeTcpConnectionPool other = (VirtualNodeTcpConnectionPool) obj;
        if (other.getMaxConnections() == null ^ this.getMaxConnections() == null)
            return false;
        if (other.getMaxConnections() != null && other.getMaxConnections().equals(this.getMaxConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConnections() == null) ? 0 : getMaxConnections().hashCode());
        return hashCode;
    }

    @Override
    public VirtualNodeTcpConnectionPool clone() {
        try {
            return (VirtualNodeTcpConnectionPool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualNodeTcpConnectionPoolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
