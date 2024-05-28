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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the number of nodes and node types in a vehicle network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/NodeCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of nodes in a vehicle network.
     * </p>
     */
    private Integer totalNodes;
    /**
     * <p>
     * The total number of nodes in a vehicle network that represent branches.
     * </p>
     */
    private Integer totalBranches;
    /**
     * <p>
     * The total number of nodes in a vehicle network that represent sensors.
     * </p>
     */
    private Integer totalSensors;
    /**
     * <p>
     * The total number of nodes in a vehicle network that represent attributes.
     * </p>
     */
    private Integer totalAttributes;
    /**
     * <p>
     * The total number of nodes in a vehicle network that represent actuators.
     * </p>
     */
    private Integer totalActuators;
    /**
     * <p>
     * The total structure for the node.
     * </p>
     */
    private Integer totalStructs;
    /**
     * <p>
     * The total properties for the node.
     * </p>
     */
    private Integer totalProperties;

    /**
     * <p>
     * The total number of nodes in a vehicle network.
     * </p>
     * 
     * @param totalNodes
     *        The total number of nodes in a vehicle network.
     */

    public void setTotalNodes(Integer totalNodes) {
        this.totalNodes = totalNodes;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network.
     * </p>
     * 
     * @return The total number of nodes in a vehicle network.
     */

    public Integer getTotalNodes() {
        return this.totalNodes;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network.
     * </p>
     * 
     * @param totalNodes
     *        The total number of nodes in a vehicle network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalNodes(Integer totalNodes) {
        setTotalNodes(totalNodes);
        return this;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent branches.
     * </p>
     * 
     * @param totalBranches
     *        The total number of nodes in a vehicle network that represent branches.
     */

    public void setTotalBranches(Integer totalBranches) {
        this.totalBranches = totalBranches;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent branches.
     * </p>
     * 
     * @return The total number of nodes in a vehicle network that represent branches.
     */

    public Integer getTotalBranches() {
        return this.totalBranches;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent branches.
     * </p>
     * 
     * @param totalBranches
     *        The total number of nodes in a vehicle network that represent branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalBranches(Integer totalBranches) {
        setTotalBranches(totalBranches);
        return this;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent sensors.
     * </p>
     * 
     * @param totalSensors
     *        The total number of nodes in a vehicle network that represent sensors.
     */

    public void setTotalSensors(Integer totalSensors) {
        this.totalSensors = totalSensors;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent sensors.
     * </p>
     * 
     * @return The total number of nodes in a vehicle network that represent sensors.
     */

    public Integer getTotalSensors() {
        return this.totalSensors;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent sensors.
     * </p>
     * 
     * @param totalSensors
     *        The total number of nodes in a vehicle network that represent sensors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalSensors(Integer totalSensors) {
        setTotalSensors(totalSensors);
        return this;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent attributes.
     * </p>
     * 
     * @param totalAttributes
     *        The total number of nodes in a vehicle network that represent attributes.
     */

    public void setTotalAttributes(Integer totalAttributes) {
        this.totalAttributes = totalAttributes;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent attributes.
     * </p>
     * 
     * @return The total number of nodes in a vehicle network that represent attributes.
     */

    public Integer getTotalAttributes() {
        return this.totalAttributes;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent attributes.
     * </p>
     * 
     * @param totalAttributes
     *        The total number of nodes in a vehicle network that represent attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalAttributes(Integer totalAttributes) {
        setTotalAttributes(totalAttributes);
        return this;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent actuators.
     * </p>
     * 
     * @param totalActuators
     *        The total number of nodes in a vehicle network that represent actuators.
     */

    public void setTotalActuators(Integer totalActuators) {
        this.totalActuators = totalActuators;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent actuators.
     * </p>
     * 
     * @return The total number of nodes in a vehicle network that represent actuators.
     */

    public Integer getTotalActuators() {
        return this.totalActuators;
    }

    /**
     * <p>
     * The total number of nodes in a vehicle network that represent actuators.
     * </p>
     * 
     * @param totalActuators
     *        The total number of nodes in a vehicle network that represent actuators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalActuators(Integer totalActuators) {
        setTotalActuators(totalActuators);
        return this;
    }

    /**
     * <p>
     * The total structure for the node.
     * </p>
     * 
     * @param totalStructs
     *        The total structure for the node.
     */

    public void setTotalStructs(Integer totalStructs) {
        this.totalStructs = totalStructs;
    }

    /**
     * <p>
     * The total structure for the node.
     * </p>
     * 
     * @return The total structure for the node.
     */

    public Integer getTotalStructs() {
        return this.totalStructs;
    }

    /**
     * <p>
     * The total structure for the node.
     * </p>
     * 
     * @param totalStructs
     *        The total structure for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalStructs(Integer totalStructs) {
        setTotalStructs(totalStructs);
        return this;
    }

    /**
     * <p>
     * The total properties for the node.
     * </p>
     * 
     * @param totalProperties
     *        The total properties for the node.
     */

    public void setTotalProperties(Integer totalProperties) {
        this.totalProperties = totalProperties;
    }

    /**
     * <p>
     * The total properties for the node.
     * </p>
     * 
     * @return The total properties for the node.
     */

    public Integer getTotalProperties() {
        return this.totalProperties;
    }

    /**
     * <p>
     * The total properties for the node.
     * </p>
     * 
     * @param totalProperties
     *        The total properties for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeCounts withTotalProperties(Integer totalProperties) {
        setTotalProperties(totalProperties);
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
        if (getTotalNodes() != null)
            sb.append("TotalNodes: ").append(getTotalNodes()).append(",");
        if (getTotalBranches() != null)
            sb.append("TotalBranches: ").append(getTotalBranches()).append(",");
        if (getTotalSensors() != null)
            sb.append("TotalSensors: ").append(getTotalSensors()).append(",");
        if (getTotalAttributes() != null)
            sb.append("TotalAttributes: ").append(getTotalAttributes()).append(",");
        if (getTotalActuators() != null)
            sb.append("TotalActuators: ").append(getTotalActuators()).append(",");
        if (getTotalStructs() != null)
            sb.append("TotalStructs: ").append(getTotalStructs()).append(",");
        if (getTotalProperties() != null)
            sb.append("TotalProperties: ").append(getTotalProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeCounts == false)
            return false;
        NodeCounts other = (NodeCounts) obj;
        if (other.getTotalNodes() == null ^ this.getTotalNodes() == null)
            return false;
        if (other.getTotalNodes() != null && other.getTotalNodes().equals(this.getTotalNodes()) == false)
            return false;
        if (other.getTotalBranches() == null ^ this.getTotalBranches() == null)
            return false;
        if (other.getTotalBranches() != null && other.getTotalBranches().equals(this.getTotalBranches()) == false)
            return false;
        if (other.getTotalSensors() == null ^ this.getTotalSensors() == null)
            return false;
        if (other.getTotalSensors() != null && other.getTotalSensors().equals(this.getTotalSensors()) == false)
            return false;
        if (other.getTotalAttributes() == null ^ this.getTotalAttributes() == null)
            return false;
        if (other.getTotalAttributes() != null && other.getTotalAttributes().equals(this.getTotalAttributes()) == false)
            return false;
        if (other.getTotalActuators() == null ^ this.getTotalActuators() == null)
            return false;
        if (other.getTotalActuators() != null && other.getTotalActuators().equals(this.getTotalActuators()) == false)
            return false;
        if (other.getTotalStructs() == null ^ this.getTotalStructs() == null)
            return false;
        if (other.getTotalStructs() != null && other.getTotalStructs().equals(this.getTotalStructs()) == false)
            return false;
        if (other.getTotalProperties() == null ^ this.getTotalProperties() == null)
            return false;
        if (other.getTotalProperties() != null && other.getTotalProperties().equals(this.getTotalProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNodes() == null) ? 0 : getTotalNodes().hashCode());
        hashCode = prime * hashCode + ((getTotalBranches() == null) ? 0 : getTotalBranches().hashCode());
        hashCode = prime * hashCode + ((getTotalSensors() == null) ? 0 : getTotalSensors().hashCode());
        hashCode = prime * hashCode + ((getTotalAttributes() == null) ? 0 : getTotalAttributes().hashCode());
        hashCode = prime * hashCode + ((getTotalActuators() == null) ? 0 : getTotalActuators().hashCode());
        hashCode = prime * hashCode + ((getTotalStructs() == null) ? 0 : getTotalStructs().hashCode());
        hashCode = prime * hashCode + ((getTotalProperties() == null) ? 0 : getTotalProperties().hashCode());
        return hashCode;
    }

    @Override
    public NodeCounts clone() {
        try {
            return (NodeCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.NodeCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
