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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets metadata about a query, including the number of events that were matched, the total number of events scanned,
 * the query run time in milliseconds, and the query's creation time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/QueryStatisticsForDescribeQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStatisticsForDescribeQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of events that matched a query.
     * </p>
     */
    private Long eventsMatched;
    /**
     * <p>
     * The number of events that the query scanned in the event data store.
     * </p>
     */
    private Long eventsScanned;
    /**
     * <p>
     * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which
     * your account is billed for the query, unless the query is still running.
     * </p>
     */
    private Long bytesScanned;
    /**
     * <p>
     * The query's run time, in milliseconds.
     * </p>
     */
    private Integer executionTimeInMillis;
    /**
     * <p>
     * The creation time of the query.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The number of events that matched a query.
     * </p>
     * 
     * @param eventsMatched
     *        The number of events that matched a query.
     */

    public void setEventsMatched(Long eventsMatched) {
        this.eventsMatched = eventsMatched;
    }

    /**
     * <p>
     * The number of events that matched a query.
     * </p>
     * 
     * @return The number of events that matched a query.
     */

    public Long getEventsMatched() {
        return this.eventsMatched;
    }

    /**
     * <p>
     * The number of events that matched a query.
     * </p>
     * 
     * @param eventsMatched
     *        The number of events that matched a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatisticsForDescribeQuery withEventsMatched(Long eventsMatched) {
        setEventsMatched(eventsMatched);
        return this;
    }

    /**
     * <p>
     * The number of events that the query scanned in the event data store.
     * </p>
     * 
     * @param eventsScanned
     *        The number of events that the query scanned in the event data store.
     */

    public void setEventsScanned(Long eventsScanned) {
        this.eventsScanned = eventsScanned;
    }

    /**
     * <p>
     * The number of events that the query scanned in the event data store.
     * </p>
     * 
     * @return The number of events that the query scanned in the event data store.
     */

    public Long getEventsScanned() {
        return this.eventsScanned;
    }

    /**
     * <p>
     * The number of events that the query scanned in the event data store.
     * </p>
     * 
     * @param eventsScanned
     *        The number of events that the query scanned in the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatisticsForDescribeQuery withEventsScanned(Long eventsScanned) {
        setEventsScanned(eventsScanned);
        return this;
    }

    /**
     * <p>
     * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which
     * your account is billed for the query, unless the query is still running.
     * </p>
     * 
     * @param bytesScanned
     *        The total bytes that the query scanned in the event data store. This value matches the number of bytes for
     *        which your account is billed for the query, unless the query is still running.
     */

    public void setBytesScanned(Long bytesScanned) {
        this.bytesScanned = bytesScanned;
    }

    /**
     * <p>
     * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which
     * your account is billed for the query, unless the query is still running.
     * </p>
     * 
     * @return The total bytes that the query scanned in the event data store. This value matches the number of bytes
     *         for which your account is billed for the query, unless the query is still running.
     */

    public Long getBytesScanned() {
        return this.bytesScanned;
    }

    /**
     * <p>
     * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which
     * your account is billed for the query, unless the query is still running.
     * </p>
     * 
     * @param bytesScanned
     *        The total bytes that the query scanned in the event data store. This value matches the number of bytes for
     *        which your account is billed for the query, unless the query is still running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatisticsForDescribeQuery withBytesScanned(Long bytesScanned) {
        setBytesScanned(bytesScanned);
        return this;
    }

    /**
     * <p>
     * The query's run time, in milliseconds.
     * </p>
     * 
     * @param executionTimeInMillis
     *        The query's run time, in milliseconds.
     */

    public void setExecutionTimeInMillis(Integer executionTimeInMillis) {
        this.executionTimeInMillis = executionTimeInMillis;
    }

    /**
     * <p>
     * The query's run time, in milliseconds.
     * </p>
     * 
     * @return The query's run time, in milliseconds.
     */

    public Integer getExecutionTimeInMillis() {
        return this.executionTimeInMillis;
    }

    /**
     * <p>
     * The query's run time, in milliseconds.
     * </p>
     * 
     * @param executionTimeInMillis
     *        The query's run time, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatisticsForDescribeQuery withExecutionTimeInMillis(Integer executionTimeInMillis) {
        setExecutionTimeInMillis(executionTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The creation time of the query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the query.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the query.
     * </p>
     * 
     * @return The creation time of the query.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatisticsForDescribeQuery withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getEventsMatched() != null)
            sb.append("EventsMatched: ").append(getEventsMatched()).append(",");
        if (getEventsScanned() != null)
            sb.append("EventsScanned: ").append(getEventsScanned()).append(",");
        if (getBytesScanned() != null)
            sb.append("BytesScanned: ").append(getBytesScanned()).append(",");
        if (getExecutionTimeInMillis() != null)
            sb.append("ExecutionTimeInMillis: ").append(getExecutionTimeInMillis()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStatisticsForDescribeQuery == false)
            return false;
        QueryStatisticsForDescribeQuery other = (QueryStatisticsForDescribeQuery) obj;
        if (other.getEventsMatched() == null ^ this.getEventsMatched() == null)
            return false;
        if (other.getEventsMatched() != null && other.getEventsMatched().equals(this.getEventsMatched()) == false)
            return false;
        if (other.getEventsScanned() == null ^ this.getEventsScanned() == null)
            return false;
        if (other.getEventsScanned() != null && other.getEventsScanned().equals(this.getEventsScanned()) == false)
            return false;
        if (other.getBytesScanned() == null ^ this.getBytesScanned() == null)
            return false;
        if (other.getBytesScanned() != null && other.getBytesScanned().equals(this.getBytesScanned()) == false)
            return false;
        if (other.getExecutionTimeInMillis() == null ^ this.getExecutionTimeInMillis() == null)
            return false;
        if (other.getExecutionTimeInMillis() != null && other.getExecutionTimeInMillis().equals(this.getExecutionTimeInMillis()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventsMatched() == null) ? 0 : getEventsMatched().hashCode());
        hashCode = prime * hashCode + ((getEventsScanned() == null) ? 0 : getEventsScanned().hashCode());
        hashCode = prime * hashCode + ((getBytesScanned() == null) ? 0 : getBytesScanned().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimeInMillis() == null) ? 0 : getExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public QueryStatisticsForDescribeQuery clone() {
        try {
            return (QueryStatisticsForDescribeQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.QueryStatisticsForDescribeQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
