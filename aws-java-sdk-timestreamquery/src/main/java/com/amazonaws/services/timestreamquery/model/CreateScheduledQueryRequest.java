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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CreateScheduledQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduledQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The query string to run. Parameter names can be specified in the query string <code>@</code> character followed
     * by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used in the query to
     * get the time at which the query is scheduled to run.
     * </p>
     * <p>
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     * <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a scheduled
     * query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code> parameter is
     * initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The schedule configuration for the query.
     * </p>
     */
    private ScheduleConfiguration scheduleConfiguration;
    /**
     * <p>
     * Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     * finishes, when the state is updated or when you delete it.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * Configuration used for writing the result of a query.
     * </p>
     */
    private TargetConfiguration targetConfiguration;
    /**
     * <p>
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same request
     * repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests has the same
     * effect as making a single request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * </p>
     */
    private String scheduledQueryExecutionRoleArn;
    /**
     * <p>
     * A list of key-value pairs to label the scheduled query.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified,
     * the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use
     * the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with <i>alias/</i>
     * </p>
     * <p>
     * If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to encrypt
     * the error report at rest.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the
     * query results.
     * </p>
     */
    private ErrorReportConfiguration errorReportConfiguration;

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @param name
     *        Name of the scheduled query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @return Name of the scheduled query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @param name
     *        Name of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The query string to run. Parameter names can be specified in the query string <code>@</code> character followed
     * by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used in the query to
     * get the time at which the query is scheduled to run.
     * </p>
     * <p>
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     * <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a scheduled
     * query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code> parameter is
     * initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * </p>
     * 
     * @param queryString
     *        The query string to run. Parameter names can be specified in the query string <code>@</code> character
     *        followed by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used
     *        in the query to get the time at which the query is scheduled to run.</p>
     *        <p>
     *        The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     *        <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a
     *        scheduled query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code>
     *        parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to run. Parameter names can be specified in the query string <code>@</code> character followed
     * by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used in the query to
     * get the time at which the query is scheduled to run.
     * </p>
     * <p>
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     * <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a scheduled
     * query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code> parameter is
     * initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * </p>
     * 
     * @return The query string to run. Parameter names can be specified in the query string <code>@</code> character
     *         followed by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be
     *         used in the query to get the time at which the query is scheduled to run.</p>
     *         <p>
     *         The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     *         <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a
     *         scheduled query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code>
     *         parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string to run. Parameter names can be specified in the query string <code>@</code> character followed
     * by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used in the query to
     * get the time at which the query is scheduled to run.
     * </p>
     * <p>
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     * <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a scheduled
     * query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code> parameter is
     * initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * </p>
     * 
     * @param queryString
     *        The query string to run. Parameter names can be specified in the query string <code>@</code> character
     *        followed by an identifier. The named Parameter <code>@scheduled_runtime</code> is reserved and can be used
     *        in the query to get the time at which the query is scheduled to run.</p>
     *        <p>
     *        The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
     *        <code>@scheduled_runtime</code> paramater for each query run. For example, consider an instance of a
     *        scheduled query executing on 2021-12-01 00:00:00. For this instance, the <code>@scheduled_runtime</code>
     *        parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The schedule configuration for the query.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration for the query.
     */

    public void setScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        this.scheduleConfiguration = scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration for the query.
     * </p>
     * 
     * @return The schedule configuration for the query.
     */

    public ScheduleConfiguration getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration for the query.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration for the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        setScheduleConfiguration(scheduleConfiguration);
        return this;
    }

    /**
     * <p>
     * Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     * finishes, when the state is updated or when you delete it.
     * </p>
     * 
     * @param notificationConfiguration
     *        Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     *        finishes, when the state is updated or when you delete it.
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     * finishes, when the state is updated or when you delete it.
     * </p>
     * 
     * @return Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     *         finishes, when the state is updated or when you delete it.
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     * finishes, when the state is updated or when you delete it.
     * </p>
     * 
     * @param notificationConfiguration
     *        Notification configuration for the scheduled query. A notification is sent by Timestream when a query run
     *        finishes, when the state is updated or when you delete it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration used for writing the result of a query.
     * </p>
     * 
     * @param targetConfiguration
     *        Configuration used for writing the result of a query.
     */

    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * Configuration used for writing the result of a query.
     * </p>
     * 
     * @return Configuration used for writing the result of a query.
     */

    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * Configuration used for writing the result of a query.
     * </p>
     * 
     * @param targetConfiguration
     *        Configuration used for writing the result of a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withTargetConfiguration(TargetConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
        return this;
    }

    /**
     * <p>
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same request
     * repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests has the same
     * effect as making a single request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientToken
     *        Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same
     *        request repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests
     *        has the same effect as making a single request. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     *        <code>ClientToken</code> on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *        </p>
     *        </li>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same request
     * repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests has the same
     * effect as making a single request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same
     *         request repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests
     *         has the same effect as making a single request. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     *         <code>ClientToken</code> on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *         </p>
     *         </li>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same request
     * repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests has the same
     * effect as making a single request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientToken
     *        Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same
     *        request repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests
     *        has the same effect as making a single request. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If CreateScheduledQuery is called without a <code>ClientToken</code>, the Query SDK generates a
     *        <code>ClientToken</code> on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After 8 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * </p>
     * 
     * @param scheduledQueryExecutionRoleArn
     *        The ARN for the IAM role that Timestream will assume when running the scheduled query.
     */

    public void setScheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
        this.scheduledQueryExecutionRoleArn = scheduledQueryExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * </p>
     * 
     * @return The ARN for the IAM role that Timestream will assume when running the scheduled query.
     */

    public String getScheduledQueryExecutionRoleArn() {
        return this.scheduledQueryExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * </p>
     * 
     * @param scheduledQueryExecutionRoleArn
     *        The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withScheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
        setScheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scheduled query.
     * </p>
     * 
     * @return A list of key-value pairs to label the scheduled query.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scheduled query.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the scheduled query.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to label the scheduled query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scheduled query.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified,
     * the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use
     * the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with <i>alias/</i>
     * </p>
     * <p>
     * If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to encrypt
     * the error report at rest.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not
     *        specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To
     *        specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the
     *        name with <i>alias/</i> </p>
     *        <p>
     *        If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to
     *        encrypt the error report at rest.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified,
     * the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use
     * the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with <i>alias/</i>
     * </p>
     * <p>
     * If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to encrypt
     * the error report at rest.
     * </p>
     * 
     * @return The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not
     *         specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To
     *         specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *         the name with <i>alias/</i> </p>
     *         <p>
     *         If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to
     *         encrypt the error report at rest.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified,
     * the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use
     * the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with <i>alias/</i>
     * </p>
     * <p>
     * If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to encrypt
     * the error report at rest.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not
     *        specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To
     *        specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the
     *        name with <i>alias/</i> </p>
     *        <p>
     *        If ErrorReportConfiguration uses <code>SSE_KMS</code> as encryption type, the same KmsKeyId is used to
     *        encrypt the error report at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the
     * query results.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Configuration for error reporting. Error reports will be generated when a problem is encountered when
     *        writing the query results.
     */

    public void setErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        this.errorReportConfiguration = errorReportConfiguration;
    }

    /**
     * <p>
     * Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the
     * query results.
     * </p>
     * 
     * @return Configuration for error reporting. Error reports will be generated when a problem is encountered when
     *         writing the query results.
     */

    public ErrorReportConfiguration getErrorReportConfiguration() {
        return this.errorReportConfiguration;
    }

    /**
     * <p>
     * Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the
     * query results.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Configuration for error reporting. Error reports will be generated when a problem is encountered when
     *        writing the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledQueryRequest withErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        setErrorReportConfiguration(errorReportConfiguration);
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
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getScheduleConfiguration() != null)
            sb.append("ScheduleConfiguration: ").append(getScheduleConfiguration()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getScheduledQueryExecutionRoleArn() != null)
            sb.append("ScheduledQueryExecutionRoleArn: ").append(getScheduledQueryExecutionRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getErrorReportConfiguration() != null)
            sb.append("ErrorReportConfiguration: ").append(getErrorReportConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduledQueryRequest == false)
            return false;
        CreateScheduledQueryRequest other = (CreateScheduledQueryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getScheduleConfiguration() == null ^ this.getScheduleConfiguration() == null)
            return false;
        if (other.getScheduleConfiguration() != null && other.getScheduleConfiguration().equals(this.getScheduleConfiguration()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getScheduledQueryExecutionRoleArn() == null ^ this.getScheduledQueryExecutionRoleArn() == null)
            return false;
        if (other.getScheduledQueryExecutionRoleArn() != null
                && other.getScheduledQueryExecutionRoleArn().equals(this.getScheduledQueryExecutionRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getErrorReportConfiguration() == null ^ this.getErrorReportConfiguration() == null)
            return false;
        if (other.getErrorReportConfiguration() != null && other.getErrorReportConfiguration().equals(this.getErrorReportConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfiguration() == null) ? 0 : getScheduleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getScheduledQueryExecutionRoleArn() == null) ? 0 : getScheduledQueryExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getErrorReportConfiguration() == null) ? 0 : getErrorReportConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduledQueryRequest clone() {
        return (CreateScheduledQueryRequest) super.clone();
    }

}
