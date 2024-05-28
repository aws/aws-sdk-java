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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossaryTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlossaryTermResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term is created.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the business glossary in which this term is created.
     * </p>
     */
    private String glossaryId;
    /**
     * <p>
     * The ID of this business glossary term.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The long description of this business glossary term.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * The name of this business glossary term.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The short description of this business glossary term.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * The status of this business glossary term.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The term relations of this business glossary term.
     * </p>
     */
    private TermRelations termRelations;

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary term is created.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this business glossary term is created.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary term is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary term is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the business glossary in which this term is created.
     * </p>
     * 
     * @param glossaryId
     *        The ID of the business glossary in which this term is created.
     */

    public void setGlossaryId(String glossaryId) {
        this.glossaryId = glossaryId;
    }

    /**
     * <p>
     * The ID of the business glossary in which this term is created.
     * </p>
     * 
     * @return The ID of the business glossary in which this term is created.
     */

    public String getGlossaryId() {
        return this.glossaryId;
    }

    /**
     * <p>
     * The ID of the business glossary in which this term is created.
     * </p>
     * 
     * @param glossaryId
     *        The ID of the business glossary in which this term is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withGlossaryId(String glossaryId) {
        setGlossaryId(glossaryId);
        return this;
    }

    /**
     * <p>
     * The ID of this business glossary term.
     * </p>
     * 
     * @param id
     *        The ID of this business glossary term.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of this business glossary term.
     * </p>
     * 
     * @return The ID of this business glossary term.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of this business glossary term.
     * </p>
     * 
     * @param id
     *        The ID of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The long description of this business glossary term.
     * </p>
     * 
     * @param longDescription
     *        The long description of this business glossary term.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * The long description of this business glossary term.
     * </p>
     * 
     * @return The long description of this business glossary term.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * The long description of this business glossary term.
     * </p>
     * 
     * @param longDescription
     *        The long description of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * The name of this business glossary term.
     * </p>
     * 
     * @param name
     *        The name of this business glossary term.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this business glossary term.
     * </p>
     * 
     * @return The name of this business glossary term.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this business glossary term.
     * </p>
     * 
     * @param name
     *        The name of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The short description of this business glossary term.
     * </p>
     * 
     * @param shortDescription
     *        The short description of this business glossary term.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * The short description of this business glossary term.
     * </p>
     * 
     * @return The short description of this business glossary term.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * The short description of this business glossary term.
     * </p>
     * 
     * @param shortDescription
     *        The short description of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * The status of this business glossary term.
     * </p>
     * 
     * @param status
     *        The status of this business glossary term.
     * @see GlossaryTermStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this business glossary term.
     * </p>
     * 
     * @return The status of this business glossary term.
     * @see GlossaryTermStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this business glossary term.
     * </p>
     * 
     * @param status
     *        The status of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public CreateGlossaryTermResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this business glossary term.
     * </p>
     * 
     * @param status
     *        The status of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryTermStatus
     */

    public CreateGlossaryTermResult withStatus(GlossaryTermStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The term relations of this business glossary term.
     * </p>
     * 
     * @param termRelations
     *        The term relations of this business glossary term.
     */

    public void setTermRelations(TermRelations termRelations) {
        this.termRelations = termRelations;
    }

    /**
     * <p>
     * The term relations of this business glossary term.
     * </p>
     * 
     * @return The term relations of this business glossary term.
     */

    public TermRelations getTermRelations() {
        return this.termRelations;
    }

    /**
     * <p>
     * The term relations of this business glossary term.
     * </p>
     * 
     * @param termRelations
     *        The term relations of this business glossary term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryTermResult withTermRelations(TermRelations termRelations) {
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

        if (obj instanceof CreateGlossaryTermResult == false)
            return false;
        CreateGlossaryTermResult other = (CreateGlossaryTermResult) obj;
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
    public CreateGlossaryTermResult clone() {
        try {
            return (CreateGlossaryTermResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
