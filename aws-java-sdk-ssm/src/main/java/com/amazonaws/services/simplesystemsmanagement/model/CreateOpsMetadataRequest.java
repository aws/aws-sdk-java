/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpsMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A resource ID for a new Application Manager application.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Metadata for a new Application Manager application.
     * </p>
     */
    private java.util.Map<String, MetadataValue> metadata;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     * object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an OpsMetadata object to identify an environment or target AWS Region. In this
     * case, you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A resource ID for a new Application Manager application.
     * </p>
     * 
     * @param resourceId
     *        A resource ID for a new Application Manager application.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * A resource ID for a new Application Manager application.
     * </p>
     * 
     * @return A resource ID for a new Application Manager application.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * A resource ID for a new Application Manager application.
     * </p>
     * 
     * @param resourceId
     *        A resource ID for a new Application Manager application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsMetadataRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Metadata for a new Application Manager application.
     * </p>
     * 
     * @return Metadata for a new Application Manager application.
     */

    public java.util.Map<String, MetadataValue> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata for a new Application Manager application.
     * </p>
     * 
     * @param metadata
     *        Metadata for a new Application Manager application.
     */

    public void setMetadata(java.util.Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata for a new Application Manager application.
     * </p>
     * 
     * @param metadata
     *        Metadata for a new Application Manager application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsMetadataRequest withMetadata(java.util.Map<String, MetadataValue> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see CreateOpsMetadataRequest#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsMetadataRequest addMetadataEntry(String key, MetadataValue value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, MetadataValue>();
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

    public CreateOpsMetadataRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     * object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an OpsMetadata object to identify an environment or target AWS Region. In this
     * case, you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional metadata that you assign to a resource. You can specify a maximum of five tags for an
     *         OpsMetadata object. Tags enable you to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag an OpsMetadata object to identify an
     *         environment or target AWS Region. In this case, you could specify the following key-value pairs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Region,Value=us-east-2</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     * object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an OpsMetadata object to identify an environment or target AWS Region. In this
     * case, you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     *        object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag an OpsMetadata object to identify an environment or target
     *        AWS Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     * object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an OpsMetadata object to identify an environment or target AWS Region. In this
     * case, you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     *        object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag an OpsMetadata object to identify an environment or target
     *        AWS Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsMetadataRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     * object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an OpsMetadata object to identify an environment or target AWS Region. In this
     * case, you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata
     *        object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag an OpsMetadata object to identify an environment or target
     *        AWS Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsMetadataRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
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

        if (obj instanceof CreateOpsMetadataRequest == false)
            return false;
        CreateOpsMetadataRequest other = (CreateOpsMetadataRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateOpsMetadataRequest clone() {
        return (CreateOpsMetadataRequest) super.clone();
    }

}
