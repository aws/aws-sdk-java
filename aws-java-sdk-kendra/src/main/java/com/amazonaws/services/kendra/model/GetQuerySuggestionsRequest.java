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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuerySuggestionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index you want to get query suggestions from.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The text of a user's query to generate query suggestions.
     * </p>
     * <p>
     * A query is suggested if the query prefix matches what a user starts to type as their query.
     * </p>
     * <p>
     * Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters.
     * A query must also have at least one search result and contain at least one word of more than four characters.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * The maximum number of query suggestions you want to show to your users.
     * </p>
     */
    private Integer maxSuggestionsCount;

    /**
     * <p>
     * The identifier of the index you want to get query suggestions from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to get query suggestions from.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to get query suggestions from.
     * </p>
     * 
     * @return The identifier of the index you want to get query suggestions from.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to get query suggestions from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to get query suggestions from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The text of a user's query to generate query suggestions.
     * </p>
     * <p>
     * A query is suggested if the query prefix matches what a user starts to type as their query.
     * </p>
     * <p>
     * Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters.
     * A query must also have at least one search result and contain at least one word of more than four characters.
     * </p>
     * 
     * @param queryText
     *        The text of a user's query to generate query suggestions.</p>
     *        <p>
     *        A query is suggested if the query prefix matches what a user starts to type as their query.
     *        </p>
     *        <p>
     *        Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60
     *        characters. A query must also have at least one search result and contain at least one word of more than
     *        four characters.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The text of a user's query to generate query suggestions.
     * </p>
     * <p>
     * A query is suggested if the query prefix matches what a user starts to type as their query.
     * </p>
     * <p>
     * Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters.
     * A query must also have at least one search result and contain at least one word of more than four characters.
     * </p>
     * 
     * @return The text of a user's query to generate query suggestions.</p>
     *         <p>
     *         A query is suggested if the query prefix matches what a user starts to type as their query.
     *         </p>
     *         <p>
     *         Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60
     *         characters. A query must also have at least one search result and contain at least one word of more than
     *         four characters.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The text of a user's query to generate query suggestions.
     * </p>
     * <p>
     * A query is suggested if the query prefix matches what a user starts to type as their query.
     * </p>
     * <p>
     * Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters.
     * A query must also have at least one search result and contain at least one word of more than four characters.
     * </p>
     * 
     * @param queryText
     *        The text of a user's query to generate query suggestions.</p>
     *        <p>
     *        A query is suggested if the query prefix matches what a user starts to type as their query.
     *        </p>
     *        <p>
     *        Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60
     *        characters. A query must also have at least one search result and contain at least one word of more than
     *        four characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsRequest withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * The maximum number of query suggestions you want to show to your users.
     * </p>
     * 
     * @param maxSuggestionsCount
     *        The maximum number of query suggestions you want to show to your users.
     */

    public void setMaxSuggestionsCount(Integer maxSuggestionsCount) {
        this.maxSuggestionsCount = maxSuggestionsCount;
    }

    /**
     * <p>
     * The maximum number of query suggestions you want to show to your users.
     * </p>
     * 
     * @return The maximum number of query suggestions you want to show to your users.
     */

    public Integer getMaxSuggestionsCount() {
        return this.maxSuggestionsCount;
    }

    /**
     * <p>
     * The maximum number of query suggestions you want to show to your users.
     * </p>
     * 
     * @param maxSuggestionsCount
     *        The maximum number of query suggestions you want to show to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuerySuggestionsRequest withMaxSuggestionsCount(Integer maxSuggestionsCount) {
        setMaxSuggestionsCount(maxSuggestionsCount);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getQueryText() != null)
            sb.append("QueryText: ").append(getQueryText()).append(",");
        if (getMaxSuggestionsCount() != null)
            sb.append("MaxSuggestionsCount: ").append(getMaxSuggestionsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQuerySuggestionsRequest == false)
            return false;
        GetQuerySuggestionsRequest other = (GetQuerySuggestionsRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getMaxSuggestionsCount() == null ^ this.getMaxSuggestionsCount() == null)
            return false;
        if (other.getMaxSuggestionsCount() != null && other.getMaxSuggestionsCount().equals(this.getMaxSuggestionsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode + ((getMaxSuggestionsCount() == null) ? 0 : getMaxSuggestionsCount().hashCode());
        return hashCode;
    }

    @Override
    public GetQuerySuggestionsRequest clone() {
        return (GetQuerySuggestionsRequest) super.clone();
    }

}
