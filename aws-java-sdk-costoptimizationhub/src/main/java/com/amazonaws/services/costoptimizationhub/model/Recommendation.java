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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/Recommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The type of tasks that can be carried out by this action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The currency code used for the recommendation.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Describes the current resource.
     * </p>
     */
    private String currentResourceSummary;
    /**
     * <p>
     * The current resource type.
     * </p>
     */
    private String currentResourceType;
    /**
     * <p>
     * The estimated monthly cost for the recommendation.
     * </p>
     */
    private Double estimatedMonthlyCost;
    /**
     * <p>
     * The estimated monthly savings amount for the recommendation.
     * </p>
     */
    private Double estimatedMonthlySavings;
    /**
     * <p>
     * The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     * </p>
     */
    private Double estimatedSavingsPercentage;
    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     */
    private String implementationEffort;
    /**
     * <p>
     * The time when the recommendation was last generated.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;
    /**
     * <p>
     * The ID for the recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The lookback period that's used to generate the recommendation.
     * </p>
     */
    private Integer recommendationLookbackPeriodInDays;
    /**
     * <p>
     * Describes the recommended resource.
     * </p>
     */
    private String recommendedResourceSummary;
    /**
     * <p>
     * The recommended resource type.
     * </p>
     */
    private String recommendedResourceType;
    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The resource ID for the recommendation.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     */
    private Boolean restartNeeded;
    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     */
    private Boolean rollbackPossible;
    /**
     * <p>
     * The source of the recommendation.
     * </p>
     */
    private String source;
    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that the recommendation is for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @return The account that the recommendation is for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that the recommendation is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The type of tasks that can be carried out by this action.
     * </p>
     * 
     * @param actionType
     *        The type of tasks that can be carried out by this action.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of tasks that can be carried out by this action.
     * </p>
     * 
     * @return The type of tasks that can be carried out by this action.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of tasks that can be carried out by this action.
     * </p>
     * 
     * @param actionType
     *        The type of tasks that can be carried out by this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

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

    public Recommendation withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * Describes the current resource.
     * </p>
     * 
     * @param currentResourceSummary
     *        Describes the current resource.
     */

    public void setCurrentResourceSummary(String currentResourceSummary) {
        this.currentResourceSummary = currentResourceSummary;
    }

    /**
     * <p>
     * Describes the current resource.
     * </p>
     * 
     * @return Describes the current resource.
     */

    public String getCurrentResourceSummary() {
        return this.currentResourceSummary;
    }

    /**
     * <p>
     * Describes the current resource.
     * </p>
     * 
     * @param currentResourceSummary
     *        Describes the current resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withCurrentResourceSummary(String currentResourceSummary) {
        setCurrentResourceSummary(currentResourceSummary);
        return this;
    }

    /**
     * <p>
     * The current resource type.
     * </p>
     * 
     * @param currentResourceType
     *        The current resource type.
     */

    public void setCurrentResourceType(String currentResourceType) {
        this.currentResourceType = currentResourceType;
    }

    /**
     * <p>
     * The current resource type.
     * </p>
     * 
     * @return The current resource type.
     */

    public String getCurrentResourceType() {
        return this.currentResourceType;
    }

    /**
     * <p>
     * The current resource type.
     * </p>
     * 
     * @param currentResourceType
     *        The current resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withCurrentResourceType(String currentResourceType) {
        setCurrentResourceType(currentResourceType);
        return this;
    }

    /**
     * <p>
     * The estimated monthly cost for the recommendation.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        The estimated monthly cost for the recommendation.
     */

    public void setEstimatedMonthlyCost(Double estimatedMonthlyCost) {
        this.estimatedMonthlyCost = estimatedMonthlyCost;
    }

    /**
     * <p>
     * The estimated monthly cost for the recommendation.
     * </p>
     * 
     * @return The estimated monthly cost for the recommendation.
     */

    public Double getEstimatedMonthlyCost() {
        return this.estimatedMonthlyCost;
    }

    /**
     * <p>
     * The estimated monthly cost for the recommendation.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        The estimated monthly cost for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEstimatedMonthlyCost(Double estimatedMonthlyCost) {
        setEstimatedMonthlyCost(estimatedMonthlyCost);
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount for the recommendation.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings amount for the recommendation.
     */

    public void setEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings amount for the recommendation.
     * </p>
     * 
     * @return The estimated monthly savings amount for the recommendation.
     */

    public Double getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings amount for the recommendation.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings amount for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
        return this;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     */

    public void setEstimatedSavingsPercentage(Double estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     * </p>
     * 
     * @return The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     */

    public Double getEstimatedSavingsPercentage() {
        return this.estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings percentage relative to the total cost over the cost calculation lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEstimatedSavingsPercentage(Double estimatedSavingsPercentage) {
        setEstimatedSavingsPercentage(estimatedSavingsPercentage);
        return this;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @param implementationEffort
     *        The effort required to implement the recommendation.
     */

    public void setImplementationEffort(String implementationEffort) {
        this.implementationEffort = implementationEffort;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @return The effort required to implement the recommendation.
     */

    public String getImplementationEffort() {
        return this.implementationEffort;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @param implementationEffort
     *        The effort required to implement the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withImplementationEffort(String implementationEffort) {
        setImplementationEffort(implementationEffort);
        return this;
    }

    /**
     * <p>
     * The time when the recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time when the recommendation was last generated.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time when the recommendation was last generated.
     * </p>
     * 
     * @return The time when the recommendation was last generated.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time when the recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time when the recommendation was last generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
        return this;
    }

    /**
     * <p>
     * The ID for the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID for the recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The ID for the recommendation.
     * </p>
     * 
     * @return The ID for the recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The ID for the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The lookback period that's used to generate the recommendation.
     * </p>
     * 
     * @param recommendationLookbackPeriodInDays
     *        The lookback period that's used to generate the recommendation.
     */

    public void setRecommendationLookbackPeriodInDays(Integer recommendationLookbackPeriodInDays) {
        this.recommendationLookbackPeriodInDays = recommendationLookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period that's used to generate the recommendation.
     * </p>
     * 
     * @return The lookback period that's used to generate the recommendation.
     */

    public Integer getRecommendationLookbackPeriodInDays() {
        return this.recommendationLookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period that's used to generate the recommendation.
     * </p>
     * 
     * @param recommendationLookbackPeriodInDays
     *        The lookback period that's used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationLookbackPeriodInDays(Integer recommendationLookbackPeriodInDays) {
        setRecommendationLookbackPeriodInDays(recommendationLookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * Describes the recommended resource.
     * </p>
     * 
     * @param recommendedResourceSummary
     *        Describes the recommended resource.
     */

    public void setRecommendedResourceSummary(String recommendedResourceSummary) {
        this.recommendedResourceSummary = recommendedResourceSummary;
    }

    /**
     * <p>
     * Describes the recommended resource.
     * </p>
     * 
     * @return Describes the recommended resource.
     */

    public String getRecommendedResourceSummary() {
        return this.recommendedResourceSummary;
    }

    /**
     * <p>
     * Describes the recommended resource.
     * </p>
     * 
     * @param recommendedResourceSummary
     *        Describes the recommended resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendedResourceSummary(String recommendedResourceSummary) {
        setRecommendedResourceSummary(recommendedResourceSummary);
        return this;
    }

    /**
     * <p>
     * The recommended resource type.
     * </p>
     * 
     * @param recommendedResourceType
     *        The recommended resource type.
     */

    public void setRecommendedResourceType(String recommendedResourceType) {
        this.recommendedResourceType = recommendedResourceType;
    }

    /**
     * <p>
     * The recommended resource type.
     * </p>
     * 
     * @return The recommended resource type.
     */

    public String getRecommendedResourceType() {
        return this.recommendedResourceType;
    }

    /**
     * <p>
     * The recommended resource type.
     * </p>
     * 
     * @param recommendedResourceType
     *        The recommended resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendedResourceType(String recommendedResourceType) {
        setRecommendedResourceType(recommendedResourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the resource.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @return The Amazon Web Services Region of the resource.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the recommendation.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the recommendation.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The resource ID for the recommendation.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for the recommendation.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID for the recommendation.
     * </p>
     * 
     * @return The resource ID for the recommendation.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID for the recommendation.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @param restartNeeded
     *        Whether or not implementing the recommendation requires a restart.
     */

    public void setRestartNeeded(Boolean restartNeeded) {
        this.restartNeeded = restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @return Whether or not implementing the recommendation requires a restart.
     */

    public Boolean getRestartNeeded() {
        return this.restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @param restartNeeded
     *        Whether or not implementing the recommendation requires a restart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRestartNeeded(Boolean restartNeeded) {
        setRestartNeeded(restartNeeded);
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @return Whether or not implementing the recommendation requires a restart.
     */

    public Boolean isRestartNeeded() {
        return this.restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @param rollbackPossible
     *        Whether or not implementing the recommendation can be rolled back.
     */

    public void setRollbackPossible(Boolean rollbackPossible) {
        this.rollbackPossible = rollbackPossible;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @return Whether or not implementing the recommendation can be rolled back.
     */

    public Boolean getRollbackPossible() {
        return this.rollbackPossible;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @param rollbackPossible
     *        Whether or not implementing the recommendation can be rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRollbackPossible(Boolean rollbackPossible) {
        setRollbackPossible(rollbackPossible);
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @return Whether or not implementing the recommendation can be rolled back.
     */

    public Boolean isRollbackPossible() {
        return this.rollbackPossible;
    }

    /**
     * <p>
     * The source of the recommendation.
     * </p>
     * 
     * @param source
     *        The source of the recommendation.
     * @see Source
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the recommendation.
     * </p>
     * 
     * @return The source of the recommendation.
     * @see Source
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the recommendation.
     * </p>
     * 
     * @param source
     *        The source of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Source
     */

    public Recommendation withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of the recommendation.
     * </p>
     * 
     * @param source
     *        The source of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Source
     */

    public Recommendation withSource(Source source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @return A list of tags assigned to the recommendation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getCurrentResourceSummary() != null)
            sb.append("CurrentResourceSummary: ").append(getCurrentResourceSummary()).append(",");
        if (getCurrentResourceType() != null)
            sb.append("CurrentResourceType: ").append(getCurrentResourceType()).append(",");
        if (getEstimatedMonthlyCost() != null)
            sb.append("EstimatedMonthlyCost: ").append(getEstimatedMonthlyCost()).append(",");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings()).append(",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: ").append(getEstimatedSavingsPercentage()).append(",");
        if (getImplementationEffort() != null)
            sb.append("ImplementationEffort: ").append(getImplementationEffort()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getRecommendationLookbackPeriodInDays() != null)
            sb.append("RecommendationLookbackPeriodInDays: ").append(getRecommendationLookbackPeriodInDays()).append(",");
        if (getRecommendedResourceSummary() != null)
            sb.append("RecommendedResourceSummary: ").append(getRecommendedResourceSummary()).append(",");
        if (getRecommendedResourceType() != null)
            sb.append("RecommendedResourceType: ").append(getRecommendedResourceType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getRestartNeeded() != null)
            sb.append("RestartNeeded: ").append(getRestartNeeded()).append(",");
        if (getRollbackPossible() != null)
            sb.append("RollbackPossible: ").append(getRollbackPossible()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getCurrentResourceSummary() == null ^ this.getCurrentResourceSummary() == null)
            return false;
        if (other.getCurrentResourceSummary() != null && other.getCurrentResourceSummary().equals(this.getCurrentResourceSummary()) == false)
            return false;
        if (other.getCurrentResourceType() == null ^ this.getCurrentResourceType() == null)
            return false;
        if (other.getCurrentResourceType() != null && other.getCurrentResourceType().equals(this.getCurrentResourceType()) == false)
            return false;
        if (other.getEstimatedMonthlyCost() == null ^ this.getEstimatedMonthlyCost() == null)
            return false;
        if (other.getEstimatedMonthlyCost() != null && other.getEstimatedMonthlyCost().equals(this.getEstimatedMonthlyCost()) == false)
            return false;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null && other.getEstimatedSavingsPercentage().equals(this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getImplementationEffort() == null ^ this.getImplementationEffort() == null)
            return false;
        if (other.getImplementationEffort() != null && other.getImplementationEffort().equals(this.getImplementationEffort()) == false)
            return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null)
            return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getRecommendationLookbackPeriodInDays() == null ^ this.getRecommendationLookbackPeriodInDays() == null)
            return false;
        if (other.getRecommendationLookbackPeriodInDays() != null
                && other.getRecommendationLookbackPeriodInDays().equals(this.getRecommendationLookbackPeriodInDays()) == false)
            return false;
        if (other.getRecommendedResourceSummary() == null ^ this.getRecommendedResourceSummary() == null)
            return false;
        if (other.getRecommendedResourceSummary() != null && other.getRecommendedResourceSummary().equals(this.getRecommendedResourceSummary()) == false)
            return false;
        if (other.getRecommendedResourceType() == null ^ this.getRecommendedResourceType() == null)
            return false;
        if (other.getRecommendedResourceType() != null && other.getRecommendedResourceType().equals(this.getRecommendedResourceType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getRestartNeeded() == null ^ this.getRestartNeeded() == null)
            return false;
        if (other.getRestartNeeded() != null && other.getRestartNeeded().equals(this.getRestartNeeded()) == false)
            return false;
        if (other.getRollbackPossible() == null ^ this.getRollbackPossible() == null)
            return false;
        if (other.getRollbackPossible() != null && other.getRollbackPossible().equals(this.getRollbackPossible()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getCurrentResourceSummary() == null) ? 0 : getCurrentResourceSummary().hashCode());
        hashCode = prime * hashCode + ((getCurrentResourceType() == null) ? 0 : getCurrentResourceType().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlyCost() == null) ? 0 : getEstimatedMonthlyCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getImplementationEffort() == null) ? 0 : getImplementationEffort().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationLookbackPeriodInDays() == null) ? 0 : getRecommendationLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getRecommendedResourceSummary() == null) ? 0 : getRecommendedResourceSummary().hashCode());
        hashCode = prime * hashCode + ((getRecommendedResourceType() == null) ? 0 : getRecommendedResourceType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getRestartNeeded() == null) ? 0 : getRestartNeeded().hashCode());
        hashCode = prime * hashCode + ((getRollbackPossible() == null) ? 0 : getRollbackPossible().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
