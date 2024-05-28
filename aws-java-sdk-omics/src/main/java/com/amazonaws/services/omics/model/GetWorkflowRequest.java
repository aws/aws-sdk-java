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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The workflow's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The workflow's type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The export format for the workflow.
     * </p>
     */
    private java.util.List<String> export;
    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     */
    private String workflowOwnerId;

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @param id
     *        The workflow's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @return The workflow's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @param id
     *        The workflow's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @return The workflow's type.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowRequest withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The export format for the workflow.
     * </p>
     * 
     * @return The export format for the workflow.
     * @see WorkflowExport
     */

    public java.util.List<String> getExport() {
        return export;
    }

    /**
     * <p>
     * The export format for the workflow.
     * </p>
     * 
     * @param export
     *        The export format for the workflow.
     * @see WorkflowExport
     */

    public void setExport(java.util.Collection<String> export) {
        if (export == null) {
            this.export = null;
            return;
        }

        this.export = new java.util.ArrayList<String>(export);
    }

    /**
     * <p>
     * The export format for the workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExport(java.util.Collection)} or {@link #withExport(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param export
     *        The export format for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExport
     */

    public GetWorkflowRequest withExport(String... export) {
        if (this.export == null) {
            setExport(new java.util.ArrayList<String>(export.length));
        }
        for (String ele : export) {
            this.export.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The export format for the workflow.
     * </p>
     * 
     * @param export
     *        The export format for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExport
     */

    public GetWorkflowRequest withExport(java.util.Collection<String> export) {
        setExport(export);
        return this;
    }

    /**
     * <p>
     * The export format for the workflow.
     * </p>
     * 
     * @param export
     *        The export format for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExport
     */

    public GetWorkflowRequest withExport(WorkflowExport... export) {
        java.util.ArrayList<String> exportCopy = new java.util.ArrayList<String>(export.length);
        for (WorkflowExport value : export) {
            exportCopy.add(value.toString());
        }
        if (getExport() == null) {
            setExport(exportCopy);
        } else {
            getExport().addAll(exportCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @param workflowOwnerId
     *        The ID of the workflow owner.
     */

    public void setWorkflowOwnerId(String workflowOwnerId) {
        this.workflowOwnerId = workflowOwnerId;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @return The ID of the workflow owner.
     */

    public String getWorkflowOwnerId() {
        return this.workflowOwnerId;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @param workflowOwnerId
     *        The ID of the workflow owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRequest withWorkflowOwnerId(String workflowOwnerId) {
        setWorkflowOwnerId(workflowOwnerId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getExport() != null)
            sb.append("Export: ").append(getExport()).append(",");
        if (getWorkflowOwnerId() != null)
            sb.append("WorkflowOwnerId: ").append(getWorkflowOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRequest == false)
            return false;
        GetWorkflowRequest other = (GetWorkflowRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExport() == null ^ this.getExport() == null)
            return false;
        if (other.getExport() != null && other.getExport().equals(this.getExport()) == false)
            return false;
        if (other.getWorkflowOwnerId() == null ^ this.getWorkflowOwnerId() == null)
            return false;
        if (other.getWorkflowOwnerId() != null && other.getWorkflowOwnerId().equals(this.getWorkflowOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExport() == null) ? 0 : getExport().hashCode());
        hashCode = prime * hashCode + ((getWorkflowOwnerId() == null) ? 0 : getWorkflowOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRequest clone() {
        return (GetWorkflowRequest) super.clone();
    }

}
