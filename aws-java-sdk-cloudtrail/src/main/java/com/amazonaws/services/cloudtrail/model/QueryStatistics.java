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
 * Metadata about a query, such as the number of results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/QueryStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of results returned.
     * </p>
     */
    private Integer resultsCount;
    /**
     * <p>
     * The total number of results returned by a query.
     * </p>
     */
    private Integer totalResultsCount;
    /**
     * <p>
     * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which
     * your account is billed for the query, unless the query is still running.
     * </p>
     */
    private Long bytesScanned;

    /**
     * <p>
     * The number of results returned.
     * </p>
     * 
     * @param resultsCount
     *        The number of results returned.
     */

    public void setResultsCount(Integer resultsCount) {
        this.resultsCount = resultsCount;
    }

    /**
     * <p>
     * The number of results returned.
     * </p>
     * 
     * @return The number of results returned.
     */

    public Integer getResultsCount() {
        return this.resultsCount;
    }

    /**
     * <p>
     * The number of results returned.
     * </p>
     * 
     * @param resultsCount
     *        The number of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatistics withResultsCount(Integer resultsCount) {
        setResultsCount(resultsCount);
        return this;
    }

    /**
     * <p>
     * The total number of results returned by a query.
     * </p>
     * 
     * @param totalResultsCount
     *        The total number of results returned by a query.
     */

    public void setTotalResultsCount(Integer totalResultsCount) {
        this.totalResultsCount = totalResultsCount;
    }

    /**
     * <p>
     * The total number of results returned by a query.
     * </p>
     * 
     * @return The total number of results returned by a query.
     */

    public Integer getTotalResultsCount() {
        return this.totalResultsCount;
    }

    /**
     * <p>
     * The total number of results returned by a query.
     * </p>
     * 
     * @param totalResultsCount
     *        The total number of results returned by a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatistics withTotalResultsCount(Integer totalResultsCount) {
        setTotalResultsCount(totalResultsCount);
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

    public QueryStatistics withBytesScanned(Long bytesScanned) {
        setBytesScanned(bytesScanned);
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
        if (getResultsCount() != null)
            sb.append("ResultsCount: ").append(getResultsCount()).append(",");
        if (getTotalResultsCount() != null)
            sb.append("TotalResultsCount: ").append(getTotalResultsCount()).append(",");
        if (getBytesScanned() != null)
            sb.append("BytesScanned: ").append(getBytesScanned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStatistics == false)
            return false;
        QueryStatistics other = (QueryStatistics) obj;
        if (other.getResultsCount() == null ^ this.getResultsCount() == null)
            return false;
        if (other.getResultsCount() != null && other.getResultsCount().equals(this.getResultsCount()) == false)
            return false;
        if (other.getTotalResultsCount() == null ^ this.getTotalResultsCount() == null)
            return false;
        if (other.getTotalResultsCount() != null && other.getTotalResultsCount().equals(this.getTotalResultsCount()) == false)
            return false;
        if (other.getBytesScanned() == null ^ this.getBytesScanned() == null)
            return false;
        if (other.getBytesScanned() != null && other.getBytesScanned().equals(this.getBytesScanned()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultsCount() == null) ? 0 : getResultsCount().hashCode());
        hashCode = prime * hashCode + ((getTotalResultsCount() == null) ? 0 : getTotalResultsCount().hashCode());
        hashCode = prime * hashCode + ((getBytesScanned() == null) ? 0 : getBytesScanned().hashCode());
        return hashCode;
    }

    @Override
    public QueryStatistics clone() {
        try {
            return (QueryStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.QueryStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
