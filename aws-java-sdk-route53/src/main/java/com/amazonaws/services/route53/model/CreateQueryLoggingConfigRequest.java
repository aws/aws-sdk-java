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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateQueryLoggingConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueryLoggingConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is
     * the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html">describe-log-groups</a>
     * command, or the applicable command in one of the AWS SDKs.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted
     *        zones.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
     * </p>
     * 
     * @return The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted
     *         zones.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted
     *        zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueryLoggingConfigRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is
     * the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html">describe-log-groups</a>
     * command, or the applicable command in one of the AWS SDKs.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to.
     *        This is the format of the ARN:</p>
     *        <p>
     *        arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     *        </p>
     *        <p>
     *        To get the ARN for a log group, you can use the CloudWatch console, the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *        >DescribeLogGroups</a> API action, the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *        >describe-log-groups</a> command, or the applicable command in one of the AWS SDKs.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is
     * the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html">describe-log-groups</a>
     * command, or the applicable command in one of the AWS SDKs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to.
     *         This is the format of the ARN:</p>
     *         <p>
     *         arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     *         </p>
     *         <p>
     *         To get the ARN for a log group, you can use the CloudWatch console, the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *         >DescribeLogGroups</a> API action, the <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *         >describe-log-groups</a> command, or the applicable command in one of the AWS SDKs.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is
     * the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html">describe-log-groups</a>
     * command, or the applicable command in one of the AWS SDKs.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to.
     *        This is the format of the ARN:</p>
     *        <p>
     *        arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name</i>
     *        </p>
     *        <p>
     *        To get the ARN for a log group, you can use the CloudWatch console, the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *        >DescribeLogGroups</a> API action, the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *        >describe-log-groups</a> command, or the applicable command in one of the AWS SDKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueryLoggingConfigRequest withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueryLoggingConfigRequest == false)
            return false;
        CreateQueryLoggingConfigRequest other = (CreateQueryLoggingConfigRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueryLoggingConfigRequest clone() {
        return (CreateQueryLoggingConfigRequest) super.clone();
    }

}
