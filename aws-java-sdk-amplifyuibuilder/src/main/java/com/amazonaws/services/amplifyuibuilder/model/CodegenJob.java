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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for a code generation job that is associated with an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the code generation job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the Amplify app associated with the code generation job.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     */
    private String environmentName;

    private CodegenJobRenderConfig renderConfig;

    private CodegenJobGenericDataSchema genericDataSchema;
    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     */
    private Boolean autoGenerateForms;

    private CodegenFeatureFlags features;
    /**
     * <p>
     * The status of the code generation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The customized status message for the code generation job.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The <code>CodegenJobAsset</code> to use for the code generation job.
     * </p>
     */
    private CodegenJobAsset asset;
    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The time that the code generation job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time that the code generation job was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     */
    private java.util.List<CodegenDependency> dependencies;

    /**
     * <p>
     * The unique ID for the code generation job.
     * </p>
     * 
     * @param id
     *        The unique ID for the code generation job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the code generation job.
     * </p>
     * 
     * @return The unique ID for the code generation job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the code generation job.
     * </p>
     * 
     * @param id
     *        The unique ID for the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @param appId
     *        The ID of the Amplify app associated with the code generation job.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @return The ID of the Amplify app associated with the code generation job.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @param appId
     *        The ID of the Amplify app associated with the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment associated with the code generation job.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @return The name of the backend environment associated with the code generation job.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment associated with the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * @param renderConfig
     */

    public void setRenderConfig(CodegenJobRenderConfig renderConfig) {
        this.renderConfig = renderConfig;
    }

    /**
     * @return
     */

    public CodegenJobRenderConfig getRenderConfig() {
        return this.renderConfig;
    }

    /**
     * @param renderConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withRenderConfig(CodegenJobRenderConfig renderConfig) {
        setRenderConfig(renderConfig);
        return this;
    }

    /**
     * @param genericDataSchema
     */

    public void setGenericDataSchema(CodegenJobGenericDataSchema genericDataSchema) {
        this.genericDataSchema = genericDataSchema;
    }

    /**
     * @return
     */

    public CodegenJobGenericDataSchema getGenericDataSchema() {
        return this.genericDataSchema;
    }

    /**
     * @param genericDataSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withGenericDataSchema(CodegenJobGenericDataSchema genericDataSchema) {
        setGenericDataSchema(genericDataSchema);
        return this;
    }

    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     * 
     * @param autoGenerateForms
     *        Specifies whether to autogenerate forms in the code generation job.
     */

    public void setAutoGenerateForms(Boolean autoGenerateForms) {
        this.autoGenerateForms = autoGenerateForms;
    }

    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     * 
     * @return Specifies whether to autogenerate forms in the code generation job.
     */

    public Boolean getAutoGenerateForms() {
        return this.autoGenerateForms;
    }

    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     * 
     * @param autoGenerateForms
     *        Specifies whether to autogenerate forms in the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withAutoGenerateForms(Boolean autoGenerateForms) {
        setAutoGenerateForms(autoGenerateForms);
        return this;
    }

    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     * 
     * @return Specifies whether to autogenerate forms in the code generation job.
     */

    public Boolean isAutoGenerateForms() {
        return this.autoGenerateForms;
    }

    /**
     * @param features
     */

    public void setFeatures(CodegenFeatureFlags features) {
        this.features = features;
    }

    /**
     * @return
     */

    public CodegenFeatureFlags getFeatures() {
        return this.features;
    }

    /**
     * @param features
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withFeatures(CodegenFeatureFlags features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The status of the code generation job.
     * </p>
     * 
     * @param status
     *        The status of the code generation job.
     * @see CodegenJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the code generation job.
     * </p>
     * 
     * @return The status of the code generation job.
     * @see CodegenJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the code generation job.
     * </p>
     * 
     * @param status
     *        The status of the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenJobStatus
     */

    public CodegenJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the code generation job.
     * </p>
     * 
     * @param status
     *        The status of the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenJobStatus
     */

    public CodegenJob withStatus(CodegenJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The customized status message for the code generation job.
     * </p>
     * 
     * @param statusMessage
     *        The customized status message for the code generation job.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The customized status message for the code generation job.
     * </p>
     * 
     * @return The customized status message for the code generation job.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The customized status message for the code generation job.
     * </p>
     * 
     * @param statusMessage
     *        The customized status message for the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The <code>CodegenJobAsset</code> to use for the code generation job.
     * </p>
     * 
     * @param asset
     *        The <code>CodegenJobAsset</code> to use for the code generation job.
     */

    public void setAsset(CodegenJobAsset asset) {
        this.asset = asset;
    }

    /**
     * <p>
     * The <code>CodegenJobAsset</code> to use for the code generation job.
     * </p>
     * 
     * @return The <code>CodegenJobAsset</code> to use for the code generation job.
     */

    public CodegenJobAsset getAsset() {
        return this.asset;
    }

    /**
     * <p>
     * The <code>CodegenJobAsset</code> to use for the code generation job.
     * </p>
     * 
     * @param asset
     *        The <code>CodegenJobAsset</code> to use for the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withAsset(CodegenJobAsset asset) {
        setAsset(asset);
        return this;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job.
     * </p>
     * 
     * @return One or more key-value pairs to use when tagging the code generation job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the code generation job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CodegenJob#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob addTagsEntry(String key, String value) {
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

    public CodegenJob clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The time that the code generation job was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the code generation job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the code generation job was created.
     * </p>
     * 
     * @return The time that the code generation job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the code generation job was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the code generation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time that the code generation job was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the code generation job was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time that the code generation job was modified.
     * </p>
     * 
     * @return The time that the code generation job was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time that the code generation job was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the code generation job was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @return Lists the dependency packages that may be required for the project code to run.
     */

    public java.util.List<CodegenDependency> getDependencies() {
        return dependencies;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @param dependencies
     *        Lists the dependency packages that may be required for the project code to run.
     */

    public void setDependencies(java.util.Collection<CodegenDependency> dependencies) {
        if (dependencies == null) {
            this.dependencies = null;
            return;
        }

        this.dependencies = new java.util.ArrayList<CodegenDependency>(dependencies);
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependencies(java.util.Collection)} or {@link #withDependencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependencies
     *        Lists the dependency packages that may be required for the project code to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withDependencies(CodegenDependency... dependencies) {
        if (this.dependencies == null) {
            setDependencies(new java.util.ArrayList<CodegenDependency>(dependencies.length));
        }
        for (CodegenDependency ele : dependencies) {
            this.dependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @param dependencies
     *        Lists the dependency packages that may be required for the project code to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJob withDependencies(java.util.Collection<CodegenDependency> dependencies) {
        setDependencies(dependencies);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getRenderConfig() != null)
            sb.append("RenderConfig: ").append(getRenderConfig()).append(",");
        if (getGenericDataSchema() != null)
            sb.append("GenericDataSchema: ").append(getGenericDataSchema()).append(",");
        if (getAutoGenerateForms() != null)
            sb.append("AutoGenerateForms: ").append(getAutoGenerateForms()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAsset() != null)
            sb.append("Asset: ").append(getAsset()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getDependencies() != null)
            sb.append("Dependencies: ").append(getDependencies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenJob == false)
            return false;
        CodegenJob other = (CodegenJob) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getRenderConfig() == null ^ this.getRenderConfig() == null)
            return false;
        if (other.getRenderConfig() != null && other.getRenderConfig().equals(this.getRenderConfig()) == false)
            return false;
        if (other.getGenericDataSchema() == null ^ this.getGenericDataSchema() == null)
            return false;
        if (other.getGenericDataSchema() != null && other.getGenericDataSchema().equals(this.getGenericDataSchema()) == false)
            return false;
        if (other.getAutoGenerateForms() == null ^ this.getAutoGenerateForms() == null)
            return false;
        if (other.getAutoGenerateForms() != null && other.getAutoGenerateForms().equals(this.getAutoGenerateForms()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAsset() == null ^ this.getAsset() == null)
            return false;
        if (other.getAsset() != null && other.getAsset().equals(this.getAsset()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getDependencies() == null ^ this.getDependencies() == null)
            return false;
        if (other.getDependencies() != null && other.getDependencies().equals(this.getDependencies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getRenderConfig() == null) ? 0 : getRenderConfig().hashCode());
        hashCode = prime * hashCode + ((getGenericDataSchema() == null) ? 0 : getGenericDataSchema().hashCode());
        hashCode = prime * hashCode + ((getAutoGenerateForms() == null) ? 0 : getAutoGenerateForms().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAsset() == null) ? 0 : getAsset().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getDependencies() == null) ? 0 : getDependencies().hashCode());
        return hashCode;
    }

    @Override
    public CodegenJob clone() {
        try {
            return (CodegenJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
