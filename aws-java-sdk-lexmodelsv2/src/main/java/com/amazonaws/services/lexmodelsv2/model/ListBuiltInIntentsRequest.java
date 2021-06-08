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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuiltInIntentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by the
     * built-in intent signature in either ascending or descending order.
     * </p>
     */
    private BuiltInIntentSortBy sortBy;
    /**
     * <p>
     * The maximum number of built-in intents to return in each page of results. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the intents to list. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale of the intents to list. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the intents to list. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by the
     * built-in intent signature in either ascending or descending order.
     * </p>
     * 
     * @param sortBy
     *        Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by
     *        the built-in intent signature in either ascending or descending order.
     */

    public void setSortBy(BuiltInIntentSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by the
     * built-in intent signature in either ascending or descending order.
     * </p>
     * 
     * @return Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by
     *         the built-in intent signature in either ascending or descending order.
     */

    public BuiltInIntentSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by the
     * built-in intent signature in either ascending or descending order.
     * </p>
     * 
     * @param sortBy
     *        Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by
     *        the built-in intent signature in either ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsRequest withSortBy(BuiltInIntentSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The maximum number of built-in intents to return in each page of results. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of built-in intents to return in each page of results. If there are fewer results than
     *        the max page size, only the actual number of results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of built-in intents to return in each page of results. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @return The maximum number of built-in intents to return in each page of results. If there are fewer results than
     *         the max page size, only the actual number of results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of built-in intents to return in each page of results. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of built-in intents to return in each page of results. If there are fewer results than
     *        the max page size, only the actual number of results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in
     *        the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *        <code>nextToken</code> parameter to return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @return If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified
     *         in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *         <code>nextToken</code> parameter to return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListBuiltInIntents</code> operation contains more results than specified in
     *        the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *        <code>nextToken</code> parameter to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBuiltInIntentsRequest == false)
            return false;
        ListBuiltInIntentsRequest other = (ListBuiltInIntentsRequest) obj;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuiltInIntentsRequest clone() {
        return (ListBuiltInIntentsRequest) super.clone();
    }

}
