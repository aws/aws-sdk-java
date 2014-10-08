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
 * The collection of documents that match the search request.
 * </p>
 */
public class Hits implements Serializable {

    /**
     * The total number of documents that match the search request.
     */
    private Long found;

    /**
     * The index of the first matching document.
     */
    private Long start;

    /**
     * A cursor that can be used to retrieve the next set of matching
     * documents when you want to page through a large result set.
     */
    private String cursor;

    /**
     * A document that matches the search request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Hit> hit;

    /**
     * The total number of documents that match the search request.
     *
     * @return The total number of documents that match the search request.
     */
    public Long getFound() {
        return found;
    }
    
    /**
     * The total number of documents that match the search request.
     *
     * @param found The total number of documents that match the search request.
     */
    public void setFound(Long found) {
        this.found = found;
    }
    
    /**
     * The total number of documents that match the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param found The total number of documents that match the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hits withFound(Long found) {
        this.found = found;
        return this;
    }

    /**
     * The index of the first matching document.
     *
     * @return The index of the first matching document.
     */
    public Long getStart() {
        return start;
    }
    
    /**
     * The index of the first matching document.
     *
     * @param start The index of the first matching document.
     */
    public void setStart(Long start) {
        this.start = start;
    }
    
    /**
     * The index of the first matching document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param start The index of the first matching document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hits withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * A cursor that can be used to retrieve the next set of matching
     * documents when you want to page through a large result set.
     *
     * @return A cursor that can be used to retrieve the next set of matching
     *         documents when you want to page through a large result set.
     */
    public String getCursor() {
        return cursor;
    }
    
    /**
     * A cursor that can be used to retrieve the next set of matching
     * documents when you want to page through a large result set.
     *
     * @param cursor A cursor that can be used to retrieve the next set of matching
     *         documents when you want to page through a large result set.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
    
    /**
     * A cursor that can be used to retrieve the next set of matching
     * documents when you want to page through a large result set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cursor A cursor that can be used to retrieve the next set of matching
     *         documents when you want to page through a large result set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hits withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * A document that matches the search request.
     *
     * @return A document that matches the search request.
     */
    public java.util.List<Hit> getHit() {
        if (hit == null) {
              hit = new com.amazonaws.internal.ListWithAutoConstructFlag<Hit>();
              hit.setAutoConstruct(true);
        }
        return hit;
    }
    
    /**
     * A document that matches the search request.
     *
     * @param hit A document that matches the search request.
     */
    public void setHit(java.util.Collection<Hit> hit) {
        if (hit == null) {
            this.hit = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Hit> hitCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Hit>(hit.size());
        hitCopy.addAll(hit);
        this.hit = hitCopy;
    }
    
    /**
     * A document that matches the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hit A document that matches the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hits withHit(Hit... hit) {
        if (getHit() == null) setHit(new java.util.ArrayList<Hit>(hit.length));
        for (Hit value : hit) {
            getHit().add(value);
        }
        return this;
    }
    
    /**
     * A document that matches the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hit A document that matches the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hits withHit(java.util.Collection<Hit> hit) {
        if (hit == null) {
            this.hit = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Hit> hitCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Hit>(hit.size());
            hitCopy.addAll(hit);
            this.hit = hitCopy;
        }

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
        if (getFound() != null) sb.append("Found: " + getFound() + ",");
        if (getStart() != null) sb.append("Start: " + getStart() + ",");
        if (getCursor() != null) sb.append("Cursor: " + getCursor() + ",");
        if (getHit() != null) sb.append("Hit: " + getHit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFound() == null) ? 0 : getFound().hashCode()); 
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode()); 
        hashCode = prime * hashCode + ((getCursor() == null) ? 0 : getCursor().hashCode()); 
        hashCode = prime * hashCode + ((getHit() == null) ? 0 : getHit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Hits == false) return false;
        Hits other = (Hits)obj;
        
        if (other.getFound() == null ^ this.getFound() == null) return false;
        if (other.getFound() != null && other.getFound().equals(this.getFound()) == false) return false; 
        if (other.getStart() == null ^ this.getStart() == null) return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false) return false; 
        if (other.getCursor() == null ^ this.getCursor() == null) return false;
        if (other.getCursor() != null && other.getCursor().equals(this.getCursor()) == false) return false; 
        if (other.getHit() == null ^ this.getHit() == null) return false;
        if (other.getHit() != null && other.getHit().equals(this.getHit()) == false) return false; 
        return true;
    }
    
}
    