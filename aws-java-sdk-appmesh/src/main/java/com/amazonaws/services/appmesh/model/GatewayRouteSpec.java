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
 * An object that represents a gateway route specification. Specify one gateway route type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GatewayRouteSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayRouteSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the specification of a gRPC gateway route.
     * </p>
     */
    private GrpcGatewayRoute grpcRoute;
    /**
     * <p>
     * An object that represents the specification of an HTTP/2 gateway route.
     * </p>
     */
    private HttpGatewayRoute http2Route;
    /**
     * <p>
     * An object that represents the specification of an HTTP gateway route.
     * </p>
     */
    private HttpGatewayRoute httpRoute;
    /**
     * <p>
     * The ordering of the gateway routes spec.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * An object that represents the specification of a gRPC gateway route.
     * </p>
     * 
     * @param grpcRoute
     *        An object that represents the specification of a gRPC gateway route.
     */

    public void setGrpcRoute(GrpcGatewayRoute grpcRoute) {
        this.grpcRoute = grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC gateway route.
     * </p>
     * 
     * @return An object that represents the specification of a gRPC gateway route.
     */

    public GrpcGatewayRoute getGrpcRoute() {
        return this.grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC gateway route.
     * </p>
     * 
     * @param grpcRoute
     *        An object that represents the specification of a gRPC gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteSpec withGrpcRoute(GrpcGatewayRoute grpcRoute) {
        setGrpcRoute(grpcRoute);
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 gateway route.
     * </p>
     * 
     * @param http2Route
     *        An object that represents the specification of an HTTP/2 gateway route.
     */

    public void setHttp2Route(HttpGatewayRoute http2Route) {
        this.http2Route = http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 gateway route.
     * </p>
     * 
     * @return An object that represents the specification of an HTTP/2 gateway route.
     */

    public HttpGatewayRoute getHttp2Route() {
        return this.http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 gateway route.
     * </p>
     * 
     * @param http2Route
     *        An object that represents the specification of an HTTP/2 gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteSpec withHttp2Route(HttpGatewayRoute http2Route) {
        setHttp2Route(http2Route);
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP gateway route.
     * </p>
     * 
     * @param httpRoute
     *        An object that represents the specification of an HTTP gateway route.
     */

    public void setHttpRoute(HttpGatewayRoute httpRoute) {
        this.httpRoute = httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP gateway route.
     * </p>
     * 
     * @return An object that represents the specification of an HTTP gateway route.
     */

    public HttpGatewayRoute getHttpRoute() {
        return this.httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP gateway route.
     * </p>
     * 
     * @param httpRoute
     *        An object that represents the specification of an HTTP gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteSpec withHttpRoute(HttpGatewayRoute httpRoute) {
        setHttpRoute(httpRoute);
        return this;
    }

    /**
     * <p>
     * The ordering of the gateway routes spec.
     * </p>
     * 
     * @param priority
     *        The ordering of the gateway routes spec.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The ordering of the gateway routes spec.
     * </p>
     * 
     * @return The ordering of the gateway routes spec.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The ordering of the gateway routes spec.
     * </p>
     * 
     * @param priority
     *        The ordering of the gateway routes spec.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteSpec withPriority(Integer priority) {
        setPriority(priority);
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
        if (getGrpcRoute() != null)
            sb.append("GrpcRoute: ").append(getGrpcRoute()).append(",");
        if (getHttp2Route() != null)
            sb.append("Http2Route: ").append(getHttp2Route()).append(",");
        if (getHttpRoute() != null)
            sb.append("HttpRoute: ").append(getHttpRoute()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayRouteSpec == false)
            return false;
        GatewayRouteSpec other = (GatewayRouteSpec) obj;
        if (other.getGrpcRoute() == null ^ this.getGrpcRoute() == null)
            return false;
        if (other.getGrpcRoute() != null && other.getGrpcRoute().equals(this.getGrpcRoute()) == false)
            return false;
        if (other.getHttp2Route() == null ^ this.getHttp2Route() == null)
            return false;
        if (other.getHttp2Route() != null && other.getHttp2Route().equals(this.getHttp2Route()) == false)
            return false;
        if (other.getHttpRoute() == null ^ this.getHttpRoute() == null)
            return false;
        if (other.getHttpRoute() != null && other.getHttpRoute().equals(this.getHttpRoute()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrpcRoute() == null) ? 0 : getGrpcRoute().hashCode());
        hashCode = prime * hashCode + ((getHttp2Route() == null) ? 0 : getHttp2Route().hashCode());
        hashCode = prime * hashCode + ((getHttpRoute() == null) ? 0 : getHttpRoute().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public GatewayRouteSpec clone() {
        try {
            return (GatewayRouteSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GatewayRouteSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
