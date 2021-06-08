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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a predictive scaling policy configuration to use with Amazon EC2 Auto Scaling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PredictiveScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictiveScalingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * </p>
     * <p>
     * This is an array, but we currently only support a single metric specification. That is, you can specify a target
     * value and a single metric pair, or a target value and one scaling metric and one load metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification> metricSpecifications;
    /**
     * <p>
     * The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The amount of time, in seconds, by which the instance launch time can be advanced. For example, the forecast says
     * to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that case, the instances
     * will be launched at 9:55 AM. The intention is to give resources time to be provisioned. It can take a few minutes
     * to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the
     * instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300 seconds
     * if not specified.
     * </p>
     */
    private Integer schedulingBufferTime;
    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     * capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     * capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by
     * the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String maxCapacityBreachBehavior;
    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed
     * forecast capacity.
     * </p>
     * <p>
     * Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>, and
     * cannot be used otherwise.
     * </p>
     */
    private Integer maxCapacityBuffer;

    /**
     * <p>
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * </p>
     * <p>
     * This is an array, but we currently only support a single metric specification. That is, you can specify a target
     * value and a single metric pair, or a target value and one scaling metric and one load metric.
     * </p>
     * 
     * @return This structure includes the metrics and target utilization to use for predictive scaling. </p>
     *         <p>
     *         This is an array, but we currently only support a single metric specification. That is, you can specify a
     *         target value and a single metric pair, or a target value and one scaling metric and one load metric.
     */

    public java.util.List<PredictiveScalingMetricSpecification> getMetricSpecifications() {
        if (metricSpecifications == null) {
            metricSpecifications = new com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification>();
        }
        return metricSpecifications;
    }

    /**
     * <p>
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * </p>
     * <p>
     * This is an array, but we currently only support a single metric specification. That is, you can specify a target
     * value and a single metric pair, or a target value and one scaling metric and one load metric.
     * </p>
     * 
     * @param metricSpecifications
     *        This structure includes the metrics and target utilization to use for predictive scaling. </p>
     *        <p>
     *        This is an array, but we currently only support a single metric specification. That is, you can specify a
     *        target value and a single metric pair, or a target value and one scaling metric and one load metric.
     */

    public void setMetricSpecifications(java.util.Collection<PredictiveScalingMetricSpecification> metricSpecifications) {
        if (metricSpecifications == null) {
            this.metricSpecifications = null;
            return;
        }

        this.metricSpecifications = new com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification>(metricSpecifications);
    }

    /**
     * <p>
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * </p>
     * <p>
     * This is an array, but we currently only support a single metric specification. That is, you can specify a target
     * value and a single metric pair, or a target value and one scaling metric and one load metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricSpecifications(java.util.Collection)} or {@link #withMetricSpecifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param metricSpecifications
     *        This structure includes the metrics and target utilization to use for predictive scaling. </p>
     *        <p>
     *        This is an array, but we currently only support a single metric specification. That is, you can specify a
     *        target value and a single metric pair, or a target value and one scaling metric and one load metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingConfiguration withMetricSpecifications(PredictiveScalingMetricSpecification... metricSpecifications) {
        if (this.metricSpecifications == null) {
            setMetricSpecifications(new com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification>(metricSpecifications.length));
        }
        for (PredictiveScalingMetricSpecification ele : metricSpecifications) {
            this.metricSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * </p>
     * <p>
     * This is an array, but we currently only support a single metric specification. That is, you can specify a target
     * value and a single metric pair, or a target value and one scaling metric and one load metric.
     * </p>
     * 
     * @param metricSpecifications
     *        This structure includes the metrics and target utilization to use for predictive scaling. </p>
     *        <p>
     *        This is an array, but we currently only support a single metric specification. That is, you can specify a
     *        target value and a single metric pair, or a target value and one scaling metric and one load metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingConfiguration withMetricSpecifications(java.util.Collection<PredictiveScalingMetricSpecification> metricSpecifications) {
        setMetricSpecifications(metricSpecifications);
        return this;
    }

    /**
     * <p>
     * The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * </p>
     * 
     * @param mode
     *        The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * @see PredictiveScalingMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * </p>
     * 
     * @return The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * @see PredictiveScalingMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * </p>
     * 
     * @param mode
     *        The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMode
     */

    public PredictiveScalingConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * </p>
     * 
     * @param mode
     *        The predictive scaling mode. Defaults to <code>ForecastOnly</code> if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMode
     */

    public PredictiveScalingConfiguration withMode(PredictiveScalingMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, by which the instance launch time can be advanced. For example, the forecast says
     * to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that case, the instances
     * will be launched at 9:55 AM. The intention is to give resources time to be provisioned. It can take a few minutes
     * to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the
     * instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300 seconds
     * if not specified.
     * </p>
     * 
     * @param schedulingBufferTime
     *        The amount of time, in seconds, by which the instance launch time can be advanced. For example, the
     *        forecast says to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that
     *        case, the instances will be launched at 9:55 AM. The intention is to give resources time to be
     *        provisioned. It can take a few minutes to launch an EC2 instance. The actual amount of time required
     *        depends on several factors, such as the size of the instance and whether there are startup scripts to
     *        complete. </p>
     *        <p>
     *        The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300
     *        seconds if not specified.
     */

    public void setSchedulingBufferTime(Integer schedulingBufferTime) {
        this.schedulingBufferTime = schedulingBufferTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, by which the instance launch time can be advanced. For example, the forecast says
     * to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that case, the instances
     * will be launched at 9:55 AM. The intention is to give resources time to be provisioned. It can take a few minutes
     * to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the
     * instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300 seconds
     * if not specified.
     * </p>
     * 
     * @return The amount of time, in seconds, by which the instance launch time can be advanced. For example, the
     *         forecast says to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that
     *         case, the instances will be launched at 9:55 AM. The intention is to give resources time to be
     *         provisioned. It can take a few minutes to launch an EC2 instance. The actual amount of time required
     *         depends on several factors, such as the size of the instance and whether there are startup scripts to
     *         complete. </p>
     *         <p>
     *         The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300
     *         seconds if not specified.
     */

    public Integer getSchedulingBufferTime() {
        return this.schedulingBufferTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, by which the instance launch time can be advanced. For example, the forecast says
     * to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that case, the instances
     * will be launched at 9:55 AM. The intention is to give resources time to be provisioned. It can take a few minutes
     * to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the
     * instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300 seconds
     * if not specified.
     * </p>
     * 
     * @param schedulingBufferTime
     *        The amount of time, in seconds, by which the instance launch time can be advanced. For example, the
     *        forecast says to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that
     *        case, the instances will be launched at 9:55 AM. The intention is to give resources time to be
     *        provisioned. It can take a few minutes to launch an EC2 instance. The actual amount of time required
     *        depends on several factors, such as the size of the instance and whether there are startup scripts to
     *        complete. </p>
     *        <p>
     *        The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300
     *        seconds if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingConfiguration withSchedulingBufferTime(Integer schedulingBufferTime) {
        setSchedulingBufferTime(schedulingBufferTime);
        return this;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     * capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     * capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by
     * the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacityBreachBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     *        capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     *        capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is
     *        determined by the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     *        </p>
     *        </li>
     * @see PredictiveScalingMaxCapacityBreachBehavior
     */

    public void setMaxCapacityBreachBehavior(String maxCapacityBreachBehavior) {
        this.maxCapacityBreachBehavior = maxCapacityBreachBehavior;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     * capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     * capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by
     * the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *         capacity of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.</p>
     *         <p>
     *         The following are possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     *         capacity. The maximum capacity is enforced as a hard limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     *         capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is
     *         determined by the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     *         </p>
     *         </li>
     * @see PredictiveScalingMaxCapacityBreachBehavior
     */

    public String getMaxCapacityBreachBehavior() {
        return this.maxCapacityBreachBehavior;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     * capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     * capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by
     * the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacityBreachBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     *        capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     *        capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is
     *        determined by the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMaxCapacityBreachBehavior
     */

    public PredictiveScalingConfiguration withMaxCapacityBreachBehavior(String maxCapacityBreachBehavior) {
        setMaxCapacityBreachBehavior(maxCapacityBreachBehavior);
        return this;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     * capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     * capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by
     * the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacityBreachBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity of the Auto Scaling group. Defaults to <code>HonorMaxCapacity</code> if not specified.</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HonorMaxCapacity</code> - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum
     *        capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncreaseMaxCapacity</code> - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum
     *        capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is
     *        determined by the forecasted capacity and the value for <code>MaxCapacityBuffer</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMaxCapacityBreachBehavior
     */

    public PredictiveScalingConfiguration withMaxCapacityBreachBehavior(PredictiveScalingMaxCapacityBreachBehavior maxCapacityBreachBehavior) {
        this.maxCapacityBreachBehavior = maxCapacityBreachBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed
     * forecast capacity.
     * </p>
     * <p>
     * Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>, and
     * cannot be used otherwise.
     * </p>
     * 
     * @param maxCapacityBuffer
     *        The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *        capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *        buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *        capacity is 40, then the effective maximum capacity is 55.</p>
     *        <p>
     *        If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not
     *        exceed forecast capacity.
     *        </p>
     *        <p>
     *        Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>
     *        , and cannot be used otherwise.
     */

    public void setMaxCapacityBuffer(Integer maxCapacityBuffer) {
        this.maxCapacityBuffer = maxCapacityBuffer;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed
     * forecast capacity.
     * </p>
     * <p>
     * Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>, and
     * cannot be used otherwise.
     * </p>
     * 
     * @return The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *         capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *         buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *         capacity is 40, then the effective maximum capacity is 55.</p>
     *         <p>
     *         If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not
     *         exceed forecast capacity.
     *         </p>
     *         <p>
     *         Required if the <code>MaxCapacityBreachBehavior</code> property is set to
     *         <code>IncreaseMaxCapacity</code>, and cannot be used otherwise.
     */

    public Integer getMaxCapacityBuffer() {
        return this.maxCapacityBuffer;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed
     * forecast capacity.
     * </p>
     * <p>
     * Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>, and
     * cannot be used otherwise.
     * </p>
     * 
     * @param maxCapacityBuffer
     *        The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *        capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *        buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *        capacity is 40, then the effective maximum capacity is 55.</p>
     *        <p>
     *        If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not
     *        exceed forecast capacity.
     *        </p>
     *        <p>
     *        Required if the <code>MaxCapacityBreachBehavior</code> property is set to <code>IncreaseMaxCapacity</code>
     *        , and cannot be used otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingConfiguration withMaxCapacityBuffer(Integer maxCapacityBuffer) {
        setMaxCapacityBuffer(maxCapacityBuffer);
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
        if (getMetricSpecifications() != null)
            sb.append("MetricSpecifications: ").append(getMetricSpecifications()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getSchedulingBufferTime() != null)
            sb.append("SchedulingBufferTime: ").append(getSchedulingBufferTime()).append(",");
        if (getMaxCapacityBreachBehavior() != null)
            sb.append("MaxCapacityBreachBehavior: ").append(getMaxCapacityBreachBehavior()).append(",");
        if (getMaxCapacityBuffer() != null)
            sb.append("MaxCapacityBuffer: ").append(getMaxCapacityBuffer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictiveScalingConfiguration == false)
            return false;
        PredictiveScalingConfiguration other = (PredictiveScalingConfiguration) obj;
        if (other.getMetricSpecifications() == null ^ this.getMetricSpecifications() == null)
            return false;
        if (other.getMetricSpecifications() != null && other.getMetricSpecifications().equals(this.getMetricSpecifications()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getSchedulingBufferTime() == null ^ this.getSchedulingBufferTime() == null)
            return false;
        if (other.getSchedulingBufferTime() != null && other.getSchedulingBufferTime().equals(this.getSchedulingBufferTime()) == false)
            return false;
        if (other.getMaxCapacityBreachBehavior() == null ^ this.getMaxCapacityBreachBehavior() == null)
            return false;
        if (other.getMaxCapacityBreachBehavior() != null && other.getMaxCapacityBreachBehavior().equals(this.getMaxCapacityBreachBehavior()) == false)
            return false;
        if (other.getMaxCapacityBuffer() == null ^ this.getMaxCapacityBuffer() == null)
            return false;
        if (other.getMaxCapacityBuffer() != null && other.getMaxCapacityBuffer().equals(this.getMaxCapacityBuffer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricSpecifications() == null) ? 0 : getMetricSpecifications().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getSchedulingBufferTime() == null) ? 0 : getSchedulingBufferTime().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacityBreachBehavior() == null) ? 0 : getMaxCapacityBreachBehavior().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacityBuffer() == null) ? 0 : getMaxCapacityBuffer().hashCode());
        return hashCode;
    }

    @Override
    public PredictiveScalingConfiguration clone() {
        try {
            return (PredictiveScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
