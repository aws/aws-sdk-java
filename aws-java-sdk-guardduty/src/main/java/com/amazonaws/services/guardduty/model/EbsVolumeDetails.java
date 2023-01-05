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
 * Contains list of scanned and skipped EBS volumes with details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EbsVolumeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolumeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of EBS volumes that were scanned.
     * </p>
     */
    private java.util.List<VolumeDetail> scannedVolumeDetails;
    /**
     * <p>
     * List of EBS volumes that were skipped from the malware scan.
     * </p>
     */
    private java.util.List<VolumeDetail> skippedVolumeDetails;

    /**
     * <p>
     * List of EBS volumes that were scanned.
     * </p>
     * 
     * @return List of EBS volumes that were scanned.
     */

    public java.util.List<VolumeDetail> getScannedVolumeDetails() {
        return scannedVolumeDetails;
    }

    /**
     * <p>
     * List of EBS volumes that were scanned.
     * </p>
     * 
     * @param scannedVolumeDetails
     *        List of EBS volumes that were scanned.
     */

    public void setScannedVolumeDetails(java.util.Collection<VolumeDetail> scannedVolumeDetails) {
        if (scannedVolumeDetails == null) {
            this.scannedVolumeDetails = null;
            return;
        }

        this.scannedVolumeDetails = new java.util.ArrayList<VolumeDetail>(scannedVolumeDetails);
    }

    /**
     * <p>
     * List of EBS volumes that were scanned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScannedVolumeDetails(java.util.Collection)} or {@link #withScannedVolumeDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scannedVolumeDetails
     *        List of EBS volumes that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeDetails withScannedVolumeDetails(VolumeDetail... scannedVolumeDetails) {
        if (this.scannedVolumeDetails == null) {
            setScannedVolumeDetails(new java.util.ArrayList<VolumeDetail>(scannedVolumeDetails.length));
        }
        for (VolumeDetail ele : scannedVolumeDetails) {
            this.scannedVolumeDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of EBS volumes that were scanned.
     * </p>
     * 
     * @param scannedVolumeDetails
     *        List of EBS volumes that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeDetails withScannedVolumeDetails(java.util.Collection<VolumeDetail> scannedVolumeDetails) {
        setScannedVolumeDetails(scannedVolumeDetails);
        return this;
    }

    /**
     * <p>
     * List of EBS volumes that were skipped from the malware scan.
     * </p>
     * 
     * @return List of EBS volumes that were skipped from the malware scan.
     */

    public java.util.List<VolumeDetail> getSkippedVolumeDetails() {
        return skippedVolumeDetails;
    }

    /**
     * <p>
     * List of EBS volumes that were skipped from the malware scan.
     * </p>
     * 
     * @param skippedVolumeDetails
     *        List of EBS volumes that were skipped from the malware scan.
     */

    public void setSkippedVolumeDetails(java.util.Collection<VolumeDetail> skippedVolumeDetails) {
        if (skippedVolumeDetails == null) {
            this.skippedVolumeDetails = null;
            return;
        }

        this.skippedVolumeDetails = new java.util.ArrayList<VolumeDetail>(skippedVolumeDetails);
    }

    /**
     * <p>
     * List of EBS volumes that were skipped from the malware scan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkippedVolumeDetails(java.util.Collection)} or {@link #withSkippedVolumeDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param skippedVolumeDetails
     *        List of EBS volumes that were skipped from the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeDetails withSkippedVolumeDetails(VolumeDetail... skippedVolumeDetails) {
        if (this.skippedVolumeDetails == null) {
            setSkippedVolumeDetails(new java.util.ArrayList<VolumeDetail>(skippedVolumeDetails.length));
        }
        for (VolumeDetail ele : skippedVolumeDetails) {
            this.skippedVolumeDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of EBS volumes that were skipped from the malware scan.
     * </p>
     * 
     * @param skippedVolumeDetails
     *        List of EBS volumes that were skipped from the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeDetails withSkippedVolumeDetails(java.util.Collection<VolumeDetail> skippedVolumeDetails) {
        setSkippedVolumeDetails(skippedVolumeDetails);
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
        if (getScannedVolumeDetails() != null)
            sb.append("ScannedVolumeDetails: ").append(getScannedVolumeDetails()).append(",");
        if (getSkippedVolumeDetails() != null)
            sb.append("SkippedVolumeDetails: ").append(getSkippedVolumeDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolumeDetails == false)
            return false;
        EbsVolumeDetails other = (EbsVolumeDetails) obj;
        if (other.getScannedVolumeDetails() == null ^ this.getScannedVolumeDetails() == null)
            return false;
        if (other.getScannedVolumeDetails() != null && other.getScannedVolumeDetails().equals(this.getScannedVolumeDetails()) == false)
            return false;
        if (other.getSkippedVolumeDetails() == null ^ this.getSkippedVolumeDetails() == null)
            return false;
        if (other.getSkippedVolumeDetails() != null && other.getSkippedVolumeDetails().equals(this.getSkippedVolumeDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScannedVolumeDetails() == null) ? 0 : getScannedVolumeDetails().hashCode());
        hashCode = prime * hashCode + ((getSkippedVolumeDetails() == null) ? 0 : getSkippedVolumeDetails().hashCode());
        return hashCode;
    }

    @Override
    public EbsVolumeDetails clone() {
        try {
            return (EbsVolumeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EbsVolumeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
