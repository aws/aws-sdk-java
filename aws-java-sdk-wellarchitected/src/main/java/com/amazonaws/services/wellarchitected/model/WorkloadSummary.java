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
 * A workload summary return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/WorkloadSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadSummary implements Serializable, Cloneable, StructuredPojo {

    private String workloadId;

    private String workloadArn;

    private String workloadName;

    private String owner;

    private java.util.Date updatedAt;

    private java.util.List<String> lenses;

    private java.util.Map<String, Integer> riskCounts;

    private String improvementStatus;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param workloadArn
     */

    public void setWorkloadArn(String workloadArn) {
        this.workloadArn = workloadArn;
    }

    /**
     * @return
     */

    public String getWorkloadArn() {
        return this.workloadArn;
    }

    /**
     * @param workloadArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withWorkloadArn(String workloadArn) {
        setWorkloadArn(workloadArn);
        return this;
    }

    /**
     * @param workloadName
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * @return
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @param workloadName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * @param owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withOwner(String owner) {
        setOwner(owner);
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

    public WorkloadSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getLenses() {
        return lenses;
    }

    /**
     * @param lenses
     */

    public void setLenses(java.util.Collection<String> lenses) {
        if (lenses == null) {
            this.lenses = null;
            return;
        }

        this.lenses = new java.util.ArrayList<String>(lenses);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLenses(java.util.Collection)} or {@link #withLenses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lenses
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withLenses(String... lenses) {
        if (this.lenses == null) {
            setLenses(new java.util.ArrayList<String>(lenses.length));
        }
        for (String ele : lenses) {
            this.lenses.add(ele);
        }
        return this;
    }

    /**
     * @param lenses
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary withLenses(java.util.Collection<String> lenses) {
        setLenses(lenses);
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

    public WorkloadSummary withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see WorkloadSummary#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadSummary addRiskCountsEntry(String key, Integer value) {
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

    public WorkloadSummary clearRiskCountsEntries() {
        this.riskCounts = null;
        return this;
    }

    /**
     * @param improvementStatus
     * @see WorkloadImprovementStatus
     */

    public void setImprovementStatus(String improvementStatus) {
        this.improvementStatus = improvementStatus;
    }

    /**
     * @return
     * @see WorkloadImprovementStatus
     */

    public String getImprovementStatus() {
        return this.improvementStatus;
    }

    /**
     * @param improvementStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadImprovementStatus
     */

    public WorkloadSummary withImprovementStatus(String improvementStatus) {
        setImprovementStatus(improvementStatus);
        return this;
    }

    /**
     * @param improvementStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadImprovementStatus
     */

    public WorkloadSummary withImprovementStatus(WorkloadImprovementStatus improvementStatus) {
        this.improvementStatus = improvementStatus.toString();
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadArn() != null)
            sb.append("WorkloadArn: ").append(getWorkloadArn()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getLenses() != null)
            sb.append("Lenses: ").append(getLenses()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts()).append(",");
        if (getImprovementStatus() != null)
            sb.append("ImprovementStatus: ").append(getImprovementStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadSummary == false)
            return false;
        WorkloadSummary other = (WorkloadSummary) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadArn() == null ^ this.getWorkloadArn() == null)
            return false;
        if (other.getWorkloadArn() != null && other.getWorkloadArn().equals(this.getWorkloadArn()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getLenses() == null ^ this.getLenses() == null)
            return false;
        if (other.getLenses() != null && other.getLenses().equals(this.getLenses()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        if (other.getImprovementStatus() == null ^ this.getImprovementStatus() == null)
            return false;
        if (other.getImprovementStatus() != null && other.getImprovementStatus().equals(this.getImprovementStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadArn() == null) ? 0 : getWorkloadArn().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLenses() == null) ? 0 : getLenses().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        hashCode = prime * hashCode + ((getImprovementStatus() == null) ? 0 : getImprovementStatus().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadSummary clone() {
        try {
            return (WorkloadSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.WorkloadSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
