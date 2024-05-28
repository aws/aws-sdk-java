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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchingWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     * </p>
     */
    private IncrementalRunConfig incrementalRunConfig;
    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     */
    private java.util.List<InputSource> inputSourceConfig;
    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     * <code>ApplyNormalization</code>, and <code>Output</code>.
     * </p>
     */
    private java.util.List<OutputSource> outputSourceConfig;
    /**
     * <p>
     * An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     * </p>
     */
    private ResolutionTechniques resolutionTechniques;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     */
    private String workflowArn;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String workflowName;

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the workflow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @return The timestamp of when the workflow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @return A description of the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     * </p>
     * 
     * @param incrementalRunConfig
     *        An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     */

    public void setIncrementalRunConfig(IncrementalRunConfig incrementalRunConfig) {
        this.incrementalRunConfig = incrementalRunConfig;
    }

    /**
     * <p>
     * An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     * </p>
     * 
     * @return An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     */

    public IncrementalRunConfig getIncrementalRunConfig() {
        return this.incrementalRunConfig;
    }

    /**
     * <p>
     * An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     * </p>
     * 
     * @param incrementalRunConfig
     *        An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withIncrementalRunConfig(IncrementalRunConfig incrementalRunConfig) {
        setIncrementalRunConfig(incrementalRunConfig);
        return this;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @return A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *         <code>SchemaName</code>.
     */

    public java.util.List<InputSource> getInputSourceConfig() {
        return inputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     */

    public void setInputSourceConfig(java.util.Collection<InputSource> inputSourceConfig) {
        if (inputSourceConfig == null) {
            this.inputSourceConfig = null;
            return;
        }

        this.inputSourceConfig = new java.util.ArrayList<InputSource>(inputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSourceConfig(java.util.Collection)} or {@link #withInputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withInputSourceConfig(InputSource... inputSourceConfig) {
        if (this.inputSourceConfig == null) {
            setInputSourceConfig(new java.util.ArrayList<InputSource>(inputSourceConfig.length));
        }
        for (InputSource ele : inputSourceConfig) {
            this.inputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withInputSourceConfig(java.util.Collection<InputSource> inputSourceConfig) {
        setInputSourceConfig(inputSourceConfig);
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     * <code>ApplyNormalization</code>, and <code>Output</code>.
     * </p>
     * 
     * @return A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     *         <code>ApplyNormalization</code>, and <code>Output</code>.
     */

    public java.util.List<OutputSource> getOutputSourceConfig() {
        return outputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     * <code>ApplyNormalization</code>, and <code>Output</code>.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     *        <code>ApplyNormalization</code>, and <code>Output</code>.
     */

    public void setOutputSourceConfig(java.util.Collection<OutputSource> outputSourceConfig) {
        if (outputSourceConfig == null) {
            this.outputSourceConfig = null;
            return;
        }

        this.outputSourceConfig = new java.util.ArrayList<OutputSource>(outputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     * <code>ApplyNormalization</code>, and <code>Output</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSourceConfig(java.util.Collection)} or {@link #withOutputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     *        <code>ApplyNormalization</code>, and <code>Output</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withOutputSourceConfig(OutputSource... outputSourceConfig) {
        if (this.outputSourceConfig == null) {
            setOutputSourceConfig(new java.util.ArrayList<OutputSource>(outputSourceConfig.length));
        }
        for (OutputSource ele : outputSourceConfig) {
            this.outputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     * <code>ApplyNormalization</code>, and <code>Output</code>.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code>,
     *        <code>ApplyNormalization</code>, and <code>Output</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withOutputSourceConfig(java.util.Collection<OutputSource> outputSourceConfig) {
        setOutputSourceConfig(outputSourceConfig);
        return this;
    }

    /**
     * <p>
     * An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     * </p>
     * 
     * @param resolutionTechniques
     *        An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     */

    public void setResolutionTechniques(ResolutionTechniques resolutionTechniques) {
        this.resolutionTechniques = resolutionTechniques;
    }

    /**
     * <p>
     * An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     * </p>
     * 
     * @return An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     */

    public ResolutionTechniques getResolutionTechniques() {
        return this.resolutionTechniques;
    }

    /**
     * <p>
     * An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     * </p>
     * 
     * @param resolutionTechniques
     *        An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withResolutionTechniques(ResolutionTechniques resolutionTechniques) {
        setResolutionTechniques(resolutionTechniques);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *         Services resources on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetMatchingWorkflowResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult addTagsEntry(String key, String value) {
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

    public GetMatchingWorkflowResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the workflow was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @return The timestamp of when the workflow was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the workflow was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @param workflowArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     */

    public void setWorkflowArn(String workflowArn) {
        this.workflowArn = workflowArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     */

    public String getWorkflowArn() {
        return this.workflowArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @param workflowArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withWorkflowArn(String workflowArn) {
        setWorkflowArn(workflowArn);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingWorkflowResult withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIncrementalRunConfig() != null)
            sb.append("IncrementalRunConfig: ").append(getIncrementalRunConfig()).append(",");
        if (getInputSourceConfig() != null)
            sb.append("InputSourceConfig: ").append(getInputSourceConfig()).append(",");
        if (getOutputSourceConfig() != null)
            sb.append("OutputSourceConfig: ").append(getOutputSourceConfig()).append(",");
        if (getResolutionTechniques() != null)
            sb.append("ResolutionTechniques: ").append(getResolutionTechniques()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getWorkflowArn() != null)
            sb.append("WorkflowArn: ").append(getWorkflowArn()).append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMatchingWorkflowResult == false)
            return false;
        GetMatchingWorkflowResult other = (GetMatchingWorkflowResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIncrementalRunConfig() == null ^ this.getIncrementalRunConfig() == null)
            return false;
        if (other.getIncrementalRunConfig() != null && other.getIncrementalRunConfig().equals(this.getIncrementalRunConfig()) == false)
            return false;
        if (other.getInputSourceConfig() == null ^ this.getInputSourceConfig() == null)
            return false;
        if (other.getInputSourceConfig() != null && other.getInputSourceConfig().equals(this.getInputSourceConfig()) == false)
            return false;
        if (other.getOutputSourceConfig() == null ^ this.getOutputSourceConfig() == null)
            return false;
        if (other.getOutputSourceConfig() != null && other.getOutputSourceConfig().equals(this.getOutputSourceConfig()) == false)
            return false;
        if (other.getResolutionTechniques() == null ^ this.getResolutionTechniques() == null)
            return false;
        if (other.getResolutionTechniques() != null && other.getResolutionTechniques().equals(this.getResolutionTechniques()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getWorkflowArn() == null ^ this.getWorkflowArn() == null)
            return false;
        if (other.getWorkflowArn() != null && other.getWorkflowArn().equals(this.getWorkflowArn()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIncrementalRunConfig() == null) ? 0 : getIncrementalRunConfig().hashCode());
        hashCode = prime * hashCode + ((getInputSourceConfig() == null) ? 0 : getInputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputSourceConfig() == null) ? 0 : getOutputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getResolutionTechniques() == null) ? 0 : getResolutionTechniques().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getWorkflowArn() == null) ? 0 : getWorkflowArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        return hashCode;
    }

    @Override
    public GetMatchingWorkflowResult clone() {
        try {
            return (GetMatchingWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
