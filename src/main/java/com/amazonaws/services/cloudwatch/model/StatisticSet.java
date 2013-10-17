/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>StatisticSet</code> data type describes the <code>StatisticValues</code> component of MetricDatum, and represents a set of statistics that
 * describes a specific metric.
 * </p>
 */
public class StatisticSet implements Serializable {

    /**
     * The number of samples used for the statistic set.
     */
    private Double sampleCount;

    /**
     * The sum of values for the sample set.
     */
    private Double sum;

    /**
     * The minimum value of the sample set.
     */
    private Double minimum;

    /**
     * The maximum value of the sample set.
     */
    private Double maximum;

    /**
     * The number of samples used for the statistic set.
     *
     * @return The number of samples used for the statistic set.
     */
    public Double getSampleCount() {
        return sampleCount;
    }
    
    /**
     * The number of samples used for the statistic set.
     *
     * @param sampleCount The number of samples used for the statistic set.
     */
    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }
    
    /**
     * The number of samples used for the statistic set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sampleCount The number of samples used for the statistic set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StatisticSet withSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }

    /**
     * The sum of values for the sample set.
     *
     * @return The sum of values for the sample set.
     */
    public Double getSum() {
        return sum;
    }
    
    /**
     * The sum of values for the sample set.
     *
     * @param sum The sum of values for the sample set.
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }
    
    /**
     * The sum of values for the sample set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sum The sum of values for the sample set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StatisticSet withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * The minimum value of the sample set.
     *
     * @return The minimum value of the sample set.
     */
    public Double getMinimum() {
        return minimum;
    }
    
    /**
     * The minimum value of the sample set.
     *
     * @param minimum The minimum value of the sample set.
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }
    
    /**
     * The minimum value of the sample set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimum The minimum value of the sample set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StatisticSet withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * The maximum value of the sample set.
     *
     * @return The maximum value of the sample set.
     */
    public Double getMaximum() {
        return maximum;
    }
    
    /**
     * The maximum value of the sample set.
     *
     * @param maximum The maximum value of the sample set.
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }
    
    /**
     * The maximum value of the sample set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maximum The maximum value of the sample set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StatisticSet withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSampleCount() != null) sb.append("SampleCount: " + getSampleCount() + ",");
        if (getSum() != null) sb.append("Sum: " + getSum() + ",");
        if (getMinimum() != null) sb.append("Minimum: " + getMinimum() + ",");
        if (getMaximum() != null) sb.append("Maximum: " + getMaximum() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode()); 
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode()); 
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode()); 
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StatisticSet == false) return false;
        StatisticSet other = (StatisticSet)obj;
        
        if (other.getSampleCount() == null ^ this.getSampleCount() == null) return false;
        if (other.getSampleCount() != null && other.getSampleCount().equals(this.getSampleCount()) == false) return false; 
        if (other.getSum() == null ^ this.getSum() == null) return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false) return false; 
        if (other.getMinimum() == null ^ this.getMinimum() == null) return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false) return false; 
        if (other.getMaximum() == null ^ this.getMaximum() == null) return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false) return false; 
        return true;
    }
    
}
    