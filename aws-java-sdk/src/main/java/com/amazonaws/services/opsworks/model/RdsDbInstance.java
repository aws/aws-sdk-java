/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon RDS instance.
 * </p>
 */
public class RdsDbInstance implements Serializable {

    /**
     * The instance's ARN.
     */
    private String rdsDbInstanceArn;

    /**
     * The DB instance identifier.
     */
    private String dbInstanceIdentifier;

    /**
     * The master user name.
     */
    private String dbUser;

    /**
     * The database password.
     */
    private String dbPassword;

    /**
     * The instance's AWS region.
     */
    private String region;

    /**
     * The instance's address.
     */
    private String address;

    /**
     * The instance's database engine.
     */
    private String engine;

    /**
     * The ID of the stack that the instance is registered with.
     */
    private String stackId;

    /**
     * Set to <code>true</code> if AWS OpsWorks was unable to discover the
     * Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     * only once. If this value is set to <code>true</code>, you must
     * deregister the instance and then register it again.
     */
    private Boolean missingOnRds;

    /**
     * The instance's ARN.
     *
     * @return The instance's ARN.
     */
    public String getRdsDbInstanceArn() {
        return rdsDbInstanceArn;
    }
    
    /**
     * The instance's ARN.
     *
     * @param rdsDbInstanceArn The instance's ARN.
     */
    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }
    
    /**
     * The instance's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArn The instance's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
        return this;
    }

    /**
     * The DB instance identifier.
     *
     * @return The DB instance identifier.
     */
    public String getDbInstanceIdentifier() {
        return dbInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier.
     *
     * @param dbInstanceIdentifier The DB instance identifier.
     */
    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbInstanceIdentifier The DB instance identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        return this;
    }

    /**
     * The master user name.
     *
     * @return The master user name.
     */
    public String getDbUser() {
        return dbUser;
    }
    
    /**
     * The master user name.
     *
     * @param dbUser The master user name.
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }
    
    /**
     * The master user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbUser The master user name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * The database password.
     *
     * @return The database password.
     */
    public String getDbPassword() {
        return dbPassword;
    }
    
    /**
     * The database password.
     *
     * @param dbPassword The database password.
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    
    /**
     * The database password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbPassword The database password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * The instance's AWS region.
     *
     * @return The instance's AWS region.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The instance's AWS region.
     *
     * @param region The instance's AWS region.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The instance's AWS region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The instance's AWS region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * The instance's address.
     *
     * @return The instance's address.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * The instance's address.
     *
     * @param address The instance's address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * The instance's address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param address The instance's address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * The instance's database engine.
     *
     * @return The instance's database engine.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The instance's database engine.
     *
     * @param engine The instance's database engine.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The instance's database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The instance's database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The ID of the stack that the instance is registered with.
     *
     * @return The ID of the stack that the instance is registered with.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The ID of the stack that the instance is registered with.
     *
     * @param stackId The ID of the stack that the instance is registered with.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The ID of the stack that the instance is registered with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The ID of the stack that the instance is registered with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * Set to <code>true</code> if AWS OpsWorks was unable to discover the
     * Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     * only once. If this value is set to <code>true</code>, you must
     * deregister the instance and then register it again.
     *
     * @return Set to <code>true</code> if AWS OpsWorks was unable to discover the
     *         Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     *         only once. If this value is set to <code>true</code>, you must
     *         deregister the instance and then register it again.
     */
    public Boolean isMissingOnRds() {
        return missingOnRds;
    }
    
    /**
     * Set to <code>true</code> if AWS OpsWorks was unable to discover the
     * Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     * only once. If this value is set to <code>true</code>, you must
     * deregister the instance and then register it again.
     *
     * @param missingOnRds Set to <code>true</code> if AWS OpsWorks was unable to discover the
     *         Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     *         only once. If this value is set to <code>true</code>, you must
     *         deregister the instance and then register it again.
     */
    public void setMissingOnRds(Boolean missingOnRds) {
        this.missingOnRds = missingOnRds;
    }
    
    /**
     * Set to <code>true</code> if AWS OpsWorks was unable to discover the
     * Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     * only once. If this value is set to <code>true</code>, you must
     * deregister the instance and then register it again.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param missingOnRds Set to <code>true</code> if AWS OpsWorks was unable to discover the
     *         Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     *         only once. If this value is set to <code>true</code>, you must
     *         deregister the instance and then register it again.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RdsDbInstance withMissingOnRds(Boolean missingOnRds) {
        this.missingOnRds = missingOnRds;
        return this;
    }

    /**
     * Set to <code>true</code> if AWS OpsWorks was unable to discover the
     * Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     * only once. If this value is set to <code>true</code>, you must
     * deregister the instance and then register it again.
     *
     * @return Set to <code>true</code> if AWS OpsWorks was unable to discover the
     *         Amazon RDS instance. AWS OpsWorks attempts to discover the instance
     *         only once. If this value is set to <code>true</code>, you must
     *         deregister the instance and then register it again.
     */
    public Boolean getMissingOnRds() {
        return missingOnRds;
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
        if (getRdsDbInstanceArn() != null) sb.append("RdsDbInstanceArn: " + getRdsDbInstanceArn() + ",");
        if (getDbInstanceIdentifier() != null) sb.append("DbInstanceIdentifier: " + getDbInstanceIdentifier() + ",");
        if (getDbUser() != null) sb.append("DbUser: " + getDbUser() + ",");
        if (getDbPassword() != null) sb.append("DbPassword: " + getDbPassword() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getAddress() != null) sb.append("Address: " + getAddress() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (isMissingOnRds() != null) sb.append("MissingOnRds: " + isMissingOnRds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode()); 
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode()); 
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((isMissingOnRds() == null) ? 0 : isMissingOnRds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RdsDbInstance == false) return false;
        RdsDbInstance other = (RdsDbInstance)obj;
        
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null) return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false) return false; 
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null) return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false) return false; 
        if (other.getDbUser() == null ^ this.getDbUser() == null) return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false) return false; 
        if (other.getDbPassword() == null ^ this.getDbPassword() == null) return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getAddress() == null ^ this.getAddress() == null) return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.isMissingOnRds() == null ^ this.isMissingOnRds() == null) return false;
        if (other.isMissingOnRds() != null && other.isMissingOnRds().equals(this.isMissingOnRds()) == false) return false; 
        return true;
    }
    
}
    