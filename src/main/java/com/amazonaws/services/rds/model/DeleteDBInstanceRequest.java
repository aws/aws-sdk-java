/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBInstance(DeleteDBInstanceRequest) DeleteDBInstance operation}.
 * <p>
 * The DeleteDBInstance action deletes a previously provisioned DB instance. A successful response from the web service indicates the request was
 * received correctly. When you delete a DB instance, all automated backups for that instance are deleted and cannot be recovered. Manual DB snapshots of
 * the DB instance to be deleted are not deleted.
 * </p>
 * <p>
 * If a final DB snapshot is requested the status of the RDS instance will be "deleting" until the DB snapshot is created. The API action
 * <code>DescribeDBInstance</code> is used to monitor the status of this operation. The action cannot be canceled or reverted once submitted.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBInstance(DeleteDBInstanceRequest)
 */
public class DeleteDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * Determines whether a final DB snapshot is created before the DB
     * instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted. <p>Specify
     * <code>true</code> when deleting a read replica. <note>The
     * FinalDBSnapshotIdentifier parameter must be specified if
     * SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     * <code>false</code>
     */
    private Boolean skipFinalSnapshot;

    /**
     * The DBSnapshotIdentifier of the new DBSnapshot created when
     * SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     * parameter and also setting the SkipFinalShapshot parameter to true
     * results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Cannot be specified when deleting a read replica.</li> </ul>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * Default constructor for a new DeleteDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteDBInstanceRequest() {}
    
    /**
     * Constructs a new DeleteDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier for the DB
     * instance to be deleted. This parameter isn't case sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    public DeleteDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return The DB instance identifier for the DB instance to be deleted. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The DB instance identifier for the DB instance to be deleted. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier for the DB instance to be deleted. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * Determines whether a final DB snapshot is created before the DB
     * instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted. <p>Specify
     * <code>true</code> when deleting a read replica. <note>The
     * FinalDBSnapshotIdentifier parameter must be specified if
     * SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     * <code>false</code>
     *
     * @return Determines whether a final DB snapshot is created before the DB
     *         instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If <code>false</code> is specified, a DB snapshot is
     *         created before the DB instance is deleted. <p>Specify
     *         <code>true</code> when deleting a read replica. <note>The
     *         FinalDBSnapshotIdentifier parameter must be specified if
     *         SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     *         <code>false</code>
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB snapshot is created before the DB
     * instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted. <p>Specify
     * <code>true</code> when deleting a read replica. <note>The
     * FinalDBSnapshotIdentifier parameter must be specified if
     * SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     * <code>false</code>
     *
     * @param skipFinalSnapshot Determines whether a final DB snapshot is created before the DB
     *         instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If <code>false</code> is specified, a DB snapshot is
     *         created before the DB instance is deleted. <p>Specify
     *         <code>true</code> when deleting a read replica. <note>The
     *         FinalDBSnapshotIdentifier parameter must be specified if
     *         SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     *         <code>false</code>
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB snapshot is created before the DB
     * instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted. <p>Specify
     * <code>true</code> when deleting a read replica. <note>The
     * FinalDBSnapshotIdentifier parameter must be specified if
     * SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param skipFinalSnapshot Determines whether a final DB snapshot is created before the DB
     *         instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If <code>false</code> is specified, a DB snapshot is
     *         created before the DB instance is deleted. <p>Specify
     *         <code>true</code> when deleting a read replica. <note>The
     *         FinalDBSnapshotIdentifier parameter must be specified if
     *         SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteDBInstanceRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }

    /**
     * Determines whether a final DB snapshot is created before the DB
     * instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If <code>false</code> is specified, a DB snapshot is
     * created before the DB instance is deleted. <p>Specify
     * <code>true</code> when deleting a read replica. <note>The
     * FinalDBSnapshotIdentifier parameter must be specified if
     * SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     * <code>false</code>
     *
     * @return Determines whether a final DB snapshot is created before the DB
     *         instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If <code>false</code> is specified, a DB snapshot is
     *         created before the DB instance is deleted. <p>Specify
     *         <code>true</code> when deleting a read replica. <note>The
     *         FinalDBSnapshotIdentifier parameter must be specified if
     *         SkipFinalSnapshot is <code>false</code>.</note> <p>Default:
     *         <code>false</code>
     */
    public Boolean getSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * The DBSnapshotIdentifier of the new DBSnapshot created when
     * SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     * parameter and also setting the SkipFinalShapshot parameter to true
     * results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Cannot be specified when deleting a read replica.</li> </ul>
     *
     * @return The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Cannot be specified when deleting a read replica.</li> </ul>
     */
    public String getFinalDBSnapshotIdentifier() {
        return finalDBSnapshotIdentifier;
    }
    
    /**
     * The DBSnapshotIdentifier of the new DBSnapshot created when
     * SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     * parameter and also setting the SkipFinalShapshot parameter to true
     * results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Cannot be specified when deleting a read replica.</li> </ul>
     *
     * @param finalDBSnapshotIdentifier The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Cannot be specified when deleting a read replica.</li> </ul>
     */
    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }
    
    /**
     * The DBSnapshotIdentifier of the new DBSnapshot created when
     * SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     * parameter and also setting the SkipFinalShapshot parameter to true
     * results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Cannot be specified when deleting a read replica.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalDBSnapshotIdentifier The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Cannot be specified when deleting a read replica.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteDBInstanceRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
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
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (isSkipFinalSnapshot() != null) sb.append("SkipFinalSnapshot: " + isSkipFinalSnapshot() + ",");
        if (getFinalDBSnapshotIdentifier() != null) sb.append("FinalDBSnapshotIdentifier: " + getFinalDBSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isSkipFinalSnapshot() == null) ? 0 : isSkipFinalSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDBInstanceRequest == false) return false;
        DeleteDBInstanceRequest other = (DeleteDBInstanceRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.isSkipFinalSnapshot() == null ^ this.isSkipFinalSnapshot() == null) return false;
        if (other.isSkipFinalSnapshot() != null && other.isSkipFinalSnapshot().equals(this.isSkipFinalSnapshot()) == false) return false; 
        if (other.getFinalDBSnapshotIdentifier() == null ^ this.getFinalDBSnapshotIdentifier() == null) return false;
        if (other.getFinalDBSnapshotIdentifier() != null && other.getFinalDBSnapshotIdentifier().equals(this.getFinalDBSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
}
    