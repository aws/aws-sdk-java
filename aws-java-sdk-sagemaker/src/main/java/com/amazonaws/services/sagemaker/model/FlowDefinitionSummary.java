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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about the flow definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FlowDefinitionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinitionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     */
    private String flowDefinitionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     */
    private String flowDefinitionStatus;
    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition
     * status is <code>Failed</code>.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of the flow definition.
     */

    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * 
     * @return The name of the flow definition.
     */

    public String getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of the flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinitionSummary withFlowDefinitionName(String flowDefinitionName) {
        setFlowDefinitionName(flowDefinitionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow definition.
     */

    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow definition.
     */

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinitionSummary withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values:
     * @see FlowDefinitionStatus
     */

    public void setFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * 
     * @return The status of the flow definition. Valid values:
     * @see FlowDefinitionStatus
     */

    public String getFlowDefinitionStatus() {
        return this.flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowDefinitionStatus
     */

    public FlowDefinitionSummary withFlowDefinitionStatus(String flowDefinitionStatus) {
        setFlowDefinitionStatus(flowDefinitionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowDefinitionStatus
     */

    public FlowDefinitionSummary withFlowDefinitionStatus(FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when SageMaker created the flow definition.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     * 
     * @return The timestamp when SageMaker created the flow definition.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when SageMaker created the flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinitionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition
     * status is <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why the flow definition creation failed. A failure reason is returned only when the flow
     *        definition status is <code>Failed</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition
     * status is <code>Failed</code>.
     * </p>
     * 
     * @return The reason why the flow definition creation failed. A failure reason is returned only when the flow
     *         definition status is <code>Failed</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition
     * status is <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why the flow definition creation failed. A failure reason is returned only when the flow
     *        definition status is <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinitionSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: ").append(getFlowDefinitionName()).append(",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getFlowDefinitionStatus() != null)
            sb.append("FlowDefinitionStatus: ").append(getFlowDefinitionStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowDefinitionSummary == false)
            return false;
        FlowDefinitionSummary other = (FlowDefinitionSummary) obj;
        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getFlowDefinitionStatus() == null ^ this.getFlowDefinitionStatus() == null)
            return false;
        if (other.getFlowDefinitionStatus() != null && other.getFlowDefinitionStatus().equals(this.getFlowDefinitionStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionStatus() == null) ? 0 : getFlowDefinitionStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public FlowDefinitionSummary clone() {
        try {
            return (FlowDefinitionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FlowDefinitionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
