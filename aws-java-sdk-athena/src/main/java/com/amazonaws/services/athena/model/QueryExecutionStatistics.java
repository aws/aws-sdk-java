/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of
 * statement that was run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecutionStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     */
    private Long engineExecutionTimeInMillis;
    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     */
    private Long dataScannedInBytes;
    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     * location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the
     * manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned
     * files resulting from a failed query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output Files, and
     * Query History</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     */
    private String dataManifestLocation;
    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     */
    private Long totalExecutionTimeInMillis;
    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient
     * errors occur, Athena might automatically add the query back to the queue.
     * </p>
     */
    private Long queryQueueTimeInMillis;
    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent
     * retrieving table partitions from the data source. Note that because the query engine performs the query planning,
     * query planning time is a subset of engine processing time.
     * </p>
     */
    private Long queryPlanningTimeInMillis;
    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the query results after the query engine
     * finished running the query.
     * </p>
     */
    private Long serviceProcessingTimeInMillis;

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @param engineExecutionTimeInMillis
     *        The number of milliseconds that the query took to execute.
     */

    public void setEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        this.engineExecutionTimeInMillis = engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @return The number of milliseconds that the query took to execute.
     */

    public Long getEngineExecutionTimeInMillis() {
        return this.engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @param engineExecutionTimeInMillis
     *        The number of milliseconds that the query took to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        setEngineExecutionTimeInMillis(engineExecutionTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @param dataScannedInBytes
     *        The number of bytes in the data that was queried.
     */

    public void setDataScannedInBytes(Long dataScannedInBytes) {
        this.dataScannedInBytes = dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @return The number of bytes in the data that was queried.
     */

    public Long getDataScannedInBytes() {
        return this.dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @param dataScannedInBytes
     *        The number of bytes in the data that was queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withDataScannedInBytes(Long dataScannedInBytes) {
        setDataScannedInBytes(dataScannedInBytes);
        return this;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     * location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the
     * manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned
     * files resulting from a failed query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output Files, and
     * Query History</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param dataManifestLocation
     *        The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     *        location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query
     *        fails, the manifest file also tracks files that the query intended to write. The manifest is useful for
     *        identifying orphaned files resulting from a failed query. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output
     *        Files, and Query History</a> in the <i>Amazon Athena User Guide</i>.
     */

    public void setDataManifestLocation(String dataManifestLocation) {
        this.dataManifestLocation = dataManifestLocation;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     * location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the
     * manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned
     * files resulting from a failed query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output Files, and
     * Query History</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @return The location and file name of a data manifest file. The manifest file is saved to the Athena query
     *         results location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the
     *         query fails, the manifest file also tracks files that the query intended to write. The manifest is useful
     *         for identifying orphaned files resulting from a failed query. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output
     *         Files, and Query History</a> in the <i>Amazon Athena User Guide</i>.
     */

    public String getDataManifestLocation() {
        return this.dataManifestLocation;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     * location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the
     * manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned
     * files resulting from a failed query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output Files, and
     * Query History</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param dataManifestLocation
     *        The location and file name of a data manifest file. The manifest file is saved to the Athena query results
     *        location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query
     *        fails, the manifest file also tracks files that the query intended to write. The manifest is useful for
     *        identifying orphaned files resulting from a failed query. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working with Query Results, Output
     *        Files, and Query History</a> in the <i>Amazon Athena User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withDataManifestLocation(String dataManifestLocation) {
        setDataManifestLocation(dataManifestLocation);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     * 
     * @param totalExecutionTimeInMillis
     *        The number of milliseconds that Athena took to run the query.
     */

    public void setTotalExecutionTimeInMillis(Long totalExecutionTimeInMillis) {
        this.totalExecutionTimeInMillis = totalExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     * 
     * @return The number of milliseconds that Athena took to run the query.
     */

    public Long getTotalExecutionTimeInMillis() {
        return this.totalExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     * 
     * @param totalExecutionTimeInMillis
     *        The number of milliseconds that Athena took to run the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withTotalExecutionTimeInMillis(Long totalExecutionTimeInMillis) {
        setTotalExecutionTimeInMillis(totalExecutionTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient
     * errors occur, Athena might automatically add the query back to the queue.
     * </p>
     * 
     * @param queryQueueTimeInMillis
     *        The number of milliseconds that the query was in your query queue waiting for resources. Note that if
     *        transient errors occur, Athena might automatically add the query back to the queue.
     */

    public void setQueryQueueTimeInMillis(Long queryQueueTimeInMillis) {
        this.queryQueueTimeInMillis = queryQueueTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient
     * errors occur, Athena might automatically add the query back to the queue.
     * </p>
     * 
     * @return The number of milliseconds that the query was in your query queue waiting for resources. Note that if
     *         transient errors occur, Athena might automatically add the query back to the queue.
     */

    public Long getQueryQueueTimeInMillis() {
        return this.queryQueueTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient
     * errors occur, Athena might automatically add the query back to the queue.
     * </p>
     * 
     * @param queryQueueTimeInMillis
     *        The number of milliseconds that the query was in your query queue waiting for resources. Note that if
     *        transient errors occur, Athena might automatically add the query back to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withQueryQueueTimeInMillis(Long queryQueueTimeInMillis) {
        setQueryQueueTimeInMillis(queryQueueTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent
     * retrieving table partitions from the data source. Note that because the query engine performs the query planning,
     * query planning time is a subset of engine processing time.
     * </p>
     * 
     * @param queryPlanningTimeInMillis
     *        The number of milliseconds that Athena took to plan the query processing flow. This includes the time
     *        spent retrieving table partitions from the data source. Note that because the query engine performs the
     *        query planning, query planning time is a subset of engine processing time.
     */

    public void setQueryPlanningTimeInMillis(Long queryPlanningTimeInMillis) {
        this.queryPlanningTimeInMillis = queryPlanningTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent
     * retrieving table partitions from the data source. Note that because the query engine performs the query planning,
     * query planning time is a subset of engine processing time.
     * </p>
     * 
     * @return The number of milliseconds that Athena took to plan the query processing flow. This includes the time
     *         spent retrieving table partitions from the data source. Note that because the query engine performs the
     *         query planning, query planning time is a subset of engine processing time.
     */

    public Long getQueryPlanningTimeInMillis() {
        return this.queryPlanningTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent
     * retrieving table partitions from the data source. Note that because the query engine performs the query planning,
     * query planning time is a subset of engine processing time.
     * </p>
     * 
     * @param queryPlanningTimeInMillis
     *        The number of milliseconds that Athena took to plan the query processing flow. This includes the time
     *        spent retrieving table partitions from the data source. Note that because the query engine performs the
     *        query planning, query planning time is a subset of engine processing time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withQueryPlanningTimeInMillis(Long queryPlanningTimeInMillis) {
        setQueryPlanningTimeInMillis(queryPlanningTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the query results after the query engine
     * finished running the query.
     * </p>
     * 
     * @param serviceProcessingTimeInMillis
     *        The number of milliseconds that Athena took to finalize and publish the query results after the query
     *        engine finished running the query.
     */

    public void setServiceProcessingTimeInMillis(Long serviceProcessingTimeInMillis) {
        this.serviceProcessingTimeInMillis = serviceProcessingTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the query results after the query engine
     * finished running the query.
     * </p>
     * 
     * @return The number of milliseconds that Athena took to finalize and publish the query results after the query
     *         engine finished running the query.
     */

    public Long getServiceProcessingTimeInMillis() {
        return this.serviceProcessingTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the query results after the query engine
     * finished running the query.
     * </p>
     * 
     * @param serviceProcessingTimeInMillis
     *        The number of milliseconds that Athena took to finalize and publish the query results after the query
     *        engine finished running the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withServiceProcessingTimeInMillis(Long serviceProcessingTimeInMillis) {
        setServiceProcessingTimeInMillis(serviceProcessingTimeInMillis);
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
        if (getEngineExecutionTimeInMillis() != null)
            sb.append("EngineExecutionTimeInMillis: ").append(getEngineExecutionTimeInMillis()).append(",");
        if (getDataScannedInBytes() != null)
            sb.append("DataScannedInBytes: ").append(getDataScannedInBytes()).append(",");
        if (getDataManifestLocation() != null)
            sb.append("DataManifestLocation: ").append(getDataManifestLocation()).append(",");
        if (getTotalExecutionTimeInMillis() != null)
            sb.append("TotalExecutionTimeInMillis: ").append(getTotalExecutionTimeInMillis()).append(",");
        if (getQueryQueueTimeInMillis() != null)
            sb.append("QueryQueueTimeInMillis: ").append(getQueryQueueTimeInMillis()).append(",");
        if (getQueryPlanningTimeInMillis() != null)
            sb.append("QueryPlanningTimeInMillis: ").append(getQueryPlanningTimeInMillis()).append(",");
        if (getServiceProcessingTimeInMillis() != null)
            sb.append("ServiceProcessingTimeInMillis: ").append(getServiceProcessingTimeInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionStatistics == false)
            return false;
        QueryExecutionStatistics other = (QueryExecutionStatistics) obj;
        if (other.getEngineExecutionTimeInMillis() == null ^ this.getEngineExecutionTimeInMillis() == null)
            return false;
        if (other.getEngineExecutionTimeInMillis() != null && other.getEngineExecutionTimeInMillis().equals(this.getEngineExecutionTimeInMillis()) == false)
            return false;
        if (other.getDataScannedInBytes() == null ^ this.getDataScannedInBytes() == null)
            return false;
        if (other.getDataScannedInBytes() != null && other.getDataScannedInBytes().equals(this.getDataScannedInBytes()) == false)
            return false;
        if (other.getDataManifestLocation() == null ^ this.getDataManifestLocation() == null)
            return false;
        if (other.getDataManifestLocation() != null && other.getDataManifestLocation().equals(this.getDataManifestLocation()) == false)
            return false;
        if (other.getTotalExecutionTimeInMillis() == null ^ this.getTotalExecutionTimeInMillis() == null)
            return false;
        if (other.getTotalExecutionTimeInMillis() != null && other.getTotalExecutionTimeInMillis().equals(this.getTotalExecutionTimeInMillis()) == false)
            return false;
        if (other.getQueryQueueTimeInMillis() == null ^ this.getQueryQueueTimeInMillis() == null)
            return false;
        if (other.getQueryQueueTimeInMillis() != null && other.getQueryQueueTimeInMillis().equals(this.getQueryQueueTimeInMillis()) == false)
            return false;
        if (other.getQueryPlanningTimeInMillis() == null ^ this.getQueryPlanningTimeInMillis() == null)
            return false;
        if (other.getQueryPlanningTimeInMillis() != null && other.getQueryPlanningTimeInMillis().equals(this.getQueryPlanningTimeInMillis()) == false)
            return false;
        if (other.getServiceProcessingTimeInMillis() == null ^ this.getServiceProcessingTimeInMillis() == null)
            return false;
        if (other.getServiceProcessingTimeInMillis() != null
                && other.getServiceProcessingTimeInMillis().equals(this.getServiceProcessingTimeInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineExecutionTimeInMillis() == null) ? 0 : getEngineExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getDataScannedInBytes() == null) ? 0 : getDataScannedInBytes().hashCode());
        hashCode = prime * hashCode + ((getDataManifestLocation() == null) ? 0 : getDataManifestLocation().hashCode());
        hashCode = prime * hashCode + ((getTotalExecutionTimeInMillis() == null) ? 0 : getTotalExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getQueryQueueTimeInMillis() == null) ? 0 : getQueryQueueTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getQueryPlanningTimeInMillis() == null) ? 0 : getQueryPlanningTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getServiceProcessingTimeInMillis() == null) ? 0 : getServiceProcessingTimeInMillis().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecutionStatistics clone() {
        try {
            return (QueryExecutionStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
