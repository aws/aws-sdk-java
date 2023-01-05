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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the identifier, text description, and Amazon Resource Name (ARN) for the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedWorkflow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * Specifies the text description for the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * </p>
     */
    private String arn;

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

    public ListedWorkflow withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * Specifies the text description for the workflow.
     * </p>
     * 
     * @param description
     *        Specifies the text description for the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies the text description for the workflow.
     * </p>
     * 
     * @return Specifies the text description for the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies the text description for the workflow.
     * </p>
     * 
     * @param description
     *        Specifies the text description for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedWorkflow withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the workflow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) for the workflow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedWorkflow withArn(String arn) {
        setArn(arn);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedWorkflow == false)
            return false;
        ListedWorkflow other = (ListedWorkflow) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public ListedWorkflow clone() {
        try {
            return (ListedWorkflow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedWorkflowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
