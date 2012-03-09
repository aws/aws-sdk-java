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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#copyDBSnapshot(CopyDBSnapshotRequest) CopyDBSnapshot operation}.
 * <p>
 * Copies the specified DBSnapshot. The source DBSnapshot must be in the
 * "available" state.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#copyDBSnapshot(CopyDBSnapshotRequest)
 */
public class CopyDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The identifier for the source DB snapshot. <p>Constraints: <ul>
     * <li>Must be the identifier for a valid automated snapshot in the
     * "available" state.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-01-15-00-01</code>
     */
    private String sourceDBSnapshotIdentifier;

    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    private String targetDBSnapshotIdentifier;

    /**
     * The identifier for the source DB snapshot. <p>Constraints: <ul>
     * <li>Must be the identifier for a valid automated snapshot in the
     * "available" state.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-01-15-00-01</code>
     *
     * @return The identifier for the source DB snapshot. <p>Constraints: <ul>
     *         <li>Must be the identifier for a valid automated snapshot in the
     *         "available" state.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-01-15-00-01</code>
     */
    public String getSourceDBSnapshotIdentifier() {
        return sourceDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source DB snapshot. <p>Constraints: <ul>
     * <li>Must be the identifier for a valid automated snapshot in the
     * "available" state.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-01-15-00-01</code>
     *
     * @param sourceDBSnapshotIdentifier The identifier for the source DB snapshot. <p>Constraints: <ul>
     *         <li>Must be the identifier for a valid automated snapshot in the
     *         "available" state.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-01-15-00-01</code>
     */
    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source DB snapshot. <p>Constraints: <ul>
     * <li>Must be the identifier for a valid automated snapshot in the
     * "available" state.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-01-15-00-01</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBSnapshotIdentifier The identifier for the source DB snapshot. <p>Constraints: <ul>
     *         <li>Must be the identifier for a valid automated snapshot in the
     *         "available" state.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-01-15-00-01</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CopyDBSnapshotRequest withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
        return this;
    }
    
    
    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @return The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    public String getTargetDBSnapshotIdentifier() {
        return targetDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @param targetDBSnapshotIdentifier The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    public void setTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBSnapshotIdentifier The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CopyDBSnapshotRequest withTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
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
        if (sourceDBSnapshotIdentifier != null) sb.append("SourceDBSnapshotIdentifier: " + sourceDBSnapshotIdentifier + ", ");
        if (targetDBSnapshotIdentifier != null) sb.append("TargetDBSnapshotIdentifier: " + targetDBSnapshotIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBSnapshotIdentifier() == null) ? 0 : getTargetDBSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CopyDBSnapshotRequest == false) return false;
        CopyDBSnapshotRequest other = (CopyDBSnapshotRequest)obj;
        
        if (other.getSourceDBSnapshotIdentifier() == null ^ this.getSourceDBSnapshotIdentifier() == null) return false;
        if (other.getSourceDBSnapshotIdentifier() != null && other.getSourceDBSnapshotIdentifier().equals(this.getSourceDBSnapshotIdentifier()) == false) return false; 
        if (other.getTargetDBSnapshotIdentifier() == null ^ this.getTargetDBSnapshotIdentifier() == null) return false;
        if (other.getTargetDBSnapshotIdentifier() != null && other.getTargetDBSnapshotIdentifier().equals(this.getTargetDBSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
}
    