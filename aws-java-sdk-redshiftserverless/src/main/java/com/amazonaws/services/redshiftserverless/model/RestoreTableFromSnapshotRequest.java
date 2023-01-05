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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreTableFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are
     * case sensitive. If false, the names are not case sensitive. The default is false.
     * </p>
     */
    private Boolean activateCaseSensitiveIdentifier;
    /**
     * <p>
     * The namespace of the snapshot to restore from.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     */
    private String newTableName;
    /**
     * <p>
     * The name of the snapshot to restore the table from.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     */
    private String sourceDatabaseName;
    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     */
    private String sourceSchemaName;
    /**
     * <p>
     * The name of the source table being restored.
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
     * The workgroup to restore the table to.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are
     * case sensitive. If false, the names are not case sensitive. The default is false.
     * </p>
     * 
     * @param activateCaseSensitiveIdentifier
     *        Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names
     *        are case sensitive. If false, the names are not case sensitive. The default is false.
     */

    public void setActivateCaseSensitiveIdentifier(Boolean activateCaseSensitiveIdentifier) {
        this.activateCaseSensitiveIdentifier = activateCaseSensitiveIdentifier;
    }

    /**
     * <p>
     * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are
     * case sensitive. If false, the names are not case sensitive. The default is false.
     * </p>
     * 
     * @return Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names
     *         are case sensitive. If false, the names are not case sensitive. The default is false.
     */

    public Boolean getActivateCaseSensitiveIdentifier() {
        return this.activateCaseSensitiveIdentifier;
    }

    /**
     * <p>
     * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are
     * case sensitive. If false, the names are not case sensitive. The default is false.
     * </p>
     * 
     * @param activateCaseSensitiveIdentifier
     *        Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names
     *        are case sensitive. If false, the names are not case sensitive. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withActivateCaseSensitiveIdentifier(Boolean activateCaseSensitiveIdentifier) {
        setActivateCaseSensitiveIdentifier(activateCaseSensitiveIdentifier);
        return this;
    }

    /**
     * <p>
     * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are
     * case sensitive. If false, the names are not case sensitive. The default is false.
     * </p>
     * 
     * @return Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names
     *         are case sensitive. If false, the names are not case sensitive. The default is false.
     */

    public Boolean isActivateCaseSensitiveIdentifier() {
        return this.activateCaseSensitiveIdentifier;
    }

    /**
     * <p>
     * The namespace of the snapshot to restore from.
     * </p>
     * 
     * @param namespaceName
     *        The namespace of the snapshot to restore from.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The namespace of the snapshot to restore from.
     * </p>
     * 
     * @return The namespace of the snapshot to restore from.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The namespace of the snapshot to restore from.
     * </p>
     * 
     * @param namespaceName
     *        The namespace of the snapshot to restore from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create from the restore operation.
     */

    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @return The name of the table to create from the restore operation.
     */

    public String getNewTableName() {
        return this.newTableName;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create from the restore operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withNewTableName(String newTableName) {
        setNewTableName(newTableName);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot to restore the table from.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to restore the table from.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to restore the table from.
     * </p>
     * 
     * @return The name of the snapshot to restore the table from.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to restore the table from.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to restore the table from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table being restored.
     */

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @return The name of the source database that contains the table being restored.
     */

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withSourceDatabaseName(String sourceDatabaseName) {
        setSourceDatabaseName(sourceDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table being restored.
     */

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @return The name of the source schema that contains the table being restored.
     */

    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withSourceSchemaName(String sourceSchemaName) {
        setSourceSchemaName(sourceSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @return The name of the source table being restored.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withSourceTableName(String sourceTableName) {
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

    public RestoreTableFromSnapshotRequest withTargetDatabaseName(String targetDatabaseName) {
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

    public RestoreTableFromSnapshotRequest withTargetSchemaName(String targetSchemaName) {
        setTargetSchemaName(targetSchemaName);
        return this;
    }

    /**
     * <p>
     * The workgroup to restore the table to.
     * </p>
     * 
     * @param workgroupName
     *        The workgroup to restore the table to.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The workgroup to restore the table to.
     * </p>
     * 
     * @return The workgroup to restore the table to.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The workgroup to restore the table to.
     * </p>
     * 
     * @param workgroupName
     *        The workgroup to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromSnapshotRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getActivateCaseSensitiveIdentifier() != null)
            sb.append("ActivateCaseSensitiveIdentifier: ").append(getActivateCaseSensitiveIdentifier()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNewTableName() != null)
            sb.append("NewTableName: ").append(getNewTableName()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
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
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromSnapshotRequest == false)
            return false;
        RestoreTableFromSnapshotRequest other = (RestoreTableFromSnapshotRequest) obj;
        if (other.getActivateCaseSensitiveIdentifier() == null ^ this.getActivateCaseSensitiveIdentifier() == null)
            return false;
        if (other.getActivateCaseSensitiveIdentifier() != null
                && other.getActivateCaseSensitiveIdentifier().equals(this.getActivateCaseSensitiveIdentifier()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
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
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivateCaseSensitiveIdentifier() == null) ? 0 : getActivateCaseSensitiveIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableFromSnapshotRequest clone() {
        return (RestoreTableFromSnapshotRequest) super.clone();
    }

}
