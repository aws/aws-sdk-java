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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectedQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the membership in the collaboration.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A filter on the status of the protected query.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum size of the results that is returned per call. Service chooses a default if it has not been set.
     * Service can return a nextToken even if the maximum results has not been met.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for the membership in the collaboration.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for the membership in the collaboration.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for the membership in the collaboration.
     * </p>
     * 
     * @return The identifier for the membership in the collaboration.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for the membership in the collaboration.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for the membership in the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter on the status of the protected query.
     * </p>
     * 
     * @param status
     *        A filter on the status of the protected query.
     * @see ProtectedQueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A filter on the status of the protected query.
     * </p>
     * 
     * @return A filter on the status of the protected query.
     * @see ProtectedQueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A filter on the status of the protected query.
     * </p>
     * 
     * @param status
     *        A filter on the status of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ListProtectedQueriesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A filter on the status of the protected query.
     * </p>
     * 
     * @param status
     *        A filter on the status of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ListProtectedQueriesRequest withStatus(ProtectedQueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call. Service chooses a default if it has not been set.
     * Service can return a nextToken even if the maximum results has not been met.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the results that is returned per call. Service chooses a default if it has not been
     *        set. Service can return a nextToken even if the maximum results has not been met.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call. Service chooses a default if it has not been set.
     * Service can return a nextToken even if the maximum results has not been met.
     * </p>
     * 
     * @return The maximum size of the results that is returned per call. Service chooses a default if it has not been
     *         set. Service can return a nextToken even if the maximum results has not been met.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call. Service chooses a default if it has not been set.
     * Service can return a nextToken even if the maximum results has not been met.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the results that is returned per call. Service chooses a default if it has not been
     *        set. Service can return a nextToken even if the maximum results has not been met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProtectedQueriesRequest == false)
            return false;
        ListProtectedQueriesRequest other = (ListProtectedQueriesRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectedQueriesRequest clone() {
        return (ListProtectedQueriesRequest) super.clone();
    }

}
