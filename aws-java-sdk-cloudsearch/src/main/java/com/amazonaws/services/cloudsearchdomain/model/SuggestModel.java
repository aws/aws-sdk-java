/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Container for the suggestion information returned in a <code>SuggestResponse</code>.
 * </p>
 */
public class SuggestModel implements Serializable, Cloneable {

    /**
     * <p>
     * The query string specified in the suggest request.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The number of documents that were found to match the query string.
     * </p>
     */
    private Long found;
    /**
     * <p>
     * The documents that match the query string.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SuggestionMatch> suggestions;

    /**
     * <p>
     * The query string specified in the suggest request.
     * </p>
     * 
     * @param query
     *        The query string specified in the suggest request.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The query string specified in the suggest request.
     * </p>
     * 
     * @return The query string specified in the suggest request.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query string specified in the suggest request.
     * </p>
     * 
     * @param query
     *        The query string specified in the suggest request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestModel withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The number of documents that were found to match the query string.
     * </p>
     * 
     * @param found
     *        The number of documents that were found to match the query string.
     */

    public void setFound(Long found) {
        this.found = found;
    }

    /**
     * <p>
     * The number of documents that were found to match the query string.
     * </p>
     * 
     * @return The number of documents that were found to match the query string.
     */

    public Long getFound() {
        return this.found;
    }

    /**
     * <p>
     * The number of documents that were found to match the query string.
     * </p>
     * 
     * @param found
     *        The number of documents that were found to match the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestModel withFound(Long found) {
        setFound(found);
        return this;
    }

    /**
     * <p>
     * The documents that match the query string.
     * </p>
     * 
     * @return The documents that match the query string.
     */

    public java.util.List<SuggestionMatch> getSuggestions() {
        if (suggestions == null) {
            suggestions = new com.amazonaws.internal.SdkInternalList<SuggestionMatch>();
        }
        return suggestions;
    }

    /**
     * <p>
     * The documents that match the query string.
     * </p>
     * 
     * @param suggestions
     *        The documents that match the query string.
     */

    public void setSuggestions(java.util.Collection<SuggestionMatch> suggestions) {
        if (suggestions == null) {
            this.suggestions = null;
            return;
        }

        this.suggestions = new com.amazonaws.internal.SdkInternalList<SuggestionMatch>(suggestions);
    }

    /**
     * <p>
     * The documents that match the query string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestions(java.util.Collection)} or {@link #withSuggestions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param suggestions
     *        The documents that match the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestModel withSuggestions(SuggestionMatch... suggestions) {
        if (this.suggestions == null) {
            setSuggestions(new com.amazonaws.internal.SdkInternalList<SuggestionMatch>(suggestions.length));
        }
        for (SuggestionMatch ele : suggestions) {
            this.suggestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The documents that match the query string.
     * </p>
     * 
     * @param suggestions
     *        The documents that match the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestModel withSuggestions(java.util.Collection<SuggestionMatch> suggestions) {
        setSuggestions(suggestions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQuery() != null)
            sb.append("Query: " + getQuery() + ",");
        if (getFound() != null)
            sb.append("Found: " + getFound() + ",");
        if (getSuggestions() != null)
            sb.append("Suggestions: " + getSuggestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestModel == false)
            return false;
        SuggestModel other = (SuggestModel) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getFound() == null ^ this.getFound() == null)
            return false;
        if (other.getFound() != null && other.getFound().equals(this.getFound()) == false)
            return false;
        if (other.getSuggestions() == null ^ this.getSuggestions() == null)
            return false;
        if (other.getSuggestions() != null && other.getSuggestions().equals(this.getSuggestions()) == false)
            return false;
        return true;
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
    public SuggestModel clone() {
        try {
            return (SuggestModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
