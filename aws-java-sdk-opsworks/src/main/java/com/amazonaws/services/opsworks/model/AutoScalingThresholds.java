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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS
 * OpsWorks Stacks starts or stops load-based instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AutoScalingThresholds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingThresholds implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of instances to add or remove when the load exceeds a threshold.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
     * </p>
     */
    private Integer thresholdsWaitTime;
    /**
     * <p>
     * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and
     * suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling
     * event but the instances won't start reducing the load until they have been booted and configured. There is no
     * point in raising additional scaling events during that operation, which typically takes several minutes.
     * <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to
     * get the new instances online.
     * </p>
     */
    private Integer ignoreMetricsTime;
    /**
     * <p>
     * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     * </p>
     */
    private Double cpuThreshold;
    /**
     * <p>
     * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
     * </p>
     */
    private Double memoryThreshold;
    /**
     * <p>
     * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see <a
     * href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     * </p>
     */
    private Double loadThreshold;
    /**
     * <p>
     * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm
     * names, which are case sensitive and must be in the same region as the stack.
     * </p>
     * <note>
     * <p>
     * To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>. You can
     * either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role
     * manually. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing AWS
     * OpsWorks Stacks to Act on Your Behalf</a>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarms;

    /**
     * <p>
     * The number of instances to add or remove when the load exceeds a threshold.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances to add or remove when the load exceeds a threshold.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances to add or remove when the load exceeds a threshold.
     * </p>
     * 
     * @return The number of instances to add or remove when the load exceeds a threshold.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances to add or remove when the load exceeds a threshold.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances to add or remove when the load exceeds a threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
     * </p>
     * 
     * @param thresholdsWaitTime
     *        The amount of time, in minutes, that the load must exceed a threshold before more instances are added or
     *        removed.
     */

    public void setThresholdsWaitTime(Integer thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
    }

    /**
     * <p>
     * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
     * </p>
     * 
     * @return The amount of time, in minutes, that the load must exceed a threshold before more instances are added or
     *         removed.
     */

    public Integer getThresholdsWaitTime() {
        return this.thresholdsWaitTime;
    }

    /**
     * <p>
     * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
     * </p>
     * 
     * @param thresholdsWaitTime
     *        The amount of time, in minutes, that the load must exceed a threshold before more instances are added or
     *        removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withThresholdsWaitTime(Integer thresholdsWaitTime) {
        setThresholdsWaitTime(thresholdsWaitTime);
        return this;
    }

    /**
     * <p>
     * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and
     * suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling
     * event but the instances won't start reducing the load until they have been booted and configured. There is no
     * point in raising additional scaling events during that operation, which typically takes several minutes.
     * <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to
     * get the new instances online.
     * </p>
     * 
     * @param ignoreMetricsTime
     *        The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore
     *        metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances
     *        following an upscaling event but the instances won't start reducing the load until they have been booted
     *        and configured. There is no point in raising additional scaling events during that operation, which
     *        typically takes several minutes. <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks
     *        to suppress scaling events long enough to get the new instances online.
     */

    public void setIgnoreMetricsTime(Integer ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
    }

    /**
     * <p>
     * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and
     * suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling
     * event but the instances won't start reducing the load until they have been booted and configured. There is no
     * point in raising additional scaling events during that operation, which typically takes several minutes.
     * <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to
     * get the new instances online.
     * </p>
     * 
     * @return The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore
     *         metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances
     *         following an upscaling event but the instances won't start reducing the load until they have been booted
     *         and configured. There is no point in raising additional scaling events during that operation, which
     *         typically takes several minutes. <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks
     *         to suppress scaling events long enough to get the new instances online.
     */

    public Integer getIgnoreMetricsTime() {
        return this.ignoreMetricsTime;
    }

    /**
     * <p>
     * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and
     * suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling
     * event but the instances won't start reducing the load until they have been booted and configured. There is no
     * point in raising additional scaling events during that operation, which typically takes several minutes.
     * <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to
     * get the new instances online.
     * </p>
     * 
     * @param ignoreMetricsTime
     *        The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore
     *        metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances
     *        following an upscaling event but the instances won't start reducing the load until they have been booted
     *        and configured. There is no point in raising additional scaling events during that operation, which
     *        typically takes several minutes. <code>IgnoreMetricsTime</code> allows you to direct AWS OpsWorks Stacks
     *        to suppress scaling events long enough to get the new instances online.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withIgnoreMetricsTime(Integer ignoreMetricsTime) {
        setIgnoreMetricsTime(ignoreMetricsTime);
        return this;
    }

    /**
     * <p>
     * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     * </p>
     * 
     * @param cpuThreshold
     *        The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     */

    public void setCpuThreshold(Double cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    /**
     * <p>
     * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     * </p>
     * 
     * @return The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     */

    public Double getCpuThreshold() {
        return this.cpuThreshold;
    }

    /**
     * <p>
     * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     * </p>
     * 
     * @param cpuThreshold
     *        The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withCpuThreshold(Double cpuThreshold) {
        setCpuThreshold(cpuThreshold);
        return this;
    }

    /**
     * <p>
     * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
     * </p>
     * 
     * @param memoryThreshold
     *        The memory utilization threshold, as a percent of the available memory. A value of -1 disables the
     *        threshold.
     */

    public void setMemoryThreshold(Double memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
    }

    /**
     * <p>
     * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
     * </p>
     * 
     * @return The memory utilization threshold, as a percent of the available memory. A value of -1 disables the
     *         threshold.
     */

    public Double getMemoryThreshold() {
        return this.memoryThreshold;
    }

    /**
     * <p>
     * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
     * </p>
     * 
     * @param memoryThreshold
     *        The memory utilization threshold, as a percent of the available memory. A value of -1 disables the
     *        threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withMemoryThreshold(Double memoryThreshold) {
        setMemoryThreshold(memoryThreshold);
        return this;
    }

    /**
     * <p>
     * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see <a
     * href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     * </p>
     * 
     * @param loadThreshold
     *        The load threshold. A value of -1 disables the threshold. For more information about how load is computed,
     *        see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     */

    public void setLoadThreshold(Double loadThreshold) {
        this.loadThreshold = loadThreshold;
    }

    /**
     * <p>
     * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see <a
     * href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     * </p>
     * 
     * @return The load threshold. A value of -1 disables the threshold. For more information about how load is
     *         computed, see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     */

    public Double getLoadThreshold() {
        return this.loadThreshold;
    }

    /**
     * <p>
     * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see <a
     * href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     * </p>
     * 
     * @param loadThreshold
     *        The load threshold. A value of -1 disables the threshold. For more information about how load is computed,
     *        see <a href="http://en.wikipedia.org/wiki/Load_%28computing%29">Load (computing)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withLoadThreshold(Double loadThreshold) {
        setLoadThreshold(loadThreshold);
        return this;
    }

    /**
     * <p>
     * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm
     * names, which are case sensitive and must be in the same region as the stack.
     * </p>
     * <note>
     * <p>
     * To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>. You can
     * either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role
     * manually. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing AWS
     * OpsWorks Stacks to Act on Your Behalf</a>.
     * </p>
     * </note>
     * 
     * @return Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to
     *         five alarm names, which are case sensitive and must be in the same region as the stack.</p> <note>
     *         <p>
     *         To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>.
     *         You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you
     *         can edit the role manually. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing
     *         AWS OpsWorks Stacks to Act on Your Behalf</a>.
     *         </p>
     */

    public java.util.List<String> getAlarms() {
        if (alarms == null) {
            alarms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarms;
    }

    /**
     * <p>
     * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm
     * names, which are case sensitive and must be in the same region as the stack.
     * </p>
     * <note>
     * <p>
     * To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>. You can
     * either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role
     * manually. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing AWS
     * OpsWorks Stacks to Act on Your Behalf</a>.
     * </p>
     * </note>
     * 
     * @param alarms
     *        Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five
     *        alarm names, which are case sensitive and must be in the same region as the stack.</p> <note>
     *        <p>
     *        To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>.
     *        You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can
     *        edit the role manually. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing
     *        AWS OpsWorks Stacks to Act on Your Behalf</a>.
     *        </p>
     */

    public void setAlarms(java.util.Collection<String> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new com.amazonaws.internal.SdkInternalList<String>(alarms);
    }

    /**
     * <p>
     * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm
     * names, which are case sensitive and must be in the same region as the stack.
     * </p>
     * <note>
     * <p>
     * To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>. You can
     * either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role
     * manually. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing AWS
     * OpsWorks Stacks to Act on Your Behalf</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarms(java.util.Collection)} or {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five
     *        alarm names, which are case sensitive and must be in the same region as the stack.</p> <note>
     *        <p>
     *        To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>.
     *        You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can
     *        edit the role manually. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing
     *        AWS OpsWorks Stacks to Act on Your Behalf</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withAlarms(String... alarms) {
        if (this.alarms == null) {
            setAlarms(new com.amazonaws.internal.SdkInternalList<String>(alarms.length));
        }
        for (String ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm
     * names, which are case sensitive and must be in the same region as the stack.
     * </p>
     * <note>
     * <p>
     * To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>. You can
     * either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role
     * manually. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing AWS
     * OpsWorks Stacks to Act on Your Behalf</a>.
     * </p>
     * </note>
     * 
     * @param alarms
     *        Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five
     *        alarm names, which are case sensitive and must be in the same region as the stack.</p> <note>
     *        <p>
     *        To use custom alarms, you must update your service role to allow <code>cloudwatch:DescribeAlarms</code>.
     *        You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can
     *        edit the role manually. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-servicerole.html">Allowing
     *        AWS OpsWorks Stacks to Act on Your Behalf</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingThresholds withAlarms(java.util.Collection<String> alarms) {
        setAlarms(alarms);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getThresholdsWaitTime() != null)
            sb.append("ThresholdsWaitTime: ").append(getThresholdsWaitTime()).append(",");
        if (getIgnoreMetricsTime() != null)
            sb.append("IgnoreMetricsTime: ").append(getIgnoreMetricsTime()).append(",");
        if (getCpuThreshold() != null)
            sb.append("CpuThreshold: ").append(getCpuThreshold()).append(",");
        if (getMemoryThreshold() != null)
            sb.append("MemoryThreshold: ").append(getMemoryThreshold()).append(",");
        if (getLoadThreshold() != null)
            sb.append("LoadThreshold: ").append(getLoadThreshold()).append(",");
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingThresholds == false)
            return false;
        AutoScalingThresholds other = (AutoScalingThresholds) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getThresholdsWaitTime() == null ^ this.getThresholdsWaitTime() == null)
            return false;
        if (other.getThresholdsWaitTime() != null && other.getThresholdsWaitTime().equals(this.getThresholdsWaitTime()) == false)
            return false;
        if (other.getIgnoreMetricsTime() == null ^ this.getIgnoreMetricsTime() == null)
            return false;
        if (other.getIgnoreMetricsTime() != null && other.getIgnoreMetricsTime().equals(this.getIgnoreMetricsTime()) == false)
            return false;
        if (other.getCpuThreshold() == null ^ this.getCpuThreshold() == null)
            return false;
        if (other.getCpuThreshold() != null && other.getCpuThreshold().equals(this.getCpuThreshold()) == false)
            return false;
        if (other.getMemoryThreshold() == null ^ this.getMemoryThreshold() == null)
            return false;
        if (other.getMemoryThreshold() != null && other.getMemoryThreshold().equals(this.getMemoryThreshold()) == false)
            return false;
        if (other.getLoadThreshold() == null ^ this.getLoadThreshold() == null)
            return false;
        if (other.getLoadThreshold() != null && other.getLoadThreshold().equals(this.getLoadThreshold()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingThresholds clone() {
        try {
            return (AutoScalingThresholds) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.AutoScalingThresholdsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
