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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest) DescribeDBSnapshotAttributes operation}.
 * <p>
 * Returns a list of DB snapshot attribute names and values for a manual
 * DB snapshot.
 * </p>
 * <p>
 * When sharing snapshots with other AWS accounts,
 * <code>DescribeDBSnapshotAttributes</code> returns the
 * <code>restore</code> attribute and a list of the AWS account ids that
 * are authorized to copy or restore the manual DB snapshot. If
 * <code>all</code> is included in the list of values for the
 * <code>restore</code> attribute, then the manual DB snapshot is public
 * and can be copied or restored by all AWS accounts.
 * </p>
 * <p>
 * To add or remove access for an AWS account to copy or restore a manual
 * DB snapshot, or to make the manual DB snapshot public or private, use
 * the ModifyDBSnapshotAttribute API.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest)
 */
public class DescribeDBSnapshotAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier for the DB snapshot to modify the attributes for.
     */
    private String dBSnapshotIdentifier;

    /**
     * The identifier for the DB snapshot to modify the attributes for.
     *
     * @return The identifier for the DB snapshot to modify the attributes for.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to modify the attributes for.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to modify the attributes for.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to modify the attributes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to modify the attributes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotAttributesRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
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
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBSnapshotAttributesRequest == false) return false;
        DescribeDBSnapshotAttributesRequest other = (DescribeDBSnapshotAttributesRequest)obj;
        
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBSnapshotAttributesRequest clone() {
        
            return (DescribeDBSnapshotAttributesRequest) super.clone();
    }

}
    