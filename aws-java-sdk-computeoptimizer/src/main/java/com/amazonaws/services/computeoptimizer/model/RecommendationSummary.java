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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that describe a recommendation summary.
     * </p>
     */
    private java.util.List<Summary> summaries;
    /**
     * <p>
     * The resource type that the recommendation summary applies to.
     * </p>
     */
    private String recommendationResourceType;
    /**
     * <p>
     * The Amazon Web Services account ID of the recommendation summary.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An object that describes the savings opportunity for a given resource type. Savings opportunity includes the
     * estimated monthly savings amount and percentage.
     * </p>
     */
    private SavingsOpportunity savingsOpportunity;
    /**
     * <p>
     * An object that describes the performance risk ratings for a given resource type.
     * </p>
     */
    private CurrentPerformanceRiskRatings currentPerformanceRiskRatings;

    /**
     * <p>
     * An array of objects that describe a recommendation summary.
     * </p>
     * 
     * @return An array of objects that describe a recommendation summary.
     */

    public java.util.List<Summary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * An array of objects that describe a recommendation summary.
     * </p>
     * 
     * @param summaries
     *        An array of objects that describe a recommendation summary.
     */

    public void setSummaries(java.util.Collection<Summary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<Summary>(summaries);
    }

    /**
     * <p>
     * An array of objects that describe a recommendation summary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        An array of objects that describe a recommendation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withSummaries(Summary... summaries) {
        if (this.summaries == null) {
            setSummaries(new java.util.ArrayList<Summary>(summaries.length));
        }
        for (Summary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a recommendation summary.
     * </p>
     * 
     * @param summaries
     *        An array of objects that describe a recommendation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withSummaries(java.util.Collection<Summary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * The resource type that the recommendation summary applies to.
     * </p>
     * 
     * @param recommendationResourceType
     *        The resource type that the recommendation summary applies to.
     * @see RecommendationSourceType
     */

    public void setRecommendationResourceType(String recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType;
    }

    /**
     * <p>
     * The resource type that the recommendation summary applies to.
     * </p>
     * 
     * @return The resource type that the recommendation summary applies to.
     * @see RecommendationSourceType
     */

    public String getRecommendationResourceType() {
        return this.recommendationResourceType;
    }

    /**
     * <p>
     * The resource type that the recommendation summary applies to.
     * </p>
     * 
     * @param recommendationResourceType
     *        The resource type that the recommendation summary applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationSummary withRecommendationResourceType(String recommendationResourceType) {
        setRecommendationResourceType(recommendationResourceType);
        return this;
    }

    /**
     * <p>
     * The resource type that the recommendation summary applies to.
     * </p>
     * 
     * @param recommendationResourceType
     *        The resource type that the recommendation summary applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationSummary withRecommendationResourceType(RecommendationSourceType recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the recommendation summary.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the recommendation summary.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the recommendation summary.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the recommendation summary.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the recommendation summary.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the recommendation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An object that describes the savings opportunity for a given resource type. Savings opportunity includes the
     * estimated monthly savings amount and percentage.
     * </p>
     * 
     * @param savingsOpportunity
     *        An object that describes the savings opportunity for a given resource type. Savings opportunity includes
     *        the estimated monthly savings amount and percentage.
     */

    public void setSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        this.savingsOpportunity = savingsOpportunity;
    }

    /**
     * <p>
     * An object that describes the savings opportunity for a given resource type. Savings opportunity includes the
     * estimated monthly savings amount and percentage.
     * </p>
     * 
     * @return An object that describes the savings opportunity for a given resource type. Savings opportunity includes
     *         the estimated monthly savings amount and percentage.
     */

    public SavingsOpportunity getSavingsOpportunity() {
        return this.savingsOpportunity;
    }

    /**
     * <p>
     * An object that describes the savings opportunity for a given resource type. Savings opportunity includes the
     * estimated monthly savings amount and percentage.
     * </p>
     * 
     * @param savingsOpportunity
     *        An object that describes the savings opportunity for a given resource type. Savings opportunity includes
     *        the estimated monthly savings amount and percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        setSavingsOpportunity(savingsOpportunity);
        return this;
    }

    /**
     * <p>
     * An object that describes the performance risk ratings for a given resource type.
     * </p>
     * 
     * @param currentPerformanceRiskRatings
     *        An object that describes the performance risk ratings for a given resource type.
     */

    public void setCurrentPerformanceRiskRatings(CurrentPerformanceRiskRatings currentPerformanceRiskRatings) {
        this.currentPerformanceRiskRatings = currentPerformanceRiskRatings;
    }

    /**
     * <p>
     * An object that describes the performance risk ratings for a given resource type.
     * </p>
     * 
     * @return An object that describes the performance risk ratings for a given resource type.
     */

    public CurrentPerformanceRiskRatings getCurrentPerformanceRiskRatings() {
        return this.currentPerformanceRiskRatings;
    }

    /**
     * <p>
     * An object that describes the performance risk ratings for a given resource type.
     * </p>
     * 
     * @param currentPerformanceRiskRatings
     *        An object that describes the performance risk ratings for a given resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withCurrentPerformanceRiskRatings(CurrentPerformanceRiskRatings currentPerformanceRiskRatings) {
        setCurrentPerformanceRiskRatings(currentPerformanceRiskRatings);
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
        if (getRecommendationResourceType() != null)
            sb.append("RecommendationResourceType: ").append(getRecommendationResourceType()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getSavingsOpportunity() != null)
            sb.append("SavingsOpportunity: ").append(getSavingsOpportunity()).append(",");
        if (getCurrentPerformanceRiskRatings() != null)
            sb.append("CurrentPerformanceRiskRatings: ").append(getCurrentPerformanceRiskRatings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationSummary == false)
            return false;
        RecommendationSummary other = (RecommendationSummary) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        if (other.getRecommendationResourceType() == null ^ this.getRecommendationResourceType() == null)
            return false;
        if (other.getRecommendationResourceType() != null && other.getRecommendationResourceType().equals(this.getRecommendationResourceType()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSavingsOpportunity() == null ^ this.getSavingsOpportunity() == null)
            return false;
        if (other.getSavingsOpportunity() != null && other.getSavingsOpportunity().equals(this.getSavingsOpportunity()) == false)
            return false;
        if (other.getCurrentPerformanceRiskRatings() == null ^ this.getCurrentPerformanceRiskRatings() == null)
            return false;
        if (other.getCurrentPerformanceRiskRatings() != null
                && other.getCurrentPerformanceRiskRatings().equals(this.getCurrentPerformanceRiskRatings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getRecommendationResourceType() == null) ? 0 : getRecommendationResourceType().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunity() == null) ? 0 : getSavingsOpportunity().hashCode());
        hashCode = prime * hashCode + ((getCurrentPerformanceRiskRatings() == null) ? 0 : getCurrentPerformanceRiskRatings().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationSummary clone() {
        try {
            return (RecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
