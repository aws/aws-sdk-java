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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SubscribedAssetListing" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedAssetListing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     */
    private String entityRevision;
    /**
     * <p>
     * The type of the published asset for which the subscription grant is created.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The forms attached to the published asset for which the subscription grant is created.
     * </p>
     */
    private String forms;
    /**
     * <p>
     * The glossary terms attached to the published asset for which the subscription grant is created.
     * </p>
     */
    private java.util.List<DetailedGlossaryTerm> glossaryTerms;

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityId
     *        The identifier of the published asset for which the subscription grant is created.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The identifier of the published asset for which the subscription grant is created.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityId
     *        The identifier of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityRevision
     *        The revision of the published asset for which the subscription grant is created.
     */

    public void setEntityRevision(String entityRevision) {
        this.entityRevision = entityRevision;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The revision of the published asset for which the subscription grant is created.
     */

    public String getEntityRevision() {
        return this.entityRevision;
    }

    /**
     * <p>
     * The revision of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityRevision
     *        The revision of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withEntityRevision(String entityRevision) {
        setEntityRevision(entityRevision);
        return this;
    }

    /**
     * <p>
     * The type of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityType
     *        The type of the published asset for which the subscription grant is created.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The type of the published asset for which the subscription grant is created.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param entityType
     *        The type of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The forms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param forms
     *        The forms attached to the published asset for which the subscription grant is created.
     */

    public void setForms(String forms) {
        this.forms = forms;
    }

    /**
     * <p>
     * The forms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The forms attached to the published asset for which the subscription grant is created.
     */

    public String getForms() {
        return this.forms;
    }

    /**
     * <p>
     * The forms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param forms
     *        The forms attached to the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withForms(String forms) {
        setForms(forms);
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The glossary terms attached to the published asset for which the subscription grant is created.
     */

    public java.util.List<DetailedGlossaryTerm> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the published asset for which the subscription grant is created.
     */

    public void setGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms);
    }

    /**
     * <p>
     * The glossary terms attached to the published asset for which the subscription grant is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withGlossaryTerms(DetailedGlossaryTerm... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms.length));
        }
        for (DetailedGlossaryTerm ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAssetListing withGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityRevision() != null)
            sb.append("EntityRevision: ").append(getEntityRevision()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getForms() != null)
            sb.append("Forms: ").append(getForms()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedAssetListing == false)
            return false;
        SubscribedAssetListing other = (SubscribedAssetListing) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityRevision() == null ^ this.getEntityRevision() == null)
            return false;
        if (other.getEntityRevision() != null && other.getEntityRevision().equals(this.getEntityRevision()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getForms() == null ^ this.getForms() == null)
            return false;
        if (other.getForms() != null && other.getForms().equals(this.getForms()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityRevision() == null) ? 0 : getEntityRevision().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getForms() == null) ? 0 : getForms().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        return hashCode;
    }

    @Override
    public SubscribedAssetListing clone() {
        try {
            return (SubscribedAssetListing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SubscribedAssetListingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
