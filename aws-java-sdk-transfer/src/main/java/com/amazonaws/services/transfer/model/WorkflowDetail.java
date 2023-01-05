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
 * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the workflow.
 * </p>
 * <p>
 * In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can also
 * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs when
 * a file is open when the session disconnects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/WorkflowDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all
     * workflow steps can operate on the required resources
     * </p>
     */
    private String executionRole;

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

    public WorkflowDetail withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all
     * workflow steps can operate on the required resources
     * </p>
     * 
     * @param executionRole
     *        Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that
     *        all workflow steps can operate on the required resources
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all
     * workflow steps can operate on the required resources
     * </p>
     * 
     * @return Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that
     *         all workflow steps can operate on the required resources
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all
     * workflow steps can operate on the required resources
     * </p>
     * 
     * @param executionRole
     *        Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that
     *        all workflow steps can operate on the required resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetail withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowDetail == false)
            return false;
        WorkflowDetail other = (WorkflowDetail) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowDetail clone() {
        try {
            return (WorkflowDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.WorkflowDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
