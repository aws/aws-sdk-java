/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#createDataSourceFromS3(CreateDataSourceFromS3Request) CreateDataSourceFromS3 operation}.
 * <p>
 * Creates a <code>DataSource</code> object. A <code>DataSource</code>
 * references data that can be used to perform CreateMLModel,
 * CreateEvaluation, or CreateBatchPrediction operations.
 * </p>
 * <p>
 * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In
 * response to <code>CreateDataSourceFromS3</code> ,
 * Amazon Machine Learning (Amazon ML) immediately returns and
 * sets the <code>DataSource</code> status to <code>PENDING</code> .
 * After the <code>DataSource</code> is created and ready for
 * use, Amazon ML sets the <code>Status</code> parameter to
 * <code>COMPLETED</code> .
 * 
 * <code>DataSource</code> in <code>COMPLETED</code>
 * or <code>PENDING</code> status can only be used to perform
 * CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.
 * </p>
 * <p>
 * If Amazon ML cannot accept the input source, it sets the
 * <code>Status</code> parameter to <code>FAILED</code> and includes an
 * error message in the <code>Message</code> attribute of the
 * GetDataSource operation response.
 * </p>
 * <p>
 * The observation data used in a <code>DataSource</code> should be ready
 * to use; that is, it should have a consistent structure, and missing
 * data values should be kept to a minimum. The observation data must
 * reside in one or more CSV files in an Amazon Simple Storage Service
 * (Amazon S3) bucket, along with a schema that describes the data items
 * by name and type. The same schema must be used for all of the data
 * files referenced by the <code>DataSource</code> .
 * </p>
 * <p>
 * After the <code>DataSource</code> has been created, it's ready to use
 * in evaluations and batch predictions. If you plan to use the
 * <code>DataSource</code> to train an <code>MLModel</code> , the
 * <code>DataSource</code> requires another item: a recipe. A recipe
 * describes the observation variables that participate in training an
 * <code>MLModel</code> . A recipe describes how each input variable will
 * be used in training. Will the variable be included or excluded from
 * training? Will the variable be manipulated, for example, combined with
 * another variable, or split apart into word combinations? The recipe
 * provides answers to these questions. For more information, see the
 * <a href="http://docs.aws.amazon.com/machine-learning/latest/dg"> Amazon Machine Learning Developer Guide </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#createDataSourceFromS3(CreateDataSourceFromS3Request)
 */
public class CreateDataSourceFromS3Request extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A user-supplied identifier that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String dataSourceId;

    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String dataSourceName;

    /**
     * The data specification of a <code>DataSource</code>: <ul>
     * <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     * location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     * Amazon S3 location of the <code>DataSchema</code>.</li>
     * <li><p>DataSchema - A JSON string representing the schema. This is not
     * required if <code>DataSchemaUri</code> is specified. </li>
     * <li><p>DataRearrangement - A JSON string representing the splitting
     * requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     * </ul>
     */
    private S3DataSpec dataSpec;

    /**
     * The compute statistics for a <code>DataSource</code>. The statistics
     * are generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally
     * during an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code/>DataSource<code/> needs to be used for
     * <code>MLModel</code> training
     */
    private Boolean computeStatistics;

    /**
     * A user-supplied identifier that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied identifier that uniquely identifies the
     *         <code>DataSource</code>.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    
    /**
     * A user-supplied identifier that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId A user-supplied identifier that uniquely identifies the
     *         <code>DataSource</code>.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    
    /**
     * A user-supplied identifier that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId A user-supplied identifier that uniquely identifies the
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDataSourceFromS3Request withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>DataSource</code>.
     */
    public String getDataSourceName() {
        return dataSourceName;
    }
    
    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param dataSourceName A user-supplied name or description of the <code>DataSource</code>.
     */
    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
    
    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param dataSourceName A user-supplied name or description of the <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDataSourceFromS3Request withDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * The data specification of a <code>DataSource</code>: <ul>
     * <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     * location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     * Amazon S3 location of the <code>DataSchema</code>.</li>
     * <li><p>DataSchema - A JSON string representing the schema. This is not
     * required if <code>DataSchemaUri</code> is specified. </li>
     * <li><p>DataRearrangement - A JSON string representing the splitting
     * requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     * </ul>
     *
     * @return The data specification of a <code>DataSource</code>: <ul>
     *         <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     *         location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     *         Amazon S3 location of the <code>DataSchema</code>.</li>
     *         <li><p>DataSchema - A JSON string representing the schema. This is not
     *         required if <code>DataSchemaUri</code> is specified. </li>
     *         <li><p>DataRearrangement - A JSON string representing the splitting
     *         requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     *         </ul>
     */
    public S3DataSpec getDataSpec() {
        return dataSpec;
    }
    
    /**
     * The data specification of a <code>DataSource</code>: <ul>
     * <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     * location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     * Amazon S3 location of the <code>DataSchema</code>.</li>
     * <li><p>DataSchema - A JSON string representing the schema. This is not
     * required if <code>DataSchemaUri</code> is specified. </li>
     * <li><p>DataRearrangement - A JSON string representing the splitting
     * requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     * </ul>
     *
     * @param dataSpec The data specification of a <code>DataSource</code>: <ul>
     *         <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     *         location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     *         Amazon S3 location of the <code>DataSchema</code>.</li>
     *         <li><p>DataSchema - A JSON string representing the schema. This is not
     *         required if <code>DataSchemaUri</code> is specified. </li>
     *         <li><p>DataRearrangement - A JSON string representing the splitting
     *         requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     *         </ul>
     */
    public void setDataSpec(S3DataSpec dataSpec) {
        this.dataSpec = dataSpec;
    }
    
    /**
     * The data specification of a <code>DataSource</code>: <ul>
     * <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     * location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     * Amazon S3 location of the <code>DataSchema</code>.</li>
     * <li><p>DataSchema - A JSON string representing the schema. This is not
     * required if <code>DataSchemaUri</code> is specified. </li>
     * <li><p>DataRearrangement - A JSON string representing the splitting
     * requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataSpec The data specification of a <code>DataSource</code>: <ul>
     *         <li><p>DataLocationS3 - Amazon Simple Storage Service (Amazon S3)
     *         location of the observation data.</li> <li><p>DataSchemaLocationS3 -
     *         Amazon S3 location of the <code>DataSchema</code>.</li>
     *         <li><p>DataSchema - A JSON string representing the schema. This is not
     *         required if <code>DataSchemaUri</code> is specified. </li>
     *         <li><p>DataRearrangement - A JSON string representing the splitting
     *         requirement of a <code>Datasource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code> </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDataSourceFromS3Request withDataSpec(S3DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        return this;
    }

    /**
     * The compute statistics for a <code>DataSource</code>. The statistics
     * are generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally
     * during an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code/>DataSource<code/> needs to be used for
     * <code>MLModel</code> training
     *
     * @return The compute statistics for a <code>DataSource</code>. The statistics
     *         are generated from the observation data referenced by a
     *         <code>DataSource</code>. Amazon ML uses the statistics internally
     *         during an <code>MLModel</code> training. This parameter must be set to
     *         <code>true</code> if the <code/>DataSource<code/> needs to be used for
     *         <code>MLModel</code> training
     */
    public Boolean isComputeStatistics() {
        return computeStatistics;
    }
    
    /**
     * The compute statistics for a <code>DataSource</code>. The statistics
     * are generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally
     * during an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code/>DataSource<code/> needs to be used for
     * <code>MLModel</code> training
     *
     * @param computeStatistics The compute statistics for a <code>DataSource</code>. The statistics
     *         are generated from the observation data referenced by a
     *         <code>DataSource</code>. Amazon ML uses the statistics internally
     *         during an <code>MLModel</code> training. This parameter must be set to
     *         <code>true</code> if the <code/>DataSource<code/> needs to be used for
     *         <code>MLModel</code> training
     */
    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }
    
    /**
     * The compute statistics for a <code>DataSource</code>. The statistics
     * are generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally
     * during an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code/>DataSource<code/> needs to be used for
     * <code>MLModel</code> training
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computeStatistics The compute statistics for a <code>DataSource</code>. The statistics
     *         are generated from the observation data referenced by a
     *         <code>DataSource</code>. Amazon ML uses the statistics internally
     *         during an <code>MLModel</code> training. This parameter must be set to
     *         <code>true</code> if the <code/>DataSource<code/> needs to be used for
     *         <code>MLModel</code> training
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDataSourceFromS3Request withComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
        return this;
    }

    /**
     * The compute statistics for a <code>DataSource</code>. The statistics
     * are generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally
     * during an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code/>DataSource<code/> needs to be used for
     * <code>MLModel</code> training
     *
     * @return The compute statistics for a <code>DataSource</code>. The statistics
     *         are generated from the observation data referenced by a
     *         <code>DataSource</code>. Amazon ML uses the statistics internally
     *         during an <code>MLModel</code> training. This parameter must be set to
     *         <code>true</code> if the <code/>DataSource<code/> needs to be used for
     *         <code>MLModel</code> training
     */
    public Boolean getComputeStatistics() {
        return computeStatistics;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSourceId() != null) sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getDataSourceName() != null) sb.append("DataSourceName: " + getDataSourceName() + ",");
        if (getDataSpec() != null) sb.append("DataSpec: " + getDataSpec() + ",");
        if (isComputeStatistics() != null) sb.append("ComputeStatistics: " + isComputeStatistics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode()); 
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode()); 
        hashCode = prime * hashCode + ((getDataSpec() == null) ? 0 : getDataSpec().hashCode()); 
        hashCode = prime * hashCode + ((isComputeStatistics() == null) ? 0 : isComputeStatistics().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDataSourceFromS3Request == false) return false;
        CreateDataSourceFromS3Request other = (CreateDataSourceFromS3Request)obj;
        
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null) return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false) return false; 
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null) return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false) return false; 
        if (other.getDataSpec() == null ^ this.getDataSpec() == null) return false;
        if (other.getDataSpec() != null && other.getDataSpec().equals(this.getDataSpec()) == false) return false; 
        if (other.isComputeStatistics() == null ^ this.isComputeStatistics() == null) return false;
        if (other.isComputeStatistics() != null && other.isComputeStatistics().equals(this.isComputeStatistics()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDataSourceFromS3Request clone() {
        
            return (CreateDataSourceFromS3Request) super.clone();
    }

}
    