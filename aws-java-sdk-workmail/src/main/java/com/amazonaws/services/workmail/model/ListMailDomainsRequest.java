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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMailDomainsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization for which to list domains.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The WorkMail organization for which to list domains.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which to list domains.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which to list domains.
     * </p>
     * 
     * @return The WorkMail organization for which to list domains.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which to list domains.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which to list domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The first call does not require a token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The first call does not require a token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The first call does not require a token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsRequest withNextToken(String nextToken) {
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
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

        if (obj instanceof ListMailDomainsRequest == false)
            return false;
        ListMailDomainsRequest other = (ListMailDomainsRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMailDomainsRequest clone() {
        return (ListMailDomainsRequest) super.clone();
    }

}
