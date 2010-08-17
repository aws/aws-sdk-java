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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBSnapshot(DeleteDBSnapshotRequest) DeleteDBSnapshot operation}.
 * <p>
 * This API is used to delete a DBSnapshot. The DBSnapshot must be in
 * the "available" state to be deleted.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBSnapshot(DeleteDBSnapshotRequest)
 */
public class DeleteDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The DBSnapshot identifier.
     */
    private String dBSnapshotIdentifier;

    /**
     * Default constructor for a new DeleteDBSnapshotRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteDBSnapshotRequest() {}
    
    /**
     * Constructs a new DeleteDBSnapshotRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBSnapshotIdentifier The DBSnapshot identifier.
     */
    public DeleteDBSnapshotRequest(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The DBSnapshot identifier.
     *
     * @return The DBSnapshot identifier.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The DBSnapshot identifier.
     *
     * @param dBSnapshotIdentifier The DBSnapshot identifier.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The DBSnapshot identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The DBSnapshot identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    