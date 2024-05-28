/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A metric that contributes to the consolidated report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ConsolidatedReportMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsolidatedReportMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
     * </p>
     */
    private String metricType;

    private java.util.Map<String, Integer> riskCounts;

    private String workloadId;

    private String workloadName;

    private String workloadArn;

    private java.util.Date updatedAt;
    /**
     * <p>
     * The metrics for the lenses in the workload.
     * </p>
     */
    private java.util.List<LensMetric> lenses;
    /**
     * <p>
     * The total number of lenses applied to the workload.
     * </p>
     */
    private Integer lensesAppliedCount;

    /**
     * <p>
     * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
     * </p>
     * 
     * @param metricType
     *        The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are
     *        supported.
     * @see MetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
     * </p>
     * 
     * @return The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are
     *         supported.
     * @see MetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
     * </p>
     * 
     * @param metricType
     *        The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public ConsolidatedReportMetric withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
     * </p>
     * 
     * @param metricType
     *        The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public ConsolidatedReportMetric withMetricType(MetricType metricType) {
        this.metricType = metricType.toString();
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

    public ConsolidatedReportMetric withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see ConsolidatedReportMetric#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConsolidatedReportMetric addRiskCountsEntry(String key, Integer value) {
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

    public ConsolidatedReportMetric clearRiskCountsEntries() {
        this.riskCounts = null;
        return this;
    }

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

    public ConsolidatedReportMetric withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
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

    public ConsolidatedReportMetric withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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

    public ConsolidatedReportMetric withWorkloadArn(String workloadArn) {
        setWorkloadArn(workloadArn);
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

    public ConsolidatedReportMetric withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The metrics for the lenses in the workload.
     * </p>
     * 
     * @return The metrics for the lenses in the workload.
     */

    public java.util.List<LensMetric> getLenses() {
        return lenses;
    }

    /**
     * <p>
     * The metrics for the lenses in the workload.
     * </p>
     * 
     * @param lenses
     *        The metrics for the lenses in the workload.
     */

    public void setLenses(java.util.Collection<LensMetric> lenses) {
        if (lenses == null) {
            this.lenses = null;
            return;
        }

        this.lenses = new java.util.ArrayList<LensMetric>(lenses);
    }

    /**
     * <p>
     * The metrics for the lenses in the workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLenses(java.util.Collection)} or {@link #withLenses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lenses
     *        The metrics for the lenses in the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsolidatedReportMetric withLenses(LensMetric... lenses) {
        if (this.lenses == null) {
            setLenses(new java.util.ArrayList<LensMetric>(lenses.length));
        }
        for (LensMetric ele : lenses) {
            this.lenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics for the lenses in the workload.
     * </p>
     * 
     * @param lenses
     *        The metrics for the lenses in the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsolidatedReportMetric withLenses(java.util.Collection<LensMetric> lenses) {
        setLenses(lenses);
        return this;
    }

    /**
     * <p>
     * The total number of lenses applied to the workload.
     * </p>
     * 
     * @param lensesAppliedCount
     *        The total number of lenses applied to the workload.
     */

    public void setLensesAppliedCount(Integer lensesAppliedCount) {
        this.lensesAppliedCount = lensesAppliedCount;
    }

    /**
     * <p>
     * The total number of lenses applied to the workload.
     * </p>
     * 
     * @return The total number of lenses applied to the workload.
     */

    public Integer getLensesAppliedCount() {
        return this.lensesAppliedCount;
    }

    /**
     * <p>
     * The total number of lenses applied to the workload.
     * </p>
     * 
     * @param lensesAppliedCount
     *        The total number of lenses applied to the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsolidatedReportMetric withLensesAppliedCount(Integer lensesAppliedCount) {
        setLensesAppliedCount(lensesAppliedCount);
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
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts()).append(",");
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getWorkloadArn() != null)
            sb.append("WorkloadArn: ").append(getWorkloadArn()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getLenses() != null)
            sb.append("Lenses: ").append(getLenses()).append(",");
        if (getLensesAppliedCount() != null)
            sb.append("LensesAppliedCount: ").append(getLensesAppliedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsolidatedReportMetric == false)
            return false;
        ConsolidatedReportMetric other = (ConsolidatedReportMetric) obj;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getWorkloadArn() == null ^ this.getWorkloadArn() == null)
            return false;
        if (other.getWorkloadArn() != null && other.getWorkloadArn().equals(this.getWorkloadArn()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getLenses() == null ^ this.getLenses() == null)
            return false;
        if (other.getLenses() != null && other.getLenses().equals(this.getLenses()) == false)
            return false;
        if (other.getLensesAppliedCount() == null ^ this.getLensesAppliedCount() == null)
            return false;
        if (other.getLensesAppliedCount() != null && other.getLensesAppliedCount().equals(this.getLensesAppliedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadArn() == null) ? 0 : getWorkloadArn().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLenses() == null) ? 0 : getLenses().hashCode());
        hashCode = prime * hashCode + ((getLensesAppliedCount() == null) ? 0 : getLensesAppliedCount().hashCode());
        return hashCode;
    }

    @Override
    public ConsolidatedReportMetric clone() {
        try {
            return (ConsolidatedReportMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ConsolidatedReportMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
