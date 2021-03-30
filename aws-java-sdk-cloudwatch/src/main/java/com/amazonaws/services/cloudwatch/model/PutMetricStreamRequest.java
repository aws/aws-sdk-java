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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you are creating a new metric stream, this is the name for the new stream. The name must be different than the
     * names of other metric streams in this account and Region.
     * </p>
     * <p>
     * If you are updating a metric stream, specify the name of that stream here.
     * </p>
     * <p>
     * Valid characters are A-Z, a-z, 0-9, "-" and "_".
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify
     * here.
     * </p>
     * <p>
     * You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamFilter> includeFilters;
    /**
     * <p>
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that
     * you specify here.
     * </p>
     * <p>
     * You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamFilter> excludeFilters;
    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     * Firehose delivery stream must already exist and must be in the same account as the metric stream.
     * </p>
     */
    private String firehoseArn;
    /**
     * <p>
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This IAM
     * role must already exist and must be in the same account as the metric stream. This IAM role must include the
     * following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * firehose:PutRecord
     * </p>
     * </li>
     * <li>
     * <p>
     * firehose:PutRecordBatch
     * </p>
     * </li>
     * </ul>
     */
    private String roleArn;
    /**
     * <p>
     * The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>. For more
     * information about metric stream output formats, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     * Metric streams output formats</a>.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric
     * stream.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * If you are creating a new metric stream, this is the name for the new stream. The name must be different than the
     * names of other metric streams in this account and Region.
     * </p>
     * <p>
     * If you are updating a metric stream, specify the name of that stream here.
     * </p>
     * <p>
     * Valid characters are A-Z, a-z, 0-9, "-" and "_".
     * </p>
     * 
     * @param name
     *        If you are creating a new metric stream, this is the name for the new stream. The name must be different
     *        than the names of other metric streams in this account and Region.</p>
     *        <p>
     *        If you are updating a metric stream, specify the name of that stream here.
     *        </p>
     *        <p>
     *        Valid characters are A-Z, a-z, 0-9, "-" and "_".
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If you are creating a new metric stream, this is the name for the new stream. The name must be different than the
     * names of other metric streams in this account and Region.
     * </p>
     * <p>
     * If you are updating a metric stream, specify the name of that stream here.
     * </p>
     * <p>
     * Valid characters are A-Z, a-z, 0-9, "-" and "_".
     * </p>
     * 
     * @return If you are creating a new metric stream, this is the name for the new stream. The name must be different
     *         than the names of other metric streams in this account and Region.</p>
     *         <p>
     *         If you are updating a metric stream, specify the name of that stream here.
     *         </p>
     *         <p>
     *         Valid characters are A-Z, a-z, 0-9, "-" and "_".
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If you are creating a new metric stream, this is the name for the new stream. The name must be different than the
     * names of other metric streams in this account and Region.
     * </p>
     * <p>
     * If you are updating a metric stream, specify the name of that stream here.
     * </p>
     * <p>
     * Valid characters are A-Z, a-z, 0-9, "-" and "_".
     * </p>
     * 
     * @param name
     *        If you are creating a new metric stream, this is the name for the new stream. The name must be different
     *        than the names of other metric streams in this account and Region.</p>
     *        <p>
     *        If you are updating a metric stream, specify the name of that stream here.
     *        </p>
     *        <p>
     *        Valid characters are A-Z, a-z, 0-9, "-" and "_".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify
     * here.
     * </p>
     * <p>
     * You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * </p>
     * 
     * @return If you specify this parameter, the stream sends only the metrics from the metric namespaces that you
     *         specify here.</p>
     *         <p>
     *         You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     */

    public java.util.List<MetricStreamFilter> getIncludeFilters() {
        if (includeFilters == null) {
            includeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>();
        }
        return includeFilters;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify
     * here.
     * </p>
     * <p>
     * You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * </p>
     * 
     * @param includeFilters
     *        If you specify this parameter, the stream sends only the metrics from the metric namespaces that you
     *        specify here.</p>
     *        <p>
     *        You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     */

    public void setIncludeFilters(java.util.Collection<MetricStreamFilter> includeFilters) {
        if (includeFilters == null) {
            this.includeFilters = null;
            return;
        }

        this.includeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(includeFilters);
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify
     * here.
     * </p>
     * <p>
     * You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeFilters(java.util.Collection)} or {@link #withIncludeFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeFilters
     *        If you specify this parameter, the stream sends only the metrics from the metric namespaces that you
     *        specify here.</p>
     *        <p>
     *        You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withIncludeFilters(MetricStreamFilter... includeFilters) {
        if (this.includeFilters == null) {
            setIncludeFilters(new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(includeFilters.length));
        }
        for (MetricStreamFilter ele : includeFilters) {
            this.includeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify
     * here.
     * </p>
     * <p>
     * You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * </p>
     * 
     * @param includeFilters
     *        If you specify this parameter, the stream sends only the metrics from the metric namespaces that you
     *        specify here.</p>
     *        <p>
     *        You cannot include <code>IncludeFilters</code> and <code>ExcludeFilters</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withIncludeFilters(java.util.Collection<MetricStreamFilter> includeFilters) {
        setIncludeFilters(includeFilters);
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that
     * you specify here.
     * </p>
     * <p>
     * You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * </p>
     * 
     * @return If you specify this parameter, the stream sends metrics from all metric namespaces except for the
     *         namespaces that you specify here.</p>
     *         <p>
     *         You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     */

    public java.util.List<MetricStreamFilter> getExcludeFilters() {
        if (excludeFilters == null) {
            excludeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>();
        }
        return excludeFilters;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that
     * you specify here.
     * </p>
     * <p>
     * You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * </p>
     * 
     * @param excludeFilters
     *        If you specify this parameter, the stream sends metrics from all metric namespaces except for the
     *        namespaces that you specify here.</p>
     *        <p>
     *        You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     */

    public void setExcludeFilters(java.util.Collection<MetricStreamFilter> excludeFilters) {
        if (excludeFilters == null) {
            this.excludeFilters = null;
            return;
        }

        this.excludeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(excludeFilters);
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that
     * you specify here.
     * </p>
     * <p>
     * You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeFilters(java.util.Collection)} or {@link #withExcludeFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludeFilters
     *        If you specify this parameter, the stream sends metrics from all metric namespaces except for the
     *        namespaces that you specify here.</p>
     *        <p>
     *        You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withExcludeFilters(MetricStreamFilter... excludeFilters) {
        if (this.excludeFilters == null) {
            setExcludeFilters(new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(excludeFilters.length));
        }
        for (MetricStreamFilter ele : excludeFilters) {
            this.excludeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that
     * you specify here.
     * </p>
     * <p>
     * You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * </p>
     * 
     * @param excludeFilters
     *        If you specify this parameter, the stream sends metrics from all metric namespaces except for the
     *        namespaces that you specify here.</p>
     *        <p>
     *        You cannot include <code>ExcludeFilters</code> and <code>IncludeFilters</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withExcludeFilters(java.util.Collection<MetricStreamFilter> excludeFilters) {
        setExcludeFilters(excludeFilters);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     * Firehose delivery stream must already exist and must be in the same account as the metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     *        Firehose delivery stream must already exist and must be in the same account as the metric stream.
     */

    public void setFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     * Firehose delivery stream must already exist and must be in the same account as the metric stream.
     * </p>
     * 
     * @return The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     *         Firehose delivery stream must already exist and must be in the same account as the metric stream.
     */

    public String getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     * Firehose delivery stream must already exist and must be in the same account as the metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis
     *        Firehose delivery stream must already exist and must be in the same account as the metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withFirehoseArn(String firehoseArn) {
        setFirehoseArn(firehoseArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This IAM
     * role must already exist and must be in the same account as the metric stream. This IAM role must include the
     * following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * firehose:PutRecord
     * </p>
     * </li>
     * <li>
     * <p>
     * firehose:PutRecordBatch
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This
     *        IAM role must already exist and must be in the same account as the metric stream. This IAM role must
     *        include the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        firehose:PutRecord
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        firehose:PutRecordBatch
     *        </p>
     *        </li>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This IAM
     * role must already exist and must be in the same account as the metric stream. This IAM role must include the
     * following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * firehose:PutRecord
     * </p>
     * </li>
     * <li>
     * <p>
     * firehose:PutRecordBatch
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This
     *         IAM role must already exist and must be in the same account as the metric stream. This IAM role must
     *         include the following permissions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         firehose:PutRecord
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         firehose:PutRecordBatch
     *         </p>
     *         </li>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This IAM
     * role must already exist and must be in the same account as the metric stream. This IAM role must include the
     * following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * firehose:PutRecord
     * </p>
     * </li>
     * <li>
     * <p>
     * firehose:PutRecordBatch
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This
     *        IAM role must already exist and must be in the same account as the metric stream. This IAM role must
     *        include the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        firehose:PutRecord
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        firehose:PutRecordBatch
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>. For more
     * information about metric stream output formats, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     * Metric streams output formats</a>.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     *        For more information about metric stream output formats, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     *        Metric streams output formats</a>.
     * @see MetricStreamOutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>. For more
     * information about metric stream output formats, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     * Metric streams output formats</a>.
     * </p>
     * 
     * @return The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     *         For more information about metric stream output formats, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     *         Metric streams output formats</a>.
     * @see MetricStreamOutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>. For more
     * information about metric stream output formats, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     * Metric streams output formats</a>.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     *        For more information about metric stream output formats, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     *        Metric streams output formats</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public PutMetricStreamRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>. For more
     * information about metric stream output formats, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     * Metric streams output formats</a>.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     *        For more information about metric stream output formats, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html">
     *        Metric streams output formats</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public PutMetricStreamRequest withOutputFormat(MetricStreamOutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric
     * stream.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with
     *         a metric stream.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric
     * stream.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a
     *        metric stream.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric
     * stream.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a
     *        metric stream.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric
     * stream.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a
     *        metric stream.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricStreamRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIncludeFilters() != null)
            sb.append("IncludeFilters: ").append(getIncludeFilters()).append(",");
        if (getExcludeFilters() != null)
            sb.append("ExcludeFilters: ").append(getExcludeFilters()).append(",");
        if (getFirehoseArn() != null)
            sb.append("FirehoseArn: ").append(getFirehoseArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricStreamRequest == false)
            return false;
        PutMetricStreamRequest other = (PutMetricStreamRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeFilters() == null ^ this.getIncludeFilters() == null)
            return false;
        if (other.getIncludeFilters() != null && other.getIncludeFilters().equals(this.getIncludeFilters()) == false)
            return false;
        if (other.getExcludeFilters() == null ^ this.getExcludeFilters() == null)
            return false;
        if (other.getExcludeFilters() != null && other.getExcludeFilters().equals(this.getExcludeFilters()) == false)
            return false;
        if (other.getFirehoseArn() == null ^ this.getFirehoseArn() == null)
            return false;
        if (other.getFirehoseArn() != null && other.getFirehoseArn().equals(this.getFirehoseArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeFilters() == null) ? 0 : getIncludeFilters().hashCode());
        hashCode = prime * hashCode + ((getExcludeFilters() == null) ? 0 : getExcludeFilters().hashCode());
        hashCode = prime * hashCode + ((getFirehoseArn() == null) ? 0 : getFirehoseArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricStreamRequest clone() {
        return (PutMetricStreamRequest) super.clone();
    }

}
