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
 * A milestone summary return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/MilestoneSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MilestoneSummary implements Serializable, Cloneable, StructuredPojo {

    private Integer milestoneNumber;

    private String milestoneName;

    private java.util.Date recordedAt;

    private WorkloadSummary workloadSummary;

    /**
     * @param milestoneNumber
     */

    public void setMilestoneNumber(Integer milestoneNumber) {
        this.milestoneNumber = milestoneNumber;
    }

    /**
     * @return
     */

    public Integer getMilestoneNumber() {
        return this.milestoneNumber;
    }

    /**
     * @param milestoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MilestoneSummary withMilestoneNumber(Integer milestoneNumber) {
        setMilestoneNumber(milestoneNumber);
        return this;
    }

    /**
     * @param milestoneName
     */

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    /**
     * @return
     */

    public String getMilestoneName() {
        return this.milestoneName;
    }

    /**
     * @param milestoneName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MilestoneSummary withMilestoneName(String milestoneName) {
        setMilestoneName(milestoneName);
        return this;
    }

    /**
     * @param recordedAt
     */

    public void setRecordedAt(java.util.Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    /**
     * @return
     */

    public java.util.Date getRecordedAt() {
        return this.recordedAt;
    }

    /**
     * @param recordedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MilestoneSummary withRecordedAt(java.util.Date recordedAt) {
        setRecordedAt(recordedAt);
        return this;
    }

    /**
     * @param workloadSummary
     */

    public void setWorkloadSummary(WorkloadSummary workloadSummary) {
        this.workloadSummary = workloadSummary;
    }

    /**
     * @return
     */

    public WorkloadSummary getWorkloadSummary() {
        return this.workloadSummary;
    }

    /**
     * @param workloadSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MilestoneSummary withWorkloadSummary(WorkloadSummary workloadSummary) {
        setWorkloadSummary(workloadSummary);
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
        if (getMilestoneNumber() != null)
            sb.append("MilestoneNumber: ").append(getMilestoneNumber()).append(",");
        if (getMilestoneName() != null)
            sb.append("MilestoneName: ").append(getMilestoneName()).append(",");
        if (getRecordedAt() != null)
            sb.append("RecordedAt: ").append(getRecordedAt()).append(",");
        if (getWorkloadSummary() != null)
            sb.append("WorkloadSummary: ").append(getWorkloadSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MilestoneSummary == false)
            return false;
        MilestoneSummary other = (MilestoneSummary) obj;
        if (other.getMilestoneNumber() == null ^ this.getMilestoneNumber() == null)
            return false;
        if (other.getMilestoneNumber() != null && other.getMilestoneNumber().equals(this.getMilestoneNumber()) == false)
            return false;
        if (other.getMilestoneName() == null ^ this.getMilestoneName() == null)
            return false;
        if (other.getMilestoneName() != null && other.getMilestoneName().equals(this.getMilestoneName()) == false)
            return false;
        if (other.getRecordedAt() == null ^ this.getRecordedAt() == null)
            return false;
        if (other.getRecordedAt() != null && other.getRecordedAt().equals(this.getRecordedAt()) == false)
            return false;
        if (other.getWorkloadSummary() == null ^ this.getWorkloadSummary() == null)
            return false;
        if (other.getWorkloadSummary() != null && other.getWorkloadSummary().equals(this.getWorkloadSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMilestoneNumber() == null) ? 0 : getMilestoneNumber().hashCode());
        hashCode = prime * hashCode + ((getMilestoneName() == null) ? 0 : getMilestoneName().hashCode());
        hashCode = prime * hashCode + ((getRecordedAt() == null) ? 0 : getRecordedAt().hashCode());
        hashCode = prime * hashCode + ((getWorkloadSummary() == null) ? 0 : getWorkloadSummary().hashCode());
        return hashCode;
    }

    @Override
    public MilestoneSummary clone() {
        try {
            return (MilestoneSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.MilestoneSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
