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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateTenantDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTenantDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This parameter
     * isn't case-sensitive.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The user-supplied name of the tenant database that you want to create in your DB instance. This parameter has the
     * same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     * </p>
     */
    private String tenantDBName;
    /**
     * <p>
     * The name for the master user account in your tenant database. RDS creates this user account in the tenant
     * database and grants privileges to the master user. This parameter is case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master user in your tenant database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except forward slash (<code>/</code>), double quote (<code>"</code>),
     * at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (<code>'</code>).
     * </p>
     * </li>
     * </ul>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The character set for your tenant database. If you don't specify a value, the character set name defaults to
     * <code>AL32UTF8</code>.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The <code>NCHAR</code> value for the tenant database.
     * </p>
     */
    private String ncharCharacterSetName;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This
     *        parameter isn't case-sensitive.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @return The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This
     *         parameter isn't case-sensitive.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied DB instance identifier. RDS creates your tenant database in this DB instance. This
     *        parameter isn't case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to create in your DB instance. This parameter has the
     * same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to create in your DB instance. This parameter
     *        has the same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to create in your DB instance. This parameter has the
     * same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     * </p>
     * 
     * @return The user-supplied name of the tenant database that you want to create in your DB instance. This parameter
     *         has the same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to create in your DB instance. This parameter has the
     * same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to create in your DB instance. This parameter
     *        has the same constraints as <code>DBName</code> in <code>CreateDBInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * The name for the master user account in your tenant database. RDS creates this user account in the tenant
     * database and grants privileges to the master user. This parameter is case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user account in your tenant database. RDS creates this user account in the tenant
     *        database and grants privileges to the master user. This parameter is case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name for the master user account in your tenant database. RDS creates this user account in the tenant
     * database and grants privileges to the master user. This parameter is case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the master user account in your tenant database. RDS creates this user account in the tenant
     *         database and grants privileges to the master user. This parameter is case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters, numbers, or underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name for the master user account in your tenant database. RDS creates this user account in the tenant
     * database and grants privileges to the master user. This parameter is case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user account in your tenant database. RDS creates this user account in the tenant
     *        database and grants privileges to the master user. This parameter is case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master user in your tenant database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except forward slash (<code>/</code>), double quote (<code>"</code>),
     * at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (<code>'</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The password for the master user in your tenant database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 8 to 30 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except forward slash (<code>/</code>), double quote (
     *        <code>"</code>), at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (
     *        <code>'</code>).
     *        </p>
     *        </li>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user in your tenant database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except forward slash (<code>/</code>), double quote (<code>"</code>),
     * at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (<code>'</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The password for the master user in your tenant database.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 8 to 30 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can include any printable ASCII character except forward slash (<code>/</code>), double quote (
     *         <code>"</code>), at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (
     *         <code>'</code>).
     *         </p>
     *         </li>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user in your tenant database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except forward slash (<code>/</code>), double quote (<code>"</code>),
     * at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (<code>'</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The password for the master user in your tenant database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 8 to 30 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except forward slash (<code>/</code>), double quote (
     *        <code>"</code>), at symbol (<code>@</code>), ampersand (<code>&amp;</code>), or single quote (
     *        <code>'</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The character set for your tenant database. If you don't specify a value, the character set name defaults to
     * <code>AL32UTF8</code>.
     * </p>
     * 
     * @param characterSetName
     *        The character set for your tenant database. If you don't specify a value, the character set name defaults
     *        to <code>AL32UTF8</code>.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The character set for your tenant database. If you don't specify a value, the character set name defaults to
     * <code>AL32UTF8</code>.
     * </p>
     * 
     * @return The character set for your tenant database. If you don't specify a value, the character set name defaults
     *         to <code>AL32UTF8</code>.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * The character set for your tenant database. If you don't specify a value, the character set name defaults to
     * <code>AL32UTF8</code>.
     * </p>
     * 
     * @param characterSetName
     *        The character set for your tenant database. If you don't specify a value, the character set name defaults
     *        to <code>AL32UTF8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The <code>NCHAR</code> value for the tenant database.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The <code>NCHAR</code> value for the tenant database.
     */

    public void setNcharCharacterSetName(String ncharCharacterSetName) {
        this.ncharCharacterSetName = ncharCharacterSetName;
    }

    /**
     * <p>
     * The <code>NCHAR</code> value for the tenant database.
     * </p>
     * 
     * @return The <code>NCHAR</code> value for the tenant database.
     */

    public String getNcharCharacterSetName() {
        return this.ncharCharacterSetName;
    }

    /**
     * <p>
     * The <code>NCHAR</code> value for the tenant database.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The <code>NCHAR</code> value for the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withNcharCharacterSetName(String ncharCharacterSetName) {
        setNcharCharacterSetName(ncharCharacterSetName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTenantDatabaseRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getTenantDBName() != null)
            sb.append("TenantDBName: ").append(getTenantDBName()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getNcharCharacterSetName() != null)
            sb.append("NcharCharacterSetName: ").append(getNcharCharacterSetName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTenantDatabaseRequest == false)
            return false;
        CreateTenantDatabaseRequest other = (CreateTenantDatabaseRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getNcharCharacterSetName() == null ^ this.getNcharCharacterSetName() == null)
            return false;
        if (other.getNcharCharacterSetName() != null && other.getNcharCharacterSetName().equals(this.getNcharCharacterSetName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getNcharCharacterSetName() == null) ? 0 : getNcharCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTenantDatabaseRequest clone() {
        return (CreateTenantDatabaseRequest) super.clone();
    }

}
