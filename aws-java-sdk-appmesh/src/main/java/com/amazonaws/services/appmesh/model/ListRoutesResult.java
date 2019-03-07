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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual router.
     * </p>
     */
    private java.util.List<RouteRef> routes;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results
     *        of a <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results
     *         of a <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *         next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListRoutes</code> request. When the results
     *        of a <code>ListRoutes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual router.
     * </p>
     * 
     * @return The list of existing routes for the specified service mesh and virtual router.
     */

    public java.util.List<RouteRef> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual router.
     * </p>
     * 
     * @param routes
     *        The list of existing routes for the specified service mesh and virtual router.
     */

    public void setRoutes(java.util.Collection<RouteRef> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<RouteRef>(routes);
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual router.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The list of existing routes for the specified service mesh and virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutesResult withRoutes(RouteRef... routes) {
        if (this.routes == null) {
            setRoutes(new java.util.ArrayList<RouteRef>(routes.length));
        }
        for (RouteRef ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual router.
     * </p>
     * 
     * @param routes
     *        The list of existing routes for the specified service mesh and virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutesResult withRoutes(java.util.Collection<RouteRef> routes) {
        setRoutes(routes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutesResult == false)
            return false;
        ListRoutesResult other = (ListRoutesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        return hashCode;
    }

    @Override
    public ListRoutesResult clone() {
        try {
            return (ListRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
