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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the projected metrics of an Amazon ECS service recommendation option.
 * </p>
 * <p>
 * To determine the performance difference between your current ECS service and the recommended option, compare the
 * metric data of your service against its projected metric data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSServiceProjectedMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceProjectedMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the projected metric.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The timestamps of the projected metric.
     * </p>
     */
    private java.util.List<java.util.Date> timestamps;
    /**
     * <p>
     * The upper bound values for the projected metric.
     * </p>
     */
    private java.util.List<Double> upperBoundValues;
    /**
     * <p>
     * The lower bound values for the projected metric.
     * </p>
     */
    private java.util.List<Double> lowerBoundValues;

    /**
     * <p>
     * The name of the projected metric.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected metric. </p>
     *        <p>
     *        The following metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @see ECSServiceMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the projected metric.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the projected metric. </p>
     *         <p>
     *         The following metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *         tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *         </p>
     *         </li>
     * @see ECSServiceMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the projected metric.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected metric. </p>
     *        <p>
     *        The following metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricName
     */

    public ECSServiceProjectedMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the projected metric.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected metric. </p>
     *        <p>
     *        The following metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricName
     */

    public ECSServiceProjectedMetric withName(ECSServiceMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The timestamps of the projected metric.
     * </p>
     * 
     * @return The timestamps of the projected metric.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * The timestamps of the projected metric.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of the projected metric.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The timestamps of the projected metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The timestamps of the projected metric.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * The upper bound values for the projected metric.
     * </p>
     * 
     * @return The upper bound values for the projected metric.
     */

    public java.util.List<Double> getUpperBoundValues() {
        return upperBoundValues;
    }

    /**
     * <p>
     * The upper bound values for the projected metric.
     * </p>
     * 
     * @param upperBoundValues
     *        The upper bound values for the projected metric.
     */

    public void setUpperBoundValues(java.util.Collection<Double> upperBoundValues) {
        if (upperBoundValues == null) {
            this.upperBoundValues = null;
            return;
        }

        this.upperBoundValues = new java.util.ArrayList<Double>(upperBoundValues);
    }

    /**
     * <p>
     * The upper bound values for the projected metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpperBoundValues(java.util.Collection)} or {@link #withUpperBoundValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param upperBoundValues
     *        The upper bound values for the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withUpperBoundValues(Double... upperBoundValues) {
        if (this.upperBoundValues == null) {
            setUpperBoundValues(new java.util.ArrayList<Double>(upperBoundValues.length));
        }
        for (Double ele : upperBoundValues) {
            this.upperBoundValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The upper bound values for the projected metric.
     * </p>
     * 
     * @param upperBoundValues
     *        The upper bound values for the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withUpperBoundValues(java.util.Collection<Double> upperBoundValues) {
        setUpperBoundValues(upperBoundValues);
        return this;
    }

    /**
     * <p>
     * The lower bound values for the projected metric.
     * </p>
     * 
     * @return The lower bound values for the projected metric.
     */

    public java.util.List<Double> getLowerBoundValues() {
        return lowerBoundValues;
    }

    /**
     * <p>
     * The lower bound values for the projected metric.
     * </p>
     * 
     * @param lowerBoundValues
     *        The lower bound values for the projected metric.
     */

    public void setLowerBoundValues(java.util.Collection<Double> lowerBoundValues) {
        if (lowerBoundValues == null) {
            this.lowerBoundValues = null;
            return;
        }

        this.lowerBoundValues = new java.util.ArrayList<Double>(lowerBoundValues);
    }

    /**
     * <p>
     * The lower bound values for the projected metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLowerBoundValues(java.util.Collection)} or {@link #withLowerBoundValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lowerBoundValues
     *        The lower bound values for the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withLowerBoundValues(Double... lowerBoundValues) {
        if (this.lowerBoundValues == null) {
            setLowerBoundValues(new java.util.ArrayList<Double>(lowerBoundValues.length));
        }
        for (Double ele : lowerBoundValues) {
            this.lowerBoundValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The lower bound values for the projected metric.
     * </p>
     * 
     * @param lowerBoundValues
     *        The lower bound values for the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedMetric withLowerBoundValues(java.util.Collection<Double> lowerBoundValues) {
        setLowerBoundValues(lowerBoundValues);
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
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getUpperBoundValues() != null)
            sb.append("UpperBoundValues: ").append(getUpperBoundValues()).append(",");
        if (getLowerBoundValues() != null)
            sb.append("LowerBoundValues: ").append(getLowerBoundValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSServiceProjectedMetric == false)
            return false;
        ECSServiceProjectedMetric other = (ECSServiceProjectedMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getUpperBoundValues() == null ^ this.getUpperBoundValues() == null)
            return false;
        if (other.getUpperBoundValues() != null && other.getUpperBoundValues().equals(this.getUpperBoundValues()) == false)
            return false;
        if (other.getLowerBoundValues() == null ^ this.getLowerBoundValues() == null)
            return false;
        if (other.getLowerBoundValues() != null && other.getLowerBoundValues().equals(this.getLowerBoundValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getUpperBoundValues() == null) ? 0 : getUpperBoundValues().hashCode());
        hashCode = prime * hashCode + ((getLowerBoundValues() == null) ? 0 : getLowerBoundValues().hashCode());
        return hashCode;
    }

    @Override
    public ECSServiceProjectedMetric clone() {
        try {
            return (ECSServiceProjectedMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSServiceProjectedMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
