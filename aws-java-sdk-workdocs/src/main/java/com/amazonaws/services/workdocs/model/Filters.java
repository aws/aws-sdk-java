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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters results based on entity metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Filters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     */
    private java.util.List<String> textLocales;
    /**
     * <p>
     * Filters by content category.
     * </p>
     */
    private java.util.List<String> contentCategories;
    /**
     * <p>
     * Filters based on entity type.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * Filter by labels using exact match.
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * Filter based on UserIds or GroupIds.
     * </p>
     */
    private java.util.List<SearchPrincipalType> principals;
    /**
     * <p>
     * Filter based on resource’s path.
     * </p>
     */
    private java.util.List<String> ancestorIds;
    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     */
    private java.util.List<String> searchCollectionTypes;
    /**
     * <p>
     * Filter based on size (in bytes).
     * </p>
     */
    private LongRangeType sizeRange;
    /**
     * <p>
     * Filter based on resource’s creation timestamp.
     * </p>
     */
    private DateRangeType createdRange;
    /**
     * <p>
     * Filter based on resource’s modified timestamp.
     * </p>
     */
    private DateRangeType modifiedRange;

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     * 
     * @return Filters by the locale of the content or comment.
     * @see LanguageCodeType
     */

    public java.util.List<String> getTextLocales() {
        return textLocales;
    }

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     * 
     * @param textLocales
     *        Filters by the locale of the content or comment.
     * @see LanguageCodeType
     */

    public void setTextLocales(java.util.Collection<String> textLocales) {
        if (textLocales == null) {
            this.textLocales = null;
            return;
        }

        this.textLocales = new java.util.ArrayList<String>(textLocales);
    }

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextLocales(java.util.Collection)} or {@link #withTextLocales(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param textLocales
     *        Filters by the locale of the content or comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCodeType
     */

    public Filters withTextLocales(String... textLocales) {
        if (this.textLocales == null) {
            setTextLocales(new java.util.ArrayList<String>(textLocales.length));
        }
        for (String ele : textLocales) {
            this.textLocales.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     * 
     * @param textLocales
     *        Filters by the locale of the content or comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCodeType
     */

    public Filters withTextLocales(java.util.Collection<String> textLocales) {
        setTextLocales(textLocales);
        return this;
    }

    /**
     * <p>
     * Filters by the locale of the content or comment.
     * </p>
     * 
     * @param textLocales
     *        Filters by the locale of the content or comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCodeType
     */

    public Filters withTextLocales(LanguageCodeType... textLocales) {
        java.util.ArrayList<String> textLocalesCopy = new java.util.ArrayList<String>(textLocales.length);
        for (LanguageCodeType value : textLocales) {
            textLocalesCopy.add(value.toString());
        }
        if (getTextLocales() == null) {
            setTextLocales(textLocalesCopy);
        } else {
            getTextLocales().addAll(textLocalesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters by content category.
     * </p>
     * 
     * @return Filters by content category.
     * @see ContentCategoryType
     */

    public java.util.List<String> getContentCategories() {
        return contentCategories;
    }

    /**
     * <p>
     * Filters by content category.
     * </p>
     * 
     * @param contentCategories
     *        Filters by content category.
     * @see ContentCategoryType
     */

    public void setContentCategories(java.util.Collection<String> contentCategories) {
        if (contentCategories == null) {
            this.contentCategories = null;
            return;
        }

        this.contentCategories = new java.util.ArrayList<String>(contentCategories);
    }

    /**
     * <p>
     * Filters by content category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentCategories(java.util.Collection)} or {@link #withContentCategories(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param contentCategories
     *        Filters by content category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentCategoryType
     */

    public Filters withContentCategories(String... contentCategories) {
        if (this.contentCategories == null) {
            setContentCategories(new java.util.ArrayList<String>(contentCategories.length));
        }
        for (String ele : contentCategories) {
            this.contentCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters by content category.
     * </p>
     * 
     * @param contentCategories
     *        Filters by content category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentCategoryType
     */

    public Filters withContentCategories(java.util.Collection<String> contentCategories) {
        setContentCategories(contentCategories);
        return this;
    }

    /**
     * <p>
     * Filters by content category.
     * </p>
     * 
     * @param contentCategories
     *        Filters by content category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentCategoryType
     */

    public Filters withContentCategories(ContentCategoryType... contentCategories) {
        java.util.ArrayList<String> contentCategoriesCopy = new java.util.ArrayList<String>(contentCategories.length);
        for (ContentCategoryType value : contentCategories) {
            contentCategoriesCopy.add(value.toString());
        }
        if (getContentCategories() == null) {
            setContentCategories(contentCategoriesCopy);
        } else {
            getContentCategories().addAll(contentCategoriesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters based on entity type.
     * </p>
     * 
     * @return Filters based on entity type.
     * @see SearchResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * Filters based on entity type.
     * </p>
     * 
     * @param resourceTypes
     *        Filters based on entity type.
     * @see SearchResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * Filters based on entity type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        Filters based on entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchResourceType
     */

    public Filters withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters based on entity type.
     * </p>
     * 
     * @param resourceTypes
     *        Filters based on entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchResourceType
     */

    public Filters withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * Filters based on entity type.
     * </p>
     * 
     * @param resourceTypes
     *        Filters based on entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchResourceType
     */

    public Filters withResourceTypes(SearchResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (SearchResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filter by labels using exact match.
     * </p>
     * 
     * @return Filter by labels using exact match.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Filter by labels using exact match.
     * </p>
     * 
     * @param labels
     *        Filter by labels using exact match.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * Filter by labels using exact match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Filter by labels using exact match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter by labels using exact match.
     * </p>
     * 
     * @param labels
     *        Filter by labels using exact match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Filter based on UserIds or GroupIds.
     * </p>
     * 
     * @return Filter based on UserIds or GroupIds.
     */

    public java.util.List<SearchPrincipalType> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * Filter based on UserIds or GroupIds.
     * </p>
     * 
     * @param principals
     *        Filter based on UserIds or GroupIds.
     */

    public void setPrincipals(java.util.Collection<SearchPrincipalType> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<SearchPrincipalType>(principals);
    }

    /**
     * <p>
     * Filter based on UserIds or GroupIds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        Filter based on UserIds or GroupIds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withPrincipals(SearchPrincipalType... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<SearchPrincipalType>(principals.length));
        }
        for (SearchPrincipalType ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter based on UserIds or GroupIds.
     * </p>
     * 
     * @param principals
     *        Filter based on UserIds or GroupIds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withPrincipals(java.util.Collection<SearchPrincipalType> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Filter based on resource’s path.
     * </p>
     * 
     * @return Filter based on resource’s path.
     */

    public java.util.List<String> getAncestorIds() {
        return ancestorIds;
    }

    /**
     * <p>
     * Filter based on resource’s path.
     * </p>
     * 
     * @param ancestorIds
     *        Filter based on resource’s path.
     */

    public void setAncestorIds(java.util.Collection<String> ancestorIds) {
        if (ancestorIds == null) {
            this.ancestorIds = null;
            return;
        }

        this.ancestorIds = new java.util.ArrayList<String>(ancestorIds);
    }

    /**
     * <p>
     * Filter based on resource’s path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAncestorIds(java.util.Collection)} or {@link #withAncestorIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ancestorIds
     *        Filter based on resource’s path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withAncestorIds(String... ancestorIds) {
        if (this.ancestorIds == null) {
            setAncestorIds(new java.util.ArrayList<String>(ancestorIds.length));
        }
        for (String ele : ancestorIds) {
            this.ancestorIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter based on resource’s path.
     * </p>
     * 
     * @param ancestorIds
     *        Filter based on resource’s path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withAncestorIds(java.util.Collection<String> ancestorIds) {
        setAncestorIds(ancestorIds);
        return this;
    }

    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     * 
     * @return Filter based on file groupings.
     * @see SearchCollectionType
     */

    public java.util.List<String> getSearchCollectionTypes() {
        return searchCollectionTypes;
    }

    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     * 
     * @param searchCollectionTypes
     *        Filter based on file groupings.
     * @see SearchCollectionType
     */

    public void setSearchCollectionTypes(java.util.Collection<String> searchCollectionTypes) {
        if (searchCollectionTypes == null) {
            this.searchCollectionTypes = null;
            return;
        }

        this.searchCollectionTypes = new java.util.ArrayList<String>(searchCollectionTypes);
    }

    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchCollectionTypes(java.util.Collection)} or
     * {@link #withSearchCollectionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param searchCollectionTypes
     *        Filter based on file groupings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchCollectionType
     */

    public Filters withSearchCollectionTypes(String... searchCollectionTypes) {
        if (this.searchCollectionTypes == null) {
            setSearchCollectionTypes(new java.util.ArrayList<String>(searchCollectionTypes.length));
        }
        for (String ele : searchCollectionTypes) {
            this.searchCollectionTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     * 
     * @param searchCollectionTypes
     *        Filter based on file groupings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchCollectionType
     */

    public Filters withSearchCollectionTypes(java.util.Collection<String> searchCollectionTypes) {
        setSearchCollectionTypes(searchCollectionTypes);
        return this;
    }

    /**
     * <p>
     * Filter based on file groupings.
     * </p>
     * 
     * @param searchCollectionTypes
     *        Filter based on file groupings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchCollectionType
     */

    public Filters withSearchCollectionTypes(SearchCollectionType... searchCollectionTypes) {
        java.util.ArrayList<String> searchCollectionTypesCopy = new java.util.ArrayList<String>(searchCollectionTypes.length);
        for (SearchCollectionType value : searchCollectionTypes) {
            searchCollectionTypesCopy.add(value.toString());
        }
        if (getSearchCollectionTypes() == null) {
            setSearchCollectionTypes(searchCollectionTypesCopy);
        } else {
            getSearchCollectionTypes().addAll(searchCollectionTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filter based on size (in bytes).
     * </p>
     * 
     * @param sizeRange
     *        Filter based on size (in bytes).
     */

    public void setSizeRange(LongRangeType sizeRange) {
        this.sizeRange = sizeRange;
    }

    /**
     * <p>
     * Filter based on size (in bytes).
     * </p>
     * 
     * @return Filter based on size (in bytes).
     */

    public LongRangeType getSizeRange() {
        return this.sizeRange;
    }

    /**
     * <p>
     * Filter based on size (in bytes).
     * </p>
     * 
     * @param sizeRange
     *        Filter based on size (in bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withSizeRange(LongRangeType sizeRange) {
        setSizeRange(sizeRange);
        return this;
    }

    /**
     * <p>
     * Filter based on resource’s creation timestamp.
     * </p>
     * 
     * @param createdRange
     *        Filter based on resource’s creation timestamp.
     */

    public void setCreatedRange(DateRangeType createdRange) {
        this.createdRange = createdRange;
    }

    /**
     * <p>
     * Filter based on resource’s creation timestamp.
     * </p>
     * 
     * @return Filter based on resource’s creation timestamp.
     */

    public DateRangeType getCreatedRange() {
        return this.createdRange;
    }

    /**
     * <p>
     * Filter based on resource’s creation timestamp.
     * </p>
     * 
     * @param createdRange
     *        Filter based on resource’s creation timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withCreatedRange(DateRangeType createdRange) {
        setCreatedRange(createdRange);
        return this;
    }

    /**
     * <p>
     * Filter based on resource’s modified timestamp.
     * </p>
     * 
     * @param modifiedRange
     *        Filter based on resource’s modified timestamp.
     */

    public void setModifiedRange(DateRangeType modifiedRange) {
        this.modifiedRange = modifiedRange;
    }

    /**
     * <p>
     * Filter based on resource’s modified timestamp.
     * </p>
     * 
     * @return Filter based on resource’s modified timestamp.
     */

    public DateRangeType getModifiedRange() {
        return this.modifiedRange;
    }

    /**
     * <p>
     * Filter based on resource’s modified timestamp.
     * </p>
     * 
     * @param modifiedRange
     *        Filter based on resource’s modified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withModifiedRange(DateRangeType modifiedRange) {
        setModifiedRange(modifiedRange);
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
        if (getTextLocales() != null)
            sb.append("TextLocales: ").append(getTextLocales()).append(",");
        if (getContentCategories() != null)
            sb.append("ContentCategories: ").append(getContentCategories()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getAncestorIds() != null)
            sb.append("AncestorIds: ").append(getAncestorIds()).append(",");
        if (getSearchCollectionTypes() != null)
            sb.append("SearchCollectionTypes: ").append(getSearchCollectionTypes()).append(",");
        if (getSizeRange() != null)
            sb.append("SizeRange: ").append(getSizeRange()).append(",");
        if (getCreatedRange() != null)
            sb.append("CreatedRange: ").append(getCreatedRange()).append(",");
        if (getModifiedRange() != null)
            sb.append("ModifiedRange: ").append(getModifiedRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filters == false)
            return false;
        Filters other = (Filters) obj;
        if (other.getTextLocales() == null ^ this.getTextLocales() == null)
            return false;
        if (other.getTextLocales() != null && other.getTextLocales().equals(this.getTextLocales()) == false)
            return false;
        if (other.getContentCategories() == null ^ this.getContentCategories() == null)
            return false;
        if (other.getContentCategories() != null && other.getContentCategories().equals(this.getContentCategories()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getAncestorIds() == null ^ this.getAncestorIds() == null)
            return false;
        if (other.getAncestorIds() != null && other.getAncestorIds().equals(this.getAncestorIds()) == false)
            return false;
        if (other.getSearchCollectionTypes() == null ^ this.getSearchCollectionTypes() == null)
            return false;
        if (other.getSearchCollectionTypes() != null && other.getSearchCollectionTypes().equals(this.getSearchCollectionTypes()) == false)
            return false;
        if (other.getSizeRange() == null ^ this.getSizeRange() == null)
            return false;
        if (other.getSizeRange() != null && other.getSizeRange().equals(this.getSizeRange()) == false)
            return false;
        if (other.getCreatedRange() == null ^ this.getCreatedRange() == null)
            return false;
        if (other.getCreatedRange() != null && other.getCreatedRange().equals(this.getCreatedRange()) == false)
            return false;
        if (other.getModifiedRange() == null ^ this.getModifiedRange() == null)
            return false;
        if (other.getModifiedRange() != null && other.getModifiedRange().equals(this.getModifiedRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextLocales() == null) ? 0 : getTextLocales().hashCode());
        hashCode = prime * hashCode + ((getContentCategories() == null) ? 0 : getContentCategories().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getAncestorIds() == null) ? 0 : getAncestorIds().hashCode());
        hashCode = prime * hashCode + ((getSearchCollectionTypes() == null) ? 0 : getSearchCollectionTypes().hashCode());
        hashCode = prime * hashCode + ((getSizeRange() == null) ? 0 : getSizeRange().hashCode());
        hashCode = prime * hashCode + ((getCreatedRange() == null) ? 0 : getCreatedRange().hashCode());
        hashCode = prime * hashCode + ((getModifiedRange() == null) ? 0 : getModifiedRange().hashCode());
        return hashCode;
    }

    @Override
    public Filters clone() {
        try {
            return (Filters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.FiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
