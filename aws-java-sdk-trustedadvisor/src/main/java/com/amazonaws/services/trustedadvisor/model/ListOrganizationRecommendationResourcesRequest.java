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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationRecommendationResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An account affected by this organization recommendation
     * </p>
     */
    private String affectedAccountId;
    /**
     * <p>
     * The exclusion status of the resource
     * </p>
     */
    private String exclusionStatus;
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
     * The AWS Organization organization's Recommendation identifier
     * </p>
     */
    private String organizationRecommendationIdentifier;
    /**
     * <p>
     * The AWS Region code of the resource
     * </p>
     */
    private String regionCode;
    /**
     * <p>
     * The status of the resource
     * </p>
     */
    private String status;

    /**
     * <p>
     * An account affected by this organization recommendation
     * </p>
     * 
     * @param affectedAccountId
     *        An account affected by this organization recommendation
     */

    public void setAffectedAccountId(String affectedAccountId) {
        this.affectedAccountId = affectedAccountId;
    }

    /**
     * <p>
     * An account affected by this organization recommendation
     * </p>
     * 
     * @return An account affected by this organization recommendation
     */

    public String getAffectedAccountId() {
        return this.affectedAccountId;
    }

    /**
     * <p>
     * An account affected by this organization recommendation
     * </p>
     * 
     * @param affectedAccountId
     *        An account affected by this organization recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationResourcesRequest withAffectedAccountId(String affectedAccountId) {
        setAffectedAccountId(affectedAccountId);
        return this;
    }

    /**
     * <p>
     * The exclusion status of the resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the resource
     * @see ExclusionStatus
     */

    public void setExclusionStatus(String exclusionStatus) {
        this.exclusionStatus = exclusionStatus;
    }

    /**
     * <p>
     * The exclusion status of the resource
     * </p>
     * 
     * @return The exclusion status of the resource
     * @see ExclusionStatus
     */

    public String getExclusionStatus() {
        return this.exclusionStatus;
    }

    /**
     * <p>
     * The exclusion status of the resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExclusionStatus
     */

    public ListOrganizationRecommendationResourcesRequest withExclusionStatus(String exclusionStatus) {
        setExclusionStatus(exclusionStatus);
        return this;
    }

    /**
     * <p>
     * The exclusion status of the resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExclusionStatus
     */

    public ListOrganizationRecommendationResourcesRequest withExclusionStatus(ExclusionStatus exclusionStatus) {
        this.exclusionStatus = exclusionStatus.toString();
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

    public ListOrganizationRecommendationResourcesRequest withMaxResults(Integer maxResults) {
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

    public ListOrganizationRecommendationResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The AWS Organization organization's Recommendation identifier
     * </p>
     * 
     * @param organizationRecommendationIdentifier
     *        The AWS Organization organization's Recommendation identifier
     */

    public void setOrganizationRecommendationIdentifier(String organizationRecommendationIdentifier) {
        this.organizationRecommendationIdentifier = organizationRecommendationIdentifier;
    }

    /**
     * <p>
     * The AWS Organization organization's Recommendation identifier
     * </p>
     * 
     * @return The AWS Organization organization's Recommendation identifier
     */

    public String getOrganizationRecommendationIdentifier() {
        return this.organizationRecommendationIdentifier;
    }

    /**
     * <p>
     * The AWS Organization organization's Recommendation identifier
     * </p>
     * 
     * @param organizationRecommendationIdentifier
     *        The AWS Organization organization's Recommendation identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationResourcesRequest withOrganizationRecommendationIdentifier(String organizationRecommendationIdentifier) {
        setOrganizationRecommendationIdentifier(organizationRecommendationIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS Region code of the resource
     * </p>
     * 
     * @param regionCode
     *        The AWS Region code of the resource
     */

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * <p>
     * The AWS Region code of the resource
     * </p>
     * 
     * @return The AWS Region code of the resource
     */

    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * <p>
     * The AWS Region code of the resource
     * </p>
     * 
     * @param regionCode
     *        The AWS Region code of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationResourcesRequest withRegionCode(String regionCode) {
        setRegionCode(regionCode);
        return this;
    }

    /**
     * <p>
     * The status of the resource
     * </p>
     * 
     * @param status
     *        The status of the resource
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resource
     * </p>
     * 
     * @return The status of the resource
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the resource
     * </p>
     * 
     * @param status
     *        The status of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ListOrganizationRecommendationResourcesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the resource
     * </p>
     * 
     * @param status
     *        The status of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ListOrganizationRecommendationResourcesRequest withStatus(ResourceStatus status) {
        this.status = status.toString();
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
        if (getAffectedAccountId() != null)
            sb.append("AffectedAccountId: ").append(getAffectedAccountId()).append(",");
        if (getExclusionStatus() != null)
            sb.append("ExclusionStatus: ").append(getExclusionStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrganizationRecommendationIdentifier() != null)
            sb.append("OrganizationRecommendationIdentifier: ").append(getOrganizationRecommendationIdentifier()).append(",");
        if (getRegionCode() != null)
            sb.append("RegionCode: ").append(getRegionCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationRecommendationResourcesRequest == false)
            return false;
        ListOrganizationRecommendationResourcesRequest other = (ListOrganizationRecommendationResourcesRequest) obj;
        if (other.getAffectedAccountId() == null ^ this.getAffectedAccountId() == null)
            return false;
        if (other.getAffectedAccountId() != null && other.getAffectedAccountId().equals(this.getAffectedAccountId()) == false)
            return false;
        if (other.getExclusionStatus() == null ^ this.getExclusionStatus() == null)
            return false;
        if (other.getExclusionStatus() != null && other.getExclusionStatus().equals(this.getExclusionStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrganizationRecommendationIdentifier() == null ^ this.getOrganizationRecommendationIdentifier() == null)
            return false;
        if (other.getOrganizationRecommendationIdentifier() != null
                && other.getOrganizationRecommendationIdentifier().equals(this.getOrganizationRecommendationIdentifier()) == false)
            return false;
        if (other.getRegionCode() == null ^ this.getRegionCode() == null)
            return false;
        if (other.getRegionCode() != null && other.getRegionCode().equals(this.getRegionCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffectedAccountId() == null) ? 0 : getAffectedAccountId().hashCode());
        hashCode = prime * hashCode + ((getExclusionStatus() == null) ? 0 : getExclusionStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRecommendationIdentifier() == null) ? 0 : getOrganizationRecommendationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationRecommendationResourcesRequest clone() {
        return (ListOrganizationRecommendationResourcesRequest) super.clone();
    }

}
