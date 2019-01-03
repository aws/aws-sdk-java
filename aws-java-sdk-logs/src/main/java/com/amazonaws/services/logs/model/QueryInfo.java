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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about one CloudWatch Logs Insights query that matches the request in a <code>DescribeQueries</code>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/QueryInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The query string used in this query.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * 
     * @param queryId
     *        The unique ID number of this query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * 
     * @return The unique ID number of this query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * 
     * @param queryId
     *        The unique ID number of this query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * 
     * @param queryString
     *        The query string used in this query.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * 
     * @return The query string used in this query.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * 
     * @param queryString
     *        The query string used in this query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>,
     *        <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * @see QueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * 
     * @return The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>,
     *         <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * @see QueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>,
     *        <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public QueryInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of this query. Possible values are <code>Cancelled</code>, <code>Complete</code>,
     *        <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and <code>Unknown</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public QueryInfo withStatus(QueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * 
     * @param createTime
     *        The date and time that this query was created.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * 
     * @return The date and time that this query was created.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * 
     * @param createTime
     *        The date and time that this query was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group scanned by this query.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * 
     * @return The name of the log group scanned by this query.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group scanned by this query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryInfo == false)
            return false;
        QueryInfo other = (QueryInfo) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public QueryInfo clone() {
        try {
            return (QueryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.QueryInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
