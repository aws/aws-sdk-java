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
 * An object representing the properties of the node range for a multi-node parallel job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodeRangeProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeRangeProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes
     * (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the
     * 0:10 properties.
     * </p>
     */
    private String targetNodes;
    /**
     * <p>
     * The container details for the node range.
     * </p>
     */
    private ContainerProperties container;

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes
     * (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the
     * 0:10 properties.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values
     *        of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     *        <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then
     *        the highest possible node index is used to end the range. Your accumulative node ranges must account for
     *        all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range
     *        properties override the 0:10 properties.
     */

    public void setTargetNodes(String targetNodes) {
        this.targetNodes = targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes
     * (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the
     * 0:10 properties.
     * </p>
     * 
     * @return The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index
     *         values of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>
     *         ), then <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>
     *         ), then the highest possible node index is used to end the range. Your accumulative node ranges must
     *         account for all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5
     *         range properties override the 0:10 properties.
     */

    public String getTargetNodes() {
        return this.targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes
     * (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the
     * 0:10 properties.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values
     *        of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     *        <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then
     *        the highest possible node index is used to end the range. Your accumulative node ranges must account for
     *        all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range
     *        properties override the 0:10 properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeRangeProperty withTargetNodes(String targetNodes) {
        setTargetNodes(targetNodes);
        return this;
    }

    /**
     * <p>
     * The container details for the node range.
     * </p>
     * 
     * @param container
     *        The container details for the node range.
     */

    public void setContainer(ContainerProperties container) {
        this.container = container;
    }

    /**
     * <p>
     * The container details for the node range.
     * </p>
     * 
     * @return The container details for the node range.
     */

    public ContainerProperties getContainer() {
        return this.container;
    }

    /**
     * <p>
     * The container details for the node range.
     * </p>
     * 
     * @param container
     *        The container details for the node range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeRangeProperty withContainer(ContainerProperties container) {
        setContainer(container);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeRangeProperty == false)
            return false;
        NodeRangeProperty other = (NodeRangeProperty) obj;
        if (other.getTargetNodes() == null ^ this.getTargetNodes() == null)
            return false;
        if (other.getTargetNodes() != null && other.getTargetNodes().equals(this.getTargetNodes()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetNodes() == null) ? 0 : getTargetNodes().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        return hashCode;
    }

    @Override
    public NodeRangeProperty clone() {
        try {
            return (NodeRangeProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodeRangePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
