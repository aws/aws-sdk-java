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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an anomaly or error with the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/Observation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Observation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The source type of the observation.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     */
    private String sourceARN;
    /**
     * <p>
     * The log group name.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     */
    private java.util.Date lineTime;
    /**
     * <p>
     * The log text of the observation.
     * </p>
     */
    private String logText;
    /**
     * <p>
     * The log filter of the observation.
     * </p>
     */
    private String logFilter;
    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The name of the observation metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The ID of the CloudWatch Event-based observation related to the detected problem.
     * </p>
     */
    private String cloudWatchEventId;
    /**
     * <p>
     * The source of the CloudWatch Event.
     * </p>
     */
    private String cloudWatchEventSource;
    /**
     * <p>
     * The detail type of the CloudWatch Event-based observation, for example,
     * <code>EC2 Instance State-change Notification</code>.
     * </p>
     */
    private String cloudWatchEventDetailType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     * </p>
     */
    private String healthEventArn;
    /**
     * <p>
     * The service to which the AWS Health Event belongs, such as EC2.
     * </p>
     */
    private String healthService;
    /**
     * <p>
     * The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     * </p>
     */
    private String healthEventTypeCode;
    /**
     * <p>
     * The category of the AWS Health event, such as <code>issue</code>.
     * </p>
     */
    private String healthEventTypeCategory;
    /**
     * <p>
     * The description of the AWS Health event provided by the service, such as Amazon EC2.
     * </p>
     */
    private String healthEventDescription;
    /**
     * <p>
     * The deployment ID of the CodeDeploy-based observation related to the detected problem.
     * </p>
     */
    private String codeDeployDeploymentId;
    /**
     * <p>
     * The deployment group to which the CodeDeploy deployment belongs.
     * </p>
     */
    private String codeDeployDeploymentGroup;
    /**
     * <p>
     * The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     * </p>
     */
    private String codeDeployState;
    /**
     * <p>
     * The CodeDeploy application to which the deployment belongs.
     * </p>
     */
    private String codeDeployApplication;
    /**
     * <p>
     * The instance group to which the CodeDeploy instance belongs.
     * </p>
     */
    private String codeDeployInstanceGroupId;
    /**
     * <p>
     * The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     * </p>
     */
    private String ec2State;
    /**
     * <p>
     * The category of an RDS event.
     * </p>
     */
    private String rdsEventCategories;
    /**
     * <p>
     * The message of an RDS event.
     * </p>
     */
    private String rdsEventMessage;
    /**
     * <p>
     * The name of the S3 CloudWatch Event-based observation.
     * </p>
     */
    private String s3EventName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function execution-based observation.
     * </p>
     */
    private String statesExecutionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function-based observation.
     * </p>
     */
    private String statesArn;
    /**
     * <p>
     * The status of the step function-related observation.
     * </p>
     */
    private String statesStatus;
    /**
     * <p>
     * The input to the step function-based observation.
     * </p>
     */
    private String statesInput;
    /**
     * <p>
     * The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     * <code>attachVolume</code>.
     * </p>
     */
    private String ebsEvent;
    /**
     * <p>
     * The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     * </p>
     */
    private String ebsResult;
    /**
     * <p>
     * The cause of an EBS CloudWatch event.
     * </p>
     */
    private String ebsCause;
    /**
     * <p>
     * The request ID of an EBS CloudWatch event.
     * </p>
     */
    private String ebsRequestId;
    /**
     * <p>
     * The X-Ray request fault percentage for this node.
     * </p>
     */
    private Integer xRayFaultPercent;
    /**
     * <p>
     * The X-Ray request throttle percentage for this node.
     * </p>
     */
    private Integer xRayThrottlePercent;
    /**
     * <p>
     * The X-Ray request error percentage for this node.
     * </p>
     */
    private Integer xRayErrorPercent;
    /**
     * <p>
     * The X-Ray request count for this node.
     * </p>
     */
    private Integer xRayRequestCount;
    /**
     * <p>
     * The X-Ray node request average latency for this node.
     * </p>
     */
    private Long xRayRequestAverageLatency;
    /**
     * <p>
     * The name of the X-Ray node.
     * </p>
     */
    private String xRayNodeName;
    /**
     * <p>
     * The type of the X-Ray node.
     * </p>
     */
    private String xRayNodeType;

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @param id
     *        The ID of the observation type.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @return The ID of the observation type.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @param id
     *        The ID of the observation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the observation was first detected, in epoch seconds.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @return The time when the observation was first detected, in epoch seconds.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the observation was first detected, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the observation ended, in epoch seconds.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @return The time when the observation ended, in epoch seconds.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the observation ended, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @param sourceType
     *        The source type of the observation.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @return The source type of the observation.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @param sourceType
     *        The source type of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @param sourceARN
     *        The source resource ARN of the observation.
     */

    public void setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @return The source resource ARN of the observation.
     */

    public String getSourceARN() {
        return this.sourceARN;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @param sourceARN
     *        The source resource ARN of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withSourceARN(String sourceARN) {
        setSourceARN(sourceARN);
        return this;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroup
     *        The log group name.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @return The log group name.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroup
     *        The log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @param lineTime
     *        The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     */

    public void setLineTime(java.util.Date lineTime) {
        this.lineTime = lineTime;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @return The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     */

    public java.util.Date getLineTime() {
        return this.lineTime;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @param lineTime
     *        The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLineTime(java.util.Date lineTime) {
        setLineTime(lineTime);
        return this;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @param logText
     *        The log text of the observation.
     */

    public void setLogText(String logText) {
        this.logText = logText;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @return The log text of the observation.
     */

    public String getLogText() {
        return this.logText;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @param logText
     *        The log text of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLogText(String logText) {
        setLogText(logText);
        return this;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @see LogFilter
     */

    public void setLogFilter(String logFilter) {
        this.logFilter = logFilter;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @return The log filter of the observation.
     * @see LogFilter
     */

    public String getLogFilter() {
        return this.logFilter;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFilter
     */

    public Observation withLogFilter(String logFilter) {
        setLogFilter(logFilter);
        return this;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFilter
     */

    public Observation withLogFilter(LogFilter logFilter) {
        this.logFilter = logFilter.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the observation metric.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @return The namespace of the observation metric.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @param metricName
     *        The name of the observation metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @return The name of the observation metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @param metricName
     *        The name of the observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @param unit
     *        The unit of the source observation metric.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @return The unit of the source observation metric.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @param unit
     *        The unit of the source observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @param value
     *        The value of the source observation metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @return The value of the source observation metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @param value
     *        The value of the source observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The ID of the CloudWatch Event-based observation related to the detected problem.
     * </p>
     * 
     * @param cloudWatchEventId
     *        The ID of the CloudWatch Event-based observation related to the detected problem.
     */

    public void setCloudWatchEventId(String cloudWatchEventId) {
        this.cloudWatchEventId = cloudWatchEventId;
    }

    /**
     * <p>
     * The ID of the CloudWatch Event-based observation related to the detected problem.
     * </p>
     * 
     * @return The ID of the CloudWatch Event-based observation related to the detected problem.
     */

    public String getCloudWatchEventId() {
        return this.cloudWatchEventId;
    }

    /**
     * <p>
     * The ID of the CloudWatch Event-based observation related to the detected problem.
     * </p>
     * 
     * @param cloudWatchEventId
     *        The ID of the CloudWatch Event-based observation related to the detected problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCloudWatchEventId(String cloudWatchEventId) {
        setCloudWatchEventId(cloudWatchEventId);
        return this;
    }

    /**
     * <p>
     * The source of the CloudWatch Event.
     * </p>
     * 
     * @param cloudWatchEventSource
     *        The source of the CloudWatch Event.
     * @see CloudWatchEventSource
     */

    public void setCloudWatchEventSource(String cloudWatchEventSource) {
        this.cloudWatchEventSource = cloudWatchEventSource;
    }

    /**
     * <p>
     * The source of the CloudWatch Event.
     * </p>
     * 
     * @return The source of the CloudWatch Event.
     * @see CloudWatchEventSource
     */

    public String getCloudWatchEventSource() {
        return this.cloudWatchEventSource;
    }

    /**
     * <p>
     * The source of the CloudWatch Event.
     * </p>
     * 
     * @param cloudWatchEventSource
     *        The source of the CloudWatch Event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchEventSource
     */

    public Observation withCloudWatchEventSource(String cloudWatchEventSource) {
        setCloudWatchEventSource(cloudWatchEventSource);
        return this;
    }

    /**
     * <p>
     * The source of the CloudWatch Event.
     * </p>
     * 
     * @param cloudWatchEventSource
     *        The source of the CloudWatch Event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchEventSource
     */

    public Observation withCloudWatchEventSource(CloudWatchEventSource cloudWatchEventSource) {
        this.cloudWatchEventSource = cloudWatchEventSource.toString();
        return this;
    }

    /**
     * <p>
     * The detail type of the CloudWatch Event-based observation, for example,
     * <code>EC2 Instance State-change Notification</code>.
     * </p>
     * 
     * @param cloudWatchEventDetailType
     *        The detail type of the CloudWatch Event-based observation, for example,
     *        <code>EC2 Instance State-change Notification</code>.
     */

    public void setCloudWatchEventDetailType(String cloudWatchEventDetailType) {
        this.cloudWatchEventDetailType = cloudWatchEventDetailType;
    }

    /**
     * <p>
     * The detail type of the CloudWatch Event-based observation, for example,
     * <code>EC2 Instance State-change Notification</code>.
     * </p>
     * 
     * @return The detail type of the CloudWatch Event-based observation, for example,
     *         <code>EC2 Instance State-change Notification</code>.
     */

    public String getCloudWatchEventDetailType() {
        return this.cloudWatchEventDetailType;
    }

    /**
     * <p>
     * The detail type of the CloudWatch Event-based observation, for example,
     * <code>EC2 Instance State-change Notification</code>.
     * </p>
     * 
     * @param cloudWatchEventDetailType
     *        The detail type of the CloudWatch Event-based observation, for example,
     *        <code>EC2 Instance State-change Notification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCloudWatchEventDetailType(String cloudWatchEventDetailType) {
        setCloudWatchEventDetailType(cloudWatchEventDetailType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     * </p>
     * 
     * @param healthEventArn
     *        The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     */

    public void setHealthEventArn(String healthEventArn) {
        this.healthEventArn = healthEventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     */

    public String getHealthEventArn() {
        return this.healthEventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     * </p>
     * 
     * @param healthEventArn
     *        The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withHealthEventArn(String healthEventArn) {
        setHealthEventArn(healthEventArn);
        return this;
    }

    /**
     * <p>
     * The service to which the AWS Health Event belongs, such as EC2.
     * </p>
     * 
     * @param healthService
     *        The service to which the AWS Health Event belongs, such as EC2.
     */

    public void setHealthService(String healthService) {
        this.healthService = healthService;
    }

    /**
     * <p>
     * The service to which the AWS Health Event belongs, such as EC2.
     * </p>
     * 
     * @return The service to which the AWS Health Event belongs, such as EC2.
     */

    public String getHealthService() {
        return this.healthService;
    }

    /**
     * <p>
     * The service to which the AWS Health Event belongs, such as EC2.
     * </p>
     * 
     * @param healthService
     *        The service to which the AWS Health Event belongs, such as EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withHealthService(String healthService) {
        setHealthService(healthService);
        return this;
    }

    /**
     * <p>
     * The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     * </p>
     * 
     * @param healthEventTypeCode
     *        The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     */

    public void setHealthEventTypeCode(String healthEventTypeCode) {
        this.healthEventTypeCode = healthEventTypeCode;
    }

    /**
     * <p>
     * The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     * </p>
     * 
     * @return The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     */

    public String getHealthEventTypeCode() {
        return this.healthEventTypeCode;
    }

    /**
     * <p>
     * The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     * </p>
     * 
     * @param healthEventTypeCode
     *        The type of the AWS Health event, for example, <code>AWS_EC2_POWER_CONNECTIVITY_ISSUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withHealthEventTypeCode(String healthEventTypeCode) {
        setHealthEventTypeCode(healthEventTypeCode);
        return this;
    }

    /**
     * <p>
     * The category of the AWS Health event, such as <code>issue</code>.
     * </p>
     * 
     * @param healthEventTypeCategory
     *        The category of the AWS Health event, such as <code>issue</code>.
     */

    public void setHealthEventTypeCategory(String healthEventTypeCategory) {
        this.healthEventTypeCategory = healthEventTypeCategory;
    }

    /**
     * <p>
     * The category of the AWS Health event, such as <code>issue</code>.
     * </p>
     * 
     * @return The category of the AWS Health event, such as <code>issue</code>.
     */

    public String getHealthEventTypeCategory() {
        return this.healthEventTypeCategory;
    }

    /**
     * <p>
     * The category of the AWS Health event, such as <code>issue</code>.
     * </p>
     * 
     * @param healthEventTypeCategory
     *        The category of the AWS Health event, such as <code>issue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withHealthEventTypeCategory(String healthEventTypeCategory) {
        setHealthEventTypeCategory(healthEventTypeCategory);
        return this;
    }

    /**
     * <p>
     * The description of the AWS Health event provided by the service, such as Amazon EC2.
     * </p>
     * 
     * @param healthEventDescription
     *        The description of the AWS Health event provided by the service, such as Amazon EC2.
     */

    public void setHealthEventDescription(String healthEventDescription) {
        this.healthEventDescription = healthEventDescription;
    }

    /**
     * <p>
     * The description of the AWS Health event provided by the service, such as Amazon EC2.
     * </p>
     * 
     * @return The description of the AWS Health event provided by the service, such as Amazon EC2.
     */

    public String getHealthEventDescription() {
        return this.healthEventDescription;
    }

    /**
     * <p>
     * The description of the AWS Health event provided by the service, such as Amazon EC2.
     * </p>
     * 
     * @param healthEventDescription
     *        The description of the AWS Health event provided by the service, such as Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withHealthEventDescription(String healthEventDescription) {
        setHealthEventDescription(healthEventDescription);
        return this;
    }

    /**
     * <p>
     * The deployment ID of the CodeDeploy-based observation related to the detected problem.
     * </p>
     * 
     * @param codeDeployDeploymentId
     *        The deployment ID of the CodeDeploy-based observation related to the detected problem.
     */

    public void setCodeDeployDeploymentId(String codeDeployDeploymentId) {
        this.codeDeployDeploymentId = codeDeployDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the CodeDeploy-based observation related to the detected problem.
     * </p>
     * 
     * @return The deployment ID of the CodeDeploy-based observation related to the detected problem.
     */

    public String getCodeDeployDeploymentId() {
        return this.codeDeployDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the CodeDeploy-based observation related to the detected problem.
     * </p>
     * 
     * @param codeDeployDeploymentId
     *        The deployment ID of the CodeDeploy-based observation related to the detected problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCodeDeployDeploymentId(String codeDeployDeploymentId) {
        setCodeDeployDeploymentId(codeDeployDeploymentId);
        return this;
    }

    /**
     * <p>
     * The deployment group to which the CodeDeploy deployment belongs.
     * </p>
     * 
     * @param codeDeployDeploymentGroup
     *        The deployment group to which the CodeDeploy deployment belongs.
     */

    public void setCodeDeployDeploymentGroup(String codeDeployDeploymentGroup) {
        this.codeDeployDeploymentGroup = codeDeployDeploymentGroup;
    }

    /**
     * <p>
     * The deployment group to which the CodeDeploy deployment belongs.
     * </p>
     * 
     * @return The deployment group to which the CodeDeploy deployment belongs.
     */

    public String getCodeDeployDeploymentGroup() {
        return this.codeDeployDeploymentGroup;
    }

    /**
     * <p>
     * The deployment group to which the CodeDeploy deployment belongs.
     * </p>
     * 
     * @param codeDeployDeploymentGroup
     *        The deployment group to which the CodeDeploy deployment belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCodeDeployDeploymentGroup(String codeDeployDeploymentGroup) {
        setCodeDeployDeploymentGroup(codeDeployDeploymentGroup);
        return this;
    }

    /**
     * <p>
     * The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     * </p>
     * 
     * @param codeDeployState
     *        The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     */

    public void setCodeDeployState(String codeDeployState) {
        this.codeDeployState = codeDeployState;
    }

    /**
     * <p>
     * The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     * </p>
     * 
     * @return The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     */

    public String getCodeDeployState() {
        return this.codeDeployState;
    }

    /**
     * <p>
     * The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     * </p>
     * 
     * @param codeDeployState
     *        The status of the CodeDeploy deployment, for example <code>SUCCESS</code> or <code> FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCodeDeployState(String codeDeployState) {
        setCodeDeployState(codeDeployState);
        return this;
    }

    /**
     * <p>
     * The CodeDeploy application to which the deployment belongs.
     * </p>
     * 
     * @param codeDeployApplication
     *        The CodeDeploy application to which the deployment belongs.
     */

    public void setCodeDeployApplication(String codeDeployApplication) {
        this.codeDeployApplication = codeDeployApplication;
    }

    /**
     * <p>
     * The CodeDeploy application to which the deployment belongs.
     * </p>
     * 
     * @return The CodeDeploy application to which the deployment belongs.
     */

    public String getCodeDeployApplication() {
        return this.codeDeployApplication;
    }

    /**
     * <p>
     * The CodeDeploy application to which the deployment belongs.
     * </p>
     * 
     * @param codeDeployApplication
     *        The CodeDeploy application to which the deployment belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCodeDeployApplication(String codeDeployApplication) {
        setCodeDeployApplication(codeDeployApplication);
        return this;
    }

    /**
     * <p>
     * The instance group to which the CodeDeploy instance belongs.
     * </p>
     * 
     * @param codeDeployInstanceGroupId
     *        The instance group to which the CodeDeploy instance belongs.
     */

    public void setCodeDeployInstanceGroupId(String codeDeployInstanceGroupId) {
        this.codeDeployInstanceGroupId = codeDeployInstanceGroupId;
    }

    /**
     * <p>
     * The instance group to which the CodeDeploy instance belongs.
     * </p>
     * 
     * @return The instance group to which the CodeDeploy instance belongs.
     */

    public String getCodeDeployInstanceGroupId() {
        return this.codeDeployInstanceGroupId;
    }

    /**
     * <p>
     * The instance group to which the CodeDeploy instance belongs.
     * </p>
     * 
     * @param codeDeployInstanceGroupId
     *        The instance group to which the CodeDeploy instance belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withCodeDeployInstanceGroupId(String codeDeployInstanceGroupId) {
        setCodeDeployInstanceGroupId(codeDeployInstanceGroupId);
        return this;
    }

    /**
     * <p>
     * The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     * </p>
     * 
     * @param ec2State
     *        The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     */

    public void setEc2State(String ec2State) {
        this.ec2State = ec2State;
    }

    /**
     * <p>
     * The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     * </p>
     * 
     * @return The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     */

    public String getEc2State() {
        return this.ec2State;
    }

    /**
     * <p>
     * The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     * </p>
     * 
     * @param ec2State
     *        The state of the instance, such as <code>STOPPING</code> or <code>TERMINATING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEc2State(String ec2State) {
        setEc2State(ec2State);
        return this;
    }

    /**
     * <p>
     * The category of an RDS event.
     * </p>
     * 
     * @param rdsEventCategories
     *        The category of an RDS event.
     */

    public void setRdsEventCategories(String rdsEventCategories) {
        this.rdsEventCategories = rdsEventCategories;
    }

    /**
     * <p>
     * The category of an RDS event.
     * </p>
     * 
     * @return The category of an RDS event.
     */

    public String getRdsEventCategories() {
        return this.rdsEventCategories;
    }

    /**
     * <p>
     * The category of an RDS event.
     * </p>
     * 
     * @param rdsEventCategories
     *        The category of an RDS event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withRdsEventCategories(String rdsEventCategories) {
        setRdsEventCategories(rdsEventCategories);
        return this;
    }

    /**
     * <p>
     * The message of an RDS event.
     * </p>
     * 
     * @param rdsEventMessage
     *        The message of an RDS event.
     */

    public void setRdsEventMessage(String rdsEventMessage) {
        this.rdsEventMessage = rdsEventMessage;
    }

    /**
     * <p>
     * The message of an RDS event.
     * </p>
     * 
     * @return The message of an RDS event.
     */

    public String getRdsEventMessage() {
        return this.rdsEventMessage;
    }

    /**
     * <p>
     * The message of an RDS event.
     * </p>
     * 
     * @param rdsEventMessage
     *        The message of an RDS event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withRdsEventMessage(String rdsEventMessage) {
        setRdsEventMessage(rdsEventMessage);
        return this;
    }

    /**
     * <p>
     * The name of the S3 CloudWatch Event-based observation.
     * </p>
     * 
     * @param s3EventName
     *        The name of the S3 CloudWatch Event-based observation.
     */

    public void setS3EventName(String s3EventName) {
        this.s3EventName = s3EventName;
    }

    /**
     * <p>
     * The name of the S3 CloudWatch Event-based observation.
     * </p>
     * 
     * @return The name of the S3 CloudWatch Event-based observation.
     */

    public String getS3EventName() {
        return this.s3EventName;
    }

    /**
     * <p>
     * The name of the S3 CloudWatch Event-based observation.
     * </p>
     * 
     * @param s3EventName
     *        The name of the S3 CloudWatch Event-based observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withS3EventName(String s3EventName) {
        setS3EventName(s3EventName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function execution-based observation.
     * </p>
     * 
     * @param statesExecutionArn
     *        The Amazon Resource Name (ARN) of the step function execution-based observation.
     */

    public void setStatesExecutionArn(String statesExecutionArn) {
        this.statesExecutionArn = statesExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function execution-based observation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the step function execution-based observation.
     */

    public String getStatesExecutionArn() {
        return this.statesExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function execution-based observation.
     * </p>
     * 
     * @param statesExecutionArn
     *        The Amazon Resource Name (ARN) of the step function execution-based observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStatesExecutionArn(String statesExecutionArn) {
        setStatesExecutionArn(statesExecutionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function-based observation.
     * </p>
     * 
     * @param statesArn
     *        The Amazon Resource Name (ARN) of the step function-based observation.
     */

    public void setStatesArn(String statesArn) {
        this.statesArn = statesArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function-based observation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the step function-based observation.
     */

    public String getStatesArn() {
        return this.statesArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the step function-based observation.
     * </p>
     * 
     * @param statesArn
     *        The Amazon Resource Name (ARN) of the step function-based observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStatesArn(String statesArn) {
        setStatesArn(statesArn);
        return this;
    }

    /**
     * <p>
     * The status of the step function-related observation.
     * </p>
     * 
     * @param statesStatus
     *        The status of the step function-related observation.
     */

    public void setStatesStatus(String statesStatus) {
        this.statesStatus = statesStatus;
    }

    /**
     * <p>
     * The status of the step function-related observation.
     * </p>
     * 
     * @return The status of the step function-related observation.
     */

    public String getStatesStatus() {
        return this.statesStatus;
    }

    /**
     * <p>
     * The status of the step function-related observation.
     * </p>
     * 
     * @param statesStatus
     *        The status of the step function-related observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStatesStatus(String statesStatus) {
        setStatesStatus(statesStatus);
        return this;
    }

    /**
     * <p>
     * The input to the step function-based observation.
     * </p>
     * 
     * @param statesInput
     *        The input to the step function-based observation.
     */

    public void setStatesInput(String statesInput) {
        this.statesInput = statesInput;
    }

    /**
     * <p>
     * The input to the step function-based observation.
     * </p>
     * 
     * @return The input to the step function-based observation.
     */

    public String getStatesInput() {
        return this.statesInput;
    }

    /**
     * <p>
     * The input to the step function-based observation.
     * </p>
     * 
     * @param statesInput
     *        The input to the step function-based observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStatesInput(String statesInput) {
        setStatesInput(statesInput);
        return this;
    }

    /**
     * <p>
     * The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     * <code>attachVolume</code>.
     * </p>
     * 
     * @param ebsEvent
     *        The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     *        <code>attachVolume</code>.
     */

    public void setEbsEvent(String ebsEvent) {
        this.ebsEvent = ebsEvent;
    }

    /**
     * <p>
     * The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     * <code>attachVolume</code>.
     * </p>
     * 
     * @return The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     *         <code>attachVolume</code>.
     */

    public String getEbsEvent() {
        return this.ebsEvent;
    }

    /**
     * <p>
     * The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     * <code>attachVolume</code>.
     * </p>
     * 
     * @param ebsEvent
     *        The type of EBS CloudWatch event, such as <code>createVolume</code>, <code>deleteVolume</code> or
     *        <code>attachVolume</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEbsEvent(String ebsEvent) {
        setEbsEvent(ebsEvent);
        return this;
    }

    /**
     * <p>
     * The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     * </p>
     * 
     * @param ebsResult
     *        The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     */

    public void setEbsResult(String ebsResult) {
        this.ebsResult = ebsResult;
    }

    /**
     * <p>
     * The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     * </p>
     * 
     * @return The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     */

    public String getEbsResult() {
        return this.ebsResult;
    }

    /**
     * <p>
     * The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     * </p>
     * 
     * @param ebsResult
     *        The result of an EBS CloudWatch event, such as <code>failed</code> or <code>succeeded</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEbsResult(String ebsResult) {
        setEbsResult(ebsResult);
        return this;
    }

    /**
     * <p>
     * The cause of an EBS CloudWatch event.
     * </p>
     * 
     * @param ebsCause
     *        The cause of an EBS CloudWatch event.
     */

    public void setEbsCause(String ebsCause) {
        this.ebsCause = ebsCause;
    }

    /**
     * <p>
     * The cause of an EBS CloudWatch event.
     * </p>
     * 
     * @return The cause of an EBS CloudWatch event.
     */

    public String getEbsCause() {
        return this.ebsCause;
    }

    /**
     * <p>
     * The cause of an EBS CloudWatch event.
     * </p>
     * 
     * @param ebsCause
     *        The cause of an EBS CloudWatch event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEbsCause(String ebsCause) {
        setEbsCause(ebsCause);
        return this;
    }

    /**
     * <p>
     * The request ID of an EBS CloudWatch event.
     * </p>
     * 
     * @param ebsRequestId
     *        The request ID of an EBS CloudWatch event.
     */

    public void setEbsRequestId(String ebsRequestId) {
        this.ebsRequestId = ebsRequestId;
    }

    /**
     * <p>
     * The request ID of an EBS CloudWatch event.
     * </p>
     * 
     * @return The request ID of an EBS CloudWatch event.
     */

    public String getEbsRequestId() {
        return this.ebsRequestId;
    }

    /**
     * <p>
     * The request ID of an EBS CloudWatch event.
     * </p>
     * 
     * @param ebsRequestId
     *        The request ID of an EBS CloudWatch event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEbsRequestId(String ebsRequestId) {
        setEbsRequestId(ebsRequestId);
        return this;
    }

    /**
     * <p>
     * The X-Ray request fault percentage for this node.
     * </p>
     * 
     * @param xRayFaultPercent
     *        The X-Ray request fault percentage for this node.
     */

    public void setXRayFaultPercent(Integer xRayFaultPercent) {
        this.xRayFaultPercent = xRayFaultPercent;
    }

    /**
     * <p>
     * The X-Ray request fault percentage for this node.
     * </p>
     * 
     * @return The X-Ray request fault percentage for this node.
     */

    public Integer getXRayFaultPercent() {
        return this.xRayFaultPercent;
    }

    /**
     * <p>
     * The X-Ray request fault percentage for this node.
     * </p>
     * 
     * @param xRayFaultPercent
     *        The X-Ray request fault percentage for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayFaultPercent(Integer xRayFaultPercent) {
        setXRayFaultPercent(xRayFaultPercent);
        return this;
    }

    /**
     * <p>
     * The X-Ray request throttle percentage for this node.
     * </p>
     * 
     * @param xRayThrottlePercent
     *        The X-Ray request throttle percentage for this node.
     */

    public void setXRayThrottlePercent(Integer xRayThrottlePercent) {
        this.xRayThrottlePercent = xRayThrottlePercent;
    }

    /**
     * <p>
     * The X-Ray request throttle percentage for this node.
     * </p>
     * 
     * @return The X-Ray request throttle percentage for this node.
     */

    public Integer getXRayThrottlePercent() {
        return this.xRayThrottlePercent;
    }

    /**
     * <p>
     * The X-Ray request throttle percentage for this node.
     * </p>
     * 
     * @param xRayThrottlePercent
     *        The X-Ray request throttle percentage for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayThrottlePercent(Integer xRayThrottlePercent) {
        setXRayThrottlePercent(xRayThrottlePercent);
        return this;
    }

    /**
     * <p>
     * The X-Ray request error percentage for this node.
     * </p>
     * 
     * @param xRayErrorPercent
     *        The X-Ray request error percentage for this node.
     */

    public void setXRayErrorPercent(Integer xRayErrorPercent) {
        this.xRayErrorPercent = xRayErrorPercent;
    }

    /**
     * <p>
     * The X-Ray request error percentage for this node.
     * </p>
     * 
     * @return The X-Ray request error percentage for this node.
     */

    public Integer getXRayErrorPercent() {
        return this.xRayErrorPercent;
    }

    /**
     * <p>
     * The X-Ray request error percentage for this node.
     * </p>
     * 
     * @param xRayErrorPercent
     *        The X-Ray request error percentage for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayErrorPercent(Integer xRayErrorPercent) {
        setXRayErrorPercent(xRayErrorPercent);
        return this;
    }

    /**
     * <p>
     * The X-Ray request count for this node.
     * </p>
     * 
     * @param xRayRequestCount
     *        The X-Ray request count for this node.
     */

    public void setXRayRequestCount(Integer xRayRequestCount) {
        this.xRayRequestCount = xRayRequestCount;
    }

    /**
     * <p>
     * The X-Ray request count for this node.
     * </p>
     * 
     * @return The X-Ray request count for this node.
     */

    public Integer getXRayRequestCount() {
        return this.xRayRequestCount;
    }

    /**
     * <p>
     * The X-Ray request count for this node.
     * </p>
     * 
     * @param xRayRequestCount
     *        The X-Ray request count for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayRequestCount(Integer xRayRequestCount) {
        setXRayRequestCount(xRayRequestCount);
        return this;
    }

    /**
     * <p>
     * The X-Ray node request average latency for this node.
     * </p>
     * 
     * @param xRayRequestAverageLatency
     *        The X-Ray node request average latency for this node.
     */

    public void setXRayRequestAverageLatency(Long xRayRequestAverageLatency) {
        this.xRayRequestAverageLatency = xRayRequestAverageLatency;
    }

    /**
     * <p>
     * The X-Ray node request average latency for this node.
     * </p>
     * 
     * @return The X-Ray node request average latency for this node.
     */

    public Long getXRayRequestAverageLatency() {
        return this.xRayRequestAverageLatency;
    }

    /**
     * <p>
     * The X-Ray node request average latency for this node.
     * </p>
     * 
     * @param xRayRequestAverageLatency
     *        The X-Ray node request average latency for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayRequestAverageLatency(Long xRayRequestAverageLatency) {
        setXRayRequestAverageLatency(xRayRequestAverageLatency);
        return this;
    }

    /**
     * <p>
     * The name of the X-Ray node.
     * </p>
     * 
     * @param xRayNodeName
     *        The name of the X-Ray node.
     */

    public void setXRayNodeName(String xRayNodeName) {
        this.xRayNodeName = xRayNodeName;
    }

    /**
     * <p>
     * The name of the X-Ray node.
     * </p>
     * 
     * @return The name of the X-Ray node.
     */

    public String getXRayNodeName() {
        return this.xRayNodeName;
    }

    /**
     * <p>
     * The name of the X-Ray node.
     * </p>
     * 
     * @param xRayNodeName
     *        The name of the X-Ray node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayNodeName(String xRayNodeName) {
        setXRayNodeName(xRayNodeName);
        return this;
    }

    /**
     * <p>
     * The type of the X-Ray node.
     * </p>
     * 
     * @param xRayNodeType
     *        The type of the X-Ray node.
     */

    public void setXRayNodeType(String xRayNodeType) {
        this.xRayNodeType = xRayNodeType;
    }

    /**
     * <p>
     * The type of the X-Ray node.
     * </p>
     * 
     * @return The type of the X-Ray node.
     */

    public String getXRayNodeType() {
        return this.xRayNodeType;
    }

    /**
     * <p>
     * The type of the X-Ray node.
     * </p>
     * 
     * @param xRayNodeType
     *        The type of the X-Ray node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withXRayNodeType(String xRayNodeType) {
        setXRayNodeType(xRayNodeType);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceARN() != null)
            sb.append("SourceARN: ").append(getSourceARN()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getLineTime() != null)
            sb.append("LineTime: ").append(getLineTime()).append(",");
        if (getLogText() != null)
            sb.append("LogText: ").append(getLogText()).append(",");
        if (getLogFilter() != null)
            sb.append("LogFilter: ").append(getLogFilter()).append(",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getCloudWatchEventId() != null)
            sb.append("CloudWatchEventId: ").append(getCloudWatchEventId()).append(",");
        if (getCloudWatchEventSource() != null)
            sb.append("CloudWatchEventSource: ").append(getCloudWatchEventSource()).append(",");
        if (getCloudWatchEventDetailType() != null)
            sb.append("CloudWatchEventDetailType: ").append(getCloudWatchEventDetailType()).append(",");
        if (getHealthEventArn() != null)
            sb.append("HealthEventArn: ").append(getHealthEventArn()).append(",");
        if (getHealthService() != null)
            sb.append("HealthService: ").append(getHealthService()).append(",");
        if (getHealthEventTypeCode() != null)
            sb.append("HealthEventTypeCode: ").append(getHealthEventTypeCode()).append(",");
        if (getHealthEventTypeCategory() != null)
            sb.append("HealthEventTypeCategory: ").append(getHealthEventTypeCategory()).append(",");
        if (getHealthEventDescription() != null)
            sb.append("HealthEventDescription: ").append(getHealthEventDescription()).append(",");
        if (getCodeDeployDeploymentId() != null)
            sb.append("CodeDeployDeploymentId: ").append(getCodeDeployDeploymentId()).append(",");
        if (getCodeDeployDeploymentGroup() != null)
            sb.append("CodeDeployDeploymentGroup: ").append(getCodeDeployDeploymentGroup()).append(",");
        if (getCodeDeployState() != null)
            sb.append("CodeDeployState: ").append(getCodeDeployState()).append(",");
        if (getCodeDeployApplication() != null)
            sb.append("CodeDeployApplication: ").append(getCodeDeployApplication()).append(",");
        if (getCodeDeployInstanceGroupId() != null)
            sb.append("CodeDeployInstanceGroupId: ").append(getCodeDeployInstanceGroupId()).append(",");
        if (getEc2State() != null)
            sb.append("Ec2State: ").append(getEc2State()).append(",");
        if (getRdsEventCategories() != null)
            sb.append("RdsEventCategories: ").append(getRdsEventCategories()).append(",");
        if (getRdsEventMessage() != null)
            sb.append("RdsEventMessage: ").append(getRdsEventMessage()).append(",");
        if (getS3EventName() != null)
            sb.append("S3EventName: ").append(getS3EventName()).append(",");
        if (getStatesExecutionArn() != null)
            sb.append("StatesExecutionArn: ").append(getStatesExecutionArn()).append(",");
        if (getStatesArn() != null)
            sb.append("StatesArn: ").append(getStatesArn()).append(",");
        if (getStatesStatus() != null)
            sb.append("StatesStatus: ").append(getStatesStatus()).append(",");
        if (getStatesInput() != null)
            sb.append("StatesInput: ").append(getStatesInput()).append(",");
        if (getEbsEvent() != null)
            sb.append("EbsEvent: ").append(getEbsEvent()).append(",");
        if (getEbsResult() != null)
            sb.append("EbsResult: ").append(getEbsResult()).append(",");
        if (getEbsCause() != null)
            sb.append("EbsCause: ").append(getEbsCause()).append(",");
        if (getEbsRequestId() != null)
            sb.append("EbsRequestId: ").append(getEbsRequestId()).append(",");
        if (getXRayFaultPercent() != null)
            sb.append("XRayFaultPercent: ").append(getXRayFaultPercent()).append(",");
        if (getXRayThrottlePercent() != null)
            sb.append("XRayThrottlePercent: ").append(getXRayThrottlePercent()).append(",");
        if (getXRayErrorPercent() != null)
            sb.append("XRayErrorPercent: ").append(getXRayErrorPercent()).append(",");
        if (getXRayRequestCount() != null)
            sb.append("XRayRequestCount: ").append(getXRayRequestCount()).append(",");
        if (getXRayRequestAverageLatency() != null)
            sb.append("XRayRequestAverageLatency: ").append(getXRayRequestAverageLatency()).append(",");
        if (getXRayNodeName() != null)
            sb.append("XRayNodeName: ").append(getXRayNodeName()).append(",");
        if (getXRayNodeType() != null)
            sb.append("XRayNodeType: ").append(getXRayNodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Observation == false)
            return false;
        Observation other = (Observation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceARN() == null ^ this.getSourceARN() == null)
            return false;
        if (other.getSourceARN() != null && other.getSourceARN().equals(this.getSourceARN()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getLineTime() == null ^ this.getLineTime() == null)
            return false;
        if (other.getLineTime() != null && other.getLineTime().equals(this.getLineTime()) == false)
            return false;
        if (other.getLogText() == null ^ this.getLogText() == null)
            return false;
        if (other.getLogText() != null && other.getLogText().equals(this.getLogText()) == false)
            return false;
        if (other.getLogFilter() == null ^ this.getLogFilter() == null)
            return false;
        if (other.getLogFilter() != null && other.getLogFilter().equals(this.getLogFilter()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCloudWatchEventId() == null ^ this.getCloudWatchEventId() == null)
            return false;
        if (other.getCloudWatchEventId() != null && other.getCloudWatchEventId().equals(this.getCloudWatchEventId()) == false)
            return false;
        if (other.getCloudWatchEventSource() == null ^ this.getCloudWatchEventSource() == null)
            return false;
        if (other.getCloudWatchEventSource() != null && other.getCloudWatchEventSource().equals(this.getCloudWatchEventSource()) == false)
            return false;
        if (other.getCloudWatchEventDetailType() == null ^ this.getCloudWatchEventDetailType() == null)
            return false;
        if (other.getCloudWatchEventDetailType() != null && other.getCloudWatchEventDetailType().equals(this.getCloudWatchEventDetailType()) == false)
            return false;
        if (other.getHealthEventArn() == null ^ this.getHealthEventArn() == null)
            return false;
        if (other.getHealthEventArn() != null && other.getHealthEventArn().equals(this.getHealthEventArn()) == false)
            return false;
        if (other.getHealthService() == null ^ this.getHealthService() == null)
            return false;
        if (other.getHealthService() != null && other.getHealthService().equals(this.getHealthService()) == false)
            return false;
        if (other.getHealthEventTypeCode() == null ^ this.getHealthEventTypeCode() == null)
            return false;
        if (other.getHealthEventTypeCode() != null && other.getHealthEventTypeCode().equals(this.getHealthEventTypeCode()) == false)
            return false;
        if (other.getHealthEventTypeCategory() == null ^ this.getHealthEventTypeCategory() == null)
            return false;
        if (other.getHealthEventTypeCategory() != null && other.getHealthEventTypeCategory().equals(this.getHealthEventTypeCategory()) == false)
            return false;
        if (other.getHealthEventDescription() == null ^ this.getHealthEventDescription() == null)
            return false;
        if (other.getHealthEventDescription() != null && other.getHealthEventDescription().equals(this.getHealthEventDescription()) == false)
            return false;
        if (other.getCodeDeployDeploymentId() == null ^ this.getCodeDeployDeploymentId() == null)
            return false;
        if (other.getCodeDeployDeploymentId() != null && other.getCodeDeployDeploymentId().equals(this.getCodeDeployDeploymentId()) == false)
            return false;
        if (other.getCodeDeployDeploymentGroup() == null ^ this.getCodeDeployDeploymentGroup() == null)
            return false;
        if (other.getCodeDeployDeploymentGroup() != null && other.getCodeDeployDeploymentGroup().equals(this.getCodeDeployDeploymentGroup()) == false)
            return false;
        if (other.getCodeDeployState() == null ^ this.getCodeDeployState() == null)
            return false;
        if (other.getCodeDeployState() != null && other.getCodeDeployState().equals(this.getCodeDeployState()) == false)
            return false;
        if (other.getCodeDeployApplication() == null ^ this.getCodeDeployApplication() == null)
            return false;
        if (other.getCodeDeployApplication() != null && other.getCodeDeployApplication().equals(this.getCodeDeployApplication()) == false)
            return false;
        if (other.getCodeDeployInstanceGroupId() == null ^ this.getCodeDeployInstanceGroupId() == null)
            return false;
        if (other.getCodeDeployInstanceGroupId() != null && other.getCodeDeployInstanceGroupId().equals(this.getCodeDeployInstanceGroupId()) == false)
            return false;
        if (other.getEc2State() == null ^ this.getEc2State() == null)
            return false;
        if (other.getEc2State() != null && other.getEc2State().equals(this.getEc2State()) == false)
            return false;
        if (other.getRdsEventCategories() == null ^ this.getRdsEventCategories() == null)
            return false;
        if (other.getRdsEventCategories() != null && other.getRdsEventCategories().equals(this.getRdsEventCategories()) == false)
            return false;
        if (other.getRdsEventMessage() == null ^ this.getRdsEventMessage() == null)
            return false;
        if (other.getRdsEventMessage() != null && other.getRdsEventMessage().equals(this.getRdsEventMessage()) == false)
            return false;
        if (other.getS3EventName() == null ^ this.getS3EventName() == null)
            return false;
        if (other.getS3EventName() != null && other.getS3EventName().equals(this.getS3EventName()) == false)
            return false;
        if (other.getStatesExecutionArn() == null ^ this.getStatesExecutionArn() == null)
            return false;
        if (other.getStatesExecutionArn() != null && other.getStatesExecutionArn().equals(this.getStatesExecutionArn()) == false)
            return false;
        if (other.getStatesArn() == null ^ this.getStatesArn() == null)
            return false;
        if (other.getStatesArn() != null && other.getStatesArn().equals(this.getStatesArn()) == false)
            return false;
        if (other.getStatesStatus() == null ^ this.getStatesStatus() == null)
            return false;
        if (other.getStatesStatus() != null && other.getStatesStatus().equals(this.getStatesStatus()) == false)
            return false;
        if (other.getStatesInput() == null ^ this.getStatesInput() == null)
            return false;
        if (other.getStatesInput() != null && other.getStatesInput().equals(this.getStatesInput()) == false)
            return false;
        if (other.getEbsEvent() == null ^ this.getEbsEvent() == null)
            return false;
        if (other.getEbsEvent() != null && other.getEbsEvent().equals(this.getEbsEvent()) == false)
            return false;
        if (other.getEbsResult() == null ^ this.getEbsResult() == null)
            return false;
        if (other.getEbsResult() != null && other.getEbsResult().equals(this.getEbsResult()) == false)
            return false;
        if (other.getEbsCause() == null ^ this.getEbsCause() == null)
            return false;
        if (other.getEbsCause() != null && other.getEbsCause().equals(this.getEbsCause()) == false)
            return false;
        if (other.getEbsRequestId() == null ^ this.getEbsRequestId() == null)
            return false;
        if (other.getEbsRequestId() != null && other.getEbsRequestId().equals(this.getEbsRequestId()) == false)
            return false;
        if (other.getXRayFaultPercent() == null ^ this.getXRayFaultPercent() == null)
            return false;
        if (other.getXRayFaultPercent() != null && other.getXRayFaultPercent().equals(this.getXRayFaultPercent()) == false)
            return false;
        if (other.getXRayThrottlePercent() == null ^ this.getXRayThrottlePercent() == null)
            return false;
        if (other.getXRayThrottlePercent() != null && other.getXRayThrottlePercent().equals(this.getXRayThrottlePercent()) == false)
            return false;
        if (other.getXRayErrorPercent() == null ^ this.getXRayErrorPercent() == null)
            return false;
        if (other.getXRayErrorPercent() != null && other.getXRayErrorPercent().equals(this.getXRayErrorPercent()) == false)
            return false;
        if (other.getXRayRequestCount() == null ^ this.getXRayRequestCount() == null)
            return false;
        if (other.getXRayRequestCount() != null && other.getXRayRequestCount().equals(this.getXRayRequestCount()) == false)
            return false;
        if (other.getXRayRequestAverageLatency() == null ^ this.getXRayRequestAverageLatency() == null)
            return false;
        if (other.getXRayRequestAverageLatency() != null && other.getXRayRequestAverageLatency().equals(this.getXRayRequestAverageLatency()) == false)
            return false;
        if (other.getXRayNodeName() == null ^ this.getXRayNodeName() == null)
            return false;
        if (other.getXRayNodeName() != null && other.getXRayNodeName().equals(this.getXRayNodeName()) == false)
            return false;
        if (other.getXRayNodeType() == null ^ this.getXRayNodeType() == null)
            return false;
        if (other.getXRayNodeType() != null && other.getXRayNodeType().equals(this.getXRayNodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceARN() == null) ? 0 : getSourceARN().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLineTime() == null) ? 0 : getLineTime().hashCode());
        hashCode = prime * hashCode + ((getLogText() == null) ? 0 : getLogText().hashCode());
        hashCode = prime * hashCode + ((getLogFilter() == null) ? 0 : getLogFilter().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchEventId() == null) ? 0 : getCloudWatchEventId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchEventSource() == null) ? 0 : getCloudWatchEventSource().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchEventDetailType() == null) ? 0 : getCloudWatchEventDetailType().hashCode());
        hashCode = prime * hashCode + ((getHealthEventArn() == null) ? 0 : getHealthEventArn().hashCode());
        hashCode = prime * hashCode + ((getHealthService() == null) ? 0 : getHealthService().hashCode());
        hashCode = prime * hashCode + ((getHealthEventTypeCode() == null) ? 0 : getHealthEventTypeCode().hashCode());
        hashCode = prime * hashCode + ((getHealthEventTypeCategory() == null) ? 0 : getHealthEventTypeCategory().hashCode());
        hashCode = prime * hashCode + ((getHealthEventDescription() == null) ? 0 : getHealthEventDescription().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployDeploymentId() == null) ? 0 : getCodeDeployDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployDeploymentGroup() == null) ? 0 : getCodeDeployDeploymentGroup().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployState() == null) ? 0 : getCodeDeployState().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployApplication() == null) ? 0 : getCodeDeployApplication().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployInstanceGroupId() == null) ? 0 : getCodeDeployInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getEc2State() == null) ? 0 : getEc2State().hashCode());
        hashCode = prime * hashCode + ((getRdsEventCategories() == null) ? 0 : getRdsEventCategories().hashCode());
        hashCode = prime * hashCode + ((getRdsEventMessage() == null) ? 0 : getRdsEventMessage().hashCode());
        hashCode = prime * hashCode + ((getS3EventName() == null) ? 0 : getS3EventName().hashCode());
        hashCode = prime * hashCode + ((getStatesExecutionArn() == null) ? 0 : getStatesExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStatesArn() == null) ? 0 : getStatesArn().hashCode());
        hashCode = prime * hashCode + ((getStatesStatus() == null) ? 0 : getStatesStatus().hashCode());
        hashCode = prime * hashCode + ((getStatesInput() == null) ? 0 : getStatesInput().hashCode());
        hashCode = prime * hashCode + ((getEbsEvent() == null) ? 0 : getEbsEvent().hashCode());
        hashCode = prime * hashCode + ((getEbsResult() == null) ? 0 : getEbsResult().hashCode());
        hashCode = prime * hashCode + ((getEbsCause() == null) ? 0 : getEbsCause().hashCode());
        hashCode = prime * hashCode + ((getEbsRequestId() == null) ? 0 : getEbsRequestId().hashCode());
        hashCode = prime * hashCode + ((getXRayFaultPercent() == null) ? 0 : getXRayFaultPercent().hashCode());
        hashCode = prime * hashCode + ((getXRayThrottlePercent() == null) ? 0 : getXRayThrottlePercent().hashCode());
        hashCode = prime * hashCode + ((getXRayErrorPercent() == null) ? 0 : getXRayErrorPercent().hashCode());
        hashCode = prime * hashCode + ((getXRayRequestCount() == null) ? 0 : getXRayRequestCount().hashCode());
        hashCode = prime * hashCode + ((getXRayRequestAverageLatency() == null) ? 0 : getXRayRequestAverageLatency().hashCode());
        hashCode = prime * hashCode + ((getXRayNodeName() == null) ? 0 : getXRayNodeName().hashCode());
        hashCode = prime * hashCode + ((getXRayNodeType() == null) ? 0 : getXRayNodeType().hashCode());
        return hashCode;
    }

    @Override
    public Observation clone() {
        try {
            return (Observation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ObservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
