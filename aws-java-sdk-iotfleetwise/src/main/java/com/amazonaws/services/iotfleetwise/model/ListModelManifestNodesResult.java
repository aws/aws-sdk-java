/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifestNodes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelManifestNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of information about nodes.
     * </p>
     */
    private java.util.List<Node> nodes;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of information about nodes.
     * </p>
     * 
     * @return A list of information about nodes.
     */

    public java.util.List<Node> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list of information about nodes.
     * </p>
     * 
     * @param nodes
     *        A list of information about nodes.
     */

    public void setNodes(java.util.Collection<Node> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<Node>(nodes);
    }

    /**
     * <p>
     * A list of information about nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        A list of information about nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelManifestNodesResult withNodes(Node... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<Node>(nodes.length));
        }
        for (Node ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about nodes.
     * </p>
     * 
     * @param nodes
     *        A list of information about nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelManifestNodesResult withNodes(java.util.Collection<Node> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelManifestNodesResult withNextToken(String nextToken) {
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
        if (getNodes() != null)
            sb.append("Nodes: ").append(getNodes()).append(",");
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

        if (obj instanceof ListModelManifestNodesResult == false)
            return false;
        ListModelManifestNodesResult other = (ListModelManifestNodesResult) obj;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
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

        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelManifestNodesResult clone() {
        try {
            return (ListModelManifestNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
