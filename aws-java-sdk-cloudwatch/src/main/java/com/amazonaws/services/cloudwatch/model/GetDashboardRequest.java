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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dashboard to be described.
     * </p>
     */
    private String dashboardName;

    /**
     * <p>
     * The name of the dashboard to be described.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard to be described.
     */

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard to be described.
     * </p>
     * 
     * @return The name of the dashboard to be described.
     */

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard to be described.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardRequest withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
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
        if (getDashboardName() != null)
            sb.append("DashboardName: ").append(getDashboardName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashboardRequest == false)
            return false;
        GetDashboardRequest other = (GetDashboardRequest) obj;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        return hashCode;
    }

    @Override
    public GetDashboardRequest clone() {
        return (GetDashboardRequest) super.clone();
    }

}
