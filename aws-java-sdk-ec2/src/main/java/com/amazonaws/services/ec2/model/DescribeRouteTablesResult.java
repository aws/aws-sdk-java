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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeRouteTables.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouteTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteTable> routeTables;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * 
     * @return Information about one or more route tables.
     */

    public java.util.List<RouteTable> getRouteTables() {
        if (routeTables == null) {
            routeTables = new com.amazonaws.internal.SdkInternalList<RouteTable>();
        }
        return routeTables;
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * 
     * @param routeTables
     *        Information about one or more route tables.
     */

    public void setRouteTables(java.util.Collection<RouteTable> routeTables) {
        if (routeTables == null) {
            this.routeTables = null;
            return;
        }

        this.routeTables = new com.amazonaws.internal.SdkInternalList<RouteTable>(routeTables);
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTables(java.util.Collection)} or {@link #withRouteTables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param routeTables
     *        Information about one or more route tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesResult withRouteTables(RouteTable... routeTables) {
        if (this.routeTables == null) {
            setRouteTables(new com.amazonaws.internal.SdkInternalList<RouteTable>(routeTables.length));
        }
        for (RouteTable ele : routeTables) {
            this.routeTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * 
     * @param routeTables
     *        Information about one or more route tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesResult withRouteTables(java.util.Collection<RouteTable> routeTables) {
        setRouteTables(routeTables);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesResult withNextToken(String nextToken) {
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
        if (getRouteTables() != null)
            sb.append("RouteTables: ").append(getRouteTables()).append(",");
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

        if (obj instanceof DescribeRouteTablesResult == false)
            return false;
        DescribeRouteTablesResult other = (DescribeRouteTablesResult) obj;
        if (other.getRouteTables() == null ^ this.getRouteTables() == null)
            return false;
        if (other.getRouteTables() != null && other.getRouteTables().equals(this.getRouteTables()) == false)
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

        hashCode = prime * hashCode + ((getRouteTables() == null) ? 0 : getRouteTables().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouteTablesResult clone() {
        try {
            return (DescribeRouteTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
