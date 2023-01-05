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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The name of the application configured in Application Discovery Service.
     * </p>
     */
    private String adsApplicationName;
    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the migration workflow was last started.
     * </p>
     */
    private java.util.Date lastStartTime;
    /**
     * <p>
     * The time at which the migration workflow was last stopped.
     * </p>
     */
    private java.util.Date lastStopTime;
    /**
     * <p>
     * The time at which the migration workflow was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * The total number of steps in the migration workflow.
     * </p>
     */
    private Integer totalSteps;
    /**
     * <p>
     * Get a list of completed steps in the migration workflow.
     * </p>
     */
    private Integer completedSteps;
    /**
     * <p>
     * The inputs required for creating the migration workflow.
     * </p>
     */
    private java.util.Map<String, StepInput> workflowInputs;
    /**
     * <p>
     * The tags added to the migration workflow.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon S3 bucket where the migration logs are stored.
     * </p>
     */
    private String workflowBucket;

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

    public GetWorkflowResult withId(String id) {
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

    public GetWorkflowResult withArn(String arn) {
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

    public GetWorkflowResult withName(String name) {
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

    public GetWorkflowResult withDescription(String description) {
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

    public GetWorkflowResult withTemplateId(String templateId) {
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

    public GetWorkflowResult withAdsApplicationConfigurationId(String adsApplicationConfigurationId) {
        setAdsApplicationConfigurationId(adsApplicationConfigurationId);
        return this;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationName
     *        The name of the application configured in Application Discovery Service.
     */

    public void setAdsApplicationName(String adsApplicationName) {
        this.adsApplicationName = adsApplicationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @return The name of the application configured in Application Discovery Service.
     */

    public String getAdsApplicationName() {
        return this.adsApplicationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationName
     *        The name of the application configured in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withAdsApplicationName(String adsApplicationName) {
        setAdsApplicationName(adsApplicationName);
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

    public GetWorkflowResult withStatus(String status) {
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

    public GetWorkflowResult withStatus(MigrationWorkflowStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @return The status message of the migration workflow.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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

    public GetWorkflowResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was last started.
     * </p>
     * 
     * @param lastStartTime
     *        The time at which the migration workflow was last started.
     */

    public void setLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last started.
     * </p>
     * 
     * @return The time at which the migration workflow was last started.
     */

    public java.util.Date getLastStartTime() {
        return this.lastStartTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last started.
     * </p>
     * 
     * @param lastStartTime
     *        The time at which the migration workflow was last started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withLastStartTime(java.util.Date lastStartTime) {
        setLastStartTime(lastStartTime);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was last stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time at which the migration workflow was last stopped.
     */

    public void setLastStopTime(java.util.Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last stopped.
     * </p>
     * 
     * @return The time at which the migration workflow was last stopped.
     */

    public java.util.Date getLastStopTime() {
        return this.lastStopTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time at which the migration workflow was last stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withLastStopTime(java.util.Date lastStopTime) {
        setLastStopTime(lastStopTime);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the migration workflow was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last modified.
     * </p>
     * 
     * @return The time at which the migration workflow was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the migration workflow was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the migration workflow ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @return The time at which the migration workflow ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the migration workflow ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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

    public GetWorkflowResult withTools(Tool... tools) {
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

    public GetWorkflowResult withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * The total number of steps in the migration workflow.
     * </p>
     * 
     * @param totalSteps
     *        The total number of steps in the migration workflow.
     */

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    /**
     * <p>
     * The total number of steps in the migration workflow.
     * </p>
     * 
     * @return The total number of steps in the migration workflow.
     */

    public Integer getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * <p>
     * The total number of steps in the migration workflow.
     * </p>
     * 
     * @param totalSteps
     *        The total number of steps in the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withTotalSteps(Integer totalSteps) {
        setTotalSteps(totalSteps);
        return this;
    }

    /**
     * <p>
     * Get a list of completed steps in the migration workflow.
     * </p>
     * 
     * @param completedSteps
     *        Get a list of completed steps in the migration workflow.
     */

    public void setCompletedSteps(Integer completedSteps) {
        this.completedSteps = completedSteps;
    }

    /**
     * <p>
     * Get a list of completed steps in the migration workflow.
     * </p>
     * 
     * @return Get a list of completed steps in the migration workflow.
     */

    public Integer getCompletedSteps() {
        return this.completedSteps;
    }

    /**
     * <p>
     * Get a list of completed steps in the migration workflow.
     * </p>
     * 
     * @param completedSteps
     *        Get a list of completed steps in the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withCompletedSteps(Integer completedSteps) {
        setCompletedSteps(completedSteps);
        return this;
    }

    /**
     * <p>
     * The inputs required for creating the migration workflow.
     * </p>
     * 
     * @return The inputs required for creating the migration workflow.
     */

    public java.util.Map<String, StepInput> getWorkflowInputs() {
        return workflowInputs;
    }

    /**
     * <p>
     * The inputs required for creating the migration workflow.
     * </p>
     * 
     * @param workflowInputs
     *        The inputs required for creating the migration workflow.
     */

    public void setWorkflowInputs(java.util.Map<String, StepInput> workflowInputs) {
        this.workflowInputs = workflowInputs;
    }

    /**
     * <p>
     * The inputs required for creating the migration workflow.
     * </p>
     * 
     * @param workflowInputs
     *        The inputs required for creating the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withWorkflowInputs(java.util.Map<String, StepInput> workflowInputs) {
        setWorkflowInputs(workflowInputs);
        return this;
    }

    /**
     * Add a single WorkflowInputs entry
     *
     * @see GetWorkflowResult#withWorkflowInputs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult addWorkflowInputsEntry(String key, StepInput value) {
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

    public GetWorkflowResult clearWorkflowInputsEntries() {
        this.workflowInputs = null;
        return this;
    }

    /**
     * <p>
     * The tags added to the migration workflow.
     * </p>
     * 
     * @return The tags added to the migration workflow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags added to the migration workflow.
     * </p>
     * 
     * @param tags
     *        The tags added to the migration workflow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags added to the migration workflow.
     * </p>
     * 
     * @param tags
     *        The tags added to the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetWorkflowResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult addTagsEntry(String key, String value) {
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

    public GetWorkflowResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the migration logs are stored.
     * </p>
     * 
     * @param workflowBucket
     *        The Amazon S3 bucket where the migration logs are stored.
     */

    public void setWorkflowBucket(String workflowBucket) {
        this.workflowBucket = workflowBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the migration logs are stored.
     * </p>
     * 
     * @return The Amazon S3 bucket where the migration logs are stored.
     */

    public String getWorkflowBucket() {
        return this.workflowBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the migration logs are stored.
     * </p>
     * 
     * @param workflowBucket
     *        The Amazon S3 bucket where the migration logs are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withWorkflowBucket(String workflowBucket) {
        setWorkflowBucket(workflowBucket);
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
        if (getAdsApplicationName() != null)
            sb.append("AdsApplicationName: ").append(getAdsApplicationName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastStartTime() != null)
            sb.append("LastStartTime: ").append(getLastStartTime()).append(",");
        if (getLastStopTime() != null)
            sb.append("LastStopTime: ").append(getLastStopTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getTotalSteps() != null)
            sb.append("TotalSteps: ").append(getTotalSteps()).append(",");
        if (getCompletedSteps() != null)
            sb.append("CompletedSteps: ").append(getCompletedSteps()).append(",");
        if (getWorkflowInputs() != null)
            sb.append("WorkflowInputs: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkflowBucket() != null)
            sb.append("WorkflowBucket: ").append(getWorkflowBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowResult == false)
            return false;
        GetWorkflowResult other = (GetWorkflowResult) obj;
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
        if (other.getAdsApplicationName() == null ^ this.getAdsApplicationName() == null)
            return false;
        if (other.getAdsApplicationName() != null && other.getAdsApplicationName().equals(this.getAdsApplicationName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastStartTime() == null ^ this.getLastStartTime() == null)
            return false;
        if (other.getLastStartTime() != null && other.getLastStartTime().equals(this.getLastStartTime()) == false)
            return false;
        if (other.getLastStopTime() == null ^ this.getLastStopTime() == null)
            return false;
        if (other.getLastStopTime() != null && other.getLastStopTime().equals(this.getLastStopTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getTotalSteps() == null ^ this.getTotalSteps() == null)
            return false;
        if (other.getTotalSteps() != null && other.getTotalSteps().equals(this.getTotalSteps()) == false)
            return false;
        if (other.getCompletedSteps() == null ^ this.getCompletedSteps() == null)
            return false;
        if (other.getCompletedSteps() != null && other.getCompletedSteps().equals(this.getCompletedSteps()) == false)
            return false;
        if (other.getWorkflowInputs() == null ^ this.getWorkflowInputs() == null)
            return false;
        if (other.getWorkflowInputs() != null && other.getWorkflowInputs().equals(this.getWorkflowInputs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkflowBucket() == null ^ this.getWorkflowBucket() == null)
            return false;
        if (other.getWorkflowBucket() != null && other.getWorkflowBucket().equals(this.getWorkflowBucket()) == false)
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
        hashCode = prime * hashCode + ((getAdsApplicationName() == null) ? 0 : getAdsApplicationName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastStartTime() == null) ? 0 : getLastStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastStopTime() == null) ? 0 : getLastStopTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getTotalSteps() == null) ? 0 : getTotalSteps().hashCode());
        hashCode = prime * hashCode + ((getCompletedSteps() == null) ? 0 : getCompletedSteps().hashCode());
        hashCode = prime * hashCode + ((getWorkflowInputs() == null) ? 0 : getWorkflowInputs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkflowBucket() == null) ? 0 : getWorkflowBucket().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowResult clone() {
        try {
            return (GetWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
