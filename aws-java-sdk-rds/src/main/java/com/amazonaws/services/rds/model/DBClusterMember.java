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

/**
 * <p>
 * Contains information about an instance that is part of a DB cluster.
 * </p>
 */
public class DBClusterMember implements Serializable, Cloneable {

    /**
     * Specifies the instance identifier for this member of the DB cluster.
     */
    private String dBInstanceIdentifier;

    /**
     * Value that is <code>true</code> if the cluster member is the primary
     * instance for the DB cluster and <code>false</code> otherwise.
     */
    private Boolean isClusterWriter;

    /**
     * Specifies the status of the DB cluster parameter group for this member
     * of the DB cluster.
     */
    private String dBClusterParameterGroupStatus;

    /**
     * Specifies the instance identifier for this member of the DB cluster.
     *
     * @return Specifies the instance identifier for this member of the DB cluster.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Specifies the instance identifier for this member of the DB cluster.
     *
     * @param dBInstanceIdentifier Specifies the instance identifier for this member of the DB cluster.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Specifies the instance identifier for this member of the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Specifies the instance identifier for this member of the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterMember withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * Value that is <code>true</code> if the cluster member is the primary
     * instance for the DB cluster and <code>false</code> otherwise.
     *
     * @return Value that is <code>true</code> if the cluster member is the primary
     *         instance for the DB cluster and <code>false</code> otherwise.
     */
    public Boolean isClusterWriter() {
        return isClusterWriter;
    }
    
    /**
     * Value that is <code>true</code> if the cluster member is the primary
     * instance for the DB cluster and <code>false</code> otherwise.
     *
     * @param isClusterWriter Value that is <code>true</code> if the cluster member is the primary
     *         instance for the DB cluster and <code>false</code> otherwise.
     */
    public void setIsClusterWriter(Boolean isClusterWriter) {
        this.isClusterWriter = isClusterWriter;
    }
    
    /**
     * Value that is <code>true</code> if the cluster member is the primary
     * instance for the DB cluster and <code>false</code> otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isClusterWriter Value that is <code>true</code> if the cluster member is the primary
     *         instance for the DB cluster and <code>false</code> otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterMember withIsClusterWriter(Boolean isClusterWriter) {
        this.isClusterWriter = isClusterWriter;
        return this;
    }

    /**
     * Value that is <code>true</code> if the cluster member is the primary
     * instance for the DB cluster and <code>false</code> otherwise.
     *
     * @return Value that is <code>true</code> if the cluster member is the primary
     *         instance for the DB cluster and <code>false</code> otherwise.
     */
    public Boolean getIsClusterWriter() {
        return isClusterWriter;
    }

    /**
     * Specifies the status of the DB cluster parameter group for this member
     * of the DB cluster.
     *
     * @return Specifies the status of the DB cluster parameter group for this member
     *         of the DB cluster.
     */
    public String getDBClusterParameterGroupStatus() {
        return dBClusterParameterGroupStatus;
    }
    
    /**
     * Specifies the status of the DB cluster parameter group for this member
     * of the DB cluster.
     *
     * @param dBClusterParameterGroupStatus Specifies the status of the DB cluster parameter group for this member
     *         of the DB cluster.
     */
    public void setDBClusterParameterGroupStatus(String dBClusterParameterGroupStatus) {
        this.dBClusterParameterGroupStatus = dBClusterParameterGroupStatus;
    }
    
    /**
     * Specifies the status of the DB cluster parameter group for this member
     * of the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupStatus Specifies the status of the DB cluster parameter group for this member
     *         of the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterMember withDBClusterParameterGroupStatus(String dBClusterParameterGroupStatus) {
        this.dBClusterParameterGroupStatus = dBClusterParameterGroupStatus;
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
        if (isClusterWriter() != null) sb.append("IsClusterWriter: " + isClusterWriter() + ",");
        if (getDBClusterParameterGroupStatus() != null) sb.append("DBClusterParameterGroupStatus: " + getDBClusterParameterGroupStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isClusterWriter() == null) ? 0 : isClusterWriter().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterParameterGroupStatus() == null) ? 0 : getDBClusterParameterGroupStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBClusterMember == false) return false;
        DBClusterMember other = (DBClusterMember)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.isClusterWriter() == null ^ this.isClusterWriter() == null) return false;
        if (other.isClusterWriter() != null && other.isClusterWriter().equals(this.isClusterWriter()) == false) return false; 
        if (other.getDBClusterParameterGroupStatus() == null ^ this.getDBClusterParameterGroupStatus() == null) return false;
        if (other.getDBClusterParameterGroupStatus() != null && other.getDBClusterParameterGroupStatus().equals(this.getDBClusterParameterGroupStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public DBClusterMember clone() {
        try {
            return (DBClusterMember) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    