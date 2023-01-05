/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a malware scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Scan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the detector that the request is associated with.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The unique detector ID of the administrator account that the request is associated with. Note that this value
     * will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     * </p>
     */
    private String adminDetectorId;
    /**
     * <p>
     * The unique scan ID associated with a scan entry.
     * </p>
     */
    private String scanId;
    /**
     * <p>
     * An enum value representing possible scan statuses.
     * </p>
     */
    private String scanStatus;
    /**
     * <p>
     * Represents the reason for FAILED scan status.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The timestamp of when the scan was triggered.
     * </p>
     */
    private java.util.Date scanStartTime;
    /**
     * <p>
     * The timestamp of when the scan was finished.
     * </p>
     */
    private java.util.Date scanEndTime;
    /**
     * <p>
     * Specifies the reason why the scan was initiated.
     * </p>
     */
    private TriggerDetails triggerDetails;
    /**
     * <p>
     * Represents the resources that were scanned in the scan entry.
     * </p>
     */
    private ResourceDetails resourceDetails;
    /**
     * <p>
     * Represents the result of the scan.
     * </p>
     */
    private ScanResultDetails scanResultDetails;
    /**
     * <p>
     * The ID for the account that belongs to the scan.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Represents total bytes that were scanned.
     * </p>
     */
    private Long totalBytes;
    /**
     * <p>
     * Represents the number of files that were scanned.
     * </p>
     */
    private Long fileCount;
    /**
     * <p>
     * List of volumes that were attached to the original instance to be scanned.
     * </p>
     */
    private java.util.List<VolumeDetail> attachedVolumes;

    /**
     * <p>
     * The unique ID of the detector that the request is associated with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector that the request is associated with.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector that the request is associated with.
     * </p>
     * 
     * @return The unique ID of the detector that the request is associated with.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector that the request is associated with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector that the request is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The unique detector ID of the administrator account that the request is associated with. Note that this value
     * will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     * </p>
     * 
     * @param adminDetectorId
     *        The unique detector ID of the administrator account that the request is associated with. Note that this
     *        value will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     */

    public void setAdminDetectorId(String adminDetectorId) {
        this.adminDetectorId = adminDetectorId;
    }

    /**
     * <p>
     * The unique detector ID of the administrator account that the request is associated with. Note that this value
     * will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     * </p>
     * 
     * @return The unique detector ID of the administrator account that the request is associated with. Note that this
     *         value will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     */

    public String getAdminDetectorId() {
        return this.adminDetectorId;
    }

    /**
     * <p>
     * The unique detector ID of the administrator account that the request is associated with. Note that this value
     * will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     * </p>
     * 
     * @param adminDetectorId
     *        The unique detector ID of the administrator account that the request is associated with. Note that this
     *        value will be the same as the one used for <code>DetectorId</code> if the account is an administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withAdminDetectorId(String adminDetectorId) {
        setAdminDetectorId(adminDetectorId);
        return this;
    }

    /**
     * <p>
     * The unique scan ID associated with a scan entry.
     * </p>
     * 
     * @param scanId
     *        The unique scan ID associated with a scan entry.
     */

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }

    /**
     * <p>
     * The unique scan ID associated with a scan entry.
     * </p>
     * 
     * @return The unique scan ID associated with a scan entry.
     */

    public String getScanId() {
        return this.scanId;
    }

    /**
     * <p>
     * The unique scan ID associated with a scan entry.
     * </p>
     * 
     * @param scanId
     *        The unique scan ID associated with a scan entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withScanId(String scanId) {
        setScanId(scanId);
        return this;
    }

    /**
     * <p>
     * An enum value representing possible scan statuses.
     * </p>
     * 
     * @param scanStatus
     *        An enum value representing possible scan statuses.
     * @see ScanStatus
     */

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    /**
     * <p>
     * An enum value representing possible scan statuses.
     * </p>
     * 
     * @return An enum value representing possible scan statuses.
     * @see ScanStatus
     */

    public String getScanStatus() {
        return this.scanStatus;
    }

    /**
     * <p>
     * An enum value representing possible scan statuses.
     * </p>
     * 
     * @param scanStatus
     *        An enum value representing possible scan statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatus
     */

    public Scan withScanStatus(String scanStatus) {
        setScanStatus(scanStatus);
        return this;
    }

    /**
     * <p>
     * An enum value representing possible scan statuses.
     * </p>
     * 
     * @param scanStatus
     *        An enum value representing possible scan statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatus
     */

    public Scan withScanStatus(ScanStatus scanStatus) {
        this.scanStatus = scanStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents the reason for FAILED scan status.
     * </p>
     * 
     * @param failureReason
     *        Represents the reason for FAILED scan status.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Represents the reason for FAILED scan status.
     * </p>
     * 
     * @return Represents the reason for FAILED scan status.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Represents the reason for FAILED scan status.
     * </p>
     * 
     * @param failureReason
     *        Represents the reason for FAILED scan status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the scan was triggered.
     * </p>
     * 
     * @param scanStartTime
     *        The timestamp of when the scan was triggered.
     */

    public void setScanStartTime(java.util.Date scanStartTime) {
        this.scanStartTime = scanStartTime;
    }

    /**
     * <p>
     * The timestamp of when the scan was triggered.
     * </p>
     * 
     * @return The timestamp of when the scan was triggered.
     */

    public java.util.Date getScanStartTime() {
        return this.scanStartTime;
    }

    /**
     * <p>
     * The timestamp of when the scan was triggered.
     * </p>
     * 
     * @param scanStartTime
     *        The timestamp of when the scan was triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withScanStartTime(java.util.Date scanStartTime) {
        setScanStartTime(scanStartTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the scan was finished.
     * </p>
     * 
     * @param scanEndTime
     *        The timestamp of when the scan was finished.
     */

    public void setScanEndTime(java.util.Date scanEndTime) {
        this.scanEndTime = scanEndTime;
    }

    /**
     * <p>
     * The timestamp of when the scan was finished.
     * </p>
     * 
     * @return The timestamp of when the scan was finished.
     */

    public java.util.Date getScanEndTime() {
        return this.scanEndTime;
    }

    /**
     * <p>
     * The timestamp of when the scan was finished.
     * </p>
     * 
     * @param scanEndTime
     *        The timestamp of when the scan was finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withScanEndTime(java.util.Date scanEndTime) {
        setScanEndTime(scanEndTime);
        return this;
    }

    /**
     * <p>
     * Specifies the reason why the scan was initiated.
     * </p>
     * 
     * @param triggerDetails
     *        Specifies the reason why the scan was initiated.
     */

    public void setTriggerDetails(TriggerDetails triggerDetails) {
        this.triggerDetails = triggerDetails;
    }

    /**
     * <p>
     * Specifies the reason why the scan was initiated.
     * </p>
     * 
     * @return Specifies the reason why the scan was initiated.
     */

    public TriggerDetails getTriggerDetails() {
        return this.triggerDetails;
    }

    /**
     * <p>
     * Specifies the reason why the scan was initiated.
     * </p>
     * 
     * @param triggerDetails
     *        Specifies the reason why the scan was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withTriggerDetails(TriggerDetails triggerDetails) {
        setTriggerDetails(triggerDetails);
        return this;
    }

    /**
     * <p>
     * Represents the resources that were scanned in the scan entry.
     * </p>
     * 
     * @param resourceDetails
     *        Represents the resources that were scanned in the scan entry.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Represents the resources that were scanned in the scan entry.
     * </p>
     * 
     * @return Represents the resources that were scanned in the scan entry.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Represents the resources that were scanned in the scan entry.
     * </p>
     * 
     * @param resourceDetails
     *        Represents the resources that were scanned in the scan entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * Represents the result of the scan.
     * </p>
     * 
     * @param scanResultDetails
     *        Represents the result of the scan.
     */

    public void setScanResultDetails(ScanResultDetails scanResultDetails) {
        this.scanResultDetails = scanResultDetails;
    }

    /**
     * <p>
     * Represents the result of the scan.
     * </p>
     * 
     * @return Represents the result of the scan.
     */

    public ScanResultDetails getScanResultDetails() {
        return this.scanResultDetails;
    }

    /**
     * <p>
     * Represents the result of the scan.
     * </p>
     * 
     * @param scanResultDetails
     *        Represents the result of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withScanResultDetails(ScanResultDetails scanResultDetails) {
        setScanResultDetails(scanResultDetails);
        return this;
    }

    /**
     * <p>
     * The ID for the account that belongs to the scan.
     * </p>
     * 
     * @param accountId
     *        The ID for the account that belongs to the scan.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID for the account that belongs to the scan.
     * </p>
     * 
     * @return The ID for the account that belongs to the scan.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID for the account that belongs to the scan.
     * </p>
     * 
     * @param accountId
     *        The ID for the account that belongs to the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Represents total bytes that were scanned.
     * </p>
     * 
     * @param totalBytes
     *        Represents total bytes that were scanned.
     */

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    /**
     * <p>
     * Represents total bytes that were scanned.
     * </p>
     * 
     * @return Represents total bytes that were scanned.
     */

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * <p>
     * Represents total bytes that were scanned.
     * </p>
     * 
     * @param totalBytes
     *        Represents total bytes that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withTotalBytes(Long totalBytes) {
        setTotalBytes(totalBytes);
        return this;
    }

    /**
     * <p>
     * Represents the number of files that were scanned.
     * </p>
     * 
     * @param fileCount
     *        Represents the number of files that were scanned.
     */

    public void setFileCount(Long fileCount) {
        this.fileCount = fileCount;
    }

    /**
     * <p>
     * Represents the number of files that were scanned.
     * </p>
     * 
     * @return Represents the number of files that were scanned.
     */

    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * <p>
     * Represents the number of files that were scanned.
     * </p>
     * 
     * @param fileCount
     *        Represents the number of files that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withFileCount(Long fileCount) {
        setFileCount(fileCount);
        return this;
    }

    /**
     * <p>
     * List of volumes that were attached to the original instance to be scanned.
     * </p>
     * 
     * @return List of volumes that were attached to the original instance to be scanned.
     */

    public java.util.List<VolumeDetail> getAttachedVolumes() {
        return attachedVolumes;
    }

    /**
     * <p>
     * List of volumes that were attached to the original instance to be scanned.
     * </p>
     * 
     * @param attachedVolumes
     *        List of volumes that were attached to the original instance to be scanned.
     */

    public void setAttachedVolumes(java.util.Collection<VolumeDetail> attachedVolumes) {
        if (attachedVolumes == null) {
            this.attachedVolumes = null;
            return;
        }

        this.attachedVolumes = new java.util.ArrayList<VolumeDetail>(attachedVolumes);
    }

    /**
     * <p>
     * List of volumes that were attached to the original instance to be scanned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedVolumes(java.util.Collection)} or {@link #withAttachedVolumes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attachedVolumes
     *        List of volumes that were attached to the original instance to be scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withAttachedVolumes(VolumeDetail... attachedVolumes) {
        if (this.attachedVolumes == null) {
            setAttachedVolumes(new java.util.ArrayList<VolumeDetail>(attachedVolumes.length));
        }
        for (VolumeDetail ele : attachedVolumes) {
            this.attachedVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of volumes that were attached to the original instance to be scanned.
     * </p>
     * 
     * @param attachedVolumes
     *        List of volumes that were attached to the original instance to be scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scan withAttachedVolumes(java.util.Collection<VolumeDetail> attachedVolumes) {
        setAttachedVolumes(attachedVolumes);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAdminDetectorId() != null)
            sb.append("AdminDetectorId: ").append(getAdminDetectorId()).append(",");
        if (getScanId() != null)
            sb.append("ScanId: ").append(getScanId()).append(",");
        if (getScanStatus() != null)
            sb.append("ScanStatus: ").append(getScanStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getScanStartTime() != null)
            sb.append("ScanStartTime: ").append(getScanStartTime()).append(",");
        if (getScanEndTime() != null)
            sb.append("ScanEndTime: ").append(getScanEndTime()).append(",");
        if (getTriggerDetails() != null)
            sb.append("TriggerDetails: ").append(getTriggerDetails()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getScanResultDetails() != null)
            sb.append("ScanResultDetails: ").append(getScanResultDetails()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getTotalBytes() != null)
            sb.append("TotalBytes: ").append(getTotalBytes()).append(",");
        if (getFileCount() != null)
            sb.append("FileCount: ").append(getFileCount()).append(",");
        if (getAttachedVolumes() != null)
            sb.append("AttachedVolumes: ").append(getAttachedVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scan == false)
            return false;
        Scan other = (Scan) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAdminDetectorId() == null ^ this.getAdminDetectorId() == null)
            return false;
        if (other.getAdminDetectorId() != null && other.getAdminDetectorId().equals(this.getAdminDetectorId()) == false)
            return false;
        if (other.getScanId() == null ^ this.getScanId() == null)
            return false;
        if (other.getScanId() != null && other.getScanId().equals(this.getScanId()) == false)
            return false;
        if (other.getScanStatus() == null ^ this.getScanStatus() == null)
            return false;
        if (other.getScanStatus() != null && other.getScanStatus().equals(this.getScanStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getScanStartTime() == null ^ this.getScanStartTime() == null)
            return false;
        if (other.getScanStartTime() != null && other.getScanStartTime().equals(this.getScanStartTime()) == false)
            return false;
        if (other.getScanEndTime() == null ^ this.getScanEndTime() == null)
            return false;
        if (other.getScanEndTime() != null && other.getScanEndTime().equals(this.getScanEndTime()) == false)
            return false;
        if (other.getTriggerDetails() == null ^ this.getTriggerDetails() == null)
            return false;
        if (other.getTriggerDetails() != null && other.getTriggerDetails().equals(this.getTriggerDetails()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getScanResultDetails() == null ^ this.getScanResultDetails() == null)
            return false;
        if (other.getScanResultDetails() != null && other.getScanResultDetails().equals(this.getScanResultDetails()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getTotalBytes() == null ^ this.getTotalBytes() == null)
            return false;
        if (other.getTotalBytes() != null && other.getTotalBytes().equals(this.getTotalBytes()) == false)
            return false;
        if (other.getFileCount() == null ^ this.getFileCount() == null)
            return false;
        if (other.getFileCount() != null && other.getFileCount().equals(this.getFileCount()) == false)
            return false;
        if (other.getAttachedVolumes() == null ^ this.getAttachedVolumes() == null)
            return false;
        if (other.getAttachedVolumes() != null && other.getAttachedVolumes().equals(this.getAttachedVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAdminDetectorId() == null) ? 0 : getAdminDetectorId().hashCode());
        hashCode = prime * hashCode + ((getScanId() == null) ? 0 : getScanId().hashCode());
        hashCode = prime * hashCode + ((getScanStatus() == null) ? 0 : getScanStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getScanStartTime() == null) ? 0 : getScanStartTime().hashCode());
        hashCode = prime * hashCode + ((getScanEndTime() == null) ? 0 : getScanEndTime().hashCode());
        hashCode = prime * hashCode + ((getTriggerDetails() == null) ? 0 : getTriggerDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getScanResultDetails() == null) ? 0 : getScanResultDetails().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getTotalBytes() == null) ? 0 : getTotalBytes().hashCode());
        hashCode = prime * hashCode + ((getFileCount() == null) ? 0 : getFileCount().hashCode());
        hashCode = prime * hashCode + ((getAttachedVolumes() == null) ? 0 : getAttachedVolumes().hashCode());
        return hashCode;
    }

    @Override
    public Scan clone() {
        try {
            return (Scan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
