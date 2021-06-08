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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualNodeGrpcConnectionPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualNodeGrpcConnectionPool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     * </p>
     */
    private Integer maxRequests;

    /**
     * <p>
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     * </p>
     * 
     * @param maxRequests
     *        Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     */

    public void setMaxRequests(Integer maxRequests) {
        this.maxRequests = maxRequests;
    }

    /**
     * <p>
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     * </p>
     * 
     * @return Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     */

    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    /**
     * <p>
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     * </p>
     * 
     * @param maxRequests
     *        Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeGrpcConnectionPool withMaxRequests(Integer maxRequests) {
        setMaxRequests(maxRequests);
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
        if (getMaxRequests() != null)
            sb.append("MaxRequests: ").append(getMaxRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeGrpcConnectionPool == false)
            return false;
        VirtualNodeGrpcConnectionPool other = (VirtualNodeGrpcConnectionPool) obj;
        if (other.getMaxRequests() == null ^ this.getMaxRequests() == null)
            return false;
        if (other.getMaxRequests() != null && other.getMaxRequests().equals(this.getMaxRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxRequests() == null) ? 0 : getMaxRequests().hashCode());
        return hashCode;
    }

    @Override
    public VirtualNodeGrpcConnectionPool clone() {
        try {
            return (VirtualNodeGrpcConnectionPool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualNodeGrpcConnectionPoolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
