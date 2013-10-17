/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the output from the QueryObjects action.
 * </p>
 */
public class QueryObjectsResult implements Serializable {

    /**
     * A list of identifiers that match the query selectors.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ids;

    /**
     * The starting point for the results to be returned. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>QueryObjects</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>QueryObjects</a>.
     */
    private Boolean hasMoreResults;

    /**
     * A list of identifiers that match the query selectors.
     *
     * @return A list of identifiers that match the query selectors.
     */
    public java.util.List<String> getIds() {
        if (ids == null) {
              ids = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ids.setAutoConstruct(true);
        }
        return ids;
    }
    
    /**
     * A list of identifiers that match the query selectors.
     *
     * @param ids A list of identifiers that match the query selectors.
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
     * A list of identifiers that match the query selectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ids A list of identifiers that match the query selectors.
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
     * A list of identifiers that match the query selectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ids A list of identifiers that match the query selectors.
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
     * The starting point for the results to be returned. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>QueryObjects</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the results to be returned. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>QueryObjects</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the results to be returned. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>QueryObjects</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>QueryObjects</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the results to be returned. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>QueryObjects</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>QueryObjects</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryObjectsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>QueryObjects</a>.
     *
     * @return If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>QueryObjects</a>.
     */
    public Boolean isHasMoreResults() {
        return hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>QueryObjects</a>.
     *
     * @param hasMoreResults If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>QueryObjects</a>.
     */
    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>QueryObjects</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreResults If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>QueryObjects</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryObjectsResult withHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
        return this;
    }

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>QueryObjects</a>.
     *
     * @return If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>QueryObjects</a>.
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
    
}
    