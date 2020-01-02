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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of node configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/NodeConfigurationOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeConfigurationOption implements Serializable, Cloneable {

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The number of nodes.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     */
    private Double estimatedDiskUtilizationPercent;
    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     * 
     * @param nodeType
     *        The node type, such as, "ds2.8xlarge".
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     * 
     * @return The node type, such as, "ds2.8xlarge".
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     * 
     * @param nodeType
     *        The node type, such as, "ds2.8xlarge".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfigurationOption withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     * 
     * @return The number of nodes.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfigurationOption withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     * 
     * @param estimatedDiskUtilizationPercent
     *        The estimated disk utilizaton percentage.
     */

    public void setEstimatedDiskUtilizationPercent(Double estimatedDiskUtilizationPercent) {
        this.estimatedDiskUtilizationPercent = estimatedDiskUtilizationPercent;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     * 
     * @return The estimated disk utilizaton percentage.
     */

    public Double getEstimatedDiskUtilizationPercent() {
        return this.estimatedDiskUtilizationPercent;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     * 
     * @param estimatedDiskUtilizationPercent
     *        The estimated disk utilizaton percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfigurationOption withEstimatedDiskUtilizationPercent(Double estimatedDiskUtilizationPercent) {
        setEstimatedDiskUtilizationPercent(estimatedDiskUtilizationPercent);
        return this;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * 
     * @param mode
     *        The category of the node configuration recommendation.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * 
     * @return The category of the node configuration recommendation.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * 
     * @param mode
     *        The category of the node configuration recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public NodeConfigurationOption withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * 
     * @param mode
     *        The category of the node configuration recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public NodeConfigurationOption withMode(Mode mode) {
        this.mode = mode.toString();
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
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getEstimatedDiskUtilizationPercent() != null)
            sb.append("EstimatedDiskUtilizationPercent: ").append(getEstimatedDiskUtilizationPercent()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeConfigurationOption == false)
            return false;
        NodeConfigurationOption other = (NodeConfigurationOption) obj;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getEstimatedDiskUtilizationPercent() == null ^ this.getEstimatedDiskUtilizationPercent() == null)
            return false;
        if (other.getEstimatedDiskUtilizationPercent() != null
                && other.getEstimatedDiskUtilizationPercent().equals(this.getEstimatedDiskUtilizationPercent()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getEstimatedDiskUtilizationPercent() == null) ? 0 : getEstimatedDiskUtilizationPercent().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public NodeConfigurationOption clone() {
        try {
            return (NodeConfigurationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
