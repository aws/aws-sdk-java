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
     * The ARN for the IAM role that's used to post flow logs to a log group.
     * </p>
     */
    private String deliverLogsPermissionArn;
    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * One or more subnet, network interface, or VPC IDs.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;
    /**
     * <p>
     * The type of resource on which to create the flow log.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The type of traffic to log.
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for LogDestinationType.
     * </p>
     * <p>
     * If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN)
     * of the CloudWatch Logs log group.
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
     * The ARN for the IAM role that's used to post flow logs to a log group.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN for the IAM role that's used to post flow logs to a log group.
     */

    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that's used to post flow logs to a log group.
     * </p>
     * 
     * @return The ARN for the IAM role that's used to post flow logs to a log group.
     */

    public String getDeliverLogsPermissionArn() {
        return this.deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that's used to post flow logs to a log group.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN for the IAM role that's used to post flow logs to a log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        setDeliverLogsPermissionArn(deliverLogsPermissionArn);
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * One or more subnet, network interface, or VPC IDs.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @return One or more subnet, network interface, or VPC IDs.</p>
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
     * One or more subnet, network interface, or VPC IDs.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @param resourceIds
     *        One or more subnet, network interface, or VPC IDs.</p>
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
     * One or more subnet, network interface, or VPC IDs.
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
     *        One or more subnet, network interface, or VPC IDs.</p>
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
     * One or more subnet, network interface, or VPC IDs.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * 
     * @param resourceIds
     *        One or more subnet, network interface, or VPC IDs.</p>
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
     * The type of resource on which to create the flow log.
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which to create the flow log.
     * @see FlowLogsResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource on which to create the flow log.
     * </p>
     * 
     * @return The type of resource on which to create the flow log.
     * @see FlowLogsResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource on which to create the flow log.
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which to create the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource on which to create the flow log.
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which to create the flow log.
     * @see FlowLogsResourceType
     */

    public void setResourceType(FlowLogsResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource on which to create the flow log.
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which to create the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowLogsResourceType
     */

    public CreateFlowLogsRequest withResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of traffic to log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic to log.
     * </p>
     * 
     * @return The type of traffic to log.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * The type of traffic to log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public CreateFlowLogsRequest withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * The type of traffic to log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log.
     * @see TrafficType
     */

    public void setTrafficType(TrafficType trafficType) {
        withTrafficType(trafficType);
    }

    /**
     * <p>
     * The type of traffic to log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic to log.
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @return Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *         published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *         <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
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
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is to be published. Flow log data can be
     *        published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify
     *        <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3, specify <code>s3</code>.</p>
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
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for LogDestinationType.
     * </p>
     * <p>
     * If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN)
     * of the CloudWatch Logs log group.
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
     *        an CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the
     *        value specified for LogDestinationType.</p>
     *        <p>
     *        If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name
     *        (ARN) of the CloudWatch Logs log group.
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
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for LogDestinationType.
     * </p>
     * <p>
     * If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN)
     * of the CloudWatch Logs log group.
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
     *         to an CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on
     *         the value specified for LogDestinationType.</p>
     *         <p>
     *         If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name
     *         (ARN) of the CloudWatch Logs log group.
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
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value
     * specified for LogDestinationType.
     * </p>
     * <p>
     * If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN)
     * of the CloudWatch Logs log group.
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
     *        an CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the
     *        value specified for LogDestinationType.</p>
     *        <p>
     *        If LogDestinationType is not specified or <code>cloud-watch-logs</code>, specify the Amazon Resource Name
     *        (ARN) of the CloudWatch Logs log group.
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
            sb.append("LogDestination: ").append(getLogDestination());
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
        return hashCode;
    }

    @Override
    public CreateFlowLogsRequest clone() {
        return (CreateFlowLogsRequest) super.clone();
    }
}
