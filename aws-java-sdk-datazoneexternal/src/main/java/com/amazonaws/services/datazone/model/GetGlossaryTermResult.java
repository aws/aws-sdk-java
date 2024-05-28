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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossaryTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGlossaryTermResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the business glossary term was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the business glossary.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the business glossary to which this term belongs.
     * </p>
     */
    private String glossaryId;
    /**
     * <p>
     * The ID of the business glossary term.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The long description of the business glossary term.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * The name of the business glossary term.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The short decription of the business glossary term.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * The status of the business glossary term.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The relations of the business glossary term.
     * </p>
     */
    private TermRelations termRelations;
    /**
     * <p>
     * The timestamp of when the business glossary term was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary term.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp of when the business glossary term was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the business glossary term was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary term was created.
     * </p>
     * 
     * @return The timestamp of when the business glossary term was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary term was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the business glossary term was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the business glossary.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the business glossary.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the business glossary.
     * </p>
     * 
     * @return The Amazon DataZone user who created the business glossary.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the business glossary.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary term exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this business glossary term exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary term exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the business glossary to which this term belongs.
     * </p>
     * 
     * @param glossaryId
     *        The ID of the business glossary to which this term belongs.
     */

    public void setGlossaryId(String glossaryId) {
        this.glossaryId = glossaryId;
    }

    /**
     * <p>
     * The ID of the business glossary to which this term belongs.
     * </p>
     * 
     * @return The ID of the business glossary to which this term belongs.
     */

    public String getGlossaryId() {
        return this.glossaryId;
    }

    /**
     * <p>
     * The ID of the business glossary to which this term belongs.
     * </p>
     * 
     * @param glossaryId
     *        The ID of the business glossary to which this term belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withGlossaryId(String glossaryId) {
        setGlossaryId(glossaryId);
        return this;
    }

    /**
     * <p>
     * The ID of the business glossary term.
     * </p>
     * 
     * @param id
     *        The ID of the business glossary term.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the business glossary term.
     * </p>
     * 
     * @return The ID of the business glossary term.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the business glossary term.
     * </p>
     * 
     * @param id
     *        The ID of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The long description of the business glossary term.
     * </p>
     * 
     * @param longDescription
     *        The long description of the business glossary term.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * The long description of the business glossary term.
     * </p>
     * 
     * @return The long description of the business glossary term.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * The long description of the business glossary term.
     * </p>
     * 
     * @param longDescription
     *        The long description of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * The name of the business glossary term.
     * </p>
     * 
     * @param name
     *        The name of the business glossary term.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the business glossary term.
     * </p>
     * 
     * @return The name of the business glossary term.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the business glossary term.
     * </p>
     * 
     * @param name
     *        The name of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The short decription of the business glossary term.
     * </p>
     * 
     * @param shortDescription
     *        The short decription of the business glossary term.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * The short decription of the business glossary term.
     * </p>
     * 
     * @return The short decription of the business glossary term.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * The short decription of the business glossary term.
     * </p>
     * 
     * @param shortDescription
     *        The short decription of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * The status of the business glossary term.
     * </p>
     * 
     * @param status
     *        The status of the business glossary term.
     * @see GlossaryTermStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the business glossary term.
     * </p>
     * 
     * @return The status of the business glossary term.
     * @see GlossaryTermStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the business glossary term.
     * </p>
     * 
     * @param status
     *        The status of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public GetGlossaryTermResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the business glossary term.
     * </p>
     * 
     * @param status
     *        The status of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public GetGlossaryTermResult withStatus(GlossaryTermStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The relations of the business glossary term.
     * </p>
     * 
     * @param termRelations
     *        The relations of the business glossary term.
     */

    public void setTermRelations(TermRelations termRelations) {
        this.termRelations = termRelations;
    }

    /**
     * <p>
     * The relations of the business glossary term.
     * </p>
     * 
     * @return The relations of the business glossary term.
     */

    public TermRelations getTermRelations() {
        return this.termRelations;
    }

    /**
     * <p>
     * The relations of the business glossary term.
     * </p>
     * 
     * @param termRelations
     *        The relations of the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withTermRelations(TermRelations termRelations) {
        setTermRelations(termRelations);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the business glossary term was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the business glossary term was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary term was updated.
     * </p>
     * 
     * @return The timestamp of when the business glossary term was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the business glossary term was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the business glossary term was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary term.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the business glossary term.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary term.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the business glossary term.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the business glossary term.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlossaryTermResult withUpdatedBy(String updatedBy) {
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGlossaryId() != null)
            sb.append("GlossaryId: ").append(getGlossaryId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLongDescription() != null)
            sb.append("LongDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTermRelations() != null)
            sb.append("TermRelations: ").append(getTermRelations()).append(",");
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

        if (obj instanceof GetGlossaryTermResult == false)
            return false;
        GetGlossaryTermResult other = (GetGlossaryTermResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGlossaryId() == null ^ this.getGlossaryId() == null)
            return false;
        if (other.getGlossaryId() != null && other.getGlossaryId().equals(this.getGlossaryId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLongDescription() == null ^ this.getLongDescription() == null)
            return false;
        if (other.getLongDescription() != null && other.getLongDescription().equals(this.getLongDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTermRelations() == null ^ this.getTermRelations() == null)
            return false;
        if (other.getTermRelations() != null && other.getTermRelations().equals(this.getTermRelations()) == false)
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
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGlossaryId() == null) ? 0 : getGlossaryId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTermRelations() == null) ? 0 : getTermRelations().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetGlossaryTermResult clone() {
        try {
            return (GetGlossaryTermResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
