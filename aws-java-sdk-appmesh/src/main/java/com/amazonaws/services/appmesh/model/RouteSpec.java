/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that represents a route specification. Specify one route type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/RouteSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     */
    private GrpcRoute grpcRoute;
    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     */
    private HttpRoute http2Route;
    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     */
    private HttpRoute httpRoute;
    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     */
    private TcpRoute tcpRoute;

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     * 
     * @param grpcRoute
     *        An object that represents the specification of a gRPC route.
     */

    public void setGrpcRoute(GrpcRoute grpcRoute) {
        this.grpcRoute = grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     * 
     * @return An object that represents the specification of a gRPC route.
     */

    public GrpcRoute getGrpcRoute() {
        return this.grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     * 
     * @param grpcRoute
     *        An object that represents the specification of a gRPC route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withGrpcRoute(GrpcRoute grpcRoute) {
        setGrpcRoute(grpcRoute);
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     * 
     * @param http2Route
     *        An object that represents the specification of an HTTP/2 route.
     */

    public void setHttp2Route(HttpRoute http2Route) {
        this.http2Route = http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     * 
     * @return An object that represents the specification of an HTTP/2 route.
     */

    public HttpRoute getHttp2Route() {
        return this.http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     * 
     * @param http2Route
     *        An object that represents the specification of an HTTP/2 route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withHttp2Route(HttpRoute http2Route) {
        setHttp2Route(http2Route);
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     * 
     * @param httpRoute
     *        An object that represents the specification of an HTTP route.
     */

    public void setHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     * 
     * @return An object that represents the specification of an HTTP route.
     */

    public HttpRoute getHttpRoute() {
        return this.httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     * 
     * @param httpRoute
     *        An object that represents the specification of an HTTP route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withHttpRoute(HttpRoute httpRoute) {
        setHttpRoute(httpRoute);
        return this;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
     * </p>
     * 
     * @param priority
     *        The priority for the route. Routes are matched based on the specified value, where 0 is the highest
     *        priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
     * </p>
     * 
     * @return The priority for the route. Routes are matched based on the specified value, where 0 is the highest
     *         priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified value, where 0 is the highest priority.
     * </p>
     * 
     * @param priority
     *        The priority for the route. Routes are matched based on the specified value, where 0 is the highest
     *        priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     * 
     * @param tcpRoute
     *        An object that represents the specification of a TCP route.
     */

    public void setTcpRoute(TcpRoute tcpRoute) {
        this.tcpRoute = tcpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     * 
     * @return An object that represents the specification of a TCP route.
     */

    public TcpRoute getTcpRoute() {
        return this.tcpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     * 
     * @param tcpRoute
     *        An object that represents the specification of a TCP route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withTcpRoute(TcpRoute tcpRoute) {
        setTcpRoute(tcpRoute);
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
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getTcpRoute() != null)
            sb.append("TcpRoute: ").append(getTcpRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteSpec == false)
            return false;
        RouteSpec other = (RouteSpec) obj;
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
        if (other.getTcpRoute() == null ^ this.getTcpRoute() == null)
            return false;
        if (other.getTcpRoute() != null && other.getTcpRoute().equals(this.getTcpRoute()) == false)
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
        hashCode = prime * hashCode + ((getTcpRoute() == null) ? 0 : getTcpRoute().hashCode());
        return hashCode;
    }

    @Override
    public RouteSpec clone() {
        try {
            return (RouteSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.RouteSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
