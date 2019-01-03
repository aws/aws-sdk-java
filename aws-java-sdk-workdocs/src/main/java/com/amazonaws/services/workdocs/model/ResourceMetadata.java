/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata of a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ResourceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The original name of the resource before a rename operation.
     * </p>
     */
    private String originalName;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version ID of the resource. This is an optional field and is filled for action on document version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The owner of the resource.
     * </p>
     */
    private UserMetadata owner;
    /**
     * <p>
     * The parent ID of the resource before a rename operation.
     * </p>
     */
    private String parentId;

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @see ResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     * @see ResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceMetadata withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @see ResourceType
     */

    public void setType(ResourceType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceMetadata withType(ResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The original name of the resource before a rename operation.
     * </p>
     * 
     * @param originalName
     *        The original name of the resource before a rename operation.
     */

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    /**
     * <p>
     * The original name of the resource before a rename operation.
     * </p>
     * 
     * @return The original name of the resource before a rename operation.
     */

    public String getOriginalName() {
        return this.originalName;
    }

    /**
     * <p>
     * The original name of the resource before a rename operation.
     * </p>
     * 
     * @param originalName
     *        The original name of the resource before a rename operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withOriginalName(String originalName) {
        setOriginalName(originalName);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version ID of the resource. This is an optional field and is filled for action on document version.
     * </p>
     * 
     * @param versionId
     *        The version ID of the resource. This is an optional field and is filled for action on document version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID of the resource. This is an optional field and is filled for action on document version.
     * </p>
     * 
     * @return The version ID of the resource. This is an optional field and is filled for action on document version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version ID of the resource. This is an optional field and is filled for action on document version.
     * </p>
     * 
     * @param versionId
     *        The version ID of the resource. This is an optional field and is filled for action on document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param owner
     *        The owner of the resource.
     */

    public void setOwner(UserMetadata owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @return The owner of the resource.
     */

    public UserMetadata getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param owner
     *        The owner of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withOwner(UserMetadata owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The parent ID of the resource before a rename operation.
     * </p>
     * 
     * @param parentId
     *        The parent ID of the resource before a rename operation.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The parent ID of the resource before a rename operation.
     * </p>
     * 
     * @return The parent ID of the resource before a rename operation.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The parent ID of the resource before a rename operation.
     * </p>
     * 
     * @param parentId
     *        The parent ID of the resource before a rename operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withParentId(String parentId) {
        setParentId(parentId);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOriginalName() != null)
            sb.append("OriginalName: ").append(getOriginalName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMetadata == false)
            return false;
        ResourceMetadata other = (ResourceMetadata) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOriginalName() == null ^ this.getOriginalName() == null)
            return false;
        if (other.getOriginalName() != null && other.getOriginalName().equals(this.getOriginalName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOriginalName() == null) ? 0 : getOriginalName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return hashCode;
    }

    @Override
    public ResourceMetadata clone() {
        try {
            return (ResourceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ResourceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
