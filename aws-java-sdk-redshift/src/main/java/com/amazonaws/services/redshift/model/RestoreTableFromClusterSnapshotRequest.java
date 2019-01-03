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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreTableFromClusterSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableFromClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon
     * Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     */
    private String sourceDatabaseName;
    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If you do not specify a
     * <code>SourceSchemaName</code> value, the default is <code>public</code>.
     * </p>
     */
    private String sourceSchemaName;
    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     */
    private String sourceTableName;
    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     */
    private String targetDatabaseName;
    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     */
    private String targetSchemaName;
    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     */
    private String newTableName;

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the Amazon Redshift cluster to restore the table to.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     * 
     * @return The identifier of the Amazon Redshift cluster to restore the table to.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the Amazon Redshift cluster to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon
     * Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot to restore the table from. This snapshot must have been created from the
     *        Amazon Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon
     * Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     * </p>
     * 
     * @return The identifier of the snapshot to restore the table from. This snapshot must have been created from the
     *         Amazon Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon
     * Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot to restore the table from. This snapshot must have been created from the
     *        Amazon Redshift cluster specified by the <code>ClusterIdentifier</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table to restore from.
     */

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     * 
     * @return The name of the source database that contains the table to restore from.
     */

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table to restore from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withSourceDatabaseName(String sourceDatabaseName) {
        setSourceDatabaseName(sourceDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If you do not specify a
     * <code>SourceSchemaName</code> value, the default is <code>public</code>.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table to restore from. If you do not specify a
     *        <code>SourceSchemaName</code> value, the default is <code>public</code>.
     */

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If you do not specify a
     * <code>SourceSchemaName</code> value, the default is <code>public</code>.
     * </p>
     * 
     * @return The name of the source schema that contains the table to restore from. If you do not specify a
     *         <code>SourceSchemaName</code> value, the default is <code>public</code>.
     */

    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If you do not specify a
     * <code>SourceSchemaName</code> value, the default is <code>public</code>.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table to restore from. If you do not specify a
     *        <code>SourceSchemaName</code> value, the default is <code>public</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withSourceSchemaName(String sourceSchemaName) {
        setSourceSchemaName(sourceSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table to restore from.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     * 
     * @return The name of the source table to restore from.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table to restore from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withSourceTableName(String sourceTableName) {
        setSourceTableName(sourceTableName);
        return this;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore the table to.
     */

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @return The name of the database to restore the table to.
     */

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withTargetDatabaseName(String targetDatabaseName) {
        setTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore the table to.
     */

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @return The name of the schema to restore the table to.
     */

    public String getTargetSchemaName() {
        return this.targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withTargetSchemaName(String targetSchemaName) {
        setTargetSchemaName(targetSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create as a result of the current request.
     */

    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     * 
     * @return The name of the table to create as a result of the current request.
     */

    public String getNewTableName() {
        return this.newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create as a result of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromClusterSnapshotRequest withNewTableName(String newTableName) {
        setNewTableName(newTableName);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getSourceDatabaseName() != null)
            sb.append("SourceDatabaseName: ").append(getSourceDatabaseName()).append(",");
        if (getSourceSchemaName() != null)
            sb.append("SourceSchemaName: ").append(getSourceSchemaName()).append(",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: ").append(getSourceTableName()).append(",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: ").append(getTargetDatabaseName()).append(",");
        if (getTargetSchemaName() != null)
            sb.append("TargetSchemaName: ").append(getTargetSchemaName()).append(",");
        if (getNewTableName() != null)
            sb.append("NewTableName: ").append(getNewTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromClusterSnapshotRequest == false)
            return false;
        RestoreTableFromClusterSnapshotRequest other = (RestoreTableFromClusterSnapshotRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null)
            return false;
        if (other.getSourceDatabaseName() != null && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false)
            return false;
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null)
            return false;
        if (other.getSourceSchemaName() != null && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null)
            return false;
        if (other.getTargetSchemaName() != null && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableFromClusterSnapshotRequest clone() {
        return (RestoreTableFromClusterSnapshotRequest) super.clone();
    }

}
