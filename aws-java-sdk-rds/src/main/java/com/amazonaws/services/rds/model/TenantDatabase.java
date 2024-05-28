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
 * A tenant database in the DB instance. This data type is an element in the response to the
 * <code>DescribeTenantDatabases</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/TenantDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TenantDatabase implements Serializable, Cloneable {

    /**
     * <p>
     * The creation time of the tenant database.
     * </p>
     */
    private java.util.Date tenantDatabaseCreateTime;
    /**
     * <p>
     * The ID of the DB instance that contains the tenant database.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The database name of the tenant database.
     * </p>
     */
    private String tenantDBName;
    /**
     * <p>
     * The status of the tenant database.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The master username of the tenant database.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     * </p>
     */
    private String tenantDatabaseResourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tenant database.
     * </p>
     */
    private String tenantDatabaseARN;
    /**
     * <p>
     * The character set of the tenant database.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The <code>NCHAR</code> character set name of the tenant database.
     * </p>
     */
    private String ncharCharacterSetName;
    /**
     * <p>
     * Specifies whether deletion protection is enabled for the DB instance.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * Information about pending changes for a tenant database.
     * </p>
     */
    private TenantDatabasePendingModifiedValues pendingModifiedValues;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;

    /**
     * <p>
     * The creation time of the tenant database.
     * </p>
     * 
     * @param tenantDatabaseCreateTime
     *        The creation time of the tenant database.
     */

    public void setTenantDatabaseCreateTime(java.util.Date tenantDatabaseCreateTime) {
        this.tenantDatabaseCreateTime = tenantDatabaseCreateTime;
    }

    /**
     * <p>
     * The creation time of the tenant database.
     * </p>
     * 
     * @return The creation time of the tenant database.
     */

    public java.util.Date getTenantDatabaseCreateTime() {
        return this.tenantDatabaseCreateTime;
    }

    /**
     * <p>
     * The creation time of the tenant database.
     * </p>
     * 
     * @param tenantDatabaseCreateTime
     *        The creation time of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withTenantDatabaseCreateTime(java.util.Date tenantDatabaseCreateTime) {
        setTenantDatabaseCreateTime(tenantDatabaseCreateTime);
        return this;
    }

    /**
     * <p>
     * The ID of the DB instance that contains the tenant database.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance that contains the tenant database.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance that contains the tenant database.
     * </p>
     * 
     * @return The ID of the DB instance that contains the tenant database.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance that contains the tenant database.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance that contains the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The database name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The database name of the tenant database.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The database name of the tenant database.
     * </p>
     * 
     * @return The database name of the tenant database.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The database name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The database name of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * The status of the tenant database.
     * </p>
     * 
     * @param status
     *        The status of the tenant database.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the tenant database.
     * </p>
     * 
     * @return The status of the tenant database.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the tenant database.
     * </p>
     * 
     * @param status
     *        The status of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withStatus(String status) {
        setStatus(status);
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

    public TenantDatabase withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     * </p>
     * 
     * @param dbiResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     * </p>
     * 
     * @return The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     * </p>
     * 
     * @param dbiResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     * </p>
     * 
     * @param tenantDatabaseResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     */

    public void setTenantDatabaseResourceId(String tenantDatabaseResourceId) {
        this.tenantDatabaseResourceId = tenantDatabaseResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     * </p>
     * 
     * @return The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     */

    public String getTenantDatabaseResourceId() {
        return this.tenantDatabaseResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     * </p>
     * 
     * @param tenantDatabaseResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withTenantDatabaseResourceId(String tenantDatabaseResourceId) {
        setTenantDatabaseResourceId(tenantDatabaseResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tenant database.
     * </p>
     * 
     * @param tenantDatabaseARN
     *        The Amazon Resource Name (ARN) for the tenant database.
     */

    public void setTenantDatabaseARN(String tenantDatabaseARN) {
        this.tenantDatabaseARN = tenantDatabaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tenant database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the tenant database.
     */

    public String getTenantDatabaseARN() {
        return this.tenantDatabaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tenant database.
     * </p>
     * 
     * @param tenantDatabaseARN
     *        The Amazon Resource Name (ARN) for the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withTenantDatabaseARN(String tenantDatabaseARN) {
        setTenantDatabaseARN(tenantDatabaseARN);
        return this;
    }

    /**
     * <p>
     * The character set of the tenant database.
     * </p>
     * 
     * @param characterSetName
     *        The character set of the tenant database.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The character set of the tenant database.
     * </p>
     * 
     * @return The character set of the tenant database.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * The character set of the tenant database.
     * </p>
     * 
     * @param characterSetName
     *        The character set of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
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

    public TenantDatabase withNcharCharacterSetName(String ncharCharacterSetName) {
        setNcharCharacterSetName(ncharCharacterSetName);
        return this;
    }

    /**
     * <p>
     * Specifies whether deletion protection is enabled for the DB instance.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether deletion protection is enabled for the DB instance.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Specifies whether deletion protection is enabled for the DB instance.
     * </p>
     * 
     * @return Specifies whether deletion protection is enabled for the DB instance.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Specifies whether deletion protection is enabled for the DB instance.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether deletion protection is enabled for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Specifies whether deletion protection is enabled for the DB instance.
     * </p>
     * 
     * @return Specifies whether deletion protection is enabled for the DB instance.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Information about pending changes for a tenant database.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Information about pending changes for a tenant database.
     */

    public void setPendingModifiedValues(TenantDatabasePendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Information about pending changes for a tenant database.
     * </p>
     * 
     * @return Information about pending changes for a tenant database.
     */

    public TenantDatabasePendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * Information about pending changes for a tenant database.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Information about pending changes for a tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabase withPendingModifiedValues(TenantDatabasePendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
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

    public TenantDatabase withTagList(Tag... tagList) {
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

    public TenantDatabase withTagList(java.util.Collection<Tag> tagList) {
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
        if (getTenantDatabaseCreateTime() != null)
            sb.append("TenantDatabaseCreateTime: ").append(getTenantDatabaseCreateTime()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getTenantDBName() != null)
            sb.append("TenantDBName: ").append(getTenantDBName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getTenantDatabaseResourceId() != null)
            sb.append("TenantDatabaseResourceId: ").append(getTenantDatabaseResourceId()).append(",");
        if (getTenantDatabaseARN() != null)
            sb.append("TenantDatabaseARN: ").append(getTenantDatabaseARN()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getNcharCharacterSetName() != null)
            sb.append("NcharCharacterSetName: ").append(getNcharCharacterSetName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
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

        if (obj instanceof TenantDatabase == false)
            return false;
        TenantDatabase other = (TenantDatabase) obj;
        if (other.getTenantDatabaseCreateTime() == null ^ this.getTenantDatabaseCreateTime() == null)
            return false;
        if (other.getTenantDatabaseCreateTime() != null && other.getTenantDatabaseCreateTime().equals(this.getTenantDatabaseCreateTime()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getTenantDatabaseResourceId() == null ^ this.getTenantDatabaseResourceId() == null)
            return false;
        if (other.getTenantDatabaseResourceId() != null && other.getTenantDatabaseResourceId().equals(this.getTenantDatabaseResourceId()) == false)
            return false;
        if (other.getTenantDatabaseARN() == null ^ this.getTenantDatabaseARN() == null)
            return false;
        if (other.getTenantDatabaseARN() != null && other.getTenantDatabaseARN().equals(this.getTenantDatabaseARN()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getNcharCharacterSetName() == null ^ this.getNcharCharacterSetName() == null)
            return false;
        if (other.getNcharCharacterSetName() != null && other.getNcharCharacterSetName().equals(this.getNcharCharacterSetName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
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

        hashCode = prime * hashCode + ((getTenantDatabaseCreateTime() == null) ? 0 : getTenantDatabaseCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getTenantDatabaseResourceId() == null) ? 0 : getTenantDatabaseResourceId().hashCode());
        hashCode = prime * hashCode + ((getTenantDatabaseARN() == null) ? 0 : getTenantDatabaseARN().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getNcharCharacterSetName() == null) ? 0 : getNcharCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public TenantDatabase clone() {
        try {
            return (TenantDatabase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
