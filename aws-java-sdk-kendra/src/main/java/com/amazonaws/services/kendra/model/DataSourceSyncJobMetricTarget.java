/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Maps a particular data source sync job to a particular data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceSyncJobMetricTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSyncJobMetricTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the data source that is running the sync job.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The ID of the sync job that is running on the data source.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is used and
     * metrics are generated for this sync job.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated and
     * documents are indexed/deleted at the index level without sync job metrics included.
     * </p>
     */
    private String dataSourceSyncJobId;

    /**
     * <p>
     * The ID of the data source that is running the sync job.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source that is running the sync job.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source that is running the sync job.
     * </p>
     * 
     * @return The ID of the data source that is running the sync job.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source that is running the sync job.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source that is running the sync job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetricTarget withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the sync job that is running on the data source.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is used and
     * metrics are generated for this sync job.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated and
     * documents are indexed/deleted at the index level without sync job metrics included.
     * </p>
     * 
     * @param dataSourceSyncJobId
     *        The ID of the sync job that is running on the data source.</p>
     *        <p>
     *        If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is
     *        used and metrics are generated for this sync job.
     *        </p>
     *        <p>
     *        If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated
     *        and documents are indexed/deleted at the index level without sync job metrics included.
     */

    public void setDataSourceSyncJobId(String dataSourceSyncJobId) {
        this.dataSourceSyncJobId = dataSourceSyncJobId;
    }

    /**
     * <p>
     * The ID of the sync job that is running on the data source.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is used and
     * metrics are generated for this sync job.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated and
     * documents are indexed/deleted at the index level without sync job metrics included.
     * </p>
     * 
     * @return The ID of the sync job that is running on the data source.</p>
     *         <p>
     *         If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is
     *         used and metrics are generated for this sync job.
     *         </p>
     *         <p>
     *         If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated
     *         and documents are indexed/deleted at the index level without sync job metrics included.
     */

    public String getDataSourceSyncJobId() {
        return this.dataSourceSyncJobId;
    }

    /**
     * <p>
     * The ID of the sync job that is running on the data source.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is used and
     * metrics are generated for this sync job.
     * </p>
     * <p>
     * If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated and
     * documents are indexed/deleted at the index level without sync job metrics included.
     * </p>
     * 
     * @param dataSourceSyncJobId
     *        The ID of the sync job that is running on the data source.</p>
     *        <p>
     *        If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is
     *        used and metrics are generated for this sync job.
     *        </p>
     *        <p>
     *        If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated
     *        and documents are indexed/deleted at the index level without sync job metrics included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetricTarget withDataSourceSyncJobId(String dataSourceSyncJobId) {
        setDataSourceSyncJobId(dataSourceSyncJobId);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDataSourceSyncJobId() != null)
            sb.append("DataSourceSyncJobId: ").append(getDataSourceSyncJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSyncJobMetricTarget == false)
            return false;
        DataSourceSyncJobMetricTarget other = (DataSourceSyncJobMetricTarget) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceSyncJobId() == null ^ this.getDataSourceSyncJobId() == null)
            return false;
        if (other.getDataSourceSyncJobId() != null && other.getDataSourceSyncJobId().equals(this.getDataSourceSyncJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceSyncJobId() == null) ? 0 : getDataSourceSyncJobId().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSyncJobMetricTarget clone() {
        try {
            return (DataSourceSyncJobMetricTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DataSourceSyncJobMetricTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
