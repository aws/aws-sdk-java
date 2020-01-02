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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the human loop.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/HumanLoopSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the human loop.
     * </p>
     */
    private String humanLoopName;
    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     */
    private String humanLoopStatus;
    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is
     * <code>Failed</code>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     */
    private String flowDefinitionArn;

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop.
     */

    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @return The name of the human loop.
     */

    public String getHumanLoopName() {
        return this.humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopSummary withHumanLoopName(String humanLoopName) {
        setHumanLoopName(humanLoopName);
        return this;
    }

    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     * 
     * @param humanLoopStatus
     *        The status of the human loop. Valid values:
     * @see HumanLoopStatus
     */

    public void setHumanLoopStatus(String humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus;
    }

    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     * 
     * @return The status of the human loop. Valid values:
     * @see HumanLoopStatus
     */

    public String getHumanLoopStatus() {
        return this.humanLoopStatus;
    }

    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     * 
     * @param humanLoopStatus
     *        The status of the human loop. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HumanLoopStatus
     */

    public HumanLoopSummary withHumanLoopStatus(String humanLoopStatus) {
        setHumanLoopStatus(humanLoopStatus);
        return this;
    }

    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     * 
     * @param humanLoopStatus
     *        The status of the human loop. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HumanLoopStatus
     */

    public HumanLoopSummary withHumanLoopStatus(HumanLoopStatus humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus.toString();
        return this;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @param creationTime
     *        When Amazon Augmented AI created the human loop.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @return When Amazon Augmented AI created the human loop.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @param creationTime
     *        When Amazon Augmented AI created the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is
     * <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why the human loop failed. A failure reason is returned only when the status of the human loop
     *        is <code>Failed</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is
     * <code>Failed</code>.
     * </p>
     * 
     * @return The reason why the human loop failed. A failure reason is returned only when the status of the human loop
     *         is <code>Failed</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is
     * <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why the human loop failed. A failure reason is returned only when the status of the human loop
     *        is <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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

    public HumanLoopSummary withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: ").append(getHumanLoopName()).append(",");
        if (getHumanLoopStatus() != null)
            sb.append("HumanLoopStatus: ").append(getHumanLoopStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopSummary == false)
            return false;
        HumanLoopSummary other = (HumanLoopSummary) obj;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getHumanLoopStatus() == null ^ this.getHumanLoopStatus() == null)
            return false;
        if (other.getHumanLoopStatus() != null && other.getHumanLoopStatus().equals(this.getHumanLoopStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopStatus() == null) ? 0 : getHumanLoopStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopSummary clone() {
        try {
            return (HumanLoopSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.augmentedairuntime.model.transform.HumanLoopSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
