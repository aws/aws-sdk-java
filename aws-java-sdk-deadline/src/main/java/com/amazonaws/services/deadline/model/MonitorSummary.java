/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a monitor in Deadline Cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/MonitorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user name of the person that created the monitor.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The name of the monitor that displays on the Deadline Cloud console.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     * </p>
     */
    private String identityCenterApplicationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor users.
     * </p>
     */
    private String identityCenterInstanceArn;
    /**
     * <p>
     * The unique identifier for the monitor.
     * </p>
     */
    private String monitorId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to access
     * Deadline Cloud resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The subdomain used for the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     */
    private String subdomain;
    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user name of the person that last updated the monitor.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The complete URL of the monitor. The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The UNIX timestamp of the date and time that the monitor was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was created.
     * </p>
     * 
     * @return The UNIX timestamp of the date and time that the monitor was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The UNIX timestamp of the date and time that the monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user name of the person that created the monitor.
     * </p>
     * 
     * @param createdBy
     *        The user name of the person that created the monitor.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user name of the person that created the monitor.
     * </p>
     * 
     * @return The user name of the person that created the monitor.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user name of the person that created the monitor.
     * </p>
     * 
     * @param createdBy
     *        The user name of the person that created the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The name of the monitor that displays on the Deadline Cloud console.
     * </p>
     * 
     * @param displayName
     *        The name of the monitor that displays on the Deadline Cloud console.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the monitor that displays on the Deadline Cloud console.
     * </p>
     * 
     * @return The name of the monitor that displays on the Deadline Cloud console.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the monitor that displays on the Deadline Cloud console.
     * </p>
     * 
     * @param displayName
     *        The name of the monitor that displays on the Deadline Cloud console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     */

    public void setIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        this.identityCenterApplicationArn = identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     */

    public String getIdentityCenterApplicationArn() {
        return this.identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        setIdentityCenterApplicationArn(identityCenterApplicationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor users.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor
     *        users.
     */

    public void setIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        this.identityCenterInstanceArn = identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor users.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor
     *         users.
     */

    public String getIdentityCenterInstanceArn() {
        return this.identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor users.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for authenticating monitor
     *        users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        setIdentityCenterInstanceArn(identityCenterInstanceArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the monitor.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier for the monitor.
     */

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * <p>
     * The unique identifier for the monitor.
     * </p>
     * 
     * @return The unique identifier for the monitor.
     */

    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * <p>
     * The unique identifier for the monitor.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withMonitorId(String monitorId) {
        setMonitorId(monitorId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to access
     * Deadline Cloud resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to
     *        access Deadline Cloud resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to access
     * Deadline Cloud resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to
     *         access Deadline Cloud resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to access
     * Deadline Cloud resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role for the monitor. Users of the monitor use this role to
     *        access Deadline Cloud resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The subdomain used for the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param subdomain
     *        The subdomain used for the monitor URL. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * <p>
     * The subdomain used for the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @return The subdomain used for the monitor URL. The full URL of the monitor is
     *         subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public String getSubdomain() {
        return this.subdomain;
    }

    /**
     * <p>
     * The subdomain used for the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param subdomain
     *        The subdomain used for the monitor URL. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withSubdomain(String subdomain) {
        setSubdomain(subdomain);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The UNIX timestamp of the date and time that the monitor was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was last updated.
     * </p>
     * 
     * @return The UNIX timestamp of the date and time that the monitor was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The UNIX timestamp of the date and time that the monitor was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The UNIX timestamp of the date and time that the monitor was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user name of the person that last updated the monitor.
     * </p>
     * 
     * @param updatedBy
     *        The user name of the person that last updated the monitor.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user name of the person that last updated the monitor.
     * </p>
     * 
     * @return The user name of the person that last updated the monitor.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user name of the person that last updated the monitor.
     * </p>
     * 
     * @param updatedBy
     *        The user name of the person that last updated the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The complete URL of the monitor. The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param url
     *        The complete URL of the monitor. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The complete URL of the monitor. The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @return The complete URL of the monitor. The full URL of the monitor is
     *         subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The complete URL of the monitor. The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param url
     *        The complete URL of the monitor. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withUrl(String url) {
        setUrl(url);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIdentityCenterApplicationArn() != null)
            sb.append("IdentityCenterApplicationArn: ").append(getIdentityCenterApplicationArn()).append(",");
        if (getIdentityCenterInstanceArn() != null)
            sb.append("IdentityCenterInstanceArn: ").append(getIdentityCenterInstanceArn()).append(",");
        if (getMonitorId() != null)
            sb.append("MonitorId: ").append(getMonitorId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSubdomain() != null)
            sb.append("Subdomain: ").append(getSubdomain()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitorSummary == false)
            return false;
        MonitorSummary other = (MonitorSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIdentityCenterApplicationArn() == null ^ this.getIdentityCenterApplicationArn() == null)
            return false;
        if (other.getIdentityCenterApplicationArn() != null && other.getIdentityCenterApplicationArn().equals(this.getIdentityCenterApplicationArn()) == false)
            return false;
        if (other.getIdentityCenterInstanceArn() == null ^ this.getIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIdentityCenterInstanceArn() != null && other.getIdentityCenterInstanceArn().equals(this.getIdentityCenterInstanceArn()) == false)
            return false;
        if (other.getMonitorId() == null ^ this.getMonitorId() == null)
            return false;
        if (other.getMonitorId() != null && other.getMonitorId().equals(this.getMonitorId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSubdomain() == null ^ this.getSubdomain() == null)
            return false;
        if (other.getSubdomain() != null && other.getSubdomain().equals(this.getSubdomain()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterApplicationArn() == null) ? 0 : getIdentityCenterApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterInstanceArn() == null) ? 0 : getIdentityCenterInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorId() == null) ? 0 : getMonitorId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubdomain() == null) ? 0 : getSubdomain().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public MonitorSummary clone() {
        try {
            return (MonitorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.MonitorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
