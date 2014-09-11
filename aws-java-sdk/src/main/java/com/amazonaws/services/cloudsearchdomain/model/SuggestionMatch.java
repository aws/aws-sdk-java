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
 * An autocomplete suggestion that matches the query string specified in
 * a <code>SuggestRequest</code> .
 * </p>
 */
public class SuggestionMatch implements Serializable {

    /**
     * The string that matches the query string specified in the
     * <code>SuggestRequest</code>.
     */
    private String suggestion;

    /**
     * The relevance score of a suggested match.
     */
    private Long score;

    /**
     * The document ID of the suggested document.
     */
    private String id;

    /**
     * The string that matches the query string specified in the
     * <code>SuggestRequest</code>.
     *
     * @return The string that matches the query string specified in the
     *         <code>SuggestRequest</code>.
     */
    public String getSuggestion() {
        return suggestion;
    }
    
    /**
     * The string that matches the query string specified in the
     * <code>SuggestRequest</code>.
     *
     * @param suggestion The string that matches the query string specified in the
     *         <code>SuggestRequest</code>.
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
    
    /**
     * The string that matches the query string specified in the
     * <code>SuggestRequest</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggestion The string that matches the query string specified in the
     *         <code>SuggestRequest</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestionMatch withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * The relevance score of a suggested match.
     *
     * @return The relevance score of a suggested match.
     */
    public Long getScore() {
        return score;
    }
    
    /**
     * The relevance score of a suggested match.
     *
     * @param score The relevance score of a suggested match.
     */
    public void setScore(Long score) {
        this.score = score;
    }
    
    /**
     * The relevance score of a suggested match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param score The relevance score of a suggested match.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestionMatch withScore(Long score) {
        this.score = score;
        return this;
    }

    /**
     * The document ID of the suggested document.
     *
     * @return The document ID of the suggested document.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The document ID of the suggested document.
     *
     * @param id The document ID of the suggested document.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The document ID of the suggested document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The document ID of the suggested document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestionMatch withId(String id) {
        this.id = id;
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
        if (getSuggestion() != null) sb.append("Suggestion: " + getSuggestion() + ",");
        if (getScore() != null) sb.append("Score: " + getScore() + ",");
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuggestion() == null) ? 0 : getSuggestion().hashCode()); 
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode()); 
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuggestionMatch == false) return false;
        SuggestionMatch other = (SuggestionMatch)obj;
        
        if (other.getSuggestion() == null ^ this.getSuggestion() == null) return false;
        if (other.getSuggestion() != null && other.getSuggestion().equals(this.getSuggestion()) == false) return false; 
        if (other.getScore() == null ^ this.getScore() == null) return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    