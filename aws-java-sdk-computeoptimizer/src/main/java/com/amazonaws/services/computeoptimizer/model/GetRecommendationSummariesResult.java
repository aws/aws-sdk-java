/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of recommendation summaries.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation summaries to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that summarize a recommendation.
     * </p>
     */
    private java.util.List<RecommendationSummary> recommendationSummaries;

    /**
     * <p>
     * The token to use to advance to the next page of recommendation summaries.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation summaries to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of recommendation summaries.</p>
     *        <p>
     *        This value is null when there are no more pages of recommendation summaries to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of recommendation summaries.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation summaries to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of recommendation summaries.</p>
     *         <p>
     *         This value is null when there are no more pages of recommendation summaries to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of recommendation summaries.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation summaries to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of recommendation summaries.</p>
     *        <p>
     *        This value is null when there are no more pages of recommendation summaries to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize a recommendation.
     * </p>
     * 
     * @return An array of objects that summarize a recommendation.
     */

    public java.util.List<RecommendationSummary> getRecommendationSummaries() {
        return recommendationSummaries;
    }

    /**
     * <p>
     * An array of objects that summarize a recommendation.
     * </p>
     * 
     * @param recommendationSummaries
     *        An array of objects that summarize a recommendation.
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
     * An array of objects that summarize a recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationSummaries(java.util.Collection)} or
     * {@link #withRecommendationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationSummaries
     *        An array of objects that summarize a recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesResult withRecommendationSummaries(RecommendationSummary... recommendationSummaries) {
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
     * An array of objects that summarize a recommendation.
     * </p>
     * 
     * @param recommendationSummaries
     *        An array of objects that summarize a recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesResult withRecommendationSummaries(java.util.Collection<RecommendationSummary> recommendationSummaries) {
        setRecommendationSummaries(recommendationSummaries);
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
        if (getRecommendationSummaries() != null)
            sb.append("RecommendationSummaries: ").append(getRecommendationSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationSummariesResult == false)
            return false;
        GetRecommendationSummariesResult other = (GetRecommendationSummariesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendationSummaries() == null ^ this.getRecommendationSummaries() == null)
            return false;
        if (other.getRecommendationSummaries() != null && other.getRecommendationSummaries().equals(this.getRecommendationSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSummaries() == null) ? 0 : getRecommendationSummaries().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationSummariesResult clone() {
        try {
            return (GetRecommendationSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
