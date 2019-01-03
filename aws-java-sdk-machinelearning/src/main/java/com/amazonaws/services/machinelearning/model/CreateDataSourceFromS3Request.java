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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceFromS3Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The data specification of a <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DataLocationS3 - The Amazon S3 location of the observation data.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     */
    private S3DataSpec dataSpec;
    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     */
    private Boolean computeStatistics;

    /**
     * <p>
     * A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied identifier that uniquely identifies the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromS3Request withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>DataSource</code>.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromS3Request withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The data specification of a <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DataLocationS3 - The Amazon S3 location of the observation data.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataSpec
     *        The data specification of a <code>DataSource</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DataLocationS3 - The Amazon S3 location of the observation data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *        specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *        <code>Datasource</code>.
     *        </p>
     *        <p>
     *        Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     */

    public void setDataSpec(S3DataSpec dataSpec) {
        this.dataSpec = dataSpec;
    }

    /**
     * <p>
     * The data specification of a <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DataLocationS3 - The Amazon S3 location of the observation data.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data specification of a <code>DataSource</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DataLocationS3 - The Amazon S3 location of the observation data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *         specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *         <code>Datasource</code>.
     *         </p>
     *         <p>
     *         Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *         </p>
     *         </li>
     */

    public S3DataSpec getDataSpec() {
        return this.dataSpec;
    }

    /**
     * <p>
     * The data specification of a <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DataLocationS3 - The Amazon S3 location of the observation data.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataSpec
     *        The data specification of a <code>DataSource</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DataLocationS3 - The Amazon S3 location of the observation data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaLocationS3 - The Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *        specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *        <code>Datasource</code>.
     *        </p>
     *        <p>
     *        Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromS3Request withDataSpec(S3DataSpec dataSpec) {
        setDataSpec(dataSpec);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *        data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *        <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *        DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *         data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *         <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public Boolean getComputeStatistics() {
        return this.computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *        data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *        <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *        DataSource<code></code> needs to be used for <code>MLModel</code> training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromS3Request withComputeStatistics(Boolean computeStatistics) {
        setComputeStatistics(computeStatistics);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *         data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *         <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public Boolean isComputeStatistics() {
        return this.computeStatistics;
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
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getDataSpec() != null)
            sb.append("DataSpec: ").append(getDataSpec()).append(",");
        if (getComputeStatistics() != null)
            sb.append("ComputeStatistics: ").append(getComputeStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceFromS3Request == false)
            return false;
        CreateDataSourceFromS3Request other = (CreateDataSourceFromS3Request) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getDataSpec() == null ^ this.getDataSpec() == null)
            return false;
        if (other.getDataSpec() != null && other.getDataSpec().equals(this.getDataSpec()) == false)
            return false;
        if (other.getComputeStatistics() == null ^ this.getComputeStatistics() == null)
            return false;
        if (other.getComputeStatistics() != null && other.getComputeStatistics().equals(this.getComputeStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getDataSpec() == null) ? 0 : getDataSpec().hashCode());
        hashCode = prime * hashCode + ((getComputeStatistics() == null) ? 0 : getComputeStatistics().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceFromS3Request clone() {
        return (CreateDataSourceFromS3Request) super.clone();
    }

}
