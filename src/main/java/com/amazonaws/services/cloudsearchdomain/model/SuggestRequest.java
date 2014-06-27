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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#suggest(SuggestRequest) Suggest operation}.
 * <p>
 * Retrieves autocomplete suggestions for a partial query string. You can
 * use suggestions enable you to display likely matches before users
 * finish typing. In Amazon CloudSearch, suggestions are based on the
 * contents of a particular text field. When you request suggestions,
 * Amazon CloudSearch finds all of the documents whose values in the
 * suggester field start with the specified query string. The beginning
 * of the field must match the query string to be considered a match.
 * </p>
 * <p>
 * For more information about configuring suggesters and retrieving
 * suggestions, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Suggestions </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 * <p>
 * The endpoint for submitting <code>Suggest</code> requests is
 * domain-specific. You submit suggest requests to a domain's search
 * endpoint. To get the search endpoint for your domain, use the Amazon
 * CloudSearch configuration service <code>DescribeDomains</code> action.
 * A domain's endpoints are also displayed on the domain dashboard in the
 * Amazon CloudSearch console.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#suggest(SuggestRequest)
 */
public class SuggestRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Specifies the string for which you want to get suggestions.
     */
    private String query;

    /**
     * Specifies the name of the suggester to use to find suggested matches.
     */
    private String suggester;

    /**
     * Specifies the maximum number of suggestions to return.
     */
    private Long size;

    /**
     * Specifies the string for which you want to get suggestions.
     *
     * @return Specifies the string for which you want to get suggestions.
     */
    public String getQuery() {
        return query;
    }
    
    /**
     * Specifies the string for which you want to get suggestions.
     *
     * @param query Specifies the string for which you want to get suggestions.
     */
    public void setQuery(String query) {
        this.query = query;
    }
    
    /**
     * Specifies the string for which you want to get suggestions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param query Specifies the string for which you want to get suggestions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Specifies the name of the suggester to use to find suggested matches.
     *
     * @return Specifies the name of the suggester to use to find suggested matches.
     */
    public String getSuggester() {
        return suggester;
    }
    
    /**
     * Specifies the name of the suggester to use to find suggested matches.
     *
     * @param suggester Specifies the name of the suggester to use to find suggested matches.
     */
    public void setSuggester(String suggester) {
        this.suggester = suggester;
    }
    
    /**
     * Specifies the name of the suggester to use to find suggested matches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggester Specifies the name of the suggester to use to find suggested matches.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestRequest withSuggester(String suggester) {
        this.suggester = suggester;
        return this;
    }

    /**
     * Specifies the maximum number of suggestions to return.
     *
     * @return Specifies the maximum number of suggestions to return.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * Specifies the maximum number of suggestions to return.
     *
     * @param size Specifies the maximum number of suggestions to return.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * Specifies the maximum number of suggestions to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size Specifies the maximum number of suggestions to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestRequest withSize(Long size) {
        this.size = size;
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
        if (getSuggester() != null) sb.append("Suggester: " + getSuggester() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode()); 
        hashCode = prime * hashCode + ((getSuggester() == null) ? 0 : getSuggester().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuggestRequest == false) return false;
        SuggestRequest other = (SuggestRequest)obj;
        
        if (other.getQuery() == null ^ this.getQuery() == null) return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false) return false; 
        if (other.getSuggester() == null ^ this.getSuggester() == null) return false;
        if (other.getSuggester() != null && other.getSuggester().equals(this.getSuggester()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        return true;
    }
    
}
    