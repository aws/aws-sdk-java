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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#registerRdsDbInstance(RegisterRdsDbInstanceRequest) RegisterRdsDbInstance operation}.
 * <p>
 * Registers an Amazon RDS instance with a stack.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#registerRdsDbInstance(RegisterRdsDbInstanceRequest)
 */
public class RegisterRdsDbInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The Amazon RDS instance's ARN.
     */
    private String rdsDbInstanceArn;

    /**
     * The database's master user name.
     */
    private String dbUser;

    /**
     * The database password.
     */
    private String dbPassword;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterRdsDbInstanceRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The Amazon RDS instance's ARN.
     *
     * @return The Amazon RDS instance's ARN.
     */
    public String getRdsDbInstanceArn() {
        return rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     */
    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterRdsDbInstanceRequest withRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
        return this;
    }

    /**
     * The database's master user name.
     *
     * @return The database's master user name.
     */
    public String getDbUser() {
        return dbUser;
    }
    
    /**
     * The database's master user name.
     *
     * @param dbUser The database's master user name.
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }
    
    /**
     * The database's master user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbUser The database's master user name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterRdsDbInstanceRequest withDbUser(String dbUser) {
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
    public RegisterRdsDbInstanceRequest withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getRdsDbInstanceArn() != null) sb.append("RdsDbInstanceArn: " + getRdsDbInstanceArn() + ",");
        if (getDbUser() != null) sb.append("DbUser: " + getDbUser() + ",");
        if (getDbPassword() != null) sb.append("DbPassword: " + getDbPassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode()); 
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode()); 
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterRdsDbInstanceRequest == false) return false;
        RegisterRdsDbInstanceRequest other = (RegisterRdsDbInstanceRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null) return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false) return false; 
        if (other.getDbUser() == null ^ this.getDbUser() == null) return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false) return false; 
        if (other.getDbPassword() == null ^ this.getDbPassword() == null) return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false) return false; 
        return true;
    }
    
}
    