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
 * Container for the suggestion information returned in a
 * <code>SuggestResponse</code> .
 * </p>
 */
public class SuggestModel implements Serializable {

    /**
     * The query string specified in the suggest request.
     */
    private String query;

    /**
     * The number of documents that were found to match the query string.
     */
    private Long found;

    /**
     * The documents that match the query string.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch> suggestions;

    /**
     * The query string specified in the suggest request.
     *
     * @return The query string specified in the suggest request.
     */
    public String getQuery() {
        return query;
    }
    
    /**
     * The query string specified in the suggest request.
     *
     * @param query The query string specified in the suggest request.
     */
    public void setQuery(String query) {
        this.query = query;
    }
    
    /**
     * The query string specified in the suggest request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param query The query string specified in the suggest request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestModel withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * The number of documents that were found to match the query string.
     *
     * @return The number of documents that were found to match the query string.
     */
    public Long getFound() {
        return found;
    }
    
    /**
     * The number of documents that were found to match the query string.
     *
     * @param found The number of documents that were found to match the query string.
     */
    public void setFound(Long found) {
        this.found = found;
    }
    
    /**
     * The number of documents that were found to match the query string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param found The number of documents that were found to match the query string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestModel withFound(Long found) {
        this.found = found;
        return this;
    }

    /**
     * The documents that match the query string.
     *
     * @return The documents that match the query string.
     */
    public java.util.List<SuggestionMatch> getSuggestions() {
        if (suggestions == null) {
              suggestions = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch>();
              suggestions.setAutoConstruct(true);
        }
        return suggestions;
    }
    
    /**
     * The documents that match the query string.
     *
     * @param suggestions The documents that match the query string.
     */
    public void setSuggestions(java.util.Collection<SuggestionMatch> suggestions) {
        if (suggestions == null) {
            this.suggestions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch> suggestionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch>(suggestions.size());
        suggestionsCopy.addAll(suggestions);
        this.suggestions = suggestionsCopy;
    }
    
    /**
     * The documents that match the query string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggestions The documents that match the query string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestModel withSuggestions(SuggestionMatch... suggestions) {
        if (getSuggestions() == null) setSuggestions(new java.util.ArrayList<SuggestionMatch>(suggestions.length));
        for (SuggestionMatch value : suggestions) {
            getSuggestions().add(value);
        }
        return this;
    }
    
    /**
     * The documents that match the query string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggestions The documents that match the query string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestModel withSuggestions(java.util.Collection<SuggestionMatch> suggestions) {
        if (suggestions == null) {
            this.suggestions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch> suggestionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggestionMatch>(suggestions.size());
            suggestionsCopy.addAll(suggestions);
            this.suggestions = suggestionsCopy;
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
        if (getQuery() != null) sb.append("Query: " + getQuery() + ",");
        if (getFound() != null) sb.append("Found: " + getFound() + ",");
        if (getSuggestions() != null) sb.append("Suggestions: " + getSuggestions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode()); 
        hashCode = prime * hashCode + ((getFound() == null) ? 0 : getFound().hashCode()); 
        hashCode = prime * hashCode + ((getSuggestions() == null) ? 0 : getSuggestions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuggestModel == false) return false;
        SuggestModel other = (SuggestModel)obj;
        
        if (other.getQuery() == null ^ this.getQuery() == null) return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false) return false; 
        if (other.getFound() == null ^ this.getFound() == null) return false;
        if (other.getFound() != null && other.getFound().equals(this.getFound()) == false) return false; 
        if (other.getSuggestions() == null ^ this.getSuggestions() == null) return false;
        if (other.getSuggestions() != null && other.getSuggestions().equals(this.getSuggestions()) == false) return false; 
        return true;
    }
    
}
    