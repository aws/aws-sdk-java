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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSnapshot(CreateDBSnapshotRequest) CreateDBSnapshot operation}.
 * <p>
 * Creates a DBSnapshot. The source DBInstance must be in "available" state.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSnapshot(CreateDBSnapshotRequest)
 */
public class CreateDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     * null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <code>my-snapshot-id</code>
     */
    private String dBSnapshotIdentifier;

    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
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
     * <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     * @param dBInstanceIdentifier The DB Instance identifier. This is the
     * unique key that identifies a DB Instance. This parameter isn't case
     * sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    public CreateDBSnapshotRequest(String dBSnapshotIdentifier, String dBInstanceIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    
    
    /**
     * The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     * null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <code>my-snapshot-id</code>
     *
     * @return The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     *         null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <code>my-snapshot-id</code>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     * null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <code>my-snapshot-id</code>
     *
     * @param dBSnapshotIdentifier The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     *         null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <code>my-snapshot-id</code>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     * null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier for the DB Snapshot. <p>Constraints: <ul> <li>Cannot be
     *         null, empty, or blank</li> <li>Must contain from 1 to 255 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <code>my-snapshot-id</code>
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
     * DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @return The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This is the unique key that identifies a
     * DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This is the unique key that identifies a
     *         DB Instance. This parameter isn't case sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
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
        if (dBSnapshotIdentifier != null) sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        if (dBInstanceIdentifier != null) sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateDBSnapshotRequest == false) return false;
        CreateDBSnapshotRequest other = (CreateDBSnapshotRequest)obj;
        
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        return true;
    }
    
}
    