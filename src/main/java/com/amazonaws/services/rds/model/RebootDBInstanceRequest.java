/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#rebootDBInstance(RebootDBInstanceRequest) RebootDBInstance operation}.
 * <p>
 * Rebooting a DB instance restarts the database engine service. A reboot also applies to the DB instance any modifications to the associated DB
 * parameter group that were pending. Rebooting a DB instance results in a momentary outage of the instance, during which the DB instance status is set
 * to rebooting. If the RDS instance is configured for MultiAZ, it is possible that the reboot will be conducted through a failover. An Amazon RDS event
 * is created when the reboot is completed.
 * </p>
 * <p>
 * If your DB instance is deployed in multiple Availability Zones, you can force a failover from one AZ to the other during the reboot. You might force
 * a failover to test the availability of your DB instance deployment or to restore operations to the original AZ after a failover occurs.
 * </p>
 * <p>
 * The time required to reboot is a function of the specific database engine's crash recovery process. To improve the reboot time, we recommend that you
 * reduce database activities as much as possible during the reboot process to reduce rollback activity for in-transit transactions.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#rebootDBInstance(RebootDBInstanceRequest)
 */
public class RebootDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * When <code>true</code>, the reboot will be conducted through a MultiAZ
     * failover. <p>Constraint: You cannot specify <code>true</code> if the
     * instance is not configured for MultiAZ.
     */
    private Boolean forceFailover;

    /**
     * Default constructor for a new RebootDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RebootDBInstanceRequest() {}
    
    /**
     * Constructs a new RebootDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier. This parameter
     * is stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    public RebootDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RebootDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * When <code>true</code>, the reboot will be conducted through a MultiAZ
     * failover. <p>Constraint: You cannot specify <code>true</code> if the
     * instance is not configured for MultiAZ.
     *
     * @return When <code>true</code>, the reboot will be conducted through a MultiAZ
     *         failover. <p>Constraint: You cannot specify <code>true</code> if the
     *         instance is not configured for MultiAZ.
     */
    public Boolean isForceFailover() {
        return forceFailover;
    }
    
    /**
     * When <code>true</code>, the reboot will be conducted through a MultiAZ
     * failover. <p>Constraint: You cannot specify <code>true</code> if the
     * instance is not configured for MultiAZ.
     *
     * @param forceFailover When <code>true</code>, the reboot will be conducted through a MultiAZ
     *         failover. <p>Constraint: You cannot specify <code>true</code> if the
     *         instance is not configured for MultiAZ.
     */
    public void setForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
    }
    
    /**
     * When <code>true</code>, the reboot will be conducted through a MultiAZ
     * failover. <p>Constraint: You cannot specify <code>true</code> if the
     * instance is not configured for MultiAZ.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forceFailover When <code>true</code>, the reboot will be conducted through a MultiAZ
     *         failover. <p>Constraint: You cannot specify <code>true</code> if the
     *         instance is not configured for MultiAZ.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RebootDBInstanceRequest withForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
        return this;
    }

    /**
     * When <code>true</code>, the reboot will be conducted through a MultiAZ
     * failover. <p>Constraint: You cannot specify <code>true</code> if the
     * instance is not configured for MultiAZ.
     *
     * @return When <code>true</code>, the reboot will be conducted through a MultiAZ
     *         failover. <p>Constraint: You cannot specify <code>true</code> if the
     *         instance is not configured for MultiAZ.
     */
    public Boolean getForceFailover() {
        return forceFailover;
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
        if (isForceFailover() != null) sb.append("ForceFailover: " + isForceFailover() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isForceFailover() == null) ? 0 : isForceFailover().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebootDBInstanceRequest == false) return false;
        RebootDBInstanceRequest other = (RebootDBInstanceRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.isForceFailover() == null ^ this.isForceFailover() == null) return false;
        if (other.isForceFailover() != null && other.isForceFailover().equals(this.isForceFailover()) == false) return false; 
        return true;
    }
    
}
    