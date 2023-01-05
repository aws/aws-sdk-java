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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The SQL code of a query.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>, <code>RUNNING</code>,
     * <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>
     * </p>
     */
    private String queryStatus;
    /**
     * <p>
     * Metadata about a query, including the number of events that were matched, the total number of events scanned, the
     * query run time in milliseconds, and the query's creation time.
     * </p>
     */
    private QueryStatisticsForDescribeQuery queryStatistics;
    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     * </p>
     */
    private String deliveryS3Uri;
    /**
     * <p>
     * The delivery status.
     * </p>
     */
    private String deliveryStatus;

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @param queryId
     *        The ID of the query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @return The ID of the query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @param queryId
     *        The ID of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The SQL code of a query.
     * </p>
     * 
     * @param queryString
     *        The SQL code of a query.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The SQL code of a query.
     * </p>
     * 
     * @return The SQL code of a query.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The SQL code of a query.
     * </p>
     * 
     * @param queryString
     *        The SQL code of a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryResult withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>, <code>RUNNING</code>,
     * <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>
     * </p>
     * 
     * @param queryStatus
     *        The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>,
     *        <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     *        <code>CANCELLED</code>
     * @see QueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>, <code>RUNNING</code>,
     * <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>
     * </p>
     * 
     * @return The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>,
     *         <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     *         <code>CANCELLED</code>
     * @see QueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>, <code>RUNNING</code>,
     * <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>
     * </p>
     * 
     * @param queryStatus
     *        The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>,
     *        <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     *        <code>CANCELLED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public DescribeQueryResult withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>, <code>RUNNING</code>,
     * <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>
     * </p>
     * 
     * @param queryStatus
     *        The status of a query. Values for <code>QueryStatus</code> include <code>QUEUED</code>,
     *        <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     *        <code>CANCELLED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public DescribeQueryResult withQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Metadata about a query, including the number of events that were matched, the total number of events scanned, the
     * query run time in milliseconds, and the query's creation time.
     * </p>
     * 
     * @param queryStatistics
     *        Metadata about a query, including the number of events that were matched, the total number of events
     *        scanned, the query run time in milliseconds, and the query's creation time.
     */

    public void setQueryStatistics(QueryStatisticsForDescribeQuery queryStatistics) {
        this.queryStatistics = queryStatistics;
    }

    /**
     * <p>
     * Metadata about a query, including the number of events that were matched, the total number of events scanned, the
     * query run time in milliseconds, and the query's creation time.
     * </p>
     * 
     * @return Metadata about a query, including the number of events that were matched, the total number of events
     *         scanned, the query run time in milliseconds, and the query's creation time.
     */

    public QueryStatisticsForDescribeQuery getQueryStatistics() {
        return this.queryStatistics;
    }

    /**
     * <p>
     * Metadata about a query, including the number of events that were matched, the total number of events scanned, the
     * query run time in milliseconds, and the query's creation time.
     * </p>
     * 
     * @param queryStatistics
     *        Metadata about a query, including the number of events that were matched, the total number of events
     *        scanned, the query run time in milliseconds, and the query's creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryResult withQueryStatistics(QueryStatisticsForDescribeQuery queryStatistics) {
        setQueryStatistics(queryStatistics);
        return this;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned if a query failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @return The error message returned if a query failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned if a query failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     * </p>
     * 
     * @param deliveryS3Uri
     *        The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     */

    public void setDeliveryS3Uri(String deliveryS3Uri) {
        this.deliveryS3Uri = deliveryS3Uri;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     * </p>
     * 
     * @return The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     */

    public String getDeliveryS3Uri() {
        return this.deliveryS3Uri;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     * </p>
     * 
     * @param deliveryS3Uri
     *        The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryResult withDeliveryS3Uri(String deliveryS3Uri) {
        setDeliveryS3Uri(deliveryS3Uri);
        return this;
    }

    /**
     * <p>
     * The delivery status.
     * </p>
     * 
     * @param deliveryStatus
     *        The delivery status.
     * @see DeliveryStatus
     */

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * <p>
     * The delivery status.
     * </p>
     * 
     * @return The delivery status.
     * @see DeliveryStatus
     */

    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * <p>
     * The delivery status.
     * </p>
     * 
     * @param deliveryStatus
     *        The delivery status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public DescribeQueryResult withDeliveryStatus(String deliveryStatus) {
        setDeliveryStatus(deliveryStatus);
        return this;
    }

    /**
     * <p>
     * The delivery status.
     * </p>
     * 
     * @param deliveryStatus
     *        The delivery status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public DescribeQueryResult withDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
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
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus()).append(",");
        if (getQueryStatistics() != null)
            sb.append("QueryStatistics: ").append(getQueryStatistics()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getDeliveryS3Uri() != null)
            sb.append("DeliveryS3Uri: ").append(getDeliveryS3Uri()).append(",");
        if (getDeliveryStatus() != null)
            sb.append("DeliveryStatus: ").append(getDeliveryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQueryResult == false)
            return false;
        DescribeQueryResult other = (DescribeQueryResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        if (other.getQueryStatistics() == null ^ this.getQueryStatistics() == null)
            return false;
        if (other.getQueryStatistics() != null && other.getQueryStatistics().equals(this.getQueryStatistics()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getDeliveryS3Uri() == null ^ this.getDeliveryS3Uri() == null)
            return false;
        if (other.getDeliveryS3Uri() != null && other.getDeliveryS3Uri().equals(this.getDeliveryS3Uri()) == false)
            return false;
        if (other.getDeliveryStatus() == null ^ this.getDeliveryStatus() == null)
            return false;
        if (other.getDeliveryStatus() != null && other.getDeliveryStatus().equals(this.getDeliveryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryStatistics() == null) ? 0 : getQueryStatistics().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3Uri() == null) ? 0 : getDeliveryS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStatus() == null) ? 0 : getDeliveryStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQueryResult clone() {
        try {
            return (DescribeQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
