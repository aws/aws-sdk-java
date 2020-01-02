/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListContributorInsights" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContributorInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     */
    private java.util.List<ContributorInsightsSummary> contributorInsightsSummaries;
    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * 
     * @return A list of ContributorInsightsSummary.
     */

    public java.util.List<ContributorInsightsSummary> getContributorInsightsSummaries() {
        return contributorInsightsSummaries;
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * 
     * @param contributorInsightsSummaries
     *        A list of ContributorInsightsSummary.
     */

    public void setContributorInsightsSummaries(java.util.Collection<ContributorInsightsSummary> contributorInsightsSummaries) {
        if (contributorInsightsSummaries == null) {
            this.contributorInsightsSummaries = null;
            return;
        }

        this.contributorInsightsSummaries = new java.util.ArrayList<ContributorInsightsSummary>(contributorInsightsSummaries);
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributorInsightsSummaries(java.util.Collection)} or
     * {@link #withContributorInsightsSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contributorInsightsSummaries
     *        A list of ContributorInsightsSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContributorInsightsResult withContributorInsightsSummaries(ContributorInsightsSummary... contributorInsightsSummaries) {
        if (this.contributorInsightsSummaries == null) {
            setContributorInsightsSummaries(new java.util.ArrayList<ContributorInsightsSummary>(contributorInsightsSummaries.length));
        }
        for (ContributorInsightsSummary ele : contributorInsightsSummaries) {
            this.contributorInsightsSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * 
     * @param contributorInsightsSummaries
     *        A list of ContributorInsightsSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContributorInsightsResult withContributorInsightsSummaries(java.util.Collection<ContributorInsightsSummary> contributorInsightsSummaries) {
        setContributorInsightsSummaries(contributorInsightsSummaries);
        return this;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     * 
     * @param nextToken
     *        A token to go to the next page if there is one.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     * 
     * @return A token to go to the next page if there is one.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     * 
     * @param nextToken
     *        A token to go to the next page if there is one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContributorInsightsResult withNextToken(String nextToken) {
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
        if (getContributorInsightsSummaries() != null)
            sb.append("ContributorInsightsSummaries: ").append(getContributorInsightsSummaries()).append(",");
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

        if (obj instanceof ListContributorInsightsResult == false)
            return false;
        ListContributorInsightsResult other = (ListContributorInsightsResult) obj;
        if (other.getContributorInsightsSummaries() == null ^ this.getContributorInsightsSummaries() == null)
            return false;
        if (other.getContributorInsightsSummaries() != null && other.getContributorInsightsSummaries().equals(this.getContributorInsightsSummaries()) == false)
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

        hashCode = prime * hashCode + ((getContributorInsightsSummaries() == null) ? 0 : getContributorInsightsSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContributorInsightsResult clone() {
        try {
            return (ListContributorInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
