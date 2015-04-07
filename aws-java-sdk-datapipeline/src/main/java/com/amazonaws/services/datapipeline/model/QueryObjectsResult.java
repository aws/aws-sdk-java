/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of QueryObjects.
 * </p>
 */
public class QueryObjectsResult implements Serializable, Cloneable {

    /**
     * The identifiers that match the query selectors.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ids;

    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <code>QueryObjects</code> again with this marker
     * value. If the value is null, there are no more results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * Indicates whether there are more results that can be obtained by a
     * subsequent call.
     */
    private Boolean hasMoreResults;

    /**
     * The identifiers that match the query selectors.
     *
     * @return The identifiers that match the query selectors.
     */
    public java.util.List<String> getIds() {
        if (ids == null) {
              ids = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ids.setAutoConstruct(true);
        }
        return ids;
    }
    
    /**
     * The identifiers that match the query selectors.
     *
     * @param ids The identifiers that match the query selectors.
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> idsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ids.size());
        idsCopy.addAll(ids);
        this.ids = idsCopy;
    }
    
    /**
     * The identifiers that match the query selectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ids The identifiers that match the query selectors.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsResult withIds(String... ids) {
        if (getIds() == null) setIds(new java.util.ArrayList<String>(ids.length));
        for (String value : ids) {
            getIds().add(value);
        }
        return this;
    }
    
    /**
     * The identifiers that match the query selectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ids The identifiers that match the query selectors.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsResult withIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> idsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ids.size());
            idsCopy.addAll(ids);
            this.ids = idsCopy;
        }

        return this;
    }

    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <code>QueryObjects</code> again with this marker
     * value. If the value is null, there are no more results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the next page of results. To view the next page
     *         of results, call <code>QueryObjects</code> again with this marker
     *         value. If the value is null, there are no more results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <code>QueryObjects</code> again with this marker
     * value. If the value is null, there are no more results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the next page of results. To view the next page
     *         of results, call <code>QueryObjects</code> again with this marker
     *         value. If the value is null, there are no more results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <code>QueryObjects</code> again with this marker
     * value. If the value is null, there are no more results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the next page of results. To view the next page
     *         of results, call <code>QueryObjects</code> again with this marker
     *         value. If the value is null, there are no more results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Indicates whether there are more results that can be obtained by a
     * subsequent call.
     *
     * @return Indicates whether there are more results that can be obtained by a
     *         subsequent call.
     */
    public Boolean isHasMoreResults() {
        return hasMoreResults;
    }
    
    /**
     * Indicates whether there are more results that can be obtained by a
     * subsequent call.
     *
     * @param hasMoreResults Indicates whether there are more results that can be obtained by a
     *         subsequent call.
     */
    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }
    
    /**
     * Indicates whether there are more results that can be obtained by a
     * subsequent call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreResults Indicates whether there are more results that can be obtained by a
     *         subsequent call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsResult withHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
        return this;
    }

    /**
     * Indicates whether there are more results that can be obtained by a
     * subsequent call.
     *
     * @return Indicates whether there are more results that can be obtained by a
     *         subsequent call.
     */
    public Boolean getHasMoreResults() {
        return hasMoreResults;
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
        if (getIds() != null) sb.append("Ids: " + getIds() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isHasMoreResults() != null) sb.append("HasMoreResults: " + isHasMoreResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreResults() == null) ? 0 : isHasMoreResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof QueryObjectsResult == false) return false;
        QueryObjectsResult other = (QueryObjectsResult)obj;
        
        if (other.getIds() == null ^ this.getIds() == null) return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isHasMoreResults() == null ^ this.isHasMoreResults() == null) return false;
        if (other.isHasMoreResults() != null && other.isHasMoreResults().equals(this.isHasMoreResults()) == false) return false; 
        return true;
    }
    
    @Override
    public QueryObjectsResult clone() {
        try {
            return (QueryObjectsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    