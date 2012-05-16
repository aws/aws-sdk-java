/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBInstance(DeleteDBInstanceRequest) DeleteDBInstance operation}.
 * <p>
 * The DeleteDBInstance API deletes a previously provisioned RDS instance. A successful response from the web service indicates the request was received
 * correctly. If a final DBSnapshot is requested the status of the RDS instance will be "deleting" until the DBSnapshot is created. DescribeDBInstance is
 * used to monitor the status of this operation. This cannot be canceled or reverted once submitted.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBInstance(DeleteDBInstanceRequest)
 */
public class DeleteDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If false is specified, a DB Snapshot is created before the
     * DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     * must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     */
    private Boolean skipFinalSnapshot;

    /**
     * The DBSnapshotIdentifier of the new DBSnapshot created when
     * SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     * parameter and also setting the SkipFinalShapshot parameter to true
     * results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
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
     * @param dBInstanceIdentifier The DB Instance identifier for the DB
     * Instance to be deleted. This parameter isn't case sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    public DeleteDBInstanceRequest(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return The DB Instance identifier for the DB Instance to be deleted. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The DB Instance identifier for the DB Instance to be deleted. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier for the DB Instance to be deleted. This
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
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If false is specified, a DB Snapshot is created before the
     * DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     * must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @return Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If false is specified, a DB Snapshot is created before the
     *         DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     *         must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If false is specified, a DB Snapshot is created before the
     * DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     * must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @param skipFinalSnapshot Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If false is specified, a DB Snapshot is created before the
     *         DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     *         must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If false is specified, a DB Snapshot is created before the
     * DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     * must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param skipFinalSnapshot Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If false is specified, a DB Snapshot is created before the
     *         DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     *         must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBInstanceRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }
    
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     * is created. If false is specified, a DB Snapshot is created before the
     * DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     * must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @return Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <code>true</code> is specified, no DBSnapshot
     *         is created. If false is specified, a DB Snapshot is created before the
     *         DB Instance is deleted. <note>The FinalDBSnapshotIdentifier parameter
     *         must be specified if SkipFinalSnapshot is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
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
     * </ul>
     *
     * @return The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
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
     * </ul>
     *
     * @param finalDBSnapshotIdentifier The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
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
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalDBSnapshotIdentifier The DBSnapshotIdentifier of the new DBSnapshot created when
     *         SkipFinalSnapshot is set to <code>false</code>. <note> Specifying this
     *         parameter and also setting the SkipFinalShapshot parameter to true
     *         results in an error. </note> <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
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
        if (dBInstanceIdentifier != null) sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        if (skipFinalSnapshot != null) sb.append("SkipFinalSnapshot: " + skipFinalSnapshot + ", ");
        if (finalDBSnapshotIdentifier != null) sb.append("FinalDBSnapshotIdentifier: " + finalDBSnapshotIdentifier + ", ");
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
    