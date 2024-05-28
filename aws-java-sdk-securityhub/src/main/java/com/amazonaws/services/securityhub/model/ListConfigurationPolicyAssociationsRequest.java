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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicyAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationPolicyAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>NextToken</code> value that's returned from a previous paginated
     * <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous response that returned
     * the <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of the
     * response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the specified
     * number of results in a single page and a <code>NextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListConfigurationPolicyAssociations</code> request with
     * the returned <code>NextToken</code> value. A valid range for <code>MaxResults</code> is between 1 and 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the Amazon
     * Resource Name (ARN) or universally unique identifier (UUID) of a configuration, <code>AssociationType</code>, or
     * <code>AssociationStatus</code>.
     * </p>
     */
    private AssociationFilters filters;

    /**
     * <p>
     * The <code>NextToken</code> value that's returned from a previous paginated
     * <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous response that returned
     * the <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that's returned from a previous paginated
     *        <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous response
     *        that returned the <code>NextToken</code> value. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that's returned from a previous paginated
     * <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous response that returned
     * the <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value that's returned from a previous paginated
     *         <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the
     *         results exceeded the value of that parameter. Pagination continues from the end of the previous response
     *         that returned the <code>NextToken</code> value. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that's returned from a previous paginated
     * <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous response that returned
     * the <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that's returned from a previous paginated
     *        <code>ListConfigurationPolicyAssociations</code> request where <code>MaxResults</code> was used but the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous response
     *        that returned the <code>NextToken</code> value. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of the
     * response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the specified
     * number of results in a single page and a <code>NextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListConfigurationPolicyAssociations</code> request with
     * the returned <code>NextToken</code> value. A valid range for <code>MaxResults</code> is between 1 and 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of
     *        the response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the
     *        specified number of results in a single page and a <code>NextToken</code> response element. You can see
     *        the remaining results of the initial request by sending another
     *        <code>ListConfigurationPolicyAssociations</code> request with the returned <code>NextToken</code> value. A
     *        valid range for <code>MaxResults</code> is between 1 and 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of the
     * response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the specified
     * number of results in a single page and a <code>NextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListConfigurationPolicyAssociations</code> request with
     * the returned <code>NextToken</code> value. A valid range for <code>MaxResults</code> is between 1 and 100.
     * </p>
     * 
     * @return The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of
     *         the response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the
     *         specified number of results in a single page and a <code>NextToken</code> response element. You can see
     *         the remaining results of the initial request by sending another
     *         <code>ListConfigurationPolicyAssociations</code> request with the returned <code>NextToken</code> value.
     *         A valid range for <code>MaxResults</code> is between 1 and 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of the
     * response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the specified
     * number of results in a single page and a <code>NextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListConfigurationPolicyAssociations</code> request with
     * the returned <code>NextToken</code> value. A valid range for <code>MaxResults</code> is between 1 and 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that's returned by <code>ListConfigurationPolicies</code> in each page of
     *        the response. When this parameter is used, <code>ListConfigurationPolicyAssociations</code> returns the
     *        specified number of results in a single page and a <code>NextToken</code> response element. You can see
     *        the remaining results of the initial request by sending another
     *        <code>ListConfigurationPolicyAssociations</code> request with the returned <code>NextToken</code> value. A
     *        valid range for <code>MaxResults</code> is between 1 and 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the Amazon
     * Resource Name (ARN) or universally unique identifier (UUID) of a configuration, <code>AssociationType</code>, or
     * <code>AssociationStatus</code>.
     * </p>
     * 
     * @param filters
     *        Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the
     *        Amazon Resource Name (ARN) or universally unique identifier (UUID) of a configuration,
     *        <code>AssociationType</code>, or <code>AssociationStatus</code>.
     */

    public void setFilters(AssociationFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the Amazon
     * Resource Name (ARN) or universally unique identifier (UUID) of a configuration, <code>AssociationType</code>, or
     * <code>AssociationStatus</code>.
     * </p>
     * 
     * @return Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by
     *         the Amazon Resource Name (ARN) or universally unique identifier (UUID) of a configuration,
     *         <code>AssociationType</code>, or <code>AssociationStatus</code>.
     */

    public AssociationFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the Amazon
     * Resource Name (ARN) or universally unique identifier (UUID) of a configuration, <code>AssociationType</code>, or
     * <code>AssociationStatus</code>.
     * </p>
     * 
     * @param filters
     *        Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the
     *        Amazon Resource Name (ARN) or universally unique identifier (UUID) of a configuration,
     *        <code>AssociationType</code>, or <code>AssociationStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsRequest withFilters(AssociationFilters filters) {
        setFilters(filters);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationPolicyAssociationsRequest == false)
            return false;
        ListConfigurationPolicyAssociationsRequest other = (ListConfigurationPolicyAssociationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationPolicyAssociationsRequest clone() {
        return (ListConfigurationPolicyAssociationsRequest) super.clone();
    }

}
