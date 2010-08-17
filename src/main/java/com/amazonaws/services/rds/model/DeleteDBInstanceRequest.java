/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The DeleteDBInstance API deletes a previously provisioned RDS
 * instance. A successful response from the web service indicates the
 * request was received correctly. If a final DBSnapshot is requested the
 * status of the RDS instance will be "deleting" until the DBSnapshot is
 * created. DescribeDBInstance is used to monitor the status of this
 * operation. This cannot be canceled or reverted once submitted.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBInstance(DeleteDBInstanceRequest)
 */
public class DeleteDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive.
     */
    private String dBInstanceIdentifier;

    /**
     * 
     */
    private Boolean skipFinalSnapshot;

    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     * <i>false</i>, a DB Snapshot is created before the DB Instance is
     * deleted.
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
     */
    public DeleteDBInstanceRequest(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive.
     *
     * @return The DB Instance identifier for the DB Instance to be deleted. This
     *         parameter isn't case sensitive.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive.
     *
     * @param dBInstanceIdentifier The DB Instance identifier for the DB Instance to be deleted. This
     *         parameter isn't case sensitive.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier for the DB Instance to be deleted. This
     * parameter isn't case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier for the DB Instance to be deleted. This
     *         parameter isn't case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }
    
    /**
     * 
     *
     * @param skipFinalSnapshot 
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param skipFinalSnapshot 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBInstanceRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public Boolean getSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     * <i>false</i>, a DB Snapshot is created before the DB Instance is
     * deleted.
     *
     * @return Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     *         <i>false</i>, a DB Snapshot is created before the DB Instance is
     *         deleted.
     */
    public String getFinalDBSnapshotIdentifier() {
        return finalDBSnapshotIdentifier;
    }
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     * <i>false</i>, a DB Snapshot is created before the DB Instance is
     * deleted.
     *
     * @param finalDBSnapshotIdentifier Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     *         <i>false</i>, a DB Snapshot is created before the DB Instance is
     *         deleted.
     */
    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }
    
    /**
     * Determines whether a final DB Snapshot is created before the DB
     * Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     * <i>false</i>, a DB Snapshot is created before the DB Instance is
     * deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalDBSnapshotIdentifier Determines whether a final DB Snapshot is created before the DB
     *         Instance is deleted. If <i>true</i>, no DBSnapshot is created. If
     *         <i>false</i>, a DB Snapshot is created before the DB Instance is
     *         deleted.
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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("SkipFinalSnapshot: " + skipFinalSnapshot + ", ");
        sb.append("FinalDBSnapshotIdentifier: " + finalDBSnapshotIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    