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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * After the last update of the Recommendation
     * </p>
     */
    private java.util.Date afterLastUpdatedAt;
    /**
     * <p>
     * The aws service associated with the Recommendation
     * </p>
     */
    private String awsService;
    /**
     * <p>
     * Before the last update of the Recommendation
     * </p>
     */
    private java.util.Date beforeLastUpdatedAt;
    /**
     * <p>
     * The check identifier of the Recommendation
     * </p>
     */
    private String checkIdentifier;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The pillar of the Recommendation
     * </p>
     */
    private String pillar;
    /**
     * <p>
     * The source of the Recommendation
     * </p>
     */
    private String source;
    /**
     * <p>
     * The status of the Recommendation
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the Recommendation
     * </p>
     */
    private String type;

    /**
     * <p>
     * After the last update of the Recommendation
     * </p>
     * 
     * @param afterLastUpdatedAt
     *        After the last update of the Recommendation
     */

    public void setAfterLastUpdatedAt(java.util.Date afterLastUpdatedAt) {
        this.afterLastUpdatedAt = afterLastUpdatedAt;
    }

    /**
     * <p>
     * After the last update of the Recommendation
     * </p>
     * 
     * @return After the last update of the Recommendation
     */

    public java.util.Date getAfterLastUpdatedAt() {
        return this.afterLastUpdatedAt;
    }

    /**
     * <p>
     * After the last update of the Recommendation
     * </p>
     * 
     * @param afterLastUpdatedAt
     *        After the last update of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withAfterLastUpdatedAt(java.util.Date afterLastUpdatedAt) {
        setAfterLastUpdatedAt(afterLastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The aws service associated with the Recommendation
     * </p>
     * 
     * @param awsService
     *        The aws service associated with the Recommendation
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The aws service associated with the Recommendation
     * </p>
     * 
     * @return The aws service associated with the Recommendation
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * The aws service associated with the Recommendation
     * </p>
     * 
     * @param awsService
     *        The aws service associated with the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * Before the last update of the Recommendation
     * </p>
     * 
     * @param beforeLastUpdatedAt
     *        Before the last update of the Recommendation
     */

    public void setBeforeLastUpdatedAt(java.util.Date beforeLastUpdatedAt) {
        this.beforeLastUpdatedAt = beforeLastUpdatedAt;
    }

    /**
     * <p>
     * Before the last update of the Recommendation
     * </p>
     * 
     * @return Before the last update of the Recommendation
     */

    public java.util.Date getBeforeLastUpdatedAt() {
        return this.beforeLastUpdatedAt;
    }

    /**
     * <p>
     * Before the last update of the Recommendation
     * </p>
     * 
     * @param beforeLastUpdatedAt
     *        Before the last update of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withBeforeLastUpdatedAt(java.util.Date beforeLastUpdatedAt) {
        setBeforeLastUpdatedAt(beforeLastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The check identifier of the Recommendation
     * </p>
     * 
     * @param checkIdentifier
     *        The check identifier of the Recommendation
     */

    public void setCheckIdentifier(String checkIdentifier) {
        this.checkIdentifier = checkIdentifier;
    }

    /**
     * <p>
     * The check identifier of the Recommendation
     * </p>
     * 
     * @return The check identifier of the Recommendation
     */

    public String getCheckIdentifier() {
        return this.checkIdentifier;
    }

    /**
     * <p>
     * The check identifier of the Recommendation
     * </p>
     * 
     * @param checkIdentifier
     *        The check identifier of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withCheckIdentifier(String checkIdentifier) {
        setCheckIdentifier(checkIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The pillar of the Recommendation
     * </p>
     * 
     * @param pillar
     *        The pillar of the Recommendation
     * @see RecommendationPillar
     */

    public void setPillar(String pillar) {
        this.pillar = pillar;
    }

    /**
     * <p>
     * The pillar of the Recommendation
     * </p>
     * 
     * @return The pillar of the Recommendation
     * @see RecommendationPillar
     */

    public String getPillar() {
        return this.pillar;
    }

    /**
     * <p>
     * The pillar of the Recommendation
     * </p>
     * 
     * @param pillar
     *        The pillar of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public ListOrganizationRecommendationsRequest withPillar(String pillar) {
        setPillar(pillar);
        return this;
    }

    /**
     * <p>
     * The pillar of the Recommendation
     * </p>
     * 
     * @param pillar
     *        The pillar of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public ListOrganizationRecommendationsRequest withPillar(RecommendationPillar pillar) {
        this.pillar = pillar.toString();
        return this;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @see RecommendationSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @return The source of the Recommendation
     * @see RecommendationSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public ListOrganizationRecommendationsRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public ListOrganizationRecommendationsRequest withSource(RecommendationSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The status of the Recommendation
     * </p>
     * 
     * @param status
     *        The status of the Recommendation
     * @see RecommendationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Recommendation
     * </p>
     * 
     * @return The status of the Recommendation
     * @see RecommendationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Recommendation
     * </p>
     * 
     * @param status
     *        The status of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public ListOrganizationRecommendationsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Recommendation
     * </p>
     * 
     * @param status
     *        The status of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public ListOrganizationRecommendationsRequest withStatus(RecommendationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the Recommendation
     * </p>
     * 
     * @param type
     *        The type of the Recommendation
     * @see RecommendationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the Recommendation
     * </p>
     * 
     * @return The type of the Recommendation
     * @see RecommendationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the Recommendation
     * </p>
     * 
     * @param type
     *        The type of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public ListOrganizationRecommendationsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the Recommendation
     * </p>
     * 
     * @param type
     *        The type of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public ListOrganizationRecommendationsRequest withType(RecommendationType type) {
        this.type = type.toString();
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
        if (getAfterLastUpdatedAt() != null)
            sb.append("AfterLastUpdatedAt: ").append(getAfterLastUpdatedAt()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getBeforeLastUpdatedAt() != null)
            sb.append("BeforeLastUpdatedAt: ").append(getBeforeLastUpdatedAt()).append(",");
        if (getCheckIdentifier() != null)
            sb.append("CheckIdentifier: ").append(getCheckIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPillar() != null)
            sb.append("Pillar: ").append(getPillar()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationRecommendationsRequest == false)
            return false;
        ListOrganizationRecommendationsRequest other = (ListOrganizationRecommendationsRequest) obj;
        if (other.getAfterLastUpdatedAt() == null ^ this.getAfterLastUpdatedAt() == null)
            return false;
        if (other.getAfterLastUpdatedAt() != null && other.getAfterLastUpdatedAt().equals(this.getAfterLastUpdatedAt()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getBeforeLastUpdatedAt() == null ^ this.getBeforeLastUpdatedAt() == null)
            return false;
        if (other.getBeforeLastUpdatedAt() != null && other.getBeforeLastUpdatedAt().equals(this.getBeforeLastUpdatedAt()) == false)
            return false;
        if (other.getCheckIdentifier() == null ^ this.getCheckIdentifier() == null)
            return false;
        if (other.getCheckIdentifier() != null && other.getCheckIdentifier().equals(this.getCheckIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPillar() == null ^ this.getPillar() == null)
            return false;
        if (other.getPillar() != null && other.getPillar().equals(this.getPillar()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfterLastUpdatedAt() == null) ? 0 : getAfterLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getBeforeLastUpdatedAt() == null) ? 0 : getBeforeLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCheckIdentifier() == null) ? 0 : getCheckIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPillar() == null) ? 0 : getPillar().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationRecommendationsRequest clone() {
        return (ListOrganizationRecommendationsRequest) super.clone();
    }

}
