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
 * Options for a field that contains an array of 64-bit signed integers. Present if <code>IndexFieldType</code>
 * specifies the field is of type <code>int-array</code>. All options are enabled by default.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntArrayOptions implements Serializable, Cloneable {

    /** A value to use for the field if the field isn't specified for a document. */
    private Long defaultValue;
    /**
     * <p>
     * A list of source fields to map to the field.
     * </p>
     */
    private String sourceFields;
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
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document.
     */

    public void setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @return A value to use for the field if the field isn't specified for a document.
     */

    public Long getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntArrayOptions withDefaultValue(Long defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * A list of source fields to map to the field.
     * </p>
     * 
     * @param sourceFields
     *        A list of source fields to map to the field.
     */

    public void setSourceFields(String sourceFields) {
        this.sourceFields = sourceFields;
    }

    /**
     * <p>
     * A list of source fields to map to the field.
     * </p>
     * 
     * @return A list of source fields to map to the field.
     */

    public String getSourceFields() {
        return this.sourceFields;
    }

    /**
     * <p>
     * A list of source fields to map to the field.
     * </p>
     * 
     * @param sourceFields
     *        A list of source fields to map to the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntArrayOptions withSourceFields(String sourceFields) {
        setSourceFields(sourceFields);
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

    public IntArrayOptions withFacetEnabled(Boolean facetEnabled) {
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

    public IntArrayOptions withSearchEnabled(Boolean searchEnabled) {
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

    public IntArrayOptions withReturnEnabled(Boolean returnEnabled) {
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
        if (getSourceFields() != null)
            sb.append("SourceFields: ").append(getSourceFields()).append(",");
        if (getFacetEnabled() != null)
            sb.append("FacetEnabled: ").append(getFacetEnabled()).append(",");
        if (getSearchEnabled() != null)
            sb.append("SearchEnabled: ").append(getSearchEnabled()).append(",");
        if (getReturnEnabled() != null)
            sb.append("ReturnEnabled: ").append(getReturnEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntArrayOptions == false)
            return false;
        IntArrayOptions other = (IntArrayOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getSourceFields() == null ^ this.getSourceFields() == null)
            return false;
        if (other.getSourceFields() != null && other.getSourceFields().equals(this.getSourceFields()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getSourceFields() == null) ? 0 : getSourceFields().hashCode());
        hashCode = prime * hashCode + ((getFacetEnabled() == null) ? 0 : getFacetEnabled().hashCode());
        hashCode = prime * hashCode + ((getSearchEnabled() == null) ? 0 : getSearchEnabled().hashCode());
        hashCode = prime * hashCode + ((getReturnEnabled() == null) ? 0 : getReturnEnabled().hashCode());
        return hashCode;
    }

    @Override
    public IntArrayOptions clone() {
        try {
            return (IntArrayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
