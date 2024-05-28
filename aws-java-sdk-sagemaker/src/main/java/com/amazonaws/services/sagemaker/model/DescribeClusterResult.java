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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the SageMaker HyperPod cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     */
    private String clusterStatus;
    /**
     * <p>
     * The time when the SageMaker Cluster is created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The failure message of the SageMaker HyperPod cluster.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The instance groups of the SageMaker HyperPod cluster.
     * </p>
     */
    private java.util.List<ClusterInstanceGroupDetails> instanceGroups;

    private VpcConfig vpcConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the SageMaker HyperPod cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The name of the SageMaker HyperPod cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterStatus
     *        The status of the SageMaker HyperPod cluster.
     * @see ClusterStatus
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The status of the SageMaker HyperPod cluster.
     * @see ClusterStatus
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterStatus
     *        The status of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public DescribeClusterResult withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterStatus
     *        The status of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public DescribeClusterResult withClusterStatus(ClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the SageMaker Cluster is created.
     * </p>
     * 
     * @param creationTime
     *        The time when the SageMaker Cluster is created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the SageMaker Cluster is created.
     * </p>
     * 
     * @return The time when the SageMaker Cluster is created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the SageMaker Cluster is created.
     * </p>
     * 
     * @param creationTime
     *        The time when the SageMaker Cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The failure message of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param failureMessage
     *        The failure message of the SageMaker HyperPod cluster.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The failure message of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The failure message of the SageMaker HyperPod cluster.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The failure message of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param failureMessage
     *        The failure message of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The instance groups of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The instance groups of the SageMaker HyperPod cluster.
     */

    public java.util.List<ClusterInstanceGroupDetails> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * The instance groups of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups of the SageMaker HyperPod cluster.
     */

    public void setInstanceGroups(java.util.Collection<ClusterInstanceGroupDetails> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<ClusterInstanceGroupDetails>(instanceGroups);
    }

    /**
     * <p>
     * The instance groups of the SageMaker HyperPod cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroups(java.util.Collection)} or {@link #withInstanceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withInstanceGroups(ClusterInstanceGroupDetails... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new java.util.ArrayList<ClusterInstanceGroupDetails>(instanceGroups.length));
        }
        for (ClusterInstanceGroupDetails ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance groups of the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups of the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withInstanceGroups(java.util.Collection<ClusterInstanceGroupDetails> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: ").append(getInstanceGroups()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterResult == false)
            return false;
        DescribeClusterResult other = (DescribeClusterResult) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterResult clone() {
        try {
            return (DescribeClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
