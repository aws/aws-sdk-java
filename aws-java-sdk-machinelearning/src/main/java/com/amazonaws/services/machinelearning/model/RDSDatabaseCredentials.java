/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * The database credentials to connect to a database on an RDS DB
 * instance.
 * </p>
 */
public class RDSDatabaseCredentials implements Serializable, Cloneable {

    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String username;

    /**
     * The password to be used by Amazon ML to connect to a database on an
     * RDS DB instance. The password should have sufficient permissions to
     * execute the <code>RDSSelectQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 128<br/>
     */
    private String password;

    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param username The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The username to be used by Amazon ML to connect to database on an
     * Amazon RDS instance. The username should have sufficient permissions
     * to execute an <code>RDSSelectSqlQuery</code> query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param username The username to be used by Amazon ML to connect to database on an
     *         Amazon RDS instance. The username should have sufficient permissions
     *         to execute an <code>RDSSelectSqlQuery</code> query.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDatabaseCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The password to be used by Amazon ML to connect to a database on an
     * RDS DB instance. The password should have sufficient permissions to
     * execute the <code>RDSSelectQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 128<br/>
     *
     * @return The password to be used by Amazon ML to connect to a database on an
     *         RDS DB instance. The password should have sufficient permissions to
     *         execute the <code>RDSSelectQuery</code> query.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The password to be used by Amazon ML to connect to a database on an
     * RDS DB instance. The password should have sufficient permissions to
     * execute the <code>RDSSelectQuery</code> query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 128<br/>
     *
     * @param password The password to be used by Amazon ML to connect to a database on an
     *         RDS DB instance. The password should have sufficient permissions to
     *         execute the <code>RDSSelectQuery</code> query.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The password to be used by Amazon ML to connect to a database on an
     * RDS DB instance. The password should have sufficient permissions to
     * execute the <code>RDSSelectQuery</code> query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 128<br/>
     *
     * @param password The password to be used by Amazon ML to connect to a database on an
     *         RDS DB instance. The password should have sufficient permissions to
     *         execute the <code>RDSSelectQuery</code> query.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDatabaseCredentials withPassword(String password) {
        this.password = password;
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
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RDSDatabaseCredentials == false) return false;
        RDSDatabaseCredentials other = (RDSDatabaseCredentials)obj;
        
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        return true;
    }
    
    @Override
    public RDSDatabaseCredentials clone() {
        try {
            return (RDSDatabaseCredentials) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    