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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The datasource details that are specific to Amazon RDS.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database details required to connect to an Amazon RDS.
     * </p>
     */
    private RDSDatabase database;

    private String databaseUserName;
    /**
     * <p>
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code> is
     * true in <code>GetDataSourceInput</code>.
     * </p>
     */
    private String selectSqlQuery;
    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from
     * Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     */
    private String resourceRole;
    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use
     * the ID to find details about the instance in the Data Pipeline console.
     * </p>
     */
    private String dataPipelineId;

    /**
     * <p>
     * The database details required to connect to an Amazon RDS.
     * </p>
     * 
     * @param database
     *        The database details required to connect to an Amazon RDS.
     */

    public void setDatabase(RDSDatabase database) {
        this.database = database;
    }

    /**
     * <p>
     * The database details required to connect to an Amazon RDS.
     * </p>
     * 
     * @return The database details required to connect to an Amazon RDS.
     */

    public RDSDatabase getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database details required to connect to an Amazon RDS.
     * </p>
     * 
     * @param database
     *        The database details required to connect to an Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withDatabase(RDSDatabase database) {
        setDatabase(database);
        return this;
    }

    /**
     * @param databaseUserName
     */

    public void setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
    }

    /**
     * @return
     */

    public String getDatabaseUserName() {
        return this.databaseUserName;
    }

    /**
     * @param databaseUserName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withDatabaseUserName(String databaseUserName) {
        setDatabaseUserName(databaseUserName);
        return this;
    }

    /**
     * <p>
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code> is
     * true in <code>GetDataSourceInput</code>.
     * </p>
     * 
     * @param selectSqlQuery
     *        The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code>
     *        is true in <code>GetDataSourceInput</code>.
     */

    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }

    /**
     * <p>
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code> is
     * true in <code>GetDataSourceInput</code>.
     * </p>
     * 
     * @return The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if
     *         <code>Verbose</code> is true in <code>GetDataSourceInput</code>.
     */

    public String getSelectSqlQuery() {
        return this.selectSqlQuery;
    }

    /**
     * <p>
     * The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code> is
     * true in <code>GetDataSourceInput</code>.
     * </p>
     * 
     * @param selectSqlQuery
     *        The SQL query that is supplied during <a>CreateDataSourceFromRDS</a>. Returns only if <code>Verbose</code>
     *        is true in <code>GetDataSourceInput</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withSelectSqlQuery(String selectSqlQuery) {
        setSelectSqlQuery(selectSqlQuery);
        return this;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from
     * Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param resourceRole
     *        The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task
     *        from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     */

    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from
     * Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @return The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task
     *         from Amazon RDS to Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *         for data pipelines.
     */

    public String getResourceRole() {
        return this.resourceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from
     * Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param resourceRole
     *        The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task
     *        from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withResourceRole(String resourceRole) {
        setResourceRole(resourceRole);
        return this;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param serviceRole
     *        The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the
     *        copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @return The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the
     *         copy task from Amazon RDS to Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *         for data pipelines.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param serviceRole
     *        The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the
     *        copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use
     * the ID to find details about the instance in the Data Pipeline console.
     * </p>
     * 
     * @param dataPipelineId
     *        The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You
     *        can use the ID to find details about the instance in the Data Pipeline console.
     */

    public void setDataPipelineId(String dataPipelineId) {
        this.dataPipelineId = dataPipelineId;
    }

    /**
     * <p>
     * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use
     * the ID to find details about the instance in the Data Pipeline console.
     * </p>
     * 
     * @return The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You
     *         can use the ID to find details about the instance in the Data Pipeline console.
     */

    public String getDataPipelineId() {
        return this.dataPipelineId;
    }

    /**
     * <p>
     * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use
     * the ID to find details about the instance in the Data Pipeline console.
     * </p>
     * 
     * @param dataPipelineId
     *        The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You
     *        can use the ID to find details about the instance in the Data Pipeline console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSMetadata withDataPipelineId(String dataPipelineId) {
        setDataPipelineId(dataPipelineId);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDatabaseUserName() != null)
            sb.append("DatabaseUserName: ").append(getDatabaseUserName()).append(",");
        if (getSelectSqlQuery() != null)
            sb.append("SelectSqlQuery: ").append(getSelectSqlQuery()).append(",");
        if (getResourceRole() != null)
            sb.append("ResourceRole: ").append(getResourceRole()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getDataPipelineId() != null)
            sb.append("DataPipelineId: ").append(getDataPipelineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSMetadata == false)
            return false;
        RDSMetadata other = (RDSMetadata) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDatabaseUserName() == null ^ this.getDatabaseUserName() == null)
            return false;
        if (other.getDatabaseUserName() != null && other.getDatabaseUserName().equals(this.getDatabaseUserName()) == false)
            return false;
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null)
            return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false)
            return false;
        if (other.getResourceRole() == null ^ this.getResourceRole() == null)
            return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getDataPipelineId() == null ^ this.getDataPipelineId() == null)
            return false;
        if (other.getDataPipelineId() != null && other.getDataPipelineId().equals(this.getDataPipelineId()) == false)
            return false;
        return true;
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
    public RDSMetadata clone() {
        try {
            return (RDSMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.RDSMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
