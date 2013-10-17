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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS OpsWorks starts or stops load-based
 * instances.
 * </p>
 */
public class AutoScalingThresholds implements Serializable {

    /**
     * The number of instances to add or remove when the load exceeds a
     * threshold.
     */
    private Integer instanceCount;

    /**
     * The amount of time, in minutes, that the load must exceed a threshold
     * before more instances are added or removed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer thresholdsWaitTime;

    /**
     * The amount of time (in minutes) after a scaling event occurs that AWS
     * OpsWorks should ignore metrics and not raise any additional scaling
     * events. For example, AWS OpsWorks adds new instances following an
     * upscaling event but the instances won't start reducing the load until
     * they have been booted and configured. There is no point in raising
     * additional scaling events during that operation, which typically takes
     * several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     * AWS OpsWorks to not raise any scaling events long enough to get the
     * new instances online.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer ignoreMetricsTime;

    /**
     * The CPU utilization threshold, as a percent of the available CPU.
     */
    private Double cpuThreshold;

    /**
     * The memory utilization threshold, as a percent of the available
     * memory.
     */
    private Double memoryThreshold;

    /**
     * The load threshold. For more information about how load is computed,
     * see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     * (computing)</a>.
     */
    private Double loadThreshold;

    /**
     * The number of instances to add or remove when the load exceeds a
     * threshold.
     *
     * @return The number of instances to add or remove when the load exceeds a
     *         threshold.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of instances to add or remove when the load exceeds a
     * threshold.
     *
     * @param instanceCount The number of instances to add or remove when the load exceeds a
     *         threshold.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of instances to add or remove when the load exceeds a
     * threshold.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of instances to add or remove when the load exceeds a
     *         threshold.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * The amount of time, in minutes, that the load must exceed a threshold
     * before more instances are added or removed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return The amount of time, in minutes, that the load must exceed a threshold
     *         before more instances are added or removed.
     */
    public Integer getThresholdsWaitTime() {
        return thresholdsWaitTime;
    }
    
    /**
     * The amount of time, in minutes, that the load must exceed a threshold
     * before more instances are added or removed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param thresholdsWaitTime The amount of time, in minutes, that the load must exceed a threshold
     *         before more instances are added or removed.
     */
    public void setThresholdsWaitTime(Integer thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
    }
    
    /**
     * The amount of time, in minutes, that the load must exceed a threshold
     * before more instances are added or removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param thresholdsWaitTime The amount of time, in minutes, that the load must exceed a threshold
     *         before more instances are added or removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withThresholdsWaitTime(Integer thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
        return this;
    }

    /**
     * The amount of time (in minutes) after a scaling event occurs that AWS
     * OpsWorks should ignore metrics and not raise any additional scaling
     * events. For example, AWS OpsWorks adds new instances following an
     * upscaling event but the instances won't start reducing the load until
     * they have been booted and configured. There is no point in raising
     * additional scaling events during that operation, which typically takes
     * several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     * AWS OpsWorks to not raise any scaling events long enough to get the
     * new instances online.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return The amount of time (in minutes) after a scaling event occurs that AWS
     *         OpsWorks should ignore metrics and not raise any additional scaling
     *         events. For example, AWS OpsWorks adds new instances following an
     *         upscaling event but the instances won't start reducing the load until
     *         they have been booted and configured. There is no point in raising
     *         additional scaling events during that operation, which typically takes
     *         several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     *         AWS OpsWorks to not raise any scaling events long enough to get the
     *         new instances online.
     */
    public Integer getIgnoreMetricsTime() {
        return ignoreMetricsTime;
    }
    
    /**
     * The amount of time (in minutes) after a scaling event occurs that AWS
     * OpsWorks should ignore metrics and not raise any additional scaling
     * events. For example, AWS OpsWorks adds new instances following an
     * upscaling event but the instances won't start reducing the load until
     * they have been booted and configured. There is no point in raising
     * additional scaling events during that operation, which typically takes
     * several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     * AWS OpsWorks to not raise any scaling events long enough to get the
     * new instances online.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param ignoreMetricsTime The amount of time (in minutes) after a scaling event occurs that AWS
     *         OpsWorks should ignore metrics and not raise any additional scaling
     *         events. For example, AWS OpsWorks adds new instances following an
     *         upscaling event but the instances won't start reducing the load until
     *         they have been booted and configured. There is no point in raising
     *         additional scaling events during that operation, which typically takes
     *         several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     *         AWS OpsWorks to not raise any scaling events long enough to get the
     *         new instances online.
     */
    public void setIgnoreMetricsTime(Integer ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
    }
    
    /**
     * The amount of time (in minutes) after a scaling event occurs that AWS
     * OpsWorks should ignore metrics and not raise any additional scaling
     * events. For example, AWS OpsWorks adds new instances following an
     * upscaling event but the instances won't start reducing the load until
     * they have been booted and configured. There is no point in raising
     * additional scaling events during that operation, which typically takes
     * several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     * AWS OpsWorks to not raise any scaling events long enough to get the
     * new instances online.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param ignoreMetricsTime The amount of time (in minutes) after a scaling event occurs that AWS
     *         OpsWorks should ignore metrics and not raise any additional scaling
     *         events. For example, AWS OpsWorks adds new instances following an
     *         upscaling event but the instances won't start reducing the load until
     *         they have been booted and configured. There is no point in raising
     *         additional scaling events during that operation, which typically takes
     *         several minutes. <code>IgnoreMetricsTime</code> allows you to direct
     *         AWS OpsWorks to not raise any scaling events long enough to get the
     *         new instances online.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withIgnoreMetricsTime(Integer ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
        return this;
    }

    /**
     * The CPU utilization threshold, as a percent of the available CPU.
     *
     * @return The CPU utilization threshold, as a percent of the available CPU.
     */
    public Double getCpuThreshold() {
        return cpuThreshold;
    }
    
    /**
     * The CPU utilization threshold, as a percent of the available CPU.
     *
     * @param cpuThreshold The CPU utilization threshold, as a percent of the available CPU.
     */
    public void setCpuThreshold(Double cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }
    
    /**
     * The CPU utilization threshold, as a percent of the available CPU.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cpuThreshold The CPU utilization threshold, as a percent of the available CPU.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withCpuThreshold(Double cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * The memory utilization threshold, as a percent of the available
     * memory.
     *
     * @return The memory utilization threshold, as a percent of the available
     *         memory.
     */
    public Double getMemoryThreshold() {
        return memoryThreshold;
    }
    
    /**
     * The memory utilization threshold, as a percent of the available
     * memory.
     *
     * @param memoryThreshold The memory utilization threshold, as a percent of the available
     *         memory.
     */
    public void setMemoryThreshold(Double memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
    }
    
    /**
     * The memory utilization threshold, as a percent of the available
     * memory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memoryThreshold The memory utilization threshold, as a percent of the available
     *         memory.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withMemoryThreshold(Double memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
        return this;
    }

    /**
     * The load threshold. For more information about how load is computed,
     * see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     * (computing)</a>.
     *
     * @return The load threshold. For more information about how load is computed,
     *         see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     *         (computing)</a>.
     */
    public Double getLoadThreshold() {
        return loadThreshold;
    }
    
    /**
     * The load threshold. For more information about how load is computed,
     * see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     * (computing)</a>.
     *
     * @param loadThreshold The load threshold. For more information about how load is computed,
     *         see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     *         (computing)</a>.
     */
    public void setLoadThreshold(Double loadThreshold) {
        this.loadThreshold = loadThreshold;
    }
    
    /**
     * The load threshold. For more information about how load is computed,
     * see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     * (computing)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadThreshold The load threshold. For more information about how load is computed,
     *         see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load
     *         (computing)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingThresholds withLoadThreshold(Double loadThreshold) {
        this.loadThreshold = loadThreshold;
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
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getThresholdsWaitTime() != null) sb.append("ThresholdsWaitTime: " + getThresholdsWaitTime() + ",");
        if (getIgnoreMetricsTime() != null) sb.append("IgnoreMetricsTime: " + getIgnoreMetricsTime() + ",");
        if (getCpuThreshold() != null) sb.append("CpuThreshold: " + getCpuThreshold() + ",");
        if (getMemoryThreshold() != null) sb.append("MemoryThreshold: " + getMemoryThreshold() + ",");
        if (getLoadThreshold() != null) sb.append("LoadThreshold: " + getLoadThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getThresholdsWaitTime() == null) ? 0 : getThresholdsWaitTime().hashCode()); 
        hashCode = prime * hashCode + ((getIgnoreMetricsTime() == null) ? 0 : getIgnoreMetricsTime().hashCode()); 
        hashCode = prime * hashCode + ((getCpuThreshold() == null) ? 0 : getCpuThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getMemoryThreshold() == null) ? 0 : getMemoryThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getLoadThreshold() == null) ? 0 : getLoadThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoScalingThresholds == false) return false;
        AutoScalingThresholds other = (AutoScalingThresholds)obj;
        
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getThresholdsWaitTime() == null ^ this.getThresholdsWaitTime() == null) return false;
        if (other.getThresholdsWaitTime() != null && other.getThresholdsWaitTime().equals(this.getThresholdsWaitTime()) == false) return false; 
        if (other.getIgnoreMetricsTime() == null ^ this.getIgnoreMetricsTime() == null) return false;
        if (other.getIgnoreMetricsTime() != null && other.getIgnoreMetricsTime().equals(this.getIgnoreMetricsTime()) == false) return false; 
        if (other.getCpuThreshold() == null ^ this.getCpuThreshold() == null) return false;
        if (other.getCpuThreshold() != null && other.getCpuThreshold().equals(this.getCpuThreshold()) == false) return false; 
        if (other.getMemoryThreshold() == null ^ this.getMemoryThreshold() == null) return false;
        if (other.getMemoryThreshold() != null && other.getMemoryThreshold().equals(this.getMemoryThreshold()) == false) return false; 
        if (other.getLoadThreshold() == null ^ this.getLoadThreshold() == null) return false;
        if (other.getLoadThreshold() != null && other.getLoadThreshold().equals(this.getLoadThreshold()) == false) return false; 
        return true;
    }
    
}
    