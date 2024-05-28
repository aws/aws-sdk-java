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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyTenantDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTenantDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the DB instance that contains the tenant database that you are modifying. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The user-supplied name of the tenant database that you want to modify. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing tenant database.
     * </p>
     * </li>
     * </ul>
     */
    private String tenantDBName;
    /**
     * <p>
     * The new password for the master user of the specified tenant database in your DB instance.
     * </p>
     * <note>
     * <p>
     * Amazon RDS operations never return the password, so this action provides a way to regain access to a tenant
     * database user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote), <code>@</code>,
     * <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain between 8 and 30 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The new name of the tenant database when renaming a tenant database. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the string null or any other reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 8 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String newTenantDBName;

    /**
     * <p>
     * The identifier of the DB instance that contains the tenant database that you are modifying. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The identifier of the DB instance that contains the tenant database that you are modifying. This parameter
     *        isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DB instance.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that contains the tenant database that you are modifying. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the DB instance that contains the tenant database that you are modifying. This
     *         parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DB instance.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that contains the tenant database that you are modifying. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The identifier of the DB instance that contains the tenant database that you are modifying. This parameter
     *        isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DB instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTenantDatabaseRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to modify. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing tenant database.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to modify. This parameter isn’t
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing tenant database.
     *        </p>
     *        </li>
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to modify. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing tenant database.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user-supplied name of the tenant database that you want to modify. This parameter isn’t
     *         case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing tenant database.
     *         </p>
     *         </li>
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to modify. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing tenant database.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to modify. This parameter isn’t
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing tenant database.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTenantDatabaseRequest withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * The new password for the master user of the specified tenant database in your DB instance.
     * </p>
     * <note>
     * <p>
     * Amazon RDS operations never return the password, so this action provides a way to regain access to a tenant
     * database user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote), <code>@</code>,
     * <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain between 8 and 30 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the master user of the specified tenant database in your DB instance.</p> <note>
     *        <p>
     *        Amazon RDS operations never return the password, so this action provides a way to regain access to a
     *        tenant database user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote),
     *        <code>@</code>, <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Length constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain between 8 and 30 characters.
     *        </p>
     *        </li>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user of the specified tenant database in your DB instance.
     * </p>
     * <note>
     * <p>
     * Amazon RDS operations never return the password, so this action provides a way to regain access to a tenant
     * database user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote), <code>@</code>,
     * <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain between 8 and 30 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new password for the master user of the specified tenant database in your DB instance.</p> <note>
     *         <p>
     *         Amazon RDS operations never return the password, so this action provides a way to regain access to a
     *         tenant database user if the password is lost. This includes restoring privileges that might have been
     *         accidentally revoked.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote),
     *         <code>@</code>, <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Length constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain between 8 and 30 characters.
     *         </p>
     *         </li>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user of the specified tenant database in your DB instance.
     * </p>
     * <note>
     * <p>
     * Amazon RDS operations never return the password, so this action provides a way to regain access to a tenant
     * database user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote), <code>@</code>,
     * <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain between 8 and 30 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the master user of the specified tenant database in your DB instance.</p> <note>
     *        <p>
     *        Amazon RDS operations never return the password, so this action provides a way to regain access to a
     *        tenant database user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except <code>/</code>, <code>"</code> (double quote),
     *        <code>@</code>, <code>&amp;</code> (ampersand), and <code>'</code> (single quote).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Length constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain between 8 and 30 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTenantDatabaseRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The new name of the tenant database when renaming a tenant database. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the string null or any other reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 8 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newTenantDBName
     *        The new name of the tenant database when renaming a tenant database. This parameter isn’t
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be the string null or any other reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be longer than 8 characters.
     *        </p>
     *        </li>
     */

    public void setNewTenantDBName(String newTenantDBName) {
        this.newTenantDBName = newTenantDBName;
    }

    /**
     * <p>
     * The new name of the tenant database when renaming a tenant database. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the string null or any other reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 8 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new name of the tenant database when renaming a tenant database. This parameter isn’t
     *         case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be the string null or any other reserved word.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be longer than 8 characters.
     *         </p>
     *         </li>
     */

    public String getNewTenantDBName() {
        return this.newTenantDBName;
    }

    /**
     * <p>
     * The new name of the tenant database when renaming a tenant database. This parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the string null or any other reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 8 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newTenantDBName
     *        The new name of the tenant database when renaming a tenant database. This parameter isn’t
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be the string null or any other reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be longer than 8 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTenantDatabaseRequest withNewTenantDBName(String newTenantDBName) {
        setNewTenantDBName(newTenantDBName);
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
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getNewTenantDBName() != null)
            sb.append("NewTenantDBName: ").append(getNewTenantDBName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTenantDatabaseRequest == false)
            return false;
        ModifyTenantDatabaseRequest other = (ModifyTenantDatabaseRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getNewTenantDBName() == null ^ this.getNewTenantDBName() == null)
            return false;
        if (other.getNewTenantDBName() != null && other.getNewTenantDBName().equals(this.getNewTenantDBName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getNewTenantDBName() == null) ? 0 : getNewTenantDBName().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTenantDatabaseRequest clone() {
        return (ModifyTenantDatabaseRequest) super.clone();
    }

}
