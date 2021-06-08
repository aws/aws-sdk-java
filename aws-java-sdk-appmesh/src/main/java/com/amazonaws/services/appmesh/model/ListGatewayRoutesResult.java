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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListGatewayRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewayRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of existing gateway routes for the specified service mesh and virtual gateway.
     * </p>
     */
    private java.util.List<GatewayRouteRef> gatewayRoutes;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the results
     * of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of existing gateway routes for the specified service mesh and virtual gateway.
     * </p>
     * 
     * @return The list of existing gateway routes for the specified service mesh and virtual gateway.
     */

    public java.util.List<GatewayRouteRef> getGatewayRoutes() {
        return gatewayRoutes;
    }

    /**
     * <p>
     * The list of existing gateway routes for the specified service mesh and virtual gateway.
     * </p>
     * 
     * @param gatewayRoutes
     *        The list of existing gateway routes for the specified service mesh and virtual gateway.
     */

    public void setGatewayRoutes(java.util.Collection<GatewayRouteRef> gatewayRoutes) {
        if (gatewayRoutes == null) {
            this.gatewayRoutes = null;
            return;
        }

        this.gatewayRoutes = new java.util.ArrayList<GatewayRouteRef>(gatewayRoutes);
    }

    /**
     * <p>
     * The list of existing gateway routes for the specified service mesh and virtual gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayRoutes(java.util.Collection)} or {@link #withGatewayRoutes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gatewayRoutes
     *        The list of existing gateway routes for the specified service mesh and virtual gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesResult withGatewayRoutes(GatewayRouteRef... gatewayRoutes) {
        if (this.gatewayRoutes == null) {
            setGatewayRoutes(new java.util.ArrayList<GatewayRouteRef>(gatewayRoutes.length));
        }
        for (GatewayRouteRef ele : gatewayRoutes) {
            this.gatewayRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing gateway routes for the specified service mesh and virtual gateway.
     * </p>
     * 
     * @param gatewayRoutes
     *        The list of existing gateway routes for the specified service mesh and virtual gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesResult withGatewayRoutes(java.util.Collection<GatewayRouteRef> gatewayRoutes) {
        setGatewayRoutes(gatewayRoutes);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the results
     * of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the
     *        results of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the results
     * of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the
     *         results of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the results
     * of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListGatewayRoutes</code> request. When the
     *        results of a <code>ListGatewayRoutes</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getGatewayRoutes() != null)
            sb.append("GatewayRoutes: ").append(getGatewayRoutes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewayRoutesResult == false)
            return false;
        ListGatewayRoutesResult other = (ListGatewayRoutesResult) obj;
        if (other.getGatewayRoutes() == null ^ this.getGatewayRoutes() == null)
            return false;
        if (other.getGatewayRoutes() != null && other.getGatewayRoutes().equals(this.getGatewayRoutes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayRoutes() == null) ? 0 : getGatewayRoutes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewayRoutesResult clone() {
        try {
            return (ListGatewayRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
