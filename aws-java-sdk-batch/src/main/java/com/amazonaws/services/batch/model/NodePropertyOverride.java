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
 * The object that represents any node overrides to a job definition that's used in a <a
 * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html">SubmitJob</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodePropertyOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodePropertyOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The range of nodes, using node index values, that's used to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     */
    private String targetNodes;
    /**
     * <p>
     * The overrides that are sent to a node range.
     * </p>
     */
    private ContainerOverrides containerOverrides;
    /**
     * <p>
     * An object that contains the properties that you want to replace for the existing Amazon ECS resources of a job.
     * </p>
     */
    private EcsPropertiesOverride ecsPropertiesOverride;
    /**
     * <p>
     * An object that contains the instance types that you want to replace for the existing resources of a job.
     * </p>
     */
    private java.util.List<String> instanceTypes;

    /**
     * <p>
     * The range of nodes, using node index values, that's used to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values, that's used to override. A range of <code>0:3</code>
     *        indicates nodes with index values of <code>0</code> through <code>3</code>. If the starting range value is
     *        omitted (<code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is
     *        omitted (<code>n:</code>), then the highest possible node index is used to end the range.
     */

    public void setTargetNodes(String targetNodes) {
        this.targetNodes = targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values, that's used to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @return The range of nodes, using node index values, that's used to override. A range of <code>0:3</code>
     *         indicates nodes with index values of <code>0</code> through <code>3</code>. If the starting range value
     *         is omitted (<code>:n</code>), then <code>0</code> is used to start the range. If the ending range value
     *         is omitted (<code>n:</code>), then the highest possible node index is used to end the range.
     */

    public String getTargetNodes() {
        return this.targetNodes;
    }

    /**
     * <p>
     * The range of nodes, using node index values, that's used to override. A range of <code>0:3</code> indicates nodes
     * with index values of <code>0</code> through <code>3</code>. If the starting range value is omitted (
     * <code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is omitted (
     * <code>n:</code>), then the highest possible node index is used to end the range.
     * </p>
     * 
     * @param targetNodes
     *        The range of nodes, using node index values, that's used to override. A range of <code>0:3</code>
     *        indicates nodes with index values of <code>0</code> through <code>3</code>. If the starting range value is
     *        omitted (<code>:n</code>), then <code>0</code> is used to start the range. If the ending range value is
     *        omitted (<code>n:</code>), then the highest possible node index is used to end the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withTargetNodes(String targetNodes) {
        setTargetNodes(targetNodes);
        return this;
    }

    /**
     * <p>
     * The overrides that are sent to a node range.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that are sent to a node range.
     */

    public void setContainerOverrides(ContainerOverrides containerOverrides) {
        this.containerOverrides = containerOverrides;
    }

    /**
     * <p>
     * The overrides that are sent to a node range.
     * </p>
     * 
     * @return The overrides that are sent to a node range.
     */

    public ContainerOverrides getContainerOverrides() {
        return this.containerOverrides;
    }

    /**
     * <p>
     * The overrides that are sent to a node range.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that are sent to a node range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withContainerOverrides(ContainerOverrides containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * An object that contains the properties that you want to replace for the existing Amazon ECS resources of a job.
     * </p>
     * 
     * @param ecsPropertiesOverride
     *        An object that contains the properties that you want to replace for the existing Amazon ECS resources of a
     *        job.
     */

    public void setEcsPropertiesOverride(EcsPropertiesOverride ecsPropertiesOverride) {
        this.ecsPropertiesOverride = ecsPropertiesOverride;
    }

    /**
     * <p>
     * An object that contains the properties that you want to replace for the existing Amazon ECS resources of a job.
     * </p>
     * 
     * @return An object that contains the properties that you want to replace for the existing Amazon ECS resources of
     *         a job.
     */

    public EcsPropertiesOverride getEcsPropertiesOverride() {
        return this.ecsPropertiesOverride;
    }

    /**
     * <p>
     * An object that contains the properties that you want to replace for the existing Amazon ECS resources of a job.
     * </p>
     * 
     * @param ecsPropertiesOverride
     *        An object that contains the properties that you want to replace for the existing Amazon ECS resources of a
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withEcsPropertiesOverride(EcsPropertiesOverride ecsPropertiesOverride) {
        setEcsPropertiesOverride(ecsPropertiesOverride);
        return this;
    }

    /**
     * <p>
     * An object that contains the instance types that you want to replace for the existing resources of a job.
     * </p>
     * 
     * @return An object that contains the instance types that you want to replace for the existing resources of a job.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * An object that contains the instance types that you want to replace for the existing resources of a job.
     * </p>
     * 
     * @param instanceTypes
     *        An object that contains the instance types that you want to replace for the existing resources of a job.
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
     * An object that contains the instance types that you want to replace for the existing resources of a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        An object that contains the instance types that you want to replace for the existing resources of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withInstanceTypes(String... instanceTypes) {
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
     * An object that contains the instance types that you want to replace for the existing resources of a job.
     * </p>
     * 
     * @param instanceTypes
     *        An object that contains the instance types that you want to replace for the existing resources of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertyOverride withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
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
            sb.append("ContainerOverrides: ").append(getContainerOverrides()).append(",");
        if (getEcsPropertiesOverride() != null)
            sb.append("EcsPropertiesOverride: ").append(getEcsPropertiesOverride()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes());
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
        if (other.getEcsPropertiesOverride() == null ^ this.getEcsPropertiesOverride() == null)
            return false;
        if (other.getEcsPropertiesOverride() != null && other.getEcsPropertiesOverride().equals(this.getEcsPropertiesOverride()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetNodes() == null) ? 0 : getTargetNodes().hashCode());
        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getEcsPropertiesOverride() == null) ? 0 : getEcsPropertiesOverride().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
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
