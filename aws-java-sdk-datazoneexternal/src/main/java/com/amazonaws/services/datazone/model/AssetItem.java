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
 * A Amazon DataZone inventory asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The additional attributes of a Amazon DataZone inventory asset.
     * </p>
     */
    private AssetItemAdditionalAttributes additionalAttributes;
    /**
     * <p>
     * The timestamp of when the Amazon DataZone inventory asset was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of an Amazon DataZone inventory asset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the inventory asset exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The external identifier of the Amazon DataZone inventory asset.
     * </p>
     */
    private String externalIdentifier;
    /**
     * <p>
     * The timestamp of when the first revision of the inventory asset was created.
     * </p>
     */
    private java.util.Date firstRevisionCreatedAt;
    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the inventory asset.
     * </p>
     */
    private String firstRevisionCreatedBy;
    /**
     * <p>
     * The glossary terms attached to the Amazon DataZone inventory asset.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * the identifier of the Amazon DataZone inventory asset.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name of the Amazon DataZone inventory asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the Amazon DataZone project that owns the inventory asset.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The identifier of the asset type of the specified Amazon DataZone inventory asset.
     * </p>
     */
    private String typeIdentifier;
    /**
     * <p>
     * The revision of the inventory asset type.
     * </p>
     */
    private String typeRevision;

    /**
     * <p>
     * The additional attributes of a Amazon DataZone inventory asset.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional attributes of a Amazon DataZone inventory asset.
     */

    public void setAdditionalAttributes(AssetItemAdditionalAttributes additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    /**
     * <p>
     * The additional attributes of a Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The additional attributes of a Amazon DataZone inventory asset.
     */

    public AssetItemAdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /**
     * <p>
     * The additional attributes of a Amazon DataZone inventory asset.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional attributes of a Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withAdditionalAttributes(AssetItemAdditionalAttributes additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone inventory asset was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the Amazon DataZone inventory asset was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone inventory asset was created.
     * </p>
     * 
     * @return The timestamp of when the Amazon DataZone inventory asset was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone inventory asset was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the Amazon DataZone inventory asset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the inventory asset.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @return The Amazon DataZone user who created the inventory asset.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of an Amazon DataZone inventory asset.
     * </p>
     * 
     * @param description
     *        The description of an Amazon DataZone inventory asset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The description of an Amazon DataZone inventory asset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an Amazon DataZone inventory asset.
     * </p>
     * 
     * @param description
     *        The description of an Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the inventory asset exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the inventory asset exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the inventory asset exists.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which the inventory asset exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the inventory asset exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the inventory asset exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The external identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param externalIdentifier
     *        The external identifier of the Amazon DataZone inventory asset.
     */

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    /**
     * <p>
     * The external identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The external identifier of the Amazon DataZone inventory asset.
     */

    public String getExternalIdentifier() {
        return this.externalIdentifier;
    }

    /**
     * <p>
     * The external identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param externalIdentifier
     *        The external identifier of the Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withExternalIdentifier(String externalIdentifier) {
        setExternalIdentifier(externalIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the inventory asset was created.
     * </p>
     * 
     * @param firstRevisionCreatedAt
     *        The timestamp of when the first revision of the inventory asset was created.
     */

    public void setFirstRevisionCreatedAt(java.util.Date firstRevisionCreatedAt) {
        this.firstRevisionCreatedAt = firstRevisionCreatedAt;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the inventory asset was created.
     * </p>
     * 
     * @return The timestamp of when the first revision of the inventory asset was created.
     */

    public java.util.Date getFirstRevisionCreatedAt() {
        return this.firstRevisionCreatedAt;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the inventory asset was created.
     * </p>
     * 
     * @param firstRevisionCreatedAt
     *        The timestamp of when the first revision of the inventory asset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withFirstRevisionCreatedAt(java.util.Date firstRevisionCreatedAt) {
        setFirstRevisionCreatedAt(firstRevisionCreatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the inventory asset.
     * </p>
     * 
     * @param firstRevisionCreatedBy
     *        The Amazon DataZone user who created the first revision of the inventory asset.
     */

    public void setFirstRevisionCreatedBy(String firstRevisionCreatedBy) {
        this.firstRevisionCreatedBy = firstRevisionCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the inventory asset.
     * </p>
     * 
     * @return The Amazon DataZone user who created the first revision of the inventory asset.
     */

    public String getFirstRevisionCreatedBy() {
        return this.firstRevisionCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the inventory asset.
     * </p>
     * 
     * @param firstRevisionCreatedBy
     *        The Amazon DataZone user who created the first revision of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withFirstRevisionCreatedBy(String firstRevisionCreatedBy) {
        setFirstRevisionCreatedBy(firstRevisionCreatedBy);
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to the Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The glossary terms attached to the Amazon DataZone inventory asset.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms attached to the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the Amazon DataZone inventory asset.
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p>
     * The glossary terms attached to the Amazon DataZone inventory asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * the identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param identifier
     *        the identifier of the Amazon DataZone inventory asset.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * the identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @return the identifier of the Amazon DataZone inventory asset.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * the identifier of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param identifier
     *        the identifier of the Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone inventory asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The name of the Amazon DataZone inventory asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone inventory asset.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that owns the inventory asset.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the Amazon DataZone project that owns the inventory asset.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that owns the inventory asset.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project that owns the inventory asset.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that owns the inventory asset.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the Amazon DataZone project that owns the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The identifier of the asset type of the specified Amazon DataZone inventory asset.
     * </p>
     * 
     * @param typeIdentifier
     *        The identifier of the asset type of the specified Amazon DataZone inventory asset.
     */

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p>
     * The identifier of the asset type of the specified Amazon DataZone inventory asset.
     * </p>
     * 
     * @return The identifier of the asset type of the specified Amazon DataZone inventory asset.
     */

    public String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /**
     * <p>
     * The identifier of the asset type of the specified Amazon DataZone inventory asset.
     * </p>
     * 
     * @param typeIdentifier
     *        The identifier of the asset type of the specified Amazon DataZone inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withTypeIdentifier(String typeIdentifier) {
        setTypeIdentifier(typeIdentifier);
        return this;
    }

    /**
     * <p>
     * The revision of the inventory asset type.
     * </p>
     * 
     * @param typeRevision
     *        The revision of the inventory asset type.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The revision of the inventory asset type.
     * </p>
     * 
     * @return The revision of the inventory asset type.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The revision of the inventory asset type.
     * </p>
     * 
     * @param typeRevision
     *        The revision of the inventory asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItem withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
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
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getExternalIdentifier() != null)
            sb.append("ExternalIdentifier: ").append("***Sensitive Data Redacted***").append(",");
        if (getFirstRevisionCreatedAt() != null)
            sb.append("FirstRevisionCreatedAt: ").append(getFirstRevisionCreatedAt()).append(",");
        if (getFirstRevisionCreatedBy() != null)
            sb.append("FirstRevisionCreatedBy: ").append(getFirstRevisionCreatedBy()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getTypeIdentifier() != null)
            sb.append("TypeIdentifier: ").append(getTypeIdentifier()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetItem == false)
            return false;
        AssetItem other = (AssetItem) obj;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
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
        if (other.getExternalIdentifier() == null ^ this.getExternalIdentifier() == null)
            return false;
        if (other.getExternalIdentifier() != null && other.getExternalIdentifier().equals(this.getExternalIdentifier()) == false)
            return false;
        if (other.getFirstRevisionCreatedAt() == null ^ this.getFirstRevisionCreatedAt() == null)
            return false;
        if (other.getFirstRevisionCreatedAt() != null && other.getFirstRevisionCreatedAt().equals(this.getFirstRevisionCreatedAt()) == false)
            return false;
        if (other.getFirstRevisionCreatedBy() == null ^ this.getFirstRevisionCreatedBy() == null)
            return false;
        if (other.getFirstRevisionCreatedBy() != null && other.getFirstRevisionCreatedBy().equals(this.getFirstRevisionCreatedBy()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null)
            return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getExternalIdentifier() == null) ? 0 : getExternalIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFirstRevisionCreatedAt() == null) ? 0 : getFirstRevisionCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFirstRevisionCreatedBy() == null) ? 0 : getFirstRevisionCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        return hashCode;
    }

    @Override
    public AssetItem clone() {
        try {
            return (AssetItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
