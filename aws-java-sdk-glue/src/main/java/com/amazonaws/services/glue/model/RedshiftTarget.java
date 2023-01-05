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
 * Specifies a target that uses Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RedshiftTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * The name of the database to write to.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The name of the table in the database to write to.
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
     * The set of options to configure an upsert operation when writing to a Redshift target.
     * </p>
     */
    private UpsertRedshiftTargetOptions upsertRedshiftOptions;

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @return The name of the data target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @return The nodes that are inputs to the data target.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @param database
     *        The name of the database to write to.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @return The name of the database to write to.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @param database
     *        The name of the database to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to write to.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @return The name of the table in the database to write to.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withTable(String table) {
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

    public RedshiftTarget withRedshiftTmpDir(String redshiftTmpDir) {
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

    public RedshiftTarget withTmpDirIAMRole(String tmpDirIAMRole) {
        setTmpDirIAMRole(tmpDirIAMRole);
        return this;
    }

    /**
     * <p>
     * The set of options to configure an upsert operation when writing to a Redshift target.
     * </p>
     * 
     * @param upsertRedshiftOptions
     *        The set of options to configure an upsert operation when writing to a Redshift target.
     */

    public void setUpsertRedshiftOptions(UpsertRedshiftTargetOptions upsertRedshiftOptions) {
        this.upsertRedshiftOptions = upsertRedshiftOptions;
    }

    /**
     * <p>
     * The set of options to configure an upsert operation when writing to a Redshift target.
     * </p>
     * 
     * @return The set of options to configure an upsert operation when writing to a Redshift target.
     */

    public UpsertRedshiftTargetOptions getUpsertRedshiftOptions() {
        return this.upsertRedshiftOptions;
    }

    /**
     * <p>
     * The set of options to configure an upsert operation when writing to a Redshift target.
     * </p>
     * 
     * @param upsertRedshiftOptions
     *        The set of options to configure an upsert operation when writing to a Redshift target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftTarget withUpsertRedshiftOptions(UpsertRedshiftTargetOptions upsertRedshiftOptions) {
        setUpsertRedshiftOptions(upsertRedshiftOptions);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getRedshiftTmpDir() != null)
            sb.append("RedshiftTmpDir: ").append(getRedshiftTmpDir()).append(",");
        if (getTmpDirIAMRole() != null)
            sb.append("TmpDirIAMRole: ").append(getTmpDirIAMRole()).append(",");
        if (getUpsertRedshiftOptions() != null)
            sb.append("UpsertRedshiftOptions: ").append(getUpsertRedshiftOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftTarget == false)
            return false;
        RedshiftTarget other = (RedshiftTarget) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
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
        if (other.getUpsertRedshiftOptions() == null ^ this.getUpsertRedshiftOptions() == null)
            return false;
        if (other.getUpsertRedshiftOptions() != null && other.getUpsertRedshiftOptions().equals(this.getUpsertRedshiftOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getRedshiftTmpDir() == null) ? 0 : getRedshiftTmpDir().hashCode());
        hashCode = prime * hashCode + ((getTmpDirIAMRole() == null) ? 0 : getTmpDirIAMRole().hashCode());
        hashCode = prime * hashCode + ((getUpsertRedshiftOptions() == null) ? 0 : getUpsertRedshiftOptions().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftTarget clone() {
        try {
            return (RedshiftTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RedshiftTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
