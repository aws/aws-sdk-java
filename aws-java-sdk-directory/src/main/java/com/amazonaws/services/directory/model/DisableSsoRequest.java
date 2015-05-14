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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#disableSso(DisableSsoRequest) DisableSso operation}.
 * <p>
 * Disables single-sign on for a directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#disableSso(DisableSsoRequest)
 */
public class DisableSsoRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to disable single-sign on for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The username of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to remove a service principle name. <p>If the AD Connector
     * service account does not have privileges to remove a service principle
     * name, you can specify an alternate account with the <i>UserName</i>
     * and <i>Password</i> parameters. These credentials are only used to
     * disable single sign-on and are not stored by the service. The AD
     * Connector service account is not changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     */
    private String userName;

    /**
     * The password of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. See the
     * <i>UserName</i> parameter for more information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String password;

    /**
     * The identifier of the directory to disable single-sign on for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to disable single-sign on for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to disable single-sign on for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to disable single-sign on for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to disable single-sign on for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to disable single-sign on for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DisableSsoRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The username of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to remove a service principle name. <p>If the AD Connector
     * service account does not have privileges to remove a service principle
     * name, you can specify an alternate account with the <i>UserName</i>
     * and <i>Password</i> parameters. These credentials are only used to
     * disable single sign-on and are not stored by the service. The AD
     * Connector service account is not changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @return The username of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. This account must have
     *         privileges to remove a service principle name. <p>If the AD Connector
     *         service account does not have privileges to remove a service principle
     *         name, you can specify an alternate account with the <i>UserName</i>
     *         and <i>Password</i> parameters. These credentials are only used to
     *         disable single sign-on and are not stored by the service. The AD
     *         Connector service account is not changed.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The username of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to remove a service principle name. <p>If the AD Connector
     * service account does not have privileges to remove a service principle
     * name, you can specify an alternate account with the <i>UserName</i>
     * and <i>Password</i> parameters. These credentials are only used to
     * disable single sign-on and are not stored by the service. The AD
     * Connector service account is not changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param userName The username of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. This account must have
     *         privileges to remove a service principle name. <p>If the AD Connector
     *         service account does not have privileges to remove a service principle
     *         name, you can specify an alternate account with the <i>UserName</i>
     *         and <i>Password</i> parameters. These credentials are only used to
     *         disable single sign-on and are not stored by the service. The AD
     *         Connector service account is not changed.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The username of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to remove a service principle name. <p>If the AD Connector
     * service account does not have privileges to remove a service principle
     * name, you can specify an alternate account with the <i>UserName</i>
     * and <i>Password</i> parameters. These credentials are only used to
     * disable single sign-on and are not stored by the service. The AD
     * Connector service account is not changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param userName The username of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. This account must have
     *         privileges to remove a service principle name. <p>If the AD Connector
     *         service account does not have privileges to remove a service principle
     *         name, you can specify an alternate account with the <i>UserName</i>
     *         and <i>Password</i> parameters. These credentials are only used to
     *         disable single sign-on and are not stored by the service. The AD
     *         Connector service account is not changed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DisableSsoRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The password of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. See the
     * <i>UserName</i> parameter for more information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The password of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. See the
     *         <i>UserName</i> parameter for more information.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The password of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. See the
     * <i>UserName</i> parameter for more information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param password The password of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. See the
     *         <i>UserName</i> parameter for more information.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The password of an alternate account to use to disable single-sign on.
     * This is only used for AD Connector directories. See the
     * <i>UserName</i> parameter for more information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param password The password of an alternate account to use to disable single-sign on.
     *         This is only used for AD Connector directories. See the
     *         <i>UserName</i> parameter for more information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DisableSsoRequest withPassword(String password) {
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
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisableSsoRequest == false) return false;
        DisableSsoRequest other = (DisableSsoRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        return true;
    }
    
    @Override
    public DisableSsoRequest clone() {
        
            return (DisableSsoRequest) super.clone();
    }

}
    