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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     * results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of existing virtual gateways for the specified service mesh.
     * </p>
     */
    private java.util.List<VirtualGatewayRef> virtualGateways;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     * results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     *        results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     * results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When
     *         the results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this
     *         value to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     * results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualGateways</code> request. When the
     *        results of a <code>ListVirtualGateways</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualGatewaysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of existing virtual gateways for the specified service mesh.
     * </p>
     * 
     * @return The list of existing virtual gateways for the specified service mesh.
     */

    public java.util.List<VirtualGatewayRef> getVirtualGateways() {
        return virtualGateways;
    }

    /**
     * <p>
     * The list of existing virtual gateways for the specified service mesh.
     * </p>
     * 
     * @param virtualGateways
     *        The list of existing virtual gateways for the specified service mesh.
     */

    public void setVirtualGateways(java.util.Collection<VirtualGatewayRef> virtualGateways) {
        if (virtualGateways == null) {
            this.virtualGateways = null;
            return;
        }

        this.virtualGateways = new java.util.ArrayList<VirtualGatewayRef>(virtualGateways);
    }

    /**
     * <p>
     * The list of existing virtual gateways for the specified service mesh.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualGateways(java.util.Collection)} or {@link #withVirtualGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param virtualGateways
     *        The list of existing virtual gateways for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualGatewaysResult withVirtualGateways(VirtualGatewayRef... virtualGateways) {
        if (this.virtualGateways == null) {
            setVirtualGateways(new java.util.ArrayList<VirtualGatewayRef>(virtualGateways.length));
        }
        for (VirtualGatewayRef ele : virtualGateways) {
            this.virtualGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing virtual gateways for the specified service mesh.
     * </p>
     * 
     * @param virtualGateways
     *        The list of existing virtual gateways for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualGatewaysResult withVirtualGateways(java.util.Collection<VirtualGatewayRef> virtualGateways) {
        setVirtualGateways(virtualGateways);
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
        if (getVirtualGateways() != null)
            sb.append("VirtualGateways: ").append(getVirtualGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualGatewaysResult == false)
            return false;
        ListVirtualGatewaysResult other = (ListVirtualGatewaysResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualGateways() == null ^ this.getVirtualGateways() == null)
            return false;
        if (other.getVirtualGateways() != null && other.getVirtualGateways().equals(this.getVirtualGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualGateways() == null) ? 0 : getVirtualGateways().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualGatewaysResult clone() {
        try {
            return (ListVirtualGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
