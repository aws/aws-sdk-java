/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuerySuggestionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for a list of query suggestions for an index.
     * </p>
     */
    private String querySuggestionsId;
    /**
     * <p>
     * A list of query suggestions for an index.
     * </p>
     */
    private java.util.List<Suggestion> suggestions;

    /**
     * <p>
     * The unique identifier for a list of query suggestions for an index.
     * </p>
     * 
     * @param querySuggestionsId
     *        The unique identifier for a list of query suggestions for an index.
     */

    public void setQuerySuggestionsId(String querySuggestionsId) {
        this.querySuggestionsId = querySuggestionsId;
    }

    /**
     * <p>
     * The unique identifier for a list of query suggestions for an index.
     * </p>
     * 
     * @return The unique identifier for a list of query suggestions for an index.
     */

    public String getQuerySuggestionsId() {
        return this.querySuggestionsId;
    }

    /**
     * <p>
     * The unique identifier for a list of query suggestions for an index.
     * </p>
     * 
     * @param querySuggestionsId
     *        The unique identifier for a list of query suggestions for an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsResult withQuerySuggestionsId(String querySuggestionsId) {
        setQuerySuggestionsId(querySuggestionsId);
        return this;
    }

    /**
     * <p>
     * A list of query suggestions for an index.
     * </p>
     * 
     * @return A list of query suggestions for an index.
     */

    public java.util.List<Suggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * <p>
     * A list of query suggestions for an index.
     * </p>
     * 
     * @param suggestions
     *        A list of query suggestions for an index.
     */

    public void setSuggestions(java.util.Collection<Suggestion> suggestions) {
        if (suggestions == null) {
            this.suggestions = null;
            return;
        }

        this.suggestions = new java.util.ArrayList<Suggestion>(suggestions);
    }

    /**
     * <p>
     * A list of query suggestions for an index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestions(java.util.Collection)} or {@link #withSuggestions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param suggestions
     *        A list of query suggestions for an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsResult withSuggestions(Suggestion... suggestions) {
        if (this.suggestions == null) {
            setSuggestions(new java.util.ArrayList<Suggestion>(suggestions.length));
        }
        for (Suggestion ele : suggestions) {
            this.suggestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of query suggestions for an index.
     * </p>
     * 
     * @param suggestions
     *        A list of query suggestions for an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsResult withSuggestions(java.util.Collection<Suggestion> suggestions) {
        setSuggestions(suggestions);
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
        if (getQuerySuggestionsId() != null)
            sb.append("QuerySuggestionsId: ").append(getQuerySuggestionsId()).append(",");
        if (getSuggestions() != null)
            sb.append("Suggestions: ").append(getSuggestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQuerySuggestionsResult == false)
            return false;
        GetQuerySuggestionsResult other = (GetQuerySuggestionsResult) obj;
        if (other.getQuerySuggestionsId() == null ^ this.getQuerySuggestionsId() == null)
            return false;
        if (other.getQuerySuggestionsId() != null && other.getQuerySuggestionsId().equals(this.getQuerySuggestionsId()) == false)
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

        hashCode = prime * hashCode + ((getQuerySuggestionsId() == null) ? 0 : getQuerySuggestionsId().hashCode());
        hashCode = prime * hashCode + ((getSuggestions() == null) ? 0 : getSuggestions().hashCode());
        return hashCode;
    }

    @Override
    public GetQuerySuggestionsResult clone() {
        try {
            return (GetQuerySuggestionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
