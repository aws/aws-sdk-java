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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details of the performance issue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PerformanceIssueDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceIssueDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The time when the performance issue started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the performance issue stopped.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The metrics that are relevant to the performance issue.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Metric> metrics;
    /**
     * <p>
     * The analysis of the performance issue. The information might contain markdown.
     * </p>
     */
    private String analysis;

    /**
     * <p>
     * The time when the performance issue started.
     * </p>
     * 
     * @param startTime
     *        The time when the performance issue started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the performance issue started.
     * </p>
     * 
     * @return The time when the performance issue started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the performance issue started.
     * </p>
     * 
     * @param startTime
     *        The time when the performance issue started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceIssueDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the performance issue stopped.
     * </p>
     * 
     * @param endTime
     *        The time when the performance issue stopped.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when the performance issue stopped.
     * </p>
     * 
     * @return The time when the performance issue stopped.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when the performance issue stopped.
     * </p>
     * 
     * @param endTime
     *        The time when the performance issue stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceIssueDetails withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The metrics that are relevant to the performance issue.
     * </p>
     * 
     * @return The metrics that are relevant to the performance issue.
     */

    public java.util.List<Metric> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<Metric>();
        }
        return metrics;
    }

    /**
     * <p>
     * The metrics that are relevant to the performance issue.
     * </p>
     * 
     * @param metrics
     *        The metrics that are relevant to the performance issue.
     */

    public void setMetrics(java.util.Collection<Metric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<Metric>(metrics);
    }

    /**
     * <p>
     * The metrics that are relevant to the performance issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The metrics that are relevant to the performance issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceIssueDetails withMetrics(Metric... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<Metric>(metrics.length));
        }
        for (Metric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics that are relevant to the performance issue.
     * </p>
     * 
     * @param metrics
     *        The metrics that are relevant to the performance issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceIssueDetails withMetrics(java.util.Collection<Metric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The analysis of the performance issue. The information might contain markdown.
     * </p>
     * 
     * @param analysis
     *        The analysis of the performance issue. The information might contain markdown.
     */

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    /**
     * <p>
     * The analysis of the performance issue. The information might contain markdown.
     * </p>
     * 
     * @return The analysis of the performance issue. The information might contain markdown.
     */

    public String getAnalysis() {
        return this.analysis;
    }

    /**
     * <p>
     * The analysis of the performance issue. The information might contain markdown.
     * </p>
     * 
     * @param analysis
     *        The analysis of the performance issue. The information might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceIssueDetails withAnalysis(String analysis) {
        setAnalysis(analysis);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getAnalysis() != null)
            sb.append("Analysis: ").append(getAnalysis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceIssueDetails == false)
            return false;
        PerformanceIssueDetails other = (PerformanceIssueDetails) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getAnalysis() == null ^ this.getAnalysis() == null)
            return false;
        if (other.getAnalysis() != null && other.getAnalysis().equals(this.getAnalysis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getAnalysis() == null) ? 0 : getAnalysis().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceIssueDetails clone() {
        try {
            return (PerformanceIssueDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
