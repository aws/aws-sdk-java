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

/**
 * <p>
 * Describes the data specification of a <code>DataSource</code> .
 * </p>
 */
public class S3DataSpec implements Serializable, Cloneable {

    /**
     * The location of the data file(s) used by a <code>DataSource</code>.
     * The URI specifies a data file or an Amazon Simple Storage Service
     * (Amazon S3) directory or bucket containing data files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String dataLocationS3;

    /**
     * Describes the splitting requirement of a <code>Datasource</code>.
     */
    private String dataRearrangement;

    /**
     * Describes the schema for an Amazon S3 <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     */
    private String dataSchema;

    /**
     * Describes the schema Location in Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String dataSchemaLocationS3;

    /**
     * The location of the data file(s) used by a <code>DataSource</code>.
     * The URI specifies a data file or an Amazon Simple Storage Service
     * (Amazon S3) directory or bucket containing data files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The location of the data file(s) used by a <code>DataSource</code>.
     *         The URI specifies a data file or an Amazon Simple Storage Service
     *         (Amazon S3) directory or bucket containing data files.
     */
    public String getDataLocationS3() {
        return dataLocationS3;
    }
    
    /**
     * The location of the data file(s) used by a <code>DataSource</code>.
     * The URI specifies a data file or an Amazon Simple Storage Service
     * (Amazon S3) directory or bucket containing data files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataLocationS3 The location of the data file(s) used by a <code>DataSource</code>.
     *         The URI specifies a data file or an Amazon Simple Storage Service
     *         (Amazon S3) directory or bucket containing data files.
     */
    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }
    
    /**
     * The location of the data file(s) used by a <code>DataSource</code>.
     * The URI specifies a data file or an Amazon Simple Storage Service
     * (Amazon S3) directory or bucket containing data files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataLocationS3 The location of the data file(s) used by a <code>DataSource</code>.
     *         The URI specifies a data file or an Amazon Simple Storage Service
     *         (Amazon S3) directory or bucket containing data files.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3DataSpec withDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
        return this;
    }

    /**
     * Describes the splitting requirement of a <code>Datasource</code>.
     *
     * @return Describes the splitting requirement of a <code>Datasource</code>.
     */
    public String getDataRearrangement() {
        return dataRearrangement;
    }
    
    /**
     * Describes the splitting requirement of a <code>Datasource</code>.
     *
     * @param dataRearrangement Describes the splitting requirement of a <code>Datasource</code>.
     */
    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }
    
    /**
     * Describes the splitting requirement of a <code>Datasource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataRearrangement Describes the splitting requirement of a <code>Datasource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3DataSpec withDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
        return this;
    }

    /**
     * Describes the schema for an Amazon S3 <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @return Describes the schema for an Amazon S3 <code>DataSource</code>.
     */
    public String getDataSchema() {
        return dataSchema;
    }
    
    /**
     * Describes the schema for an Amazon S3 <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema Describes the schema for an Amazon S3 <code>DataSource</code>.
     */
    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }
    
    /**
     * Describes the schema for an Amazon S3 <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema Describes the schema for an Amazon S3 <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3DataSpec withDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    /**
     * Describes the schema Location in Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return Describes the schema Location in Amazon S3.
     */
    public String getDataSchemaLocationS3() {
        return dataSchemaLocationS3;
    }
    
    /**
     * Describes the schema Location in Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaLocationS3 Describes the schema Location in Amazon S3.
     */
    public void setDataSchemaLocationS3(String dataSchemaLocationS3) {
        this.dataSchemaLocationS3 = dataSchemaLocationS3;
    }
    
    /**
     * Describes the schema Location in Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaLocationS3 Describes the schema Location in Amazon S3.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3DataSpec withDataSchemaLocationS3(String dataSchemaLocationS3) {
        this.dataSchemaLocationS3 = dataSchemaLocationS3;
        return this;
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
        if (getDataLocationS3() != null) sb.append("DataLocationS3: " + getDataLocationS3() + ",");
        if (getDataRearrangement() != null) sb.append("DataRearrangement: " + getDataRearrangement() + ",");
        if (getDataSchema() != null) sb.append("DataSchema: " + getDataSchema() + ",");
        if (getDataSchemaLocationS3() != null) sb.append("DataSchemaLocationS3: " + getDataSchemaLocationS3() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataLocationS3() == null) ? 0 : getDataLocationS3().hashCode()); 
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchemaLocationS3() == null) ? 0 : getDataSchemaLocationS3().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3DataSpec == false) return false;
        S3DataSpec other = (S3DataSpec)obj;
        
        if (other.getDataLocationS3() == null ^ this.getDataLocationS3() == null) return false;
        if (other.getDataLocationS3() != null && other.getDataLocationS3().equals(this.getDataLocationS3()) == false) return false; 
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null) return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false) return false; 
        if (other.getDataSchema() == null ^ this.getDataSchema() == null) return false;
        if (other.getDataSchema() != null && other.getDataSchema().equals(this.getDataSchema()) == false) return false; 
        if (other.getDataSchemaLocationS3() == null ^ this.getDataSchemaLocationS3() == null) return false;
        if (other.getDataSchemaLocationS3() != null && other.getDataSchemaLocationS3().equals(this.getDataSchemaLocationS3()) == false) return false; 
        return true;
    }
    
    @Override
    public S3DataSpec clone() {
        try {
            return (S3DataSpec) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    