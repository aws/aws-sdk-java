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
 * The CIS scan result details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScanResultDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS scan result details' account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The account ID that's associated with the CIS scan result details.
     * </p>
     */
    private String checkDescription;
    /**
     * <p>
     * The CIS scan result details' check ID.
     * </p>
     */
    private String checkId;
    /**
     * <p>
     * The CIS scan result details' finding ARN.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The CIS scan result details' level.
     * </p>
     */
    private String level;
    /**
     * <p>
     * The CIS scan result details' platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The CIS scan result details' remediation.
     * </p>
     */
    private String remediation;
    /**
     * <p>
     * The CIS scan result details' scan ARN.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The CIS scan result details' status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The CIS scan result details' status reason.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The CIS scan result details' target resource ID.
     * </p>
     */
    private String targetResourceId;
    /**
     * <p>
     * The CIS scan result details' title.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The CIS scan result details' account ID.
     * </p>
     * 
     * @param accountId
     *        The CIS scan result details' account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The CIS scan result details' account ID.
     * </p>
     * 
     * @return The CIS scan result details' account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The CIS scan result details' account ID.
     * </p>
     * 
     * @param accountId
     *        The CIS scan result details' account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The account ID that's associated with the CIS scan result details.
     * </p>
     * 
     * @param checkDescription
     *        The account ID that's associated with the CIS scan result details.
     */

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    /**
     * <p>
     * The account ID that's associated with the CIS scan result details.
     * </p>
     * 
     * @return The account ID that's associated with the CIS scan result details.
     */

    public String getCheckDescription() {
        return this.checkDescription;
    }

    /**
     * <p>
     * The account ID that's associated with the CIS scan result details.
     * </p>
     * 
     * @param checkDescription
     *        The account ID that's associated with the CIS scan result details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withCheckDescription(String checkDescription) {
        setCheckDescription(checkDescription);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' check ID.
     * </p>
     * 
     * @param checkId
     *        The CIS scan result details' check ID.
     */

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The CIS scan result details' check ID.
     * </p>
     * 
     * @return The CIS scan result details' check ID.
     */

    public String getCheckId() {
        return this.checkId;
    }

    /**
     * <p>
     * The CIS scan result details' check ID.
     * </p>
     * 
     * @param checkId
     *        The CIS scan result details' check ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withCheckId(String checkId) {
        setCheckId(checkId);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' finding ARN.
     * </p>
     * 
     * @param findingArn
     *        The CIS scan result details' finding ARN.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The CIS scan result details' finding ARN.
     * </p>
     * 
     * @return The CIS scan result details' finding ARN.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The CIS scan result details' finding ARN.
     * </p>
     * 
     * @param findingArn
     *        The CIS scan result details' finding ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' level.
     * </p>
     * 
     * @param level
     *        The CIS scan result details' level.
     * @see CisSecurityLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The CIS scan result details' level.
     * </p>
     * 
     * @return The CIS scan result details' level.
     * @see CisSecurityLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The CIS scan result details' level.
     * </p>
     * 
     * @param level
     *        The CIS scan result details' level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScanResultDetails withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' level.
     * </p>
     * 
     * @param level
     *        The CIS scan result details' level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisScanResultDetails withLevel(CisSecurityLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' platform.
     * </p>
     * 
     * @param platform
     *        The CIS scan result details' platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The CIS scan result details' platform.
     * </p>
     * 
     * @return The CIS scan result details' platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The CIS scan result details' platform.
     * </p>
     * 
     * @param platform
     *        The CIS scan result details' platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' remediation.
     * </p>
     * 
     * @param remediation
     *        The CIS scan result details' remediation.
     */

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * The CIS scan result details' remediation.
     * </p>
     * 
     * @return The CIS scan result details' remediation.
     */

    public String getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * The CIS scan result details' remediation.
     * </p>
     * 
     * @param remediation
     *        The CIS scan result details' remediation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withRemediation(String remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The CIS scan result details' scan ARN.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The CIS scan result details' scan ARN.
     * </p>
     * 
     * @return The CIS scan result details' scan ARN.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The CIS scan result details' scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The CIS scan result details' scan ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' status.
     * </p>
     * 
     * @param status
     *        The CIS scan result details' status.
     * @see CisFindingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The CIS scan result details' status.
     * </p>
     * 
     * @return The CIS scan result details' status.
     * @see CisFindingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The CIS scan result details' status.
     * </p>
     * 
     * @param status
     *        The CIS scan result details' status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisFindingStatus
     */

    public CisScanResultDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' status.
     * </p>
     * 
     * @param status
     *        The CIS scan result details' status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisFindingStatus
     */

    public CisScanResultDetails withStatus(CisFindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' status reason.
     * </p>
     * 
     * @param statusReason
     *        The CIS scan result details' status reason.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The CIS scan result details' status reason.
     * </p>
     * 
     * @return The CIS scan result details' status reason.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The CIS scan result details' status reason.
     * </p>
     * 
     * @param statusReason
     *        The CIS scan result details' status reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' target resource ID.
     * </p>
     * 
     * @param targetResourceId
     *        The CIS scan result details' target resource ID.
     */

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    /**
     * <p>
     * The CIS scan result details' target resource ID.
     * </p>
     * 
     * @return The CIS scan result details' target resource ID.
     */

    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * <p>
     * The CIS scan result details' target resource ID.
     * </p>
     * 
     * @param targetResourceId
     *        The CIS scan result details' target resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withTargetResourceId(String targetResourceId) {
        setTargetResourceId(targetResourceId);
        return this;
    }

    /**
     * <p>
     * The CIS scan result details' title.
     * </p>
     * 
     * @param title
     *        The CIS scan result details' title.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The CIS scan result details' title.
     * </p>
     * 
     * @return The CIS scan result details' title.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The CIS scan result details' title.
     * </p>
     * 
     * @param title
     *        The CIS scan result details' title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetails withTitle(String title) {
        setTitle(title);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCheckDescription() != null)
            sb.append("CheckDescription: ").append(getCheckDescription()).append(",");
        if (getCheckId() != null)
            sb.append("CheckId: ").append(getCheckId()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTargetResourceId() != null)
            sb.append("TargetResourceId: ").append(getTargetResourceId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisScanResultDetails == false)
            return false;
        CisScanResultDetails other = (CisScanResultDetails) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCheckDescription() == null ^ this.getCheckDescription() == null)
            return false;
        if (other.getCheckDescription() != null && other.getCheckDescription().equals(this.getCheckDescription()) == false)
            return false;
        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTargetResourceId() == null ^ this.getTargetResourceId() == null)
            return false;
        if (other.getTargetResourceId() != null && other.getTargetResourceId().equals(this.getTargetResourceId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCheckDescription() == null) ? 0 : getCheckDescription().hashCode());
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceId() == null) ? 0 : getTargetResourceId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public CisScanResultDetails clone() {
        try {
            return (CisScanResultDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanResultDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
