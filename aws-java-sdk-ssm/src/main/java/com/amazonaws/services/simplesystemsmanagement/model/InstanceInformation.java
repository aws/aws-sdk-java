/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a filter for a specific list of instances.
 * </p>
 */
public class InstanceInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     */
    private String pingStatus;
    /**
     * <p>
     * The date and time when agent last pinged SSM service.
     * </p>
     */
    private java.util.Date lastPingDateTime;
    /**
     * <p>
     * The version of the SSM agent running on your instance.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * Indicates whether latest version of the SSM agent is running on your
     * instance.
     * </p>
     */
    private Boolean isLatestVersion;
    /**
     * <p>
     * The operating system platform type.
     * </p>
     */
    private String platformType;
    /**
     * <p>
     * The name of the operating system platform running on your instance.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * The version of the OS platform running on your instance.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM agent.
     * @see PingStatus
     */

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     * 
     * @return Connection status of the SSM agent.
     * @see PingStatus
     */

    public String getPingStatus() {
        return this.pingStatus;
    }

    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PingStatus
     */

    public InstanceInformation withPingStatus(String pingStatus) {
        setPingStatus(pingStatus);
        return this;
    }

    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM agent.
     * @see PingStatus
     */

    public void setPingStatus(PingStatus pingStatus) {
        this.pingStatus = pingStatus.toString();
    }

    /**
     * <p>
     * Connection status of the SSM agent.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PingStatus
     */

    public InstanceInformation withPingStatus(PingStatus pingStatus) {
        setPingStatus(pingStatus);
        return this;
    }

    /**
     * <p>
     * The date and time when agent last pinged SSM service.
     * </p>
     * 
     * @param lastPingDateTime
     *        The date and time when agent last pinged SSM service.
     */

    public void setLastPingDateTime(java.util.Date lastPingDateTime) {
        this.lastPingDateTime = lastPingDateTime;
    }

    /**
     * <p>
     * The date and time when agent last pinged SSM service.
     * </p>
     * 
     * @return The date and time when agent last pinged SSM service.
     */

    public java.util.Date getLastPingDateTime() {
        return this.lastPingDateTime;
    }

    /**
     * <p>
     * The date and time when agent last pinged SSM service.
     * </p>
     * 
     * @param lastPingDateTime
     *        The date and time when agent last pinged SSM service.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withLastPingDateTime(
            java.util.Date lastPingDateTime) {
        setLastPingDateTime(lastPingDateTime);
        return this;
    }

    /**
     * <p>
     * The version of the SSM agent running on your instance.
     * </p>
     * 
     * @param agentVersion
     *        The version of the SSM agent running on your instance.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the SSM agent running on your instance.
     * </p>
     * 
     * @return The version of the SSM agent running on your instance.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the SSM agent running on your instance.
     * </p>
     * 
     * @param agentVersion
     *        The version of the SSM agent running on your instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether latest version of the SSM agent is running on your
     * instance.
     * </p>
     * 
     * @param isLatestVersion
     *        Indicates whether latest version of the SSM agent is running on
     *        your instance.
     */

    public void setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
    }

    /**
     * <p>
     * Indicates whether latest version of the SSM agent is running on your
     * instance.
     * </p>
     * 
     * @return Indicates whether latest version of the SSM agent is running on
     *         your instance.
     */

    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * <p>
     * Indicates whether latest version of the SSM agent is running on your
     * instance.
     * </p>
     * 
     * @param isLatestVersion
     *        Indicates whether latest version of the SSM agent is running on
     *        your instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withIsLatestVersion(Boolean isLatestVersion) {
        setIsLatestVersion(isLatestVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether latest version of the SSM agent is running on your
     * instance.
     * </p>
     * 
     * @return Indicates whether latest version of the SSM agent is running on
     *         your instance.
     */

    public Boolean isLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * <p>
     * The operating system platform type.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type.
     * @see PlatformType
     */

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * <p>
     * The operating system platform type.
     * </p>
     * 
     * @return The operating system platform type.
     * @see PlatformType
     */

    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * <p>
     * The operating system platform type.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlatformType
     */

    public InstanceInformation withPlatformType(String platformType) {
        setPlatformType(platformType);
        return this;
    }

    /**
     * <p>
     * The operating system platform type.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type.
     * @see PlatformType
     */

    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType.toString();
    }

    /**
     * <p>
     * The operating system platform type.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlatformType
     */

    public InstanceInformation withPlatformType(PlatformType platformType) {
        setPlatformType(platformType);
        return this;
    }

    /**
     * <p>
     * The name of the operating system platform running on your instance.
     * </p>
     * 
     * @param platformName
     *        The name of the operating system platform running on your
     *        instance.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the operating system platform running on your instance.
     * </p>
     * 
     * @return The name of the operating system platform running on your
     *         instance.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * The name of the operating system platform running on your instance.
     * </p>
     * 
     * @param platformName
     *        The name of the operating system platform running on your
     *        instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * The version of the OS platform running on your instance.
     * </p>
     * 
     * @param platformVersion
     *        The version of the OS platform running on your instance.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version of the OS platform running on your instance.
     * </p>
     * 
     * @return The version of the OS platform running on your instance.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The version of the OS platform running on your instance.
     * </p>
     * 
     * @param platformVersion
     *        The version of the OS platform running on your instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceInformation withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPingStatus() != null)
            sb.append("PingStatus: " + getPingStatus() + ",");
        if (getLastPingDateTime() != null)
            sb.append("LastPingDateTime: " + getLastPingDateTime() + ",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: " + getAgentVersion() + ",");
        if (getIsLatestVersion() != null)
            sb.append("IsLatestVersion: " + getIsLatestVersion() + ",");
        if (getPlatformType() != null)
            sb.append("PlatformType: " + getPlatformType() + ",");
        if (getPlatformName() != null)
            sb.append("PlatformName: " + getPlatformName() + ",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceInformation == false)
            return false;
        InstanceInformation other = (InstanceInformation) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPingStatus() == null ^ this.getPingStatus() == null)
            return false;
        if (other.getPingStatus() != null
                && other.getPingStatus().equals(this.getPingStatus()) == false)
            return false;
        if (other.getLastPingDateTime() == null
                ^ this.getLastPingDateTime() == null)
            return false;
        if (other.getLastPingDateTime() != null
                && other.getLastPingDateTime().equals(
                        this.getLastPingDateTime()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null
                && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getIsLatestVersion() == null
                ^ this.getIsLatestVersion() == null)
            return false;
        if (other.getIsLatestVersion() != null
                && other.getIsLatestVersion().equals(this.getIsLatestVersion()) == false)
            return false;
        if (other.getPlatformType() == null ^ this.getPlatformType() == null)
            return false;
        if (other.getPlatformType() != null
                && other.getPlatformType().equals(this.getPlatformType()) == false)
            return false;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null
                && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null
                ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPingStatus() == null) ? 0 : getPingStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastPingDateTime() == null) ? 0 : getLastPingDateTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentVersion() == null) ? 0 : getAgentVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIsLatestVersion() == null) ? 0 : getIsLatestVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformType() == null) ? 0 : getPlatformType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformName() == null) ? 0 : getPlatformName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public InstanceInformation clone() {
        try {
            return (InstanceInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
