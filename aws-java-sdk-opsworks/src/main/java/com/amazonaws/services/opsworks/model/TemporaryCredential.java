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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the data needed by RDP clients such as the Microsoft Remote
 * Desktop Connection to log in to the instance.
 * </p>
 */
public class TemporaryCredential implements Serializable, Cloneable {

    /**
     * The user name.
     */
    private String username;

    /**
     * The password.
     */
    private String password;

    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires, at the end of this period, the user will no longer be
     * able to use the credentials to log in. If they are logged in at the
     * time, they will be automatically logged out.
     */
    private Integer validForInMinutes;

    /**
     * The instance's AWS OpsWorks ID.
     */
    private String instanceId;

    /**
     * The user name.
     *
     * @return The user name.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name.
     *
     * @param username The user name.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param username The user name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TemporaryCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The password.
     *
     * @return The password.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The password.
     *
     * @param password The password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param password The password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TemporaryCredential withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires, at the end of this period, the user will no longer be
     * able to use the credentials to log in. If they are logged in at the
     * time, they will be automatically logged out.
     *
     * @return The length of time (in minutes) that the grant is valid. When the
     *         grant expires, at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If they are logged in at the
     *         time, they will be automatically logged out.
     */
    public Integer getValidForInMinutes() {
        return validForInMinutes;
    }
    
    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires, at the end of this period, the user will no longer be
     * able to use the credentials to log in. If they are logged in at the
     * time, they will be automatically logged out.
     *
     * @param validForInMinutes The length of time (in minutes) that the grant is valid. When the
     *         grant expires, at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If they are logged in at the
     *         time, they will be automatically logged out.
     */
    public void setValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
    }
    
    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires, at the end of this period, the user will no longer be
     * able to use the credentials to log in. If they are logged in at the
     * time, they will be automatically logged out.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validForInMinutes The length of time (in minutes) that the grant is valid. When the
     *         grant expires, at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If they are logged in at the
     *         time, they will be automatically logged out.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TemporaryCredential withValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
        return this;
    }

    /**
     * The instance's AWS OpsWorks ID.
     *
     * @return The instance's AWS OpsWorks ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance's AWS OpsWorks ID.
     *
     * @param instanceId The instance's AWS OpsWorks ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance's AWS OpsWorks ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance's AWS OpsWorks ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TemporaryCredential withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (getValidForInMinutes() != null) sb.append("ValidForInMinutes: " + getValidForInMinutes() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((getValidForInMinutes() == null) ? 0 : getValidForInMinutes().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TemporaryCredential == false) return false;
        TemporaryCredential other = (TemporaryCredential)obj;
        
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getValidForInMinutes() == null ^ this.getValidForInMinutes() == null) return false;
        if (other.getValidForInMinutes() != null && other.getValidForInMinutes().equals(this.getValidForInMinutes()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
    @Override
    public TemporaryCredential clone() {
        try {
            return (TemporaryCredential) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    