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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowStepExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowStepExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * </p>
     */
    private java.util.List<WorkflowStepMetadata> steps;
    /**
     * <p>
     * The build version ARN for the Image Builder workflow resource that defines the steps for this runtime instance of
     * the workflow.
     * </p>
     */
    private String workflowBuildVersionArn;
    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     */
    private String workflowExecutionId;
    /**
     * <p>
     * The image build version resource ARN that's associated with the specified runtime instance of the workflow.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The output message from the list action, if applicable.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * </p>
     * 
     * @return Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     */

    public java.util.List<WorkflowStepMetadata> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * </p>
     * 
     * @param steps
     *        Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     */

    public void setSteps(java.util.Collection<WorkflowStepMetadata> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<WorkflowStepMetadata>(steps);
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withSteps(WorkflowStepMetadata... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<WorkflowStepMetadata>(steps.length));
        }
        for (WorkflowStepMetadata ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * </p>
     * 
     * @param steps
     *        Contains an array of runtime details that represents each step in this runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withSteps(java.util.Collection<WorkflowStepMetadata> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * The build version ARN for the Image Builder workflow resource that defines the steps for this runtime instance of
     * the workflow.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The build version ARN for the Image Builder workflow resource that defines the steps for this runtime
     *        instance of the workflow.
     */

    public void setWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        this.workflowBuildVersionArn = workflowBuildVersionArn;
    }

    /**
     * <p>
     * The build version ARN for the Image Builder workflow resource that defines the steps for this runtime instance of
     * the workflow.
     * </p>
     * 
     * @return The build version ARN for the Image Builder workflow resource that defines the steps for this runtime
     *         instance of the workflow.
     */

    public String getWorkflowBuildVersionArn() {
        return this.workflowBuildVersionArn;
    }

    /**
     * <p>
     * The build version ARN for the Image Builder workflow resource that defines the steps for this runtime instance of
     * the workflow.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The build version ARN for the Image Builder workflow resource that defines the steps for this runtime
     *        instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        setWorkflowBuildVersionArn(workflowBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *        workflow.
     */

    public void setWorkflowExecutionId(String workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @return The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *         workflow.
     */

    public String getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withWorkflowExecutionId(String workflowExecutionId) {
        setWorkflowExecutionId(workflowExecutionId);
        return this;
    }

    /**
     * <p>
     * The image build version resource ARN that's associated with the specified runtime instance of the workflow.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The image build version resource ARN that's associated with the specified runtime instance of the
     *        workflow.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The image build version resource ARN that's associated with the specified runtime instance of the workflow.
     * </p>
     * 
     * @return The image build version resource ARN that's associated with the specified runtime instance of the
     *         workflow.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The image build version resource ARN that's associated with the specified runtime instance of the workflow.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The image build version resource ARN that's associated with the specified runtime instance of the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The output message from the list action, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the list action, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The output message from the list action, if applicable.
     * </p>
     * 
     * @return The output message from the list action, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The output message from the list action, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the list action, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this field isn't empty, there are additional elements
     *         that the service hasn't included in this request. Use this token with the next request to retrieve
     *         additional objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepExecutionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getWorkflowBuildVersionArn() != null)
            sb.append("WorkflowBuildVersionArn: ").append(getWorkflowBuildVersionArn()).append(",");
        if (getWorkflowExecutionId() != null)
            sb.append("WorkflowExecutionId: ").append(getWorkflowExecutionId()).append(",");
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowStepExecutionsResult == false)
            return false;
        ListWorkflowStepExecutionsResult other = (ListWorkflowStepExecutionsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getWorkflowBuildVersionArn() == null ^ this.getWorkflowBuildVersionArn() == null)
            return false;
        if (other.getWorkflowBuildVersionArn() != null && other.getWorkflowBuildVersionArn().equals(this.getWorkflowBuildVersionArn()) == false)
            return false;
        if (other.getWorkflowExecutionId() == null ^ this.getWorkflowExecutionId() == null)
            return false;
        if (other.getWorkflowExecutionId() != null && other.getWorkflowExecutionId().equals(this.getWorkflowExecutionId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getWorkflowBuildVersionArn() == null) ? 0 : getWorkflowBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionId() == null) ? 0 : getWorkflowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowStepExecutionsResult clone() {
        try {
            return (ListWorkflowStepExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
