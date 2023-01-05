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
 * Contains a complete view providing malware scan result details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanDetections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanDetections implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of scanned files.
     * </p>
     */
    private ScannedItemCount scannedItemCount;
    /**
     * <p>
     * Total number of infected files.
     * </p>
     */
    private ThreatsDetectedItemCount threatsDetectedItemCount;
    /**
     * <p>
     * Details of the highest severity threat detected during malware scan and number of infected files.
     * </p>
     */
    private HighestSeverityThreatDetails highestSeverityThreatDetails;
    /**
     * <p>
     * Contains details about identified threats organized by threat name.
     * </p>
     */
    private ThreatDetectedByName threatDetectedByName;

    /**
     * <p>
     * Total number of scanned files.
     * </p>
     * 
     * @param scannedItemCount
     *        Total number of scanned files.
     */

    public void setScannedItemCount(ScannedItemCount scannedItemCount) {
        this.scannedItemCount = scannedItemCount;
    }

    /**
     * <p>
     * Total number of scanned files.
     * </p>
     * 
     * @return Total number of scanned files.
     */

    public ScannedItemCount getScannedItemCount() {
        return this.scannedItemCount;
    }

    /**
     * <p>
     * Total number of scanned files.
     * </p>
     * 
     * @param scannedItemCount
     *        Total number of scanned files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanDetections withScannedItemCount(ScannedItemCount scannedItemCount) {
        setScannedItemCount(scannedItemCount);
        return this;
    }

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @param threatsDetectedItemCount
     *        Total number of infected files.
     */

    public void setThreatsDetectedItemCount(ThreatsDetectedItemCount threatsDetectedItemCount) {
        this.threatsDetectedItemCount = threatsDetectedItemCount;
    }

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @return Total number of infected files.
     */

    public ThreatsDetectedItemCount getThreatsDetectedItemCount() {
        return this.threatsDetectedItemCount;
    }

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @param threatsDetectedItemCount
     *        Total number of infected files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanDetections withThreatsDetectedItemCount(ThreatsDetectedItemCount threatsDetectedItemCount) {
        setThreatsDetectedItemCount(threatsDetectedItemCount);
        return this;
    }

    /**
     * <p>
     * Details of the highest severity threat detected during malware scan and number of infected files.
     * </p>
     * 
     * @param highestSeverityThreatDetails
     *        Details of the highest severity threat detected during malware scan and number of infected files.
     */

    public void setHighestSeverityThreatDetails(HighestSeverityThreatDetails highestSeverityThreatDetails) {
        this.highestSeverityThreatDetails = highestSeverityThreatDetails;
    }

    /**
     * <p>
     * Details of the highest severity threat detected during malware scan and number of infected files.
     * </p>
     * 
     * @return Details of the highest severity threat detected during malware scan and number of infected files.
     */

    public HighestSeverityThreatDetails getHighestSeverityThreatDetails() {
        return this.highestSeverityThreatDetails;
    }

    /**
     * <p>
     * Details of the highest severity threat detected during malware scan and number of infected files.
     * </p>
     * 
     * @param highestSeverityThreatDetails
     *        Details of the highest severity threat detected during malware scan and number of infected files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanDetections withHighestSeverityThreatDetails(HighestSeverityThreatDetails highestSeverityThreatDetails) {
        setHighestSeverityThreatDetails(highestSeverityThreatDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about identified threats organized by threat name.
     * </p>
     * 
     * @param threatDetectedByName
     *        Contains details about identified threats organized by threat name.
     */

    public void setThreatDetectedByName(ThreatDetectedByName threatDetectedByName) {
        this.threatDetectedByName = threatDetectedByName;
    }

    /**
     * <p>
     * Contains details about identified threats organized by threat name.
     * </p>
     * 
     * @return Contains details about identified threats organized by threat name.
     */

    public ThreatDetectedByName getThreatDetectedByName() {
        return this.threatDetectedByName;
    }

    /**
     * <p>
     * Contains details about identified threats organized by threat name.
     * </p>
     * 
     * @param threatDetectedByName
     *        Contains details about identified threats organized by threat name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanDetections withThreatDetectedByName(ThreatDetectedByName threatDetectedByName) {
        setThreatDetectedByName(threatDetectedByName);
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
        if (getScannedItemCount() != null)
            sb.append("ScannedItemCount: ").append(getScannedItemCount()).append(",");
        if (getThreatsDetectedItemCount() != null)
            sb.append("ThreatsDetectedItemCount: ").append(getThreatsDetectedItemCount()).append(",");
        if (getHighestSeverityThreatDetails() != null)
            sb.append("HighestSeverityThreatDetails: ").append(getHighestSeverityThreatDetails()).append(",");
        if (getThreatDetectedByName() != null)
            sb.append("ThreatDetectedByName: ").append(getThreatDetectedByName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanDetections == false)
            return false;
        ScanDetections other = (ScanDetections) obj;
        if (other.getScannedItemCount() == null ^ this.getScannedItemCount() == null)
            return false;
        if (other.getScannedItemCount() != null && other.getScannedItemCount().equals(this.getScannedItemCount()) == false)
            return false;
        if (other.getThreatsDetectedItemCount() == null ^ this.getThreatsDetectedItemCount() == null)
            return false;
        if (other.getThreatsDetectedItemCount() != null && other.getThreatsDetectedItemCount().equals(this.getThreatsDetectedItemCount()) == false)
            return false;
        if (other.getHighestSeverityThreatDetails() == null ^ this.getHighestSeverityThreatDetails() == null)
            return false;
        if (other.getHighestSeverityThreatDetails() != null && other.getHighestSeverityThreatDetails().equals(this.getHighestSeverityThreatDetails()) == false)
            return false;
        if (other.getThreatDetectedByName() == null ^ this.getThreatDetectedByName() == null)
            return false;
        if (other.getThreatDetectedByName() != null && other.getThreatDetectedByName().equals(this.getThreatDetectedByName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScannedItemCount() == null) ? 0 : getScannedItemCount().hashCode());
        hashCode = prime * hashCode + ((getThreatsDetectedItemCount() == null) ? 0 : getThreatsDetectedItemCount().hashCode());
        hashCode = prime * hashCode + ((getHighestSeverityThreatDetails() == null) ? 0 : getHighestSeverityThreatDetails().hashCode());
        hashCode = prime * hashCode + ((getThreatDetectedByName() == null) ? 0 : getThreatDetectedByName().hashCode());
        return hashCode;
    }

    @Override
    public ScanDetections clone() {
        try {
            return (ScanDetections) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanDetectionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
