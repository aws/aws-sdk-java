/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow graph represents the complete workflow containing all the AWS Glue components present in the workflow and
 * all the directed connections between them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/WorkflowGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowGraph implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented as nodes.
     * </p>
     */
    private java.util.List<Node> nodes;
    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the workflow.
     * </p>
     */
    private java.util.List<Edge> edges;

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented as nodes.
     * </p>
     * 
     * @return A list of the the AWS Glue components belong to the workflow represented as nodes.
     */

    public java.util.List<Node> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented as nodes.
     * </p>
     * 
     * @param nodes
     *        A list of the the AWS Glue components belong to the workflow represented as nodes.
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
     * A list of the the AWS Glue components belong to the workflow represented as nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        A list of the the AWS Glue components belong to the workflow represented as nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowGraph withNodes(Node... nodes) {
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
     * A list of the the AWS Glue components belong to the workflow represented as nodes.
     * </p>
     * 
     * @param nodes
     *        A list of the the AWS Glue components belong to the workflow represented as nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowGraph withNodes(java.util.Collection<Node> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the workflow.
     * </p>
     * 
     * @return A list of all the directed connections between the nodes belonging to the workflow.
     */

    public java.util.List<Edge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the workflow.
     * </p>
     * 
     * @param edges
     *        A list of all the directed connections between the nodes belonging to the workflow.
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
     * A list of all the directed connections between the nodes belonging to the workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdges(java.util.Collection)} or {@link #withEdges(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param edges
     *        A list of all the directed connections between the nodes belonging to the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowGraph withEdges(Edge... edges) {
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
     * A list of all the directed connections between the nodes belonging to the workflow.
     * </p>
     * 
     * @param edges
     *        A list of all the directed connections between the nodes belonging to the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowGraph withEdges(java.util.Collection<Edge> edges) {
        setEdges(edges);
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
        if (getEdges() != null)
            sb.append("Edges: ").append(getEdges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowGraph == false)
            return false;
        WorkflowGraph other = (WorkflowGraph) obj;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowGraph clone() {
        try {
            return (WorkflowGraph) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.WorkflowGraphMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
