/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableManagementCidrRangesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR
     * notation (that is, specify the range as an IPv4 CIDR block).
     * </p>
     */
    private String managementCidrRangeConstraint;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR
     * notation (that is, specify the range as an IPv4 CIDR block).
     * </p>
     * 
     * @param managementCidrRangeConstraint
     *        The IP address range to search. Specify an IP address range that is compatible with your network and in
     *        CIDR notation (that is, specify the range as an IPv4 CIDR block).
     */

    public void setManagementCidrRangeConstraint(String managementCidrRangeConstraint) {
        this.managementCidrRangeConstraint = managementCidrRangeConstraint;
    }

    /**
     * <p>
     * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR
     * notation (that is, specify the range as an IPv4 CIDR block).
     * </p>
     * 
     * @return The IP address range to search. Specify an IP address range that is compatible with your network and in
     *         CIDR notation (that is, specify the range as an IPv4 CIDR block).
     */

    public String getManagementCidrRangeConstraint() {
        return this.managementCidrRangeConstraint;
    }

    /**
     * <p>
     * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR
     * notation (that is, specify the range as an IPv4 CIDR block).
     * </p>
     * 
     * @param managementCidrRangeConstraint
     *        The IP address range to search. Specify an IP address range that is compatible with your network and in
     *        CIDR notation (that is, specify the range as an IPv4 CIDR block).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesRequest withManagementCidrRangeConstraint(String managementCidrRangeConstraint) {
        setManagementCidrRangeConstraint(managementCidrRangeConstraint);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesRequest withNextToken(String nextToken) {
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
        if (getManagementCidrRangeConstraint() != null)
            sb.append("ManagementCidrRangeConstraint: ").append(getManagementCidrRangeConstraint()).append(",");
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

        if (obj instanceof ListAvailableManagementCidrRangesRequest == false)
            return false;
        ListAvailableManagementCidrRangesRequest other = (ListAvailableManagementCidrRangesRequest) obj;
        if (other.getManagementCidrRangeConstraint() == null ^ this.getManagementCidrRangeConstraint() == null)
            return false;
        if (other.getManagementCidrRangeConstraint() != null
                && other.getManagementCidrRangeConstraint().equals(this.getManagementCidrRangeConstraint()) == false)
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

        hashCode = prime * hashCode + ((getManagementCidrRangeConstraint() == null) ? 0 : getManagementCidrRangeConstraint().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableManagementCidrRangesRequest clone() {
        return (ListAvailableManagementCidrRangesRequest) super.clone();
    }

}
