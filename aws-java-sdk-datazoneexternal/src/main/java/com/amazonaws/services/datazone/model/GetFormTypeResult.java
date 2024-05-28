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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetFormType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFormTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when this metadata form type was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created this metadata form type.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the metadata form type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The imports of the metadata form type.
     * </p>
     */
    private java.util.List<Import> imports;
    /**
     * <p>
     * The model of the metadata form type.
     * </p>
     */
    private Model model;
    /**
     * <p>
     * The name of the metadata form type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     * </p>
     */
    private String originDomainId;
    /**
     * <p>
     * The ID of the project in which this metadata form type was originally created.
     * </p>
     */
    private String originProjectId;
    /**
     * <p>
     * The ID of the project that owns this metadata form type.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The revision of the metadata form type.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The status of the metadata form type.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The timestamp of when this metadata form type was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when this metadata form type was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when this metadata form type was created.
     * </p>
     * 
     * @return The timestamp of when this metadata form type was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when this metadata form type was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when this metadata form type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created this metadata form type.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created this metadata form type.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created this metadata form type.
     * </p>
     * 
     * @return The Amazon DataZone user who created this metadata form type.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created this metadata form type.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created this metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the metadata form type.
     * </p>
     * 
     * @param description
     *        The description of the metadata form type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the metadata form type.
     * </p>
     * 
     * @return The description of the metadata form type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the metadata form type.
     * </p>
     * 
     * @param description
     *        The description of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this metadata form type exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this metadata form type exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this metadata form type exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The imports of the metadata form type.
     * </p>
     * 
     * @return The imports of the metadata form type.
     */

    public java.util.List<Import> getImports() {
        return imports;
    }

    /**
     * <p>
     * The imports of the metadata form type.
     * </p>
     * 
     * @param imports
     *        The imports of the metadata form type.
     */

    public void setImports(java.util.Collection<Import> imports) {
        if (imports == null) {
            this.imports = null;
            return;
        }

        this.imports = new java.util.ArrayList<Import>(imports);
    }

    /**
     * <p>
     * The imports of the metadata form type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImports(java.util.Collection)} or {@link #withImports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imports
     *        The imports of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withImports(Import... imports) {
        if (this.imports == null) {
            setImports(new java.util.ArrayList<Import>(imports.length));
        }
        for (Import ele : imports) {
            this.imports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The imports of the metadata form type.
     * </p>
     * 
     * @param imports
     *        The imports of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withImports(java.util.Collection<Import> imports) {
        setImports(imports);
        return this;
    }

    /**
     * <p>
     * The model of the metadata form type.
     * </p>
     * 
     * @param model
     *        The model of the metadata form type.
     */

    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of the metadata form type.
     * </p>
     * 
     * @return The model of the metadata form type.
     */

    public Model getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model of the metadata form type.
     * </p>
     * 
     * @param model
     *        The model of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withModel(Model model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The name of the metadata form type.
     * </p>
     * 
     * @param name
     *        The name of the metadata form type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metadata form type.
     * </p>
     * 
     * @return The name of the metadata form type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metadata form type.
     * </p>
     * 
     * @param name
     *        The name of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     * </p>
     * 
     * @param originDomainId
     *        The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     */

    public void setOriginDomainId(String originDomainId) {
        this.originDomainId = originDomainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     */

    public String getOriginDomainId() {
        return this.originDomainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     * </p>
     * 
     * @param originDomainId
     *        The ID of the Amazon DataZone domain in which the metadata form type was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withOriginDomainId(String originDomainId) {
        setOriginDomainId(originDomainId);
        return this;
    }

    /**
     * <p>
     * The ID of the project in which this metadata form type was originally created.
     * </p>
     * 
     * @param originProjectId
     *        The ID of the project in which this metadata form type was originally created.
     */

    public void setOriginProjectId(String originProjectId) {
        this.originProjectId = originProjectId;
    }

    /**
     * <p>
     * The ID of the project in which this metadata form type was originally created.
     * </p>
     * 
     * @return The ID of the project in which this metadata form type was originally created.
     */

    public String getOriginProjectId() {
        return this.originProjectId;
    }

    /**
     * <p>
     * The ID of the project in which this metadata form type was originally created.
     * </p>
     * 
     * @param originProjectId
     *        The ID of the project in which this metadata form type was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withOriginProjectId(String originProjectId) {
        setOriginProjectId(originProjectId);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns this metadata form type.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns this metadata form type.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns this metadata form type.
     * </p>
     * 
     * @return The ID of the project that owns this metadata form type.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns this metadata form type.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns this metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The revision of the metadata form type.
     * </p>
     * 
     * @param revision
     *        The revision of the metadata form type.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the metadata form type.
     * </p>
     * 
     * @return The revision of the metadata form type.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the metadata form type.
     * </p>
     * 
     * @param revision
     *        The revision of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormTypeResult withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The status of the metadata form type.
     * </p>
     * 
     * @param status
     *        The status of the metadata form type.
     * @see FormTypeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the metadata form type.
     * </p>
     * 
     * @return The status of the metadata form type.
     * @see FormTypeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the metadata form type.
     * </p>
     * 
     * @param status
     *        The status of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormTypeStatus
     */

    public GetFormTypeResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the metadata form type.
     * </p>
     * 
     * @param status
     *        The status of the metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormTypeStatus
     */

    public GetFormTypeResult withStatus(FormTypeStatus status) {
        this.status = status.toString();
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
        if (getImports() != null)
            sb.append("Imports: ").append(getImports()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOriginDomainId() != null)
            sb.append("OriginDomainId: ").append(getOriginDomainId()).append(",");
        if (getOriginProjectId() != null)
            sb.append("OriginProjectId: ").append(getOriginProjectId()).append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFormTypeResult == false)
            return false;
        GetFormTypeResult other = (GetFormTypeResult) obj;
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
        if (other.getImports() == null ^ this.getImports() == null)
            return false;
        if (other.getImports() != null && other.getImports().equals(this.getImports()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOriginDomainId() == null ^ this.getOriginDomainId() == null)
            return false;
        if (other.getOriginDomainId() != null && other.getOriginDomainId().equals(this.getOriginDomainId()) == false)
            return false;
        if (other.getOriginProjectId() == null ^ this.getOriginProjectId() == null)
            return false;
        if (other.getOriginProjectId() != null && other.getOriginProjectId().equals(this.getOriginProjectId()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getImports() == null) ? 0 : getImports().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOriginDomainId() == null) ? 0 : getOriginDomainId().hashCode());
        hashCode = prime * hashCode + ((getOriginProjectId() == null) ? 0 : getOriginProjectId().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetFormTypeResult clone() {
        try {
            return (GetFormTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
