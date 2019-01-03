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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that shows the status of the Deliverability dashboard for your Amazon Pinpoint account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliverabilityDashboardOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the dashboard
     * is enabled.
     * </p>
     */
    private Boolean dashboardEnabled;

    /**
     * <p>
     * Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the dashboard
     * is enabled.
     * </p>
     * 
     * @param dashboardEnabled
     *        Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the
     *        dashboard is enabled.
     */

    public void setDashboardEnabled(Boolean dashboardEnabled) {
        this.dashboardEnabled = dashboardEnabled;
    }

    /**
     * <p>
     * Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the dashboard
     * is enabled.
     * </p>
     * 
     * @return Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the
     *         dashboard is enabled.
     */

    public Boolean getDashboardEnabled() {
        return this.dashboardEnabled;
    }

    /**
     * <p>
     * Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the dashboard
     * is enabled.
     * </p>
     * 
     * @param dashboardEnabled
     *        Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the
     *        dashboard is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withDashboardEnabled(Boolean dashboardEnabled) {
        setDashboardEnabled(dashboardEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the dashboard
     * is enabled.
     * </p>
     * 
     * @return Indicates whether the Deliverability dashboard is enabled. If the value is <code>true</code>, then the
     *         dashboard is enabled.
     */

    public Boolean isDashboardEnabled() {
        return this.dashboardEnabled;
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
        if (getDashboardEnabled() != null)
            sb.append("DashboardEnabled: ").append(getDashboardEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliverabilityDashboardOptionsResult == false)
            return false;
        GetDeliverabilityDashboardOptionsResult other = (GetDeliverabilityDashboardOptionsResult) obj;
        if (other.getDashboardEnabled() == null ^ this.getDashboardEnabled() == null)
            return false;
        if (other.getDashboardEnabled() != null && other.getDashboardEnabled().equals(this.getDashboardEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardEnabled() == null) ? 0 : getDashboardEnabled().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliverabilityDashboardOptionsResult clone() {
        try {
            return (GetDeliverabilityDashboardOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
