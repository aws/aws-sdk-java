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
 * An object that represents timeouts for different protocols.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListenerTimeout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerTimeout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     */
    private GrpcTimeout grpc;
    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     */
    private HttpTimeout http;
    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     */
    private HttpTimeout http2;
    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     */
    private TcpTimeout tcp;

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param grpc
     *        An object that represents types of timeouts.
     */

    public void setGrpc(GrpcTimeout grpc) {
        this.grpc = grpc;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @return An object that represents types of timeouts.
     */

    public GrpcTimeout getGrpc() {
        return this.grpc;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param grpc
     *        An object that represents types of timeouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTimeout withGrpc(GrpcTimeout grpc) {
        setGrpc(grpc);
        return this;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param http
     *        An object that represents types of timeouts.
     */

    public void setHttp(HttpTimeout http) {
        this.http = http;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @return An object that represents types of timeouts.
     */

    public HttpTimeout getHttp() {
        return this.http;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param http
     *        An object that represents types of timeouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTimeout withHttp(HttpTimeout http) {
        setHttp(http);
        return this;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param http2
     *        An object that represents types of timeouts.
     */

    public void setHttp2(HttpTimeout http2) {
        this.http2 = http2;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @return An object that represents types of timeouts.
     */

    public HttpTimeout getHttp2() {
        return this.http2;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param http2
     *        An object that represents types of timeouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTimeout withHttp2(HttpTimeout http2) {
        setHttp2(http2);
        return this;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param tcp
     *        An object that represents types of timeouts.
     */

    public void setTcp(TcpTimeout tcp) {
        this.tcp = tcp;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @return An object that represents types of timeouts.
     */

    public TcpTimeout getTcp() {
        return this.tcp;
    }

    /**
     * <p>
     * An object that represents types of timeouts.
     * </p>
     * 
     * @param tcp
     *        An object that represents types of timeouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTimeout withTcp(TcpTimeout tcp) {
        setTcp(tcp);
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
            sb.append("Http2: ").append(getHttp2()).append(",");
        if (getTcp() != null)
            sb.append("Tcp: ").append(getTcp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTimeout == false)
            return false;
        ListenerTimeout other = (ListenerTimeout) obj;
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
        if (other.getTcp() == null ^ this.getTcp() == null)
            return false;
        if (other.getTcp() != null && other.getTcp().equals(this.getTcp()) == false)
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
        hashCode = prime * hashCode + ((getTcp() == null) ? 0 : getTcp().hashCode());
        return hashCode;
    }

    @Override
    public ListenerTimeout clone() {
        try {
            return (ListenerTimeout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ListenerTimeoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
