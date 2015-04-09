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
 * Describes the DataSource details specific to Amazon Redshift.
 * </p>
 */
public class RedshiftMetadata implements Serializable, Cloneable {

    /**
     * Describes the database details required to connect to an Amazon
     * Redshift database.
     */
    private RedshiftDatabase redshiftDatabase;

    /**
     * A username to be used by Amazon Machine Learning (Amazon ML)to connect
     * to a database on an Amazon Redshift cluster. The username should have
     * sufficient permissions to execute the
     * <code>RedshiftSelectSqlQuery</code> query. The username should be
     * valid for an Amazon Redshift <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String databaseUserName;

    /**
     * The SQL query that is specified during
     * <a>CreateDataSourceFromRedshift</a>. Returns only if
     * <code>Verbose</code> is true in GetDataSourceInput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     */
    private String selectSqlQuery;

    /**
     * Describes the database details required to connect to an Amazon
     * Redshift database.
     *
     * @return Describes the database details required to connect to an Amazon
     *         Redshift database.
     */
    public RedshiftDatabase getRedshiftDatabase() {
        return redshiftDatabase;
    }
    
    /**
     * Describes the database details required to connect to an Amazon
     * Redshift database.
     *
     * @param redshiftDatabase Describes the database details required to connect to an Amazon
     *         Redshift database.
     */
    public void setRedshiftDatabase(RedshiftDatabase redshiftDatabase) {
        this.redshiftDatabase = redshiftDatabase;
    }
    
    /**
     * Describes the database details required to connect to an Amazon
     * Redshift database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param redshiftDatabase Describes the database details required to connect to an Amazon
     *         Redshift database.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftMetadata withRedshiftDatabase(RedshiftDatabase redshiftDatabase) {
        this.redshiftDatabase = redshiftDatabase;
        return this;
    }

    /**
     * A username to be used by Amazon Machine Learning (Amazon ML)to connect
     * to a database on an Amazon Redshift cluster. The username should have
     * sufficient permissions to execute the
     * <code>RedshiftSelectSqlQuery</code> query. The username should be
     * valid for an Amazon Redshift <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return A username to be used by Amazon Machine Learning (Amazon ML)to connect
     *         to a database on an Amazon Redshift cluster. The username should have
     *         sufficient permissions to execute the
     *         <code>RedshiftSelectSqlQuery</code> query. The username should be
     *         valid for an Amazon Redshift <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     */
    public String getDatabaseUserName() {
        return databaseUserName;
    }
    
    /**
     * A username to be used by Amazon Machine Learning (Amazon ML)to connect
     * to a database on an Amazon Redshift cluster. The username should have
     * sufficient permissions to execute the
     * <code>RedshiftSelectSqlQuery</code> query. The username should be
     * valid for an Amazon Redshift <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseUserName A username to be used by Amazon Machine Learning (Amazon ML)to connect
     *         to a database on an Amazon Redshift cluster. The username should have
     *         sufficient permissions to execute the
     *         <code>RedshiftSelectSqlQuery</code> query. The username should be
     *         valid for an Amazon Redshift <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     */
    public void setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
    }
    
    /**
     * A username to be used by Amazon Machine Learning (Amazon ML)to connect
     * to a database on an Amazon Redshift cluster. The username should have
     * sufficient permissions to execute the
     * <code>RedshiftSelectSqlQuery</code> query. The username should be
     * valid for an Amazon Redshift <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseUserName A username to be used by Amazon Machine Learning (Amazon ML)to connect
     *         to a database on an Amazon Redshift cluster. The username should have
     *         sufficient permissions to execute the
     *         <code>RedshiftSelectSqlQuery</code> query. The username should be
     *         valid for an Amazon Redshift <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">USER</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftMetadata withDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
        return this;
    }

    /**
     * The SQL query that is specified during
     * <a>CreateDataSourceFromRedshift</a>. Returns only if
     * <code>Verbose</code> is true in GetDataSourceInput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @return The SQL query that is specified during
     *         <a>CreateDataSourceFromRedshift</a>. Returns only if
     *         <code>Verbose</code> is true in GetDataSourceInput.
     */
    public String getSelectSqlQuery() {
        return selectSqlQuery;
    }
    
    /**
     * The SQL query that is specified during
     * <a>CreateDataSourceFromRedshift</a>. Returns only if
     * <code>Verbose</code> is true in GetDataSourceInput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The SQL query that is specified during
     *         <a>CreateDataSourceFromRedshift</a>. Returns only if
     *         <code>Verbose</code> is true in GetDataSourceInput.
     */
    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }
    
    /**
     * The SQL query that is specified during
     * <a>CreateDataSourceFromRedshift</a>. Returns only if
     * <code>Verbose</code> is true in GetDataSourceInput.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The SQL query that is specified during
     *         <a>CreateDataSourceFromRedshift</a>. Returns only if
     *         <code>Verbose</code> is true in GetDataSourceInput.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RedshiftMetadata withSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
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
        if (getRedshiftDatabase() != null) sb.append("RedshiftDatabase: " + getRedshiftDatabase() + ",");
        if (getDatabaseUserName() != null) sb.append("DatabaseUserName: " + getDatabaseUserName() + ",");
        if (getSelectSqlQuery() != null) sb.append("SelectSqlQuery: " + getSelectSqlQuery() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RedshiftMetadata == false) return false;
        RedshiftMetadata other = (RedshiftMetadata)obj;
        
        if (other.getRedshiftDatabase() == null ^ this.getRedshiftDatabase() == null) return false;
        if (other.getRedshiftDatabase() != null && other.getRedshiftDatabase().equals(this.getRedshiftDatabase()) == false) return false; 
        if (other.getDatabaseUserName() == null ^ this.getDatabaseUserName() == null) return false;
        if (other.getDatabaseUserName() != null && other.getDatabaseUserName().equals(this.getDatabaseUserName()) == false) return false; 
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null) return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false) return false; 
        return true;
    }
    
    @Override
    public RedshiftMetadata clone() {
        try {
            return (RedshiftMetadata) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    