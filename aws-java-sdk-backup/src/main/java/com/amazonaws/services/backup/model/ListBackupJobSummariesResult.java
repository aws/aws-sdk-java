/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupJobSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory, StartTime,
     * EndTime, and Count of included jobs.
     * </p>
     */
    private java.util.List<BackupJobSummary> backupJobSummaries;
    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     */
    private String aggregationPeriod;
    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory, StartTime,
     * EndTime, and Count of included jobs.
     * </p>
     * 
     * @return This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory,
     *         StartTime, EndTime, and Count of included jobs.
     */

    public java.util.List<BackupJobSummary> getBackupJobSummaries() {
        return backupJobSummaries;
    }

    /**
     * <p>
     * This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory, StartTime,
     * EndTime, and Count of included jobs.
     * </p>
     * 
     * @param backupJobSummaries
     *        This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory,
     *        StartTime, EndTime, and Count of included jobs.
     */

    public void setBackupJobSummaries(java.util.Collection<BackupJobSummary> backupJobSummaries) {
        if (backupJobSummaries == null) {
            this.backupJobSummaries = null;
            return;
        }

        this.backupJobSummaries = new java.util.ArrayList<BackupJobSummary>(backupJobSummaries);
    }

    /**
     * <p>
     * This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory, StartTime,
     * EndTime, and Count of included jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupJobSummaries(java.util.Collection)} or {@link #withBackupJobSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param backupJobSummaries
     *        This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory,
     *        StartTime, EndTime, and Count of included jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesResult withBackupJobSummaries(BackupJobSummary... backupJobSummaries) {
        if (this.backupJobSummaries == null) {
            setBackupJobSummaries(new java.util.ArrayList<BackupJobSummary>(backupJobSummaries.length));
        }
        for (BackupJobSummary ele : backupJobSummaries) {
            this.backupJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory, StartTime,
     * EndTime, and Count of included jobs.
     * </p>
     * 
     * @param backupJobSummaries
     *        This request returns a summary that contains Region, Account, State, ResourceType, MessageCategory,
     *        StartTime, EndTime, and Count of included jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesResult withBackupJobSummaries(java.util.Collection<BackupJobSummary> backupJobSummaries) {
        setBackupJobSummaries(backupJobSummaries);
        return this;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationPeriod
     *        This is the period that sets the boundaries for returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *        </p>
     *        </li>
     */

    public void setAggregationPeriod(String aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is the period that sets the boundaries for returned results.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *         </p>
     *         </li>
     */

    public String getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationPeriod
     *        This is the period that sets the boundaries for returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesResult withAggregationPeriod(String aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned resources. For example, if a request is made to return
     *         <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *         your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesResult withNextToken(String nextToken) {
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
        if (getBackupJobSummaries() != null)
            sb.append("BackupJobSummaries: ").append(getBackupJobSummaries()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
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

        if (obj instanceof ListBackupJobSummariesResult == false)
            return false;
        ListBackupJobSummariesResult other = (ListBackupJobSummariesResult) obj;
        if (other.getBackupJobSummaries() == null ^ this.getBackupJobSummaries() == null)
            return false;
        if (other.getBackupJobSummaries() != null && other.getBackupJobSummaries().equals(this.getBackupJobSummaries()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
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

        hashCode = prime * hashCode + ((getBackupJobSummaries() == null) ? 0 : getBackupJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupJobSummariesResult clone() {
        try {
            return (ListBackupJobSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
