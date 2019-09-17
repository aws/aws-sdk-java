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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>Search</code> request. Contains the documents that match the specified search criteria and any
 * requested fields, highlights, and facet information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status information returned for the search request.
     * </p>
     */
    private SearchStatus status;
    /**
     * <p>
     * The documents that match the search criteria.
     * </p>
     */
    private Hits hits;
    /**
     * <p>
     * The requested facet information.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, BucketInfo> facets;
    /**
     * <p>
     * The requested field statistics information.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, FieldStats> stats;

    /**
     * <p>
     * The status information returned for the search request.
     * </p>
     * 
     * @param status
     *        The status information returned for the search request.
     */

    public void setStatus(SearchStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status information returned for the search request.
     * </p>
     * 
     * @return The status information returned for the search request.
     */

    public SearchStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status information returned for the search request.
     * </p>
     * 
     * @param status
     *        The status information returned for the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withStatus(SearchStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The documents that match the search criteria.
     * </p>
     * 
     * @param hits
     *        The documents that match the search criteria.
     */

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    /**
     * <p>
     * The documents that match the search criteria.
     * </p>
     * 
     * @return The documents that match the search criteria.
     */

    public Hits getHits() {
        return this.hits;
    }

    /**
     * <p>
     * The documents that match the search criteria.
     * </p>
     * 
     * @param hits
     *        The documents that match the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withHits(Hits hits) {
        setHits(hits);
        return this;
    }

    /**
     * <p>
     * The requested facet information.
     * </p>
     * 
     * @return The requested facet information.
     */

    public java.util.Map<String, BucketInfo> getFacets() {
        if (facets == null) {
            facets = new com.amazonaws.internal.SdkInternalMap<String, BucketInfo>();
        }
        return facets;
    }

    /**
     * <p>
     * The requested facet information.
     * </p>
     * 
     * @param facets
     *        The requested facet information.
     */

    public void setFacets(java.util.Map<String, BucketInfo> facets) {
        this.facets = facets == null ? null : new com.amazonaws.internal.SdkInternalMap<String, BucketInfo>(facets);
    }

    /**
     * <p>
     * The requested facet information.
     * </p>
     * 
     * @param facets
     *        The requested facet information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withFacets(java.util.Map<String, BucketInfo> facets) {
        setFacets(facets);
        return this;
    }

    public SearchResult addFacetsEntry(String key, BucketInfo value) {
        if (null == this.facets) {
            this.facets = new com.amazonaws.internal.SdkInternalMap<String, BucketInfo>();
        }
        if (this.facets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.facets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Facets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult clearFacetsEntries() {
        this.facets = null;
        return this;
    }

    /**
     * <p>
     * The requested field statistics information.
     * </p>
     * 
     * @return The requested field statistics information.
     */

    public java.util.Map<String, FieldStats> getStats() {
        if (stats == null) {
            stats = new com.amazonaws.internal.SdkInternalMap<String, FieldStats>();
        }
        return stats;
    }

    /**
     * <p>
     * The requested field statistics information.
     * </p>
     * 
     * @param stats
     *        The requested field statistics information.
     */

    public void setStats(java.util.Map<String, FieldStats> stats) {
        this.stats = stats == null ? null : new com.amazonaws.internal.SdkInternalMap<String, FieldStats>(stats);
    }

    /**
     * <p>
     * The requested field statistics information.
     * </p>
     * 
     * @param stats
     *        The requested field statistics information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withStats(java.util.Map<String, FieldStats> stats) {
        setStats(stats);
        return this;
    }

    public SearchResult addStatsEntry(String key, FieldStats value) {
        if (null == this.stats) {
            this.stats = new com.amazonaws.internal.SdkInternalMap<String, FieldStats>();
        }
        if (this.stats.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stats.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Stats.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult clearStatsEntries() {
        this.stats = null;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getHits() != null)
            sb.append("Hits: ").append(getHits()).append(",");
        if (getFacets() != null)
            sb.append("Facets: ").append(getFacets()).append(",");
        if (getStats() != null)
            sb.append("Stats: ").append(getStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResult == false)
            return false;
        SearchResult other = (SearchResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getHits() == null ^ this.getHits() == null)
            return false;
        if (other.getHits() != null && other.getHits().equals(this.getHits()) == false)
            return false;
        if (other.getFacets() == null ^ this.getFacets() == null)
            return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false)
            return false;
        if (other.getStats() == null ^ this.getStats() == null)
            return false;
        if (other.getStats() != null && other.getStats().equals(this.getStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getHits() == null) ? 0 : getHits().hashCode());
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode());
        hashCode = prime * hashCode + ((getStats() == null) ? 0 : getStats().hashCode());
        return hashCode;
    }

    @Override
    public SearchResult clone() {
        try {
            return (SearchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
