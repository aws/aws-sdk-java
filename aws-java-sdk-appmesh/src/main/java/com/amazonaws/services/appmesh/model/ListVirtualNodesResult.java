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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the results
     * of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of existing virtual nodes for the specified service mesh.
     * </p>
     */
    private java.util.List<VirtualNodeRef> virtualNodes;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the results
     * of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the
     *        results of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the results
     * of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the
     *         results of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the results
     * of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListVirtualNodes</code> request. When the
     *        results of a <code>ListVirtualNodes</code> request exceed <code>limit</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of existing virtual nodes for the specified service mesh.
     * </p>
     * 
     * @return The list of existing virtual nodes for the specified service mesh.
     */

    public java.util.List<VirtualNodeRef> getVirtualNodes() {
        return virtualNodes;
    }

    /**
     * <p>
     * The list of existing virtual nodes for the specified service mesh.
     * </p>
     * 
     * @param virtualNodes
     *        The list of existing virtual nodes for the specified service mesh.
     */

    public void setVirtualNodes(java.util.Collection<VirtualNodeRef> virtualNodes) {
        if (virtualNodes == null) {
            this.virtualNodes = null;
            return;
        }

        this.virtualNodes = new java.util.ArrayList<VirtualNodeRef>(virtualNodes);
    }

    /**
     * <p>
     * The list of existing virtual nodes for the specified service mesh.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualNodes(java.util.Collection)} or {@link #withVirtualNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param virtualNodes
     *        The list of existing virtual nodes for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesResult withVirtualNodes(VirtualNodeRef... virtualNodes) {
        if (this.virtualNodes == null) {
            setVirtualNodes(new java.util.ArrayList<VirtualNodeRef>(virtualNodes.length));
        }
        for (VirtualNodeRef ele : virtualNodes) {
            this.virtualNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing virtual nodes for the specified service mesh.
     * </p>
     * 
     * @param virtualNodes
     *        The list of existing virtual nodes for the specified service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesResult withVirtualNodes(java.util.Collection<VirtualNodeRef> virtualNodes) {
        setVirtualNodes(virtualNodes);
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
        if (getVirtualNodes() != null)
            sb.append("VirtualNodes: ").append(getVirtualNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualNodesResult == false)
            return false;
        ListVirtualNodesResult other = (ListVirtualNodesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualNodes() == null ^ this.getVirtualNodes() == null)
            return false;
        if (other.getVirtualNodes() != null && other.getVirtualNodes().equals(this.getVirtualNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualNodes() == null) ? 0 : getVirtualNodes().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualNodesResult clone() {
        try {
            return (ListVirtualNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
