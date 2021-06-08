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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lens review summary of a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensReviewSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensReviewSummary implements Serializable, Cloneable, StructuredPojo {

    private String lensAlias;
    /**
     * <p>
     * The version of the lens.
     * </p>
     */
    private String lensVersion;

    private String lensName;
    /**
     * <p>
     * The status of the lens.
     * </p>
     */
    private String lensStatus;

    private java.util.Date updatedAt;

    private java.util.Map<String, Integer> riskCounts;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @return The version of the lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @see LensStatus
     */

    public void setLensStatus(String lensStatus) {
        this.lensStatus = lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @return The status of the lens.
     * @see LensStatus
     */

    public String getLensStatus() {
        return this.lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensReviewSummary withLensStatus(String lensStatus) {
        setLensStatus(lensStatus);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensReviewSummary withLensStatus(LensStatus lensStatus) {
        this.lensStatus = lensStatus.toString();
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Integer> getRiskCounts() {
        return riskCounts;
    }

    /**
     * @param riskCounts
     */

    public void setRiskCounts(java.util.Map<String, Integer> riskCounts) {
        this.riskCounts = riskCounts;
    }

    /**
     * @param riskCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see LensReviewSummary#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary addRiskCountsEntry(String key, Integer value) {
        if (null == this.riskCounts) {
            this.riskCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.riskCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.riskCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RiskCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReviewSummary clearRiskCountsEntries() {
        this.riskCounts = null;
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getLensStatus() != null)
            sb.append("LensStatus: ").append(getLensStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensReviewSummary == false)
            return false;
        LensReviewSummary other = (LensReviewSummary) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getLensStatus() == null ^ this.getLensStatus() == null)
            return false;
        if (other.getLensStatus() != null && other.getLensStatus().equals(this.getLensStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getLensStatus() == null) ? 0 : getLensStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        return hashCode;
    }

    @Override
    public LensReviewSummary clone() {
        try {
            return (LensReviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensReviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
