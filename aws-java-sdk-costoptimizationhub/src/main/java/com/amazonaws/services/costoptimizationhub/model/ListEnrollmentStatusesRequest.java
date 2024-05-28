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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnrollmentStatusesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID of a member account in the organization.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Indicates whether to return the enrollment status for the organization.
     * </p>
     */
    private Boolean includeOrganizationInfo;
    /**
     * <p>
     * The maximum number of objects that are returned for the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The account ID of a member account in the organization.
     * </p>
     * 
     * @param accountId
     *        The account ID of a member account in the organization.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of a member account in the organization.
     * </p>
     * 
     * @return The account ID of a member account in the organization.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of a member account in the organization.
     * </p>
     * 
     * @param accountId
     *        The account ID of a member account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the enrollment status for the organization.
     * </p>
     * 
     * @param includeOrganizationInfo
     *        Indicates whether to return the enrollment status for the organization.
     */

    public void setIncludeOrganizationInfo(Boolean includeOrganizationInfo) {
        this.includeOrganizationInfo = includeOrganizationInfo;
    }

    /**
     * <p>
     * Indicates whether to return the enrollment status for the organization.
     * </p>
     * 
     * @return Indicates whether to return the enrollment status for the organization.
     */

    public Boolean getIncludeOrganizationInfo() {
        return this.includeOrganizationInfo;
    }

    /**
     * <p>
     * Indicates whether to return the enrollment status for the organization.
     * </p>
     * 
     * @param includeOrganizationInfo
     *        Indicates whether to return the enrollment status for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesRequest withIncludeOrganizationInfo(Boolean includeOrganizationInfo) {
        setIncludeOrganizationInfo(includeOrganizationInfo);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the enrollment status for the organization.
     * </p>
     * 
     * @return Indicates whether to return the enrollment status for the organization.
     */

    public Boolean isIncludeOrganizationInfo() {
        return this.includeOrganizationInfo;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that are returned for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for the request.
     * </p>
     * 
     * @return The maximum number of objects that are returned for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that are returned for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that are returned for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListEnrollmentStatusesRequest withNextToken(String nextToken) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getIncludeOrganizationInfo() != null)
            sb.append("IncludeOrganizationInfo: ").append(getIncludeOrganizationInfo()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListEnrollmentStatusesRequest == false)
            return false;
        ListEnrollmentStatusesRequest other = (ListEnrollmentStatusesRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getIncludeOrganizationInfo() == null ^ this.getIncludeOrganizationInfo() == null)
            return false;
        if (other.getIncludeOrganizationInfo() != null && other.getIncludeOrganizationInfo().equals(this.getIncludeOrganizationInfo()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getIncludeOrganizationInfo() == null) ? 0 : getIncludeOrganizationInfo().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnrollmentStatusesRequest clone() {
        return (ListEnrollmentStatusesRequest) super.clone();
    }

}
