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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard,
     * replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid
     * characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     * </p>
     */
    private String dashboardName;
    /**
     * <p>
     * The detailed information about the dashboard in JSON format, including the widgets to include and their location
     * on the dashboard. This parameter is required.
     * </p>
     * <p>
     * For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     */
    private String dashboardBody;

    /**
     * <p>
     * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard,
     * replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid
     * characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard. If a dashboard with this name already exists, this call modifies that
     *        dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is
     *        255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     */

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard,
     * replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid
     * characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     * </p>
     * 
     * @return The name of the dashboard. If a dashboard with this name already exists, this call modifies that
     *         dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is
     *         255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     */

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard,
     * replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid
     * characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard. If a dashboard with this name already exists, this call modifies that
     *        dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is
     *        255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDashboardRequest withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
        return this;
    }

    /**
     * <p>
     * The detailed information about the dashboard in JSON format, including the widgets to include and their location
     * on the dashboard. This parameter is required.
     * </p>
     * <p>
     * For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @param dashboardBody
     *        The detailed information about the dashboard in JSON format, including the widgets to include and their
     *        location on the dashboard. This parameter is required.</p>
     *        <p>
     *        For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     */

    public void setDashboardBody(String dashboardBody) {
        this.dashboardBody = dashboardBody;
    }

    /**
     * <p>
     * The detailed information about the dashboard in JSON format, including the widgets to include and their location
     * on the dashboard. This parameter is required.
     * </p>
     * <p>
     * For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @return The detailed information about the dashboard in JSON format, including the widgets to include and their
     *         location on the dashboard. This parameter is required.</p>
     *         <p>
     *         For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     */

    public String getDashboardBody() {
        return this.dashboardBody;
    }

    /**
     * <p>
     * The detailed information about the dashboard in JSON format, including the widgets to include and their location
     * on the dashboard. This parameter is required.
     * </p>
     * <p>
     * For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @param dashboardBody
     *        The detailed information about the dashboard in JSON format, including the widgets to include and their
     *        location on the dashboard. This parameter is required.</p>
     *        <p>
     *        For more information about the syntax, see <a>CloudWatch-Dashboard-Body-Structure</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDashboardRequest withDashboardBody(String dashboardBody) {
        setDashboardBody(dashboardBody);
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
            sb.append("DashboardName: ").append(getDashboardName()).append(",");
        if (getDashboardBody() != null)
            sb.append("DashboardBody: ").append(getDashboardBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDashboardRequest == false)
            return false;
        PutDashboardRequest other = (PutDashboardRequest) obj;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        if (other.getDashboardBody() == null ^ this.getDashboardBody() == null)
            return false;
        if (other.getDashboardBody() != null && other.getDashboardBody().equals(this.getDashboardBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getDashboardBody() == null) ? 0 : getDashboardBody().hashCode());
        return hashCode;
    }

    @Override
    public PutDashboardRequest clone() {
        return (PutDashboardRequest) super.clone();
    }

}
