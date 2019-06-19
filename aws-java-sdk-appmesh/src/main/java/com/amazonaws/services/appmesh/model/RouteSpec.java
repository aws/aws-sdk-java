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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the specification of a route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/RouteSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP routing information for the route.
     * </p>
     */
    private HttpRoute httpRoute;
    /**
     * <p>
     * The TCP routing information for the route.
     * </p>
     */
    private TcpRoute tcpRoute;

    /**
     * <p>
     * The HTTP routing information for the route.
     * </p>
     * 
     * @param httpRoute
     *        The HTTP routing information for the route.
     */

    public void setHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
    }

    /**
     * <p>
     * The HTTP routing information for the route.
     * </p>
     * 
     * @return The HTTP routing information for the route.
     */

    public HttpRoute getHttpRoute() {
        return this.httpRoute;
    }

    /**
     * <p>
     * The HTTP routing information for the route.
     * </p>
     * 
     * @param httpRoute
     *        The HTTP routing information for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSpec withHttpRoute(HttpRoute httpRoute) {
        setHttpRoute(httpRoute);
        return this;
    }

    /**
     * <p>
     * The TCP routing information for the route.
     * </p>
     * 
     * @param tcpRoute
     *        The TCP routing information for the route.
     */

    public void setTcpRoute(TcpRoute tcpRoute) {
        this.tcpRoute = tcpRoute;
    }

    /**
     * <p>
     * The TCP routing information for the route.
     * </p>
     * 
     * @return The TCP routing information for the route.
     */

    public TcpRoute getTcpRoute() {
        return this.tcpRoute;
    }

    /**
     * <p>
     * The TCP routing information for the route.
     * </p>
     * 
     * @param tcpRoute
     *        The TCP routing information for the route.
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
        if (getHttpRoute() != null)
            sb.append("HttpRoute: ").append(getHttpRoute()).append(",");
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
        if (other.getHttpRoute() == null ^ this.getHttpRoute() == null)
            return false;
        if (other.getHttpRoute() != null && other.getHttpRoute().equals(this.getHttpRoute()) == false)
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

        hashCode = prime * hashCode + ((getHttpRoute() == null) ? 0 : getHttpRoute().hashCode());
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
