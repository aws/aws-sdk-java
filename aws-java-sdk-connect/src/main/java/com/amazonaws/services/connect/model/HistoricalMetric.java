/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>HistoricalMetric</code> object that contains the Name, Unit, Statistic, and Threshold for the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HistoricalMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoricalMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the historical metric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     */
    private Threshold threshold;
    /**
     * <p>
     * The statistic for the metric.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The unit for the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the historical metric.
     * </p>
     * 
     * @param name
     *        The name of the historical metric.
     * @see HistoricalMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the historical metric.
     * </p>
     * 
     * @return The name of the historical metric.
     * @see HistoricalMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the historical metric.
     * </p>
     * 
     * @param name
     *        The name of the historical metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoricalMetricName
     */

    public HistoricalMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the historical metric.
     * </p>
     * 
     * @param name
     *        The name of the historical metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoricalMetricName
     */

    public HistoricalMetric withName(HistoricalMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     * 
     * @param threshold
     *        The threshold for the metric, used with service level metrics.
     */

    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     * 
     * @return The threshold for the metric, used with service level metrics.
     */

    public Threshold getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     * 
     * @param threshold
     *        The threshold for the metric, used with service level metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetric withThreshold(Threshold threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @return The statistic for the metric.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public HistoricalMetric withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public HistoricalMetric withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @return The unit for the metric.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public HistoricalMetric withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public HistoricalMetric withUnit(Unit unit) {
        this.unit = unit.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoricalMetric == false)
            return false;
        HistoricalMetric other = (HistoricalMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public HistoricalMetric clone() {
        try {
            return (HistoricalMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HistoricalMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
