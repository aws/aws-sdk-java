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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The overview of owned organizations presented as a list of organization summaries.
     * </p>
     */
    private java.util.List<OrganizationSummary> organizationSummaries;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The overview of owned organizations presented as a list of organization summaries.
     * </p>
     * 
     * @return The overview of owned organizations presented as a list of organization summaries.
     */

    public java.util.List<OrganizationSummary> getOrganizationSummaries() {
        return organizationSummaries;
    }

    /**
     * <p>
     * The overview of owned organizations presented as a list of organization summaries.
     * </p>
     * 
     * @param organizationSummaries
     *        The overview of owned organizations presented as a list of organization summaries.
     */

    public void setOrganizationSummaries(java.util.Collection<OrganizationSummary> organizationSummaries) {
        if (organizationSummaries == null) {
            this.organizationSummaries = null;
            return;
        }

        this.organizationSummaries = new java.util.ArrayList<OrganizationSummary>(organizationSummaries);
    }

    /**
     * <p>
     * The overview of owned organizations presented as a list of organization summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationSummaries(java.util.Collection)} or
     * {@link #withOrganizationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationSummaries
     *        The overview of owned organizations presented as a list of organization summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationsResult withOrganizationSummaries(OrganizationSummary... organizationSummaries) {
        if (this.organizationSummaries == null) {
            setOrganizationSummaries(new java.util.ArrayList<OrganizationSummary>(organizationSummaries.length));
        }
        for (OrganizationSummary ele : organizationSummaries) {
            this.organizationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The overview of owned organizations presented as a list of organization summaries.
     * </p>
     * 
     * @param organizationSummaries
     *        The overview of owned organizations presented as a list of organization summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationsResult withOrganizationSummaries(java.util.Collection<OrganizationSummary> organizationSummaries) {
        setOrganizationSummaries(organizationSummaries);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationsResult withNextToken(String nextToken) {
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
        if (getOrganizationSummaries() != null)
            sb.append("OrganizationSummaries: ").append(getOrganizationSummaries()).append(",");
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

        if (obj instanceof ListOrganizationsResult == false)
            return false;
        ListOrganizationsResult other = (ListOrganizationsResult) obj;
        if (other.getOrganizationSummaries() == null ^ this.getOrganizationSummaries() == null)
            return false;
        if (other.getOrganizationSummaries() != null && other.getOrganizationSummaries().equals(this.getOrganizationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationSummaries() == null) ? 0 : getOrganizationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationsResult clone() {
        try {
            return (ListOrganizationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
