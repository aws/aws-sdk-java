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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteDashboards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDashboardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The dashboards to be deleted. This parameter is required.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dashboardNames;

    /**
     * <p>
     * The dashboards to be deleted. This parameter is required.
     * </p>
     * 
     * @return The dashboards to be deleted. This parameter is required.
     */

    public java.util.List<String> getDashboardNames() {
        if (dashboardNames == null) {
            dashboardNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dashboardNames;
    }

    /**
     * <p>
     * The dashboards to be deleted. This parameter is required.
     * </p>
     * 
     * @param dashboardNames
     *        The dashboards to be deleted. This parameter is required.
     */

    public void setDashboardNames(java.util.Collection<String> dashboardNames) {
        if (dashboardNames == null) {
            this.dashboardNames = null;
            return;
        }

        this.dashboardNames = new com.amazonaws.internal.SdkInternalList<String>(dashboardNames);
    }

    /**
     * <p>
     * The dashboards to be deleted. This parameter is required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardNames(java.util.Collection)} or {@link #withDashboardNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dashboardNames
     *        The dashboards to be deleted. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDashboardsRequest withDashboardNames(String... dashboardNames) {
        if (this.dashboardNames == null) {
            setDashboardNames(new com.amazonaws.internal.SdkInternalList<String>(dashboardNames.length));
        }
        for (String ele : dashboardNames) {
            this.dashboardNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dashboards to be deleted. This parameter is required.
     * </p>
     * 
     * @param dashboardNames
     *        The dashboards to be deleted. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDashboardsRequest withDashboardNames(java.util.Collection<String> dashboardNames) {
        setDashboardNames(dashboardNames);
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
        if (getDashboardNames() != null)
            sb.append("DashboardNames: ").append(getDashboardNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDashboardsRequest == false)
            return false;
        DeleteDashboardsRequest other = (DeleteDashboardsRequest) obj;
        if (other.getDashboardNames() == null ^ this.getDashboardNames() == null)
            return false;
        if (other.getDashboardNames() != null && other.getDashboardNames().equals(this.getDashboardNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardNames() == null) ? 0 : getDashboardNames().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDashboardsRequest clone() {
        return (DeleteDashboardsRequest) super.clone();
    }

}
