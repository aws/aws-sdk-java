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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboardVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDashboardVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about each version of the dashboard.
     * </p>
     */
    private java.util.List<DashboardVersionSummary> dashboardVersionSummaryList;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A structure that contains information about each version of the dashboard.
     * </p>
     * 
     * @return A structure that contains information about each version of the dashboard.
     */

    public java.util.List<DashboardVersionSummary> getDashboardVersionSummaryList() {
        return dashboardVersionSummaryList;
    }

    /**
     * <p>
     * A structure that contains information about each version of the dashboard.
     * </p>
     * 
     * @param dashboardVersionSummaryList
     *        A structure that contains information about each version of the dashboard.
     */

    public void setDashboardVersionSummaryList(java.util.Collection<DashboardVersionSummary> dashboardVersionSummaryList) {
        if (dashboardVersionSummaryList == null) {
            this.dashboardVersionSummaryList = null;
            return;
        }

        this.dashboardVersionSummaryList = new java.util.ArrayList<DashboardVersionSummary>(dashboardVersionSummaryList);
    }

    /**
     * <p>
     * A structure that contains information about each version of the dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardVersionSummaryList(java.util.Collection)} or
     * {@link #withDashboardVersionSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dashboardVersionSummaryList
     *        A structure that contains information about each version of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardVersionsResult withDashboardVersionSummaryList(DashboardVersionSummary... dashboardVersionSummaryList) {
        if (this.dashboardVersionSummaryList == null) {
            setDashboardVersionSummaryList(new java.util.ArrayList<DashboardVersionSummary>(dashboardVersionSummaryList.length));
        }
        for (DashboardVersionSummary ele : dashboardVersionSummaryList) {
            this.dashboardVersionSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains information about each version of the dashboard.
     * </p>
     * 
     * @param dashboardVersionSummaryList
     *        A structure that contains information about each version of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardVersionsResult withDashboardVersionSummaryList(java.util.Collection<DashboardVersionSummary> dashboardVersionSummaryList) {
        setDashboardVersionSummaryList(dashboardVersionSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardVersionsResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardVersionsResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getDashboardVersionSummaryList() != null)
            sb.append("DashboardVersionSummaryList: ").append(getDashboardVersionSummaryList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDashboardVersionsResult == false)
            return false;
        ListDashboardVersionsResult other = (ListDashboardVersionsResult) obj;
        if (other.getDashboardVersionSummaryList() == null ^ this.getDashboardVersionSummaryList() == null)
            return false;
        if (other.getDashboardVersionSummaryList() != null && other.getDashboardVersionSummaryList().equals(this.getDashboardVersionSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardVersionSummaryList() == null) ? 0 : getDashboardVersionSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public ListDashboardVersionsResult clone() {
        try {
            return (ListDashboardVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
