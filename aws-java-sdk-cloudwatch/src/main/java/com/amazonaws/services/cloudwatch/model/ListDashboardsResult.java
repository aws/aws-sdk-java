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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListDashboards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDashboardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of matching dashboards.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DashboardEntry> dashboardEntries;
    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of matching dashboards.
     * </p>
     * 
     * @return The list of matching dashboards.
     */

    public java.util.List<DashboardEntry> getDashboardEntries() {
        if (dashboardEntries == null) {
            dashboardEntries = new com.amazonaws.internal.SdkInternalList<DashboardEntry>();
        }
        return dashboardEntries;
    }

    /**
     * <p>
     * The list of matching dashboards.
     * </p>
     * 
     * @param dashboardEntries
     *        The list of matching dashboards.
     */

    public void setDashboardEntries(java.util.Collection<DashboardEntry> dashboardEntries) {
        if (dashboardEntries == null) {
            this.dashboardEntries = null;
            return;
        }

        this.dashboardEntries = new com.amazonaws.internal.SdkInternalList<DashboardEntry>(dashboardEntries);
    }

    /**
     * <p>
     * The list of matching dashboards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardEntries(java.util.Collection)} or {@link #withDashboardEntries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dashboardEntries
     *        The list of matching dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsResult withDashboardEntries(DashboardEntry... dashboardEntries) {
        if (this.dashboardEntries == null) {
            setDashboardEntries(new com.amazonaws.internal.SdkInternalList<DashboardEntry>(dashboardEntries.length));
        }
        for (DashboardEntry ele : dashboardEntries) {
            this.dashboardEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of matching dashboards.
     * </p>
     * 
     * @param dashboardEntries
     *        The list of matching dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsResult withDashboardEntries(java.util.Collection<DashboardEntry> dashboardEntries) {
        setDashboardEntries(dashboardEntries);
        return this;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return The token that marks the start of the next batch of returned results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
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
        if (getDashboardEntries() != null)
            sb.append("DashboardEntries: ").append(getDashboardEntries()).append(",");
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
        if (other.getDashboardEntries() == null ^ this.getDashboardEntries() == null)
            return false;
        if (other.getDashboardEntries() != null && other.getDashboardEntries().equals(this.getDashboardEntries()) == false)
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

        hashCode = prime * hashCode + ((getDashboardEntries() == null) ? 0 : getDashboardEntries().hashCode());
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
