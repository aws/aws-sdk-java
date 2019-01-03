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
 * Describes the <code>DataSource</code> details specific to Amazon Redshift.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftMetadata implements Serializable, Cloneable, StructuredPojo {

    private RedshiftDatabase redshiftDatabase;

    private String databaseUserName;
    /**
     * <p>
     * The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if <code>Verbose</code>
     * is true in GetDataSourceInput.
     * </p>
     */
    private String selectSqlQuery;

    /**
     * @param redshiftDatabase
     */

    public void setRedshiftDatabase(RedshiftDatabase redshiftDatabase) {
        this.redshiftDatabase = redshiftDatabase;
    }

    /**
     * @return
     */

    public RedshiftDatabase getRedshiftDatabase() {
        return this.redshiftDatabase;
    }

    /**
     * @param redshiftDatabase
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftMetadata withRedshiftDatabase(RedshiftDatabase redshiftDatabase) {
        setRedshiftDatabase(redshiftDatabase);
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

    public RedshiftMetadata withDatabaseUserName(String databaseUserName) {
        setDatabaseUserName(databaseUserName);
        return this;
    }

    /**
     * <p>
     * The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if <code>Verbose</code>
     * is true in GetDataSourceInput.
     * </p>
     * 
     * @param selectSqlQuery
     *        The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if
     *        <code>Verbose</code> is true in GetDataSourceInput.
     */

    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }

    /**
     * <p>
     * The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if <code>Verbose</code>
     * is true in GetDataSourceInput.
     * </p>
     * 
     * @return The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if
     *         <code>Verbose</code> is true in GetDataSourceInput.
     */

    public String getSelectSqlQuery() {
        return this.selectSqlQuery;
    }

    /**
     * <p>
     * The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if <code>Verbose</code>
     * is true in GetDataSourceInput.
     * </p>
     * 
     * @param selectSqlQuery
     *        The SQL query that is specified during <a>CreateDataSourceFromRedshift</a>. Returns only if
     *        <code>Verbose</code> is true in GetDataSourceInput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftMetadata withSelectSqlQuery(String selectSqlQuery) {
        setSelectSqlQuery(selectSqlQuery);
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
        if (getRedshiftDatabase() != null)
            sb.append("RedshiftDatabase: ").append(getRedshiftDatabase()).append(",");
        if (getDatabaseUserName() != null)
            sb.append("DatabaseUserName: ").append(getDatabaseUserName()).append(",");
        if (getSelectSqlQuery() != null)
            sb.append("SelectSqlQuery: ").append(getSelectSqlQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftMetadata == false)
            return false;
        RedshiftMetadata other = (RedshiftMetadata) obj;
        if (other.getRedshiftDatabase() == null ^ this.getRedshiftDatabase() == null)
            return false;
        if (other.getRedshiftDatabase() != null && other.getRedshiftDatabase().equals(this.getRedshiftDatabase()) == false)
            return false;
        if (other.getDatabaseUserName() == null ^ this.getDatabaseUserName() == null)
            return false;
        if (other.getDatabaseUserName() != null && other.getDatabaseUserName().equals(this.getDatabaseUserName()) == false)
            return false;
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null)
            return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedshiftDatabase() == null) ? 0 : getRedshiftDatabase().hashCode());
        hashCode = prime * hashCode + ((getDatabaseUserName() == null) ? 0 : getDatabaseUserName().hashCode());
        hashCode = prime * hashCode + ((getSelectSqlQuery() == null) ? 0 : getSelectSqlQuery().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftMetadata clone() {
        try {
            return (RedshiftMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.RedshiftMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
