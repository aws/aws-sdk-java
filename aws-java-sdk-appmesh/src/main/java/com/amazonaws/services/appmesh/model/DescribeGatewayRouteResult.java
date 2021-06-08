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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your gateway route.
     * </p>
     */
    private GatewayRouteData gatewayRoute;

    /**
     * <p>
     * The full description of your gateway route.
     * </p>
     * 
     * @param gatewayRoute
     *        The full description of your gateway route.
     */

    public void setGatewayRoute(GatewayRouteData gatewayRoute) {
        this.gatewayRoute = gatewayRoute;
    }

    /**
     * <p>
     * The full description of your gateway route.
     * </p>
     * 
     * @return The full description of your gateway route.
     */

    public GatewayRouteData getGatewayRoute() {
        return this.gatewayRoute;
    }

    /**
     * <p>
     * The full description of your gateway route.
     * </p>
     * 
     * @param gatewayRoute
     *        The full description of your gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayRouteResult withGatewayRoute(GatewayRouteData gatewayRoute) {
        setGatewayRoute(gatewayRoute);
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
        if (getGatewayRoute() != null)
            sb.append("GatewayRoute: ").append(getGatewayRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayRouteResult == false)
            return false;
        DescribeGatewayRouteResult other = (DescribeGatewayRouteResult) obj;
        if (other.getGatewayRoute() == null ^ this.getGatewayRoute() == null)
            return false;
        if (other.getGatewayRoute() != null && other.getGatewayRoute().equals(this.getGatewayRoute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayRoute() == null) ? 0 : getGatewayRoute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGatewayRouteResult clone() {
        try {
            return (DescribeGatewayRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
