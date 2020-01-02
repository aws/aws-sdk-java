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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dashboard summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Dashboard ID.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Published version number.
     * </p>
     */
    private Long publishedVersionNumber;
    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     */
    private java.util.Date lastPublishedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * 
     * @param dashboardId
     *        Dashboard ID.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * 
     * @return Dashboard ID.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * 
     * @param dashboardId
     *        Dashboard ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * 
     * @param name
     *        A display name for the dashboard.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * 
     * @return A display name for the dashboard.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * 
     * @param name
     *        A display name for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dashboard was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     * 
     * @return The time that this dashboard was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dashboard was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dashboard was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     * 
     * @return The last time that this dashboard was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dashboard was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * 
     * @param publishedVersionNumber
     *        Published version number.
     */

    public void setPublishedVersionNumber(Long publishedVersionNumber) {
        this.publishedVersionNumber = publishedVersionNumber;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * 
     * @return Published version number.
     */

    public Long getPublishedVersionNumber() {
        return this.publishedVersionNumber;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * 
     * @param publishedVersionNumber
     *        Published version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withPublishedVersionNumber(Long publishedVersionNumber) {
        setPublishedVersionNumber(publishedVersionNumber);
        return this;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     * 
     * @param lastPublishedTime
     *        The last time that this dashboard was published.
     */

    public void setLastPublishedTime(java.util.Date lastPublishedTime) {
        this.lastPublishedTime = lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     * 
     * @return The last time that this dashboard was published.
     */

    public java.util.Date getLastPublishedTime() {
        return this.lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     * 
     * @param lastPublishedTime
     *        The last time that this dashboard was published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSummary withLastPublishedTime(java.util.Date lastPublishedTime) {
        setLastPublishedTime(lastPublishedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getPublishedVersionNumber() != null)
            sb.append("PublishedVersionNumber: ").append(getPublishedVersionNumber()).append(",");
        if (getLastPublishedTime() != null)
            sb.append("LastPublishedTime: ").append(getLastPublishedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSummary == false)
            return false;
        DashboardSummary other = (DashboardSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getPublishedVersionNumber() == null ^ this.getPublishedVersionNumber() == null)
            return false;
        if (other.getPublishedVersionNumber() != null && other.getPublishedVersionNumber().equals(this.getPublishedVersionNumber()) == false)
            return false;
        if (other.getLastPublishedTime() == null ^ this.getLastPublishedTime() == null)
            return false;
        if (other.getLastPublishedTime() != null && other.getLastPublishedTime().equals(this.getLastPublishedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getPublishedVersionNumber() == null) ? 0 : getPublishedVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getLastPublishedTime() == null) ? 0 : getLastPublishedTime().hashCode());
        return hashCode;
    }

    @Override
    public DashboardSummary clone() {
        try {
            return (DashboardSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
