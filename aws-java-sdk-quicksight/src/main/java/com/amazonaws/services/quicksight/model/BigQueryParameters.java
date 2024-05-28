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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters that are required to connect to a Google BigQuery data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BigQueryParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BigQueryParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Google Cloud Platform project ID where your datasource was created.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The storage location where you create a Google BigQuery data source.
     * </p>
     */
    private String dataSetRegion;

    /**
     * <p>
     * The Google Cloud Platform project ID where your datasource was created.
     * </p>
     * 
     * @param projectId
     *        The Google Cloud Platform project ID where your datasource was created.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The Google Cloud Platform project ID where your datasource was created.
     * </p>
     * 
     * @return The Google Cloud Platform project ID where your datasource was created.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The Google Cloud Platform project ID where your datasource was created.
     * </p>
     * 
     * @param projectId
     *        The Google Cloud Platform project ID where your datasource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BigQueryParameters withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The storage location where you create a Google BigQuery data source.
     * </p>
     * 
     * @param dataSetRegion
     *        The storage location where you create a Google BigQuery data source.
     */

    public void setDataSetRegion(String dataSetRegion) {
        this.dataSetRegion = dataSetRegion;
    }

    /**
     * <p>
     * The storage location where you create a Google BigQuery data source.
     * </p>
     * 
     * @return The storage location where you create a Google BigQuery data source.
     */

    public String getDataSetRegion() {
        return this.dataSetRegion;
    }

    /**
     * <p>
     * The storage location where you create a Google BigQuery data source.
     * </p>
     * 
     * @param dataSetRegion
     *        The storage location where you create a Google BigQuery data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BigQueryParameters withDataSetRegion(String dataSetRegion) {
        setDataSetRegion(dataSetRegion);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getDataSetRegion() != null)
            sb.append("DataSetRegion: ").append(getDataSetRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BigQueryParameters == false)
            return false;
        BigQueryParameters other = (BigQueryParameters) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getDataSetRegion() == null ^ this.getDataSetRegion() == null)
            return false;
        if (other.getDataSetRegion() != null && other.getDataSetRegion().equals(this.getDataSetRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getDataSetRegion() == null) ? 0 : getDataSetRegion().hashCode());
        return hashCode;
    }

    @Override
    public BigQueryParameters clone() {
        try {
            return (BigQueryParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BigQueryParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
