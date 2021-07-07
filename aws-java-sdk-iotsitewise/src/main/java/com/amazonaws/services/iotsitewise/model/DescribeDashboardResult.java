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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     */
    private String dashboardArn;
    /**
     * <p>
     * The name of the dashboard.
     * </p>
     */
    private String dashboardName;
    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The dashboard's description.
     * </p>
     */
    private String dashboardDescription;
    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String dashboardDefinition;
    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date dashboardCreationDate;
    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date dashboardLastUpdateDate;

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * 
     * @return The ID of the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * 
     * @param dashboardArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        dashboard, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     */

    public void setDashboardArn(String dashboardArn) {
        this.dashboardArn = dashboardArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         dashboard, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     */

    public String getDashboardArn() {
        return this.dashboardArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * 
     * @param dashboardArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        dashboard, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardArn(String dashboardArn) {
        setDashboardArn(dashboardArn);
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

    public DescribeDashboardResult withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
        return this;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * 
     * @param projectId
     *        The ID of the project that the dashboard is in.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * 
     * @return The ID of the project that the dashboard is in.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * 
     * @param projectId
     *        The ID of the project that the dashboard is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * 
     * @param dashboardDescription
     *        The dashboard's description.
     */

    public void setDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * 
     * @return The dashboard's description.
     */

    public String getDashboardDescription() {
        return this.dashboardDescription;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * 
     * @param dashboardDescription
     *        The dashboard's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardDescription(String dashboardDescription) {
        setDashboardDescription(dashboardDescription);
        return this;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The dashboard's definition JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The dashboard's definition JSON literal. For detailed information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *         >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getDashboardDefinition() {
        return this.dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The dashboard's definition JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardDefinition(String dashboardDefinition) {
        setDashboardDefinition(dashboardDefinition);
        return this;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     * 
     * @param dashboardCreationDate
     *        The date the dashboard was created, in Unix epoch time.
     */

    public void setDashboardCreationDate(java.util.Date dashboardCreationDate) {
        this.dashboardCreationDate = dashboardCreationDate;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the dashboard was created, in Unix epoch time.
     */

    public java.util.Date getDashboardCreationDate() {
        return this.dashboardCreationDate;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     * 
     * @param dashboardCreationDate
     *        The date the dashboard was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardCreationDate(java.util.Date dashboardCreationDate) {
        setDashboardCreationDate(dashboardCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     * 
     * @param dashboardLastUpdateDate
     *        The date the dashboard was last updated, in Unix epoch time.
     */

    public void setDashboardLastUpdateDate(java.util.Date dashboardLastUpdateDate) {
        this.dashboardLastUpdateDate = dashboardLastUpdateDate;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the dashboard was last updated, in Unix epoch time.
     */

    public java.util.Date getDashboardLastUpdateDate() {
        return this.dashboardLastUpdateDate;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     * 
     * @param dashboardLastUpdateDate
     *        The date the dashboard was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardResult withDashboardLastUpdateDate(java.util.Date dashboardLastUpdateDate) {
        setDashboardLastUpdateDate(dashboardLastUpdateDate);
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
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getDashboardArn() != null)
            sb.append("DashboardArn: ").append(getDashboardArn()).append(",");
        if (getDashboardName() != null)
            sb.append("DashboardName: ").append(getDashboardName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getDashboardDescription() != null)
            sb.append("DashboardDescription: ").append(getDashboardDescription()).append(",");
        if (getDashboardDefinition() != null)
            sb.append("DashboardDefinition: ").append(getDashboardDefinition()).append(",");
        if (getDashboardCreationDate() != null)
            sb.append("DashboardCreationDate: ").append(getDashboardCreationDate()).append(",");
        if (getDashboardLastUpdateDate() != null)
            sb.append("DashboardLastUpdateDate: ").append(getDashboardLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDashboardResult == false)
            return false;
        DescribeDashboardResult other = (DescribeDashboardResult) obj;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getDashboardArn() == null ^ this.getDashboardArn() == null)
            return false;
        if (other.getDashboardArn() != null && other.getDashboardArn().equals(this.getDashboardArn()) == false)
            return false;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getDashboardDescription() == null ^ this.getDashboardDescription() == null)
            return false;
        if (other.getDashboardDescription() != null && other.getDashboardDescription().equals(this.getDashboardDescription()) == false)
            return false;
        if (other.getDashboardDefinition() == null ^ this.getDashboardDefinition() == null)
            return false;
        if (other.getDashboardDefinition() != null && other.getDashboardDefinition().equals(this.getDashboardDefinition()) == false)
            return false;
        if (other.getDashboardCreationDate() == null ^ this.getDashboardCreationDate() == null)
            return false;
        if (other.getDashboardCreationDate() != null && other.getDashboardCreationDate().equals(this.getDashboardCreationDate()) == false)
            return false;
        if (other.getDashboardLastUpdateDate() == null ^ this.getDashboardLastUpdateDate() == null)
            return false;
        if (other.getDashboardLastUpdateDate() != null && other.getDashboardLastUpdateDate().equals(this.getDashboardLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getDashboardArn() == null) ? 0 : getDashboardArn().hashCode());
        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getDashboardDescription() == null) ? 0 : getDashboardDescription().hashCode());
        hashCode = prime * hashCode + ((getDashboardDefinition() == null) ? 0 : getDashboardDefinition().hashCode());
        hashCode = prime * hashCode + ((getDashboardCreationDate() == null) ? 0 : getDashboardCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDashboardLastUpdateDate() == null) ? 0 : getDashboardLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDashboardResult clone() {
        try {
            return (DescribeDashboardResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
