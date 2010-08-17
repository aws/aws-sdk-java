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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSnapshot(CreateDBSnapshotRequest) CreateDBSnapshot operation}.
 * <p>
 * This API is used to create a DBSnapshot. The source DBInstance must
 * be in "available" state.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSnapshot(CreateDBSnapshotRequest)
 */
public class CreateDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The identifier for the DB Snapshot.
     */
    private String dBSnapshotIdentifier;

    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive.
     */
    private String dBInstanceIdentifier;

    /**
     * Default constructor for a new CreateDBSnapshotRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBSnapshotRequest() {}
    
    /**
     * Constructs a new CreateDBSnapshotRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBSnapshotIdentifier The identifier for the DB Snapshot.
     * @param dBInstanceIdentifier The DB Instance identifier. This is the
     * unique key that identifies a DB Instance. This parameter isn't case
     * sensitive.
     */
    public CreateDBSnapshotRequest(String dBSnapshotIdentifier, String dBInstanceIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot.
     *
     * @return The identifier for the DB Snapshot.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot.
     *
     * @param dBSnapshotIdentifier The identifier for the DB Snapshot.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier for the DB Snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }
    
    
    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive.
     *
     * @return The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBSnapshotRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
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
        sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    