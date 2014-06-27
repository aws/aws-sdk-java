/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>Search</code> request. Contains the documents
 * that match the specified search criteria and any requested fields,
 * highlights, and facet information.
 * </p>
 */
public class SearchResult implements Serializable {

    /**
     * The status information returned for the search request.
     */
    private SearchStatus status;

    /**
     * The documents that match the search criteria.
     */
    private Hits hits;

    /**
     * The requested facet information.
     */
    private java.util.Map<String,BucketInfo> facets;

    /**
     * The status information returned for the search request.
     *
     * @return The status information returned for the search request.
     */
    public SearchStatus getStatus() {
        return status;
    }
    
    /**
     * The status information returned for the search request.
     *
     * @param status The status information returned for the search request.
     */
    public void setStatus(SearchStatus status) {
        this.status = status;
    }
    
    /**
     * The status information returned for the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status information returned for the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchResult withStatus(SearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The documents that match the search criteria.
     *
     * @return The documents that match the search criteria.
     */
    public Hits getHits() {
        return hits;
    }
    
    /**
     * The documents that match the search criteria.
     *
     * @param hits The documents that match the search criteria.
     */
    public void setHits(Hits hits) {
        this.hits = hits;
    }
    
    /**
     * The documents that match the search criteria.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hits The documents that match the search criteria.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchResult withHits(Hits hits) {
        this.hits = hits;
        return this;
    }

    /**
     * The requested facet information.
     *
     * @return The requested facet information.
     */
    public java.util.Map<String,BucketInfo> getFacets() {
        
        if (facets == null) {
            facets = new java.util.HashMap<String,BucketInfo>();
        }
        return facets;
    }
    
    /**
     * The requested facet information.
     *
     * @param facets The requested facet information.
     */
    public void setFacets(java.util.Map<String,BucketInfo> facets) {
        this.facets = facets;
    }
    
    /**
     * The requested facet information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param facets The requested facet information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchResult withFacets(java.util.Map<String,BucketInfo> facets) {
        setFacets(facets);
        return this;
    }

    /**
     * The requested facet information.
     * <p>
     * The method adds a new key-value pair into Facets parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Facets.
     * @param value The corresponding value of the entry to be added into Facets.
     */
    public SearchResult addFacetsEntry(String key, BucketInfo value) {
        if (null == this.facets) {
            this.facets = new java.util.HashMap<String,BucketInfo>();
        }
        if (this.facets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.facets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Facets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public SearchResult clearFacetsEntries() {
        this.facets = null;
        return this;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getHits() != null) sb.append("Hits: " + getHits() + ",");
        if (getFacets() != null) sb.append("Facets: " + getFacets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getHits() == null) ? 0 : getHits().hashCode()); 
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SearchResult == false) return false;
        SearchResult other = (SearchResult)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getHits() == null ^ this.getHits() == null) return false;
        if (other.getHits() != null && other.getHits().equals(this.getHits()) == false) return false; 
        if (other.getFacets() == null ^ this.getFacets() == null) return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false) return false; 
        return true;
    }
    
}
    