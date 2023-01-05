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
 * Contains details from the malware scan that created a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EbsVolumeScanDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolumeScanDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique Id of the malware scan that generated the finding.
     * </p>
     */
    private String scanId;
    /**
     * <p>
     * Returns the start date and time of the malware scan.
     * </p>
     */
    private java.util.Date scanStartedAt;
    /**
     * <p>
     * Returns the completion date and time of the malware scan.
     * </p>
     */
    private java.util.Date scanCompletedAt;
    /**
     * <p>
     * GuardDuty finding ID that triggered a malware scan.
     * </p>
     */
    private String triggerFindingId;
    /**
     * <p>
     * Contains list of threat intelligence sources used to detect threats.
     * </p>
     */
    private java.util.List<String> sources;
    /**
     * <p>
     * Contains a complete view providing malware scan result details.
     * </p>
     */
    private ScanDetections scanDetections;

    /**
     * <p>
     * Unique Id of the malware scan that generated the finding.
     * </p>
     * 
     * @param scanId
     *        Unique Id of the malware scan that generated the finding.
     */

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }

    /**
     * <p>
     * Unique Id of the malware scan that generated the finding.
     * </p>
     * 
     * @return Unique Id of the malware scan that generated the finding.
     */

    public String getScanId() {
        return this.scanId;
    }

    /**
     * <p>
     * Unique Id of the malware scan that generated the finding.
     * </p>
     * 
     * @param scanId
     *        Unique Id of the malware scan that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withScanId(String scanId) {
        setScanId(scanId);
        return this;
    }

    /**
     * <p>
     * Returns the start date and time of the malware scan.
     * </p>
     * 
     * @param scanStartedAt
     *        Returns the start date and time of the malware scan.
     */

    public void setScanStartedAt(java.util.Date scanStartedAt) {
        this.scanStartedAt = scanStartedAt;
    }

    /**
     * <p>
     * Returns the start date and time of the malware scan.
     * </p>
     * 
     * @return Returns the start date and time of the malware scan.
     */

    public java.util.Date getScanStartedAt() {
        return this.scanStartedAt;
    }

    /**
     * <p>
     * Returns the start date and time of the malware scan.
     * </p>
     * 
     * @param scanStartedAt
     *        Returns the start date and time of the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withScanStartedAt(java.util.Date scanStartedAt) {
        setScanStartedAt(scanStartedAt);
        return this;
    }

    /**
     * <p>
     * Returns the completion date and time of the malware scan.
     * </p>
     * 
     * @param scanCompletedAt
     *        Returns the completion date and time of the malware scan.
     */

    public void setScanCompletedAt(java.util.Date scanCompletedAt) {
        this.scanCompletedAt = scanCompletedAt;
    }

    /**
     * <p>
     * Returns the completion date and time of the malware scan.
     * </p>
     * 
     * @return Returns the completion date and time of the malware scan.
     */

    public java.util.Date getScanCompletedAt() {
        return this.scanCompletedAt;
    }

    /**
     * <p>
     * Returns the completion date and time of the malware scan.
     * </p>
     * 
     * @param scanCompletedAt
     *        Returns the completion date and time of the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withScanCompletedAt(java.util.Date scanCompletedAt) {
        setScanCompletedAt(scanCompletedAt);
        return this;
    }

    /**
     * <p>
     * GuardDuty finding ID that triggered a malware scan.
     * </p>
     * 
     * @param triggerFindingId
     *        GuardDuty finding ID that triggered a malware scan.
     */

    public void setTriggerFindingId(String triggerFindingId) {
        this.triggerFindingId = triggerFindingId;
    }

    /**
     * <p>
     * GuardDuty finding ID that triggered a malware scan.
     * </p>
     * 
     * @return GuardDuty finding ID that triggered a malware scan.
     */

    public String getTriggerFindingId() {
        return this.triggerFindingId;
    }

    /**
     * <p>
     * GuardDuty finding ID that triggered a malware scan.
     * </p>
     * 
     * @param triggerFindingId
     *        GuardDuty finding ID that triggered a malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withTriggerFindingId(String triggerFindingId) {
        setTriggerFindingId(triggerFindingId);
        return this;
    }

    /**
     * <p>
     * Contains list of threat intelligence sources used to detect threats.
     * </p>
     * 
     * @return Contains list of threat intelligence sources used to detect threats.
     */

    public java.util.List<String> getSources() {
        return sources;
    }

    /**
     * <p>
     * Contains list of threat intelligence sources used to detect threats.
     * </p>
     * 
     * @param sources
     *        Contains list of threat intelligence sources used to detect threats.
     */

    public void setSources(java.util.Collection<String> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<String>(sources);
    }

    /**
     * <p>
     * Contains list of threat intelligence sources used to detect threats.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Contains list of threat intelligence sources used to detect threats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withSources(String... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<String>(sources.length));
        }
        for (String ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains list of threat intelligence sources used to detect threats.
     * </p>
     * 
     * @param sources
     *        Contains list of threat intelligence sources used to detect threats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withSources(java.util.Collection<String> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * Contains a complete view providing malware scan result details.
     * </p>
     * 
     * @param scanDetections
     *        Contains a complete view providing malware scan result details.
     */

    public void setScanDetections(ScanDetections scanDetections) {
        this.scanDetections = scanDetections;
    }

    /**
     * <p>
     * Contains a complete view providing malware scan result details.
     * </p>
     * 
     * @return Contains a complete view providing malware scan result details.
     */

    public ScanDetections getScanDetections() {
        return this.scanDetections;
    }

    /**
     * <p>
     * Contains a complete view providing malware scan result details.
     * </p>
     * 
     * @param scanDetections
     *        Contains a complete view providing malware scan result details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeScanDetails withScanDetections(ScanDetections scanDetections) {
        setScanDetections(scanDetections);
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
        if (getScanId() != null)
            sb.append("ScanId: ").append(getScanId()).append(",");
        if (getScanStartedAt() != null)
            sb.append("ScanStartedAt: ").append(getScanStartedAt()).append(",");
        if (getScanCompletedAt() != null)
            sb.append("ScanCompletedAt: ").append(getScanCompletedAt()).append(",");
        if (getTriggerFindingId() != null)
            sb.append("TriggerFindingId: ").append(getTriggerFindingId()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getScanDetections() != null)
            sb.append("ScanDetections: ").append(getScanDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolumeScanDetails == false)
            return false;
        EbsVolumeScanDetails other = (EbsVolumeScanDetails) obj;
        if (other.getScanId() == null ^ this.getScanId() == null)
            return false;
        if (other.getScanId() != null && other.getScanId().equals(this.getScanId()) == false)
            return false;
        if (other.getScanStartedAt() == null ^ this.getScanStartedAt() == null)
            return false;
        if (other.getScanStartedAt() != null && other.getScanStartedAt().equals(this.getScanStartedAt()) == false)
            return false;
        if (other.getScanCompletedAt() == null ^ this.getScanCompletedAt() == null)
            return false;
        if (other.getScanCompletedAt() != null && other.getScanCompletedAt().equals(this.getScanCompletedAt()) == false)
            return false;
        if (other.getTriggerFindingId() == null ^ this.getTriggerFindingId() == null)
            return false;
        if (other.getTriggerFindingId() != null && other.getTriggerFindingId().equals(this.getTriggerFindingId()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getScanDetections() == null ^ this.getScanDetections() == null)
            return false;
        if (other.getScanDetections() != null && other.getScanDetections().equals(this.getScanDetections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanId() == null) ? 0 : getScanId().hashCode());
        hashCode = prime * hashCode + ((getScanStartedAt() == null) ? 0 : getScanStartedAt().hashCode());
        hashCode = prime * hashCode + ((getScanCompletedAt() == null) ? 0 : getScanCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getTriggerFindingId() == null) ? 0 : getTriggerFindingId().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getScanDetections() == null) ? 0 : getScanDetections().hashCode());
        return hashCode;
    }

    @Override
    public EbsVolumeScanDetails clone() {
        try {
            return (EbsVolumeScanDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EbsVolumeScanDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
