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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashboardResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     */
    private String dashboardArn;
    /**
     * <p>
     * The detailed information about the dashboard, including what widgets are included and their location on the
     * dashboard. For more information about the <code>DashboardBody</code> syntax, see
     * <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     */
    private String dashboardBody;
    /**
     * <p>
     * The name of the dashboard.
     * </p>
     */
    private String dashboardName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @param dashboardArn
     *        The Amazon Resource Name (ARN) of the dashboard.
     */

    public void setDashboardArn(String dashboardArn) {
        this.dashboardArn = dashboardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dashboard.
     */

    public String getDashboardArn() {
        return this.dashboardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dashboard.
     * </p>
     * 
     * @param dashboardArn
     *        The Amazon Resource Name (ARN) of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardResult withDashboardArn(String dashboardArn) {
        setDashboardArn(dashboardArn);
        return this;
    }

    /**
     * <p>
     * The detailed information about the dashboard, including what widgets are included and their location on the
     * dashboard. For more information about the <code>DashboardBody</code> syntax, see
     * <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @param dashboardBody
     *        The detailed information about the dashboard, including what widgets are included and their location on
     *        the dashboard. For more information about the <code>DashboardBody</code> syntax, see
     *        <a>CloudWatch-Dashboard-Body-Structure</a>.
     */

    public void setDashboardBody(String dashboardBody) {
        this.dashboardBody = dashboardBody;
    }

    /**
     * <p>
     * The detailed information about the dashboard, including what widgets are included and their location on the
     * dashboard. For more information about the <code>DashboardBody</code> syntax, see
     * <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @return The detailed information about the dashboard, including what widgets are included and their location on
     *         the dashboard. For more information about the <code>DashboardBody</code> syntax, see
     *         <a>CloudWatch-Dashboard-Body-Structure</a>.
     */

    public String getDashboardBody() {
        return this.dashboardBody;
    }

    /**
     * <p>
     * The detailed information about the dashboard, including what widgets are included and their location on the
     * dashboard. For more information about the <code>DashboardBody</code> syntax, see
     * <a>CloudWatch-Dashboard-Body-Structure</a>.
     * </p>
     * 
     * @param dashboardBody
     *        The detailed information about the dashboard, including what widgets are included and their location on
     *        the dashboard. For more information about the <code>DashboardBody</code> syntax, see
     *        <a>CloudWatch-Dashboard-Body-Structure</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardResult withDashboardBody(String dashboardBody) {
        setDashboardBody(dashboardBody);
        return this;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard.
     */

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * 
     * @return The name of the dashboard.
     */

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        The name of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardResult withDashboardName(String dashboardName) {
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
        if (getDashboardArn() != null)
            sb.append("DashboardArn: ").append(getDashboardArn()).append(",");
        if (getDashboardBody() != null)
            sb.append("DashboardBody: ").append(getDashboardBody()).append(",");
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

        if (obj instanceof GetDashboardResult == false)
            return false;
        GetDashboardResult other = (GetDashboardResult) obj;
        if (other.getDashboardArn() == null ^ this.getDashboardArn() == null)
            return false;
        if (other.getDashboardArn() != null && other.getDashboardArn().equals(this.getDashboardArn()) == false)
            return false;
        if (other.getDashboardBody() == null ^ this.getDashboardBody() == null)
            return false;
        if (other.getDashboardBody() != null && other.getDashboardBody().equals(this.getDashboardBody()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDashboardArn() == null) ? 0 : getDashboardArn().hashCode());
        hashCode = prime * hashCode + ((getDashboardBody() == null) ? 0 : getDashboardBody().hashCode());
        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        return hashCode;
    }

    @Override
    public GetDashboardResult clone() {
        try {
            return (GetDashboardResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
