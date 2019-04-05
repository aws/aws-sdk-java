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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutSubscriptionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSubscriptionFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in
     * <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter with a log group.
     * To find the name of the filter currently associated with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     */
    private String filterName;
    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     */
    private String filterPattern;
    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     */
    private String destinationArn;
    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination
     * stream. You don't need to provide the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     */
    private String distribution;

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

    public PutSubscriptionFilterRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in
     * <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter with a log group.
     * To find the name of the filter currently associated with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * 
     * @param filterName
     *        A name for the subscription filter. If you are updating an existing filter, you must specify the correct
     *        name in <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter
     *        with a log group. To find the name of the filter currently associated with a log group, use
     *        <a>DescribeSubscriptionFilters</a>.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in
     * <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter with a log group.
     * To find the name of the filter currently associated with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * 
     * @return A name for the subscription filter. If you are updating an existing filter, you must specify the correct
     *         name in <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter
     *         with a log group. To find the name of the filter currently associated with a log group, use
     *         <a>DescribeSubscriptionFilters</a>.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in
     * <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter with a log group.
     * To find the name of the filter currently associated with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * 
     * @param filterName
     *        A name for the subscription filter. If you are updating an existing filter, you must specify the correct
     *        name in <code>filterName</code>. Otherwise, the call fails because you cannot associate a second filter
     *        with a log group. To find the name of the filter currently associated with a log group, use
     *        <a>DescribeSubscriptionFilters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSubscriptionFilterRequest withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * 
     * @param filterPattern
     *        A filter pattern for subscribing to a filtered stream of log events.
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * 
     * @return A filter pattern for subscribing to a filtered stream of log events.
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * 
     * @param filterPattern
     *        A filter pattern for subscribing to a filtered stream of log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSubscriptionFilterRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationArn
     *        The ARN of the destination to deliver matching log events to. Currently, the supported destinations
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account
     *        delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A logical destination (specified using an ARN) belonging to a different account, for cross-account
     *        delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     *        same-account delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An AWS Lambda function belonging to the same account as the subscription filter, for same-account
     *        delivery.
     *        </p>
     *        </li>
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of the destination to deliver matching log events to. Currently, the supported destinations
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account
     *         delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A logical destination (specified using an ARN) belonging to a different account, for cross-account
     *         delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     *         same-account delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An AWS Lambda function belonging to the same account as the subscription filter, for same-account
     *         delivery.
     *         </p>
     *         </li>
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationArn
     *        The ARN of the destination to deliver matching log events to. Currently, the supported destinations
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account
     *        delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A logical destination (specified using an ARN) belonging to a different account, for cross-account
     *        delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for
     *        same-account delivery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An AWS Lambda function belonging to the same account as the subscription filter, for same-account
     *        delivery.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSubscriptionFilterRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination
     * stream. You don't need to provide the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the
     *        destination stream. You don't need to provide the ARN when you are working with a logical destination for
     *        cross-account delivery.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination
     * stream. You don't need to provide the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * 
     * @return The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the
     *         destination stream. You don't need to provide the ARN when you are working with a logical destination for
     *         cross-account delivery.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination
     * stream. You don't need to provide the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the
     *        destination stream. You don't need to provide the ARN when you are working with a logical destination for
     *        cross-account delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSubscriptionFilterRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     * 
     * @param distribution
     *        The method used to distribute log data to the destination. By default log data is grouped by log stream,
     *        but the grouping can be set to random for a more even distribution. This property is only applicable when
     *        the destination is an Amazon Kinesis stream.
     * @see Distribution
     */

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     * 
     * @return The method used to distribute log data to the destination. By default log data is grouped by log stream,
     *         but the grouping can be set to random for a more even distribution. This property is only applicable when
     *         the destination is an Amazon Kinesis stream.
     * @see Distribution
     */

    public String getDistribution() {
        return this.distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     * 
     * @param distribution
     *        The method used to distribute log data to the destination. By default log data is grouped by log stream,
     *        but the grouping can be set to random for a more even distribution. This property is only applicable when
     *        the destination is an Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Distribution
     */

    public PutSubscriptionFilterRequest withDistribution(String distribution) {
        setDistribution(distribution);
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     * 
     * @param distribution
     *        The method used to distribute log data to the destination. By default log data is grouped by log stream,
     *        but the grouping can be set to random for a more even distribution. This property is only applicable when
     *        the destination is an Amazon Kinesis stream.
     * @see Distribution
     */

    public void setDistribution(Distribution distribution) {
        withDistribution(distribution);
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the
     * grouping can be set to random for a more even distribution. This property is only applicable when the destination
     * is an Amazon Kinesis stream.
     * </p>
     * 
     * @param distribution
     *        The method used to distribute log data to the destination. By default log data is grouped by log stream,
     *        but the grouping can be set to random for a more even distribution. This property is only applicable when
     *        the destination is an Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Distribution
     */

    public PutSubscriptionFilterRequest withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDistribution() != null)
            sb.append("Distribution: ").append(getDistribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSubscriptionFilterRequest == false)
            return false;
        PutSubscriptionFilterRequest other = (PutSubscriptionFilterRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDistribution() == null ^ this.getDistribution() == null)
            return false;
        if (other.getDistribution() != null && other.getDistribution().equals(this.getDistribution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDistribution() == null) ? 0 : getDistribution().hashCode());
        return hashCode;
    }

    @Override
    public PutSubscriptionFilterRequest clone() {
        return (PutSubscriptionFilterRequest) super.clone();
    }

}
