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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListAppMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppMonitorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain information about the returned app monitors.
     * </p>
     */
    private java.util.List<AppMonitorSummary> appMonitorSummaries;
    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that contain information about the returned app monitors.
     * </p>
     * 
     * @return An array of structures that contain information about the returned app monitors.
     */

    public java.util.List<AppMonitorSummary> getAppMonitorSummaries() {
        return appMonitorSummaries;
    }

    /**
     * <p>
     * An array of structures that contain information about the returned app monitors.
     * </p>
     * 
     * @param appMonitorSummaries
     *        An array of structures that contain information about the returned app monitors.
     */

    public void setAppMonitorSummaries(java.util.Collection<AppMonitorSummary> appMonitorSummaries) {
        if (appMonitorSummaries == null) {
            this.appMonitorSummaries = null;
            return;
        }

        this.appMonitorSummaries = new java.util.ArrayList<AppMonitorSummary>(appMonitorSummaries);
    }

    /**
     * <p>
     * An array of structures that contain information about the returned app monitors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppMonitorSummaries(java.util.Collection)} or {@link #withAppMonitorSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param appMonitorSummaries
     *        An array of structures that contain information about the returned app monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppMonitorsResult withAppMonitorSummaries(AppMonitorSummary... appMonitorSummaries) {
        if (this.appMonitorSummaries == null) {
            setAppMonitorSummaries(new java.util.ArrayList<AppMonitorSummary>(appMonitorSummaries.length));
        }
        for (AppMonitorSummary ele : appMonitorSummaries) {
            this.appMonitorSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain information about the returned app monitors.
     * </p>
     * 
     * @param appMonitorSummaries
     *        An array of structures that contain information about the returned app monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppMonitorsResult withAppMonitorSummaries(java.util.Collection<AppMonitorSummary> appMonitorSummaries) {
        setAppMonitorSummaries(appMonitorSummaries);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppMonitorsResult withNextToken(String nextToken) {
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
        if (getAppMonitorSummaries() != null)
            sb.append("AppMonitorSummaries: ").append(getAppMonitorSummaries()).append(",");
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

        if (obj instanceof ListAppMonitorsResult == false)
            return false;
        ListAppMonitorsResult other = (ListAppMonitorsResult) obj;
        if (other.getAppMonitorSummaries() == null ^ this.getAppMonitorSummaries() == null)
            return false;
        if (other.getAppMonitorSummaries() != null && other.getAppMonitorSummaries().equals(this.getAppMonitorSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAppMonitorSummaries() == null) ? 0 : getAppMonitorSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppMonitorsResult clone() {
        try {
            return (ListAppMonitorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
