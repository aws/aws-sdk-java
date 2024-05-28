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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view creation. For example, the view is idempotent
     * ClientToken is provided.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     */
    private String status;
    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     */
    private ViewInputContent content;
    /**
     * <p>
     * The description of the view.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the view.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).These tags can be used to organize,
     * track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view creation. For example, the view is idempotent
     * ClientToken is provided.
     * </p>
     * 
     * @param clientToken
     *        A unique Id for each create view request to avoid duplicate view creation. For example, the view is
     *        idempotent ClientToken is provided.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view creation. For example, the view is idempotent
     * ClientToken is provided.
     * </p>
     * 
     * @return A unique Id for each create view request to avoid duplicate view creation. For example, the view is
     *         idempotent ClientToken is provided.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view creation. For example, the view is idempotent
     * ClientToken is provided.
     * </p>
     * 
     * @param clientToken
     *        A unique Id for each create view request to avoid duplicate view creation. For example, the view is
     *        idempotent ClientToken is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @see ViewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @return Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *         <code>PUBLISHED</code> status will initiate validation on the content.
     * @see ViewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewStatus
     */

    public CreateViewRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewStatus
     */

    public CreateViewRequest withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.</p>
     *        <p>
     *        The total uncompressed content has a maximum file size of 400kB.
     */

    public void setContent(ViewInputContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     * 
     * @return View content containing all content necessary to render a view except for runtime input data.</p>
     *         <p>
     *         The total uncompressed content has a maximum file size of 400kB.
     */

    public ViewInputContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.</p>
     *        <p>
     *        The total uncompressed content has a maximum file size of 400kB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withContent(ViewInputContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @param description
     *        The description of the view.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @return The description of the view.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @param description
     *        The description of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @param name
     *        The name of the view.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @return The name of the view.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @param name
     *        The name of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).These tags can be used to organize,
     * track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * 
     * @return The tags associated with the view resource (not specific to view version).These tags can be used to
     *         organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).These tags can be used to organize,
     * track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags associated with the view resource (not specific to view version).These tags can be used to
     *        organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     *        "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).These tags can be used to organize,
     * track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags associated with the view resource (not specific to view version).These tags can be used to
     *        organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     *        "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateViewRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest addTagsEntry(String key, String value) {
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

    public CreateViewRequest clearTagsEntries() {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateViewRequest == false)
            return false;
        CreateViewRequest other = (CreateViewRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateViewRequest clone() {
        return (CreateViewRequest) super.clone();
    }

}
