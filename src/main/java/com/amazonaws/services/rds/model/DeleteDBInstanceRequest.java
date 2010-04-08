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
 * <p>
 * 
 * </p>
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
    