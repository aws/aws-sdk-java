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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBCluster(DeleteDBClusterRequest) DeleteDBCluster operation}.
 * <p>
 * The DeleteDBCluster action deletes a previously provisioned DB
 * cluster. A successful response from the web service indicates the
 * request was received correctly. When you delete a DB cluster, all
 * automated backups for that DB cluster are deleted and cannot be
 * recovered. Manual DB cluster snapshots of the DB cluster to be deleted
 * are not deleted.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBCluster(DeleteDBClusterRequest)
 */
public class DeleteDBClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String dBClusterIdentifier;

    /**
     * Determines whether a final DB cluster snapshot is created before the
     * DB cluster is deleted. If <code>true</code> is specified, no DB
     * cluster snapshot is created. If <code>false</code> is specified, a DB
     * cluster snapshot is created before the DB cluster is deleted.
     * <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     * parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.</note> <p>Default: <code>false</code>
     */
    private Boolean skipFinalSnapshot;

    /**
     * The DB cluster snapshot identifier of the new DB cluster snapshot
     * created when <code>SkipFinalSnapshot</code> is set to
     * <code>false</code>. <note> Specifying this parameter and also setting
     * the <code>SkipFinalShapshot</code> parameter to true results in an
     * error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return The DB cluster identifier for the DB cluster to be deleted. This
     *         parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBClusterIdentifier The DB cluster identifier for the DB cluster to be deleted. This
     *         parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The DB cluster identifier for the DB cluster to be deleted. This
     *         parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * Determines whether a final DB cluster snapshot is created before the
     * DB cluster is deleted. If <code>true</code> is specified, no DB
     * cluster snapshot is created. If <code>false</code> is specified, a DB
     * cluster snapshot is created before the DB cluster is deleted.
     * <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     * parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.</note> <p>Default: <code>false</code>
     *
     * @return Determines whether a final DB cluster snapshot is created before the
     *         DB cluster is deleted. If <code>true</code> is specified, no DB
     *         cluster snapshot is created. If <code>false</code> is specified, a DB
     *         cluster snapshot is created before the DB cluster is deleted.
     *         <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.</note> <p>Default: <code>false</code>
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB cluster snapshot is created before the
     * DB cluster is deleted. If <code>true</code> is specified, no DB
     * cluster snapshot is created. If <code>false</code> is specified, a DB
     * cluster snapshot is created before the DB cluster is deleted.
     * <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     * parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.</note> <p>Default: <code>false</code>
     *
     * @param skipFinalSnapshot Determines whether a final DB cluster snapshot is created before the
     *         DB cluster is deleted. If <code>true</code> is specified, no DB
     *         cluster snapshot is created. If <code>false</code> is specified, a DB
     *         cluster snapshot is created before the DB cluster is deleted.
     *         <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.</note> <p>Default: <code>false</code>
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB cluster snapshot is created before the
     * DB cluster is deleted. If <code>true</code> is specified, no DB
     * cluster snapshot is created. If <code>false</code> is specified, a DB
     * cluster snapshot is created before the DB cluster is deleted.
     * <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     * parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.</note> <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param skipFinalSnapshot Determines whether a final DB cluster snapshot is created before the
     *         DB cluster is deleted. If <code>true</code> is specified, no DB
     *         cluster snapshot is created. If <code>false</code> is specified, a DB
     *         cluster snapshot is created before the DB cluster is deleted.
     *         <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.</note> <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDBClusterRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }

    /**
     * Determines whether a final DB cluster snapshot is created before the
     * DB cluster is deleted. If <code>true</code> is specified, no DB
     * cluster snapshot is created. If <code>false</code> is specified, a DB
     * cluster snapshot is created before the DB cluster is deleted.
     * <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     * parameter if <code>SkipFinalSnapshot</code> is
     * <code>false</code>.</note> <p>Default: <code>false</code>
     *
     * @return Determines whether a final DB cluster snapshot is created before the
     *         DB cluster is deleted. If <code>true</code> is specified, no DB
     *         cluster snapshot is created. If <code>false</code> is specified, a DB
     *         cluster snapshot is created before the DB cluster is deleted.
     *         <note>You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is
     *         <code>false</code>.</note> <p>Default: <code>false</code>
     */
    public Boolean getSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * The DB cluster snapshot identifier of the new DB cluster snapshot
     * created when <code>SkipFinalSnapshot</code> is set to
     * <code>false</code>. <note> Specifying this parameter and also setting
     * the <code>SkipFinalShapshot</code> parameter to true results in an
     * error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The DB cluster snapshot identifier of the new DB cluster snapshot
     *         created when <code>SkipFinalSnapshot</code> is set to
     *         <code>false</code>. <note> Specifying this parameter and also setting
     *         the <code>SkipFinalShapshot</code> parameter to true results in an
     *         error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getFinalDBSnapshotIdentifier() {
        return finalDBSnapshotIdentifier;
    }
    
    /**
     * The DB cluster snapshot identifier of the new DB cluster snapshot
     * created when <code>SkipFinalSnapshot</code> is set to
     * <code>false</code>. <note> Specifying this parameter and also setting
     * the <code>SkipFinalShapshot</code> parameter to true results in an
     * error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param finalDBSnapshotIdentifier The DB cluster snapshot identifier of the new DB cluster snapshot
     *         created when <code>SkipFinalSnapshot</code> is set to
     *         <code>false</code>. <note> Specifying this parameter and also setting
     *         the <code>SkipFinalShapshot</code> parameter to true results in an
     *         error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }
    
    /**
     * The DB cluster snapshot identifier of the new DB cluster snapshot
     * created when <code>SkipFinalSnapshot</code> is set to
     * <code>false</code>. <note> Specifying this parameter and also setting
     * the <code>SkipFinalShapshot</code> parameter to true results in an
     * error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalDBSnapshotIdentifier The DB cluster snapshot identifier of the new DB cluster snapshot
     *         created when <code>SkipFinalSnapshot</code> is set to
     *         <code>false</code>. <note> Specifying this parameter and also setting
     *         the <code>SkipFinalShapshot</code> parameter to true results in an
     *         error. </note> <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDBClusterRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
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
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (isSkipFinalSnapshot() != null) sb.append("SkipFinalSnapshot: " + isSkipFinalSnapshot() + ",");
        if (getFinalDBSnapshotIdentifier() != null) sb.append("FinalDBSnapshotIdentifier: " + getFinalDBSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isSkipFinalSnapshot() == null) ? 0 : isSkipFinalSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDBClusterRequest == false) return false;
        DeleteDBClusterRequest other = (DeleteDBClusterRequest)obj;
        
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.isSkipFinalSnapshot() == null ^ this.isSkipFinalSnapshot() == null) return false;
        if (other.isSkipFinalSnapshot() != null && other.isSkipFinalSnapshot().equals(this.isSkipFinalSnapshot()) == false) return false; 
        if (other.getFinalDBSnapshotIdentifier() == null ^ this.getFinalDBSnapshotIdentifier() == null) return false;
        if (other.getFinalDBSnapshotIdentifier() != null && other.getFinalDBSnapshotIdentifier().equals(this.getFinalDBSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteDBClusterRequest clone() {
        
            return (DeleteDBClusterRequest) super.clone();
    }

}
    