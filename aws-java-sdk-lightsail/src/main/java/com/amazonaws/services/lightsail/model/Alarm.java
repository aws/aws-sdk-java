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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an alarm.
 * </p>
 * <p>
 * An alarm is a way to monitor your Amazon Lightsail resource metrics. For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms in Amazon
 * Lightsail</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Alarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alarm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the alarm.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail alarm.
     * This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * An object that lists information about the resource monitored by the alarm.
     * </p>
     */
    private MonitoredResourceInfo monitoredResourceInfo;
    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and threshold.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The number of data points that must not within the specified threshold to trigger the alarm.
     * </p>
     */
    private Integer datapointsToAlarm;
    /**
     * <p>
     * Specifies how the alarm handles missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards the
     * number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count towards
     * the number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> — Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     */
    private String treatMissingData;
    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private String statistic;
    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The current state of the alarm.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     */
    private java.util.List<String> contactProtocols;
    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     */
    private java.util.List<String> notificationTriggers;
    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     */
    private Boolean notificationEnabled;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param name
     *        The name of the alarm.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @return The name of the alarm.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param name
     *        The name of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the alarm.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alarm.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the alarm was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     * 
     * @return The timestamp when the alarm was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the alarm was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     * 
     * @param location
     *        An object that lists information about the location of the alarm.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     * 
     * @return An object that lists information about the location of the alarm.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     * 
     * @param location
     *        An object that lists information about the location of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Alarm</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>Alarm</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Alarm</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Alarm withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Alarm</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Alarm withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail alarm.
     * This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        alarm. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail alarm.
     * This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         alarm. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail alarm.
     * This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        alarm. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the alarm.
     * </p>
     * 
     * @param monitoredResourceInfo
     *        An object that lists information about the resource monitored by the alarm.
     */

    public void setMonitoredResourceInfo(MonitoredResourceInfo monitoredResourceInfo) {
        this.monitoredResourceInfo = monitoredResourceInfo;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the alarm.
     * </p>
     * 
     * @return An object that lists information about the resource monitored by the alarm.
     */

    public MonitoredResourceInfo getMonitoredResourceInfo() {
        return this.monitoredResourceInfo;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the alarm.
     * </p>
     * 
     * @param monitoredResourceInfo
     *        An object that lists information about the resource monitored by the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withMonitoredResourceInfo(MonitoredResourceInfo monitoredResourceInfo) {
        setMonitoredResourceInfo(monitoredResourceInfo);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified statistic and threshold.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and threshold.
     * </p>
     * 
     * @return The arithmetic operation used when comparing the specified statistic and threshold.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified statistic and threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Alarm withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified statistic and threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Alarm withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @return The number of periods over which data is compared to the specified threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @return The period, in seconds, over which the statistic is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @return The value against which the specified statistic is compared.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to trigger the alarm.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of data points that must not within the specified threshold to trigger the alarm.
     */

    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to trigger the alarm.
     * </p>
     * 
     * @return The number of data points that must not within the specified threshold to trigger the alarm.
     */

    public Integer getDatapointsToAlarm() {
        return this.datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to trigger the alarm.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of data points that must not within the specified threshold to trigger the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withDatapointsToAlarm(Integer datapointsToAlarm) {
        setDatapointsToAlarm(datapointsToAlarm);
        return this;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards the
     * number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count towards
     * the number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> — Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatMissingData
     *        Specifies how the alarm handles missing data points.</p>
     *        <p>
     *        An alarm can treat missing data in the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards
     *        the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count
     *        towards the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>missing</code> — Missing data is treated as missing.
     *        </p>
     *        </li>
     * @see TreatMissingData
     */

    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards the
     * number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count towards
     * the number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> — Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how the alarm handles missing data points.</p>
     *         <p>
     *         An alarm can treat missing data in the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards
     *         the number of times the metric is not within the threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count
     *         towards the number of times the metric is not within the threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>missing</code> — Missing data is treated as missing.
     *         </p>
     *         </li>
     * @see TreatMissingData
     */

    public String getTreatMissingData() {
        return this.treatMissingData;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards the
     * number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count towards
     * the number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> — Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatMissingData
     *        Specifies how the alarm handles missing data points.</p>
     *        <p>
     *        An alarm can treat missing data in the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards
     *        the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count
     *        towards the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>missing</code> — Missing data is treated as missing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TreatMissingData
     */

    public Alarm withTreatMissingData(String treatMissingData) {
        setTreatMissingData(treatMissingData);
        return this;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards the
     * number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count towards
     * the number of times the metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> — Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatMissingData
     *        Specifies how the alarm handles missing data points.</p>
     *        <p>
     *        An alarm can treat missing data in the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>breaching</code> — Assume the missing data is not within the threshold. Missing data counts towards
     *        the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>notBreaching</code> — Assume the missing data is within the threshold. Missing data does not count
     *        towards the number of times the metric is not within the threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ignore</code> — Ignore the missing data. Maintains the current alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>missing</code> — Missing data is treated as missing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TreatMissingData
     */

    public Alarm withTreatMissingData(TreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @see MetricStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The statistic for the metric associated with the alarm.</p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *         low volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> — The highest value observed during the specified period. Use this value to
     *         determine high volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> — All values submitted for the matching metric added together. You can use this
     *         statistic to determine the total volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *         statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *         the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *         or decrease your resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *         </p>
     *         </li>
     * @see MetricStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public Alarm withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public Alarm withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm.
     * @see MetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @return The name of the metric associated with the alarm.
     * @see MetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public Alarm withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public Alarm withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the alarm.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the alarm.</p>
     *        <p>
     *        An alarm has the following possible states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @see AlarmState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the alarm.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the alarm.</p>
     *         <p>
     *         An alarm has the following possible states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM</code> — The metric is outside of the defined threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *         data is available for the metric to determine the alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OK</code> — The metric is within the defined threshold.
     *         </p>
     *         </li>
     * @see AlarmState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the alarm.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the alarm.</p>
     *        <p>
     *        An alarm has the following possible states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public Alarm withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the alarm.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the alarm.</p>
     *        <p>
     *        An alarm has the following possible states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public Alarm withState(AlarmState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @return The unit of the metric associated with the alarm.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public Alarm withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public Alarm withUnit(MetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     * 
     * @return The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or
     *         both.
     * @see ContactProtocol
     */

    public java.util.List<String> getContactProtocols() {
        return contactProtocols;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     * 
     * @param contactProtocols
     *        The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or
     *        both.
     * @see ContactProtocol
     */

    public void setContactProtocols(java.util.Collection<String> contactProtocols) {
        if (contactProtocols == null) {
            this.contactProtocols = null;
            return;
        }

        this.contactProtocols = new java.util.ArrayList<String>(contactProtocols);
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactProtocols(java.util.Collection)} or {@link #withContactProtocols(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contactProtocols
     *        The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public Alarm withContactProtocols(String... contactProtocols) {
        if (this.contactProtocols == null) {
            setContactProtocols(new java.util.ArrayList<String>(contactProtocols.length));
        }
        for (String ele : contactProtocols) {
            this.contactProtocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     * 
     * @param contactProtocols
     *        The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public Alarm withContactProtocols(java.util.Collection<String> contactProtocols) {
        setContactProtocols(contactProtocols);
        return this;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or both.
     * </p>
     * 
     * @param contactProtocols
     *        The contact protocols for the alarm, such as <code>Email</code>, <code>SMS</code> (text messaging), or
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public Alarm withContactProtocols(ContactProtocol... contactProtocols) {
        java.util.ArrayList<String> contactProtocolsCopy = new java.util.ArrayList<String>(contactProtocols.length);
        for (ContactProtocol value : contactProtocols) {
            contactProtocolsCopy.add(value.toString());
        }
        if (getContactProtocols() == null) {
            setContactProtocols(contactProtocolsCopy);
        } else {
            getContactProtocols().addAll(contactProtocolsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * 
     * @return The alarm states that trigger a notification.
     * @see AlarmState
     */

    public java.util.List<String> getNotificationTriggers() {
        return notificationTriggers;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * 
     * @param notificationTriggers
     *        The alarm states that trigger a notification.
     * @see AlarmState
     */

    public void setNotificationTriggers(java.util.Collection<String> notificationTriggers) {
        if (notificationTriggers == null) {
            this.notificationTriggers = null;
            return;
        }

        this.notificationTriggers = new java.util.ArrayList<String>(notificationTriggers);
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationTriggers(java.util.Collection)} or {@link #withNotificationTriggers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationTriggers
     *        The alarm states that trigger a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public Alarm withNotificationTriggers(String... notificationTriggers) {
        if (this.notificationTriggers == null) {
            setNotificationTriggers(new java.util.ArrayList<String>(notificationTriggers.length));
        }
        for (String ele : notificationTriggers) {
            this.notificationTriggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * 
     * @param notificationTriggers
     *        The alarm states that trigger a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public Alarm withNotificationTriggers(java.util.Collection<String> notificationTriggers) {
        setNotificationTriggers(notificationTriggers);
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * 
     * @param notificationTriggers
     *        The alarm states that trigger a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public Alarm withNotificationTriggers(AlarmState... notificationTriggers) {
        java.util.ArrayList<String> notificationTriggersCopy = new java.util.ArrayList<String>(notificationTriggers.length);
        for (AlarmState value : notificationTriggers) {
            notificationTriggersCopy.add(value.toString());
        }
        if (getNotificationTriggers() == null) {
            setNotificationTriggers(notificationTriggersCopy);
        } else {
            getNotificationTriggers().addAll(notificationTriggersCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * 
     * @param notificationEnabled
     *        Indicates whether the alarm is enabled.
     */

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * 
     * @return Indicates whether the alarm is enabled.
     */

    public Boolean getNotificationEnabled() {
        return this.notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * 
     * @param notificationEnabled
     *        Indicates whether the alarm is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withNotificationEnabled(Boolean notificationEnabled) {
        setNotificationEnabled(notificationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * 
     * @return Indicates whether the alarm is enabled.
     */

    public Boolean isNotificationEnabled() {
        return this.notificationEnabled;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getMonitoredResourceInfo() != null)
            sb.append("MonitoredResourceInfo: ").append(getMonitoredResourceInfo()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getDatapointsToAlarm() != null)
            sb.append("DatapointsToAlarm: ").append(getDatapointsToAlarm()).append(",");
        if (getTreatMissingData() != null)
            sb.append("TreatMissingData: ").append(getTreatMissingData()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getContactProtocols() != null)
            sb.append("ContactProtocols: ").append(getContactProtocols()).append(",");
        if (getNotificationTriggers() != null)
            sb.append("NotificationTriggers: ").append(getNotificationTriggers()).append(",");
        if (getNotificationEnabled() != null)
            sb.append("NotificationEnabled: ").append(getNotificationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alarm == false)
            return false;
        Alarm other = (Alarm) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getMonitoredResourceInfo() == null ^ this.getMonitoredResourceInfo() == null)
            return false;
        if (other.getMonitoredResourceInfo() != null && other.getMonitoredResourceInfo().equals(this.getMonitoredResourceInfo()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getDatapointsToAlarm() == null ^ this.getDatapointsToAlarm() == null)
            return false;
        if (other.getDatapointsToAlarm() != null && other.getDatapointsToAlarm().equals(this.getDatapointsToAlarm()) == false)
            return false;
        if (other.getTreatMissingData() == null ^ this.getTreatMissingData() == null)
            return false;
        if (other.getTreatMissingData() != null && other.getTreatMissingData().equals(this.getTreatMissingData()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getContactProtocols() == null ^ this.getContactProtocols() == null)
            return false;
        if (other.getContactProtocols() != null && other.getContactProtocols().equals(this.getContactProtocols()) == false)
            return false;
        if (other.getNotificationTriggers() == null ^ this.getNotificationTriggers() == null)
            return false;
        if (other.getNotificationTriggers() != null && other.getNotificationTriggers().equals(this.getNotificationTriggers()) == false)
            return false;
        if (other.getNotificationEnabled() == null ^ this.getNotificationEnabled() == null)
            return false;
        if (other.getNotificationEnabled() != null && other.getNotificationEnabled().equals(this.getNotificationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getMonitoredResourceInfo() == null) ? 0 : getMonitoredResourceInfo().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getContactProtocols() == null) ? 0 : getContactProtocols().hashCode());
        hashCode = prime * hashCode + ((getNotificationTriggers() == null) ? 0 : getNotificationTriggers().hashCode());
        hashCode = prime * hashCode + ((getNotificationEnabled() == null) ? 0 : getNotificationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public Alarm clone() {
        try {
            return (Alarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AlarmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
