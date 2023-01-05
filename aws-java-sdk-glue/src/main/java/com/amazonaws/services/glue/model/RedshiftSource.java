/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Amazon Redshift data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RedshiftSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Redshift data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The database to read from.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database table to read from.
     * </p>
     */
    private String table;
    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     */
    private String redshiftTmpDir;
    /**
     * <p>
     * The IAM role with permissions.
     * </p>
     */
    private String tmpDirIAMRole;

    /**
     * <p>
     * The name of the Amazon Redshift data store.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data store.
     * </p>
     * 
     * @return The name of the Amazon Redshift data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data store.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @param database
     *        The database to read from.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @return The database to read from.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @param database
     *        The database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param table
     *        The database table to read from.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @return The database table to read from.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param table
     *        The database table to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSource withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @param redshiftTmpDir
     *        The Amazon S3 path where temporary data can be staged when copying out of the database.
     */

    public void setRedshiftTmpDir(String redshiftTmpDir) {
        this.redshiftTmpDir = redshiftTmpDir;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @return The Amazon S3 path where temporary data can be staged when copying out of the database.
     */

    public String getRedshiftTmpDir() {
        return this.redshiftTmpDir;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @param redshiftTmpDir
     *        The Amazon S3 path where temporary data can be staged when copying out of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSource withRedshiftTmpDir(String redshiftTmpDir) {
        setRedshiftTmpDir(redshiftTmpDir);
        return this;
    }

    /**
     * <p>
     * The IAM role with permissions.
     * </p>
     * 
     * @param tmpDirIAMRole
     *        The IAM role with permissions.
     */

    public void setTmpDirIAMRole(String tmpDirIAMRole) {
        this.tmpDirIAMRole = tmpDirIAMRole;
    }

    /**
     * <p>
     * The IAM role with permissions.
     * </p>
     * 
     * @return The IAM role with permissions.
     */

    public String getTmpDirIAMRole() {
        return this.tmpDirIAMRole;
    }

    /**
     * <p>
     * The IAM role with permissions.
     * </p>
     * 
     * @param tmpDirIAMRole
     *        The IAM role with permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSource withTmpDirIAMRole(String tmpDirIAMRole) {
        setTmpDirIAMRole(tmpDirIAMRole);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getRedshiftTmpDir() != null)
            sb.append("RedshiftTmpDir: ").append(getRedshiftTmpDir()).append(",");
        if (getTmpDirIAMRole() != null)
            sb.append("TmpDirIAMRole: ").append(getTmpDirIAMRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftSource == false)
            return false;
        RedshiftSource other = (RedshiftSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getRedshiftTmpDir() == null ^ this.getRedshiftTmpDir() == null)
            return false;
        if (other.getRedshiftTmpDir() != null && other.getRedshiftTmpDir().equals(this.getRedshiftTmpDir()) == false)
            return false;
        if (other.getTmpDirIAMRole() == null ^ this.getTmpDirIAMRole() == null)
            return false;
        if (other.getTmpDirIAMRole() != null && other.getTmpDirIAMRole().equals(this.getTmpDirIAMRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getRedshiftTmpDir() == null) ? 0 : getRedshiftTmpDir().hashCode());
        hashCode = prime * hashCode + ((getTmpDirIAMRole() == null) ? 0 : getTmpDirIAMRole().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftSource clone() {
        try {
            return (RedshiftSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RedshiftSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
