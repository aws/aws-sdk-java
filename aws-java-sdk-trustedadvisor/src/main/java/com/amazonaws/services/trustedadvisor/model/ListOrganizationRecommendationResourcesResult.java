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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationRecommendationResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of Recommendation Resources
     * </p>
     */
    private java.util.List<OrganizationRecommendationResourceSummary> organizationRecommendationResourceSummaries;

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

    public ListOrganizationRecommendationResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of Recommendation Resources
     * </p>
     * 
     * @return A list of Recommendation Resources
     */

    public java.util.List<OrganizationRecommendationResourceSummary> getOrganizationRecommendationResourceSummaries() {
        return organizationRecommendationResourceSummaries;
    }

    /**
     * <p>
     * A list of Recommendation Resources
     * </p>
     * 
     * @param organizationRecommendationResourceSummaries
     *        A list of Recommendation Resources
     */

    public void setOrganizationRecommendationResourceSummaries(
            java.util.Collection<OrganizationRecommendationResourceSummary> organizationRecommendationResourceSummaries) {
        if (organizationRecommendationResourceSummaries == null) {
            this.organizationRecommendationResourceSummaries = null;
            return;
        }

        this.organizationRecommendationResourceSummaries = new java.util.ArrayList<OrganizationRecommendationResourceSummary>(
                organizationRecommendationResourceSummaries);
    }

    /**
     * <p>
     * A list of Recommendation Resources
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationRecommendationResourceSummaries(java.util.Collection)} or
     * {@link #withOrganizationRecommendationResourceSummaries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param organizationRecommendationResourceSummaries
     *        A list of Recommendation Resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationResourcesResult withOrganizationRecommendationResourceSummaries(
            OrganizationRecommendationResourceSummary... organizationRecommendationResourceSummaries) {
        if (this.organizationRecommendationResourceSummaries == null) {
            setOrganizationRecommendationResourceSummaries(new java.util.ArrayList<OrganizationRecommendationResourceSummary>(
                    organizationRecommendationResourceSummaries.length));
        }
        for (OrganizationRecommendationResourceSummary ele : organizationRecommendationResourceSummaries) {
            this.organizationRecommendationResourceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Recommendation Resources
     * </p>
     * 
     * @param organizationRecommendationResourceSummaries
     *        A list of Recommendation Resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationResourcesResult withOrganizationRecommendationResourceSummaries(
            java.util.Collection<OrganizationRecommendationResourceSummary> organizationRecommendationResourceSummaries) {
        setOrganizationRecommendationResourceSummaries(organizationRecommendationResourceSummaries);
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
        if (getOrganizationRecommendationResourceSummaries() != null)
            sb.append("OrganizationRecommendationResourceSummaries: ").append(getOrganizationRecommendationResourceSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationRecommendationResourcesResult == false)
            return false;
        ListOrganizationRecommendationResourcesResult other = (ListOrganizationRecommendationResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrganizationRecommendationResourceSummaries() == null ^ this.getOrganizationRecommendationResourceSummaries() == null)
            return false;
        if (other.getOrganizationRecommendationResourceSummaries() != null
                && other.getOrganizationRecommendationResourceSummaries().equals(this.getOrganizationRecommendationResourceSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationRecommendationResourceSummaries() == null) ? 0 : getOrganizationRecommendationResourceSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationRecommendationResourcesResult clone() {
        try {
            return (ListOrganizationRecommendationResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
