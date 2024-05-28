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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The workflow's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The workflow's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The workflow's type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The workflow's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The workflow's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The workflow's engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The workflow's definition.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     */
    private String main;
    /**
     * <p>
     * The workflow's digest.
     * </p>
     */
    private String digest;
    /**
     * <p>
     * The workflow's parameter template.
     * </p>
     */
    private java.util.Map<String, WorkflowParameter> parameterTemplate;
    /**
     * <p>
     * The workflow's storage capacity in gibibytes.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * When the workflow was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The workflow's status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The workflow's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Gets metadata for workflow.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     */
    private String accelerators;

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @param arn
     *        The workflow's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @return The workflow's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @param arn
     *        The workflow's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public GetWorkflowResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @see WorkflowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @return The workflow's status.
     * @see WorkflowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public GetWorkflowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public GetWorkflowResult withStatus(WorkflowStatus status) {
        this.status = status.toString();
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

    public GetWorkflowResult withType(String type) {
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

    public GetWorkflowResult withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @param name
     *        The workflow's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @return The workflow's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @param name
     *        The workflow's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The workflow's description.
     * </p>
     * 
     * @param description
     *        The workflow's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workflow's description.
     * </p>
     * 
     * @return The workflow's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The workflow's description.
     * </p>
     * 
     * @param description
     *        The workflow's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The workflow's engine.
     * </p>
     * 
     * @param engine
     *        The workflow's engine.
     * @see WorkflowEngine
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The workflow's engine.
     * </p>
     * 
     * @return The workflow's engine.
     * @see WorkflowEngine
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The workflow's engine.
     * </p>
     * 
     * @param engine
     *        The workflow's engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowEngine
     */

    public GetWorkflowResult withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The workflow's engine.
     * </p>
     * 
     * @param engine
     *        The workflow's engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowEngine
     */

    public GetWorkflowResult withEngine(WorkflowEngine engine) {
        this.engine = engine.toString();
        return this;
    }

    /**
     * <p>
     * The workflow's definition.
     * </p>
     * 
     * @param definition
     *        The workflow's definition.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The workflow's definition.
     * </p>
     * 
     * @return The workflow's definition.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The workflow's definition.
     * </p>
     * 
     * @param definition
     *        The workflow's definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @param main
     *        The path of the main definition file for the workflow.
     */

    public void setMain(String main) {
        this.main = main;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @return The path of the main definition file for the workflow.
     */

    public String getMain() {
        return this.main;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @param main
     *        The path of the main definition file for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withMain(String main) {
        setMain(main);
        return this;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @param digest
     *        The workflow's digest.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @return The workflow's digest.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @param digest
     *        The workflow's digest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withDigest(String digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * The workflow's parameter template.
     * </p>
     * 
     * @return The workflow's parameter template.
     */

    public java.util.Map<String, WorkflowParameter> getParameterTemplate() {
        return parameterTemplate;
    }

    /**
     * <p>
     * The workflow's parameter template.
     * </p>
     * 
     * @param parameterTemplate
     *        The workflow's parameter template.
     */

    public void setParameterTemplate(java.util.Map<String, WorkflowParameter> parameterTemplate) {
        this.parameterTemplate = parameterTemplate;
    }

    /**
     * <p>
     * The workflow's parameter template.
     * </p>
     * 
     * @param parameterTemplate
     *        The workflow's parameter template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withParameterTemplate(java.util.Map<String, WorkflowParameter> parameterTemplate) {
        setParameterTemplate(parameterTemplate);
        return this;
    }

    /**
     * Add a single ParameterTemplate entry
     *
     * @see GetWorkflowResult#withParameterTemplate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult addParameterTemplateEntry(String key, WorkflowParameter value) {
        if (null == this.parameterTemplate) {
            this.parameterTemplate = new java.util.HashMap<String, WorkflowParameter>();
        }
        if (this.parameterTemplate.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameterTemplate.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ParameterTemplate.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult clearParameterTemplateEntries() {
        this.parameterTemplate = null;
        return this;
    }

    /**
     * <p>
     * The workflow's storage capacity in gibibytes.
     * </p>
     * 
     * @param storageCapacity
     *        The workflow's storage capacity in gibibytes.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The workflow's storage capacity in gibibytes.
     * </p>
     * 
     * @return The workflow's storage capacity in gibibytes.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The workflow's storage capacity in gibibytes.
     * </p>
     * 
     * @param storageCapacity
     *        The workflow's storage capacity in gibibytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @param creationTime
     *        When the workflow was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @return When the workflow was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @param creationTime
     *        When the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The workflow's status message.
     * </p>
     * 
     * @param statusMessage
     *        The workflow's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The workflow's status message.
     * </p>
     * 
     * @return The workflow's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The workflow's status message.
     * </p>
     * 
     * @param statusMessage
     *        The workflow's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The workflow's tags.
     * </p>
     * 
     * @return The workflow's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The workflow's tags.
     * </p>
     * 
     * @param tags
     *        The workflow's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The workflow's tags.
     * </p>
     * 
     * @param tags
     *        The workflow's tags.
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
     * Gets metadata for workflow.
     * </p>
     * 
     * @return Gets metadata for workflow.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Gets metadata for workflow.
     * </p>
     * 
     * @param metadata
     *        Gets metadata for workflow.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Gets metadata for workflow.
     * </p>
     * 
     * @param metadata
     *        Gets metadata for workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see GetWorkflowResult#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @see Accelerators
     */

    public void setAccelerators(String accelerators) {
        this.accelerators = accelerators;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @return The computational accelerator specified to run the workflow.
     * @see Accelerators
     */

    public String getAccelerators() {
        return this.accelerators;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Accelerators
     */

    public GetWorkflowResult withAccelerators(String accelerators) {
        setAccelerators(accelerators);
        return this;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Accelerators
     */

    public GetWorkflowResult withAccelerators(Accelerators accelerators) {
        this.accelerators = accelerators.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getMain() != null)
            sb.append("Main: ").append(getMain()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getParameterTemplate() != null)
            sb.append("ParameterTemplate: ").append(getParameterTemplate()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getAccelerators() != null)
            sb.append("Accelerators: ").append(getAccelerators());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getMain() == null ^ this.getMain() == null)
            return false;
        if (other.getMain() != null && other.getMain().equals(this.getMain()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getParameterTemplate() == null ^ this.getParameterTemplate() == null)
            return false;
        if (other.getParameterTemplate() != null && other.getParameterTemplate().equals(this.getParameterTemplate()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getAccelerators() == null ^ this.getAccelerators() == null)
            return false;
        if (other.getAccelerators() != null && other.getAccelerators().equals(this.getAccelerators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getMain() == null) ? 0 : getMain().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getParameterTemplate() == null) ? 0 : getParameterTemplate().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getAccelerators() == null) ? 0 : getAccelerators().hashCode());
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
