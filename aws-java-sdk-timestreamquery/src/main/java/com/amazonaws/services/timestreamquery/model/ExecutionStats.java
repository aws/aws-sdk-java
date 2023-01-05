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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for a single scheduled query run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecutionStats" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     * </p>
     */
    private Long executionTimeInMillis;
    /**
     * <p>
     * Data writes metered for records ingested in a single scheduled query run.
     * </p>
     */
    private Long dataWrites;
    /**
     * <p>
     * Bytes metered for a single scheduled query run.
     * </p>
     */
    private Long bytesMetered;
    /**
     * <p>
     * The number of records ingested for a single scheduled query run.
     * </p>
     */
    private Long recordsIngested;
    /**
     * <p>
     * Number of rows present in the output from running a query before ingestion to destination data source.
     * </p>
     */
    private Long queryResultRows;

    /**
     * <p>
     * Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     * </p>
     * 
     * @param executionTimeInMillis
     *        Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     */

    public void setExecutionTimeInMillis(Long executionTimeInMillis) {
        this.executionTimeInMillis = executionTimeInMillis;
    }

    /**
     * <p>
     * Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     * </p>
     * 
     * @return Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     */

    public Long getExecutionTimeInMillis() {
        return this.executionTimeInMillis;
    }

    /**
     * <p>
     * Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     * </p>
     * 
     * @param executionTimeInMillis
     *        Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStats withExecutionTimeInMillis(Long executionTimeInMillis) {
        setExecutionTimeInMillis(executionTimeInMillis);
        return this;
    }

    /**
     * <p>
     * Data writes metered for records ingested in a single scheduled query run.
     * </p>
     * 
     * @param dataWrites
     *        Data writes metered for records ingested in a single scheduled query run.
     */

    public void setDataWrites(Long dataWrites) {
        this.dataWrites = dataWrites;
    }

    /**
     * <p>
     * Data writes metered for records ingested in a single scheduled query run.
     * </p>
     * 
     * @return Data writes metered for records ingested in a single scheduled query run.
     */

    public Long getDataWrites() {
        return this.dataWrites;
    }

    /**
     * <p>
     * Data writes metered for records ingested in a single scheduled query run.
     * </p>
     * 
     * @param dataWrites
     *        Data writes metered for records ingested in a single scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStats withDataWrites(Long dataWrites) {
        setDataWrites(dataWrites);
        return this;
    }

    /**
     * <p>
     * Bytes metered for a single scheduled query run.
     * </p>
     * 
     * @param bytesMetered
     *        Bytes metered for a single scheduled query run.
     */

    public void setBytesMetered(Long bytesMetered) {
        this.bytesMetered = bytesMetered;
    }

    /**
     * <p>
     * Bytes metered for a single scheduled query run.
     * </p>
     * 
     * @return Bytes metered for a single scheduled query run.
     */

    public Long getBytesMetered() {
        return this.bytesMetered;
    }

    /**
     * <p>
     * Bytes metered for a single scheduled query run.
     * </p>
     * 
     * @param bytesMetered
     *        Bytes metered for a single scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStats withBytesMetered(Long bytesMetered) {
        setBytesMetered(bytesMetered);
        return this;
    }

    /**
     * <p>
     * The number of records ingested for a single scheduled query run.
     * </p>
     * 
     * @param recordsIngested
     *        The number of records ingested for a single scheduled query run.
     */

    public void setRecordsIngested(Long recordsIngested) {
        this.recordsIngested = recordsIngested;
    }

    /**
     * <p>
     * The number of records ingested for a single scheduled query run.
     * </p>
     * 
     * @return The number of records ingested for a single scheduled query run.
     */

    public Long getRecordsIngested() {
        return this.recordsIngested;
    }

    /**
     * <p>
     * The number of records ingested for a single scheduled query run.
     * </p>
     * 
     * @param recordsIngested
     *        The number of records ingested for a single scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStats withRecordsIngested(Long recordsIngested) {
        setRecordsIngested(recordsIngested);
        return this;
    }

    /**
     * <p>
     * Number of rows present in the output from running a query before ingestion to destination data source.
     * </p>
     * 
     * @param queryResultRows
     *        Number of rows present in the output from running a query before ingestion to destination data source.
     */

    public void setQueryResultRows(Long queryResultRows) {
        this.queryResultRows = queryResultRows;
    }

    /**
     * <p>
     * Number of rows present in the output from running a query before ingestion to destination data source.
     * </p>
     * 
     * @return Number of rows present in the output from running a query before ingestion to destination data source.
     */

    public Long getQueryResultRows() {
        return this.queryResultRows;
    }

    /**
     * <p>
     * Number of rows present in the output from running a query before ingestion to destination data source.
     * </p>
     * 
     * @param queryResultRows
     *        Number of rows present in the output from running a query before ingestion to destination data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStats withQueryResultRows(Long queryResultRows) {
        setQueryResultRows(queryResultRows);
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
        if (getExecutionTimeInMillis() != null)
            sb.append("ExecutionTimeInMillis: ").append(getExecutionTimeInMillis()).append(",");
        if (getDataWrites() != null)
            sb.append("DataWrites: ").append(getDataWrites()).append(",");
        if (getBytesMetered() != null)
            sb.append("BytesMetered: ").append(getBytesMetered()).append(",");
        if (getRecordsIngested() != null)
            sb.append("RecordsIngested: ").append(getRecordsIngested()).append(",");
        if (getQueryResultRows() != null)
            sb.append("QueryResultRows: ").append(getQueryResultRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionStats == false)
            return false;
        ExecutionStats other = (ExecutionStats) obj;
        if (other.getExecutionTimeInMillis() == null ^ this.getExecutionTimeInMillis() == null)
            return false;
        if (other.getExecutionTimeInMillis() != null && other.getExecutionTimeInMillis().equals(this.getExecutionTimeInMillis()) == false)
            return false;
        if (other.getDataWrites() == null ^ this.getDataWrites() == null)
            return false;
        if (other.getDataWrites() != null && other.getDataWrites().equals(this.getDataWrites()) == false)
            return false;
        if (other.getBytesMetered() == null ^ this.getBytesMetered() == null)
            return false;
        if (other.getBytesMetered() != null && other.getBytesMetered().equals(this.getBytesMetered()) == false)
            return false;
        if (other.getRecordsIngested() == null ^ this.getRecordsIngested() == null)
            return false;
        if (other.getRecordsIngested() != null && other.getRecordsIngested().equals(this.getRecordsIngested()) == false)
            return false;
        if (other.getQueryResultRows() == null ^ this.getQueryResultRows() == null)
            return false;
        if (other.getQueryResultRows() != null && other.getQueryResultRows().equals(this.getQueryResultRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionTimeInMillis() == null) ? 0 : getExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getDataWrites() == null) ? 0 : getDataWrites().hashCode());
        hashCode = prime * hashCode + ((getBytesMetered() == null) ? 0 : getBytesMetered().hashCode());
        hashCode = prime * hashCode + ((getRecordsIngested() == null) ? 0 : getRecordsIngested().hashCode());
        hashCode = prime * hashCode + ((getQueryResultRows() == null) ? 0 : getQueryResultRows().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionStats clone() {
        try {
            return (ExecutionStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ExecutionStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
