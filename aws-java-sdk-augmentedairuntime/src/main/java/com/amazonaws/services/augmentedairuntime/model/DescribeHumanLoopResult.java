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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DescribeHumanLoop"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHumanLoopResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The reason why a human loop has failed. The failure reason is returned when the human loop status is
     * <code>Failed</code>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A failure code denoting a specific type of failure.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The status of the human loop. Valid values:
     * </p>
     */
    private String humanLoopStatus;
    /**
     * <p>
     * The name of the human loop.
     * </p>
     */
    private String humanLoopName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     */
    private String humanLoopArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * An object containing information about the output of the human loop.
     * </p>
     */
    private HumanLoopOutput humanLoopOutput;

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @param creationTime
     *        The creation time when Amazon Augmented AI created the human loop.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @return The creation time when Amazon Augmented AI created the human loop.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     * 
     * @param creationTime
     *        The creation time when Amazon Augmented AI created the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanLoopResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The reason why a human loop has failed. The failure reason is returned when the human loop status is
     * <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why a human loop has failed. The failure reason is returned when the human loop status is
     *        <code>Failed</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why a human loop has failed. The failure reason is returned when the human loop status is
     * <code>Failed</code>.
     * </p>
     * 
     * @return The reason why a human loop has failed. The failure reason is returned when the human loop status is
     *         <code>Failed</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why a human loop has failed. The failure reason is returned when the human loop status is
     * <code>Failed</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason why a human loop has failed. The failure reason is returned when the human loop status is
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanLoopResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A failure code denoting a specific type of failure.
     * </p>
     * 
     * @param failureCode
     *        A failure code denoting a specific type of failure.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * A failure code denoting a specific type of failure.
     * </p>
     * 
     * @return A failure code denoting a specific type of failure.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * A failure code denoting a specific type of failure.
     * </p>
     * 
     * @param failureCode
     *        A failure code denoting a specific type of failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanLoopResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
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

    public DescribeHumanLoopResult withHumanLoopStatus(String humanLoopStatus) {
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

    public DescribeHumanLoopResult withHumanLoopStatus(HumanLoopStatus humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus.toString();
        return this;
    }

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

    public DescribeHumanLoopResult withHumanLoopName(String humanLoopName) {
        setHumanLoopName(humanLoopName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the human loop.
     */

    public void setHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the human loop.
     */

    public String getHumanLoopArn() {
        return this.humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanLoopResult withHumanLoopArn(String humanLoopArn) {
        setHumanLoopArn(humanLoopArn);
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

    public DescribeHumanLoopResult withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * An object containing information about the output of the human loop.
     * </p>
     * 
     * @param humanLoopOutput
     *        An object containing information about the output of the human loop.
     */

    public void setHumanLoopOutput(HumanLoopOutput humanLoopOutput) {
        this.humanLoopOutput = humanLoopOutput;
    }

    /**
     * <p>
     * An object containing information about the output of the human loop.
     * </p>
     * 
     * @return An object containing information about the output of the human loop.
     */

    public HumanLoopOutput getHumanLoopOutput() {
        return this.humanLoopOutput;
    }

    /**
     * <p>
     * An object containing information about the output of the human loop.
     * </p>
     * 
     * @param humanLoopOutput
     *        An object containing information about the output of the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanLoopResult withHumanLoopOutput(HumanLoopOutput humanLoopOutput) {
        setHumanLoopOutput(humanLoopOutput);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getHumanLoopStatus() != null)
            sb.append("HumanLoopStatus: ").append(getHumanLoopStatus()).append(",");
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: ").append(getHumanLoopName()).append(",");
        if (getHumanLoopArn() != null)
            sb.append("HumanLoopArn: ").append(getHumanLoopArn()).append(",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getHumanLoopOutput() != null)
            sb.append("HumanLoopOutput: ").append(getHumanLoopOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanLoopResult == false)
            return false;
        DescribeHumanLoopResult other = (DescribeHumanLoopResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getHumanLoopStatus() == null ^ this.getHumanLoopStatus() == null)
            return false;
        if (other.getHumanLoopStatus() != null && other.getHumanLoopStatus().equals(this.getHumanLoopStatus()) == false)
            return false;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getHumanLoopArn() == null ^ this.getHumanLoopArn() == null)
            return false;
        if (other.getHumanLoopArn() != null && other.getHumanLoopArn().equals(this.getHumanLoopArn()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getHumanLoopOutput() == null ^ this.getHumanLoopOutput() == null)
            return false;
        if (other.getHumanLoopOutput() != null && other.getHumanLoopOutput().equals(this.getHumanLoopOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopStatus() == null) ? 0 : getHumanLoopStatus().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopArn() == null) ? 0 : getHumanLoopArn().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopOutput() == null) ? 0 : getHumanLoopOutput().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHumanLoopResult clone() {
        try {
            return (DescribeHumanLoopResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
