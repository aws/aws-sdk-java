/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListDashboards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDashboardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each dashboard in the project.
     * </p>
     */
    private java.util.List<DashboardSummary> dashboardSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each dashboard in the project.
     * </p>
     * 
     * @return A list that summarizes each dashboard in the project.
     */

    public java.util.List<DashboardSummary> getDashboardSummaries() {
        return dashboardSummaries;
    }

    /**
     * <p>
     * A list that summarizes each dashboard in the project.
     * </p>
     * 
     * @param dashboardSummaries
     *        A list that summarizes each dashboard in the project.
     */

    public void setDashboardSummaries(java.util.Collection<DashboardSummary> dashboardSummaries) {
        if (dashboardSummaries == null) {
            this.dashboardSummaries = null;
            return;
        }

        this.dashboardSummaries = new java.util.ArrayList<DashboardSummary>(dashboardSummaries);
    }

    /**
     * <p>
     * A list that summarizes each dashboard in the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardSummaries(java.util.Collection)} or {@link #withDashboardSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dashboardSummaries
     *        A list that summarizes each dashboard in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsResult withDashboardSummaries(DashboardSummary... dashboardSummaries) {
        if (this.dashboardSummaries == null) {
            setDashboardSummaries(new java.util.ArrayList<DashboardSummary>(dashboardSummaries.length));
        }
        for (DashboardSummary ele : dashboardSummaries) {
            this.dashboardSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each dashboard in the project.
     * </p>
     * 
     * @param dashboardSummaries
     *        A list that summarizes each dashboard in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsResult withDashboardSummaries(java.util.Collection<DashboardSummary> dashboardSummaries) {
        setDashboardSummaries(dashboardSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsResult withNextToken(String nextToken) {
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
        if (getDashboardSummaries() != null)
            sb.append("DashboardSummaries: ").append(getDashboardSummaries()).append(",");
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

        if (obj instanceof ListDashboardsResult == false)
            return false;
        ListDashboardsResult other = (ListDashboardsResult) obj;
        if (other.getDashboardSummaries() == null ^ this.getDashboardSummaries() == null)
            return false;
        if (other.getDashboardSummaries() != null && other.getDashboardSummaries().equals(this.getDashboardSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDashboardSummaries() == null) ? 0 : getDashboardSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDashboardsResult clone() {
        try {
            return (ListDashboardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
