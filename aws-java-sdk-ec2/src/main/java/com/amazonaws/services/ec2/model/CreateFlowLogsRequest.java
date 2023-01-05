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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateFlowLogsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowLogsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateFlowLogsRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported otherwise.
     * </p>
     */
    private String deliverLogsPermissionArn;
    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * </p>
     */
    private String deliverCrossAccountRole;
    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the IDs of
     * the VPCs.
     * </p>
     * <p>
     * Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;
    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     */
    private String trafficType;
    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * The destination for the flow log data. The meaning of this parameter depends on the destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group. For
     * example:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     * </p>
     * <p>
     * Alternatively, use the <code>LogGroupName</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     * </p>
     * <p>
     * arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     * </p>
     * <p>
     * The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     * delivery stream. For example:
     * </p>
     * <p>
     * arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     * </p>
     * </li>
     * </ul>
     */
    private String logDestination;
    /**
     * <p>
     * The fields to include in the flow log record. List the fields in the order in which they should appear. If you
     * omit this parameter, the flow log is created using the default format. If you specify this parameter, you must
     * include at least one field. For more information about the available fields, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log records</a> in
     * the <i>Amazon VPC User Guide</i> or <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow Log
     * records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround this
     * parameter value with single quotes on Linux or double quotes on Windows.
     * </p>
     */
    private String logFormat;
    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record.
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be 60 seconds for
     * transit gateway resource types.
     * </p>
     * <p>
     * When a network interface is attached to a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     */
    private Integer maxAggregationInterval;
    /**
     * <p>
     * The destination options.
     * </p>
     */
    private DestinationOptionsRequest destinationOptions;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported otherwise.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     *        account.</p>
     *        <p>
     *        This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported
     *        otherwise.
     */

    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported otherwise.
     * </p>
     * 
     * @return The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in
     *         your account.</p>
     *         <p>
     *         This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported
     *         otherwise.
     */

    public String getDeliverLogsPermissionArn() {
        return this.deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported otherwise.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     *        account.</p>
     *        <p>
     *        This parameter is required if the destination type is <code>cloud-watch-logs</code> and unsupported
     *        otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        setDeliverLogsPermissionArn(deliverLogsPermissionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * </p>
     * 
     * @param deliverCrossAccountRole
     *        The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     */

    public void setDeliverCrossAccountRole(String deliverCrossAccountRole) {
        this.deliverCrossAccountRole = deliverCrossAccountRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * </p>
     * 
     * @return The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     */

    public String getDeliverCrossAccountRole() {
        return this.deliverCrossAccountRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * </p>
     * 
     * @param deliverCrossAccountRole
     *        The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withDeliverCrossAccountRole(String deliverCrossAccountRole) {
        setDeliverCrossAccountRole(deliverCrossAccountRole);
        return this;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     * </p>
     * 
     * @param logGroupName
     *        The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *        <p>
     *        This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     * </p>
     * 
     * @return The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *         <p>
     *         This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     * </p>
     * 
     * @param logGroupName
     *        The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *        <p>
     *        This parameter is valid only if the destination type is <code>cloud-watch-logs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the IDs of
     * the VPCs.
     * </p>
     * <p>
     * Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource types.
     * </p>
     * 
     * @return The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the
     *         IDs of the VPCs.</p>
     *         <p>
     *         Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource
     *         types.
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the IDs of
     * the VPCs.
     * </p>
     * <p>
     * Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource types.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the
     *        IDs of the VPCs.</p>
     *        <p>
     *        Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource
     *        types.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the IDs of
     * the VPCs.
     * </p>
     * <p>
     * Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the
     *        IDs of the VPCs.</p>
     *        <p>
     *        Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the IDs of
     * the VPCs.
     * </p>
     * <p>
     * Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource types.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of the resources to monitor. For example, if the resource type is <code>VPC</code>, specify the
     *        IDs of the VPCs.</p>
     *        <p>
     *        Constraints: Maximum of 25 for transit gateway resource types. Maximum of 1000 for the other resource
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to monitor.
     * @see FlowLogsResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     * 
     * @return The type of resource to monitor.
     * @see FlowLogsResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to monitor.
     * @see FlowLogsResourceType
     */

    public void setResourceType(FlowLogsResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource to monitor.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     *        supported for transit gateway resource types. It is required for the other resource types.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     * 
     * @return The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is
     *         not supported for transit gateway resource types. It is required for the other resource types.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     *        supported for transit gateway resource types. It is required for the other resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public CreateFlowLogsRequest withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     *        supported for transit gateway resource types. It is required for the other resource types.
     * @see TrafficType
     */

    public void setTrafficType(TrafficType trafficType) {
        withTrafficType(trafficType);
    }

    /**
     * <p>
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     * supported for transit gateway resource types. It is required for the other resource types.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic). This parameter is not
     *        supported for transit gateway resource types. It is required for the other resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public CreateFlowLogsRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        The type of destination for the flow log data.</p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @return The type of destination for the flow log data.</p>
     *         <p>
     *         Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public String getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        The type of destination for the flow log data.</p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public CreateFlowLogsRequest withLogDestinationType(String logDestinationType) {
        setLogDestinationType(logDestinationType);
        return this;
    }

    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        The type of destination for the flow log data.</p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public void setLogDestinationType(LogDestinationType logDestinationType) {
        withLogDestinationType(logDestinationType);
    }

    /**
     * <p>
     * The type of destination for the flow log data.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        The type of destination for the flow log data.</p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public CreateFlowLogsRequest withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * The destination for the flow log data. The meaning of this parameter depends on the destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group. For
     * example:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     * </p>
     * <p>
     * Alternatively, use the <code>LogGroupName</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     * </p>
     * <p>
     * arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     * </p>
     * <p>
     * The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     * delivery stream. For example:
     * </p>
     * <p>
     * arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logDestination
     *        The destination for the flow log data. The meaning of this parameter depends on the destination type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group.
     *        For example:
     *        </p>
     *        <p>
     *        arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     *        </p>
     *        <p>
     *        Alternatively, use the <code>LogGroupName</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     *        </p>
     *        <p>
     *        arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     *        </p>
     *        <p>
     *        The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     *        delivery stream. For example:
     *        </p>
     *        <p>
     *        arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     *        </p>
     *        </li>
     */

    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * The destination for the flow log data. The meaning of this parameter depends on the destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group. For
     * example:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     * </p>
     * <p>
     * Alternatively, use the <code>LogGroupName</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     * </p>
     * <p>
     * arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     * </p>
     * <p>
     * The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     * delivery stream. For example:
     * </p>
     * <p>
     * arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The destination for the flow log data. The meaning of this parameter depends on the destination type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group.
     *         For example:
     *         </p>
     *         <p>
     *         arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     *         </p>
     *         <p>
     *         Alternatively, use the <code>LogGroupName</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     *         </p>
     *         <p>
     *         arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     *         </p>
     *         <p>
     *         The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     *         delivery stream. For example:
     *         </p>
     *         <p>
     *         arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     *         </p>
     *         </li>
     */

    public String getLogDestination() {
        return this.logDestination;
    }

    /**
     * <p>
     * The destination for the flow log data. The meaning of this parameter depends on the destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group. For
     * example:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     * </p>
     * <p>
     * Alternatively, use the <code>LogGroupName</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     * </p>
     * <p>
     * arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     * </p>
     * <p>
     * The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     * delivery stream. For example:
     * </p>
     * <p>
     * arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logDestination
     *        The destination for the flow log data. The meaning of this parameter depends on the destination type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the destination type is <code>cloud-watch-logs</code>, specify the ARN of a CloudWatch Logs log group.
     *        For example:
     *        </p>
     *        <p>
     *        arn:aws:logs:<i>region</i>:<i>account_id</i>:log-group:<i>my_group</i>
     *        </p>
     *        <p>
     *        Alternatively, use the <code>LogGroupName</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the destination type is <code>s3</code>, specify the ARN of an S3 bucket. For example:
     *        </p>
     *        <p>
     *        arn:aws:s3:::<i>my_bucket</i>/<i>my_subfolder</i>/
     *        </p>
     *        <p>
     *        The subfolder is optional. Note that you can't use <code>AWSLogs</code> as a subfolder name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the destination type is <code>kinesis-data-firehose</code>, specify the ARN of a Kinesis Data Firehose
     *        delivery stream. For example:
     *        </p>
     *        <p>
     *        arn:aws:firehose:<i>region</i>:<i>account_id</i>:deliverystream:<i>my_stream</i>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogDestination(String logDestination) {
        setLogDestination(logDestination);
        return this;
    }

    /**
     * <p>
     * The fields to include in the flow log record. List the fields in the order in which they should appear. If you
     * omit this parameter, the flow log is created using the default format. If you specify this parameter, you must
     * include at least one field. For more information about the available fields, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log records</a> in
     * the <i>Amazon VPC User Guide</i> or <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow Log
     * records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround this
     * parameter value with single quotes on Linux or double quotes on Windows.
     * </p>
     * 
     * @param logFormat
     *        The fields to include in the flow log record. List the fields in the order in which they should appear. If
     *        you omit this parameter, the flow log is created using the default format. If you specify this parameter,
     *        you must include at least one field. For more information about the available fields, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log
     *        records</a> in the <i>Amazon VPC User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow
     *        Log records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.</p>
     *        <p>
     *        Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround
     *        this parameter value with single quotes on Linux or double quotes on Windows.
     */

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record. List the fields in the order in which they should appear. If you
     * omit this parameter, the flow log is created using the default format. If you specify this parameter, you must
     * include at least one field. For more information about the available fields, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log records</a> in
     * the <i>Amazon VPC User Guide</i> or <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow Log
     * records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround this
     * parameter value with single quotes on Linux or double quotes on Windows.
     * </p>
     * 
     * @return The fields to include in the flow log record. List the fields in the order in which they should appear.
     *         If you omit this parameter, the flow log is created using the default format. If you specify this
     *         parameter, you must include at least one field. For more information about the available fields, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log
     *         records</a> in the <i>Amazon VPC User Guide</i> or <a
     *         href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway
     *         Flow Log records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.</p>
     *         <p>
     *         Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround
     *         this parameter value with single quotes on Linux or double quotes on Windows.
     */

    public String getLogFormat() {
        return this.logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record. List the fields in the order in which they should appear. If you
     * omit this parameter, the flow log is created using the default format. If you specify this parameter, you must
     * include at least one field. For more information about the available fields, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log records</a> in
     * the <i>Amazon VPC User Guide</i> or <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow Log
     * records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround this
     * parameter value with single quotes on Linux or double quotes on Windows.
     * </p>
     * 
     * @param logFormat
     *        The fields to include in the flow log record. List the fields in the order in which they should appear. If
     *        you omit this parameter, the flow log is created using the default format. If you specify this parameter,
     *        you must include at least one field. For more information about the available fields, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow log
     *        records</a> in the <i>Amazon VPC User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records">Transit Gateway Flow
     *        Log records</a> in the <i>Amazon Web Services Transit Gateway Guide</i>.</p>
     *        <p>
     *        Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the CLI, surround
     *        this parameter value with single quotes on Linux or double quotes on Windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogFormat(String logFormat) {
        setLogFormat(logFormat);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * 
     * @return The tags to apply to the flow logs.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the flow logs.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record.
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be 60 seconds for
     * transit gateway resource types.
     * </p>
     * <p>
     * When a network interface is attached to a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     * 
     * @param maxAggregationInterval
     *        The maximum interval of time during which a flow of packets is captured and aggregated into a flow log
     *        record. The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be
     *        60 seconds for transit gateway resource types.</p>
     *        <p>
     *        When a network interface is attached to a <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value
     *        that you specify.
     *        </p>
     *        <p>
     *        Default: 600
     */

    public void setMaxAggregationInterval(Integer maxAggregationInterval) {
        this.maxAggregationInterval = maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record.
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be 60 seconds for
     * transit gateway resource types.
     * </p>
     * <p>
     * When a network interface is attached to a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     * 
     * @return The maximum interval of time during which a flow of packets is captured and aggregated into a flow log
     *         record. The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be
     *         60 seconds for transit gateway resource types.</p>
     *         <p>
     *         When a network interface is attached to a <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value
     *         that you specify.
     *         </p>
     *         <p>
     *         Default: 600
     */

    public Integer getMaxAggregationInterval() {
        return this.maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record.
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be 60 seconds for
     * transit gateway resource types.
     * </p>
     * <p>
     * When a network interface is attached to a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     * 
     * @param maxAggregationInterval
     *        The maximum interval of time during which a flow of packets is captured and aggregated into a flow log
     *        record. The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter must be
     *        60 seconds for transit gateway resource types.</p>
     *        <p>
     *        When a network interface is attached to a <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instance</a>, the aggregation interval is always 60 seconds or less, regardless of the value
     *        that you specify.
     *        </p>
     *        <p>
     *        Default: 600
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withMaxAggregationInterval(Integer maxAggregationInterval) {
        setMaxAggregationInterval(maxAggregationInterval);
        return this;
    }

    /**
     * <p>
     * The destination options.
     * </p>
     * 
     * @param destinationOptions
     *        The destination options.
     */

    public void setDestinationOptions(DestinationOptionsRequest destinationOptions) {
        this.destinationOptions = destinationOptions;
    }

    /**
     * <p>
     * The destination options.
     * </p>
     * 
     * @return The destination options.
     */

    public DestinationOptionsRequest getDestinationOptions() {
        return this.destinationOptions;
    }

    /**
     * <p>
     * The destination options.
     * </p>
     * 
     * @param destinationOptions
     *        The destination options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withDestinationOptions(DestinationOptionsRequest destinationOptions) {
        setDestinationOptions(destinationOptions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateFlowLogsRequest> getDryRunRequest() {
        Request<CreateFlowLogsRequest> request = new CreateFlowLogsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDeliverLogsPermissionArn() != null)
            sb.append("DeliverLogsPermissionArn: ").append(getDeliverLogsPermissionArn()).append(",");
        if (getDeliverCrossAccountRole() != null)
            sb.append("DeliverCrossAccountRole: ").append(getDeliverCrossAccountRole()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTrafficType() != null)
            sb.append("TrafficType: ").append(getTrafficType()).append(",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: ").append(getLogDestinationType()).append(",");
        if (getLogDestination() != null)
            sb.append("LogDestination: ").append(getLogDestination()).append(",");
        if (getLogFormat() != null)
            sb.append("LogFormat: ").append(getLogFormat()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getMaxAggregationInterval() != null)
            sb.append("MaxAggregationInterval: ").append(getMaxAggregationInterval()).append(",");
        if (getDestinationOptions() != null)
            sb.append("DestinationOptions: ").append(getDestinationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowLogsRequest == false)
            return false;
        CreateFlowLogsRequest other = (CreateFlowLogsRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDeliverLogsPermissionArn() == null ^ this.getDeliverLogsPermissionArn() == null)
            return false;
        if (other.getDeliverLogsPermissionArn() != null && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false)
            return false;
        if (other.getDeliverCrossAccountRole() == null ^ this.getDeliverCrossAccountRole() == null)
            return false;
        if (other.getDeliverCrossAccountRole() != null && other.getDeliverCrossAccountRole().equals(this.getDeliverCrossAccountRole()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        if (other.getLogDestinationType() == null ^ this.getLogDestinationType() == null)
            return false;
        if (other.getLogDestinationType() != null && other.getLogDestinationType().equals(this.getLogDestinationType()) == false)
            return false;
        if (other.getLogDestination() == null ^ this.getLogDestination() == null)
            return false;
        if (other.getLogDestination() != null && other.getLogDestination().equals(this.getLogDestination()) == false)
            return false;
        if (other.getLogFormat() == null ^ this.getLogFormat() == null)
            return false;
        if (other.getLogFormat() != null && other.getLogFormat().equals(this.getLogFormat()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getMaxAggregationInterval() == null ^ this.getMaxAggregationInterval() == null)
            return false;
        if (other.getMaxAggregationInterval() != null && other.getMaxAggregationInterval().equals(this.getMaxAggregationInterval()) == false)
            return false;
        if (other.getDestinationOptions() == null ^ this.getDestinationOptions() == null)
            return false;
        if (other.getDestinationOptions() != null && other.getDestinationOptions().equals(this.getDestinationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getDeliverCrossAccountRole() == null) ? 0 : getDeliverCrossAccountRole().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getMaxAggregationInterval() == null) ? 0 : getMaxAggregationInterval().hashCode());
        hashCode = prime * hashCode + ((getDestinationOptions() == null) ? 0 : getDestinationOptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowLogsRequest clone() {
        return (CreateFlowLogsRequest) super.clone();
    }
}
