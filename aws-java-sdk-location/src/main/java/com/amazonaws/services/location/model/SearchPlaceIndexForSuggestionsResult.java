/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForSuggestions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForSuggestionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of place suggestions that best match the search text.
     * </p>
     */
    private java.util.List<SearchForSuggestionsResult> results;
    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>, <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and <code>Text</code>. Also
     * includes the <code>DataSource</code> of the place index.
     * </p>
     */
    private SearchPlaceIndexForSuggestionsSummary summary;

    /**
     * <p>
     * A list of place suggestions that best match the search text.
     * </p>
     * 
     * @return A list of place suggestions that best match the search text.
     */

    public java.util.List<SearchForSuggestionsResult> getResults() {
        return results;
    }

    /**
     * <p>
     * A list of place suggestions that best match the search text.
     * </p>
     * 
     * @param results
     *        A list of place suggestions that best match the search text.
     */

    public void setResults(java.util.Collection<SearchForSuggestionsResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<SearchForSuggestionsResult>(results);
    }

    /**
     * <p>
     * A list of place suggestions that best match the search text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list of place suggestions that best match the search text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsResult withResults(SearchForSuggestionsResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<SearchForSuggestionsResult>(results.length));
        }
        for (SearchForSuggestionsResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of place suggestions that best match the search text.
     * </p>
     * 
     * @param results
     *        A list of place suggestions that best match the search text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsResult withResults(java.util.Collection<SearchForSuggestionsResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>, <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and <code>Text</code>. Also
     * includes the <code>DataSource</code> of the place index.
     * </p>
     * 
     * @param summary
     *        Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>,
     *        <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and
     *        <code>Text</code>. Also includes the <code>DataSource</code> of the place index.
     */

    public void setSummary(SearchPlaceIndexForSuggestionsSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>, <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and <code>Text</code>. Also
     * includes the <code>DataSource</code> of the place index.
     * </p>
     * 
     * @return Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>,
     *         <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>,
     *         and <code>Text</code>. Also includes the <code>DataSource</code> of the place index.
     */

    public SearchPlaceIndexForSuggestionsSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>, <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and <code>Text</code>. Also
     * includes the <code>DataSource</code> of the place index.
     * </p>
     * 
     * @param summary
     *        Contains a summary of the request. Echoes the input values for <code>BiasPosition</code>,
     *        <code>FilterBBox</code>, <code>FilterCountries</code>, <code>Language</code>, <code>MaxResults</code>, and
     *        <code>Text</code>. Also includes the <code>DataSource</code> of the place index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsResult withSummary(SearchPlaceIndexForSuggestionsSummary summary) {
        setSummary(summary);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForSuggestionsResult == false)
            return false;
        SearchPlaceIndexForSuggestionsResult other = (SearchPlaceIndexForSuggestionsResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForSuggestionsResult clone() {
        try {
            return (SearchPlaceIndexForSuggestionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
