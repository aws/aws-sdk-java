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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log event
     * starts from the head of the log. If <code>false</code> is specified, the log event starts from the tail of the
     * log.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean startFromHead;
    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get relational database log events</code>
     * request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get log events.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * 
     * @return The name of your database for which to get log events.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.</p>
     *        <p>
     *        Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     * </p>
     * 
     * @return The name of the log stream.</p>
     *         <p>
     *         Use the <code>get relational database log streams</code> operation to get a list of available log
     *         streams.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.</p>
     *        <p>
     *        Use the <code>get relational database log streams</code> operation to get a list of available log streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        The start of the time interval from which to get log events.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The start of the time interval from which to get log events.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *         <code>1538424000</code> as the start time.
     *         </p>
     *         </li>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        The start of the time interval from which to get log events.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        The end of the time interval from which to get log events.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the end time.
     *        </p>
     *        </li>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The end of the time interval from which to get log events.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *         <code>1538424000</code> as the end time.
     *         </p>
     *         </li>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        The end of the time interval from which to get log events.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the end time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log event
     * starts from the head of the log. If <code>false</code> is specified, the log event starts from the tail of the
     * log.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param startFromHead
     *        Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log
     *        event starts from the head of the log. If <code>false</code> is specified, the log event starts from the
     *        tail of the log.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log event
     * starts from the head of the log. If <code>false</code> is specified, the log event starts from the tail of the
     * log.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the
     *         log event starts from the head of the log. If <code>false</code> is specified, the log event starts from
     *         the tail of the log.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getStartFromHead() {
        return this.startFromHead;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log event
     * starts from the head of the log. If <code>false</code> is specified, the log event starts from the tail of the
     * log.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param startFromHead
     *        Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log
     *        event starts from the head of the log. If <code>false</code> is specified, the log event starts from the
     *        tail of the log.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withStartFromHead(Boolean startFromHead) {
        setStartFromHead(startFromHead);
        return this;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the log event
     * starts from the head of the log. If <code>false</code> is specified, the log event starts from the tail of the
     * log.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Parameter to specify if the log should start from head or tail. If <code>true</code> is specified, the
     *         log event starts from the head of the log. If <code>false</code> is specified, the log event starts from
     *         the tail of the log.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isStartFromHead() {
        return this.startFromHead;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get relational database log events</code>
     * request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your
     *        <code>get relational database log events</code> request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get relational database log events</code>
     * request.
     * </p>
     * 
     * @return A token used for advancing to a specific page of results for your
     *         <code>get relational database log events</code> request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get relational database log events</code>
     * request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your
     *        <code>get relational database log events</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartFromHead() != null)
            sb.append("StartFromHead: ").append(getStartFromHead()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogEventsRequest == false)
            return false;
        GetRelationalDatabaseLogEventsRequest other = (GetRelationalDatabaseLogEventsRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartFromHead() == null ^ this.getStartFromHead() == null)
            return false;
        if (other.getStartFromHead() != null && other.getStartFromHead().equals(this.getStartFromHead()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartFromHead() == null) ? 0 : getStartFromHead().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseLogEventsRequest clone() {
        return (GetRelationalDatabaseLogEventsRequest) super.clone();
    }

}
