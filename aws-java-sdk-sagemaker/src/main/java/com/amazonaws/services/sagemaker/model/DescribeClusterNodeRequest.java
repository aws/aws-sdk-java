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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeClusterNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance is.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String nodeId;

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance is.
     * </p>
     * 
     * @param clusterName
     *        The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance
     *        is.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance is.
     * </p>
     * 
     * @return The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance
     *         is.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance is.
     * </p>
     * 
     * @param clusterName
     *        The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster in which the instance
     *        is.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterNodeRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param nodeId
     *        The ID of the instance.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param nodeId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterNodeRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterNodeRequest == false)
            return false;
        DescribeClusterNodeRequest other = (DescribeClusterNodeRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterNodeRequest clone() {
        return (DescribeClusterNodeRequest) super.clone();
    }

}
