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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An unusual cost pattern. This consists of the detailed metadata and the current status of the anomaly object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Anomaly" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Anomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the anomaly.
     * </p>
     */
    private String anomalyId;
    /**
     * <p>
     * The first day the anomaly is detected.
     * </p>
     */
    private String anomalyStartDate;
    /**
     * <p>
     * The last day the anomaly is detected.
     * </p>
     */
    private String anomalyEndDate;
    /**
     * <p>
     * The dimension for the anomaly. For example, an AWS service in a service monitor.
     * </p>
     */
    private String dimensionValue;
    /**
     * <p>
     * The list of identified root causes for the anomaly.
     * </p>
     */
    private java.util.List<RootCause> rootCauses;
    /**
     * <p>
     * The latest and maximum score for the anomaly.
     * </p>
     */
    private AnomalyScore anomalyScore;
    /**
     * <p>
     * The dollar impact for the anomaly.
     * </p>
     */
    private Impact impact;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The feedback value.
     * </p>
     */
    private String feedback;

    /**
     * <p>
     * The unique identifier for the anomaly.
     * </p>
     * 
     * @param anomalyId
     *        The unique identifier for the anomaly.
     */

    public void setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
    }

    /**
     * <p>
     * The unique identifier for the anomaly.
     * </p>
     * 
     * @return The unique identifier for the anomaly.
     */

    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * <p>
     * The unique identifier for the anomaly.
     * </p>
     * 
     * @param anomalyId
     *        The unique identifier for the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withAnomalyId(String anomalyId) {
        setAnomalyId(anomalyId);
        return this;
    }

    /**
     * <p>
     * The first day the anomaly is detected.
     * </p>
     * 
     * @param anomalyStartDate
     *        The first day the anomaly is detected.
     */

    public void setAnomalyStartDate(String anomalyStartDate) {
        this.anomalyStartDate = anomalyStartDate;
    }

    /**
     * <p>
     * The first day the anomaly is detected.
     * </p>
     * 
     * @return The first day the anomaly is detected.
     */

    public String getAnomalyStartDate() {
        return this.anomalyStartDate;
    }

    /**
     * <p>
     * The first day the anomaly is detected.
     * </p>
     * 
     * @param anomalyStartDate
     *        The first day the anomaly is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withAnomalyStartDate(String anomalyStartDate) {
        setAnomalyStartDate(anomalyStartDate);
        return this;
    }

    /**
     * <p>
     * The last day the anomaly is detected.
     * </p>
     * 
     * @param anomalyEndDate
     *        The last day the anomaly is detected.
     */

    public void setAnomalyEndDate(String anomalyEndDate) {
        this.anomalyEndDate = anomalyEndDate;
    }

    /**
     * <p>
     * The last day the anomaly is detected.
     * </p>
     * 
     * @return The last day the anomaly is detected.
     */

    public String getAnomalyEndDate() {
        return this.anomalyEndDate;
    }

    /**
     * <p>
     * The last day the anomaly is detected.
     * </p>
     * 
     * @param anomalyEndDate
     *        The last day the anomaly is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withAnomalyEndDate(String anomalyEndDate) {
        setAnomalyEndDate(anomalyEndDate);
        return this;
    }

    /**
     * <p>
     * The dimension for the anomaly. For example, an AWS service in a service monitor.
     * </p>
     * 
     * @param dimensionValue
     *        The dimension for the anomaly. For example, an AWS service in a service monitor.
     */

    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    /**
     * <p>
     * The dimension for the anomaly. For example, an AWS service in a service monitor.
     * </p>
     * 
     * @return The dimension for the anomaly. For example, an AWS service in a service monitor.
     */

    public String getDimensionValue() {
        return this.dimensionValue;
    }

    /**
     * <p>
     * The dimension for the anomaly. For example, an AWS service in a service monitor.
     * </p>
     * 
     * @param dimensionValue
     *        The dimension for the anomaly. For example, an AWS service in a service monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withDimensionValue(String dimensionValue) {
        setDimensionValue(dimensionValue);
        return this;
    }

    /**
     * <p>
     * The list of identified root causes for the anomaly.
     * </p>
     * 
     * @return The list of identified root causes for the anomaly.
     */

    public java.util.List<RootCause> getRootCauses() {
        return rootCauses;
    }

    /**
     * <p>
     * The list of identified root causes for the anomaly.
     * </p>
     * 
     * @param rootCauses
     *        The list of identified root causes for the anomaly.
     */

    public void setRootCauses(java.util.Collection<RootCause> rootCauses) {
        if (rootCauses == null) {
            this.rootCauses = null;
            return;
        }

        this.rootCauses = new java.util.ArrayList<RootCause>(rootCauses);
    }

    /**
     * <p>
     * The list of identified root causes for the anomaly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRootCauses(java.util.Collection)} or {@link #withRootCauses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rootCauses
     *        The list of identified root causes for the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withRootCauses(RootCause... rootCauses) {
        if (this.rootCauses == null) {
            setRootCauses(new java.util.ArrayList<RootCause>(rootCauses.length));
        }
        for (RootCause ele : rootCauses) {
            this.rootCauses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of identified root causes for the anomaly.
     * </p>
     * 
     * @param rootCauses
     *        The list of identified root causes for the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withRootCauses(java.util.Collection<RootCause> rootCauses) {
        setRootCauses(rootCauses);
        return this;
    }

    /**
     * <p>
     * The latest and maximum score for the anomaly.
     * </p>
     * 
     * @param anomalyScore
     *        The latest and maximum score for the anomaly.
     */

    public void setAnomalyScore(AnomalyScore anomalyScore) {
        this.anomalyScore = anomalyScore;
    }

    /**
     * <p>
     * The latest and maximum score for the anomaly.
     * </p>
     * 
     * @return The latest and maximum score for the anomaly.
     */

    public AnomalyScore getAnomalyScore() {
        return this.anomalyScore;
    }

    /**
     * <p>
     * The latest and maximum score for the anomaly.
     * </p>
     * 
     * @param anomalyScore
     *        The latest and maximum score for the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withAnomalyScore(AnomalyScore anomalyScore) {
        setAnomalyScore(anomalyScore);
        return this;
    }

    /**
     * <p>
     * The dollar impact for the anomaly.
     * </p>
     * 
     * @param impact
     *        The dollar impact for the anomaly.
     */

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * The dollar impact for the anomaly.
     * </p>
     * 
     * @return The dollar impact for the anomaly.
     */

    public Impact getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * The dollar impact for the anomaly.
     * </p>
     * 
     * @param impact
     *        The dollar impact for the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withImpact(Impact impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The feedback value.
     * </p>
     * 
     * @param feedback
     *        The feedback value.
     * @see AnomalyFeedbackType
     */

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * The feedback value.
     * </p>
     * 
     * @return The feedback value.
     * @see AnomalyFeedbackType
     */

    public String getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * The feedback value.
     * </p>
     * 
     * @param feedback
     *        The feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public Anomaly withFeedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * The feedback value.
     * </p>
     * 
     * @param feedback
     *        The feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public Anomaly withFeedback(AnomalyFeedbackType feedback) {
        this.feedback = feedback.toString();
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
        if (getAnomalyId() != null)
            sb.append("AnomalyId: ").append(getAnomalyId()).append(",");
        if (getAnomalyStartDate() != null)
            sb.append("AnomalyStartDate: ").append(getAnomalyStartDate()).append(",");
        if (getAnomalyEndDate() != null)
            sb.append("AnomalyEndDate: ").append(getAnomalyEndDate()).append(",");
        if (getDimensionValue() != null)
            sb.append("DimensionValue: ").append(getDimensionValue()).append(",");
        if (getRootCauses() != null)
            sb.append("RootCauses: ").append(getRootCauses()).append(",");
        if (getAnomalyScore() != null)
            sb.append("AnomalyScore: ").append(getAnomalyScore()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Anomaly == false)
            return false;
        Anomaly other = (Anomaly) obj;
        if (other.getAnomalyId() == null ^ this.getAnomalyId() == null)
            return false;
        if (other.getAnomalyId() != null && other.getAnomalyId().equals(this.getAnomalyId()) == false)
            return false;
        if (other.getAnomalyStartDate() == null ^ this.getAnomalyStartDate() == null)
            return false;
        if (other.getAnomalyStartDate() != null && other.getAnomalyStartDate().equals(this.getAnomalyStartDate()) == false)
            return false;
        if (other.getAnomalyEndDate() == null ^ this.getAnomalyEndDate() == null)
            return false;
        if (other.getAnomalyEndDate() != null && other.getAnomalyEndDate().equals(this.getAnomalyEndDate()) == false)
            return false;
        if (other.getDimensionValue() == null ^ this.getDimensionValue() == null)
            return false;
        if (other.getDimensionValue() != null && other.getDimensionValue().equals(this.getDimensionValue()) == false)
            return false;
        if (other.getRootCauses() == null ^ this.getRootCauses() == null)
            return false;
        if (other.getRootCauses() != null && other.getRootCauses().equals(this.getRootCauses()) == false)
            return false;
        if (other.getAnomalyScore() == null ^ this.getAnomalyScore() == null)
            return false;
        if (other.getAnomalyScore() != null && other.getAnomalyScore().equals(this.getAnomalyScore()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyId() == null) ? 0 : getAnomalyId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyStartDate() == null) ? 0 : getAnomalyStartDate().hashCode());
        hashCode = prime * hashCode + ((getAnomalyEndDate() == null) ? 0 : getAnomalyEndDate().hashCode());
        hashCode = prime * hashCode + ((getDimensionValue() == null) ? 0 : getDimensionValue().hashCode());
        hashCode = prime * hashCode + ((getRootCauses() == null) ? 0 : getRootCauses().hashCode());
        hashCode = prime * hashCode + ((getAnomalyScore() == null) ? 0 : getAnomalyScore().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        return hashCode;
    }

    @Override
    public Anomaly clone() {
        try {
            return (Anomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.AnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
