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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains results of an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ExperimentReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the report.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The name of the metric that is analyzed in this experiment report.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The type of analysis used for this report.
     * </p>
     */
    private String reportName;
    /**
     * <p>
     * The name of the variation that this report pertains to.
     * </p>
     */
    private String treatmentName;

    /**
     * <p>
     * The content of the report.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param content
     *        The content of the report.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the report.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The content of the report.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the report.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param content
     *        The content of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentReport withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The name of the metric that is analyzed in this experiment report.
     * </p>
     * 
     * @param metricName
     *        The name of the metric that is analyzed in this experiment report.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric that is analyzed in this experiment report.
     * </p>
     * 
     * @return The name of the metric that is analyzed in this experiment report.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric that is analyzed in this experiment report.
     * </p>
     * 
     * @param metricName
     *        The name of the metric that is analyzed in this experiment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentReport withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The type of analysis used for this report.
     * </p>
     * 
     * @param reportName
     *        The type of analysis used for this report.
     * @see ExperimentReportName
     */

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * <p>
     * The type of analysis used for this report.
     * </p>
     * 
     * @return The type of analysis used for this report.
     * @see ExperimentReportName
     */

    public String getReportName() {
        return this.reportName;
    }

    /**
     * <p>
     * The type of analysis used for this report.
     * </p>
     * 
     * @param reportName
     *        The type of analysis used for this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentReportName
     */

    public ExperimentReport withReportName(String reportName) {
        setReportName(reportName);
        return this;
    }

    /**
     * <p>
     * The type of analysis used for this report.
     * </p>
     * 
     * @param reportName
     *        The type of analysis used for this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentReportName
     */

    public ExperimentReport withReportName(ExperimentReportName reportName) {
        this.reportName = reportName.toString();
        return this;
    }

    /**
     * <p>
     * The name of the variation that this report pertains to.
     * </p>
     * 
     * @param treatmentName
     *        The name of the variation that this report pertains to.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The name of the variation that this report pertains to.
     * </p>
     * 
     * @return The name of the variation that this report pertains to.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * The name of the variation that this report pertains to.
     * </p>
     * 
     * @param treatmentName
     *        The name of the variation that this report pertains to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentReport withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getReportName() != null)
            sb.append("ReportName: ").append(getReportName()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentReport == false)
            return false;
        ExperimentReport other = (ExperimentReport) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getReportName() == null ^ this.getReportName() == null)
            return false;
        if (other.getReportName() != null && other.getReportName().equals(this.getReportName()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getReportName() == null) ? 0 : getReportName().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentReport clone() {
        try {
            return (ExperimentReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ExperimentReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
