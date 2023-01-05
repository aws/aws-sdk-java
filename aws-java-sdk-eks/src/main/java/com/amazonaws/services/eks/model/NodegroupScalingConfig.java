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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the scaling configuration details for the Auto Scaling group that is associated with your node
 * group. When creating a node group, you must specify all or none of the properties. When updating a node group, you
 * can specify any or none of the properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/NodegroupScalingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodegroupScalingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of nodes that the managed node group can scale in to.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum number of nodes that the managed node group can scale out to. For information about the maximum
     * number that you can specify, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The current number of nodes that the managed node group should maintain.
     * </p>
     * <important>
     * <p>
     * If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the Cluster
     * Autoscaler to suddenly scale up or scale down.
     * </p>
     * </important>
     * <p>
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified size.
     * If this parameter is given a value that is smaller than the current number of running worker nodes, the necessary
     * number of worker nodes are terminated to match the given value. When using CloudFormation, no action occurs if
     * you remove this parameter from your CFN template.
     * </p>
     * <p>
     * This parameter can be different from minSize in some cases, such as when starting with extra hosts for testing.
     * This parameter can also be different when you want to start with an estimated number of needed hosts, but let
     * Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is used, the desiredSize
     * parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler
     * doesn't scale a managed node group lower than minSize or higher than maxSize.
     * </p>
     */
    private Integer desiredSize;

    /**
     * <p>
     * The minimum number of nodes that the managed node group can scale in to.
     * </p>
     * 
     * @param minSize
     *        The minimum number of nodes that the managed node group can scale in to.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of nodes that the managed node group can scale in to.
     * </p>
     * 
     * @return The minimum number of nodes that the managed node group can scale in to.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of nodes that the managed node group can scale in to.
     * </p>
     * 
     * @param minSize
     *        The minimum number of nodes that the managed node group can scale in to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupScalingConfig withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes that the managed node group can scale out to. For information about the maximum
     * number that you can specify, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of nodes that the managed node group can scale out to. For information about the
     *        maximum number that you can specify, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a>
     *        in the <i>Amazon EKS User Guide</i>.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum number of nodes that the managed node group can scale out to. For information about the maximum
     * number that you can specify, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The maximum number of nodes that the managed node group can scale out to. For information about the
     *         maximum number that you can specify, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a>
     *         in the <i>Amazon EKS User Guide</i>.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum number of nodes that the managed node group can scale out to. For information about the maximum
     * number that you can specify, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of nodes that the managed node group can scale out to. For information about the
     *        maximum number that you can specify, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a>
     *        in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupScalingConfig withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The current number of nodes that the managed node group should maintain.
     * </p>
     * <important>
     * <p>
     * If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the Cluster
     * Autoscaler to suddenly scale up or scale down.
     * </p>
     * </important>
     * <p>
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified size.
     * If this parameter is given a value that is smaller than the current number of running worker nodes, the necessary
     * number of worker nodes are terminated to match the given value. When using CloudFormation, no action occurs if
     * you remove this parameter from your CFN template.
     * </p>
     * <p>
     * This parameter can be different from minSize in some cases, such as when starting with extra hosts for testing.
     * This parameter can also be different when you want to start with an estimated number of needed hosts, but let
     * Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is used, the desiredSize
     * parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler
     * doesn't scale a managed node group lower than minSize or higher than maxSize.
     * </p>
     * 
     * @param desiredSize
     *        The current number of nodes that the managed node group should maintain.</p> <important>
     *        <p>
     *        If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the
     *        Cluster Autoscaler to suddenly scale up or scale down.
     *        </p>
     *        </important>
     *        <p>
     *        Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified
     *        size. If this parameter is given a value that is smaller than the current number of running worker nodes,
     *        the necessary number of worker nodes are terminated to match the given value. When using CloudFormation,
     *        no action occurs if you remove this parameter from your CFN template.
     *        </p>
     *        <p>
     *        This parameter can be different from minSize in some cases, such as when starting with extra hosts for
     *        testing. This parameter can also be different when you want to start with an estimated number of needed
     *        hosts, but let Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is
     *        used, the desiredSize parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods
     *        of time). Cluster Autoscaler doesn't scale a managed node group lower than minSize or higher than maxSize.
     */

    public void setDesiredSize(Integer desiredSize) {
        this.desiredSize = desiredSize;
    }

    /**
     * <p>
     * The current number of nodes that the managed node group should maintain.
     * </p>
     * <important>
     * <p>
     * If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the Cluster
     * Autoscaler to suddenly scale up or scale down.
     * </p>
     * </important>
     * <p>
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified size.
     * If this parameter is given a value that is smaller than the current number of running worker nodes, the necessary
     * number of worker nodes are terminated to match the given value. When using CloudFormation, no action occurs if
     * you remove this parameter from your CFN template.
     * </p>
     * <p>
     * This parameter can be different from minSize in some cases, such as when starting with extra hosts for testing.
     * This parameter can also be different when you want to start with an estimated number of needed hosts, but let
     * Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is used, the desiredSize
     * parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler
     * doesn't scale a managed node group lower than minSize or higher than maxSize.
     * </p>
     * 
     * @return The current number of nodes that the managed node group should maintain.</p> <important>
     *         <p>
     *         If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the
     *         Cluster Autoscaler to suddenly scale up or scale down.
     *         </p>
     *         </important>
     *         <p>
     *         Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified
     *         size. If this parameter is given a value that is smaller than the current number of running worker nodes,
     *         the necessary number of worker nodes are terminated to match the given value. When using CloudFormation,
     *         no action occurs if you remove this parameter from your CFN template.
     *         </p>
     *         <p>
     *         This parameter can be different from minSize in some cases, such as when starting with extra hosts for
     *         testing. This parameter can also be different when you want to start with an estimated number of needed
     *         hosts, but let Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is
     *         used, the desiredSize parameter is altered by Cluster Autoscaler (but can be out-of-date for short
     *         periods of time). Cluster Autoscaler doesn't scale a managed node group lower than minSize or higher than
     *         maxSize.
     */

    public Integer getDesiredSize() {
        return this.desiredSize;
    }

    /**
     * <p>
     * The current number of nodes that the managed node group should maintain.
     * </p>
     * <important>
     * <p>
     * If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the Cluster
     * Autoscaler to suddenly scale up or scale down.
     * </p>
     * </important>
     * <p>
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified size.
     * If this parameter is given a value that is smaller than the current number of running worker nodes, the necessary
     * number of worker nodes are terminated to match the given value. When using CloudFormation, no action occurs if
     * you remove this parameter from your CFN template.
     * </p>
     * <p>
     * This parameter can be different from minSize in some cases, such as when starting with extra hosts for testing.
     * This parameter can also be different when you want to start with an estimated number of needed hosts, but let
     * Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is used, the desiredSize
     * parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler
     * doesn't scale a managed node group lower than minSize or higher than maxSize.
     * </p>
     * 
     * @param desiredSize
     *        The current number of nodes that the managed node group should maintain.</p> <important>
     *        <p>
     *        If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the
     *        Cluster Autoscaler to suddenly scale up or scale down.
     *        </p>
     *        </important>
     *        <p>
     *        Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified
     *        size. If this parameter is given a value that is smaller than the current number of running worker nodes,
     *        the necessary number of worker nodes are terminated to match the given value. When using CloudFormation,
     *        no action occurs if you remove this parameter from your CFN template.
     *        </p>
     *        <p>
     *        This parameter can be different from minSize in some cases, such as when starting with extra hosts for
     *        testing. This parameter can also be different when you want to start with an estimated number of needed
     *        hosts, but let Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is
     *        used, the desiredSize parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods
     *        of time). Cluster Autoscaler doesn't scale a managed node group lower than minSize or higher than maxSize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupScalingConfig withDesiredSize(Integer desiredSize) {
        setDesiredSize(desiredSize);
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
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getDesiredSize() != null)
            sb.append("DesiredSize: ").append(getDesiredSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodegroupScalingConfig == false)
            return false;
        NodegroupScalingConfig other = (NodegroupScalingConfig) obj;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredSize() == null ^ this.getDesiredSize() == null)
            return false;
        if (other.getDesiredSize() != null && other.getDesiredSize().equals(this.getDesiredSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredSize() == null) ? 0 : getDesiredSize().hashCode());
        return hashCode;
    }

    @Override
    public NodegroupScalingConfig clone() {
        try {
            return (NodegroupScalingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.NodegroupScalingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
