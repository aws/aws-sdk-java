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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVocabularyFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of custom vocabulary filters to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Returns only the custom vocabulary filters that contain the specified string. The search is not case sensitive.
     * </p>
     */
    private String nameContains;

    /**
     * <p>
     * If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     *        <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *        results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *        copied string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @return If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     *         <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *         results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If your <code>ListVocabularyFilters</code> request returns more results than can be displayed,
     *        <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *        results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *        copied string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of custom vocabulary filters to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of custom vocabulary filters to return in each page of results. If there are fewer
     *        results than the value that you specify, only the actual results are returned. If you don't specify a
     *        value, a default of 5 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of custom vocabulary filters to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @return The maximum number of custom vocabulary filters to return in each page of results. If there are fewer
     *         results than the value that you specify, only the actual results are returned. If you don't specify a
     *         value, a default of 5 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of custom vocabulary filters to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of custom vocabulary filters to return in each page of results. If there are fewer
     *        results than the value that you specify, only the actual results are returned. If you don't specify a
     *        value, a default of 5 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Returns only the custom vocabulary filters that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @param nameContains
     *        Returns only the custom vocabulary filters that contain the specified string. The search is not case
     *        sensitive.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Returns only the custom vocabulary filters that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @return Returns only the custom vocabulary filters that contain the specified string. The search is not case
     *         sensitive.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Returns only the custom vocabulary filters that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @param nameContains
     *        Returns only the custom vocabulary filters that contain the specified string. The search is not case
     *        sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVocabularyFiltersRequest == false)
            return false;
        ListVocabularyFiltersRequest other = (ListVocabularyFiltersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public ListVocabularyFiltersRequest clone() {
        return (ListVocabularyFiltersRequest) super.clone();
    }

}
