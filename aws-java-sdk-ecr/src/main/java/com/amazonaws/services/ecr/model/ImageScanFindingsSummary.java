/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the last completed image scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageScanFindingsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFindingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     */
    private java.util.Date imageScanCompletedAt;
    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     */
    private java.util.Date vulnerabilitySourceUpdatedAt;
    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     */
    private java.util.Map<String, Integer> findingSeverityCounts;

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     * 
     * @param imageScanCompletedAt
     *        The time of the last completed image scan.
     */

    public void setImageScanCompletedAt(java.util.Date imageScanCompletedAt) {
        this.imageScanCompletedAt = imageScanCompletedAt;
    }

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     * 
     * @return The time of the last completed image scan.
     */

    public java.util.Date getImageScanCompletedAt() {
        return this.imageScanCompletedAt;
    }

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     * 
     * @param imageScanCompletedAt
     *        The time of the last completed image scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingsSummary withImageScanCompletedAt(java.util.Date imageScanCompletedAt) {
        setImageScanCompletedAt(imageScanCompletedAt);
        return this;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     * 
     * @param vulnerabilitySourceUpdatedAt
     *        The time when the vulnerability data was last scanned.
     */

    public void setVulnerabilitySourceUpdatedAt(java.util.Date vulnerabilitySourceUpdatedAt) {
        this.vulnerabilitySourceUpdatedAt = vulnerabilitySourceUpdatedAt;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     * 
     * @return The time when the vulnerability data was last scanned.
     */

    public java.util.Date getVulnerabilitySourceUpdatedAt() {
        return this.vulnerabilitySourceUpdatedAt;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     * 
     * @param vulnerabilitySourceUpdatedAt
     *        The time when the vulnerability data was last scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingsSummary withVulnerabilitySourceUpdatedAt(java.util.Date vulnerabilitySourceUpdatedAt) {
        setVulnerabilitySourceUpdatedAt(vulnerabilitySourceUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     * 
     * @return The image vulnerability counts, sorted by severity.
     */

    public java.util.Map<String, Integer> getFindingSeverityCounts() {
        return findingSeverityCounts;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     * 
     * @param findingSeverityCounts
     *        The image vulnerability counts, sorted by severity.
     */

    public void setFindingSeverityCounts(java.util.Map<String, Integer> findingSeverityCounts) {
        this.findingSeverityCounts = findingSeverityCounts;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     * 
     * @param findingSeverityCounts
     *        The image vulnerability counts, sorted by severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingsSummary withFindingSeverityCounts(java.util.Map<String, Integer> findingSeverityCounts) {
        setFindingSeverityCounts(findingSeverityCounts);
        return this;
    }

    /**
     * Add a single FindingSeverityCounts entry
     *
     * @see ImageScanFindingsSummary#withFindingSeverityCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingsSummary addFindingSeverityCountsEntry(String key, Integer value) {
        if (null == this.findingSeverityCounts) {
            this.findingSeverityCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.findingSeverityCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.findingSeverityCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FindingSeverityCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingsSummary clearFindingSeverityCountsEntries() {
        this.findingSeverityCounts = null;
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
        if (getImageScanCompletedAt() != null)
            sb.append("ImageScanCompletedAt: ").append(getImageScanCompletedAt()).append(",");
        if (getVulnerabilitySourceUpdatedAt() != null)
            sb.append("VulnerabilitySourceUpdatedAt: ").append(getVulnerabilitySourceUpdatedAt()).append(",");
        if (getFindingSeverityCounts() != null)
            sb.append("FindingSeverityCounts: ").append(getFindingSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFindingsSummary == false)
            return false;
        ImageScanFindingsSummary other = (ImageScanFindingsSummary) obj;
        if (other.getImageScanCompletedAt() == null ^ this.getImageScanCompletedAt() == null)
            return false;
        if (other.getImageScanCompletedAt() != null && other.getImageScanCompletedAt().equals(this.getImageScanCompletedAt()) == false)
            return false;
        if (other.getVulnerabilitySourceUpdatedAt() == null ^ this.getVulnerabilitySourceUpdatedAt() == null)
            return false;
        if (other.getVulnerabilitySourceUpdatedAt() != null && other.getVulnerabilitySourceUpdatedAt().equals(this.getVulnerabilitySourceUpdatedAt()) == false)
            return false;
        if (other.getFindingSeverityCounts() == null ^ this.getFindingSeverityCounts() == null)
            return false;
        if (other.getFindingSeverityCounts() != null && other.getFindingSeverityCounts().equals(this.getFindingSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageScanCompletedAt() == null) ? 0 : getImageScanCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilitySourceUpdatedAt() == null) ? 0 : getVulnerabilitySourceUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getFindingSeverityCounts() == null) ? 0 : getFindingSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanFindingsSummary clone() {
        try {
            return (ImageScanFindingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageScanFindingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
