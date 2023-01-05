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
 * A SQL string of criteria about events that you want to collect in an event data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Query implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     */
    private String queryStatus;
    /**
     * <p>
     * The creation time of a query.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of a query.
     * </p>
     * 
     * @param queryId
     *        The ID of a query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of a query.
     * </p>
     * 
     * @return The ID of a query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of a query.
     * </p>
     * 
     * @param queryId
     *        The ID of a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Query withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @return The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *         <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public Query withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. This can be <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public Query withQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of a query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of a query.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of a query.
     * </p>
     * 
     * @return The creation time of a query.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of a query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Query withCreationTime(java.util.Date creationTime) {
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus()).append(",");
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

        if (obj instanceof Query == false)
            return false;
        Query other = (Query) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
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

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public Query clone() {
        try {
            return (Query) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.QueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
