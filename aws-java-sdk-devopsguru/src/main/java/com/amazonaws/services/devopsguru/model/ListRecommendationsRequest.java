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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the requested insight.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A locale that specifies the language to use for recommendations.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The ID of the requested insight.
     * </p>
     * 
     * @param insightId
     *        The ID of the requested insight.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The ID of the requested insight.
     * </p>
     * 
     * @return The ID of the requested insight.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The ID of the requested insight.
     * </p>
     * 
     * @param insightId
     *        The ID of the requested insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A locale that specifies the language to use for recommendations.
     * </p>
     * 
     * @param locale
     *        A locale that specifies the language to use for recommendations.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * A locale that specifies the language to use for recommendations.
     * </p>
     * 
     * @return A locale that specifies the language to use for recommendations.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * A locale that specifies the language to use for recommendations.
     * </p>
     * 
     * @param locale
     *        A locale that specifies the language to use for recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public ListRecommendationsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * A locale that specifies the language to use for recommendations.
     * </p>
     * 
     * @param locale
     *        A locale that specifies the language to use for recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public ListRecommendationsRequest withLocale(Locale locale) {
        this.locale = locale.toString();
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsRequest == false)
            return false;
        ListRecommendationsRequest other = (ListRecommendationsRequest) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsRequest clone() {
        return (ListRecommendationsRequest) super.clone();
    }

}
