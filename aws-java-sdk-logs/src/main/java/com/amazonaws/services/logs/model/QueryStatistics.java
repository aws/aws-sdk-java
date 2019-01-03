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
 * Contains the number of log events scanned by the query, the number of log events that matched the query criteria, and
 * the total number of bytes in the log events that were scanned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/QueryStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     */
    private Double recordsMatched;
    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     */
    private Double recordsScanned;
    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     */
    private Double bytesScanned;

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     * 
     * @param recordsMatched
     *        The number of log events that matched the query string.
     */

    public void setRecordsMatched(Double recordsMatched) {
        this.recordsMatched = recordsMatched;
    }

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     * 
     * @return The number of log events that matched the query string.
     */

    public Double getRecordsMatched() {
        return this.recordsMatched;
    }

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     * 
     * @param recordsMatched
     *        The number of log events that matched the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatistics withRecordsMatched(Double recordsMatched) {
        setRecordsMatched(recordsMatched);
        return this;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     * 
     * @param recordsScanned
     *        The total number of log events scanned during the query.
     */

    public void setRecordsScanned(Double recordsScanned) {
        this.recordsScanned = recordsScanned;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     * 
     * @return The total number of log events scanned during the query.
     */

    public Double getRecordsScanned() {
        return this.recordsScanned;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     * 
     * @param recordsScanned
     *        The total number of log events scanned during the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatistics withRecordsScanned(Double recordsScanned) {
        setRecordsScanned(recordsScanned);
        return this;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     * 
     * @param bytesScanned
     *        The total number of bytes in the log events scanned during the query.
     */

    public void setBytesScanned(Double bytesScanned) {
        this.bytesScanned = bytesScanned;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     * 
     * @return The total number of bytes in the log events scanned during the query.
     */

    public Double getBytesScanned() {
        return this.bytesScanned;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     * 
     * @param bytesScanned
     *        The total number of bytes in the log events scanned during the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatistics withBytesScanned(Double bytesScanned) {
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
        if (getRecordsMatched() != null)
            sb.append("RecordsMatched: ").append(getRecordsMatched()).append(",");
        if (getRecordsScanned() != null)
            sb.append("RecordsScanned: ").append(getRecordsScanned()).append(",");
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
        if (other.getRecordsMatched() == null ^ this.getRecordsMatched() == null)
            return false;
        if (other.getRecordsMatched() != null && other.getRecordsMatched().equals(this.getRecordsMatched()) == false)
            return false;
        if (other.getRecordsScanned() == null ^ this.getRecordsScanned() == null)
            return false;
        if (other.getRecordsScanned() != null && other.getRecordsScanned().equals(this.getRecordsScanned()) == false)
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

        hashCode = prime * hashCode + ((getRecordsMatched() == null) ? 0 : getRecordsMatched().hashCode());
        hashCode = prime * hashCode + ((getRecordsScanned() == null) ? 0 : getRecordsScanned().hashCode());
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
        com.amazonaws.services.logs.model.transform.QueryStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
