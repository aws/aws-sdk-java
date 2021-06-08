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
 * An object that represents the type of virtual gateway connection pool.
 * </p>
 * <p>
 * Only one protocol is used at a time and should be the same protocol as the one chosen under port mapping.
 * </p>
 * <p>
 * If not present the default value for <code>maxPendingRequests</code> is <code>2147483647</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayConnectionPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayConnectionPool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     */
    private VirtualGatewayGrpcConnectionPool grpc;
    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     */
    private VirtualGatewayHttpConnectionPool http;
    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     */
    private VirtualGatewayHttp2ConnectionPool http2;

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param grpc
     *        An object that represents a type of connection pool.
     */

    public void setGrpc(VirtualGatewayGrpcConnectionPool grpc) {
        this.grpc = grpc;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @return An object that represents a type of connection pool.
     */

    public VirtualGatewayGrpcConnectionPool getGrpc() {
        return this.grpc;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param grpc
     *        An object that represents a type of connection pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayConnectionPool withGrpc(VirtualGatewayGrpcConnectionPool grpc) {
        setGrpc(grpc);
        return this;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param http
     *        An object that represents a type of connection pool.
     */

    public void setHttp(VirtualGatewayHttpConnectionPool http) {
        this.http = http;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @return An object that represents a type of connection pool.
     */

    public VirtualGatewayHttpConnectionPool getHttp() {
        return this.http;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param http
     *        An object that represents a type of connection pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayConnectionPool withHttp(VirtualGatewayHttpConnectionPool http) {
        setHttp(http);
        return this;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param http2
     *        An object that represents a type of connection pool.
     */

    public void setHttp2(VirtualGatewayHttp2ConnectionPool http2) {
        this.http2 = http2;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @return An object that represents a type of connection pool.
     */

    public VirtualGatewayHttp2ConnectionPool getHttp2() {
        return this.http2;
    }

    /**
     * <p>
     * An object that represents a type of connection pool.
     * </p>
     * 
     * @param http2
     *        An object that represents a type of connection pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayConnectionPool withHttp2(VirtualGatewayHttp2ConnectionPool http2) {
        setHttp2(http2);
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
        if (getGrpc() != null)
            sb.append("Grpc: ").append(getGrpc()).append(",");
        if (getHttp() != null)
            sb.append("Http: ").append(getHttp()).append(",");
        if (getHttp2() != null)
            sb.append("Http2: ").append(getHttp2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayConnectionPool == false)
            return false;
        VirtualGatewayConnectionPool other = (VirtualGatewayConnectionPool) obj;
        if (other.getGrpc() == null ^ this.getGrpc() == null)
            return false;
        if (other.getGrpc() != null && other.getGrpc().equals(this.getGrpc()) == false)
            return false;
        if (other.getHttp() == null ^ this.getHttp() == null)
            return false;
        if (other.getHttp() != null && other.getHttp().equals(this.getHttp()) == false)
            return false;
        if (other.getHttp2() == null ^ this.getHttp2() == null)
            return false;
        if (other.getHttp2() != null && other.getHttp2().equals(this.getHttp2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrpc() == null) ? 0 : getGrpc().hashCode());
        hashCode = prime * hashCode + ((getHttp() == null) ? 0 : getHttp().hashCode());
        hashCode = prime * hashCode + ((getHttp2() == null) ? 0 : getHttp2().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayConnectionPool clone() {
        try {
            return (VirtualGatewayConnectionPool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayConnectionPoolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
