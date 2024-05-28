/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The graph summary API returns a read-only list of node and edge labels and property keys, along with counts of nodes,
 * edges, and properties. See <a href=
 * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-pg-response"
 * >Graph summary response for a property graph (PG)</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/PropertygraphSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertygraphSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of nodes in the graph.
     * </p>
     */
    private Long numNodes;
    /**
     * <p>
     * The number of edges in the graph.
     * </p>
     */
    private Long numEdges;
    /**
     * <p>
     * The number of distinct node labels in the graph.
     * </p>
     */
    private Long numNodeLabels;
    /**
     * <p>
     * The number of distinct edge labels in the graph.
     * </p>
     */
    private Long numEdgeLabels;
    /**
     * <p>
     * A list of the distinct node labels in the graph.
     * </p>
     */
    private java.util.List<String> nodeLabels;
    /**
     * <p>
     * A list of the distinct edge labels in the graph.
     * </p>
     */
    private java.util.List<String> edgeLabels;
    /**
     * <p>
     * A list of the distinct node properties in the graph, along with the count of nodes where each property is used.
     * </p>
     */
    private Long numNodeProperties;
    /**
     * <p>
     * The number of distinct edge properties in the graph.
     * </p>
     */
    private Long numEdgeProperties;
    /**
     * <p>
     * The number of distinct node properties in the graph.
     * </p>
     */
    private java.util.List<java.util.Map<String, Long>> nodeProperties;
    /**
     * <p>
     * A list of the distinct edge properties in the graph, along with the count of edges where each property is used.
     * </p>
     */
    private java.util.List<java.util.Map<String, Long>> edgeProperties;
    /**
     * <p>
     * The total number of usages of all node properties.
     * </p>
     */
    private Long totalNodePropertyValues;
    /**
     * <p>
     * The total number of usages of all edge properties.
     * </p>
     */
    private Long totalEdgePropertyValues;
    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     * structures.
     * </p>
     */
    private java.util.List<NodeStructure> nodeStructures;
    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     * structures.
     * </p>
     */
    private java.util.List<EdgeStructure> edgeStructures;

    /**
     * <p>
     * The number of nodes in the graph.
     * </p>
     * 
     * @param numNodes
     *        The number of nodes in the graph.
     */

    public void setNumNodes(Long numNodes) {
        this.numNodes = numNodes;
    }

    /**
     * <p>
     * The number of nodes in the graph.
     * </p>
     * 
     * @return The number of nodes in the graph.
     */

    public Long getNumNodes() {
        return this.numNodes;
    }

    /**
     * <p>
     * The number of nodes in the graph.
     * </p>
     * 
     * @param numNodes
     *        The number of nodes in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumNodes(Long numNodes) {
        setNumNodes(numNodes);
        return this;
    }

    /**
     * <p>
     * The number of edges in the graph.
     * </p>
     * 
     * @param numEdges
     *        The number of edges in the graph.
     */

    public void setNumEdges(Long numEdges) {
        this.numEdges = numEdges;
    }

    /**
     * <p>
     * The number of edges in the graph.
     * </p>
     * 
     * @return The number of edges in the graph.
     */

    public Long getNumEdges() {
        return this.numEdges;
    }

    /**
     * <p>
     * The number of edges in the graph.
     * </p>
     * 
     * @param numEdges
     *        The number of edges in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumEdges(Long numEdges) {
        setNumEdges(numEdges);
        return this;
    }

    /**
     * <p>
     * The number of distinct node labels in the graph.
     * </p>
     * 
     * @param numNodeLabels
     *        The number of distinct node labels in the graph.
     */

    public void setNumNodeLabels(Long numNodeLabels) {
        this.numNodeLabels = numNodeLabels;
    }

    /**
     * <p>
     * The number of distinct node labels in the graph.
     * </p>
     * 
     * @return The number of distinct node labels in the graph.
     */

    public Long getNumNodeLabels() {
        return this.numNodeLabels;
    }

    /**
     * <p>
     * The number of distinct node labels in the graph.
     * </p>
     * 
     * @param numNodeLabels
     *        The number of distinct node labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumNodeLabels(Long numNodeLabels) {
        setNumNodeLabels(numNodeLabels);
        return this;
    }

    /**
     * <p>
     * The number of distinct edge labels in the graph.
     * </p>
     * 
     * @param numEdgeLabels
     *        The number of distinct edge labels in the graph.
     */

    public void setNumEdgeLabels(Long numEdgeLabels) {
        this.numEdgeLabels = numEdgeLabels;
    }

    /**
     * <p>
     * The number of distinct edge labels in the graph.
     * </p>
     * 
     * @return The number of distinct edge labels in the graph.
     */

    public Long getNumEdgeLabels() {
        return this.numEdgeLabels;
    }

    /**
     * <p>
     * The number of distinct edge labels in the graph.
     * </p>
     * 
     * @param numEdgeLabels
     *        The number of distinct edge labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumEdgeLabels(Long numEdgeLabels) {
        setNumEdgeLabels(numEdgeLabels);
        return this;
    }

    /**
     * <p>
     * A list of the distinct node labels in the graph.
     * </p>
     * 
     * @return A list of the distinct node labels in the graph.
     */

    public java.util.List<String> getNodeLabels() {
        return nodeLabels;
    }

    /**
     * <p>
     * A list of the distinct node labels in the graph.
     * </p>
     * 
     * @param nodeLabels
     *        A list of the distinct node labels in the graph.
     */

    public void setNodeLabels(java.util.Collection<String> nodeLabels) {
        if (nodeLabels == null) {
            this.nodeLabels = null;
            return;
        }

        this.nodeLabels = new java.util.ArrayList<String>(nodeLabels);
    }

    /**
     * <p>
     * A list of the distinct node labels in the graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeLabels(java.util.Collection)} or {@link #withNodeLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodeLabels
     *        A list of the distinct node labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeLabels(String... nodeLabels) {
        if (this.nodeLabels == null) {
            setNodeLabels(new java.util.ArrayList<String>(nodeLabels.length));
        }
        for (String ele : nodeLabels) {
            this.nodeLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the distinct node labels in the graph.
     * </p>
     * 
     * @param nodeLabels
     *        A list of the distinct node labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeLabels(java.util.Collection<String> nodeLabels) {
        setNodeLabels(nodeLabels);
        return this;
    }

    /**
     * <p>
     * A list of the distinct edge labels in the graph.
     * </p>
     * 
     * @return A list of the distinct edge labels in the graph.
     */

    public java.util.List<String> getEdgeLabels() {
        return edgeLabels;
    }

    /**
     * <p>
     * A list of the distinct edge labels in the graph.
     * </p>
     * 
     * @param edgeLabels
     *        A list of the distinct edge labels in the graph.
     */

    public void setEdgeLabels(java.util.Collection<String> edgeLabels) {
        if (edgeLabels == null) {
            this.edgeLabels = null;
            return;
        }

        this.edgeLabels = new java.util.ArrayList<String>(edgeLabels);
    }

    /**
     * <p>
     * A list of the distinct edge labels in the graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeLabels(java.util.Collection)} or {@link #withEdgeLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param edgeLabels
     *        A list of the distinct edge labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeLabels(String... edgeLabels) {
        if (this.edgeLabels == null) {
            setEdgeLabels(new java.util.ArrayList<String>(edgeLabels.length));
        }
        for (String ele : edgeLabels) {
            this.edgeLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the distinct edge labels in the graph.
     * </p>
     * 
     * @param edgeLabels
     *        A list of the distinct edge labels in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeLabels(java.util.Collection<String> edgeLabels) {
        setEdgeLabels(edgeLabels);
        return this;
    }

    /**
     * <p>
     * A list of the distinct node properties in the graph, along with the count of nodes where each property is used.
     * </p>
     * 
     * @param numNodeProperties
     *        A list of the distinct node properties in the graph, along with the count of nodes where each property is
     *        used.
     */

    public void setNumNodeProperties(Long numNodeProperties) {
        this.numNodeProperties = numNodeProperties;
    }

    /**
     * <p>
     * A list of the distinct node properties in the graph, along with the count of nodes where each property is used.
     * </p>
     * 
     * @return A list of the distinct node properties in the graph, along with the count of nodes where each property is
     *         used.
     */

    public Long getNumNodeProperties() {
        return this.numNodeProperties;
    }

    /**
     * <p>
     * A list of the distinct node properties in the graph, along with the count of nodes where each property is used.
     * </p>
     * 
     * @param numNodeProperties
     *        A list of the distinct node properties in the graph, along with the count of nodes where each property is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumNodeProperties(Long numNodeProperties) {
        setNumNodeProperties(numNodeProperties);
        return this;
    }

    /**
     * <p>
     * The number of distinct edge properties in the graph.
     * </p>
     * 
     * @param numEdgeProperties
     *        The number of distinct edge properties in the graph.
     */

    public void setNumEdgeProperties(Long numEdgeProperties) {
        this.numEdgeProperties = numEdgeProperties;
    }

    /**
     * <p>
     * The number of distinct edge properties in the graph.
     * </p>
     * 
     * @return The number of distinct edge properties in the graph.
     */

    public Long getNumEdgeProperties() {
        return this.numEdgeProperties;
    }

    /**
     * <p>
     * The number of distinct edge properties in the graph.
     * </p>
     * 
     * @param numEdgeProperties
     *        The number of distinct edge properties in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNumEdgeProperties(Long numEdgeProperties) {
        setNumEdgeProperties(numEdgeProperties);
        return this;
    }

    /**
     * <p>
     * The number of distinct node properties in the graph.
     * </p>
     * 
     * @return The number of distinct node properties in the graph.
     */

    public java.util.List<java.util.Map<String, Long>> getNodeProperties() {
        return nodeProperties;
    }

    /**
     * <p>
     * The number of distinct node properties in the graph.
     * </p>
     * 
     * @param nodeProperties
     *        The number of distinct node properties in the graph.
     */

    public void setNodeProperties(java.util.Collection<java.util.Map<String, Long>> nodeProperties) {
        if (nodeProperties == null) {
            this.nodeProperties = null;
            return;
        }

        this.nodeProperties = new java.util.ArrayList<java.util.Map<String, Long>>(nodeProperties);
    }

    /**
     * <p>
     * The number of distinct node properties in the graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeProperties(java.util.Collection)} or {@link #withNodeProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodeProperties
     *        The number of distinct node properties in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeProperties(java.util.Map<String, Long>... nodeProperties) {
        if (this.nodeProperties == null) {
            setNodeProperties(new java.util.ArrayList<java.util.Map<String, Long>>(nodeProperties.length));
        }
        for (java.util.Map<String, Long> ele : nodeProperties) {
            this.nodeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of distinct node properties in the graph.
     * </p>
     * 
     * @param nodeProperties
     *        The number of distinct node properties in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeProperties(java.util.Collection<java.util.Map<String, Long>> nodeProperties) {
        setNodeProperties(nodeProperties);
        return this;
    }

    /**
     * <p>
     * A list of the distinct edge properties in the graph, along with the count of edges where each property is used.
     * </p>
     * 
     * @return A list of the distinct edge properties in the graph, along with the count of edges where each property is
     *         used.
     */

    public java.util.List<java.util.Map<String, Long>> getEdgeProperties() {
        return edgeProperties;
    }

    /**
     * <p>
     * A list of the distinct edge properties in the graph, along with the count of edges where each property is used.
     * </p>
     * 
     * @param edgeProperties
     *        A list of the distinct edge properties in the graph, along with the count of edges where each property is
     *        used.
     */

    public void setEdgeProperties(java.util.Collection<java.util.Map<String, Long>> edgeProperties) {
        if (edgeProperties == null) {
            this.edgeProperties = null;
            return;
        }

        this.edgeProperties = new java.util.ArrayList<java.util.Map<String, Long>>(edgeProperties);
    }

    /**
     * <p>
     * A list of the distinct edge properties in the graph, along with the count of edges where each property is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeProperties(java.util.Collection)} or {@link #withEdgeProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param edgeProperties
     *        A list of the distinct edge properties in the graph, along with the count of edges where each property is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeProperties(java.util.Map<String, Long>... edgeProperties) {
        if (this.edgeProperties == null) {
            setEdgeProperties(new java.util.ArrayList<java.util.Map<String, Long>>(edgeProperties.length));
        }
        for (java.util.Map<String, Long> ele : edgeProperties) {
            this.edgeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the distinct edge properties in the graph, along with the count of edges where each property is used.
     * </p>
     * 
     * @param edgeProperties
     *        A list of the distinct edge properties in the graph, along with the count of edges where each property is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeProperties(java.util.Collection<java.util.Map<String, Long>> edgeProperties) {
        setEdgeProperties(edgeProperties);
        return this;
    }

    /**
     * <p>
     * The total number of usages of all node properties.
     * </p>
     * 
     * @param totalNodePropertyValues
     *        The total number of usages of all node properties.
     */

    public void setTotalNodePropertyValues(Long totalNodePropertyValues) {
        this.totalNodePropertyValues = totalNodePropertyValues;
    }

    /**
     * <p>
     * The total number of usages of all node properties.
     * </p>
     * 
     * @return The total number of usages of all node properties.
     */

    public Long getTotalNodePropertyValues() {
        return this.totalNodePropertyValues;
    }

    /**
     * <p>
     * The total number of usages of all node properties.
     * </p>
     * 
     * @param totalNodePropertyValues
     *        The total number of usages of all node properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withTotalNodePropertyValues(Long totalNodePropertyValues) {
        setTotalNodePropertyValues(totalNodePropertyValues);
        return this;
    }

    /**
     * <p>
     * The total number of usages of all edge properties.
     * </p>
     * 
     * @param totalEdgePropertyValues
     *        The total number of usages of all edge properties.
     */

    public void setTotalEdgePropertyValues(Long totalEdgePropertyValues) {
        this.totalEdgePropertyValues = totalEdgePropertyValues;
    }

    /**
     * <p>
     * The total number of usages of all edge properties.
     * </p>
     * 
     * @return The total number of usages of all edge properties.
     */

    public Long getTotalEdgePropertyValues() {
        return this.totalEdgePropertyValues;
    }

    /**
     * <p>
     * The total number of usages of all edge properties.
     * </p>
     * 
     * @param totalEdgePropertyValues
     *        The total number of usages of all edge properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withTotalEdgePropertyValues(Long totalEdgePropertyValues) {
        setTotalEdgePropertyValues(totalEdgePropertyValues);
        return this;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     * structures.
     * </p>
     * 
     * @return This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     *         structures.
     */

    public java.util.List<NodeStructure> getNodeStructures() {
        return nodeStructures;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     * structures.
     * </p>
     * 
     * @param nodeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     *        structures.
     */

    public void setNodeStructures(java.util.Collection<NodeStructure> nodeStructures) {
        if (nodeStructures == null) {
            this.nodeStructures = null;
            return;
        }

        this.nodeStructures = new java.util.ArrayList<NodeStructure>(nodeStructures);
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     * structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeStructures(java.util.Collection)} or {@link #withNodeStructures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeStructures(NodeStructure... nodeStructures) {
        if (this.nodeStructures == null) {
            setNodeStructures(new java.util.ArrayList<NodeStructure>(nodeStructures.length));
        }
        for (NodeStructure ele : nodeStructures) {
            this.nodeStructures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     * structures.
     * </p>
     * 
     * @param nodeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of node
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withNodeStructures(java.util.Collection<NodeStructure> nodeStructures) {
        setNodeStructures(nodeStructures);
        return this;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     * structures.
     * </p>
     * 
     * @return This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     *         structures.
     */

    public java.util.List<EdgeStructure> getEdgeStructures() {
        return edgeStructures;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     * structures.
     * </p>
     * 
     * @param edgeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     *        structures.
     */

    public void setEdgeStructures(java.util.Collection<EdgeStructure> edgeStructures) {
        if (edgeStructures == null) {
            this.edgeStructures = null;
            return;
        }

        this.edgeStructures = new java.util.ArrayList<EdgeStructure>(edgeStructures);
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     * structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeStructures(java.util.Collection)} or {@link #withEdgeStructures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param edgeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeStructures(EdgeStructure... edgeStructures) {
        if (this.edgeStructures == null) {
            setEdgeStructures(new java.util.ArrayList<EdgeStructure>(edgeStructures.length));
        }
        for (EdgeStructure ele : edgeStructures) {
            this.edgeStructures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     * structures.
     * </p>
     * 
     * @param edgeStructures
     *        This field is only present when the requested mode is <code>DETAILED</code>. It contains a list of edge
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertygraphSummary withEdgeStructures(java.util.Collection<EdgeStructure> edgeStructures) {
        setEdgeStructures(edgeStructures);
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
        if (getNumNodes() != null)
            sb.append("NumNodes: ").append(getNumNodes()).append(",");
        if (getNumEdges() != null)
            sb.append("NumEdges: ").append(getNumEdges()).append(",");
        if (getNumNodeLabels() != null)
            sb.append("NumNodeLabels: ").append(getNumNodeLabels()).append(",");
        if (getNumEdgeLabels() != null)
            sb.append("NumEdgeLabels: ").append(getNumEdgeLabels()).append(",");
        if (getNodeLabels() != null)
            sb.append("NodeLabels: ").append(getNodeLabels()).append(",");
        if (getEdgeLabels() != null)
            sb.append("EdgeLabels: ").append(getEdgeLabels()).append(",");
        if (getNumNodeProperties() != null)
            sb.append("NumNodeProperties: ").append(getNumNodeProperties()).append(",");
        if (getNumEdgeProperties() != null)
            sb.append("NumEdgeProperties: ").append(getNumEdgeProperties()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties()).append(",");
        if (getEdgeProperties() != null)
            sb.append("EdgeProperties: ").append(getEdgeProperties()).append(",");
        if (getTotalNodePropertyValues() != null)
            sb.append("TotalNodePropertyValues: ").append(getTotalNodePropertyValues()).append(",");
        if (getTotalEdgePropertyValues() != null)
            sb.append("TotalEdgePropertyValues: ").append(getTotalEdgePropertyValues()).append(",");
        if (getNodeStructures() != null)
            sb.append("NodeStructures: ").append(getNodeStructures()).append(",");
        if (getEdgeStructures() != null)
            sb.append("EdgeStructures: ").append(getEdgeStructures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertygraphSummary == false)
            return false;
        PropertygraphSummary other = (PropertygraphSummary) obj;
        if (other.getNumNodes() == null ^ this.getNumNodes() == null)
            return false;
        if (other.getNumNodes() != null && other.getNumNodes().equals(this.getNumNodes()) == false)
            return false;
        if (other.getNumEdges() == null ^ this.getNumEdges() == null)
            return false;
        if (other.getNumEdges() != null && other.getNumEdges().equals(this.getNumEdges()) == false)
            return false;
        if (other.getNumNodeLabels() == null ^ this.getNumNodeLabels() == null)
            return false;
        if (other.getNumNodeLabels() != null && other.getNumNodeLabels().equals(this.getNumNodeLabels()) == false)
            return false;
        if (other.getNumEdgeLabels() == null ^ this.getNumEdgeLabels() == null)
            return false;
        if (other.getNumEdgeLabels() != null && other.getNumEdgeLabels().equals(this.getNumEdgeLabels()) == false)
            return false;
        if (other.getNodeLabels() == null ^ this.getNodeLabels() == null)
            return false;
        if (other.getNodeLabels() != null && other.getNodeLabels().equals(this.getNodeLabels()) == false)
            return false;
        if (other.getEdgeLabels() == null ^ this.getEdgeLabels() == null)
            return false;
        if (other.getEdgeLabels() != null && other.getEdgeLabels().equals(this.getEdgeLabels()) == false)
            return false;
        if (other.getNumNodeProperties() == null ^ this.getNumNodeProperties() == null)
            return false;
        if (other.getNumNodeProperties() != null && other.getNumNodeProperties().equals(this.getNumNodeProperties()) == false)
            return false;
        if (other.getNumEdgeProperties() == null ^ this.getNumEdgeProperties() == null)
            return false;
        if (other.getNumEdgeProperties() != null && other.getNumEdgeProperties().equals(this.getNumEdgeProperties()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        if (other.getEdgeProperties() == null ^ this.getEdgeProperties() == null)
            return false;
        if (other.getEdgeProperties() != null && other.getEdgeProperties().equals(this.getEdgeProperties()) == false)
            return false;
        if (other.getTotalNodePropertyValues() == null ^ this.getTotalNodePropertyValues() == null)
            return false;
        if (other.getTotalNodePropertyValues() != null && other.getTotalNodePropertyValues().equals(this.getTotalNodePropertyValues()) == false)
            return false;
        if (other.getTotalEdgePropertyValues() == null ^ this.getTotalEdgePropertyValues() == null)
            return false;
        if (other.getTotalEdgePropertyValues() != null && other.getTotalEdgePropertyValues().equals(this.getTotalEdgePropertyValues()) == false)
            return false;
        if (other.getNodeStructures() == null ^ this.getNodeStructures() == null)
            return false;
        if (other.getNodeStructures() != null && other.getNodeStructures().equals(this.getNodeStructures()) == false)
            return false;
        if (other.getEdgeStructures() == null ^ this.getEdgeStructures() == null)
            return false;
        if (other.getEdgeStructures() != null && other.getEdgeStructures().equals(this.getEdgeStructures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumNodes() == null) ? 0 : getNumNodes().hashCode());
        hashCode = prime * hashCode + ((getNumEdges() == null) ? 0 : getNumEdges().hashCode());
        hashCode = prime * hashCode + ((getNumNodeLabels() == null) ? 0 : getNumNodeLabels().hashCode());
        hashCode = prime * hashCode + ((getNumEdgeLabels() == null) ? 0 : getNumEdgeLabels().hashCode());
        hashCode = prime * hashCode + ((getNodeLabels() == null) ? 0 : getNodeLabels().hashCode());
        hashCode = prime * hashCode + ((getEdgeLabels() == null) ? 0 : getEdgeLabels().hashCode());
        hashCode = prime * hashCode + ((getNumNodeProperties() == null) ? 0 : getNumNodeProperties().hashCode());
        hashCode = prime * hashCode + ((getNumEdgeProperties() == null) ? 0 : getNumEdgeProperties().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        hashCode = prime * hashCode + ((getEdgeProperties() == null) ? 0 : getEdgeProperties().hashCode());
        hashCode = prime * hashCode + ((getTotalNodePropertyValues() == null) ? 0 : getTotalNodePropertyValues().hashCode());
        hashCode = prime * hashCode + ((getTotalEdgePropertyValues() == null) ? 0 : getTotalEdgePropertyValues().hashCode());
        hashCode = prime * hashCode + ((getNodeStructures() == null) ? 0 : getNodeStructures().hashCode());
        hashCode = prime * hashCode + ((getEdgeStructures() == null) ? 0 : getEdgeStructures().hashCode());
        return hashCode;
    }

    @Override
    public PropertygraphSummary clone() {
        try {
            return (PropertygraphSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.PropertygraphSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
