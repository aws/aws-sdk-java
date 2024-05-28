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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlossaryTermResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     */
    private String glossaryId;
    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     */
    private TermRelations termRelations;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @param glossaryId
     *        The identifier of the business glossary in which a term is to be updated.
     */

    public void setGlossaryId(String glossaryId) {
        this.glossaryId = glossaryId;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @return The identifier of the business glossary in which a term is to be updated.
     */

    public String getGlossaryId() {
        return this.glossaryId;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @param glossaryId
     *        The identifier of the business glossary in which a term is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withGlossaryId(String glossaryId) {
        setGlossaryId(glossaryId);
        return this;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @param id
     *        The identifier of the business glossary term that is to be updated.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @return The identifier of the business glossary term that is to be updated.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @param id
     *        The identifier of the business glossary term that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param longDescription
     *        The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @return The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param longDescription
     *        The long description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param shortDescription
     *        The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @return The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param shortDescription
     *        The short description to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @see GlossaryTermStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @return The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @see GlossaryTermStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public UpdateGlossaryTermResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public UpdateGlossaryTermResult withStatus(GlossaryTermStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param termRelations
     *        The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public void setTermRelations(TermRelations termRelations) {
        this.termRelations = termRelations;
    }

    /**
     * <p>
     * The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @return The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     */

    public TermRelations getTermRelations() {
        return this.termRelations;
    }

    /**
     * <p>
     * The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * </p>
     * 
     * @param termRelations
     *        The term relations to be updated as part of the <code>UpdateGlossaryTerm</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermResult withTermRelations(TermRelations termRelations) {
        setTermRelations(termRelations);
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
            sb.append("TermRelations: ").append(getTermRelations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlossaryTermResult == false)
            return false;
        UpdateGlossaryTermResult other = (UpdateGlossaryTermResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGlossaryId() == null) ? 0 : getGlossaryId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTermRelations() == null) ? 0 : getTermRelations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlossaryTermResult clone() {
        try {
            return (UpdateGlossaryTermResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
