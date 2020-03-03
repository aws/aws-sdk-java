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
     * to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     */
    private String deliverLogsPermissionArn;
    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;
    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     */
    private String trafficType;
    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource
     * Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called <code>my-logs</code>,
     * specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>. Alternatively, use
     * <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     * subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in a
     * bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You
     * cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     */
    private String logDestination;
    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they should appear. For a list of available
     * fields, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     * Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify this
     * parameter, you must specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use single
     * quotation marks (' ') to surround the parameter value.
     * </p>
     * <p>
     * Only applicable to flow logs that are published to an Amazon S3 bucket.
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
     * You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
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
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in
     *        your account.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     */

    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @return The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in
     *         your account.</p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *         <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     */

    public String getDeliverLogsPermissionArn() {
        return this.deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your
     * account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in
     *        your account.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        setDeliverLogsPermissionArn(deliverLogsPermissionArn);
        return this;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @param logGroupName
     *        The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @return The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *         <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * 
     * @param logGroupName
     *        The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @return The ID of the subnet, network interface, or VPC for which you want to create a flow log.</p>
     *         <p>
     *         Constraints: Maximum of 1000 resources
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @param resourceIds
     *        The ID of the subnet, network interface, or VPC for which you want to create a flow log.</p>
     *        <p>
     *        Constraints: Maximum of 1000 resources
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
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The ID of the subnet, network interface, or VPC for which you want to create a flow log.</p>
     *        <p>
     *        Constraints: Maximum of 1000 resources
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
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @param resourceIds
     *        The ID of the subnet, network interface, or VPC for which you want to create a flow log.</p>
     *        <p>
     *        Constraints: Maximum of 1000 resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     *        <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * @see FlowLogsResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     * 
     * @return The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     *         <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * @see FlowLogsResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     *        <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     *        <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * @see FlowLogsResourceType
     */

    public void setResourceType(FlowLogsResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     * <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which to create the flow log. For example, if you specified a VPC ID for the
     *        <code>ResourceId</code> property, specify <code>VPC</code> for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     * 
     * @return The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public CreateFlowLogsRequest withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * @see TrafficType
     */

    public void setTrafficType(TrafficType trafficType) {
        withTrafficType(trafficType);
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public CreateFlowLogsRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     *        </p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @return Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *         published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *         <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *         <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     *         </p>
     *         <p>
     *         Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public String getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     *        </p>
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
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     *        </p>
     *        <p>
     *        Default: <code>cloud-watch-logs</code>
     * @see LogDestinationType
     */

    public void setLogDestinationType(LogDestinationType logDestinationType) {
        withLogDestinationType(logDestinationType);
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published
     * to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     * <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
     *        <p>
     *        If you specify <code>LogDestinationType</code> as <code>s3</code>, do not specify
     *        <code>DeliverLogsPermissionArn</code> or <code>LogGroupName</code>.
     *        </p>
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
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource
     * Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called <code>my-logs</code>,
     * specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>. Alternatively, use
     * <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     * subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in a
     * bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You
     * cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     * 
     * @param logDestination
     *        Specifies the destination to which the flow log data is to be published. Flow log data can be published to
     *        a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the
     *        value specified for <code>LogDestinationType</code>.</p>
     *        <p>
     *        If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon
     *        Resource Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called
     *        <code>my-logs</code>, specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     *        Alternatively, use <code>LogGroupName</code> instead.
     *        </p>
     *        <p>
     *        If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     *        subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     *        <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in
     *        a bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>
     *        . You cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     */

    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource
     * Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called <code>my-logs</code>,
     * specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>. Alternatively, use
     * <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     * subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in a
     * bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You
     * cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     * 
     * @return Specifies the destination to which the flow log data is to be published. Flow log data can be published
     *         to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on
     *         the value specified for <code>LogDestinationType</code>.</p>
     *         <p>
     *         If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon
     *         Resource Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called
     *         <code>my-logs</code>, specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     *         Alternatively, use <code>LogGroupName</code> instead.
     *         </p>
     *         <p>
     *         If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     *         subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     *         <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code>
     *         in a bucket named <code>my-bucket</code>, use the following ARN:
     *         <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use <code>AWSLogs</code> as a subfolder name.
     *         This is a reserved term.
     */

    public String getLogDestination() {
        return this.logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource
     * Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called <code>my-logs</code>,
     * specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>. Alternatively, use
     * <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     * subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in a
     * bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You
     * cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     * 
     * @param logDestination
     *        Specifies the destination to which the flow log data is to be published. Flow log data can be published to
     *        a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the
     *        value specified for <code>LogDestinationType</code>.</p>
     *        <p>
     *        If <code>LogDestinationType</code> is not specified or <code>cloud-watch-logs</code>, specify the Amazon
     *        Resource Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called
     *        <code>my-logs</code>, specify <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     *        Alternatively, use <code>LogGroupName</code> instead.
     *        </p>
     *        <p>
     *        If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon S3 bucket. You can also specify a
     *        subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format:
     *        <code>bucket_ARN/subfolder_name/</code>. For example, to specify a subfolder named <code>my-logs</code> in
     *        a bucket named <code>my-bucket</code>, use the following ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>
     *        . You cannot use <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogDestination(String logDestination) {
        setLogDestination(logDestination);
        return this;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they should appear. For a list of available
     * fields, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     * Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify this
     * parameter, you must specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use single
     * quotation marks (' ') to surround the parameter value.
     * </p>
     * <p>
     * Only applicable to flow logs that are published to an Amazon S3 bucket.
     * </p>
     * 
     * @param logFormat
     *        The fields to include in the flow log record, in the order in which they should appear. For a list of
     *        available fields, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     *        Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify
     *        this parameter, you must specify at least one field.</p>
     *        <p>
     *        Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use
     *        single quotation marks (' ') to surround the parameter value.
     *        </p>
     *        <p>
     *        Only applicable to flow logs that are published to an Amazon S3 bucket.
     */

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they should appear. For a list of available
     * fields, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     * Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify this
     * parameter, you must specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use single
     * quotation marks (' ') to surround the parameter value.
     * </p>
     * <p>
     * Only applicable to flow logs that are published to an Amazon S3 bucket.
     * </p>
     * 
     * @return The fields to include in the flow log record, in the order in which they should appear. For a list of
     *         available fields, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     *         Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify
     *         this parameter, you must specify at least one field.</p>
     *         <p>
     *         Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use
     *         single quotation marks (' ') to surround the parameter value.
     *         </p>
     *         <p>
     *         Only applicable to flow logs that are published to an Amazon S3 bucket.
     */

    public String getLogFormat() {
        return this.logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they should appear. For a list of available
     * fields, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     * Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify this
     * parameter, you must specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use single
     * quotation marks (' ') to surround the parameter value.
     * </p>
     * <p>
     * Only applicable to flow logs that are published to an Amazon S3 bucket.
     * </p>
     * 
     * @param logFormat
     *        The fields to include in the flow log record, in the order in which they should appear. For a list of
     *        available fields, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log
     *        Records</a>. If you omit this parameter, the flow log is created using the default format. If you specify
     *        this parameter, you must specify at least one field.</p>
     *        <p>
     *        Specify the fields using the <code>${field-id}</code> format, separated by spaces. For the AWS CLI, use
     *        single quotation marks (' ') to surround the parameter value.
     *        </p>
     *        <p>
     *        Only applicable to flow logs that are published to an Amazon S3 bucket.
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
     * You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
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
     *        record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).</p>
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
     * You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
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
     *         record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).</p>
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
     * You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
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
     *        record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).</p>
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
            sb.append("MaxAggregationInterval: ").append(getMaxAggregationInterval());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getMaxAggregationInterval() == null) ? 0 : getMaxAggregationInterval().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowLogsRequest clone() {
        return (CreateFlowLogsRequest) super.clone();
    }
}
