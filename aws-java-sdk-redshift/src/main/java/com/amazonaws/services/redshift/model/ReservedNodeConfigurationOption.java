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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details for a reserved-node exchange. Examples include the node type for a reserved node, the price for a node, the
 * node's state, and other details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ReservedNodeConfigurationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeConfigurationOption implements Serializable, Cloneable {

    private ReservedNode sourceReservedNode;
    /**
     * <p>
     * The target reserved-node count.
     * </p>
     */
    private Integer targetReservedNodeCount;

    private ReservedNodeOffering targetReservedNodeOffering;

    /**
     * @param sourceReservedNode
     */

    public void setSourceReservedNode(ReservedNode sourceReservedNode) {
        this.sourceReservedNode = sourceReservedNode;
    }

    /**
     * @return
     */

    public ReservedNode getSourceReservedNode() {
        return this.sourceReservedNode;
    }

    /**
     * @param sourceReservedNode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeConfigurationOption withSourceReservedNode(ReservedNode sourceReservedNode) {
        setSourceReservedNode(sourceReservedNode);
        return this;
    }

    /**
     * <p>
     * The target reserved-node count.
     * </p>
     * 
     * @param targetReservedNodeCount
     *        The target reserved-node count.
     */

    public void setTargetReservedNodeCount(Integer targetReservedNodeCount) {
        this.targetReservedNodeCount = targetReservedNodeCount;
    }

    /**
     * <p>
     * The target reserved-node count.
     * </p>
     * 
     * @return The target reserved-node count.
     */

    public Integer getTargetReservedNodeCount() {
        return this.targetReservedNodeCount;
    }

    /**
     * <p>
     * The target reserved-node count.
     * </p>
     * 
     * @param targetReservedNodeCount
     *        The target reserved-node count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeConfigurationOption withTargetReservedNodeCount(Integer targetReservedNodeCount) {
        setTargetReservedNodeCount(targetReservedNodeCount);
        return this;
    }

    /**
     * @param targetReservedNodeOffering
     */

    public void setTargetReservedNodeOffering(ReservedNodeOffering targetReservedNodeOffering) {
        this.targetReservedNodeOffering = targetReservedNodeOffering;
    }

    /**
     * @return
     */

    public ReservedNodeOffering getTargetReservedNodeOffering() {
        return this.targetReservedNodeOffering;
    }

    /**
     * @param targetReservedNodeOffering
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeConfigurationOption withTargetReservedNodeOffering(ReservedNodeOffering targetReservedNodeOffering) {
        setTargetReservedNodeOffering(targetReservedNodeOffering);
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
        if (getSourceReservedNode() != null)
            sb.append("SourceReservedNode: ").append(getSourceReservedNode()).append(",");
        if (getTargetReservedNodeCount() != null)
            sb.append("TargetReservedNodeCount: ").append(getTargetReservedNodeCount()).append(",");
        if (getTargetReservedNodeOffering() != null)
            sb.append("TargetReservedNodeOffering: ").append(getTargetReservedNodeOffering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNodeConfigurationOption == false)
            return false;
        ReservedNodeConfigurationOption other = (ReservedNodeConfigurationOption) obj;
        if (other.getSourceReservedNode() == null ^ this.getSourceReservedNode() == null)
            return false;
        if (other.getSourceReservedNode() != null && other.getSourceReservedNode().equals(this.getSourceReservedNode()) == false)
            return false;
        if (other.getTargetReservedNodeCount() == null ^ this.getTargetReservedNodeCount() == null)
            return false;
        if (other.getTargetReservedNodeCount() != null && other.getTargetReservedNodeCount().equals(this.getTargetReservedNodeCount()) == false)
            return false;
        if (other.getTargetReservedNodeOffering() == null ^ this.getTargetReservedNodeOffering() == null)
            return false;
        if (other.getTargetReservedNodeOffering() != null && other.getTargetReservedNodeOffering().equals(this.getTargetReservedNodeOffering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceReservedNode() == null) ? 0 : getSourceReservedNode().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeCount() == null) ? 0 : getTargetReservedNodeCount().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeOffering() == null) ? 0 : getTargetReservedNodeOffering().hashCode());
        return hashCode;
    }

    @Override
    public ReservedNodeConfigurationOption clone() {
        try {
            return (ReservedNodeConfigurationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
