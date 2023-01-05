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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateIntegrationWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * A message indicating create request was received.
     * </p>
     */
    private String message;

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

    public CreateIntegrationWorkflowResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * A message indicating create request was received.
     * </p>
     * 
     * @param message
     *        A message indicating create request was received.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message indicating create request was received.
     * </p>
     * 
     * @return A message indicating create request was received.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message indicating create request was received.
     * </p>
     * 
     * @param message
     *        A message indicating create request was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowResult withMessage(String message) {
        setMessage(message);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationWorkflowResult == false)
            return false;
        CreateIntegrationWorkflowResult other = (CreateIntegrationWorkflowResult) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationWorkflowResult clone() {
        try {
            return (CreateIntegrationWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
