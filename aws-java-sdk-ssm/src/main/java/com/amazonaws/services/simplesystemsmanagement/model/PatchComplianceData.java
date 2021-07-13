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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the state of a patch on a particular instance as it relates to the patch baseline used to patch the
 * instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchComplianceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchComplianceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the patch.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     */
    private String kBId;
    /**
     * <p>
     * The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     * <code>CriticalUpdates</code>.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date/time the patch was installed on the instance. Not all operating systems provide this level of
     * information.
     * </p>
     */
    private java.util.Date installedTime;
    /**
     * <p>
     * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     * </p>
     */
    private String cVEIds;

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @param title
     *        The title of the patch.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @return The title of the patch.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @param title
     *        The title of the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     * 
     * @param kBId
     *        The operating system-specific ID of the patch.
     */

    public void setKBId(String kBId) {
        this.kBId = kBId;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     * 
     * @return The operating system-specific ID of the patch.
     */

    public String getKBId() {
        return this.kBId;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     * 
     * @param kBId
     *        The operating system-specific ID of the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withKBId(String kBId) {
        setKBId(kBId);
        return this;
    }

    /**
     * <p>
     * The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @param classification
     *        The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     *        <code>CriticalUpdates</code>.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @return The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     *         <code>CriticalUpdates</code>.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @param classification
     *        The classification of the patch, such as <code>SecurityUpdates</code>, <code>Updates</code>, and
     *        <code>CriticalUpdates</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     * </p>
     * 
     * @return The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>
     *         .
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the patchsuch as <code>Critical</code>, <code>Important</code>, and <code>Moderate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the patch on the instance, such as INSTALLED or FAILED.</p>
     *        <p>
     *        For descriptions of each patch state, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *        >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @see PatchComplianceDataState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The state of the patch on the instance, such as INSTALLED or FAILED.</p>
     *         <p>
     *         For descriptions of each patch state, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *         >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @see PatchComplianceDataState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the patch on the instance, such as INSTALLED or FAILED.</p>
     *        <p>
     *        For descriptions of each patch state, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *        >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceDataState
     */

    public PatchComplianceData withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the patch on the instance, such as INSTALLED or FAILED.</p>
     *        <p>
     *        For descriptions of each patch state, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *        >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @see PatchComplianceDataState
     */

    public void setState(PatchComplianceDataState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the patch on the instance, such as INSTALLED or FAILED.</p>
     *        <p>
     *        For descriptions of each patch state, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *        >About patch compliance</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceDataState
     */

    public PatchComplianceData withState(PatchComplianceDataState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Not all operating systems provide this level of
     * information.
     * </p>
     * 
     * @param installedTime
     *        The date/time the patch was installed on the instance. Not all operating systems provide this level of
     *        information.
     */

    public void setInstalledTime(java.util.Date installedTime) {
        this.installedTime = installedTime;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Not all operating systems provide this level of
     * information.
     * </p>
     * 
     * @return The date/time the patch was installed on the instance. Not all operating systems provide this level of
     *         information.
     */

    public java.util.Date getInstalledTime() {
        return this.installedTime;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Not all operating systems provide this level of
     * information.
     * </p>
     * 
     * @param installedTime
     *        The date/time the patch was installed on the instance. Not all operating systems provide this level of
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withInstalledTime(java.util.Date installedTime) {
        setInstalledTime(installedTime);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     * </p>
     * 
     * @param cVEIds
     *        The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     */

    public void setCVEIds(String cVEIds) {
        this.cVEIds = cVEIds;
    }

    /**
     * <p>
     * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     * </p>
     * 
     * @return The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     */

    public String getCVEIds() {
        return this.cVEIds;
    }

    /**
     * <p>
     * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     * </p>
     * 
     * @param cVEIds
     *        The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchComplianceData withCVEIds(String cVEIds) {
        setCVEIds(cVEIds);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getKBId() != null)
            sb.append("KBId: ").append(getKBId()).append(",");
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getInstalledTime() != null)
            sb.append("InstalledTime: ").append(getInstalledTime()).append(",");
        if (getCVEIds() != null)
            sb.append("CVEIds: ").append(getCVEIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchComplianceData == false)
            return false;
        PatchComplianceData other = (PatchComplianceData) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getKBId() == null ^ this.getKBId() == null)
            return false;
        if (other.getKBId() != null && other.getKBId().equals(this.getKBId()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getInstalledTime() == null ^ this.getInstalledTime() == null)
            return false;
        if (other.getInstalledTime() != null && other.getInstalledTime().equals(this.getInstalledTime()) == false)
            return false;
        if (other.getCVEIds() == null ^ this.getCVEIds() == null)
            return false;
        if (other.getCVEIds() != null && other.getCVEIds().equals(this.getCVEIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getKBId() == null) ? 0 : getKBId().hashCode());
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getInstalledTime() == null) ? 0 : getInstalledTime().hashCode());
        hashCode = prime * hashCode + ((getCVEIds() == null) ? 0 : getCVEIds().hashCode());
        return hashCode;
    }

    @Override
    public PatchComplianceData clone() {
        try {
            return (PatchComplianceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchComplianceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
