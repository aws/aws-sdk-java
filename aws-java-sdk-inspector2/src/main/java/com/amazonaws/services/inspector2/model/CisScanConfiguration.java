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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS scan configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScanConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS scan configuration's owner ID.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The CIS scan configuration's scan configuration ARN.
     * </p>
     */
    private String scanConfigurationArn;
    /**
     * <p>
     * The name of the CIS scan configuration.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The CIS scan configuration's schedule.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The CIS scan configuration's security level.
     * </p>
     */
    private String securityLevel;
    /**
     * <p>
     * The CIS scan configuration's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The CIS scan configuration's targets.
     * </p>
     */
    private CisTargets targets;

    /**
     * <p>
     * The CIS scan configuration's owner ID.
     * </p>
     * 
     * @param ownerId
     *        The CIS scan configuration's owner ID.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The CIS scan configuration's owner ID.
     * </p>
     * 
     * @return The CIS scan configuration's owner ID.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The CIS scan configuration's owner ID.
     * </p>
     * 
     * @param ownerId
     *        The CIS scan configuration's owner ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration's scan configuration ARN.
     */

    public void setScanConfigurationArn(String scanConfigurationArn) {
        this.scanConfigurationArn = scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration's scan configuration ARN.
     * </p>
     * 
     * @return The CIS scan configuration's scan configuration ARN.
     */

    public String getScanConfigurationArn() {
        return this.scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration's scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration's scan configuration ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withScanConfigurationArn(String scanConfigurationArn) {
        setScanConfigurationArn(scanConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The name of the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The name of the CIS scan configuration.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the CIS scan configuration.
     * </p>
     * 
     * @return The name of the CIS scan configuration.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The name of the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's schedule.
     * </p>
     * 
     * @param schedule
     *        The CIS scan configuration's schedule.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The CIS scan configuration's schedule.
     * </p>
     * 
     * @return The CIS scan configuration's schedule.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The CIS scan configuration's schedule.
     * </p>
     * 
     * @param schedule
     *        The CIS scan configuration's schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's security level.
     * </p>
     * 
     * @param securityLevel
     *        The CIS scan configuration's security level.
     * @see CisSecurityLevel
     */

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     * <p>
     * The CIS scan configuration's security level.
     * </p>
     * 
     * @return The CIS scan configuration's security level.
     * @see CisSecurityLevel
     */

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * <p>
     * The CIS scan configuration's security level.
     * </p>
     * 
     * @param securityLevel
     *        The CIS scan configuration's security level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScanConfiguration withSecurityLevel(String securityLevel) {
        setSecurityLevel(securityLevel);
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's security level.
     * </p>
     * 
     * @param securityLevel
     *        The CIS scan configuration's security level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScanConfiguration withSecurityLevel(CisSecurityLevel securityLevel) {
        this.securityLevel = securityLevel.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's tags.
     * </p>
     * 
     * @return The CIS scan configuration's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The CIS scan configuration's tags.
     * </p>
     * 
     * @param tags
     *        The CIS scan configuration's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The CIS scan configuration's tags.
     * </p>
     * 
     * @param tags
     *        The CIS scan configuration's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CisScanConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The CIS scan configuration's targets.
     * </p>
     * 
     * @param targets
     *        The CIS scan configuration's targets.
     */

    public void setTargets(CisTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The CIS scan configuration's targets.
     * </p>
     * 
     * @return The CIS scan configuration's targets.
     */

    public CisTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * The CIS scan configuration's targets.
     * </p>
     * 
     * @param targets
     *        The CIS scan configuration's targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanConfiguration withTargets(CisTargets targets) {
        setTargets(targets);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getScanConfigurationArn() != null)
            sb.append("ScanConfigurationArn: ").append(getScanConfigurationArn()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSecurityLevel() != null)
            sb.append("SecurityLevel: ").append(getSecurityLevel()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisScanConfiguration == false)
            return false;
        CisScanConfiguration other = (CisScanConfiguration) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getScanConfigurationArn() == null ^ this.getScanConfigurationArn() == null)
            return false;
        if (other.getScanConfigurationArn() != null && other.getScanConfigurationArn().equals(this.getScanConfigurationArn()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSecurityLevel() == null ^ this.getSecurityLevel() == null)
            return false;
        if (other.getSecurityLevel() != null && other.getSecurityLevel().equals(this.getSecurityLevel()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getScanConfigurationArn() == null) ? 0 : getScanConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevel() == null) ? 0 : getSecurityLevel().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public CisScanConfiguration clone() {
        try {
            return (CisScanConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
