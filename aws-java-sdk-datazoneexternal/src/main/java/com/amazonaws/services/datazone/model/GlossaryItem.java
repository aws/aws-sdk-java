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
 * The details of a business glossary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GlossaryItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlossaryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the glossary was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the glossary.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The business glossary description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the business glossary exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the glossary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the glossary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the project that owns the business glosary.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The business glossary status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the business glossary was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp of when the glossary was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the glossary was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the glossary was created.
     * </p>
     * 
     * @return The timestamp of when the glossary was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the glossary was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the glossary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the glossary.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the glossary.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the glossary.
     * </p>
     * 
     * @return The Amazon DataZone user who created the glossary.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the glossary.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The business glossary description.
     * </p>
     * 
     * @param description
     *        The business glossary description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The business glossary description.
     * </p>
     * 
     * @return The business glossary description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The business glossary description.
     * </p>
     * 
     * @param description
     *        The business glossary description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the business glossary exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the business glossary exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the business glossary exists.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which the business glossary exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the business glossary exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the business glossary exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the glossary.
     * </p>
     * 
     * @param id
     *        The identifier of the glossary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the glossary.
     * </p>
     * 
     * @return The identifier of the glossary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the glossary.
     * </p>
     * 
     * @param id
     *        The identifier of the glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the glossary.
     * </p>
     * 
     * @param name
     *        The name of the glossary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the glossary.
     * </p>
     * 
     * @return The name of the glossary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the glossary.
     * </p>
     * 
     * @param name
     *        The name of the glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project that owns the business glosary.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project that owns the business glosary.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project that owns the business glosary.
     * </p>
     * 
     * @return The identifier of the project that owns the business glosary.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project that owns the business glosary.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project that owns the business glosary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The business glossary status.
     * </p>
     * 
     * @param status
     *        The business glossary status.
     * @see GlossaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The business glossary status.
     * </p>
     * 
     * @return The business glossary status.
     * @see GlossaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The business glossary status.
     * </p>
     * 
     * @param status
     *        The business glossary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public GlossaryItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The business glossary status.
     * </p>
     * 
     * @param status
     *        The business glossary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public GlossaryItem withStatus(GlossaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the business glossary was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the business glossary was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary was updated.
     * </p>
     * 
     * @return The timestamp of when the business glossary was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the business glossary was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the business glossary.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the business glossary.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlossaryItem withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlossaryItem == false)
            return false;
        GlossaryItem other = (GlossaryItem) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GlossaryItem clone() {
        try {
            return (GlossaryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.GlossaryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
