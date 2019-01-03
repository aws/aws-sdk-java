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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>Suggest</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the string for which you want to get suggestions.
     * </p>
     */
    private String query;
    /**
     * <p>
     * Specifies the name of the suggester to use to find suggested matches.
     * </p>
     */
    private String suggester;
    /**
     * <p>
     * Specifies the maximum number of suggestions to return.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * Specifies the string for which you want to get suggestions.
     * </p>
     * 
     * @param query
     *        Specifies the string for which you want to get suggestions.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * Specifies the string for which you want to get suggestions.
     * </p>
     * 
     * @return Specifies the string for which you want to get suggestions.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * Specifies the string for which you want to get suggestions.
     * </p>
     * 
     * @param query
     *        Specifies the string for which you want to get suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestRequest withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the suggester to use to find suggested matches.
     * </p>
     * 
     * @param suggester
     *        Specifies the name of the suggester to use to find suggested matches.
     */

    public void setSuggester(String suggester) {
        this.suggester = suggester;
    }

    /**
     * <p>
     * Specifies the name of the suggester to use to find suggested matches.
     * </p>
     * 
     * @return Specifies the name of the suggester to use to find suggested matches.
     */

    public String getSuggester() {
        return this.suggester;
    }

    /**
     * <p>
     * Specifies the name of the suggester to use to find suggested matches.
     * </p>
     * 
     * @param suggester
     *        Specifies the name of the suggester to use to find suggested matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestRequest withSuggester(String suggester) {
        setSuggester(suggester);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of suggestions to return.
     * </p>
     * 
     * @param size
     *        Specifies the maximum number of suggestions to return.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * Specifies the maximum number of suggestions to return.
     * </p>
     * 
     * @return Specifies the maximum number of suggestions to return.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * Specifies the maximum number of suggestions to return.
     * </p>
     * 
     * @param size
     *        Specifies the maximum number of suggestions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestRequest withSize(Long size) {
        setSize(size);
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
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getSuggester() != null)
            sb.append("Suggester: ").append(getSuggester()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestRequest == false)
            return false;
        SuggestRequest other = (SuggestRequest) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getSuggester() == null ^ this.getSuggester() == null)
            return false;
        if (other.getSuggester() != null && other.getSuggester().equals(this.getSuggester()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
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
    public SuggestRequest clone() {
        return (SuggestRequest) super.clone();
    }

}
