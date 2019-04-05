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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataflowGraphResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     */
    private java.util.List<CodeGenNode> dagNodes;
    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     */
    private java.util.List<CodeGenEdge> dagEdges;

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * 
     * @return A list of the nodes in the resulting DAG.
     */

    public java.util.List<CodeGenNode> getDagNodes() {
        return dagNodes;
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * 
     * @param dagNodes
     *        A list of the nodes in the resulting DAG.
     */

    public void setDagNodes(java.util.Collection<CodeGenNode> dagNodes) {
        if (dagNodes == null) {
            this.dagNodes = null;
            return;
        }

        this.dagNodes = new java.util.ArrayList<CodeGenNode>(dagNodes);
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDagNodes(java.util.Collection)} or {@link #withDagNodes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dagNodes
     *        A list of the nodes in the resulting DAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowGraphResult withDagNodes(CodeGenNode... dagNodes) {
        if (this.dagNodes == null) {
            setDagNodes(new java.util.ArrayList<CodeGenNode>(dagNodes.length));
        }
        for (CodeGenNode ele : dagNodes) {
            this.dagNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * 
     * @param dagNodes
     *        A list of the nodes in the resulting DAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowGraphResult withDagNodes(java.util.Collection<CodeGenNode> dagNodes) {
        setDagNodes(dagNodes);
        return this;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * 
     * @return A list of the edges in the resulting DAG.
     */

    public java.util.List<CodeGenEdge> getDagEdges() {
        return dagEdges;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * 
     * @param dagEdges
     *        A list of the edges in the resulting DAG.
     */

    public void setDagEdges(java.util.Collection<CodeGenEdge> dagEdges) {
        if (dagEdges == null) {
            this.dagEdges = null;
            return;
        }

        this.dagEdges = new java.util.ArrayList<CodeGenEdge>(dagEdges);
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDagEdges(java.util.Collection)} or {@link #withDagEdges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dagEdges
     *        A list of the edges in the resulting DAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowGraphResult withDagEdges(CodeGenEdge... dagEdges) {
        if (this.dagEdges == null) {
            setDagEdges(new java.util.ArrayList<CodeGenEdge>(dagEdges.length));
        }
        for (CodeGenEdge ele : dagEdges) {
            this.dagEdges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * 
     * @param dagEdges
     *        A list of the edges in the resulting DAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowGraphResult withDagEdges(java.util.Collection<CodeGenEdge> dagEdges) {
        setDagEdges(dagEdges);
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
        if (getDagNodes() != null)
            sb.append("DagNodes: ").append(getDagNodes()).append(",");
        if (getDagEdges() != null)
            sb.append("DagEdges: ").append(getDagEdges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataflowGraphResult == false)
            return false;
        GetDataflowGraphResult other = (GetDataflowGraphResult) obj;
        if (other.getDagNodes() == null ^ this.getDagNodes() == null)
            return false;
        if (other.getDagNodes() != null && other.getDagNodes().equals(this.getDagNodes()) == false)
            return false;
        if (other.getDagEdges() == null ^ this.getDagEdges() == null)
            return false;
        if (other.getDagEdges() != null && other.getDagEdges().equals(this.getDagEdges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDagNodes() == null) ? 0 : getDagNodes().hashCode());
        hashCode = prime * hashCode + ((getDagEdges() == null) ? 0 : getDagEdges().hashCode());
        return hashCode;
    }

    @Override
    public GetDataflowGraphResult clone() {
        try {
            return (GetDataflowGraphResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
