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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodePropertyOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodePropertyOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     */
    private String targetNodes;
    /**
     * <p>
     * The overrides that should be sent to a node range.
     * </p>
     */
    private ContainerOverrides containerOverrides;

    /**
     * <p>
     * The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates
     *        nodes with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     *        <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     *        <code>n:</code>), then the highest possible node index is used to end the range.
     */

    public void setTargetNodes(String targetNodes) {
        this.targetNodes = targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @return The range of nodes, using node index values, with which to override. A range of <code>0:3</code>
     *         indicates nodes with index values of <code>0</code> through <code>3</code>. If the starting range value
     *         is omitted (<code>:n</code>), then <code>0</code> is used to start the range. If the ending range value
     *         is omitted (<code>n:</code>), then the highest possible node index is used to end the range.
     */

    public String getTargetNodes() {
        return this.targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values, with which to override. A range of <code>0:3</code> indicates
     *        nodes with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     *        <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     *        <code>n:</code>), then the highest possible node index is used to end the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withTargetNodes(String targetNodes) {
        setTargetNodes(targetNodes);
        return this;
    }

    /**
     * <p>
     * The overrides that should be sent to a node range.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that should be sent to a node range.
     */

    public void setContainerOverrides(ContainerOverrides containerOverrides) {
        this.containerOverrides = containerOverrides;
    }

    /**
     * <p>
     * The overrides that should be sent to a node range.
     * </p>
     * 
     * @return The overrides that should be sent to a node range.
     */

    public ContainerOverrides getContainerOverrides() {
        return this.containerOverrides;
    }

    /**
     * <p>
     * The overrides that should be sent to a node range.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that should be sent to a node range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withContainerOverrides(ContainerOverrides containerOverrides) {
        setContainerOverrides(containerOverrides);
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
        if (getTargetNodes() != null)
            sb.append("TargetNodes: ").append(getTargetNodes()).append(",");
        if (getContainerOverrides() != null)
            sb.append("ContainerOverrides: ").append(getContainerOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodePropertyOverride == false)
            return false;
        NodePropertyOverride other = (NodePropertyOverride) obj;
        if (other.getTargetNodes() == null ^ this.getTargetNodes() == null)
            return false;
        if (other.getTargetNodes() != null && other.getTargetNodes().equals(this.getTargetNodes()) == false)
            return false;
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetNodes() == null) ? 0 : getTargetNodes().hashCode());
        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        return hashCode;
    }

    @Override
    public NodePropertyOverride clone() {
        try {
            return (NodePropertyOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodePropertyOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
