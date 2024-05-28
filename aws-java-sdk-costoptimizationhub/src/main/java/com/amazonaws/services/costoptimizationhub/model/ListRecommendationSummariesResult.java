/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The currency code used for the recommendation.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The total overall savings for the aggregated view.
     * </p>
     */
    private Double estimatedTotalDedupedSavings;
    /**
     * <p>
     * The dimension used to group the recommendations by.
     * </p>
     */
    private String groupBy;
    /**
     * <p>
     * List of all savings recommendations.
     * </p>
     */
    private java.util.List<RecommendationSummary> items;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The currency code used for the recommendation.
     * </p>
     * 
     * @param currencyCode
     *        The currency code used for the recommendation.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code used for the recommendation.
     * </p>
     * 
     * @return The currency code used for the recommendation.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code used for the recommendation.
     * </p>
     * 
     * @param currencyCode
     *        The currency code used for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The total overall savings for the aggregated view.
     * </p>
     * 
     * @param estimatedTotalDedupedSavings
     *        The total overall savings for the aggregated view.
     */

    public void setEstimatedTotalDedupedSavings(Double estimatedTotalDedupedSavings) {
        this.estimatedTotalDedupedSavings = estimatedTotalDedupedSavings;
    }

    /**
     * <p>
     * The total overall savings for the aggregated view.
     * </p>
     * 
     * @return The total overall savings for the aggregated view.
     */

    public Double getEstimatedTotalDedupedSavings() {
        return this.estimatedTotalDedupedSavings;
    }

    /**
     * <p>
     * The total overall savings for the aggregated view.
     * </p>
     * 
     * @param estimatedTotalDedupedSavings
     *        The total overall savings for the aggregated view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withEstimatedTotalDedupedSavings(Double estimatedTotalDedupedSavings) {
        setEstimatedTotalDedupedSavings(estimatedTotalDedupedSavings);
        return this;
    }

    /**
     * <p>
     * The dimension used to group the recommendations by.
     * </p>
     * 
     * @param groupBy
     *        The dimension used to group the recommendations by.
     */

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The dimension used to group the recommendations by.
     * </p>
     * 
     * @return The dimension used to group the recommendations by.
     */

    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * The dimension used to group the recommendations by.
     * </p>
     * 
     * @param groupBy
     *        The dimension used to group the recommendations by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withGroupBy(String groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * List of all savings recommendations.
     * </p>
     * 
     * @return List of all savings recommendations.
     */

    public java.util.List<RecommendationSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * List of all savings recommendations.
     * </p>
     * 
     * @param items
     *        List of all savings recommendations.
     */

    public void setItems(java.util.Collection<RecommendationSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<RecommendationSummary>(items);
    }

    /**
     * <p>
     * List of all savings recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        List of all savings recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withItems(RecommendationSummary... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<RecommendationSummary>(items.length));
        }
        for (RecommendationSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of all savings recommendations.
     * </p>
     * 
     * @param items
     *        List of all savings recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withItems(java.util.Collection<RecommendationSummary> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesResult withNextToken(String nextToken) {
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getEstimatedTotalDedupedSavings() != null)
            sb.append("EstimatedTotalDedupedSavings: ").append(getEstimatedTotalDedupedSavings()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListRecommendationSummariesResult == false)
            return false;
        ListRecommendationSummariesResult other = (ListRecommendationSummariesResult) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedTotalDedupedSavings() == null ^ this.getEstimatedTotalDedupedSavings() == null)
            return false;
        if (other.getEstimatedTotalDedupedSavings() != null && other.getEstimatedTotalDedupedSavings().equals(this.getEstimatedTotalDedupedSavings()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTotalDedupedSavings() == null) ? 0 : getEstimatedTotalDedupedSavings().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationSummariesResult clone() {
        try {
            return (ListRecommendationSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
