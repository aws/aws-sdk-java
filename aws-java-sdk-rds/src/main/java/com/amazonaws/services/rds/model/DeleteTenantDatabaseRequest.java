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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteTenantDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTenantDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied identifier for the DB instance that contains the tenant database that you want to delete.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS deletes
     * the tenant database with this name. This parameter isn’t case-sensitive.
     * </p>
     */
    private String tenantDBName;
    /**
     * <p>
     * Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from your DB
     * instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this parameter, RDS
     * creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip the final snapshot. If
     * you don't enable this parameter, you must specify the <code>FinalDBSnapshotIdentifier</code> parameter.
     * </p>
     */
    private Boolean skipFinalSnapshot;
    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     * <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an error.
     * </p>
     * </note>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * <p>
     * The user-supplied identifier for the DB instance that contains the tenant database that you want to delete.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied identifier for the DB instance that contains the tenant database that you want to
     *        delete.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied identifier for the DB instance that contains the tenant database that you want to delete.
     * </p>
     * 
     * @return The user-supplied identifier for the DB instance that contains the tenant database that you want to
     *         delete.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied identifier for the DB instance that contains the tenant database that you want to delete.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied identifier for the DB instance that contains the tenant database that you want to
     *        delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTenantDatabaseRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS deletes
     * the tenant database with this name. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS
     *        deletes the tenant database with this name. This parameter isn’t case-sensitive.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS deletes
     * the tenant database with this name. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @return The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS
     *         deletes the tenant database with this name. This parameter isn’t case-sensitive.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS deletes
     * the tenant database with this name. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied name of the tenant database that you want to remove from your DB instance. Amazon RDS
     *        deletes the tenant database with this name. This parameter isn’t case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTenantDatabaseRequest withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from your DB
     * instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this parameter, RDS
     * creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip the final snapshot. If
     * you don't enable this parameter, you must specify the <code>FinalDBSnapshotIdentifier</code> parameter.
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from
     *        your DB instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this
     *        parameter, RDS creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip
     *        the final snapshot. If you don't enable this parameter, you must specify the
     *        <code>FinalDBSnapshotIdentifier</code> parameter.
     */

    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }

    /**
     * <p>
     * Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from your DB
     * instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this parameter, RDS
     * creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip the final snapshot. If
     * you don't enable this parameter, you must specify the <code>FinalDBSnapshotIdentifier</code> parameter.
     * </p>
     * 
     * @return Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from
     *         your DB instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable
     *         this parameter, RDS creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't
     *         skip the final snapshot. If you don't enable this parameter, you must specify the
     *         <code>FinalDBSnapshotIdentifier</code> parameter.
     */

    public Boolean getSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from your DB
     * instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this parameter, RDS
     * creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip the final snapshot. If
     * you don't enable this parameter, you must specify the <code>FinalDBSnapshotIdentifier</code> parameter.
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from
     *        your DB instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this
     *        parameter, RDS creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip
     *        the final snapshot. If you don't enable this parameter, you must specify the
     *        <code>FinalDBSnapshotIdentifier</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTenantDatabaseRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        setSkipFinalSnapshot(skipFinalSnapshot);
        return this;
    }

    /**
     * <p>
     * Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from your DB
     * instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable this parameter, RDS
     * creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't skip the final snapshot. If
     * you don't enable this parameter, you must specify the <code>FinalDBSnapshotIdentifier</code> parameter.
     * </p>
     * 
     * @return Specifies whether to skip the creation of a final DB snapshot before removing the tenant database from
     *         your DB instance. If you enable this parameter, RDS doesn't create a DB snapshot. If you don't enable
     *         this parameter, RDS creates a DB snapshot before it deletes the tenant database. By default, RDS doesn't
     *         skip the final snapshot. If you don't enable this parameter, you must specify the
     *         <code>FinalDBSnapshotIdentifier</code> parameter.
     */

    public Boolean isSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     * <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an error.
     * </p>
     * </note>
     * 
     * @param finalDBSnapshotIdentifier
     *        The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     *        <code>SkipFinalSnapshot</code> parameter is disabled.</p> <note>
     *        <p>
     *        If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an
     *        error.
     *        </p>
     */

    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     * <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an error.
     * </p>
     * </note>
     * 
     * @return The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     *         <code>SkipFinalSnapshot</code> parameter is disabled.</p> <note>
     *         <p>
     *         If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an
     *         error.
     *         </p>
     */

    public String getFinalDBSnapshotIdentifier() {
        return this.finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     * <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an error.
     * </p>
     * </note>
     * 
     * @param finalDBSnapshotIdentifier
     *        The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code> created when the
     *        <code>SkipFinalSnapshot</code> parameter is disabled.</p> <note>
     *        <p>
     *        If you enable this parameter and also enable <code>SkipFinalShapshot</code>, the command results in an
     *        error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTenantDatabaseRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        setFinalDBSnapshotIdentifier(finalDBSnapshotIdentifier);
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
        if (getSkipFinalSnapshot() != null)
            sb.append("SkipFinalSnapshot: ").append(getSkipFinalSnapshot()).append(",");
        if (getFinalDBSnapshotIdentifier() != null)
            sb.append("FinalDBSnapshotIdentifier: ").append(getFinalDBSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTenantDatabaseRequest == false)
            return false;
        DeleteTenantDatabaseRequest other = (DeleteTenantDatabaseRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getSkipFinalSnapshot() == null ^ this.getSkipFinalSnapshot() == null)
            return false;
        if (other.getSkipFinalSnapshot() != null && other.getSkipFinalSnapshot().equals(this.getSkipFinalSnapshot()) == false)
            return false;
        if (other.getFinalDBSnapshotIdentifier() == null ^ this.getFinalDBSnapshotIdentifier() == null)
            return false;
        if (other.getFinalDBSnapshotIdentifier() != null && other.getFinalDBSnapshotIdentifier().equals(this.getFinalDBSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime * hashCode + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTenantDatabaseRequest clone() {
        return (DeleteTenantDatabaseRequest) super.clone();
    }

}
