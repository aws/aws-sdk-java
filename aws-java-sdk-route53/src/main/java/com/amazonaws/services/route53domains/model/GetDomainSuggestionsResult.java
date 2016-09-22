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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * 
 */
public class GetDomainSuggestionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<DomainSuggestion> suggestionsList;

    /**
     * @return
     */

    public java.util.List<DomainSuggestion> getSuggestionsList() {
        if (suggestionsList == null) {
            suggestionsList = new com.amazonaws.internal.SdkInternalList<DomainSuggestion>();
        }
        return suggestionsList;
    }

    /**
     * @param suggestionsList
     */

    public void setSuggestionsList(java.util.Collection<DomainSuggestion> suggestionsList) {
        if (suggestionsList == null) {
            this.suggestionsList = null;
            return;
        }

        this.suggestionsList = new com.amazonaws.internal.SdkInternalList<DomainSuggestion>(suggestionsList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestionsList(java.util.Collection)} or {@link #withSuggestionsList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param suggestionsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsResult withSuggestionsList(DomainSuggestion... suggestionsList) {
        if (this.suggestionsList == null) {
            setSuggestionsList(new com.amazonaws.internal.SdkInternalList<DomainSuggestion>(suggestionsList.length));
        }
        for (DomainSuggestion ele : suggestionsList) {
            this.suggestionsList.add(ele);
        }
        return this;
    }

    /**
     * @param suggestionsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsResult withSuggestionsList(java.util.Collection<DomainSuggestion> suggestionsList) {
        setSuggestionsList(suggestionsList);
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
        if (getSuggestionsList() != null)
            sb.append("SuggestionsList: " + getSuggestionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainSuggestionsResult == false)
            return false;
        GetDomainSuggestionsResult other = (GetDomainSuggestionsResult) obj;
        if (other.getSuggestionsList() == null ^ this.getSuggestionsList() == null)
            return false;
        if (other.getSuggestionsList() != null && other.getSuggestionsList().equals(this.getSuggestionsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggestionsList() == null) ? 0 : getSuggestionsList().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainSuggestionsResult clone() {
        try {
            return (GetDomainSuggestionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
