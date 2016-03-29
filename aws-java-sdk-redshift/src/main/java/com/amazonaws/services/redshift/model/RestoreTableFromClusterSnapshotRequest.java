/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest) RestoreTableFromClusterSnapshot operation}.
 * <p>
 * Creates a new table from a table in an Amazon Redshift cluster
 * snapshot. You must create the new table within the Amazon Redshift
 * cluster that the snapshot was taken from.
 * </p>
 * <p>
 * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore
 * a table with the same name as an existing table in an Amazon Redshift
 * cluster. That is, you cannot overwrite an existing table in a cluster
 * with a restored table. If you want to replace your original table with
 * a new, restored table, then rename or drop your original table before
 * you call <code>RestoreTableFromClusterSnapshot</code> . When you have
 * renamed your original table, then you can pass the original name of
 * the table as the <code>NewTableName</code> parameter value in the call
 * to <code>RestoreTableFromClusterSnapshot</code> . This way, you can
 * replace the original table with the table created from the snapshot.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest)
 */
public class RestoreTableFromClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the Amazon Redshift cluster to restore the table to.
     */
    private String clusterIdentifier;

    /**
     * The identifier of the snapshot to restore the table from. This
     * snapshot must have been created from the Amazon Redshift cluster
     * specified by the <code>ClusterIdentifier</code> parameter.
     */
    private String snapshotIdentifier;

    /**
     * The name of the source database that contains the table to restore
     * from.
     */
    private String sourceDatabaseName;

    /**
     * The name of the source schema that contains the table to restore from.
     * If you do not specify a <code>SourceSchemaName</code> value, the
     * default is <code>public</code>.
     */
    private String sourceSchemaName;

    /**
     * The name of the source table to restore from.
     */
    private String sourceTableName;

    /**
     * The name of the database to restore the table to.
     */
    private String targetDatabaseName;

    /**
     * The name of the schema to restore the table to.
     */
    private String targetSchemaName;

    /**
     * The name of the table to create as a result of the current request.
     */
    private String newTableName;

    /**
     * The identifier of the Amazon Redshift cluster to restore the table to.
     *
     * @return The identifier of the Amazon Redshift cluster to restore the table to.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the Amazon Redshift cluster to restore the table to.
     *
     * @param clusterIdentifier The identifier of the Amazon Redshift cluster to restore the table to.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the Amazon Redshift cluster to restore the table to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The identifier of the snapshot to restore the table from. This
     * snapshot must have been created from the Amazon Redshift cluster
     * specified by the <code>ClusterIdentifier</code> parameter.
     *
     * @return The identifier of the snapshot to restore the table from. This
     *         snapshot must have been created from the Amazon Redshift cluster
     *         specified by the <code>ClusterIdentifier</code> parameter.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot to restore the table from. This
     * snapshot must have been created from the Amazon Redshift cluster
     * specified by the <code>ClusterIdentifier</code> parameter.
     *
     * @param snapshotIdentifier The identifier of the snapshot to restore the table from. This
     *         snapshot must have been created from the Amazon Redshift cluster
     *         specified by the <code>ClusterIdentifier</code> parameter.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot to restore the table from. This
     * snapshot must have been created from the Amazon Redshift cluster
     * specified by the <code>ClusterIdentifier</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The identifier of the snapshot to restore the table from. This
     *         snapshot must have been created from the Amazon Redshift cluster
     *         specified by the <code>ClusterIdentifier</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The name of the source database that contains the table to restore
     * from.
     *
     * @return The name of the source database that contains the table to restore
     *         from.
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }
    
    /**
     * The name of the source database that contains the table to restore
     * from.
     *
     * @param sourceDatabaseName The name of the source database that contains the table to restore
     *         from.
     */
    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }
    
    /**
     * The name of the source database that contains the table to restore
     * from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDatabaseName The name of the source database that contains the table to restore
     *         from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * The name of the source schema that contains the table to restore from.
     * If you do not specify a <code>SourceSchemaName</code> value, the
     * default is <code>public</code>.
     *
     * @return The name of the source schema that contains the table to restore from.
     *         If you do not specify a <code>SourceSchemaName</code> value, the
     *         default is <code>public</code>.
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }
    
    /**
     * The name of the source schema that contains the table to restore from.
     * If you do not specify a <code>SourceSchemaName</code> value, the
     * default is <code>public</code>.
     *
     * @param sourceSchemaName The name of the source schema that contains the table to restore from.
     *         If you do not specify a <code>SourceSchemaName</code> value, the
     *         default is <code>public</code>.
     */
    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }
    
    /**
     * The name of the source schema that contains the table to restore from.
     * If you do not specify a <code>SourceSchemaName</code> value, the
     * default is <code>public</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSchemaName The name of the source schema that contains the table to restore from.
     *         If you do not specify a <code>SourceSchemaName</code> value, the
     *         default is <code>public</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }

    /**
     * The name of the source table to restore from.
     *
     * @return The name of the source table to restore from.
     */
    public String getSourceTableName() {
        return sourceTableName;
    }
    
    /**
     * The name of the source table to restore from.
     *
     * @param sourceTableName The name of the source table to restore from.
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }
    
    /**
     * The name of the source table to restore from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceTableName The name of the source table to restore from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * The name of the database to restore the table to.
     *
     * @return The name of the database to restore the table to.
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }
    
    /**
     * The name of the database to restore the table to.
     *
     * @param targetDatabaseName The name of the database to restore the table to.
     */
    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }
    
    /**
     * The name of the database to restore the table to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDatabaseName The name of the database to restore the table to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * The name of the schema to restore the table to.
     *
     * @return The name of the schema to restore the table to.
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
    }
    
    /**
     * The name of the schema to restore the table to.
     *
     * @param targetSchemaName The name of the schema to restore the table to.
     */
    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }
    
    /**
     * The name of the schema to restore the table to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetSchemaName The name of the schema to restore the table to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
        return this;
    }

    /**
     * The name of the table to create as a result of the current request.
     *
     * @return The name of the table to create as a result of the current request.
     */
    public String getNewTableName() {
        return newTableName;
    }
    
    /**
     * The name of the table to create as a result of the current request.
     *
     * @param newTableName The name of the table to create as a result of the current request.
     */
    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }
    
    /**
     * The name of the table to create as a result of the current request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newTableName The name of the table to create as a result of the current request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreTableFromClusterSnapshotRequest withNewTableName(String newTableName) {
        this.newTableName = newTableName;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSourceDatabaseName() != null) sb.append("SourceDatabaseName: " + getSourceDatabaseName() + ",");
        if (getSourceSchemaName() != null) sb.append("SourceSchemaName: " + getSourceSchemaName() + ",");
        if (getSourceTableName() != null) sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetDatabaseName() != null) sb.append("TargetDatabaseName: " + getTargetDatabaseName() + ",");
        if (getTargetSchemaName() != null) sb.append("TargetSchemaName: " + getTargetSchemaName() + ",");
        if (getNewTableName() != null) sb.append("NewTableName: " + getNewTableName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreTableFromClusterSnapshotRequest == false) return false;
        RestoreTableFromClusterSnapshotRequest other = (RestoreTableFromClusterSnapshotRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null) return false;
        if (other.getSourceDatabaseName() != null && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false) return false; 
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null) return false;
        if (other.getSourceSchemaName() != null && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false) return false; 
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null) return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false) return false; 
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null) return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false) return false; 
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null) return false;
        if (other.getTargetSchemaName() != null && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false) return false; 
        if (other.getNewTableName() == null ^ this.getNewTableName() == null) return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreTableFromClusterSnapshotRequest clone() {
        
            return (RestoreTableFromClusterSnapshotRequest) super.clone();
    }

}
    