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
 * The CIS scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS scan's failed checks.
     * </p>
     */
    private Integer failedChecks;
    /**
     * <p>
     * The CIS scan's ARN.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The CIS scan's configuration ARN.
     * </p>
     */
    private String scanConfigurationArn;
    /**
     * <p>
     * The CIS scan's date.
     * </p>
     */
    private java.util.Date scanDate;
    /**
     * <p>
     * The the name of the scan configuration that's associated with this scan.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The account or organization that schedules the CIS scan.
     * </p>
     */
    private String scheduledBy;
    /**
     * <p>
     * The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a profile.
     * </p>
     */
    private String securityLevel;
    /**
     * <p>
     * The CIS scan's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The CIS scan's targets.
     * </p>
     */
    private CisTargets targets;
    /**
     * <p>
     * The CIS scan's total checks.
     * </p>
     */
    private Integer totalChecks;

    /**
     * <p>
     * The CIS scan's failed checks.
     * </p>
     * 
     * @param failedChecks
     *        The CIS scan's failed checks.
     */

    public void setFailedChecks(Integer failedChecks) {
        this.failedChecks = failedChecks;
    }

    /**
     * <p>
     * The CIS scan's failed checks.
     * </p>
     * 
     * @return The CIS scan's failed checks.
     */

    public Integer getFailedChecks() {
        return this.failedChecks;
    }

    /**
     * <p>
     * The CIS scan's failed checks.
     * </p>
     * 
     * @param failedChecks
     *        The CIS scan's failed checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withFailedChecks(Integer failedChecks) {
        setFailedChecks(failedChecks);
        return this;
    }

    /**
     * <p>
     * The CIS scan's ARN.
     * </p>
     * 
     * @param scanArn
     *        The CIS scan's ARN.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The CIS scan's ARN.
     * </p>
     * 
     * @return The CIS scan's ARN.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The CIS scan's ARN.
     * </p>
     * 
     * @param scanArn
     *        The CIS scan's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The CIS scan's configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan's configuration ARN.
     */

    public void setScanConfigurationArn(String scanConfigurationArn) {
        this.scanConfigurationArn = scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan's configuration ARN.
     * </p>
     * 
     * @return The CIS scan's configuration ARN.
     */

    public String getScanConfigurationArn() {
        return this.scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan's configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan's configuration ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withScanConfigurationArn(String scanConfigurationArn) {
        setScanConfigurationArn(scanConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The CIS scan's date.
     * </p>
     * 
     * @param scanDate
     *        The CIS scan's date.
     */

    public void setScanDate(java.util.Date scanDate) {
        this.scanDate = scanDate;
    }

    /**
     * <p>
     * The CIS scan's date.
     * </p>
     * 
     * @return The CIS scan's date.
     */

    public java.util.Date getScanDate() {
        return this.scanDate;
    }

    /**
     * <p>
     * The CIS scan's date.
     * </p>
     * 
     * @param scanDate
     *        The CIS scan's date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withScanDate(java.util.Date scanDate) {
        setScanDate(scanDate);
        return this;
    }

    /**
     * <p>
     * The the name of the scan configuration that's associated with this scan.
     * </p>
     * 
     * @param scanName
     *        The the name of the scan configuration that's associated with this scan.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The the name of the scan configuration that's associated with this scan.
     * </p>
     * 
     * @return The the name of the scan configuration that's associated with this scan.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The the name of the scan configuration that's associated with this scan.
     * </p>
     * 
     * @param scanName
     *        The the name of the scan configuration that's associated with this scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The account or organization that schedules the CIS scan.
     * </p>
     * 
     * @param scheduledBy
     *        The account or organization that schedules the CIS scan.
     */

    public void setScheduledBy(String scheduledBy) {
        this.scheduledBy = scheduledBy;
    }

    /**
     * <p>
     * The account or organization that schedules the CIS scan.
     * </p>
     * 
     * @return The account or organization that schedules the CIS scan.
     */

    public String getScheduledBy() {
        return this.scheduledBy;
    }

    /**
     * <p>
     * The account or organization that schedules the CIS scan.
     * </p>
     * 
     * @param scheduledBy
     *        The account or organization that schedules the CIS scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withScheduledBy(String scheduledBy) {
        setScheduledBy(scheduledBy);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a
     *        profile.
     * @see CisSecurityLevel
     */

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a profile.
     * </p>
     * 
     * @return The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a
     *         profile.
     * @see CisSecurityLevel
     */

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScan withSecurityLevel(String securityLevel) {
        setSecurityLevel(securityLevel);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan. Security level refers to the Benchmark levels that CIS assigns to a
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScan withSecurityLevel(CisSecurityLevel securityLevel) {
        this.securityLevel = securityLevel.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan's status.
     * </p>
     * 
     * @param status
     *        The CIS scan's status.
     * @see CisScanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The CIS scan's status.
     * </p>
     * 
     * @return The CIS scan's status.
     * @see CisScanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The CIS scan's status.
     * </p>
     * 
     * @param status
     *        The CIS scan's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisScanStatus
     */

    public CisScan withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The CIS scan's status.
     * </p>
     * 
     * @param status
     *        The CIS scan's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisScanStatus
     */

    public CisScan withStatus(CisScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan's targets.
     * </p>
     * 
     * @param targets
     *        The CIS scan's targets.
     */

    public void setTargets(CisTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The CIS scan's targets.
     * </p>
     * 
     * @return The CIS scan's targets.
     */

    public CisTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * The CIS scan's targets.
     * </p>
     * 
     * @param targets
     *        The CIS scan's targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withTargets(CisTargets targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The CIS scan's total checks.
     * </p>
     * 
     * @param totalChecks
     *        The CIS scan's total checks.
     */

    public void setTotalChecks(Integer totalChecks) {
        this.totalChecks = totalChecks;
    }

    /**
     * <p>
     * The CIS scan's total checks.
     * </p>
     * 
     * @return The CIS scan's total checks.
     */

    public Integer getTotalChecks() {
        return this.totalChecks;
    }

    /**
     * <p>
     * The CIS scan's total checks.
     * </p>
     * 
     * @param totalChecks
     *        The CIS scan's total checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScan withTotalChecks(Integer totalChecks) {
        setTotalChecks(totalChecks);
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
        if (getFailedChecks() != null)
            sb.append("FailedChecks: ").append(getFailedChecks()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getScanConfigurationArn() != null)
            sb.append("ScanConfigurationArn: ").append(getScanConfigurationArn()).append(",");
        if (getScanDate() != null)
            sb.append("ScanDate: ").append(getScanDate()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getScheduledBy() != null)
            sb.append("ScheduledBy: ").append(getScheduledBy()).append(",");
        if (getSecurityLevel() != null)
            sb.append("SecurityLevel: ").append(getSecurityLevel()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTotalChecks() != null)
            sb.append("TotalChecks: ").append(getTotalChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisScan == false)
            return false;
        CisScan other = (CisScan) obj;
        if (other.getFailedChecks() == null ^ this.getFailedChecks() == null)
            return false;
        if (other.getFailedChecks() != null && other.getFailedChecks().equals(this.getFailedChecks()) == false)
            return false;
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getScanConfigurationArn() == null ^ this.getScanConfigurationArn() == null)
            return false;
        if (other.getScanConfigurationArn() != null && other.getScanConfigurationArn().equals(this.getScanConfigurationArn()) == false)
            return false;
        if (other.getScanDate() == null ^ this.getScanDate() == null)
            return false;
        if (other.getScanDate() != null && other.getScanDate().equals(this.getScanDate()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getScheduledBy() == null ^ this.getScheduledBy() == null)
            return false;
        if (other.getScheduledBy() != null && other.getScheduledBy().equals(this.getScheduledBy()) == false)
            return false;
        if (other.getSecurityLevel() == null ^ this.getSecurityLevel() == null)
            return false;
        if (other.getSecurityLevel() != null && other.getSecurityLevel().equals(this.getSecurityLevel()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTotalChecks() == null ^ this.getTotalChecks() == null)
            return false;
        if (other.getTotalChecks() != null && other.getTotalChecks().equals(this.getTotalChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedChecks() == null) ? 0 : getFailedChecks().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getScanConfigurationArn() == null) ? 0 : getScanConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getScanDate() == null) ? 0 : getScanDate().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getScheduledBy() == null) ? 0 : getScheduledBy().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevel() == null) ? 0 : getSecurityLevel().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTotalChecks() == null) ? 0 : getTotalChecks().hashCode());
        return hashCode;
    }

    @Override
    public CisScan clone() {
        try {
            return (CisScan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
