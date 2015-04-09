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
 * The datasource details that are specific to Amazon RDS.
 * </p>
 */
public class RDSMetadata implements Serializable, Cloneable {

    /**
     * The database details required to connect to an Amazon RDS.
     */
    private RDSDatabase database;

    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String databaseUserName;

    /**
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     * Returns only if <code>Verbose</code> is true in
     * <code>GetDataSourceInput</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     */
    private String selectSqlQuery;

    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     * instance to carry out the copy task from Amazon RDS to Amazon S3. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String resourceRole;

    /**
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String serviceRole;

    /**
     * The ID of the Data Pipeline instance that is used to carry to copy
     * data from Amazon RDS to Amazon S3. You can use the ID to find details
     * about the instance in the Data Pipeline console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String dataPipelineId;

    /**
     * The database details required to connect to an Amazon RDS.
     *
     * @return The database details required to connect to an Amazon RDS.
     */
    public RDSDatabase getDatabase() {
        return database;
    }
    
    /**
     * The database details required to connect to an Amazon RDS.
     *
     * @param database The database details required to connect to an Amazon RDS.
     */
    public void setDatabase(RDSDatabase database) {
        this.database = database;
    }
    
    /**
     * The database details required to connect to an Amazon RDS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param database The database details required to connect to an Amazon RDS.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withDatabase(RDSDatabase database) {
        this.database = database;
        return this;
    }

    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     */
    public String getDatabaseUserName() {
        return databaseUserName;
    }
    
    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseUserName The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     */
    public void setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
    }
    
    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseUserName The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
        return this;
    }

    /**
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     * Returns only if <code>Verbose</code> is true in
     * <code>GetDataSourceInput</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @return The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     *         Returns only if <code>Verbose</code> is true in
     *         <code>GetDataSourceInput</code>.
     */
    public String getSelectSqlQuery() {
        return selectSqlQuery;
    }
    
    /**
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     * Returns only if <code>Verbose</code> is true in
     * <code>GetDataSourceInput</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     *         Returns only if <code>Verbose</code> is true in
     *         <code>GetDataSourceInput</code>.
     */
    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }
    
    /**
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     * Returns only if <code>Verbose</code> is true in
     * <code>GetDataSourceInput</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>.
     *         Returns only if <code>Verbose</code> is true in
     *         <code>GetDataSourceInput</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
        return this;
    }

    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     * instance to carry out the copy task from Amazon RDS to Amazon S3. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     *         instance to carry out the copy task from Amazon RDS to Amazon S3. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public String getResourceRole() {
        return resourceRole;
    }
    
    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     * instance to carry out the copy task from Amazon RDS to Amazon S3. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceRole The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     *         instance to carry out the copy task from Amazon RDS to Amazon S3. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }
    
    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     * instance to carry out the copy task from Amazon RDS to Amazon S3. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceRole The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2
     *         instance to carry out the copy task from Amazon RDS to Amazon S3. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
        return this;
    }

    /**
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public String getServiceRole() {
        return serviceRole;
    }
    
    /**
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param serviceRole The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }
    
    /**
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param serviceRole The role (DataPipelineDefaultRole) assumed by the Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * The ID of the Data Pipeline instance that is used to carry to copy
     * data from Amazon RDS to Amazon S3. You can use the ID to find details
     * about the instance in the Data Pipeline console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The ID of the Data Pipeline instance that is used to carry to copy
     *         data from Amazon RDS to Amazon S3. You can use the ID to find details
     *         about the instance in the Data Pipeline console.
     */
    public String getDataPipelineId() {
        return dataPipelineId;
    }
    
    /**
     * The ID of the Data Pipeline instance that is used to carry to copy
     * data from Amazon RDS to Amazon S3. You can use the ID to find details
     * about the instance in the Data Pipeline console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param dataPipelineId The ID of the Data Pipeline instance that is used to carry to copy
     *         data from Amazon RDS to Amazon S3. You can use the ID to find details
     *         about the instance in the Data Pipeline console.
     */
    public void setDataPipelineId(String dataPipelineId) {
        this.dataPipelineId = dataPipelineId;
    }
    
    /**
     * The ID of the Data Pipeline instance that is used to carry to copy
     * data from Amazon RDS to Amazon S3. You can use the ID to find details
     * about the instance in the Data Pipeline console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param dataPipelineId The ID of the Data Pipeline instance that is used to carry to copy
     *         data from Amazon RDS to Amazon S3. You can use the ID to find details
     *         about the instance in the Data Pipeline console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSMetadata withDataPipelineId(String dataPipelineId) {
        this.dataPipelineId = dataPipelineId;
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
        if (getDatabase() != null) sb.append("Database: " + getDatabase() + ",");
        if (getDatabaseUserName() != null) sb.append("DatabaseUserName: " + getDatabaseUserName() + ",");
        if (getSelectSqlQuery() != null) sb.append("SelectSqlQuery: " + getSelectSqlQuery() + ",");
        if (getResourceRole() != null) sb.append("ResourceRole: " + getResourceRole() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getDataPipelineId() != null) sb.append("DataPipelineId: " + getDataPipelineId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseUserName() == null) ? 0 : getDatabaseUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSelectSqlQuery() == null) ? 0 : getSelectSqlQuery().hashCode()); 
        hashCode = prime * hashCode + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode()); 
        hashCode = prime * hashCode + ((getDataPipelineId() == null) ? 0 : getDataPipelineId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RDSMetadata == false) return false;
        RDSMetadata other = (RDSMetadata)obj;
        
        if (other.getDatabase() == null ^ this.getDatabase() == null) return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false) return false; 
        if (other.getDatabaseUserName() == null ^ this.getDatabaseUserName() == null) return false;
        if (other.getDatabaseUserName() != null && other.getDatabaseUserName().equals(this.getDatabaseUserName()) == false) return false; 
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null) return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false) return false; 
        if (other.getResourceRole() == null ^ this.getResourceRole() == null) return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false) return false; 
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false; 
        if (other.getDataPipelineId() == null ^ this.getDataPipelineId() == null) return false;
        if (other.getDataPipelineId() != null && other.getDataPipelineId().equals(this.getDataPipelineId()) == false) return false; 
        return true;
    }
    
    @Override
    public RDSMetadata clone() {
        try {
            return (RDSMetadata) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    