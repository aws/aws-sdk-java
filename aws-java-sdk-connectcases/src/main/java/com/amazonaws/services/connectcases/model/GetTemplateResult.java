/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A brief description of the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     */
    private LayoutConfiguration layoutConfiguration;
    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     */
    private java.util.List<RequiredField> requiredFields;
    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @param description
     *        A brief description of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @return A brief description of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @param description
     *        A brief description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @param layoutConfiguration
     *        Configuration of layouts associated to the template.
     */

    public void setLayoutConfiguration(LayoutConfiguration layoutConfiguration) {
        this.layoutConfiguration = layoutConfiguration;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @return Configuration of layouts associated to the template.
     */

    public LayoutConfiguration getLayoutConfiguration() {
        return this.layoutConfiguration;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @param layoutConfiguration
     *        Configuration of layouts associated to the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withLayoutConfiguration(LayoutConfiguration layoutConfiguration) {
        setLayoutConfiguration(layoutConfiguration);
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
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @return A list of fields that must contain a value for a case to be successfully created with this template.
     */

    public java.util.List<RequiredField> getRequiredFields() {
        return requiredFields;
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     */

    public void setRequiredFields(java.util.Collection<RequiredField> requiredFields) {
        if (requiredFields == null) {
            this.requiredFields = null;
            return;
        }

        this.requiredFields = new java.util.ArrayList<RequiredField>(requiredFields);
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFields(java.util.Collection)} or {@link #withRequiredFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withRequiredFields(RequiredField... requiredFields) {
        if (this.requiredFields == null) {
            setRequiredFields(new java.util.ArrayList<RequiredField>(requiredFields.length));
        }
        for (RequiredField ele : requiredFields) {
            this.requiredFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withRequiredFields(java.util.Collection<RequiredField> requiredFields) {
        setRequiredFields(requiredFields);
        return this;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @return A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *         control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetTemplateResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult addTagsEntry(String key, String value) {
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

    public GetTemplateResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) of the template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @return A unique identifier of a template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLayoutConfiguration() != null)
            sb.append("LayoutConfiguration: ").append(getLayoutConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequiredFields() != null)
            sb.append("RequiredFields: ").append(getRequiredFields()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLayoutConfiguration() == null ^ this.getLayoutConfiguration() == null)
            return false;
        if (other.getLayoutConfiguration() != null && other.getLayoutConfiguration().equals(this.getLayoutConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequiredFields() == null ^ this.getRequiredFields() == null)
            return false;
        if (other.getRequiredFields() != null && other.getRequiredFields().equals(this.getRequiredFields()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLayoutConfiguration() == null) ? 0 : getLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequiredFields() == null) ? 0 : getRequiredFields().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
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
