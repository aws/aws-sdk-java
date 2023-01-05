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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/QueryLineage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryLineageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of vertices connected to the start entity(ies) in the lineage graph.
     * </p>
     */
    private java.util.List<Vertex> vertices;
    /**
     * <p>
     * A list of edges that connect vertices in the response.
     * </p>
     */
    private java.util.List<Edge> edges;
    /**
     * <p>
     * Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of vertices connected to the start entity(ies) in the lineage graph.
     * </p>
     * 
     * @return A list of vertices connected to the start entity(ies) in the lineage graph.
     */

    public java.util.List<Vertex> getVertices() {
        return vertices;
    }

    /**
     * <p>
     * A list of vertices connected to the start entity(ies) in the lineage graph.
     * </p>
     * 
     * @param vertices
     *        A list of vertices connected to the start entity(ies) in the lineage graph.
     */

    public void setVertices(java.util.Collection<Vertex> vertices) {
        if (vertices == null) {
            this.vertices = null;
            return;
        }

        this.vertices = new java.util.ArrayList<Vertex>(vertices);
    }

    /**
     * <p>
     * A list of vertices connected to the start entity(ies) in the lineage graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVertices(java.util.Collection)} or {@link #withVertices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vertices
     *        A list of vertices connected to the start entity(ies) in the lineage graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageResult withVertices(Vertex... vertices) {
        if (this.vertices == null) {
            setVertices(new java.util.ArrayList<Vertex>(vertices.length));
        }
        for (Vertex ele : vertices) {
            this.vertices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of vertices connected to the start entity(ies) in the lineage graph.
     * </p>
     * 
     * @param vertices
     *        A list of vertices connected to the start entity(ies) in the lineage graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageResult withVertices(java.util.Collection<Vertex> vertices) {
        setVertices(vertices);
        return this;
    }

    /**
     * <p>
     * A list of edges that connect vertices in the response.
     * </p>
     * 
     * @return A list of edges that connect vertices in the response.
     */

    public java.util.List<Edge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * A list of edges that connect vertices in the response.
     * </p>
     * 
     * @param edges
     *        A list of edges that connect vertices in the response.
     */

    public void setEdges(java.util.Collection<Edge> edges) {
        if (edges == null) {
            this.edges = null;
            return;
        }

        this.edges = new java.util.ArrayList<Edge>(edges);
    }

    /**
     * <p>
     * A list of edges that connect vertices in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdges(java.util.Collection)} or {@link #withEdges(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param edges
     *        A list of edges that connect vertices in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageResult withEdges(Edge... edges) {
        if (this.edges == null) {
            setEdges(new java.util.ArrayList<Edge>(edges.length));
        }
        for (Edge ele : edges) {
            this.edges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of edges that connect vertices in the response.
     * </p>
     * 
     * @param edges
     *        A list of edges that connect vertices in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageResult withEdges(java.util.Collection<Edge> edges) {
        setEdges(edges);
        return this;
    }

    /**
     * <p>
     * Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @return Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to
     *         retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Limits the number of vertices in the response. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageResult withNextToken(String nextToken) {
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
        if (getVertices() != null)
            sb.append("Vertices: ").append(getVertices()).append(",");
        if (getEdges() != null)
            sb.append("Edges: ").append(getEdges()).append(",");
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

        if (obj instanceof QueryLineageResult == false)
            return false;
        QueryLineageResult other = (QueryLineageResult) obj;
        if (other.getVertices() == null ^ this.getVertices() == null)
            return false;
        if (other.getVertices() != null && other.getVertices().equals(this.getVertices()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
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

        hashCode = prime * hashCode + ((getVertices() == null) ? 0 : getVertices().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QueryLineageResult clone() {
        try {
            return (QueryLineageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
