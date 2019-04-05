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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualRouters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualRoutersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the results
     * of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of existing virtual routers for the specified service mesh.
     * </p>
     */
    private java.util.List<VirtualRouterRef> virtualRouters;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the results
     * of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the
     *        results of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the results
     * of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the
     *         results of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the results
     * of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualRouters</code> request. When the
     *        results of a <code>ListVirtualRouters</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualRoutersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of existing virtual routers for the specified service mesh.
     * </p>
     * 
     * @return The list of existing virtual routers for the specified service mesh.
     */

    public java.util.List<VirtualRouterRef> getVirtualRouters() {
        return virtualRouters;
    }

    /**
     * <p>
     * The list of existing virtual routers for the specified service mesh.
     * </p>
     * 
     * @param virtualRouters
     *        The list of existing virtual routers for the specified service mesh.
     */

    public void setVirtualRouters(java.util.Collection<VirtualRouterRef> virtualRouters) {
        if (virtualRouters == null) {
            this.virtualRouters = null;
            return;
        }

        this.virtualRouters = new java.util.ArrayList<VirtualRouterRef>(virtualRouters);
    }

    /**
     * <p>
     * The list of existing virtual routers for the specified service mesh.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualRouters(java.util.Collection)} or {@link #withVirtualRouters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param virtualRouters
     *        The list of existing virtual routers for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualRoutersResult withVirtualRouters(VirtualRouterRef... virtualRouters) {
        if (this.virtualRouters == null) {
            setVirtualRouters(new java.util.ArrayList<VirtualRouterRef>(virtualRouters.length));
        }
        for (VirtualRouterRef ele : virtualRouters) {
            this.virtualRouters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing virtual routers for the specified service mesh.
     * </p>
     * 
     * @param virtualRouters
     *        The list of existing virtual routers for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualRoutersResult withVirtualRouters(java.util.Collection<VirtualRouterRef> virtualRouters) {
        setVirtualRouters(virtualRouters);
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
        if (getVirtualRouters() != null)
            sb.append("VirtualRouters: ").append(getVirtualRouters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualRoutersResult == false)
            return false;
        ListVirtualRoutersResult other = (ListVirtualRoutersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualRouters() == null ^ this.getVirtualRouters() == null)
            return false;
        if (other.getVirtualRouters() != null && other.getVirtualRouters().equals(this.getVirtualRouters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualRouters() == null) ? 0 : getVirtualRouters().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualRoutersResult clone() {
        try {
            return (ListVirtualRoutersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
