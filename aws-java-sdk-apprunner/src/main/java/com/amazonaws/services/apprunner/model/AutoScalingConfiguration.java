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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an AWS App Runner automatic scaling configuration resource. Multiple revisions of a configuration have the
 * same <code>AutoScalingConfigurationName</code> and different <code>AutoScalingConfigurationRevision</code> values.
 * </p>
 * <p>
 * A higher <code>MinSize</code> increases the spread of your App Runner service over more Availability Zones in the AWS
 * Region. The tradeoff is a higher minimal cost.
 * </p>
 * <p>
 * A lower <code>MaxSize</code> controls your cost. The tradeoff is lower responsiveness during peak demand.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AutoScalingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingConfiguration implements Serializable, Cloneable, StructuredPojo {

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
     * <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     * </p>
     */
    private Integer autoScalingConfigurationRevision;
    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * </p>
     */
    private Boolean latest;
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
     * The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     * exceeds this limit, App Runner scales the service up.
     * </p>
     */
    private Integer maxConcurrency;
    /**
     * <p>
     * The minimum number of instances that App Runner provisions for a service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The time when the auto scaling configuration was created. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date deletedAt;

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

    public AutoScalingConfiguration withAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
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

    public AutoScalingConfiguration withAutoScalingConfigurationName(String autoScalingConfigurationName) {
        setAutoScalingConfigurationName(autoScalingConfigurationName);
        return this;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param autoScalingConfigurationRevision
     *        The revision of this auto scaling configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     */

    public void setAutoScalingConfigurationRevision(Integer autoScalingConfigurationRevision) {
        this.autoScalingConfigurationRevision = autoScalingConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @return The revision of this auto scaling configuration. It's unique among all the active configurations (
     *         <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     */

    public Integer getAutoScalingConfigurationRevision() {
        return this.autoScalingConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this auto scaling configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     * </p>
     * 
     * @param autoScalingConfigurationRevision
     *        The revision of this auto scaling configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>AutoScalingConfigurationName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withAutoScalingConfigurationRevision(Integer autoScalingConfigurationRevision) {
        setAutoScalingConfigurationRevision(autoScalingConfigurationRevision);
        return this;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * </p>
     * 
     * @param latest
     *        It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *        configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     */

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * </p>
     * 
     * @return It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *         configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     */

    public Boolean getLatest() {
        return this.latest;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * </p>
     * 
     * @param latest
     *        It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *        configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withLatest(Boolean latest) {
        setLatest(latest);
        return this;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     * </p>
     * 
     * @return It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *         configurations that share the same <code>Name</code>. It's set to <code>false</code> otherwise.
     */

    public Boolean isLatest() {
        return this.latest;
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

    public AutoScalingConfiguration withStatus(String status) {
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

    public AutoScalingConfiguration withStatus(AutoScalingConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     * exceeds this limit, App Runner scales the service up.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     *        exceeds this limit, App Runner scales the service up.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     * exceeds this limit, App Runner scales the service up.
     * </p>
     * 
     * @return The maximum number of concurrent requests that an instance processes. If the number of concurrent
     *         requests exceeds this limit, App Runner scales the service up.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     * exceeds this limit, App Runner scales the service up.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent requests that an instance processes. If the number of concurrent requests
     *        exceeds this limit, App Runner scales the service up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for a service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that App Runner provisions for a service. The service always has at least
     *        <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *        (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *        quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *        only the active subset.</p>
     *        <p>
     *        App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *        same capacity for both old and new code.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for a service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * 
     * @return The minimum number of instances that App Runner provisions for a service. The service always has at least
     *         <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *         (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *         quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *         only the active subset.</p>
     *         <p>
     *         App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *         same capacity for both old and new code.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for a service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that App Runner provisions for a service. The service always has at least
     *        <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *        (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *        quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *        only the active subset.</p>
     *        <p>
     *        App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *        same capacity for both old and new code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances
     *        actively serve traffic for your service.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * 
     * @return The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances
     *         actively serve traffic for your service.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that a service scales up to. At most <code>MaxSize</code> instances
     *        actively serve traffic for your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
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

    public AutoScalingConfiguration withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
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
        if (getAutoScalingConfigurationArn() != null)
            sb.append("AutoScalingConfigurationArn: ").append(getAutoScalingConfigurationArn()).append(",");
        if (getAutoScalingConfigurationName() != null)
            sb.append("AutoScalingConfigurationName: ").append(getAutoScalingConfigurationName()).append(",");
        if (getAutoScalingConfigurationRevision() != null)
            sb.append("AutoScalingConfigurationRevision: ").append(getAutoScalingConfigurationRevision()).append(",");
        if (getLatest() != null)
            sb.append("Latest: ").append(getLatest()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingConfiguration == false)
            return false;
        AutoScalingConfiguration other = (AutoScalingConfiguration) obj;
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
        if (other.getLatest() == null ^ this.getLatest() == null)
            return false;
        if (other.getLatest() != null && other.getLatest().equals(this.getLatest()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
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
        hashCode = prime * hashCode + ((getLatest() == null) ? 0 : getLatest().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingConfiguration clone() {
        try {
            return (AutoScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.AutoScalingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
