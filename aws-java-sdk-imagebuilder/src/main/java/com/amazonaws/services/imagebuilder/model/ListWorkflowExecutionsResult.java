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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * Contains an array of runtime details that represents each time a workflow ran for the requested image build
     * version.
     * </p>
     */
    private java.util.List<WorkflowExecutionMetadata> workflowExecutions;
    /**
     * <p>
     * The resource ARN of the image build version for which you requested a list of workflow runtime details.
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

    public ListWorkflowExecutionsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each time a workflow ran for the requested image build
     * version.
     * </p>
     * 
     * @return Contains an array of runtime details that represents each time a workflow ran for the requested image
     *         build version.
     */

    public java.util.List<WorkflowExecutionMetadata> getWorkflowExecutions() {
        return workflowExecutions;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each time a workflow ran for the requested image build
     * version.
     * </p>
     * 
     * @param workflowExecutions
     *        Contains an array of runtime details that represents each time a workflow ran for the requested image
     *        build version.
     */

    public void setWorkflowExecutions(java.util.Collection<WorkflowExecutionMetadata> workflowExecutions) {
        if (workflowExecutions == null) {
            this.workflowExecutions = null;
            return;
        }

        this.workflowExecutions = new java.util.ArrayList<WorkflowExecutionMetadata>(workflowExecutions);
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each time a workflow ran for the requested image build
     * version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowExecutions(java.util.Collection)} or {@link #withWorkflowExecutions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param workflowExecutions
     *        Contains an array of runtime details that represents each time a workflow ran for the requested image
     *        build version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowExecutionsResult withWorkflowExecutions(WorkflowExecutionMetadata... workflowExecutions) {
        if (this.workflowExecutions == null) {
            setWorkflowExecutions(new java.util.ArrayList<WorkflowExecutionMetadata>(workflowExecutions.length));
        }
        for (WorkflowExecutionMetadata ele : workflowExecutions) {
            this.workflowExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of runtime details that represents each time a workflow ran for the requested image build
     * version.
     * </p>
     * 
     * @param workflowExecutions
     *        Contains an array of runtime details that represents each time a workflow ran for the requested image
     *        build version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowExecutionsResult withWorkflowExecutions(java.util.Collection<WorkflowExecutionMetadata> workflowExecutions) {
        setWorkflowExecutions(workflowExecutions);
        return this;
    }

    /**
     * <p>
     * The resource ARN of the image build version for which you requested a list of workflow runtime details.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The resource ARN of the image build version for which you requested a list of workflow runtime details.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The resource ARN of the image build version for which you requested a list of workflow runtime details.
     * </p>
     * 
     * @return The resource ARN of the image build version for which you requested a list of workflow runtime details.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The resource ARN of the image build version for which you requested a list of workflow runtime details.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The resource ARN of the image build version for which you requested a list of workflow runtime details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowExecutionsResult withImageBuildVersionArn(String imageBuildVersionArn) {
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

    public ListWorkflowExecutionsResult withMessage(String message) {
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

    public ListWorkflowExecutionsResult withNextToken(String nextToken) {
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
        if (getWorkflowExecutions() != null)
            sb.append("WorkflowExecutions: ").append(getWorkflowExecutions()).append(",");
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

        if (obj instanceof ListWorkflowExecutionsResult == false)
            return false;
        ListWorkflowExecutionsResult other = (ListWorkflowExecutionsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getWorkflowExecutions() == null ^ this.getWorkflowExecutions() == null)
            return false;
        if (other.getWorkflowExecutions() != null && other.getWorkflowExecutions().equals(this.getWorkflowExecutions()) == false)
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
        hashCode = prime * hashCode + ((getWorkflowExecutions() == null) ? 0 : getWorkflowExecutions().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowExecutionsResult clone() {
        try {
            return (ListWorkflowExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
