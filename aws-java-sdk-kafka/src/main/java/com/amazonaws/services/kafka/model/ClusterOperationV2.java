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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * Type of the backend cluster.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The time at which operation was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time at which the operation finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If cluster operation failed from an error, it describes the error.
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
     * Properties of a provisioned cluster.
     * </p>
     */
    private ClusterOperationV2Provisioned provisioned;
    /**
     * <p>
     * Properties of a serverless cluster.
     * </p>
     */
    private ClusterOperationV2Serverless serverless;

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

    public ClusterOperationV2 withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * Type of the backend cluster.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Type of the backend cluster.
     *        </p>
     * @see ClusterType
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * Type of the backend cluster.
     * </p>
     * 
     * @return <p>
     *         Type of the backend cluster.
     *         </p>
     * @see ClusterType
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * Type of the backend cluster.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Type of the backend cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterType
     */

    public ClusterOperationV2 withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * Type of the backend cluster.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Type of the backend cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterType
     */

    public ClusterOperationV2 withClusterType(ClusterType clusterType) {
        this.clusterType = clusterType.toString();
        return this;
    }

    /**
     * <p>
     * The time at which operation was started.
     * </p>
     * 
     * @param startTime
     *        <p>
     *        The time at which operation was started.
     *        </p>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which operation was started.
     * </p>
     * 
     * @return <p>
     *         The time at which operation was started.
     *         </p>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which operation was started.
     * </p>
     * 
     * @param startTime
     *        <p>
     *        The time at which operation was started.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2 withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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

    public ClusterOperationV2 withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If cluster operation failed from an error, it describes the error.
     * </p>
     * 
     * @param errorInfo
     *        <p>
     *        If cluster operation failed from an error, it describes the error.
     *        </p>
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * If cluster operation failed from an error, it describes the error.
     * </p>
     * 
     * @return <p>
     *         If cluster operation failed from an error, it describes the error.
     *         </p>
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * If cluster operation failed from an error, it describes the error.
     * </p>
     * 
     * @param errorInfo
     *        <p>
     *        If cluster operation failed from an error, it describes the error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2 withErrorInfo(ErrorInfo errorInfo) {
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

    public ClusterOperationV2 withOperationArn(String operationArn) {
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

    public ClusterOperationV2 withOperationState(String operationState) {
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

    public ClusterOperationV2 withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * Properties of a provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Properties of a provisioned cluster.
     *        </p>
     */

    public void setProvisioned(ClusterOperationV2Provisioned provisioned) {
        this.provisioned = provisioned;
    }

    /**
     * <p>
     * Properties of a provisioned cluster.
     * </p>
     * 
     * @return <p>
     *         Properties of a provisioned cluster.
     *         </p>
     */

    public ClusterOperationV2Provisioned getProvisioned() {
        return this.provisioned;
    }

    /**
     * <p>
     * Properties of a provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Properties of a provisioned cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2 withProvisioned(ClusterOperationV2Provisioned provisioned) {
        setProvisioned(provisioned);
        return this;
    }

    /**
     * <p>
     * Properties of a serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Properties of a serverless cluster.
     *        </p>
     */

    public void setServerless(ClusterOperationV2Serverless serverless) {
        this.serverless = serverless;
    }

    /**
     * <p>
     * Properties of a serverless cluster.
     * </p>
     * 
     * @return <p>
     *         Properties of a serverless cluster.
     *         </p>
     */

    public ClusterOperationV2Serverless getServerless() {
        return this.serverless;
    }

    /**
     * <p>
     * Properties of a serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Properties of a serverless cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2 withServerless(ClusterOperationV2Serverless serverless) {
        setServerless(serverless);
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
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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
        if (getProvisioned() != null)
            sb.append("Provisioned: ").append(getProvisioned()).append(",");
        if (getServerless() != null)
            sb.append("Serverless: ").append(getServerless());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationV2 == false)
            return false;
        ClusterOperationV2 other = (ClusterOperationV2) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getProvisioned() == null ^ this.getProvisioned() == null)
            return false;
        if (other.getProvisioned() != null && other.getProvisioned().equals(this.getProvisioned()) == false)
            return false;
        if (other.getServerless() == null ^ this.getServerless() == null)
            return false;
        if (other.getServerless() != null && other.getServerless().equals(this.getServerless()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getOperationArn() == null) ? 0 : getOperationArn().hashCode());
        hashCode = prime * hashCode + ((getOperationState() == null) ? 0 : getOperationState().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getProvisioned() == null) ? 0 : getProvisioned().hashCode());
        hashCode = prime * hashCode + ((getServerless() == null) ? 0 : getServerless().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationV2 clone() {
        try {
            return (ClusterOperationV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
