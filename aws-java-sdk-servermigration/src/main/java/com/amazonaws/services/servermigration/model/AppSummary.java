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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/AppSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message related to the status of the application
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Replication status of the application.
     * </p>
     */
    private String replicationStatus;
    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     */
    private String replicationStatusMessage;
    /**
     * <p>
     * Timestamp of the application's most recent successful replication.
     * </p>
     */
    private java.util.Date latestReplicationTime;
    /**
     * <p>
     * Launch status of the application.
     * </p>
     */
    private String launchStatus;
    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     */
    private String launchStatusMessage;
    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     */
    private LaunchDetails launchDetails;
    /**
     * <p>
     * Time of creation of this application.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Timestamp of the application's creation.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * Number of server groups present in the application.
     * </p>
     */
    private Integer totalServerGroups;
    /**
     * <p>
     * Number of servers present in the application.
     * </p>
     */
    private Integer totalServers;

    /**
     * <p>
     * Unique ID of the application.
     * </p>
     * 
     * @param appId
     *        Unique ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique ID of the application.
     * </p>
     * 
     * @return Unique ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique ID of the application.
     * </p>
     * 
     * @param appId
     *        Unique ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param name
     *        Name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @return Name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param name
     *        Name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @param description
     *        Description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @return Description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @param description
     *        Description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @see AppStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @return Status of the application.
     * @see AppStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public AppSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public AppSummary withStatus(AppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @param statusMessage
     *        A message related to the status of the application
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @return A message related to the status of the application
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @param statusMessage
     *        A message related to the status of the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        Replication status of the application.
     * @see AppReplicationStatus
     */

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    /**
     * <p>
     * Replication status of the application.
     * </p>
     * 
     * @return Replication status of the application.
     * @see AppReplicationStatus
     */

    public String getReplicationStatus() {
        return this.replicationStatus;
    }

    /**
     * <p>
     * Replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        Replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationStatus
     */

    public AppSummary withReplicationStatus(String replicationStatus) {
        setReplicationStatus(replicationStatus);
        return this;
    }

    /**
     * <p>
     * Replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        Replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationStatus
     */

    public AppSummary withReplicationStatus(AppReplicationStatus replicationStatus) {
        this.replicationStatus = replicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @param replicationStatusMessage
     *        A message related to the replication status of the application.
     */

    public void setReplicationStatusMessage(String replicationStatusMessage) {
        this.replicationStatusMessage = replicationStatusMessage;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @return A message related to the replication status of the application.
     */

    public String getReplicationStatusMessage() {
        return this.replicationStatusMessage;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @param replicationStatusMessage
     *        A message related to the replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withReplicationStatusMessage(String replicationStatusMessage) {
        setReplicationStatusMessage(replicationStatusMessage);
        return this;
    }

    /**
     * <p>
     * Timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @param latestReplicationTime
     *        Timestamp of the application's most recent successful replication.
     */

    public void setLatestReplicationTime(java.util.Date latestReplicationTime) {
        this.latestReplicationTime = latestReplicationTime;
    }

    /**
     * <p>
     * Timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @return Timestamp of the application's most recent successful replication.
     */

    public java.util.Date getLatestReplicationTime() {
        return this.latestReplicationTime;
    }

    /**
     * <p>
     * Timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @param latestReplicationTime
     *        Timestamp of the application's most recent successful replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLatestReplicationTime(java.util.Date latestReplicationTime) {
        setLatestReplicationTime(latestReplicationTime);
        return this;
    }

    /**
     * <p>
     * Launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        Launch status of the application.
     * @see AppLaunchStatus
     */

    public void setLaunchStatus(String launchStatus) {
        this.launchStatus = launchStatus;
    }

    /**
     * <p>
     * Launch status of the application.
     * </p>
     * 
     * @return Launch status of the application.
     * @see AppLaunchStatus
     */

    public String getLaunchStatus() {
        return this.launchStatus;
    }

    /**
     * <p>
     * Launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        Launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchStatus
     */

    public AppSummary withLaunchStatus(String launchStatus) {
        setLaunchStatus(launchStatus);
        return this;
    }

    /**
     * <p>
     * Launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        Launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchStatus
     */

    public AppSummary withLaunchStatus(AppLaunchStatus launchStatus) {
        this.launchStatus = launchStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @param launchStatusMessage
     *        A message related to the launch status of the application.
     */

    public void setLaunchStatusMessage(String launchStatusMessage) {
        this.launchStatusMessage = launchStatusMessage;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @return A message related to the launch status of the application.
     */

    public String getLaunchStatusMessage() {
        return this.launchStatusMessage;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @param launchStatusMessage
     *        A message related to the launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLaunchStatusMessage(String launchStatusMessage) {
        setLaunchStatusMessage(launchStatusMessage);
        return this;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @param launchDetails
     *        Details about the latest launch of the application.
     */

    public void setLaunchDetails(LaunchDetails launchDetails) {
        this.launchDetails = launchDetails;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @return Details about the latest launch of the application.
     */

    public LaunchDetails getLaunchDetails() {
        return this.launchDetails;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @param launchDetails
     *        Details about the latest launch of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLaunchDetails(LaunchDetails launchDetails) {
        setLaunchDetails(launchDetails);
        return this;
    }

    /**
     * <p>
     * Time of creation of this application.
     * </p>
     * 
     * @param creationTime
     *        Time of creation of this application.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time of creation of this application.
     * </p>
     * 
     * @return Time of creation of this application.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time of creation of this application.
     * </p>
     * 
     * @param creationTime
     *        Time of creation of this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of the application's creation.
     * </p>
     * 
     * @param lastModified
     *        Timestamp of the application's creation.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Timestamp of the application's creation.
     * </p>
     * 
     * @return Timestamp of the application's creation.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * Timestamp of the application's creation.
     * </p>
     * 
     * @param lastModified
     *        Timestamp of the application's creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account used by AWS SMS.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @return Name of the service role in the customer's account used by AWS SMS.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account used by AWS SMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * Number of server groups present in the application.
     * </p>
     * 
     * @param totalServerGroups
     *        Number of server groups present in the application.
     */

    public void setTotalServerGroups(Integer totalServerGroups) {
        this.totalServerGroups = totalServerGroups;
    }

    /**
     * <p>
     * Number of server groups present in the application.
     * </p>
     * 
     * @return Number of server groups present in the application.
     */

    public Integer getTotalServerGroups() {
        return this.totalServerGroups;
    }

    /**
     * <p>
     * Number of server groups present in the application.
     * </p>
     * 
     * @param totalServerGroups
     *        Number of server groups present in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withTotalServerGroups(Integer totalServerGroups) {
        setTotalServerGroups(totalServerGroups);
        return this;
    }

    /**
     * <p>
     * Number of servers present in the application.
     * </p>
     * 
     * @param totalServers
     *        Number of servers present in the application.
     */

    public void setTotalServers(Integer totalServers) {
        this.totalServers = totalServers;
    }

    /**
     * <p>
     * Number of servers present in the application.
     * </p>
     * 
     * @return Number of servers present in the application.
     */

    public Integer getTotalServers() {
        return this.totalServers;
    }

    /**
     * <p>
     * Number of servers present in the application.
     * </p>
     * 
     * @param totalServers
     *        Number of servers present in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withTotalServers(Integer totalServers) {
        setTotalServers(totalServers);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: ").append(getReplicationStatus()).append(",");
        if (getReplicationStatusMessage() != null)
            sb.append("ReplicationStatusMessage: ").append(getReplicationStatusMessage()).append(",");
        if (getLatestReplicationTime() != null)
            sb.append("LatestReplicationTime: ").append(getLatestReplicationTime()).append(",");
        if (getLaunchStatus() != null)
            sb.append("LaunchStatus: ").append(getLaunchStatus()).append(",");
        if (getLaunchStatusMessage() != null)
            sb.append("LaunchStatusMessage: ").append(getLaunchStatusMessage()).append(",");
        if (getLaunchDetails() != null)
            sb.append("LaunchDetails: ").append(getLaunchDetails()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getTotalServerGroups() != null)
            sb.append("TotalServerGroups: ").append(getTotalServerGroups()).append(",");
        if (getTotalServers() != null)
            sb.append("TotalServers: ").append(getTotalServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSummary == false)
            return false;
        AppSummary other = (AppSummary) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        if (other.getReplicationStatusMessage() == null ^ this.getReplicationStatusMessage() == null)
            return false;
        if (other.getReplicationStatusMessage() != null && other.getReplicationStatusMessage().equals(this.getReplicationStatusMessage()) == false)
            return false;
        if (other.getLatestReplicationTime() == null ^ this.getLatestReplicationTime() == null)
            return false;
        if (other.getLatestReplicationTime() != null && other.getLatestReplicationTime().equals(this.getLatestReplicationTime()) == false)
            return false;
        if (other.getLaunchStatus() == null ^ this.getLaunchStatus() == null)
            return false;
        if (other.getLaunchStatus() != null && other.getLaunchStatus().equals(this.getLaunchStatus()) == false)
            return false;
        if (other.getLaunchStatusMessage() == null ^ this.getLaunchStatusMessage() == null)
            return false;
        if (other.getLaunchStatusMessage() != null && other.getLaunchStatusMessage().equals(this.getLaunchStatusMessage()) == false)
            return false;
        if (other.getLaunchDetails() == null ^ this.getLaunchDetails() == null)
            return false;
        if (other.getLaunchDetails() != null && other.getLaunchDetails().equals(this.getLaunchDetails()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getTotalServerGroups() == null ^ this.getTotalServerGroups() == null)
            return false;
        if (other.getTotalServerGroups() != null && other.getTotalServerGroups().equals(this.getTotalServerGroups()) == false)
            return false;
        if (other.getTotalServers() == null ^ this.getTotalServers() == null)
            return false;
        if (other.getTotalServers() != null && other.getTotalServers().equals(this.getTotalServers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatusMessage() == null) ? 0 : getReplicationStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLatestReplicationTime() == null) ? 0 : getLatestReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getLaunchStatus() == null) ? 0 : getLaunchStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchStatusMessage() == null) ? 0 : getLaunchStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLaunchDetails() == null) ? 0 : getLaunchDetails().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getTotalServerGroups() == null) ? 0 : getTotalServerGroups().hashCode());
        hashCode = prime * hashCode + ((getTotalServers() == null) ? 0 : getTotalServers().hashCode());
        return hashCode;
    }

    @Override
    public AppSummary clone() {
        try {
            return (AppSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.AppSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
