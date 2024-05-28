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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an App Runner automatic scaling configuration resource.
 * </p>
 * <p>
 * This type contains limited information about an auto scaling configuration. It includes only identification
 * information, without configuration details. It's returned by the <a>ListAutoScalingConfigurations</a> action.
 * Complete configuration information is returned by the <a>CreateAutoScalingConfiguration</a>,
 * <a>DescribeAutoScalingConfiguration</a>, and <a>DeleteAutoScalingConfiguration</a> actions using the
 * <a>AutoScalingConfiguration</a> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AutoScalingConfigurationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this auto scaling configuration.
     * </p>
     */
    private String autoScalingConfigurationArn;
    /**
     * <p>
     * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     */
    private String autoScalingConfigurationName;
    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     * </p>
     */
    private Integer autoScalingConfigurationRevision;
    /**
     * <p>
     * The current state of the auto scaling configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     * <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates no
     * services are associated.
     * </p>
     */
    private Boolean hasAssociatedService;
    /**
     * <p>
     * Indicates if this auto scaling configuration should be used as the default for a new App Runner service that does
     * not have an auto scaling configuration ARN specified during creation. Each account can have only one default
     * <code>AutoScalingConfiguration</code> per region. The default <code>AutoScalingConfiguration</code> can be any
     * revision under the same <code>AutoScalingConfigurationName</code>.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this auto scaling configuration.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of this auto scaling configuration.
     */

    public void setAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this auto scaling configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this auto scaling configuration.
     */

    public String getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this auto scaling configuration.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of this auto scaling configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        setAutoScalingConfigurationArn(autoScalingConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        The customer-provided auto scaling configuration name. It can be used in multiple revisions of a
     *        configuration.
     */

    public void setAutoScalingConfigurationName(String autoScalingConfigurationName) {
        this.autoScalingConfigurationName = autoScalingConfigurationName;
    }

    /**
     * <p>
     * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @return The customer-provided auto scaling configuration name. It can be used in multiple revisions of a
     *         configuration.
     */

    public String getAutoScalingConfigurationName() {
        return this.autoScalingConfigurationName;
    }

    /**
     * <p>
     * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        The customer-provided auto scaling configuration name. It can be used in multiple revisions of a
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withAutoScalingConfigurationName(String autoScalingConfigurationName) {
        setAutoScalingConfigurationName(autoScalingConfigurationName);
        return this;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param autoScalingConfigurationRevision
     *        The revision of this auto scaling configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     */

    public void setAutoScalingConfigurationRevision(Integer autoScalingConfigurationRevision) {
        this.autoScalingConfigurationRevision = autoScalingConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @return The revision of this auto scaling configuration. It's unique among all the active configurations (
     *         <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     */

    public Integer getAutoScalingConfigurationRevision() {
        return this.autoScalingConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param autoScalingConfigurationRevision
     *        The revision of this auto scaling configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) with the same <code>AutoScalingConfigurationName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withAutoScalingConfigurationRevision(Integer autoScalingConfigurationRevision) {
        setAutoScalingConfigurationRevision(autoScalingConfigurationRevision);
        return this;
    }

    /**
     * <p>
     * The current state of the auto scaling configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the auto scaling configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @see AutoScalingConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the auto scaling configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @return The current state of the auto scaling configuration. If the status of a configuration revision is
     *         <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *         removed some time after they are deleted.
     * @see AutoScalingConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the auto scaling configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the auto scaling configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingConfigurationStatus
     */

    public AutoScalingConfigurationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the auto scaling configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the auto scaling configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingConfigurationStatus
     */

    public AutoScalingConfigurationSummary withStatus(AutoScalingConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the auto scaling configuration was created. It's in Unix time stamp format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the auto scaling configuration was created. It's in Unix time stamp format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     * <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates no
     * services are associated.
     * </p>
     * 
     * @param hasAssociatedService
     *        Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     *        <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates
     *        no services are associated.
     */

    public void setHasAssociatedService(Boolean hasAssociatedService) {
        this.hasAssociatedService = hasAssociatedService;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     * <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates no
     * services are associated.
     * </p>
     * 
     * @return Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     *         <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates
     *         no services are associated.
     */

    public Boolean getHasAssociatedService() {
        return this.hasAssociatedService;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     * <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates no
     * services are associated.
     * </p>
     * 
     * @param hasAssociatedService
     *        Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     *        <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates
     *        no services are associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withHasAssociatedService(Boolean hasAssociatedService) {
        setHasAssociatedService(hasAssociatedService);
        return this;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     * <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates no
     * services are associated.
     * </p>
     * 
     * @return Indicates if this auto scaling configuration has an App Runner service associated with it. A value of
     *         <code>true</code> indicates one or more services are associated. A value of <code>false</code> indicates
     *         no services are associated.
     */

    public Boolean isHasAssociatedService() {
        return this.hasAssociatedService;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration should be used as the default for a new App Runner service that does
     * not have an auto scaling configuration ARN specified during creation. Each account can have only one default
     * <code>AutoScalingConfiguration</code> per region. The default <code>AutoScalingConfiguration</code> can be any
     * revision under the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param isDefault
     *        Indicates if this auto scaling configuration should be used as the default for a new App Runner service
     *        that does not have an auto scaling configuration ARN specified during creation. Each account can have only
     *        one default <code>AutoScalingConfiguration</code> per region. The default
     *        <code>AutoScalingConfiguration</code> can be any revision under the same
     *        <code>AutoScalingConfigurationName</code>.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration should be used as the default for a new App Runner service that does
     * not have an auto scaling configuration ARN specified during creation. Each account can have only one default
     * <code>AutoScalingConfiguration</code> per region. The default <code>AutoScalingConfiguration</code> can be any
     * revision under the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @return Indicates if this auto scaling configuration should be used as the default for a new App Runner service
     *         that does not have an auto scaling configuration ARN specified during creation. Each account can have
     *         only one default <code>AutoScalingConfiguration</code> per region. The default
     *         <code>AutoScalingConfiguration</code> can be any revision under the same
     *         <code>AutoScalingConfigurationName</code>.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration should be used as the default for a new App Runner service that does
     * not have an auto scaling configuration ARN specified during creation. Each account can have only one default
     * <code>AutoScalingConfiguration</code> per region. The default <code>AutoScalingConfiguration</code> can be any
     * revision under the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param isDefault
     *        Indicates if this auto scaling configuration should be used as the default for a new App Runner service
     *        that does not have an auto scaling configuration ARN specified during creation. Each account can have only
     *        one default <code>AutoScalingConfiguration</code> per region. The default
     *        <code>AutoScalingConfiguration</code> can be any revision under the same
     *        <code>AutoScalingConfigurationName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfigurationSummary withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Indicates if this auto scaling configuration should be used as the default for a new App Runner service that does
     * not have an auto scaling configuration ARN specified during creation. Each account can have only one default
     * <code>AutoScalingConfiguration</code> per region. The default <code>AutoScalingConfiguration</code> can be any
     * revision under the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @return Indicates if this auto scaling configuration should be used as the default for a new App Runner service
     *         that does not have an auto scaling configuration ARN specified during creation. Each account can have
     *         only one default <code>AutoScalingConfiguration</code> per region. The default
     *         <code>AutoScalingConfiguration</code> can be any revision under the same
     *         <code>AutoScalingConfigurationName</code>.
     */

    public Boolean isDefault() {
        return this.isDefault;
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
        if (getAutoScalingConfigurationArn() != null)
            sb.append("AutoScalingConfigurationArn: ").append(getAutoScalingConfigurationArn()).append(",");
        if (getAutoScalingConfigurationName() != null)
            sb.append("AutoScalingConfigurationName: ").append(getAutoScalingConfigurationName()).append(",");
        if (getAutoScalingConfigurationRevision() != null)
            sb.append("AutoScalingConfigurationRevision: ").append(getAutoScalingConfigurationRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getHasAssociatedService() != null)
            sb.append("HasAssociatedService: ").append(getHasAssociatedService()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingConfigurationSummary == false)
            return false;
        AutoScalingConfigurationSummary other = (AutoScalingConfigurationSummary) obj;
        if (other.getAutoScalingConfigurationArn() == null ^ this.getAutoScalingConfigurationArn() == null)
            return false;
        if (other.getAutoScalingConfigurationArn() != null && other.getAutoScalingConfigurationArn().equals(this.getAutoScalingConfigurationArn()) == false)
            return false;
        if (other.getAutoScalingConfigurationName() == null ^ this.getAutoScalingConfigurationName() == null)
            return false;
        if (other.getAutoScalingConfigurationName() != null && other.getAutoScalingConfigurationName().equals(this.getAutoScalingConfigurationName()) == false)
            return false;
        if (other.getAutoScalingConfigurationRevision() == null ^ this.getAutoScalingConfigurationRevision() == null)
            return false;
        if (other.getAutoScalingConfigurationRevision() != null
                && other.getAutoScalingConfigurationRevision().equals(this.getAutoScalingConfigurationRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getHasAssociatedService() == null ^ this.getHasAssociatedService() == null)
            return false;
        if (other.getHasAssociatedService() != null && other.getHasAssociatedService().equals(this.getHasAssociatedService()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingConfigurationArn() == null) ? 0 : getAutoScalingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfigurationName() == null) ? 0 : getAutoScalingConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfigurationRevision() == null) ? 0 : getAutoScalingConfigurationRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getHasAssociatedService() == null) ? 0 : getHasAssociatedService().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingConfigurationSummary clone() {
        try {
            return (AutoScalingConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.AutoScalingConfigurationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
