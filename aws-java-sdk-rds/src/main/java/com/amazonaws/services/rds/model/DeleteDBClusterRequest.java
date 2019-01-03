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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If <code>true</code>
     * is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a DB cluster snapshot is
     * created before the DB cluster is deleted.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
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
     * The DB cluster snapshot identifier of the new DB cluster snapshot created when <code>SkipFinalSnapshot</code> is
     * set to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in an
     * error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match an existing DBClusterIdentifier.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match an existing DBClusterIdentifier.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match an existing DBClusterIdentifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If <code>true</code>
     * is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a DB cluster snapshot is
     * created before the DB cluster is deleted.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If
     *        <code>true</code> is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a
     *        DB cluster snapshot is created before the DB cluster is deleted. </p> <note>
     *        <p>
     *        You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     *        <code>false</code>.
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
     * Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If <code>true</code>
     * is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a DB cluster snapshot is
     * created before the DB cluster is deleted.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If
     *         <code>true</code> is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a
     *         DB cluster snapshot is created before the DB cluster is deleted. </p> <note>
     *         <p>
     *         You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.
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
     * Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If <code>true</code>
     * is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a DB cluster snapshot is
     * created before the DB cluster is deleted.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If
     *        <code>true</code> is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a
     *        DB cluster snapshot is created before the DB cluster is deleted. </p> <note>
     *        <p>
     *        You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     *        <code>false</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBClusterRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        setSkipFinalSnapshot(skipFinalSnapshot);
        return this;
    }

    /**
     * <p>
     * Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If <code>true</code>
     * is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a DB cluster snapshot is
     * created before the DB cluster is deleted.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If
     *         <code>true</code> is specified, no DB cluster snapshot is created. If <code>false</code> is specified, a
     *         DB cluster snapshot is created before the DB cluster is deleted. </p> <note>
     *         <p>
     *         You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.
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
     * The DB cluster snapshot identifier of the new DB cluster snapshot created when <code>SkipFinalSnapshot</code> is
     * set to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in an
     * error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalDBSnapshotIdentifier
     *        The DB cluster snapshot identifier of the new DB cluster snapshot created when
     *        <code>SkipFinalSnapshot</code> is set to <code>false</code>. </p> <note>
     *        <p>
     *        Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in
     *        an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created when <code>SkipFinalSnapshot</code> is
     * set to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in an
     * error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster snapshot identifier of the new DB cluster snapshot created when
     *         <code>SkipFinalSnapshot</code> is set to <code>false</code>. </p> <note>
     *         <p>
     *         Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results
     *         in an error.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getFinalDBSnapshotIdentifier() {
        return this.finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created when <code>SkipFinalSnapshot</code> is
     * set to <code>false</code>.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in an
     * error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalDBSnapshotIdentifier
     *        The DB cluster snapshot identifier of the new DB cluster snapshot created when
     *        <code>SkipFinalSnapshot</code> is set to <code>false</code>. </p> <note>
     *        <p>
     *        Specifying this parameter and also setting the <code>SkipFinalShapshot</code> parameter to true results in
     *        an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBClusterRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
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

        if (obj instanceof DeleteDBClusterRequest == false)
            return false;
        DeleteDBClusterRequest other = (DeleteDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime * hashCode + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBClusterRequest clone() {
        return (DeleteDBClusterRequest) super.clone();
    }

}
