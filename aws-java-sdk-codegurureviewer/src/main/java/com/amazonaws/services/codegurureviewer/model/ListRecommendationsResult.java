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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     */
    private java.util.List<RecommendationSummary> recommendationSummaries;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * 
     * @return List of recommendations for the requested code review.
     */

    public java.util.List<RecommendationSummary> getRecommendationSummaries() {
        return recommendationSummaries;
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * 
     * @param recommendationSummaries
     *        List of recommendations for the requested code review.
     */

    public void setRecommendationSummaries(java.util.Collection<RecommendationSummary> recommendationSummaries) {
        if (recommendationSummaries == null) {
            this.recommendationSummaries = null;
            return;
        }

        this.recommendationSummaries = new java.util.ArrayList<RecommendationSummary>(recommendationSummaries);
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationSummaries(java.util.Collection)} or
     * {@link #withRecommendationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationSummaries
     *        List of recommendations for the requested code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendationSummaries(RecommendationSummary... recommendationSummaries) {
        if (this.recommendationSummaries == null) {
            setRecommendationSummaries(new java.util.ArrayList<RecommendationSummary>(recommendationSummaries.length));
        }
        for (RecommendationSummary ele : recommendationSummaries) {
            this.recommendationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * 
     * @param recommendationSummaries
     *        List of recommendations for the requested code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendationSummaries(java.util.Collection<RecommendationSummary> recommendationSummaries) {
        setRecommendationSummaries(recommendationSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withNextToken(String nextToken) {
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
        if (getRecommendationSummaries() != null)
            sb.append("RecommendationSummaries: ").append(getRecommendationSummaries()).append(",");
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

        if (obj instanceof ListRecommendationsResult == false)
            return false;
        ListRecommendationsResult other = (ListRecommendationsResult) obj;
        if (other.getRecommendationSummaries() == null ^ this.getRecommendationSummaries() == null)
            return false;
        if (other.getRecommendationSummaries() != null && other.getRecommendationSummaries().equals(this.getRecommendationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getRecommendationSummaries() == null) ? 0 : getRecommendationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsResult clone() {
        try {
            return (ListRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
