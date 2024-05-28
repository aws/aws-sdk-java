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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The attachments for the job. Attach files required for the job to run to a render job.
     * </p>
     */
    private Attachments attachments;
    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID of the farm to connect to the job.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     */
    private Integer maxFailedTasksCount;
    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     */
    private Integer maxRetriesPerTask;
    /**
     * <p>
     * The parameters for the job.
     * </p>
     */
    private java.util.Map<String, JobParameter> parameters;
    /**
     * <p>
     * The priority of the job on a scale of 1 to 100. The highest priority is 1.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The ID of the queue that the job is submitted to.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The storage profile ID for the storage profile to connect to the job.
     * </p>
     */
    private String storageProfileId;
    /**
     * <p>
     * The initial status of the job's tasks when they are created. Tasks that are created with a <code>SUSPENDED</code>
     * status will not run until you update their status.
     * </p>
     */
    private String targetTaskRunStatus;
    /**
     * <p>
     * The job template to use for this job.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The file type for the job template.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The attachments for the job. Attach files required for the job to run to a render job.
     * </p>
     * 
     * @param attachments
     *        The attachments for the job. Attach files required for the job to run to a render job.
     */

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    /**
     * <p>
     * The attachments for the job. Attach files required for the job to run to a render job.
     * </p>
     * 
     * @return The attachments for the job. Attach files required for the job to run to a render job.
     */

    public Attachments getAttachments() {
        return this.attachments;
    }

    /**
     * <p>
     * The attachments for the job. Attach files required for the job to run to a render job.
     * </p>
     * 
     * @param attachments
     *        The attachments for the job. Attach files required for the job to run to a render job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAttachments(Attachments attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the job.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the job.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the job.
     * </p>
     * 
     * @return The farm ID of the farm to connect to the job.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the job.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @param maxFailedTasksCount
     *        The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     */

    public void setMaxFailedTasksCount(Integer maxFailedTasksCount) {
        this.maxFailedTasksCount = maxFailedTasksCount;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @return The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     */

    public Integer getMaxFailedTasksCount() {
        return this.maxFailedTasksCount;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @param maxFailedTasksCount
     *        The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withMaxFailedTasksCount(Integer maxFailedTasksCount) {
        setMaxFailedTasksCount(maxFailedTasksCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries for a job.
     */

    public void setMaxRetriesPerTask(Integer maxRetriesPerTask) {
        this.maxRetriesPerTask = maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @return The maximum number of retries for a job.
     */

    public Integer getMaxRetriesPerTask() {
        return this.maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withMaxRetriesPerTask(Integer maxRetriesPerTask) {
        setMaxRetriesPerTask(maxRetriesPerTask);
        return this;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @return The parameters for the job.
     */

    public java.util.Map<String, JobParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @param parameters
     *        The parameters for the job.
     */

    public void setParameters(java.util.Map<String, JobParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @param parameters
     *        The parameters for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withParameters(java.util.Map<String, JobParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateJobRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest addParametersEntry(String key, JobParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, JobParameter>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The priority of the job on a scale of 1 to 100. The highest priority is 1.
     * </p>
     * 
     * @param priority
     *        The priority of the job on a scale of 1 to 100. The highest priority is 1.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the job on a scale of 1 to 100. The highest priority is 1.
     * </p>
     * 
     * @return The priority of the job on a scale of 1 to 100. The highest priority is 1.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the job on a scale of 1 to 100. The highest priority is 1.
     * </p>
     * 
     * @param priority
     *        The priority of the job on a scale of 1 to 100. The highest priority is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The ID of the queue that the job is submitted to.
     * </p>
     * 
     * @param queueId
     *        The ID of the queue that the job is submitted to.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The ID of the queue that the job is submitted to.
     * </p>
     * 
     * @return The ID of the queue that the job is submitted to.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The ID of the queue that the job is submitted to.
     * </p>
     * 
     * @param queueId
     *        The ID of the queue that the job is submitted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The storage profile ID for the storage profile to connect to the job.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID for the storage profile to connect to the job.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID for the storage profile to connect to the job.
     * </p>
     * 
     * @return The storage profile ID for the storage profile to connect to the job.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID for the storage profile to connect to the job.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID for the storage profile to connect to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
        return this;
    }

    /**
     * <p>
     * The initial status of the job's tasks when they are created. Tasks that are created with a <code>SUSPENDED</code>
     * status will not run until you update their status.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The initial status of the job's tasks when they are created. Tasks that are created with a
     *        <code>SUSPENDED</code> status will not run until you update their status.
     * @see CreateJobTargetTaskRunStatus
     */

    public void setTargetTaskRunStatus(String targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus;
    }

    /**
     * <p>
     * The initial status of the job's tasks when they are created. Tasks that are created with a <code>SUSPENDED</code>
     * status will not run until you update their status.
     * </p>
     * 
     * @return The initial status of the job's tasks when they are created. Tasks that are created with a
     *         <code>SUSPENDED</code> status will not run until you update their status.
     * @see CreateJobTargetTaskRunStatus
     */

    public String getTargetTaskRunStatus() {
        return this.targetTaskRunStatus;
    }

    /**
     * <p>
     * The initial status of the job's tasks when they are created. Tasks that are created with a <code>SUSPENDED</code>
     * status will not run until you update their status.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The initial status of the job's tasks when they are created. Tasks that are created with a
     *        <code>SUSPENDED</code> status will not run until you update their status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateJobTargetTaskRunStatus
     */

    public CreateJobRequest withTargetTaskRunStatus(String targetTaskRunStatus) {
        setTargetTaskRunStatus(targetTaskRunStatus);
        return this;
    }

    /**
     * <p>
     * The initial status of the job's tasks when they are created. Tasks that are created with a <code>SUSPENDED</code>
     * status will not run until you update their status.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The initial status of the job's tasks when they are created. Tasks that are created with a
     *        <code>SUSPENDED</code> status will not run until you update their status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateJobTargetTaskRunStatus
     */

    public CreateJobRequest withTargetTaskRunStatus(CreateJobTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The job template to use for this job.
     * </p>
     * 
     * @param template
     *        The job template to use for this job.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The job template to use for this job.
     * </p>
     * 
     * @return The job template to use for this job.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The job template to use for this job.
     * </p>
     * 
     * @param template
     *        The job template to use for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The file type for the job template.
     * </p>
     * 
     * @param templateType
     *        The file type for the job template.
     * @see JobTemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The file type for the job template.
     * </p>
     * 
     * @return The file type for the job template.
     * @see JobTemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The file type for the job template.
     * </p>
     * 
     * @param templateType
     *        The file type for the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTemplateType
     */

    public CreateJobRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The file type for the job template.
     * </p>
     * 
     * @param templateType
     *        The file type for the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTemplateType
     */

    public CreateJobRequest withTemplateType(JobTemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getMaxFailedTasksCount() != null)
            sb.append("MaxFailedTasksCount: ").append(getMaxFailedTasksCount()).append(",");
        if (getMaxRetriesPerTask() != null)
            sb.append("MaxRetriesPerTask: ").append(getMaxRetriesPerTask()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId()).append(",");
        if (getTargetTaskRunStatus() != null)
            sb.append("TargetTaskRunStatus: ").append(getTargetTaskRunStatus()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getMaxFailedTasksCount() == null ^ this.getMaxFailedTasksCount() == null)
            return false;
        if (other.getMaxFailedTasksCount() != null && other.getMaxFailedTasksCount().equals(this.getMaxFailedTasksCount()) == false)
            return false;
        if (other.getMaxRetriesPerTask() == null ^ this.getMaxRetriesPerTask() == null)
            return false;
        if (other.getMaxRetriesPerTask() != null && other.getMaxRetriesPerTask().equals(this.getMaxRetriesPerTask()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        if (other.getTargetTaskRunStatus() == null ^ this.getTargetTaskRunStatus() == null)
            return false;
        if (other.getTargetTaskRunStatus() != null && other.getTargetTaskRunStatus().equals(this.getTargetTaskRunStatus()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getMaxFailedTasksCount() == null) ? 0 : getMaxFailedTasksCount().hashCode());
        hashCode = prime * hashCode + ((getMaxRetriesPerTask() == null) ? 0 : getMaxRetriesPerTask().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
