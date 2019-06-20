/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of workflow resource metadata.
     * </p>
     */
    private java.util.List<Workflow> workflows;
    /**
     * <p>
     * A list of names of workflows not found.
     * </p>
     */
    private java.util.List<String> missingWorkflows;

    /**
     * <p>
     * A list of workflow resource metadata.
     * </p>
     * 
     * @return A list of workflow resource metadata.
     */

    public java.util.List<Workflow> getWorkflows() {
        return workflows;
    }

    /**
     * <p>
     * A list of workflow resource metadata.
     * </p>
     * 
     * @param workflows
     *        A list of workflow resource metadata.
     */

    public void setWorkflows(java.util.Collection<Workflow> workflows) {
        if (workflows == null) {
            this.workflows = null;
            return;
        }

        this.workflows = new java.util.ArrayList<Workflow>(workflows);
    }

    /**
     * <p>
     * A list of workflow resource metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflows(java.util.Collection)} or {@link #withWorkflows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workflows
     *        A list of workflow resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsResult withWorkflows(Workflow... workflows) {
        if (this.workflows == null) {
            setWorkflows(new java.util.ArrayList<Workflow>(workflows.length));
        }
        for (Workflow ele : workflows) {
            this.workflows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow resource metadata.
     * </p>
     * 
     * @param workflows
     *        A list of workflow resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsResult withWorkflows(java.util.Collection<Workflow> workflows) {
        setWorkflows(workflows);
        return this;
    }

    /**
     * <p>
     * A list of names of workflows not found.
     * </p>
     * 
     * @return A list of names of workflows not found.
     */

    public java.util.List<String> getMissingWorkflows() {
        return missingWorkflows;
    }

    /**
     * <p>
     * A list of names of workflows not found.
     * </p>
     * 
     * @param missingWorkflows
     *        A list of names of workflows not found.
     */

    public void setMissingWorkflows(java.util.Collection<String> missingWorkflows) {
        if (missingWorkflows == null) {
            this.missingWorkflows = null;
            return;
        }

        this.missingWorkflows = new java.util.ArrayList<String>(missingWorkflows);
    }

    /**
     * <p>
     * A list of names of workflows not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingWorkflows(java.util.Collection)} or {@link #withMissingWorkflows(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param missingWorkflows
     *        A list of names of workflows not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsResult withMissingWorkflows(String... missingWorkflows) {
        if (this.missingWorkflows == null) {
            setMissingWorkflows(new java.util.ArrayList<String>(missingWorkflows.length));
        }
        for (String ele : missingWorkflows) {
            this.missingWorkflows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of workflows not found.
     * </p>
     * 
     * @param missingWorkflows
     *        A list of names of workflows not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsResult withMissingWorkflows(java.util.Collection<String> missingWorkflows) {
        setMissingWorkflows(missingWorkflows);
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
        if (getWorkflows() != null)
            sb.append("Workflows: ").append(getWorkflows()).append(",");
        if (getMissingWorkflows() != null)
            sb.append("MissingWorkflows: ").append(getMissingWorkflows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetWorkflowsResult == false)
            return false;
        BatchGetWorkflowsResult other = (BatchGetWorkflowsResult) obj;
        if (other.getWorkflows() == null ^ this.getWorkflows() == null)
            return false;
        if (other.getWorkflows() != null && other.getWorkflows().equals(this.getWorkflows()) == false)
            return false;
        if (other.getMissingWorkflows() == null ^ this.getMissingWorkflows() == null)
            return false;
        if (other.getMissingWorkflows() != null && other.getMissingWorkflows().equals(this.getMissingWorkflows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflows() == null) ? 0 : getWorkflows().hashCode());
        hashCode = prime * hashCode + ((getMissingWorkflows() == null) ? 0 : getMissingWorkflows().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetWorkflowsResult clone() {
        try {
            return (BatchGetWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
