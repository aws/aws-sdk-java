/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * Options for a double-precision 64-bit floating point field. Present
 * if <code>IndexFieldType</code> specifies the field is of type
 * <code>double</code> . All options are enabled by default.
 * </p>
 */
public class DoubleOptions implements Serializable, Cloneable {

    /**
     * A value to use for the field if the field isn't specified for a
     * document. This can be important if you are using the field in an
     * expression and that field is not present in every document.
     */
    private Double defaultValue;

    /**
     * The name of the source field to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String sourceField;

    /**
     * Whether facet information can be returned for the field.
     */
    private Boolean facetEnabled;

    /**
     * Whether the contents of the field are searchable.
     */
    private Boolean searchEnabled;

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     */
    private Boolean returnEnabled;

    /**
     * Whether the field can be used to sort the search results.
     */
    private Boolean sortEnabled;

    /**
     * A value to use for the field if the field isn't specified for a
     * document. This can be important if you are using the field in an
     * expression and that field is not present in every document.
     *
     * @return A value to use for the field if the field isn't specified for a
     *         document. This can be important if you are using the field in an
     *         expression and that field is not present in every document.
     */
    public Double getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document. This can be important if you are using the field in an
     * expression and that field is not present in every document.
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document. This can be important if you are using the field in an
     *         expression and that field is not present in every document.
     */
    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document. This can be important if you are using the field in an
     * expression and that field is not present in every document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document. This can be important if you are using the field in an
     *         expression and that field is not present in every document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The name of the source field to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of the source field to map to the field.
     */
    public String getSourceField() {
        return sourceField;
    }
    
    /**
     * The name of the source field to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField The name of the source field to map to the field.
     */
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }
    
    /**
     * The name of the source field to map to the field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField The name of the source field to map to the field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withSourceField(String sourceField) {
        this.sourceField = sourceField;
        return this;
    }

    /**
     * Whether facet information can be returned for the field.
     *
     * @return Whether facet information can be returned for the field.
     */
    public Boolean isFacetEnabled() {
        return facetEnabled;
    }
    
    /**
     * Whether facet information can be returned for the field.
     *
     * @param facetEnabled Whether facet information can be returned for the field.
     */
    public void setFacetEnabled(Boolean facetEnabled) {
        this.facetEnabled = facetEnabled;
    }
    
    /**
     * Whether facet information can be returned for the field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param facetEnabled Whether facet information can be returned for the field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withFacetEnabled(Boolean facetEnabled) {
        this.facetEnabled = facetEnabled;
        return this;
    }

    /**
     * Whether facet information can be returned for the field.
     *
     * @return Whether facet information can be returned for the field.
     */
    public Boolean getFacetEnabled() {
        return facetEnabled;
    }

    /**
     * Whether the contents of the field are searchable.
     *
     * @return Whether the contents of the field are searchable.
     */
    public Boolean isSearchEnabled() {
        return searchEnabled;
    }
    
    /**
     * Whether the contents of the field are searchable.
     *
     * @param searchEnabled Whether the contents of the field are searchable.
     */
    public void setSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
    }
    
    /**
     * Whether the contents of the field are searchable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchEnabled Whether the contents of the field are searchable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
        return this;
    }

    /**
     * Whether the contents of the field are searchable.
     *
     * @return Whether the contents of the field are searchable.
     */
    public Boolean getSearchEnabled() {
        return searchEnabled;
    }

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @return Whether the contents of the field can be returned in the search
     *         results.
     */
    public Boolean isReturnEnabled() {
        return returnEnabled;
    }
    
    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @param returnEnabled Whether the contents of the field can be returned in the search
     *         results.
     */
    public void setReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
    }
    
    /**
     * Whether the contents of the field can be returned in the search
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnEnabled Whether the contents of the field can be returned in the search
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
        return this;
    }

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @return Whether the contents of the field can be returned in the search
     *         results.
     */
    public Boolean getReturnEnabled() {
        return returnEnabled;
    }

    /**
     * Whether the field can be used to sort the search results.
     *
     * @return Whether the field can be used to sort the search results.
     */
    public Boolean isSortEnabled() {
        return sortEnabled;
    }
    
    /**
     * Whether the field can be used to sort the search results.
     *
     * @param sortEnabled Whether the field can be used to sort the search results.
     */
    public void setSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
    }
    
    /**
     * Whether the field can be used to sort the search results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sortEnabled Whether the field can be used to sort the search results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DoubleOptions withSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
        return this;
    }

    /**
     * Whether the field can be used to sort the search results.
     *
     * @return Whether the field can be used to sort the search results.
     */
    public Boolean getSortEnabled() {
        return sortEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getSourceField() != null) sb.append("SourceField: " + getSourceField() + ",");
        if (isFacetEnabled() != null) sb.append("FacetEnabled: " + isFacetEnabled() + ",");
        if (isSearchEnabled() != null) sb.append("SearchEnabled: " + isSearchEnabled() + ",");
        if (isReturnEnabled() != null) sb.append("ReturnEnabled: " + isReturnEnabled() + ",");
        if (isSortEnabled() != null) sb.append("SortEnabled: " + isSortEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode()); 
        hashCode = prime * hashCode + ((isFacetEnabled() == null) ? 0 : isFacetEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isSearchEnabled() == null) ? 0 : isSearchEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isReturnEnabled() == null) ? 0 : isReturnEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isSortEnabled() == null) ? 0 : isSortEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DoubleOptions == false) return false;
        DoubleOptions other = (DoubleOptions)obj;
        
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getSourceField() == null ^ this.getSourceField() == null) return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false) return false; 
        if (other.isFacetEnabled() == null ^ this.isFacetEnabled() == null) return false;
        if (other.isFacetEnabled() != null && other.isFacetEnabled().equals(this.isFacetEnabled()) == false) return false; 
        if (other.isSearchEnabled() == null ^ this.isSearchEnabled() == null) return false;
        if (other.isSearchEnabled() != null && other.isSearchEnabled().equals(this.isSearchEnabled()) == false) return false; 
        if (other.isReturnEnabled() == null ^ this.isReturnEnabled() == null) return false;
        if (other.isReturnEnabled() != null && other.isReturnEnabled().equals(this.isReturnEnabled()) == false) return false; 
        if (other.isSortEnabled() == null ^ this.isSortEnabled() == null) return false;
        if (other.isSortEnabled() != null && other.isSortEnabled().equals(this.isSortEnabled()) == false) return false; 
        return true;
    }
    
    @Override
    public DoubleOptions clone() {
        try {
            return (DoubleOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    