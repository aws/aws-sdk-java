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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendationFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationFeedbackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code review ARN.
     * </p>
     */
    private java.util.List<RecommendationFeedbackSummary> recommendationFeedbackSummaries;
    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code review ARN.
     * </p>
     * 
     * @return Recommendation feedback summaries corresponding to the code review ARN.
     */

    public java.util.List<RecommendationFeedbackSummary> getRecommendationFeedbackSummaries() {
        return recommendationFeedbackSummaries;
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code review ARN.
     * </p>
     * 
     * @param recommendationFeedbackSummaries
     *        Recommendation feedback summaries corresponding to the code review ARN.
     */

    public void setRecommendationFeedbackSummaries(java.util.Collection<RecommendationFeedbackSummary> recommendationFeedbackSummaries) {
        if (recommendationFeedbackSummaries == null) {
            this.recommendationFeedbackSummaries = null;
            return;
        }

        this.recommendationFeedbackSummaries = new java.util.ArrayList<RecommendationFeedbackSummary>(recommendationFeedbackSummaries);
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code review ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationFeedbackSummaries(java.util.Collection)} or
     * {@link #withRecommendationFeedbackSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationFeedbackSummaries
     *        Recommendation feedback summaries corresponding to the code review ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackResult withRecommendationFeedbackSummaries(RecommendationFeedbackSummary... recommendationFeedbackSummaries) {
        if (this.recommendationFeedbackSummaries == null) {
            setRecommendationFeedbackSummaries(new java.util.ArrayList<RecommendationFeedbackSummary>(recommendationFeedbackSummaries.length));
        }
        for (RecommendationFeedbackSummary ele : recommendationFeedbackSummaries) {
            this.recommendationFeedbackSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code review ARN.
     * </p>
     * 
     * @param recommendationFeedbackSummaries
     *        Recommendation feedback summaries corresponding to the code review ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackResult withRecommendationFeedbackSummaries(
            java.util.Collection<RecommendationFeedbackSummary> recommendationFeedbackSummaries) {
        setRecommendationFeedbackSummaries(recommendationFeedbackSummaries);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackResult withNextToken(String nextToken) {
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
        if (getRecommendationFeedbackSummaries() != null)
            sb.append("RecommendationFeedbackSummaries: ").append(getRecommendationFeedbackSummaries()).append(",");
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

        if (obj instanceof ListRecommendationFeedbackResult == false)
            return false;
        ListRecommendationFeedbackResult other = (ListRecommendationFeedbackResult) obj;
        if (other.getRecommendationFeedbackSummaries() == null ^ this.getRecommendationFeedbackSummaries() == null)
            return false;
        if (other.getRecommendationFeedbackSummaries() != null
                && other.getRecommendationFeedbackSummaries().equals(this.getRecommendationFeedbackSummaries()) == false)
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

        hashCode = prime * hashCode + ((getRecommendationFeedbackSummaries() == null) ? 0 : getRecommendationFeedbackSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationFeedbackResult clone() {
        try {
            return (ListRecommendationFeedbackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
