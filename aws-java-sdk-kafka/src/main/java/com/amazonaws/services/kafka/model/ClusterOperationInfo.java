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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Returns information about a cluster operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the API request that triggered this operation.
     * </p>
     */
    private String clientRequestId;
    /**
     * <p>
     * ARN of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The time that the operation was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the operation finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Describes the error if the operation fails.
     * </p>
     */
    private ErrorInfo errorInfo;
    /**
     * <p>
     * ARN of the cluster operation.
     * </p>
     */
    private String operationArn;
    /**
     * <p>
     * State of the cluster operation.
     * </p>
     */
    private String operationState;
    /**
     * <p>
     * Type of the cluster operation.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     */
    private MutableClusterInfo sourceClusterInfo;
    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     */
    private MutableClusterInfo targetClusterInfo;

    /**
     * <p>
     * The ID of the API request that triggered this operation.
     * </p>
     * 
     * @param clientRequestId
     *        <p>
     *        The ID of the API request that triggered this operation.
     *        </p>
     */

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    /**
     * <p>
     * The ID of the API request that triggered this operation.
     * </p>
     * 
     * @return <p>
     *         The ID of the API request that triggered this operation.
     *         </p>
     */

    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * <p>
     * The ID of the API request that triggered this operation.
     * </p>
     * 
     * @param clientRequestId
     *        <p>
     *        The ID of the API request that triggered this operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withClientRequestId(String clientRequestId) {
        setClientRequestId(clientRequestId);
        return this;
    }

    /**
     * <p>
     * ARN of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        ARN of the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * ARN of the cluster.
     * </p>
     * 
     * @return <p>
     *         ARN of the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * ARN of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        ARN of the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The time that the operation was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time that the operation was created.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the operation was created.
     * </p>
     * 
     * @return <p>
     *         The time that the operation was created.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the operation was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time that the operation was created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the operation finished.
     * </p>
     * 
     * @param endTime
     *        <p>
     *        The time at which the operation finished.
     *        </p>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the operation finished.
     * </p>
     * 
     * @return <p>
     *         The time at which the operation finished.
     *         </p>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the operation finished.
     * </p>
     * 
     * @param endTime
     *        <p>
     *        The time at which the operation finished.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Describes the error if the operation fails.
     * </p>
     * 
     * @param errorInfo
     *        <p>
     *        Describes the error if the operation fails.
     *        </p>
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Describes the error if the operation fails.
     * </p>
     * 
     * @return <p>
     *         Describes the error if the operation fails.
     *         </p>
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Describes the error if the operation fails.
     * </p>
     * 
     * @param errorInfo
     *        <p>
     *        Describes the error if the operation fails.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * ARN of the cluster operation.
     * </p>
     * 
     * @param operationArn
     *        <p>
     *        ARN of the cluster operation.
     *        </p>
     */

    public void setOperationArn(String operationArn) {
        this.operationArn = operationArn;
    }

    /**
     * <p>
     * ARN of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         ARN of the cluster operation.
     *         </p>
     */

    public String getOperationArn() {
        return this.operationArn;
    }

    /**
     * <p>
     * ARN of the cluster operation.
     * </p>
     * 
     * @param operationArn
     *        <p>
     *        ARN of the cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withOperationArn(String operationArn) {
        setOperationArn(operationArn);
        return this;
    }

    /**
     * <p>
     * State of the cluster operation.
     * </p>
     * 
     * @param operationState
     *        <p>
     *        State of the cluster operation.
     *        </p>
     */

    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }

    /**
     * <p>
     * State of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         State of the cluster operation.
     *         </p>
     */

    public String getOperationState() {
        return this.operationState;
    }

    /**
     * <p>
     * State of the cluster operation.
     * </p>
     * 
     * @param operationState
     *        <p>
     *        State of the cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withOperationState(String operationState) {
        setOperationState(operationState);
        return this;
    }

    /**
     * <p>
     * Type of the cluster operation.
     * </p>
     * 
     * @param operationType
     *        <p>
     *        Type of the cluster operation.
     *        </p>
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * Type of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         Type of the cluster operation.
     *         </p>
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * Type of the cluster operation.
     * </p>
     * 
     * @param operationType
     *        <p>
     *        Type of the cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @param sourceClusterInfo
     *        <p>
     *        Information about cluster attributes before a cluster is updated.
     *        </p>
     */

    public void setSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        this.sourceClusterInfo = sourceClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes before a cluster is updated.
     *         </p>
     */

    public MutableClusterInfo getSourceClusterInfo() {
        return this.sourceClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @param sourceClusterInfo
     *        <p>
     *        Information about cluster attributes before a cluster is updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        setSourceClusterInfo(sourceClusterInfo);
        return this;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @param targetClusterInfo
     *        <p>
     *        Information about cluster attributes after a cluster is updated.
     *        </p>
     */

    public void setTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        this.targetClusterInfo = targetClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes after a cluster is updated.
     *         </p>
     */

    public MutableClusterInfo getTargetClusterInfo() {
        return this.targetClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @param targetClusterInfo
     *        <p>
     *        Information about cluster attributes after a cluster is updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationInfo withTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        setTargetClusterInfo(targetClusterInfo);
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
        if (getClientRequestId() != null)
            sb.append("ClientRequestId: ").append(getClientRequestId()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getOperationArn() != null)
            sb.append("OperationArn: ").append(getOperationArn()).append(",");
        if (getOperationState() != null)
            sb.append("OperationState: ").append(getOperationState()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getSourceClusterInfo() != null)
            sb.append("SourceClusterInfo: ").append(getSourceClusterInfo()).append(",");
        if (getTargetClusterInfo() != null)
            sb.append("TargetClusterInfo: ").append(getTargetClusterInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationInfo == false)
            return false;
        ClusterOperationInfo other = (ClusterOperationInfo) obj;
        if (other.getClientRequestId() == null ^ this.getClientRequestId() == null)
            return false;
        if (other.getClientRequestId() != null && other.getClientRequestId().equals(this.getClientRequestId()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getOperationArn() == null ^ this.getOperationArn() == null)
            return false;
        if (other.getOperationArn() != null && other.getOperationArn().equals(this.getOperationArn()) == false)
            return false;
        if (other.getOperationState() == null ^ this.getOperationState() == null)
            return false;
        if (other.getOperationState() != null && other.getOperationState().equals(this.getOperationState()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getSourceClusterInfo() == null ^ this.getSourceClusterInfo() == null)
            return false;
        if (other.getSourceClusterInfo() != null && other.getSourceClusterInfo().equals(this.getSourceClusterInfo()) == false)
            return false;
        if (other.getTargetClusterInfo() == null ^ this.getTargetClusterInfo() == null)
            return false;
        if (other.getTargetClusterInfo() != null && other.getTargetClusterInfo().equals(this.getTargetClusterInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestId() == null) ? 0 : getClientRequestId().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getOperationArn() == null) ? 0 : getOperationArn().hashCode());
        hashCode = prime * hashCode + ((getOperationState() == null) ? 0 : getOperationState().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getSourceClusterInfo() == null) ? 0 : getSourceClusterInfo().hashCode());
        hashCode = prime * hashCode + ((getTargetClusterInfo() == null) ? 0 : getTargetClusterInfo().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationInfo clone() {
        try {
            return (ClusterOperationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
