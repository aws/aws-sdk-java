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
 * Describes the data specification of an Amazon Redshift
 * <code>DataSource</code> .
 * </p>
 */
public class RedshiftDataSpec implements Serializable, Cloneable {

    /**
     * Describes the <code>DatabaseName</code> and
     * <code>ClusterIdentifier</code> for an Amazon Redshift
     * <code>DataSource</code>.
     */
    private RedshiftDatabase databaseInformation;

    /**
     * Describes the SQL Query to execute on an Amazon Redshift database for
     * an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     */
    private String selectSqlQuery;

    /**
     * Describes AWS Identity and Access Management (IAM) credentials that
     * are used connect to the Amazon Redshift database.
     */
    private RedshiftDatabaseCredentials databaseCredentials;

    /**
     * Describes an Amazon S3 location to store the result set of the
     * <code>SelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String s3StagingLocation;

    /**
     * Describes the splitting specifications for a <code>DataSource</code>.
     */
    private String dataRearrangement;

    /**
     * Describes the schema for an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     */
    private String dataSchema;

    /**
     * Describes the schema location for an Amazon Redshift
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String dataSchemaUri;

    /**
     * Describes the <code>DatabaseName</code> and
     * <code>ClusterIdentifier</code> for an Amazon Redshift
     * <code>DataSource</code>.
     *
     * @return Describes the <code>DatabaseName</code> and
     *         <code>ClusterIdentifier</code> for an Amazon Redshift
     *         <code>DataSource</code>.
     */
    public RedshiftDatabase getDatabaseInformation() {
        return databaseInformation;
    }
    
    /**
     * Describes the <code>DatabaseName</code> and
     * <code>ClusterIdentifier</code> for an Amazon Redshift
     * <code>DataSource</code>.
     *
     * @param databaseInformation Describes the <code>DatabaseName</code> and
     *         <code>ClusterIdentifier</code> for an Amazon Redshift
     *         <code>DataSource</code>.
     */
    public void setDatabaseInformation(RedshiftDatabase databaseInformation) {
        this.databaseInformation = databaseInformation;
    }
    
    /**
     * Describes the <code>DatabaseName</code> and
     * <code>ClusterIdentifier</code> for an Amazon Redshift
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseInformation Describes the <code>DatabaseName</code> and
     *         <code>ClusterIdentifier</code> for an Amazon Redshift
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withDatabaseInformation(RedshiftDatabase databaseInformation) {
        this.databaseInformation = databaseInformation;
        return this;
    }

    /**
     * Describes the SQL Query to execute on an Amazon Redshift database for
     * an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @return Describes the SQL Query to execute on an Amazon Redshift database for
     *         an Amazon Redshift <code>DataSource</code>.
     */
    public String getSelectSqlQuery() {
        return selectSqlQuery;
    }
    
    /**
     * Describes the SQL Query to execute on an Amazon Redshift database for
     * an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery Describes the SQL Query to execute on an Amazon Redshift database for
     *         an Amazon Redshift <code>DataSource</code>.
     */
    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }
    
    /**
     * Describes the SQL Query to execute on an Amazon Redshift database for
     * an Amazon Redshift <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery Describes the SQL Query to execute on an Amazon Redshift database for
     *         an Amazon Redshift <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
        return this;
    }

    /**
     * Describes AWS Identity and Access Management (IAM) credentials that
     * are used connect to the Amazon Redshift database.
     *
     * @return Describes AWS Identity and Access Management (IAM) credentials that
     *         are used connect to the Amazon Redshift database.
     */
    public RedshiftDatabaseCredentials getDatabaseCredentials() {
        return databaseCredentials;
    }
    
    /**
     * Describes AWS Identity and Access Management (IAM) credentials that
     * are used connect to the Amazon Redshift database.
     *
     * @param databaseCredentials Describes AWS Identity and Access Management (IAM) credentials that
     *         are used connect to the Amazon Redshift database.
     */
    public void setDatabaseCredentials(RedshiftDatabaseCredentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
    }
    
    /**
     * Describes AWS Identity and Access Management (IAM) credentials that
     * are used connect to the Amazon Redshift database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseCredentials Describes AWS Identity and Access Management (IAM) credentials that
     *         are used connect to the Amazon Redshift database.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withDatabaseCredentials(RedshiftDatabaseCredentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
        return this;
    }

    /**
     * Describes an Amazon S3 location to store the result set of the
     * <code>SelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return Describes an Amazon S3 location to store the result set of the
     *         <code>SelectSqlQuery</code> query.
     */
    public String getS3StagingLocation() {
        return s3StagingLocation;
    }
    
    /**
     * Describes an Amazon S3 location to store the result set of the
     * <code>SelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param s3StagingLocation Describes an Amazon S3 location to store the result set of the
     *         <code>SelectSqlQuery</code> query.
     */
    public void setS3StagingLocation(String s3StagingLocation) {
        this.s3StagingLocation = s3StagingLocation;
    }
    
    /**
     * Describes an Amazon S3 location to store the result set of the
     * <code>SelectSqlQuery</code> query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param s3StagingLocation Describes an Amazon S3 location to store the result set of the
     *         <code>SelectSqlQuery</code> query.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withS3StagingLocation(String s3StagingLocation) {
        this.s3StagingLocation = s3StagingLocation;
        return this;
    }

    /**
     * Describes the splitting specifications for a <code>DataSource</code>.
     *
     * @return Describes the splitting specifications for a <code>DataSource</code>.
     */
    public String getDataRearrangement() {
        return dataRearrangement;
    }
    
    /**
     * Describes the splitting specifications for a <code>DataSource</code>.
     *
     * @param dataRearrangement Describes the splitting specifications for a <code>DataSource</code>.
     */
    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }
    
    /**
     * Describes the splitting specifications for a <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataRearrangement Describes the splitting specifications for a <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
        return this;
    }

    /**
     * Describes the schema for an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @return Describes the schema for an Amazon Redshift <code>DataSource</code>.
     */
    public String getDataSchema() {
        return dataSchema;
    }
    
    /**
     * Describes the schema for an Amazon Redshift <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema Describes the schema for an Amazon Redshift <code>DataSource</code>.
     */
    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }
    
    /**
     * Describes the schema for an Amazon Redshift <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema Describes the schema for an Amazon Redshift <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    /**
     * Describes the schema location for an Amazon Redshift
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return Describes the schema location for an Amazon Redshift
     *         <code>DataSource</code>.
     */
    public String getDataSchemaUri() {
        return dataSchemaUri;
    }
    
    /**
     * Describes the schema location for an Amazon Redshift
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaUri Describes the schema location for an Amazon Redshift
     *         <code>DataSource</code>.
     */
    public void setDataSchemaUri(String dataSchemaUri) {
        this.dataSchemaUri = dataSchemaUri;
    }
    
    /**
     * Describes the schema location for an Amazon Redshift
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaUri Describes the schema location for an Amazon Redshift
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftDataSpec withDataSchemaUri(String dataSchemaUri) {
        this.dataSchemaUri = dataSchemaUri;
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
        if (getDatabaseInformation() != null) sb.append("DatabaseInformation: " + getDatabaseInformation() + ",");
        if (getSelectSqlQuery() != null) sb.append("SelectSqlQuery: " + getSelectSqlQuery() + ",");
        if (getDatabaseCredentials() != null) sb.append("DatabaseCredentials: " + getDatabaseCredentials() + ",");
        if (getS3StagingLocation() != null) sb.append("S3StagingLocation: " + getS3StagingLocation() + ",");
        if (getDataRearrangement() != null) sb.append("DataRearrangement: " + getDataRearrangement() + ",");
        if (getDataSchema() != null) sb.append("DataSchema: " + getDataSchema() + ",");
        if (getDataSchemaUri() != null) sb.append("DataSchemaUri: " + getDataSchemaUri() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDatabaseInformation() == null) ? 0 : getDatabaseInformation().hashCode()); 
        hashCode = prime * hashCode + ((getSelectSqlQuery() == null) ? 0 : getSelectSqlQuery().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseCredentials() == null) ? 0 : getDatabaseCredentials().hashCode()); 
        hashCode = prime * hashCode + ((getS3StagingLocation() == null) ? 0 : getS3StagingLocation().hashCode()); 
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchemaUri() == null) ? 0 : getDataSchemaUri().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RedshiftDataSpec == false) return false;
        RedshiftDataSpec other = (RedshiftDataSpec)obj;
        
        if (other.getDatabaseInformation() == null ^ this.getDatabaseInformation() == null) return false;
        if (other.getDatabaseInformation() != null && other.getDatabaseInformation().equals(this.getDatabaseInformation()) == false) return false; 
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null) return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false) return false; 
        if (other.getDatabaseCredentials() == null ^ this.getDatabaseCredentials() == null) return false;
        if (other.getDatabaseCredentials() != null && other.getDatabaseCredentials().equals(this.getDatabaseCredentials()) == false) return false; 
        if (other.getS3StagingLocation() == null ^ this.getS3StagingLocation() == null) return false;
        if (other.getS3StagingLocation() != null && other.getS3StagingLocation().equals(this.getS3StagingLocation()) == false) return false; 
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null) return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false) return false; 
        if (other.getDataSchema() == null ^ this.getDataSchema() == null) return false;
        if (other.getDataSchema() != null && other.getDataSchema().equals(this.getDataSchema()) == false) return false; 
        if (other.getDataSchemaUri() == null ^ this.getDataSchemaUri() == null) return false;
        if (other.getDataSchemaUri() != null && other.getDataSchemaUri().equals(this.getDataSchemaUri()) == false) return false; 
        return true;
    }
    
    @Override
    public RedshiftDataSpec clone() {
        try {
            return (RedshiftDataSpec) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    