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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationRecommendationAccountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An account affected by this organization recommendation
     * </p>
     */
    private String affectedAccountId;
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
     * The Recommendation identifier
     * </p>
     */
    private String organizationRecommendationIdentifier;

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

    public ListOrganizationRecommendationAccountsRequest withAffectedAccountId(String affectedAccountId) {
        setAffectedAccountId(affectedAccountId);
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

    public ListOrganizationRecommendationAccountsRequest withMaxResults(Integer maxResults) {
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

    public ListOrganizationRecommendationAccountsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @param organizationRecommendationIdentifier
     *        The Recommendation identifier
     */

    public void setOrganizationRecommendationIdentifier(String organizationRecommendationIdentifier) {
        this.organizationRecommendationIdentifier = organizationRecommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @return The Recommendation identifier
     */

    public String getOrganizationRecommendationIdentifier() {
        return this.organizationRecommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @param organizationRecommendationIdentifier
     *        The Recommendation identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationAccountsRequest withOrganizationRecommendationIdentifier(String organizationRecommendationIdentifier) {
        setOrganizationRecommendationIdentifier(organizationRecommendationIdentifier);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrganizationRecommendationIdentifier() != null)
            sb.append("OrganizationRecommendationIdentifier: ").append(getOrganizationRecommendationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationRecommendationAccountsRequest == false)
            return false;
        ListOrganizationRecommendationAccountsRequest other = (ListOrganizationRecommendationAccountsRequest) obj;
        if (other.getAffectedAccountId() == null ^ this.getAffectedAccountId() == null)
            return false;
        if (other.getAffectedAccountId() != null && other.getAffectedAccountId().equals(this.getAffectedAccountId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffectedAccountId() == null) ? 0 : getAffectedAccountId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRecommendationIdentifier() == null) ? 0 : getOrganizationRecommendationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationRecommendationAccountsRequest clone() {
        return (ListOrganizationRecommendationAccountsRequest) super.clone();
    }

}
