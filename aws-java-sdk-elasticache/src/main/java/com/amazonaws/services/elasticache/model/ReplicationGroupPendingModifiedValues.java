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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ReplicationGroupPendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationGroupPendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     */
    private String primaryClusterId;
    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     */
    private String automaticFailoverStatus;
    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     */
    private ReshardingStatus resharding;
    /**
     * <p>
     * The auth token status
     * </p>
     */
    private String authTokenStatus;
    /**
     * <p>
     * The user groups being modified.
     * </p>
     */
    private UserGroupsUpdateStatus userGroups;
    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration> logDeliveryConfigurations;

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @param primaryClusterId
     *        The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or
     *        during the next maintenance window.
     */

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @return The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified),
     *         or during the next maintenance window.
     */

    public String getPrimaryClusterId() {
        return this.primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @param primaryClusterId
     *        The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or
     *        during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withPrimaryClusterId(String primaryClusterId) {
        setPrimaryClusterId(primaryClusterId);
        return this;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of automatic failover for this Redis replication group.
     * @see PendingAutomaticFailoverStatus
     */

    public void setAutomaticFailoverStatus(String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @return Indicates the status of automatic failover for this Redis replication group.
     * @see PendingAutomaticFailoverStatus
     */

    public String getAutomaticFailoverStatus() {
        return this.automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of automatic failover for this Redis replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PendingAutomaticFailoverStatus
     */

    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(String automaticFailoverStatus) {
        setAutomaticFailoverStatus(automaticFailoverStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of automatic failover for this Redis replication group.
     * @see PendingAutomaticFailoverStatus
     */

    public void setAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        withAutomaticFailoverStatus(automaticFailoverStatus);
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of automatic failover for this Redis replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PendingAutomaticFailoverStatus
     */

    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     */

    public void setResharding(ReshardingStatus resharding) {
        this.resharding = resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @return The status of an online resharding operation.
     */

    public ReshardingStatus getResharding() {
        return this.resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withResharding(ReshardingStatus resharding) {
        setResharding(resharding);
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @see AuthTokenUpdateStatus
     */

    public void setAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @return The auth token status
     * @see AuthTokenUpdateStatus
     */

    public String getAuthTokenStatus() {
        return this.authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTokenUpdateStatus
     */

    public ReplicationGroupPendingModifiedValues withAuthTokenStatus(String authTokenStatus) {
        setAuthTokenStatus(authTokenStatus);
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @see AuthTokenUpdateStatus
     */

    public void setAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        withAuthTokenStatus(authTokenStatus);
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTokenUpdateStatus
     */

    public ReplicationGroupPendingModifiedValues withAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
        return this;
    }

    /**
     * <p>
     * The user groups being modified.
     * </p>
     * 
     * @param userGroups
     *        The user groups being modified.
     */

    public void setUserGroups(UserGroupsUpdateStatus userGroups) {
        this.userGroups = userGroups;
    }

    /**
     * <p>
     * The user groups being modified.
     * </p>
     * 
     * @return The user groups being modified.
     */

    public UserGroupsUpdateStatus getUserGroups() {
        return this.userGroups;
    }

    /**
     * <p>
     * The user groups being modified.
     * </p>
     * 
     * @param userGroups
     *        The user groups being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withUserGroups(UserGroupsUpdateStatus userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @return The log delivery configurations being modified
     */

    public java.util.List<PendingLogDeliveryConfiguration> getLogDeliveryConfigurations() {
        if (logDeliveryConfigurations == null) {
            logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>();
        }
        return logDeliveryConfigurations;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     */

    public void setLogDeliveryConfigurations(java.util.Collection<PendingLogDeliveryConfiguration> logDeliveryConfigurations) {
        if (logDeliveryConfigurations == null) {
            this.logDeliveryConfigurations = null;
            return;
        }

        this.logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>(logDeliveryConfigurations);
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDeliveryConfigurations(java.util.Collection)} or
     * {@link #withLogDeliveryConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withLogDeliveryConfigurations(PendingLogDeliveryConfiguration... logDeliveryConfigurations) {
        if (this.logDeliveryConfigurations == null) {
            setLogDeliveryConfigurations(new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>(logDeliveryConfigurations.length));
        }
        for (PendingLogDeliveryConfiguration ele : logDeliveryConfigurations) {
            this.logDeliveryConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withLogDeliveryConfigurations(java.util.Collection<PendingLogDeliveryConfiguration> logDeliveryConfigurations) {
        setLogDeliveryConfigurations(logDeliveryConfigurations);
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
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: ").append(getPrimaryClusterId()).append(",");
        if (getAutomaticFailoverStatus() != null)
            sb.append("AutomaticFailoverStatus: ").append(getAutomaticFailoverStatus()).append(",");
        if (getResharding() != null)
            sb.append("Resharding: ").append(getResharding()).append(",");
        if (getAuthTokenStatus() != null)
            sb.append("AuthTokenStatus: ").append(getAuthTokenStatus()).append(",");
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups()).append(",");
        if (getLogDeliveryConfigurations() != null)
            sb.append("LogDeliveryConfigurations: ").append(getLogDeliveryConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroupPendingModifiedValues == false)
            return false;
        ReplicationGroupPendingModifiedValues other = (ReplicationGroupPendingModifiedValues) obj;
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverStatus() == null ^ this.getAutomaticFailoverStatus() == null)
            return false;
        if (other.getAutomaticFailoverStatus() != null && other.getAutomaticFailoverStatus().equals(this.getAutomaticFailoverStatus()) == false)
            return false;
        if (other.getResharding() == null ^ this.getResharding() == null)
            return false;
        if (other.getResharding() != null && other.getResharding().equals(this.getResharding()) == false)
            return false;
        if (other.getAuthTokenStatus() == null ^ this.getAuthTokenStatus() == null)
            return false;
        if (other.getAuthTokenStatus() != null && other.getAuthTokenStatus().equals(this.getAuthTokenStatus()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getLogDeliveryConfigurations() == null ^ this.getLogDeliveryConfigurations() == null)
            return false;
        if (other.getLogDeliveryConfigurations() != null && other.getLogDeliveryConfigurations().equals(this.getLogDeliveryConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailoverStatus() == null) ? 0 : getAutomaticFailoverStatus().hashCode());
        hashCode = prime * hashCode + ((getResharding() == null) ? 0 : getResharding().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenStatus() == null) ? 0 : getAuthTokenStatus().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfigurations() == null) ? 0 : getLogDeliveryConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroupPendingModifiedValues clone() {
        try {
            return (ReplicationGroupPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
