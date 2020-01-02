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
 * Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Dashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dashboard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dashboard ID.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A display name for the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version.
     * </p>
     */
    private DashboardVersion version;
    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last time that this dataset was published.
     * </p>
     */
    private java.util.Date lastPublishedTime;
    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

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

    public Dashboard withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

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

    public Dashboard withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @return A display name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dashboard withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version.
     * </p>
     * 
     * @param version
     *        Version.
     */

    public void setVersion(DashboardVersion version) {
        this.version = version;
    }

    /**
     * <p>
     * Version.
     * </p>
     * 
     * @return Version.
     */

    public DashboardVersion getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version.
     * </p>
     * 
     * @param version
     *        Version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dashboard withVersion(DashboardVersion version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dataset was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @return The time that this dataset was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dashboard withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last time that this dataset was published.
     * </p>
     * 
     * @param lastPublishedTime
     *        The last time that this dataset was published.
     */

    public void setLastPublishedTime(java.util.Date lastPublishedTime) {
        this.lastPublishedTime = lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dataset was published.
     * </p>
     * 
     * @return The last time that this dataset was published.
     */

    public java.util.Date getLastPublishedTime() {
        return this.lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dataset was published.
     * </p>
     * 
     * @param lastPublishedTime
     *        The last time that this dataset was published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dashboard withLastPublishedTime(java.util.Date lastPublishedTime) {
        setLastPublishedTime(lastPublishedTime);
        return this;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dataset was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @return The last time that this dataset was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dataset was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dashboard withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastPublishedTime() != null)
            sb.append("LastPublishedTime: ").append(getLastPublishedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dashboard == false)
            return false;
        Dashboard other = (Dashboard) obj;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastPublishedTime() == null ^ this.getLastPublishedTime() == null)
            return false;
        if (other.getLastPublishedTime() != null && other.getLastPublishedTime().equals(this.getLastPublishedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastPublishedTime() == null) ? 0 : getLastPublishedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Dashboard clone() {
        try {
            return (Dashboard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
