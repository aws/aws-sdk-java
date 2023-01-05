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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A textual description for the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently, copying and tagging are supported only on S3.
     * </p>
     * </note>
     * <p>
     * For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * </p>
     */
    private java.util.List<WorkflowStep> steps;
    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <note>
     * <p>
     * For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off the
     * exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out, the
     * exception steps are executed.
     * </p>
     * </note>
     */
    private java.util.List<WorkflowStep> onExceptionSteps;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for
     * any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A textual description for the workflow.
     * </p>
     * 
     * @param description
     *        A textual description for the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A textual description for the workflow.
     * </p>
     * 
     * @return A textual description for the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A textual description for the workflow.
     * </p>
     * 
     * @param description
     *        A textual description for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently, copying and tagging are supported only on S3.
     * </p>
     * </note>
     * <p>
     * For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * </p>
     * 
     * @return Specifies the details for the steps that are in the specified workflow.</p>
     *         <p>
     *         The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>COPY</i>: Copy the file to another location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DELETE</i>: Delete the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TAG</i>: Add a tag to the file.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Currently, copying and tagging are supported only on S3.
     *         </p>
     *         </note>
     *         <p>
     *         For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     */

    public java.util.List<WorkflowStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently, copying and tagging are supported only on S3.
     * </p>
     * </note>
     * <p>
     * For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.</p>
     *        <p>
     *        The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently, copying and tagging are supported only on S3.
     *        </p>
     *        </note>
     *        <p>
     *        For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     */

    public void setSteps(java.util.Collection<WorkflowStep> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<WorkflowStep>(steps);
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently, copying and tagging are supported only on S3.
     * </p>
     * </note>
     * <p>
     * For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.</p>
     *        <p>
     *        The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently, copying and tagging are supported only on S3.
     *        </p>
     *        </note>
     *        <p>
     *        For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withSteps(WorkflowStep... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<WorkflowStep>(steps.length));
        }
        for (WorkflowStep ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently, copying and tagging are supported only on S3.
     * </p>
     * </note>
     * <p>
     * For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.</p>
     *        <p>
     *        The <code>TYPE</code> specifies which of the following actions is being taken for this step.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently, copying and tagging are supported only on S3.
     *        </p>
     *        </note>
     *        <p>
     *        For file location, you specify either the S3 bucket and key, or the EFS file system ID and path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withSteps(java.util.Collection<WorkflowStep> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <note>
     * <p>
     * For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off the
     * exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out, the
     * exception steps are executed.
     * </p>
     * </note>
     * 
     * @return Specifies the steps (actions) to take if errors are encountered during execution of the workflow.</p>
     *         <note>
     *         <p>
     *         For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off
     *         the exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out,
     *         the exception steps are executed.
     *         </p>
     */

    public java.util.List<WorkflowStep> getOnExceptionSteps() {
        return onExceptionSteps;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <note>
     * <p>
     * For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off the
     * exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out, the
     * exception steps are executed.
     * </p>
     * </note>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.</p>
     *        <note>
     *        <p>
     *        For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off
     *        the exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out,
     *        the exception steps are executed.
     *        </p>
     */

    public void setOnExceptionSteps(java.util.Collection<WorkflowStep> onExceptionSteps) {
        if (onExceptionSteps == null) {
            this.onExceptionSteps = null;
            return;
        }

        this.onExceptionSteps = new java.util.ArrayList<WorkflowStep>(onExceptionSteps);
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <note>
     * <p>
     * For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off the
     * exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out, the
     * exception steps are executed.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnExceptionSteps(java.util.Collection)} or {@link #withOnExceptionSteps(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.</p>
     *        <note>
     *        <p>
     *        For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off
     *        the exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out,
     *        the exception steps are executed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withOnExceptionSteps(WorkflowStep... onExceptionSteps) {
        if (this.onExceptionSteps == null) {
            setOnExceptionSteps(new java.util.ArrayList<WorkflowStep>(onExceptionSteps.length));
        }
        for (WorkflowStep ele : onExceptionSteps) {
            this.onExceptionSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <note>
     * <p>
     * For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off the
     * exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out, the
     * exception steps are executed.
     * </p>
     * </note>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.</p>
     *        <note>
     *        <p>
     *        For custom steps, the lambda function needs to send <code>FAILURE</code> to the call back API to kick off
     *        the exception steps. Additionally, if the lambda does not send <code>SUCCESS</code> before it times out,
     *        the exception steps are executed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withOnExceptionSteps(java.util.Collection<WorkflowStep> onExceptionSteps) {
        setOnExceptionSteps(onExceptionSteps);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for
     * any purpose.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to
     *         workflows for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for
     * any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to
     *        workflows for any purpose.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for
     * any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to
     *        workflows for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for
     * any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to
     *        workflows for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getOnExceptionSteps() != null)
            sb.append("OnExceptionSteps: ").append(getOnExceptionSteps()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkflowRequest == false)
            return false;
        CreateWorkflowRequest other = (CreateWorkflowRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getOnExceptionSteps() == null ^ this.getOnExceptionSteps() == null)
            return false;
        if (other.getOnExceptionSteps() != null && other.getOnExceptionSteps().equals(this.getOnExceptionSteps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getOnExceptionSteps() == null) ? 0 : getOnExceptionSteps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowRequest clone() {
        return (CreateWorkflowRequest) super.clone();
    }

}
