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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the published asset for which the subscription grant is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SubscribedListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedListing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the published asset for which the subscription grant is created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The published asset for which the subscription grant is created.
     * </p>
     */
    private SubscribedListingItem item;
    /**
     * <p>
     * The name of the published asset for which the subscription grant is created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the project of the published asset for which the subscription grant is created.
     * </p>
     */
    private String ownerProjectId;
    /**
     * <p>
     * The name of the project that owns the published asset for which the subscription grant is created.
     * </p>
     */
    private String ownerProjectName;
    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The description of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param description
     *        The description of the published asset for which the subscription grant is created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The description of the published asset for which the subscription grant is created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param description
     *        The description of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param id
     *        The identifier of the published asset for which the subscription grant is created.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The identifier of the published asset for which the subscription grant is created.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param id
     *        The identifier of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is created.
     * </p>
     * 
     * @param item
     *        The published asset for which the subscription grant is created.
     */

    public void setItem(SubscribedListingItem item) {
        this.item = item;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The published asset for which the subscription grant is created.
     */

    public SubscribedListingItem getItem() {
        return this.item;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is created.
     * </p>
     * 
     * @param item
     *        The published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withItem(SubscribedListingItem item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * The name of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param name
     *        The name of the published asset for which the subscription grant is created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The name of the published asset for which the subscription grant is created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param name
     *        The name of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param ownerProjectId
     *        The identifier of the project of the published asset for which the subscription grant is created.
     */

    public void setOwnerProjectId(String ownerProjectId) {
        this.ownerProjectId = ownerProjectId;
    }

    /**
     * <p>
     * The identifier of the project of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The identifier of the project of the published asset for which the subscription grant is created.
     */

    public String getOwnerProjectId() {
        return this.ownerProjectId;
    }

    /**
     * <p>
     * The identifier of the project of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param ownerProjectId
     *        The identifier of the project of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withOwnerProjectId(String ownerProjectId) {
        setOwnerProjectId(ownerProjectId);
        return this;
    }

    /**
     * <p>
     * The name of the project that owns the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param ownerProjectName
     *        The name of the project that owns the published asset for which the subscription grant is created.
     */

    public void setOwnerProjectName(String ownerProjectName) {
        this.ownerProjectName = ownerProjectName;
    }

    /**
     * <p>
     * The name of the project that owns the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The name of the project that owns the published asset for which the subscription grant is created.
     */

    public String getOwnerProjectName() {
        return this.ownerProjectName;
    }

    /**
     * <p>
     * The name of the project that owns the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param ownerProjectName
     *        The name of the project that owns the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withOwnerProjectName(String ownerProjectName) {
        setOwnerProjectName(ownerProjectName);
        return this;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param revision
     *        The revision of the published asset for which the subscription grant is created.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The revision of the published asset for which the subscription grant is created.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param revision
     *        The revision of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedListing withRevision(String revision) {
        setRevision(revision);
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerProjectId() != null)
            sb.append("OwnerProjectId: ").append(getOwnerProjectId()).append(",");
        if (getOwnerProjectName() != null)
            sb.append("OwnerProjectName: ").append(getOwnerProjectName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedListing == false)
            return false;
        SubscribedListing other = (SubscribedListing) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerProjectId() == null ^ this.getOwnerProjectId() == null)
            return false;
        if (other.getOwnerProjectId() != null && other.getOwnerProjectId().equals(this.getOwnerProjectId()) == false)
            return false;
        if (other.getOwnerProjectName() == null ^ this.getOwnerProjectName() == null)
            return false;
        if (other.getOwnerProjectName() != null && other.getOwnerProjectName().equals(this.getOwnerProjectName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerProjectId() == null) ? 0 : getOwnerProjectId().hashCode());
        hashCode = prime * hashCode + ((getOwnerProjectName() == null) ? 0 : getOwnerProjectName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public SubscribedListing clone() {
        try {
            return (SubscribedListing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SubscribedListingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
