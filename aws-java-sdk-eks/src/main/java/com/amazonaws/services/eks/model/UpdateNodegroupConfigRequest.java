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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNodegroupConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster that the managed node group resides in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group after the update.
     * </p>
     */
    private UpdateLabelsPayload labels;
    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group after the update.
     * </p>
     */
    private NodegroupScalingConfig scalingConfig;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the Amazon EKS cluster that the managed node group resides in.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that the managed node group resides in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that the managed node group resides in.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster that the managed node group resides in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that the managed node group resides in.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that the managed node group resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupConfigRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the managed node group to update.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @return The name of the managed node group to update.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the managed node group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupConfigRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group after the update.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels to be applied to the nodes in the node group after the update.
     */

    public void setLabels(UpdateLabelsPayload labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group after the update.
     * </p>
     * 
     * @return The Kubernetes labels to be applied to the nodes in the node group after the update.
     */

    public UpdateLabelsPayload getLabels() {
        return this.labels;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group after the update.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels to be applied to the nodes in the node group after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupConfigRequest withLabels(UpdateLabelsPayload labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group after the update.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group after the update.
     */

    public void setScalingConfig(NodegroupScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group after the update.
     * </p>
     * 
     * @return The scaling configuration details for the Auto Scaling group after the update.
     */

    public NodegroupScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group after the update.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupConfigRequest withScalingConfig(NodegroupScalingConfig scalingConfig) {
        setScalingConfig(scalingConfig);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupConfigRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getScalingConfig() != null)
            sb.append("ScalingConfig: ").append(getScalingConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNodegroupConfigRequest == false)
            return false;
        UpdateNodegroupConfigRequest other = (UpdateNodegroupConfigRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getScalingConfig() == null ^ this.getScalingConfig() == null)
            return false;
        if (other.getScalingConfig() != null && other.getScalingConfig().equals(this.getScalingConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getScalingConfig() == null) ? 0 : getScalingConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNodegroupConfigRequest clone() {
        return (UpdateNodegroupConfigRequest) super.clone();
    }

}
