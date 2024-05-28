/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of a tenant database in a snapshot of a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSnapshotTenantDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSnapshotTenantDatabase implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the snapshot of the DB instance.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The ID for the DB instance that contains the tenant databases.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an Amazon
     * Web Services Region.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The name of the database engine.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The type of DB snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the snapshot, the
     * creation time changes.
     * </p>
     */
    private java.util.Date tenantDatabaseCreateTime;
    /**
     * <p>
     * The name of the tenant database.
     * </p>
     */
    private String tenantDBName;
    /**
     * <p>
     * The master username of the tenant database.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The resource ID of the tenant database.
     * </p>
     */
    private String tenantDatabaseResourceId;
    /**
     * <p>
     * The name of the character set of a tenant database.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot tenant database.
     * </p>
     */
    private String dBSnapshotTenantDatabaseARN;
    /**
     * <p>
     * The <code>NCHAR</code> character set name of the tenant database.
     * </p>
     */
    private String ncharCharacterSetName;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;

    /**
     * <p>
     * The identifier for the snapshot of the DB instance.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier for the snapshot of the DB instance.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the snapshot of the DB instance.
     * </p>
     * 
     * @return The identifier for the snapshot of the DB instance.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the snapshot of the DB instance.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier for the snapshot of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID for the DB instance that contains the tenant databases.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The ID for the DB instance that contains the tenant databases.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID for the DB instance that contains the tenant databases.
     * </p>
     * 
     * @return The ID for the DB instance that contains the tenant databases.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID for the DB instance that contains the tenant databases.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The ID for the DB instance that contains the tenant databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an Amazon
     * Web Services Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an
     *        Amazon Web Services Region.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an Amazon
     * Web Services Region.
     * </p>
     * 
     * @return The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an
     *         Amazon Web Services Region.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an Amazon
     * Web Services Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The resource identifier of the source CDB instance. This identifier can't be changed and is unique to an
     *        Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engineName
     *        The name of the database engine.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @return The name of the database engine.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engineName
     *        The name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The type of DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of DB snapshot.
     * </p>
     * 
     * @return The type of DB snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the snapshot, the
     * creation time changes.
     * </p>
     * 
     * @param tenantDatabaseCreateTime
     *        The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the
     *        snapshot, the creation time changes.
     */

    public void setTenantDatabaseCreateTime(java.util.Date tenantDatabaseCreateTime) {
        this.tenantDatabaseCreateTime = tenantDatabaseCreateTime;
    }

    /**
     * <p>
     * The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the snapshot, the
     * creation time changes.
     * </p>
     * 
     * @return The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the
     *         snapshot, the creation time changes.
     */

    public java.util.Date getTenantDatabaseCreateTime() {
        return this.tenantDatabaseCreateTime;
    }

    /**
     * <p>
     * The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the snapshot, the
     * creation time changes.
     * </p>
     * 
     * @param tenantDatabaseCreateTime
     *        The time the DB snapshot was taken, specified in Coordinated Universal Time (UTC). If you copy the
     *        snapshot, the creation time changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withTenantDatabaseCreateTime(java.util.Date tenantDatabaseCreateTime) {
        setTenantDatabaseCreateTime(tenantDatabaseCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The name of the tenant database.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @return The name of the tenant database.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The name of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * The master username of the tenant database.
     * </p>
     * 
     * @param masterUsername
     *        The master username of the tenant database.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master username of the tenant database.
     * </p>
     * 
     * @return The master username of the tenant database.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master username of the tenant database.
     * </p>
     * 
     * @param masterUsername
     *        The master username of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The resource ID of the tenant database.
     * </p>
     * 
     * @param tenantDatabaseResourceId
     *        The resource ID of the tenant database.
     */

    public void setTenantDatabaseResourceId(String tenantDatabaseResourceId) {
        this.tenantDatabaseResourceId = tenantDatabaseResourceId;
    }

    /**
     * <p>
     * The resource ID of the tenant database.
     * </p>
     * 
     * @return The resource ID of the tenant database.
     */

    public String getTenantDatabaseResourceId() {
        return this.tenantDatabaseResourceId;
    }

    /**
     * <p>
     * The resource ID of the tenant database.
     * </p>
     * 
     * @param tenantDatabaseResourceId
     *        The resource ID of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withTenantDatabaseResourceId(String tenantDatabaseResourceId) {
        setTenantDatabaseResourceId(tenantDatabaseResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the character set of a tenant database.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set of a tenant database.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The name of the character set of a tenant database.
     * </p>
     * 
     * @return The name of the character set of a tenant database.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * The name of the character set of a tenant database.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set of a tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot tenant database.
     * </p>
     * 
     * @param dBSnapshotTenantDatabaseARN
     *        The Amazon Resource Name (ARN) for the snapshot tenant database.
     */

    public void setDBSnapshotTenantDatabaseARN(String dBSnapshotTenantDatabaseARN) {
        this.dBSnapshotTenantDatabaseARN = dBSnapshotTenantDatabaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot tenant database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the snapshot tenant database.
     */

    public String getDBSnapshotTenantDatabaseARN() {
        return this.dBSnapshotTenantDatabaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot tenant database.
     * </p>
     * 
     * @param dBSnapshotTenantDatabaseARN
     *        The Amazon Resource Name (ARN) for the snapshot tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withDBSnapshotTenantDatabaseARN(String dBSnapshotTenantDatabaseARN) {
        setDBSnapshotTenantDatabaseARN(dBSnapshotTenantDatabaseARN);
        return this;
    }

    /**
     * <p>
     * The <code>NCHAR</code> character set name of the tenant database.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The <code>NCHAR</code> character set name of the tenant database.
     */

    public void setNcharCharacterSetName(String ncharCharacterSetName) {
        this.ncharCharacterSetName = ncharCharacterSetName;
    }

    /**
     * <p>
     * The <code>NCHAR</code> character set name of the tenant database.
     * </p>
     * 
     * @return The <code>NCHAR</code> character set name of the tenant database.
     */

    public String getNcharCharacterSetName() {
        return this.ncharCharacterSetName;
    }

    /**
     * <p>
     * The <code>NCHAR</code> character set name of the tenant database.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The <code>NCHAR</code> character set name of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withNcharCharacterSetName(String ncharCharacterSetName) {
        setNcharCharacterSetName(ncharCharacterSetName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
            tagList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagList;
    }

    /**
     * @param tagList
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new com.amazonaws.internal.SdkInternalList<Tag>(tagList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new com.amazonaws.internal.SdkInternalList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotTenantDatabase withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getTenantDatabaseCreateTime() != null)
            sb.append("TenantDatabaseCreateTime: ").append(getTenantDatabaseCreateTime()).append(",");
        if (getTenantDBName() != null)
            sb.append("TenantDBName: ").append(getTenantDBName()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getTenantDatabaseResourceId() != null)
            sb.append("TenantDatabaseResourceId: ").append(getTenantDatabaseResourceId()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getDBSnapshotTenantDatabaseARN() != null)
            sb.append("DBSnapshotTenantDatabaseARN: ").append(getDBSnapshotTenantDatabaseARN()).append(",");
        if (getNcharCharacterSetName() != null)
            sb.append("NcharCharacterSetName: ").append(getNcharCharacterSetName()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshotTenantDatabase == false)
            return false;
        DBSnapshotTenantDatabase other = (DBSnapshotTenantDatabase) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getTenantDatabaseCreateTime() == null ^ this.getTenantDatabaseCreateTime() == null)
            return false;
        if (other.getTenantDatabaseCreateTime() != null && other.getTenantDatabaseCreateTime().equals(this.getTenantDatabaseCreateTime()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getTenantDatabaseResourceId() == null ^ this.getTenantDatabaseResourceId() == null)
            return false;
        if (other.getTenantDatabaseResourceId() != null && other.getTenantDatabaseResourceId().equals(this.getTenantDatabaseResourceId()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getDBSnapshotTenantDatabaseARN() == null ^ this.getDBSnapshotTenantDatabaseARN() == null)
            return false;
        if (other.getDBSnapshotTenantDatabaseARN() != null && other.getDBSnapshotTenantDatabaseARN().equals(this.getDBSnapshotTenantDatabaseARN()) == false)
            return false;
        if (other.getNcharCharacterSetName() == null ^ this.getNcharCharacterSetName() == null)
            return false;
        if (other.getNcharCharacterSetName() != null && other.getNcharCharacterSetName().equals(this.getNcharCharacterSetName()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getTenantDatabaseCreateTime() == null) ? 0 : getTenantDatabaseCreateTime().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getTenantDatabaseResourceId() == null) ? 0 : getTenantDatabaseResourceId().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshotTenantDatabaseARN() == null) ? 0 : getDBSnapshotTenantDatabaseARN().hashCode());
        hashCode = prime * hashCode + ((getNcharCharacterSetName() == null) ? 0 : getNcharCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public DBSnapshotTenantDatabase clone() {
        try {
            return (DBSnapshotTenantDatabase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
