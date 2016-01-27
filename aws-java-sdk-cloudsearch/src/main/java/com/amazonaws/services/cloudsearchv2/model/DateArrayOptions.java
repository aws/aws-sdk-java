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
 * Options for a field that contains an array of dates. Present if
 * <code>IndexFieldType</code> specifies the field is of type
 * <code>date-array</code> . All options are enabled by default.
 * </p>
 */
public class DateArrayOptions implements Serializable, Cloneable {

    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String defaultValue;

    /**
     * A list of source fields to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*<br/>
     */
    private String sourceFields;

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
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A value to use for the field if the field isn't specified for a
     *         document.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DateArrayOptions withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * A list of source fields to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*<br/>
     *
     * @return A list of source fields to map to the field.
     */
    public String getSourceFields() {
        return sourceFields;
    }
    
    /**
     * A list of source fields to map to the field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*<br/>
     *
     * @param sourceFields A list of source fields to map to the field.
     */
    public void setSourceFields(String sourceFields) {
        this.sourceFields = sourceFields;
    }
    
    /**
     * A list of source fields to map to the field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*<br/>
     *
     * @param sourceFields A list of source fields to map to the field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DateArrayOptions withSourceFields(String sourceFields) {
        this.sourceFields = sourceFields;
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
    public DateArrayOptions withFacetEnabled(Boolean facetEnabled) {
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
    public DateArrayOptions withSearchEnabled(Boolean searchEnabled) {
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
    public DateArrayOptions withReturnEnabled(Boolean returnEnabled) {
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
        if (getSourceFields() != null) sb.append("SourceFields: " + getSourceFields() + ",");
        if (isFacetEnabled() != null) sb.append("FacetEnabled: " + isFacetEnabled() + ",");
        if (isSearchEnabled() != null) sb.append("SearchEnabled: " + isSearchEnabled() + ",");
        if (isReturnEnabled() != null) sb.append("ReturnEnabled: " + isReturnEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getSourceFields() == null) ? 0 : getSourceFields().hashCode()); 
        hashCode = prime * hashCode + ((isFacetEnabled() == null) ? 0 : isFacetEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isSearchEnabled() == null) ? 0 : isSearchEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isReturnEnabled() == null) ? 0 : isReturnEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DateArrayOptions == false) return false;
        DateArrayOptions other = (DateArrayOptions)obj;
        
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getSourceFields() == null ^ this.getSourceFields() == null) return false;
        if (other.getSourceFields() != null && other.getSourceFields().equals(this.getSourceFields()) == false) return false; 
        if (other.isFacetEnabled() == null ^ this.isFacetEnabled() == null) return false;
        if (other.isFacetEnabled() != null && other.isFacetEnabled().equals(this.isFacetEnabled()) == false) return false; 
        if (other.isSearchEnabled() == null ^ this.isSearchEnabled() == null) return false;
        if (other.isSearchEnabled() != null && other.isSearchEnabled().equals(this.isSearchEnabled()) == false) return false; 
        if (other.isReturnEnabled() == null ^ this.isReturnEnabled() == null) return false;
        if (other.isReturnEnabled() != null && other.isReturnEnabled().equals(this.isReturnEnabled()) == false) return false; 
        return true;
    }
    
    @Override
    public DateArrayOptions clone() {
        try {
            return (DateArrayOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    