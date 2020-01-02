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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the metrics of a trial component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentMetricSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentMetricSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * When the metric was last updated.
     * </p>
     */
    private java.util.Date timeStamp;
    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     */
    private Double last;
    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The average value of the metric.
     * </p>
     */
    private Double avg;
    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     */
    private Double stdDev;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     * 
     * @param timeStamp
     *        When the metric was last updated.
     */

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     * 
     * @return When the metric was last updated.
     */

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     * 
     * @param timeStamp
     *        When the metric was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withTimeStamp(java.util.Date timeStamp) {
        setTimeStamp(timeStamp);
        return this;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     * 
     * @param max
     *        The maximum value of the metric.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     * 
     * @return The maximum value of the metric.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     * 
     * @param max
     *        The maximum value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     * 
     * @param min
     *        The minimum value of the metric.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     * 
     * @return The minimum value of the metric.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     * 
     * @param min
     *        The minimum value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     * 
     * @param last
     *        The most recent value of the metric.
     */

    public void setLast(Double last) {
        this.last = last;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     * 
     * @return The most recent value of the metric.
     */

    public Double getLast() {
        return this.last;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     * 
     * @param last
     *        The most recent value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withLast(Double last) {
        setLast(last);
        return this;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     * 
     * @param count
     *        The number of samples used to generate the metric.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     * 
     * @return The number of samples used to generate the metric.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     * 
     * @param count
     *        The number of samples used to generate the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     * 
     * @param avg
     *        The average value of the metric.
     */

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     * 
     * @return The average value of the metric.
     */

    public Double getAvg() {
        return this.avg;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     * 
     * @param avg
     *        The average value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withAvg(Double avg) {
        setAvg(avg);
        return this;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     * 
     * @param stdDev
     *        The standard deviation of the metric.
     */

    public void setStdDev(Double stdDev) {
        this.stdDev = stdDev;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     * 
     * @return The standard deviation of the metric.
     */

    public Double getStdDev() {
        return this.stdDev;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     * 
     * @param stdDev
     *        The standard deviation of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentMetricSummary withStdDev(Double stdDev) {
        setStdDev(stdDev);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTimeStamp() != null)
            sb.append("TimeStamp: ").append(getTimeStamp()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getLast() != null)
            sb.append("Last: ").append(getLast()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getAvg() != null)
            sb.append("Avg: ").append(getAvg()).append(",");
        if (getStdDev() != null)
            sb.append("StdDev: ").append(getStdDev());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentMetricSummary == false)
            return false;
        TrialComponentMetricSummary other = (TrialComponentMetricSummary) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getAvg() == null ^ this.getAvg() == null)
            return false;
        if (other.getAvg() != null && other.getAvg().equals(this.getAvg()) == false)
            return false;
        if (other.getStdDev() == null ^ this.getStdDev() == null)
            return false;
        if (other.getStdDev() != null && other.getStdDev().equals(this.getStdDev()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getAvg() == null) ? 0 : getAvg().hashCode());
        hashCode = prime * hashCode + ((getStdDev() == null) ? 0 : getStdDev().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentMetricSummary clone() {
        try {
            return (TrialComponentMetricSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentMetricSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
