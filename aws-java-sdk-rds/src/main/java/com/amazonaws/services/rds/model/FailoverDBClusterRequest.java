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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#failoverDBCluster(FailoverDBClusterRequest) FailoverDBCluster operation}.
 * <p>
 * Forces a failover for a DB cluster.
 * </p>
 * <p>
 * A failover for a DB cluster promotes one of the read-only instances in
 * the DB cluster to the master DB instance (the cluster writer) and
 * deletes the current primary instance.
 * </p>
 * <p>
 * Amazon Aurora will automatically fail over to a read-only instance, if
 * one exists, when the primary instance fails. You can force a failover
 * when you want to simulate a failure of a DB instance for testing.
 * Because each instance in a DB cluster has its own endpoint address,
 * you will need to clean up and re-establish any existing connections
 * that use those endpoint addresses when the failover is complete.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#failoverDBCluster(FailoverDBClusterRequest)
 */
public class FailoverDBClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBClusterIdentifier;

    /**
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return A DB cluster identifier to force a failover for. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBClusterIdentifier A DB cluster identifier to force a failover for. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier A DB cluster identifier to force a failover for. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailoverDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
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
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FailoverDBClusterRequest == false) return false;
        FailoverDBClusterRequest other = (FailoverDBClusterRequest)obj;
        
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        return true;
    }
    
    @Override
    public FailoverDBClusterRequest clone() {
        
            return (FailoverDBClusterRequest) super.clone();
    }

}
    