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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetWorkflowSteps" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * List containing workflow step details.
     * </p>
     */
    private java.util.List<WorkflowStepItem> items;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @return Unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepsResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @return The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowStepsResult withWorkflowType(String workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowStepsResult withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
        return this;
    }

    /**
     * <p>
     * List containing workflow step details.
     * </p>
     * 
     * @return List containing workflow step details.
     */

    public java.util.List<WorkflowStepItem> getItems() {
        return items;
    }

    /**
     * <p>
     * List containing workflow step details.
     * </p>
     * 
     * @param items
     *        List containing workflow step details.
     */

    public void setItems(java.util.Collection<WorkflowStepItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<WorkflowStepItem>(items);
    }

    /**
     * <p>
     * List containing workflow step details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        List containing workflow step details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepsResult withItems(WorkflowStepItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<WorkflowStepItem>(items.length));
        }
        for (WorkflowStepItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List containing workflow step details.
     * </p>
     * 
     * @param items
     *        List containing workflow step details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepsResult withItems(java.util.Collection<WorkflowStepItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepsResult withNextToken(String nextToken) {
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof GetWorkflowStepsResult == false)
            return false;
        GetWorkflowStepsResult other = (GetWorkflowStepsResult) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowStepsResult clone() {
        try {
            return (GetWorkflowStepsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
