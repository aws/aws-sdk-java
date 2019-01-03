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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Limits the returned queries to only those that have the specified status. Valid values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     */
    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * 
     * @param logGroupName
     *        Limits the returned queries to only those for the specified log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * 
     * @return Limits the returned queries to only those for the specified log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * 
     * @param logGroupName
     *        Limits the returned queries to only those for the specified log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status. Valid values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * 
     * @param status
     *        Limits the returned queries to only those that have the specified status. Valid values are
     *        <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and
     *        <code>Scheduled</code>.
     * @see QueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status. Valid values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * 
     * @return Limits the returned queries to only those that have the specified status. Valid values are
     *         <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and
     *         <code>Scheduled</code>.
     * @see QueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status. Valid values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * 
     * @param status
     *        Limits the returned queries to only those that have the specified status. Valid values are
     *        <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and
     *        <code>Scheduled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public DescribeQueriesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status. Valid values are <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * 
     * @param status
     *        Limits the returned queries to only those that have the specified status. Valid values are
     *        <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>, <code>Running</code>, and
     *        <code>Scheduled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public DescribeQueriesRequest withStatus(QueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned queries to the specified number.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * 
     * @return Limits the number of returned queries to the specified number.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned queries to the specified number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQueriesRequest == false)
            return false;
        DescribeQueriesRequest other = (DescribeQueriesRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQueriesRequest clone() {
        return (DescribeQueriesRequest) super.clone();
    }

}
