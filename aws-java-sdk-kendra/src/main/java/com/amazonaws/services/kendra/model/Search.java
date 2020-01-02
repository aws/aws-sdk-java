/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about how a custom index field is used during a search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Search" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Search implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates that the field can be used to create search facets, a count of results for each value in the field. The
     * default is <code>false</code> .
     * </p>
     */
    private Boolean facetable;
    /**
     * <p>
     * Determines whether the field is used in the search. If the <code>Searchable</code> field is <code>true</code>,
     * you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is
     * <code>true</code> for string fields and <code>false</code> for number and date fields.
     * </p>
     */
    private Boolean searchable;
    /**
     * <p>
     * Determines whether the field is returned in the query response. The default is <code>true</code>.
     * </p>
     */
    private Boolean displayable;

    /**
     * <p>
     * Indicates that the field can be used to create search facets, a count of results for each value in the field. The
     * default is <code>false</code> .
     * </p>
     * 
     * @param facetable
     *        Indicates that the field can be used to create search facets, a count of results for each value in the
     *        field. The default is <code>false</code> .
     */

    public void setFacetable(Boolean facetable) {
        this.facetable = facetable;
    }

    /**
     * <p>
     * Indicates that the field can be used to create search facets, a count of results for each value in the field. The
     * default is <code>false</code> .
     * </p>
     * 
     * @return Indicates that the field can be used to create search facets, a count of results for each value in the
     *         field. The default is <code>false</code> .
     */

    public Boolean getFacetable() {
        return this.facetable;
    }

    /**
     * <p>
     * Indicates that the field can be used to create search facets, a count of results for each value in the field. The
     * default is <code>false</code> .
     * </p>
     * 
     * @param facetable
     *        Indicates that the field can be used to create search facets, a count of results for each value in the
     *        field. The default is <code>false</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Search withFacetable(Boolean facetable) {
        setFacetable(facetable);
        return this;
    }

    /**
     * <p>
     * Indicates that the field can be used to create search facets, a count of results for each value in the field. The
     * default is <code>false</code> .
     * </p>
     * 
     * @return Indicates that the field can be used to create search facets, a count of results for each value in the
     *         field. The default is <code>false</code> .
     */

    public Boolean isFacetable() {
        return this.facetable;
    }

    /**
     * <p>
     * Determines whether the field is used in the search. If the <code>Searchable</code> field is <code>true</code>,
     * you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is
     * <code>true</code> for string fields and <code>false</code> for number and date fields.
     * </p>
     * 
     * @param searchable
     *        Determines whether the field is used in the search. If the <code>Searchable</code> field is
     *        <code>true</code>, you can use relevance tuning to manually tune how Amazon Kendra weights the field in
     *        the search. The default is <code>true</code> for string fields and <code>false</code> for number and date
     *        fields.
     */

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    /**
     * <p>
     * Determines whether the field is used in the search. If the <code>Searchable</code> field is <code>true</code>,
     * you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is
     * <code>true</code> for string fields and <code>false</code> for number and date fields.
     * </p>
     * 
     * @return Determines whether the field is used in the search. If the <code>Searchable</code> field is
     *         <code>true</code>, you can use relevance tuning to manually tune how Amazon Kendra weights the field in
     *         the search. The default is <code>true</code> for string fields and <code>false</code> for number and date
     *         fields.
     */

    public Boolean getSearchable() {
        return this.searchable;
    }

    /**
     * <p>
     * Determines whether the field is used in the search. If the <code>Searchable</code> field is <code>true</code>,
     * you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is
     * <code>true</code> for string fields and <code>false</code> for number and date fields.
     * </p>
     * 
     * @param searchable
     *        Determines whether the field is used in the search. If the <code>Searchable</code> field is
     *        <code>true</code>, you can use relevance tuning to manually tune how Amazon Kendra weights the field in
     *        the search. The default is <code>true</code> for string fields and <code>false</code> for number and date
     *        fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Search withSearchable(Boolean searchable) {
        setSearchable(searchable);
        return this;
    }

    /**
     * <p>
     * Determines whether the field is used in the search. If the <code>Searchable</code> field is <code>true</code>,
     * you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is
     * <code>true</code> for string fields and <code>false</code> for number and date fields.
     * </p>
     * 
     * @return Determines whether the field is used in the search. If the <code>Searchable</code> field is
     *         <code>true</code>, you can use relevance tuning to manually tune how Amazon Kendra weights the field in
     *         the search. The default is <code>true</code> for string fields and <code>false</code> for number and date
     *         fields.
     */

    public Boolean isSearchable() {
        return this.searchable;
    }

    /**
     * <p>
     * Determines whether the field is returned in the query response. The default is <code>true</code>.
     * </p>
     * 
     * @param displayable
     *        Determines whether the field is returned in the query response. The default is <code>true</code>.
     */

    public void setDisplayable(Boolean displayable) {
        this.displayable = displayable;
    }

    /**
     * <p>
     * Determines whether the field is returned in the query response. The default is <code>true</code>.
     * </p>
     * 
     * @return Determines whether the field is returned in the query response. The default is <code>true</code>.
     */

    public Boolean getDisplayable() {
        return this.displayable;
    }

    /**
     * <p>
     * Determines whether the field is returned in the query response. The default is <code>true</code>.
     * </p>
     * 
     * @param displayable
     *        Determines whether the field is returned in the query response. The default is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Search withDisplayable(Boolean displayable) {
        setDisplayable(displayable);
        return this;
    }

    /**
     * <p>
     * Determines whether the field is returned in the query response. The default is <code>true</code>.
     * </p>
     * 
     * @return Determines whether the field is returned in the query response. The default is <code>true</code>.
     */

    public Boolean isDisplayable() {
        return this.displayable;
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
        if (getFacetable() != null)
            sb.append("Facetable: ").append(getFacetable()).append(",");
        if (getSearchable() != null)
            sb.append("Searchable: ").append(getSearchable()).append(",");
        if (getDisplayable() != null)
            sb.append("Displayable: ").append(getDisplayable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Search == false)
            return false;
        Search other = (Search) obj;
        if (other.getFacetable() == null ^ this.getFacetable() == null)
            return false;
        if (other.getFacetable() != null && other.getFacetable().equals(this.getFacetable()) == false)
            return false;
        if (other.getSearchable() == null ^ this.getSearchable() == null)
            return false;
        if (other.getSearchable() != null && other.getSearchable().equals(this.getSearchable()) == false)
            return false;
        if (other.getDisplayable() == null ^ this.getDisplayable() == null)
            return false;
        if (other.getDisplayable() != null && other.getDisplayable().equals(this.getDisplayable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFacetable() == null) ? 0 : getFacetable().hashCode());
        hashCode = prime * hashCode + ((getSearchable() == null) ? 0 : getSearchable().hashCode());
        hashCode = prime * hashCode + ((getDisplayable() == null) ? 0 : getDisplayable().hashCode());
        return hashCode;
    }

    @Override
    public Search clone() {
        try {
            return (Search) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SearchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
