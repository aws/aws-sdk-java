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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is an object that represents the properties of the node range for a multi-node parallel job.
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
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (
     * <code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and <code>4:5</code>). In this case,
     * the <code>4:5</code> range properties override the <code>0:10</code> properties.
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
     * The instance types of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources.
     * </p>
     * <p>
     * In addition, this list object is currently limited to one element.
     * </p>
     * </note>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * This is an object that represents the properties of the node range for a multi-node parallel job.
     * </p>
     */
    private EcsProperties ecsProperties;

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (
     * <code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and <code>4:5</code>). In this case,
     * the <code>4:5</code> range properties override the <code>0:10</code> properties.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values
     *        of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     *        <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then
     *        the highest possible node index is used to end the range. Your accumulative node ranges must account for
     *        all nodes (<code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and
     *        <code>4:5</code>). In this case, the <code>4:5</code> range properties override the <code>0:10</code>
     *        properties.
     */

    public void setTargetNodes(String targetNodes) {
        this.targetNodes = targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (
     * <code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and <code>4:5</code>). In this case,
     * the <code>4:5</code> range properties override the <code>0:10</code> properties.
     * </p>
     * 
     * @return The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index
     *         values of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>
     *         ), then <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>
     *         ), then the highest possible node index is used to end the range. Your accumulative node ranges must
     *         account for all nodes (<code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and
     *         <code>4:5</code>). In this case, the <code>4:5</code> range properties override the <code>0:10</code>
     *         properties.
     */

    public String getTargetNodes() {
        return this.targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values of
     * <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     * <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then the
     * highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (
     * <code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and <code>4:5</code>). In this case,
     * the <code>4:5</code> range properties override the <code>0:10</code> properties.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values. A range of <code>0:3</code> indicates nodes with index values
     *        of <code>0</code> through <code>3</code>. If the starting range value is omitted (<code>:n</code>), then
     *        <code>0</code> is used to start the range. If the ending range value is omitted (<code>n:</code>), then
     *        the highest possible node index is used to end the range. Your accumulative node ranges must account for
     *        all nodes (<code>0:n</code>). You can nest node ranges (for example, <code>0:10</code> and
     *        <code>4:5</code>). In this case, the <code>4:5</code> range properties override the <code>0:10</code>
     *        properties.
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
     * <p>
     * The instance types of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources.
     * </p>
     * <p>
     * In addition, this list object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @return The instance types of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources.
     *         </p>
     *         <p>
     *         In addition, this list object is currently limited to one element.
     *         </p>
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources.
     * </p>
     * <p>
     * In addition, this list object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @param instanceTypes
     *        The instance types of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources.
     *        </p>
     *        <p>
     *        In addition, this list object is currently limited to one element.
     *        </p>
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources.
     * </p>
     * <p>
     * In addition, this list object is currently limited to one element.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources.
     *        </p>
     *        <p>
     *        In addition, this list object is currently limited to one element.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeRangeProperty withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources.
     * </p>
     * <p>
     * In addition, this list object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @param instanceTypes
     *        The instance types of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources.
     *        </p>
     *        <p>
     *        In addition, this list object is currently limited to one element.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeRangeProperty withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * This is an object that represents the properties of the node range for a multi-node parallel job.
     * </p>
     * 
     * @param ecsProperties
     *        This is an object that represents the properties of the node range for a multi-node parallel job.
     */

    public void setEcsProperties(EcsProperties ecsProperties) {
        this.ecsProperties = ecsProperties;
    }

    /**
     * <p>
     * This is an object that represents the properties of the node range for a multi-node parallel job.
     * </p>
     * 
     * @return This is an object that represents the properties of the node range for a multi-node parallel job.
     */

    public EcsProperties getEcsProperties() {
        return this.ecsProperties;
    }

    /**
     * <p>
     * This is an object that represents the properties of the node range for a multi-node parallel job.
     * </p>
     * 
     * @param ecsProperties
     *        This is an object that represents the properties of the node range for a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeRangeProperty withEcsProperties(EcsProperties ecsProperties) {
        setEcsProperties(ecsProperties);
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
            sb.append("Container: ").append(getContainer()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getEcsProperties() != null)
            sb.append("EcsProperties: ").append(getEcsProperties());
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
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getEcsProperties() == null ^ this.getEcsProperties() == null)
            return false;
        if (other.getEcsProperties() != null && other.getEcsProperties().equals(this.getEcsProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetNodes() == null) ? 0 : getTargetNodes().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getEcsProperties() == null) ? 0 : getEcsProperties().hashCode());
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
