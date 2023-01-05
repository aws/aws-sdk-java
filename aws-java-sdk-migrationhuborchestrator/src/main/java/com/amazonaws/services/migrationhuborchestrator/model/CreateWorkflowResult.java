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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The configuration ID of the application configured in Application Discovery Service.
     * </p>
     */
    private String adsApplicationConfigurationId;
    /**
     * <p>
     * The inputs for creating a migration workflow.
     * </p>
     */
    private java.util.Map<String, StepInput> workflowInputs;
    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     */
    private java.util.List<String> stepTargets;
    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The tags to add on a migration workflow.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @return The ID of the migration workflow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the migration workflow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the migration workflow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @return The name of the migration workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @param description
     *        The description of the migration workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @return The description of the migration workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @param description
     *        The description of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The configuration ID of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationId
     *        The configuration ID of the application configured in Application Discovery Service.
     */

    public void setAdsApplicationConfigurationId(String adsApplicationConfigurationId) {
        this.adsApplicationConfigurationId = adsApplicationConfigurationId;
    }

    /**
     * <p>
     * The configuration ID of the application configured in Application Discovery Service.
     * </p>
     * 
     * @return The configuration ID of the application configured in Application Discovery Service.
     */

    public String getAdsApplicationConfigurationId() {
        return this.adsApplicationConfigurationId;
    }

    /**
     * <p>
     * The configuration ID of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationId
     *        The configuration ID of the application configured in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withAdsApplicationConfigurationId(String adsApplicationConfigurationId) {
        setAdsApplicationConfigurationId(adsApplicationConfigurationId);
        return this;
    }

    /**
     * <p>
     * The inputs for creating a migration workflow.
     * </p>
     * 
     * @return The inputs for creating a migration workflow.
     */

    public java.util.Map<String, StepInput> getWorkflowInputs() {
        return workflowInputs;
    }

    /**
     * <p>
     * The inputs for creating a migration workflow.
     * </p>
     * 
     * @param workflowInputs
     *        The inputs for creating a migration workflow.
     */

    public void setWorkflowInputs(java.util.Map<String, StepInput> workflowInputs) {
        this.workflowInputs = workflowInputs;
    }

    /**
     * <p>
     * The inputs for creating a migration workflow.
     * </p>
     * 
     * @param workflowInputs
     *        The inputs for creating a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withWorkflowInputs(java.util.Map<String, StepInput> workflowInputs) {
        setWorkflowInputs(workflowInputs);
        return this;
    }

    /**
     * Add a single WorkflowInputs entry
     *
     * @see CreateWorkflowResult#withWorkflowInputs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult addWorkflowInputsEntry(String key, StepInput value) {
        if (null == this.workflowInputs) {
            this.workflowInputs = new java.util.HashMap<String, StepInput>();
        }
        if (this.workflowInputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.workflowInputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into WorkflowInputs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult clearWorkflowInputsEntries() {
        this.workflowInputs = null;
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @return The servers on which a step will be run.
     */

    public java.util.List<String> getStepTargets() {
        return stepTargets;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     */

    public void setStepTargets(java.util.Collection<String> stepTargets) {
        if (stepTargets == null) {
            this.stepTargets = null;
            return;
        }

        this.stepTargets = new java.util.ArrayList<String>(stepTargets);
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepTargets(java.util.Collection)} or {@link #withStepTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withStepTargets(String... stepTargets) {
        if (this.stepTargets == null) {
            setStepTargets(new java.util.ArrayList<String>(stepTargets.length));
        }
        for (String ele : stepTargets) {
            this.stepTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withStepTargets(java.util.Collection<String> stepTargets) {
        setStepTargets(stepTargets);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @return The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public CreateWorkflowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public CreateWorkflowResult withStatus(MigrationWorkflowStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the migration workflow was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @return The time at which the migration workflow was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the migration workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The tags to add on a migration workflow.
     * </p>
     * 
     * @return The tags to add on a migration workflow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add on a migration workflow.
     * </p>
     * 
     * @param tags
     *        The tags to add on a migration workflow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add on a migration workflow.
     * </p>
     * 
     * @param tags
     *        The tags to add on a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkflowResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getAdsApplicationConfigurationId() != null)
            sb.append("AdsApplicationConfigurationId: ").append(getAdsApplicationConfigurationId()).append(",");
        if (getWorkflowInputs() != null)
            sb.append("WorkflowInputs: ").append("***Sensitive Data Redacted***").append(",");
        if (getStepTargets() != null)
            sb.append("StepTargets: ").append(getStepTargets()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof CreateWorkflowResult == false)
            return false;
        CreateWorkflowResult other = (CreateWorkflowResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getAdsApplicationConfigurationId() == null ^ this.getAdsApplicationConfigurationId() == null)
            return false;
        if (other.getAdsApplicationConfigurationId() != null
                && other.getAdsApplicationConfigurationId().equals(this.getAdsApplicationConfigurationId()) == false)
            return false;
        if (other.getWorkflowInputs() == null ^ this.getWorkflowInputs() == null)
            return false;
        if (other.getWorkflowInputs() != null && other.getWorkflowInputs().equals(this.getWorkflowInputs()) == false)
            return false;
        if (other.getStepTargets() == null ^ this.getStepTargets() == null)
            return false;
        if (other.getStepTargets() != null && other.getStepTargets().equals(this.getStepTargets()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAdsApplicationConfigurationId() == null) ? 0 : getAdsApplicationConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowInputs() == null) ? 0 : getWorkflowInputs().hashCode());
        hashCode = prime * hashCode + ((getStepTargets() == null) ? 0 : getStepTargets().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowResult clone() {
        try {
            return (CreateWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
