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
 * A pillar review summary of a lens review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/PillarReviewSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PillarReviewSummary implements Serializable, Cloneable, StructuredPojo {

    private String pillarId;

    private String pillarName;

    private String notes;

    private java.util.Map<String, Integer> riskCounts;

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarReviewSummary withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @param pillarName
     */

    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    /**
     * @return
     */

    public String getPillarName() {
        return this.pillarName;
    }

    /**
     * @param pillarName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarReviewSummary withPillarName(String pillarName) {
        setPillarName(pillarName);
        return this;
    }

    /**
     * @param notes
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * @param notes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarReviewSummary withNotes(String notes) {
        setNotes(notes);
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

    public PillarReviewSummary withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see PillarReviewSummary#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PillarReviewSummary addRiskCountsEntry(String key, Integer value) {
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

    public PillarReviewSummary clearRiskCountsEntries() {
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
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getPillarName() != null)
            sb.append("PillarName: ").append(getPillarName()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
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

        if (obj instanceof PillarReviewSummary == false)
            return false;
        PillarReviewSummary other = (PillarReviewSummary) obj;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getPillarName() == null ^ this.getPillarName() == null)
            return false;
        if (other.getPillarName() != null && other.getPillarName().equals(this.getPillarName()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
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

        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getPillarName() == null) ? 0 : getPillarName().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        return hashCode;
    }

    @Override
    public PillarReviewSummary clone() {
        try {
            return (PillarReviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.PillarReviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
