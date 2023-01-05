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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListSavingsPlansPurchaseRecommendationGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSavingsPlansPurchaseRecommendationGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the recommendation generation.
     * </p>
     */
    private String generationStatus;
    /**
     * <p>
     * The IDs for each specific recommendation.
     * </p>
     */
    private java.util.List<String> recommendationIds;
    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The status of the recommendation generation.
     * </p>
     * 
     * @param generationStatus
     *        The status of the recommendation generation.
     * @see GenerationStatus
     */

    public void setGenerationStatus(String generationStatus) {
        this.generationStatus = generationStatus;
    }

    /**
     * <p>
     * The status of the recommendation generation.
     * </p>
     * 
     * @return The status of the recommendation generation.
     * @see GenerationStatus
     */

    public String getGenerationStatus() {
        return this.generationStatus;
    }

    /**
     * <p>
     * The status of the recommendation generation.
     * </p>
     * 
     * @param generationStatus
     *        The status of the recommendation generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withGenerationStatus(String generationStatus) {
        setGenerationStatus(generationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the recommendation generation.
     * </p>
     * 
     * @param generationStatus
     *        The status of the recommendation generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withGenerationStatus(GenerationStatus generationStatus) {
        this.generationStatus = generationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The IDs for each specific recommendation.
     * </p>
     * 
     * @return The IDs for each specific recommendation.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * The IDs for each specific recommendation.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for each specific recommendation.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * The IDs for each specific recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for each specific recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for each specific recommendation.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for each specific recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
        return this;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @param pageSize
     *        The number of recommendations that you want returned in a single response object.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @return The number of recommendations that you want returned in a single response object.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @param pageSize
     *        The number of recommendations that you want returned in a single response object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getGenerationStatus() != null)
            sb.append("GenerationStatus: ").append(getGenerationStatus()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSavingsPlansPurchaseRecommendationGenerationRequest == false)
            return false;
        ListSavingsPlansPurchaseRecommendationGenerationRequest other = (ListSavingsPlansPurchaseRecommendationGenerationRequest) obj;
        if (other.getGenerationStatus() == null ^ this.getGenerationStatus() == null)
            return false;
        if (other.getGenerationStatus() != null && other.getGenerationStatus().equals(this.getGenerationStatus()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationStatus() == null) ? 0 : getGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSavingsPlansPurchaseRecommendationGenerationRequest clone() {
        return (ListSavingsPlansPurchaseRecommendationGenerationRequest) super.clone();
    }

}
