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
 * A milestone return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/Milestone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Milestone implements Serializable, Cloneable, StructuredPojo {

    private Integer milestoneNumber;

    private String milestoneName;

    private java.util.Date recordedAt;

    private Workload workload;

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

    public Milestone withMilestoneNumber(Integer milestoneNumber) {
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

    public Milestone withMilestoneName(String milestoneName) {
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

    public Milestone withRecordedAt(java.util.Date recordedAt) {
        setRecordedAt(recordedAt);
        return this;
    }

    /**
     * @param workload
     */

    public void setWorkload(Workload workload) {
        this.workload = workload;
    }

    /**
     * @return
     */

    public Workload getWorkload() {
        return this.workload;
    }

    /**
     * @param workload
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Milestone withWorkload(Workload workload) {
        setWorkload(workload);
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
        if (getWorkload() != null)
            sb.append("Workload: ").append(getWorkload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Milestone == false)
            return false;
        Milestone other = (Milestone) obj;
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
        if (other.getWorkload() == null ^ this.getWorkload() == null)
            return false;
        if (other.getWorkload() != null && other.getWorkload().equals(this.getWorkload()) == false)
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
        hashCode = prime * hashCode + ((getWorkload() == null) ? 0 : getWorkload().hashCode());
        return hashCode;
    }

    @Override
    public Milestone clone() {
        try {
            return (Milestone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.MilestoneMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
