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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of a SageMaker HyperPod cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClusterSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The time when the SageMaker HyperPod cluster is created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The status of the SageMaker HyperPod cluster.
     * </p>
     */
    private String clusterStatus;

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

    public ClusterSummary withClusterArn(String clusterArn) {
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

    public ClusterSummary withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The time when the SageMaker HyperPod cluster is created.
     * </p>
     * 
     * @param creationTime
     *        The time when the SageMaker HyperPod cluster is created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the SageMaker HyperPod cluster is created.
     * </p>
     * 
     * @return The time when the SageMaker HyperPod cluster is created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the SageMaker HyperPod cluster is created.
     * </p>
     * 
     * @param creationTime
     *        The time when the SageMaker HyperPod cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public ClusterSummary withClusterStatus(String clusterStatus) {
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

    public ClusterSummary withClusterStatus(ClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus.toString();
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSummary == false)
            return false;
        ClusterSummary other = (ClusterSummary) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterSummary clone() {
        try {
            return (ClusterSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClusterSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
