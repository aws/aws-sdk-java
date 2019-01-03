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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListDashboards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDashboardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The
     * maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     * </p>
     */
    private String dashboardNamePrefix;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The
     * maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     * </p>
     * 
     * @param dashboardNamePrefix
     *        If you specify this parameter, only the dashboards with names starting with the specified string are
     *        listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     */

    public void setDashboardNamePrefix(String dashboardNamePrefix) {
        this.dashboardNamePrefix = dashboardNamePrefix;
    }

    /**
     * <p>
     * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The
     * maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     * </p>
     * 
     * @return If you specify this parameter, only the dashboards with names starting with the specified string are
     *         listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     */

    public String getDashboardNamePrefix() {
        return this.dashboardNamePrefix;
    }

    /**
     * <p>
     * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The
     * maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     * </p>
     * 
     * @param dashboardNamePrefix
     *        If you specify this parameter, only the dashboards with names starting with the specified string are
     *        listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsRequest withDashboardNamePrefix(String dashboardNamePrefix) {
        setDashboardNamePrefix(dashboardNamePrefix);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashboardsRequest withNextToken(String nextToken) {
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
        if (getDashboardNamePrefix() != null)
            sb.append("DashboardNamePrefix: ").append(getDashboardNamePrefix()).append(",");
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

        if (obj instanceof ListDashboardsRequest == false)
            return false;
        ListDashboardsRequest other = (ListDashboardsRequest) obj;
        if (other.getDashboardNamePrefix() == null ^ this.getDashboardNamePrefix() == null)
            return false;
        if (other.getDashboardNamePrefix() != null && other.getDashboardNamePrefix().equals(this.getDashboardNamePrefix()) == false)
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

        hashCode = prime * hashCode + ((getDashboardNamePrefix() == null) ? 0 : getDashboardNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDashboardsRequest clone() {
        return (ListDashboardsRequest) super.clone();
    }

}
