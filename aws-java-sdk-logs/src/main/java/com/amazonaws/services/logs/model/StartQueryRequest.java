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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StartQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     */
    private String logGroupName;
    /**
     * <p>
     * The list of log groups to be queried. You can include up to 50 log groups.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupNames;
    /**
     * <p>
     * The list of log groups to query. You can include up to 50 log groups.
     * </p>
     * <p>
     * You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and
     * you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also
     * be defined in the monitoring account.
     * </p>
     * <p>
     * If you specify an ARN, the ARN can't end with an asterisk (*).
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupIdentifiers;
    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the
     * query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the specified end time is included in the query.
     * Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * The query string to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     * command, only the specified fields and their values are returned. The default is 1000.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @param logGroupName
     *        The log group on which to perform the query.</p> <note>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *        </p>
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @return The log group on which to perform the query.</p> <note>
     *         <p>
     *         A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *         <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *         </p>
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @param logGroupName
     *        The log group on which to perform the query.</p> <note>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 50 log groups.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @return The list of log groups to be queried. You can include up to 50 log groups.</p> <note>
     *         <p>
     *         A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *         <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *         </p>
     */

    public java.util.List<String> getLogGroupNames() {
        if (logGroupNames == null) {
            logGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupNames;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 50 log groups.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @param logGroupNames
     *        The list of log groups to be queried. You can include up to 50 log groups.</p> <note>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *        </p>
     */

    public void setLogGroupNames(java.util.Collection<String> logGroupNames) {
        if (logGroupNames == null) {
            this.logGroupNames = null;
            return;
        }

        this.logGroupNames = new com.amazonaws.internal.SdkInternalList<String>(logGroupNames);
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 50 log groups.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupNames(java.util.Collection)} or {@link #withLogGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logGroupNames
     *        The list of log groups to be queried. You can include up to 50 log groups.</p> <note>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLogGroupNames(String... logGroupNames) {
        if (this.logGroupNames == null) {
            setLogGroupNames(new com.amazonaws.internal.SdkInternalList<String>(logGroupNames.length));
        }
        for (String ele : logGroupNames) {
            this.logGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 50 log groups.
     * </p>
     * <note>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * </note>
     * 
     * @param logGroupNames
     *        The list of log groups to be queried. You can include up to 50 log groups.</p> <note>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
        return this;
    }

    /**
     * <p>
     * The list of log groups to query. You can include up to 50 log groups.
     * </p>
     * <p>
     * You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and
     * you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also
     * be defined in the monitoring account.
     * </p>
     * <p>
     * If you specify an ARN, the ARN can't end with an asterisk (*).
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * 
     * @return The list of log groups to query. You can include up to 50 log groups.</p>
     *         <p>
     *         You can specify them by the log group name or ARN. If a log group that you're querying is in a source
     *         account and you're using a monitoring account, you must specify the ARN of the log group here. The query
     *         definition must also be defined in the monitoring account.
     *         </p>
     *         <p>
     *         If you specify an ARN, the ARN can't end with an asterisk (*).
     *         </p>
     *         <p>
     *         A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *         <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     */

    public java.util.List<String> getLogGroupIdentifiers() {
        if (logGroupIdentifiers == null) {
            logGroupIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupIdentifiers;
    }

    /**
     * <p>
     * The list of log groups to query. You can include up to 50 log groups.
     * </p>
     * <p>
     * You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and
     * you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also
     * be defined in the monitoring account.
     * </p>
     * <p>
     * If you specify an ARN, the ARN can't end with an asterisk (*).
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * 
     * @param logGroupIdentifiers
     *        The list of log groups to query. You can include up to 50 log groups.</p>
     *        <p>
     *        You can specify them by the log group name or ARN. If a log group that you're querying is in a source
     *        account and you're using a monitoring account, you must specify the ARN of the log group here. The query
     *        definition must also be defined in the monitoring account.
     *        </p>
     *        <p>
     *        If you specify an ARN, the ARN can't end with an asterisk (*).
     *        </p>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     */

    public void setLogGroupIdentifiers(java.util.Collection<String> logGroupIdentifiers) {
        if (logGroupIdentifiers == null) {
            this.logGroupIdentifiers = null;
            return;
        }

        this.logGroupIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(logGroupIdentifiers);
    }

    /**
     * <p>
     * The list of log groups to query. You can include up to 50 log groups.
     * </p>
     * <p>
     * You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and
     * you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also
     * be defined in the monitoring account.
     * </p>
     * <p>
     * If you specify an ARN, the ARN can't end with an asterisk (*).
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupIdentifiers(java.util.Collection)} or {@link #withLogGroupIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param logGroupIdentifiers
     *        The list of log groups to query. You can include up to 50 log groups.</p>
     *        <p>
     *        You can specify them by the log group name or ARN. If a log group that you're querying is in a source
     *        account and you're using a monitoring account, you must specify the ARN of the log group here. The query
     *        definition must also be defined in the monitoring account.
     *        </p>
     *        <p>
     *        If you specify an ARN, the ARN can't end with an asterisk (*).
     *        </p>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLogGroupIdentifiers(String... logGroupIdentifiers) {
        if (this.logGroupIdentifiers == null) {
            setLogGroupIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(logGroupIdentifiers.length));
        }
        for (String ele : logGroupIdentifiers) {
            this.logGroupIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log groups to query. You can include up to 50 log groups.
     * </p>
     * <p>
     * You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and
     * you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also
     * be defined in the monitoring account.
     * </p>
     * <p>
     * If you specify an ARN, the ARN can't end with an asterisk (*).
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include exactly one of the following parameters:
     * <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * </p>
     * 
     * @param logGroupIdentifiers
     *        The list of log groups to query. You can include up to 50 log groups.</p>
     *        <p>
     *        You can specify them by the log group name or ARN. If a log group that you're querying is in a source
     *        account and you're using a monitoring account, you must specify the ARN of the log group here. The query
     *        definition must also be defined in the monitoring account.
     *        </p>
     *        <p>
     *        If you specify an ARN, the ARN can't end with an asterisk (*).
     *        </p>
     *        <p>
     *        A <code>StartQuery</code> operation must include exactly one of the following parameters:
     *        <code>logGroupName</code>, <code>logGroupNames</code> or <code>logGroupIdentifiers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLogGroupIdentifiers(java.util.Collection<String> logGroupIdentifiers) {
        setLogGroupIdentifiers(logGroupIdentifiers);
        return this;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the
     * query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time range to query. The range is inclusive, so the specified start time is included
     *        in the query. Specified as epoch time, the number of seconds since
     *        <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the
     * query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @return The beginning of the time range to query. The range is inclusive, so the specified start time is included
     *         in the query. Specified as epoch time, the number of seconds since
     *         <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the
     * query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time range to query. The range is inclusive, so the specified start time is included
     *        in the query. Specified as epoch time, the number of seconds since
     *        <code>January 1, 1970, 00:00:00 UTC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the specified end time is included in the query.
     * Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param endTime
     *        The end of the time range to query. The range is inclusive, so the specified end time is included in the
     *        query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the specified end time is included in the query.
     * Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @return The end of the time range to query. The range is inclusive, so the specified end time is included in the
     *         query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the specified end time is included in the query.
     * Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param endTime
     *        The end of the time range to query. The range is inclusive, so the specified end time is included in the
     *        query. Specified as epoch time, the number of seconds since <code>January 1, 1970, 00:00:00 UTC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param queryString
     *        The query string to use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *        Insights Query Syntax</a>.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @return The query string to use. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *         Insights Query Syntax</a>.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param queryString
     *        The query string to use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *        Insights Query Syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     * command, only the specified fields and their values are returned. The default is 1000.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     *        command, only the specified fields and their values are returned. The default is 1000.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     * command, only the specified fields and their values are returned. The default is 1000.
     * </p>
     * 
     * @return The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     *         command, only the specified fields and their values are returned. The default is 1000.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     * command, only the specified fields and their values are returned. The default is 1000.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events to return in the query. If the query string uses the <code>fields</code>
     *        command, only the specified fields and their values are returned. The default is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getLogGroupNames() != null)
            sb.append("LogGroupNames: ").append(getLogGroupNames()).append(",");
        if (getLogGroupIdentifiers() != null)
            sb.append("LogGroupIdentifiers: ").append(getLogGroupIdentifiers()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryRequest == false)
            return false;
        StartQueryRequest other = (StartQueryRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
            return false;
        if (other.getLogGroupIdentifiers() == null ^ this.getLogGroupIdentifiers() == null)
            return false;
        if (other.getLogGroupIdentifiers() != null && other.getLogGroupIdentifiers().equals(this.getLogGroupIdentifiers()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        hashCode = prime * hashCode + ((getLogGroupIdentifiers() == null) ? 0 : getLogGroupIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryRequest clone() {
        return (StartQueryRequest) super.clone();
    }

}
