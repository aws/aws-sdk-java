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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A view resource object. Contains metadata and content necessary to render the view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/View" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class View implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the view.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the view.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The description of the view.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Current version of the view.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The description of the version.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     */
    private ViewContent content;
    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     */
    private String viewContentSha256;

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @param id
     *        The identifier of the view.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @return The identifier of the view.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @param id
     *        The identifier of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the view.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withArn(String arn) {
        setArn(arn);
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

    public View withName(String name) {
        setName(name);
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

    public View withStatus(String status) {
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

    public View withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param type
     *        The type of the view - <code>CUSTOMER_MANAGED</code>.
     * @see ViewType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @return The type of the view - <code>CUSTOMER_MANAGED</code>.
     * @see ViewType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param type
     *        The type of the view - <code>CUSTOMER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public View withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param type
     *        The type of the view - <code>CUSTOMER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public View withType(ViewType type) {
        this.type = type.toString();
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

    public View withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     * 
     * @param version
     *        Current version of the view.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     * 
     * @return Current version of the view.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     * 
     * @param version
     *        Current version of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param versionDescription
     *        The description of the version.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @return The description of the version.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param versionDescription
     *        The description of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.
     */

    public void setContent(ViewContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @return View content containing all content necessary to render a view except for runtime input data.
     */

    public ViewContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withContent(ViewContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).
     * </p>
     * 
     * @return The tags associated with the view resource (not specific to view version).
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).
     * </p>
     * 
     * @param tags
     *        The tags associated with the view resource (not specific to view version).
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view version).
     * </p>
     * 
     * @param tags
     *        The tags associated with the view resource (not specific to view version).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see View#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public View addTagsEntry(String key, String value) {
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

    public View clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the view was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     * 
     * @return The timestamp of when the view was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the view was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     * </p>
     * 
     * @param lastModifiedTime
     *        Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     * </p>
     * 
     * @return Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     * </p>
     * 
     * @param lastModifiedTime
     *        Latest timestamp of the <code>UpdateViewContent</code> or <code>CreateViewVersion</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * 
     * @param viewContentSha256
     *        Indicates the checksum value of the latest published view content.
     */

    public void setViewContentSha256(String viewContentSha256) {
        this.viewContentSha256 = viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * 
     * @return Indicates the checksum value of the latest published view content.
     */

    public String getViewContentSha256() {
        return this.viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * 
     * @param viewContentSha256
     *        Indicates the checksum value of the latest published view content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withViewContentSha256(String viewContentSha256) {
        setViewContentSha256(viewContentSha256);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getViewContentSha256() != null)
            sb.append("ViewContentSha256: ").append(getViewContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof View == false)
            return false;
        View other = (View) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getViewContentSha256() == null ^ this.getViewContentSha256() == null)
            return false;
        if (other.getViewContentSha256() != null && other.getViewContentSha256().equals(this.getViewContentSha256()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getViewContentSha256() == null) ? 0 : getViewContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public View clone() {
        try {
            return (View) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ViewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
