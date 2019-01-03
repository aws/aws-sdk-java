/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for a 64-bit signed integer field. Present if <code>IndexFieldType</code> specifies the field is of type
 * <code>int</code>. All options are enabled by default.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntOptions implements Serializable, Cloneable {

    /**
     * A value to use for the field if the field isn't specified for a document. This can be important if you are using
     * the field in an expression and that field is not present in every document.
     */
    private Long defaultValue;
    /**
     * <p>
     * The name of the source field to map to the field.
     * </p>
     */
    private String sourceField;
    /**
     * <p>
     * Whether facet information can be returned for the field.
     * </p>
     */
    private Boolean facetEnabled;
    /**
     * <p>
     * Whether the contents of the field are searchable.
     * </p>
     */
    private Boolean searchEnabled;
    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     */
    private Boolean returnEnabled;
    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     */
    private Boolean sortEnabled;

    /**
     * A value to use for the field if the field isn't specified for a document. This can be important if you are using
     * the field in an expression and that field is not present in every document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document. This can be important if you are
     *        using the field in an expression and that field is not present in every document.
     */

    public void setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document. This can be important if you are using
     * the field in an expression and that field is not present in every document.
     * 
     * @return A value to use for the field if the field isn't specified for a document. This can be important if you
     *         are using the field in an expression and that field is not present in every document.
     */

    public Long getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document. This can be important if you are using
     * the field in an expression and that field is not present in every document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document. This can be important if you are
     *        using the field in an expression and that field is not present in every document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withDefaultValue(Long defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The name of the source field to map to the field.
     * </p>
     * 
     * @param sourceField
     *        The name of the source field to map to the field.
     */

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    /**
     * <p>
     * The name of the source field to map to the field.
     * </p>
     * 
     * @return The name of the source field to map to the field.
     */

    public String getSourceField() {
        return this.sourceField;
    }

    /**
     * <p>
     * The name of the source field to map to the field.
     * </p>
     * 
     * @param sourceField
     *        The name of the source field to map to the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withSourceField(String sourceField) {
        setSourceField(sourceField);
        return this;
    }

    /**
     * <p>
     * Whether facet information can be returned for the field.
     * </p>
     * 
     * @param facetEnabled
     *        Whether facet information can be returned for the field.
     */

    public void setFacetEnabled(Boolean facetEnabled) {
        this.facetEnabled = facetEnabled;
    }

    /**
     * <p>
     * Whether facet information can be returned for the field.
     * </p>
     * 
     * @return Whether facet information can be returned for the field.
     */

    public Boolean getFacetEnabled() {
        return this.facetEnabled;
    }

    /**
     * <p>
     * Whether facet information can be returned for the field.
     * </p>
     * 
     * @param facetEnabled
     *        Whether facet information can be returned for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withFacetEnabled(Boolean facetEnabled) {
        setFacetEnabled(facetEnabled);
        return this;
    }

    /**
     * <p>
     * Whether facet information can be returned for the field.
     * </p>
     * 
     * @return Whether facet information can be returned for the field.
     */

    public Boolean isFacetEnabled() {
        return this.facetEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field are searchable.
     * </p>
     * 
     * @param searchEnabled
     *        Whether the contents of the field are searchable.
     */

    public void setSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field are searchable.
     * </p>
     * 
     * @return Whether the contents of the field are searchable.
     */

    public Boolean getSearchEnabled() {
        return this.searchEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field are searchable.
     * </p>
     * 
     * @param searchEnabled
     *        Whether the contents of the field are searchable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withSearchEnabled(Boolean searchEnabled) {
        setSearchEnabled(searchEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the contents of the field are searchable.
     * </p>
     * 
     * @return Whether the contents of the field are searchable.
     */

    public Boolean isSearchEnabled() {
        return this.searchEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @param returnEnabled
     *        Whether the contents of the field can be returned in the search results.
     */

    public void setReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @return Whether the contents of the field can be returned in the search results.
     */

    public Boolean getReturnEnabled() {
        return this.returnEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @param returnEnabled
     *        Whether the contents of the field can be returned in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withReturnEnabled(Boolean returnEnabled) {
        setReturnEnabled(returnEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @return Whether the contents of the field can be returned in the search results.
     */

    public Boolean isReturnEnabled() {
        return this.returnEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @param sortEnabled
     *        Whether the field can be used to sort the search results.
     */

    public void setSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @return Whether the field can be used to sort the search results.
     */

    public Boolean getSortEnabled() {
        return this.sortEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @param sortEnabled
     *        Whether the field can be used to sort the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntOptions withSortEnabled(Boolean sortEnabled) {
        setSortEnabled(sortEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @return Whether the field can be used to sort the search results.
     */

    public Boolean isSortEnabled() {
        return this.sortEnabled;
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getSourceField() != null)
            sb.append("SourceField: ").append(getSourceField()).append(",");
        if (getFacetEnabled() != null)
            sb.append("FacetEnabled: ").append(getFacetEnabled()).append(",");
        if (getSearchEnabled() != null)
            sb.append("SearchEnabled: ").append(getSearchEnabled()).append(",");
        if (getReturnEnabled() != null)
            sb.append("ReturnEnabled: ").append(getReturnEnabled()).append(",");
        if (getSortEnabled() != null)
            sb.append("SortEnabled: ").append(getSortEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntOptions == false)
            return false;
        IntOptions other = (IntOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getSourceField() == null ^ this.getSourceField() == null)
            return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false)
            return false;
        if (other.getFacetEnabled() == null ^ this.getFacetEnabled() == null)
            return false;
        if (other.getFacetEnabled() != null && other.getFacetEnabled().equals(this.getFacetEnabled()) == false)
            return false;
        if (other.getSearchEnabled() == null ^ this.getSearchEnabled() == null)
            return false;
        if (other.getSearchEnabled() != null && other.getSearchEnabled().equals(this.getSearchEnabled()) == false)
            return false;
        if (other.getReturnEnabled() == null ^ this.getReturnEnabled() == null)
            return false;
        if (other.getReturnEnabled() != null && other.getReturnEnabled().equals(this.getReturnEnabled()) == false)
            return false;
        if (other.getSortEnabled() == null ^ this.getSortEnabled() == null)
            return false;
        if (other.getSortEnabled() != null && other.getSortEnabled().equals(this.getSortEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode());
        hashCode = prime * hashCode + ((getFacetEnabled() == null) ? 0 : getFacetEnabled().hashCode());
        hashCode = prime * hashCode + ((getSearchEnabled() == null) ? 0 : getSearchEnabled().hashCode());
        hashCode = prime * hashCode + ((getReturnEnabled() == null) ? 0 : getReturnEnabled().hashCode());
        hashCode = prime * hashCode + ((getSortEnabled() == null) ? 0 : getSortEnabled().hashCode());
        return hashCode;
    }

    @Override
    public IntOptions clone() {
        try {
            return (IntOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
