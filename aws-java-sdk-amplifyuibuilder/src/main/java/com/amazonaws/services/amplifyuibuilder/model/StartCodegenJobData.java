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
 * The code generation job resource configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/StartCodegenJobData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCodegenJobData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code generation configuration for the codegen job.
     * </p>
     */
    private CodegenJobRenderConfig renderConfig;
    /**
     * <p>
     * The data schema to use for a code generation job.
     * </p>
     */
    private CodegenJobGenericDataSchema genericDataSchema;
    /**
     * <p>
     * Specifies whether to autogenerate forms in the code generation job.
     * </p>
     */
    private Boolean autoGenerateForms;
    /**
     * <p>
     * The feature flags for a code generation job.
     * </p>
     */
    private CodegenFeatureFlags features;
    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job data.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The code generation configuration for the codegen job.
     * </p>
     * 
     * @param renderConfig
     *        The code generation configuration for the codegen job.
     */

    public void setRenderConfig(CodegenJobRenderConfig renderConfig) {
        this.renderConfig = renderConfig;
    }

    /**
     * <p>
     * The code generation configuration for the codegen job.
     * </p>
     * 
     * @return The code generation configuration for the codegen job.
     */

    public CodegenJobRenderConfig getRenderConfig() {
        return this.renderConfig;
    }

    /**
     * <p>
     * The code generation configuration for the codegen job.
     * </p>
     * 
     * @param renderConfig
     *        The code generation configuration for the codegen job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCodegenJobData withRenderConfig(CodegenJobRenderConfig renderConfig) {
        setRenderConfig(renderConfig);
        return this;
    }

    /**
     * <p>
     * The data schema to use for a code generation job.
     * </p>
     * 
     * @param genericDataSchema
     *        The data schema to use for a code generation job.
     */

    public void setGenericDataSchema(CodegenJobGenericDataSchema genericDataSchema) {
        this.genericDataSchema = genericDataSchema;
    }

    /**
     * <p>
     * The data schema to use for a code generation job.
     * </p>
     * 
     * @return The data schema to use for a code generation job.
     */

    public CodegenJobGenericDataSchema getGenericDataSchema() {
        return this.genericDataSchema;
    }

    /**
     * <p>
     * The data schema to use for a code generation job.
     * </p>
     * 
     * @param genericDataSchema
     *        The data schema to use for a code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCodegenJobData withGenericDataSchema(CodegenJobGenericDataSchema genericDataSchema) {
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

    public StartCodegenJobData withAutoGenerateForms(Boolean autoGenerateForms) {
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
     * <p>
     * The feature flags for a code generation job.
     * </p>
     * 
     * @param features
     *        The feature flags for a code generation job.
     */

    public void setFeatures(CodegenFeatureFlags features) {
        this.features = features;
    }

    /**
     * <p>
     * The feature flags for a code generation job.
     * </p>
     * 
     * @return The feature flags for a code generation job.
     */

    public CodegenFeatureFlags getFeatures() {
        return this.features;
    }

    /**
     * <p>
     * The feature flags for a code generation job.
     * </p>
     * 
     * @param features
     *        The feature flags for a code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCodegenJobData withFeatures(CodegenFeatureFlags features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job data.
     * </p>
     * 
     * @return One or more key-value pairs to use when tagging the code generation job data.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job data.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the code generation job data.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the code generation job data.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the code generation job data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCodegenJobData withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartCodegenJobData#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartCodegenJobData addTagsEntry(String key, String value) {
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

    public StartCodegenJobData clearTagsEntries() {
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
        if (getRenderConfig() != null)
            sb.append("RenderConfig: ").append(getRenderConfig()).append(",");
        if (getGenericDataSchema() != null)
            sb.append("GenericDataSchema: ").append(getGenericDataSchema()).append(",");
        if (getAutoGenerateForms() != null)
            sb.append("AutoGenerateForms: ").append(getAutoGenerateForms()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
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

        if (obj instanceof StartCodegenJobData == false)
            return false;
        StartCodegenJobData other = (StartCodegenJobData) obj;
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

        hashCode = prime * hashCode + ((getRenderConfig() == null) ? 0 : getRenderConfig().hashCode());
        hashCode = prime * hashCode + ((getGenericDataSchema() == null) ? 0 : getGenericDataSchema().hashCode());
        hashCode = prime * hashCode + ((getAutoGenerateForms() == null) ? 0 : getAutoGenerateForms().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartCodegenJobData clone() {
        try {
            return (StartCodegenJobData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.StartCodegenJobDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
