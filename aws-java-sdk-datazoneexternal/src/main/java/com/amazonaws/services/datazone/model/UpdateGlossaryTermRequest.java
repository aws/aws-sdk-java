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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlossaryTermRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     */
    private String glossaryIdentifier;
    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     */
    private String identifier;
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
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a business glossary term is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @param glossaryIdentifier
     *        The identifier of the business glossary in which a term is to be updated.
     */

    public void setGlossaryIdentifier(String glossaryIdentifier) {
        this.glossaryIdentifier = glossaryIdentifier;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @return The identifier of the business glossary in which a term is to be updated.
     */

    public String getGlossaryIdentifier() {
        return this.glossaryIdentifier;
    }

    /**
     * <p>
     * The identifier of the business glossary in which a term is to be updated.
     * </p>
     * 
     * @param glossaryIdentifier
     *        The identifier of the business glossary in which a term is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermRequest withGlossaryIdentifier(String glossaryIdentifier) {
        setGlossaryIdentifier(glossaryIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the business glossary term that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @return The identifier of the business glossary term that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the business glossary term that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the business glossary term that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryTermRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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

    public UpdateGlossaryTermRequest withLongDescription(String longDescription) {
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

    public UpdateGlossaryTermRequest withName(String name) {
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

    public UpdateGlossaryTermRequest withShortDescription(String shortDescription) {
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

    public UpdateGlossaryTermRequest withStatus(String status) {
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

    public UpdateGlossaryTermRequest withStatus(GlossaryTermStatus status) {
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

    public UpdateGlossaryTermRequest withTermRelations(TermRelations termRelations) {
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getGlossaryIdentifier() != null)
            sb.append("GlossaryIdentifier: ").append(getGlossaryIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof UpdateGlossaryTermRequest == false)
            return false;
        UpdateGlossaryTermRequest other = (UpdateGlossaryTermRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getGlossaryIdentifier() == null ^ this.getGlossaryIdentifier() == null)
            return false;
        if (other.getGlossaryIdentifier() != null && other.getGlossaryIdentifier().equals(this.getGlossaryIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGlossaryIdentifier() == null) ? 0 : getGlossaryIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTermRelations() == null) ? 0 : getTermRelations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlossaryTermRequest clone() {
        return (UpdateGlossaryTermRequest) super.clone();
    }

}
