/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StartFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     */
    private String flowArn;
    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     */
    private String flowStatus;
    /**
     * <p>
     * Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered
     * flows, this value is null.
     * </p>
     */
    private String executionId;

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param flowArn
     *        The flow's Amazon Resource Name (ARN).
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The flow's Amazon Resource Name (ARN).
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param flowArn
     *        The flow's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFlowResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @see FlowStatus
     */

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @return Indicates the current status of the flow.
     * @see FlowStatus
     */

    public String getFlowStatus() {
        return this.flowStatus;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public StartFlowResult withFlowStatus(String flowStatus) {
        setFlowStatus(flowStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public StartFlowResult withFlowStatus(FlowStatus flowStatus) {
        this.flowStatus = flowStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered
     * flows, this value is null.
     * </p>
     * 
     * @param executionId
     *        Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or
     *        event-triggered flows, this value is null.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered
     * flows, this value is null.
     * </p>
     * 
     * @return Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or
     *         event-triggered flows, this value is null.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered
     * flows, this value is null.
     * </p>
     * 
     * @param executionId
     *        Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or
     *        event-triggered flows, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFlowResult withExecutionId(String executionId) {
        setExecutionId(executionId);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getFlowStatus() != null)
            sb.append("FlowStatus: ").append(getFlowStatus()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFlowResult == false)
            return false;
        StartFlowResult other = (StartFlowResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getFlowStatus() == null ^ this.getFlowStatus() == null)
            return false;
        if (other.getFlowStatus() != null && other.getFlowStatus().equals(this.getFlowStatus()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getFlowStatus() == null) ? 0 : getFlowStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public StartFlowResult clone() {
        try {
            return (StartFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
