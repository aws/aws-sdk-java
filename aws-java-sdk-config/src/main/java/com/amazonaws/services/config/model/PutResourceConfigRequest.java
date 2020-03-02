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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourceConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource. The custom resource type must be registered with AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It
     * is the first part of the ResourceType up to the first ::.
     * </p>
     * </note>
     */
    private String resourceType;
    /**
     * <p>
     * Version of the schema registered for the ResourceType in AWS CloudFormation.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * Unique identifier of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Name of the resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * The configuration JSON must not exceed 64 KB.
     * </p>
     * </note>
     */
    private String configuration;
    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of the resource. The custom resource type must be registered with AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It
     * is the first part of the ResourceType up to the first ::.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of the resource. The custom resource type must be registered with AWS CloudFormation. </p> <note>
     *        <p>
     *        You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource
     *        types. It is the first part of the ResourceType up to the first ::.
     *        </p>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource. The custom resource type must be registered with AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It
     * is the first part of the ResourceType up to the first ::.
     * </p>
     * </note>
     * 
     * @return The type of the resource. The custom resource type must be registered with AWS CloudFormation. </p>
     *         <note>
     *         <p>
     *         You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource
     *         types. It is the first part of the ResourceType up to the first ::.
     *         </p>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource. The custom resource type must be registered with AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It
     * is the first part of the ResourceType up to the first ::.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of the resource. The custom resource type must be registered with AWS CloudFormation. </p> <note>
     *        <p>
     *        You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource
     *        types. It is the first part of the ResourceType up to the first ::.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Version of the schema registered for the ResourceType in AWS CloudFormation.
     * </p>
     * 
     * @param schemaVersionId
     *        Version of the schema registered for the ResourceType in AWS CloudFormation.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * Version of the schema registered for the ResourceType in AWS CloudFormation.
     * </p>
     * 
     * @return Version of the schema registered for the ResourceType in AWS CloudFormation.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * Version of the schema registered for the ResourceType in AWS CloudFormation.
     * </p>
     * 
     * @param schemaVersionId
     *        Version of the schema registered for the ResourceType in AWS CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Unique identifier of the resource.
     * </p>
     * 
     * @return Unique identifier of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Unique identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @return Name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * The configuration JSON must not exceed 64 KB.
     * </p>
     * </note>
     * 
     * @param configuration
     *        The configuration object of the resource in valid JSON format. It must match the schema registered with
     *        AWS CloudFormation.</p> <note>
     *        <p>
     *        The configuration JSON must not exceed 64 KB.
     *        </p>
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * The configuration JSON must not exceed 64 KB.
     * </p>
     * </note>
     * 
     * @return The configuration object of the resource in valid JSON format. It must match the schema registered with
     *         AWS CloudFormation.</p> <note>
     *         <p>
     *         The configuration JSON must not exceed 64 KB.
     *         </p>
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * The configuration JSON must not exceed 64 KB.
     * </p>
     * </note>
     * 
     * @param configuration
     *        The configuration object of the resource in valid JSON format. It must match the schema registered with
     *        AWS CloudFormation.</p> <note>
     *        <p>
     *        The configuration JSON must not exceed 64 KB.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @return Tags associated with the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutResourceConfigRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceConfigRequest addTagsEntry(String key, String value) {
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

    public PutResourceConfigRequest clearTagsEntries() {
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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

        if (obj instanceof PutResourceConfigRequest == false)
            return false;
        PutResourceConfigRequest other = (PutResourceConfigRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutResourceConfigRequest clone() {
        return (PutResourceConfigRequest) super.clone();
    }

}
