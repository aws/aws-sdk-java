/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendWorkflowStepStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     * </p>
     */
    private String token;
    /**
     * <p>
     * Indicates whether the specified step succeeded or failed.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @return A unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepStateRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the execution of a workflow.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @return A unique identifier for the execution of a workflow.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the execution of a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepStateRequest withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     * </p>
     * 
     * @param token
     *        Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     * </p>
     * 
     * @return Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     * </p>
     * 
     * @param token
     *        Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepStateRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * Indicates whether the specified step succeeded or failed.
     * </p>
     * 
     * @param status
     *        Indicates whether the specified step succeeded or failed.
     * @see CustomStepStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether the specified step succeeded or failed.
     * </p>
     * 
     * @return Indicates whether the specified step succeeded or failed.
     * @see CustomStepStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether the specified step succeeded or failed.
     * </p>
     * 
     * @param status
     *        Indicates whether the specified step succeeded or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomStepStatus
     */

    public SendWorkflowStepStateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the specified step succeeded or failed.
     * </p>
     * 
     * @param status
     *        Indicates whether the specified step succeeded or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomStepStatus
     */

    public SendWorkflowStepStateRequest withStatus(CustomStepStatus status) {
        this.status = status.toString();
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendWorkflowStepStateRequest == false)
            return false;
        SendWorkflowStepStateRequest other = (SendWorkflowStepStateRequest) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SendWorkflowStepStateRequest clone() {
        return (SendWorkflowStepStateRequest) super.clone();
    }

}
