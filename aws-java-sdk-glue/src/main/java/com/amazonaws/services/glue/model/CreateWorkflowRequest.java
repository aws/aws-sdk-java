/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to be assigned to the workflow. It should be unique within your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     */
    private java.util.Map<String, String> defaultRunProperties;
    /**
     * <p>
     * The tags to be used with this workflow.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name to be assigned to the workflow. It should be unique within your account.
     * </p>
     * 
     * @param name
     *        The name to be assigned to the workflow. It should be unique within your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be assigned to the workflow. It should be unique within your account.
     * </p>
     * 
     * @return The name to be assigned to the workflow. It should be unique within your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be assigned to the workflow. It should be unique within your account.
     * </p>
     * 
     * @param name
     *        The name to be assigned to the workflow. It should be unique within your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withName(String name) {
        setName(name);
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

    public CreateWorkflowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @return A collection of properties to be used as part of each execution of the workflow.
     */

    public java.util.Map<String, String> getDefaultRunProperties() {
        return defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @param defaultRunProperties
     *        A collection of properties to be used as part of each execution of the workflow.
     */

    public void setDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        this.defaultRunProperties = defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @param defaultRunProperties
     *        A collection of properties to be used as part of each execution of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        setDefaultRunProperties(defaultRunProperties);
        return this;
    }

    /**
     * Add a single DefaultRunProperties entry
     *
     * @see CreateWorkflowRequest#withDefaultRunProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest addDefaultRunPropertiesEntry(String key, String value) {
        if (null == this.defaultRunProperties) {
            this.defaultRunProperties = new java.util.HashMap<String, String>();
        }
        if (this.defaultRunProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultRunProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultRunProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest clearDefaultRunPropertiesEntries() {
        this.defaultRunProperties = null;
        return this;
    }

    /**
     * <p>
     * The tags to be used with this workflow.
     * </p>
     * 
     * @return The tags to be used with this workflow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be used with this workflow.
     * </p>
     * 
     * @param tags
     *        The tags to be used with this workflow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be used with this workflow.
     * </p>
     * 
     * @param tags
     *        The tags to be used with this workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkflowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest addTagsEntry(String key, String value) {
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

    public CreateWorkflowRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultRunProperties() != null)
            sb.append("DefaultRunProperties: ").append(getDefaultRunProperties()).append(",");
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

        if (obj instanceof CreateWorkflowRequest == false)
            return false;
        CreateWorkflowRequest other = (CreateWorkflowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultRunProperties() == null ^ this.getDefaultRunProperties() == null)
            return false;
        if (other.getDefaultRunProperties() != null && other.getDefaultRunProperties().equals(this.getDefaultRunProperties()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultRunProperties() == null) ? 0 : getDefaultRunProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowRequest clone() {
        return (CreateWorkflowRequest) super.clone();
    }

}
