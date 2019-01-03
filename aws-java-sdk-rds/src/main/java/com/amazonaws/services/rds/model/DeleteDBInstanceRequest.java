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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     * <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Specify <code>true</code> when deleting a Read Replica.
     * </p>
     * <note>
     * <p>
     * The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean skipFinalSnapshot;
    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code> is set
     * to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified when deleting a Read Replica.
     * </p>
     * </li>
     * </ul>
     */
    private String finalDBSnapshotIdentifier;
    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This
     * parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * </p>
     */
    private Boolean deleteAutomatedBackups;

    /**
     * Default constructor for DeleteDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteDBInstanceRequest() {
    }

    /**
     * Constructs a new DeleteDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DB instance.
     *        </p>
     *        </li>
     */
    public DeleteDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DB instance.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing DB instance.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DB instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     * <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Specify <code>true</code> when deleting a Read Replica.
     * </p>
     * <note>
     * <p>
     * The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     *        <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB
     *        snapshot is created before the DB instance is deleted. </p>
     *        <p>
     *        When a DB instance is in a failure state and has a status of <code>failed</code>,
     *        <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     *        <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     *        </p>
     *        <p>
     *        Specify <code>true</code> when deleting a Read Replica.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code>
     *        is <code>false</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     * <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Specify <code>true</code> when deleting a Read Replica.
     * </p>
     * <note>
     * <p>
     * The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     *         <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB
     *         snapshot is created before the DB instance is deleted. </p>
     *         <p>
     *         When a DB instance is in a failure state and has a status of <code>failed</code>,
     *         <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     *         <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     *         </p>
     *         <p>
     *         Specify <code>true</code> when deleting a Read Replica.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code>
     *         is <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     * <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Specify <code>true</code> when deleting a Read Replica.
     * </p>
     * <note>
     * <p>
     * The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     *        <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB
     *        snapshot is created before the DB instance is deleted. </p>
     *        <p>
     *        When a DB instance is in a failure state and has a status of <code>failed</code>,
     *        <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     *        <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     *        </p>
     *        <p>
     *        Specify <code>true</code> when deleting a Read Replica.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code>
     *        is <code>false</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        setSkipFinalSnapshot(skipFinalSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     * <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Specify <code>true</code> when deleting a Read Replica.
     * </p>
     * <note>
     * <p>
     * The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If
     *         <code>true</code> is specified, no DB snapshot is created. If <code>false</code> is specified, a DB
     *         snapshot is created before the DB instance is deleted. </p>
     *         <p>
     *         When a DB instance is in a failure state and has a status of <code>failed</code>,
     *         <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     *         <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     *         </p>
     *         <p>
     *         Specify <code>true</code> when deleting a Read Replica.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>FinalDBSnapshotIdentifier</code> parameter must be specified if <code>SkipFinalSnapshot</code>
     *         is <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code> is set
     * to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified when deleting a Read Replica.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalDBSnapshotIdentifier
     *        The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code>
     *        is set to <code>false</code>. </p> <note>
     *        <p>
     *        Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to
     *        <code>true</code> results in an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified when deleting a Read Replica.
     *        </p>
     *        </li>
     */

    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code> is set
     * to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified when deleting a Read Replica.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code>
     *         is set to <code>false</code>. </p> <note>
     *         <p>
     *         Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to
     *         <code>true</code> results in an error.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified when deleting a Read Replica.
     *         </p>
     *         </li>
     */

    public String getFinalDBSnapshotIdentifier() {
        return this.finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code> is set
     * to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified when deleting a Read Replica.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalDBSnapshotIdentifier
     *        The <code>DBSnapshotIdentifier</code> of the new DB snapshot created when <code>SkipFinalSnapshot</code>
     *        is set to <code>false</code>. </p> <note>
     *        <p>
     *        Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to
     *        <code>true</code> results in an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified when deleting a Read Replica.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        setFinalDBSnapshotIdentifier(finalDBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This
     * parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * </p>
     * 
     * @param deleteAutomatedBackups
     *        A value that indicates whether to remove automated backups immediately after the DB instance is deleted.
     *        This parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     */

    public void setDeleteAutomatedBackups(Boolean deleteAutomatedBackups) {
        this.deleteAutomatedBackups = deleteAutomatedBackups;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This
     * parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * </p>
     * 
     * @return A value that indicates whether to remove automated backups immediately after the DB instance is deleted.
     *         This parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     */

    public Boolean getDeleteAutomatedBackups() {
        return this.deleteAutomatedBackups;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This
     * parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * </p>
     * 
     * @param deleteAutomatedBackups
     *        A value that indicates whether to remove automated backups immediately after the DB instance is deleted.
     *        This parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceRequest withDeleteAutomatedBackups(Boolean deleteAutomatedBackups) {
        setDeleteAutomatedBackups(deleteAutomatedBackups);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This
     * parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     * </p>
     * 
     * @return A value that indicates whether to remove automated backups immediately after the DB instance is deleted.
     *         This parameter isn't case-sensitive. This parameter defaults to <code>true</code>.
     */

    public Boolean isDeleteAutomatedBackups() {
        return this.deleteAutomatedBackups;
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
        if (getSkipFinalSnapshot() != null)
            sb.append("SkipFinalSnapshot: ").append(getSkipFinalSnapshot()).append(",");
        if (getFinalDBSnapshotIdentifier() != null)
            sb.append("FinalDBSnapshotIdentifier: ").append(getFinalDBSnapshotIdentifier()).append(",");
        if (getDeleteAutomatedBackups() != null)
            sb.append("DeleteAutomatedBackups: ").append(getDeleteAutomatedBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBInstanceRequest == false)
            return false;
        DeleteDBInstanceRequest other = (DeleteDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getSkipFinalSnapshot() == null ^ this.getSkipFinalSnapshot() == null)
            return false;
        if (other.getSkipFinalSnapshot() != null && other.getSkipFinalSnapshot().equals(this.getSkipFinalSnapshot()) == false)
            return false;
        if (other.getFinalDBSnapshotIdentifier() == null ^ this.getFinalDBSnapshotIdentifier() == null)
            return false;
        if (other.getFinalDBSnapshotIdentifier() != null && other.getFinalDBSnapshotIdentifier().equals(this.getFinalDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDeleteAutomatedBackups() == null ^ this.getDeleteAutomatedBackups() == null)
            return false;
        if (other.getDeleteAutomatedBackups() != null && other.getDeleteAutomatedBackups().equals(this.getDeleteAutomatedBackups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime * hashCode + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeleteAutomatedBackups() == null) ? 0 : getDeleteAutomatedBackups().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBInstanceRequest clone() {
        return (DeleteDBInstanceRequest) super.clone();
    }

}
