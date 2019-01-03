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
 * <p>
 * Represents a specific dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DashboardEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardEntry implements Serializable, Cloneable {

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
     */
    private String dashboardArn;
    /**
     * <p>
     * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number
     * is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The size of the dashboard, in bytes.
     * </p>
     */
    private Long size;

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

    public DashboardEntry withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
        return this;
    }

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

    public DashboardEntry withDashboardArn(String dashboardArn) {
        setDashboardArn(dashboardArn);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number
     * is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param lastModified
     *        The time stamp of when the dashboard was last modified, either by an API call or through the console. This
     *        number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number
     * is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The time stamp of when the dashboard was last modified, either by an API call or through the console.
     *         This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number
     * is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param lastModified
     *        The time stamp of when the dashboard was last modified, either by an API call or through the console. This
     *        number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardEntry withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The size of the dashboard, in bytes.
     * </p>
     * 
     * @param size
     *        The size of the dashboard, in bytes.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the dashboard, in bytes.
     * </p>
     * 
     * @return The size of the dashboard, in bytes.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the dashboard, in bytes.
     * </p>
     * 
     * @param size
     *        The size of the dashboard, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardEntry withSize(Long size) {
        setSize(size);
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
        if (getDashboardArn() != null)
            sb.append("DashboardArn: ").append(getDashboardArn()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardEntry == false)
            return false;
        DashboardEntry other = (DashboardEntry) obj;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        if (other.getDashboardArn() == null ^ this.getDashboardArn() == null)
            return false;
        if (other.getDashboardArn() != null && other.getDashboardArn().equals(this.getDashboardArn()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getDashboardArn() == null) ? 0 : getDashboardArn().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public DashboardEntry clone() {
        try {
            return (DashboardEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
