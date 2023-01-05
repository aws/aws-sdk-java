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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The inputs provided for the creation of the migration workflow.
     * </p>
     */
    private java.util.List<TemplateInput> inputs;
    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * The status of the template.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param id
     *        The ID of the template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param id
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @return The name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @param description
     *        The time at which the template was last created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @return The time at which the template was last created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @param description
     *        The time at which the template was last created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The inputs provided for the creation of the migration workflow.
     * </p>
     * 
     * @return The inputs provided for the creation of the migration workflow.
     */

    public java.util.List<TemplateInput> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The inputs provided for the creation of the migration workflow.
     * </p>
     * 
     * @param inputs
     *        The inputs provided for the creation of the migration workflow.
     */

    public void setInputs(java.util.Collection<TemplateInput> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<TemplateInput>(inputs);
    }

    /**
     * <p>
     * The inputs provided for the creation of the migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The inputs provided for the creation of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withInputs(TemplateInput... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<TemplateInput>(inputs.length));
        }
        for (TemplateInput ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inputs provided for the creation of the migration workflow.
     * </p>
     * 
     * @param inputs
     *        The inputs provided for the creation of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withInputs(java.util.Collection<TemplateInput> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @return List of AWS services utilized in a migration workflow.
     */

    public java.util.List<Tool> getTools() {
        return tools;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     */

    public void setTools(java.util.Collection<Tool> tools) {
        if (tools == null) {
            this.tools = null;
            return;
        }

        this.tools = new java.util.ArrayList<Tool>(tools);
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTools(java.util.Collection)} or {@link #withTools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTools(Tool... tools) {
        if (this.tools == null) {
            setTools(new java.util.ArrayList<Tool>(tools.length));
        }
        for (Tool ele : tools) {
            this.tools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @see TemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @return The status of the template.
     * @see TemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public GetTemplateResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public GetTemplateResult withStatus(TemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the template was last created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @return The time at which the template was last created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the template was last created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the template was last created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateResult == false)
            return false;
        GetTemplateResult other = (GetTemplateResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateResult clone() {
        try {
            return (GetTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
