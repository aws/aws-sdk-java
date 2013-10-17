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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateUser(UpdateUserRequest) UpdateUser operation}.
 * <p>
 * Updates the name and/or the path of the specified user.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You should understand the implications of changing a user's path or name. For more information, see Renaming Users and Groups in
 * Using AWS Identity and Access Management.
 * </p>
 * <p>
 * <b>NOTE:</b>To change a user name the requester must have appropriate permissions on both the source object and the target object. For example, to
 * change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information
 * about permissions, see Permissions and Policies.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateUser(UpdateUserRequest)
 */
public class UpdateUserRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original user name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * New path for the user. Include this parameter only if you're changing
     * the user's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * New name for the user. Include this parameter only if you're changing
     * the user's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String newUserName;

    /**
     * Default constructor for a new UpdateUserRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateUserRequest() {}
    
    /**
     * Constructs a new UpdateUserRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user to update. If you're changing the
     * name of the user, this is the original user name.
     */
    public UpdateUserRequest(String userName) {
        setUserName(userName);
    }

    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original user name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user to update. If you're changing the name of the user,
     *         this is the original user name.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original user name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to update. If you're changing the name of the user,
     *         this is the original user name.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to update. If you're changing the name of the user,
     *         this is the original user name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * New path for the user. Include this parameter only if you're changing
     * the user's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return New path for the user. Include this parameter only if you're changing
     *         the user's path.
     */
    public String getNewPath() {
        return newPath;
    }
    
    /**
     * New path for the user. Include this parameter only if you're changing
     * the user's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the user. Include this parameter only if you're changing
     *         the user's path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }
    
    /**
     * New path for the user. Include this parameter only if you're changing
     * the user's path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the user. Include this parameter only if you're changing
     *         the user's path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateUserRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * New name for the user. Include this parameter only if you're changing
     * the user's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return New name for the user. Include this parameter only if you're changing
     *         the user's name.
     */
    public String getNewUserName() {
        return newUserName;
    }
    
    /**
     * New name for the user. Include this parameter only if you're changing
     * the user's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the user. Include this parameter only if you're changing
     *         the user's name.
     */
    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }
    
    /**
     * New name for the user. Include this parameter only if you're changing
     * the user's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the user. Include this parameter only if you're changing
     *         the user's name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateUserRequest withNewUserName(String newUserName) {
        this.newUserName = newUserName;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getNewPath() != null) sb.append("NewPath: " + getNewPath() + ",");
        if (getNewUserName() != null) sb.append("NewUserName: " + getNewUserName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode()); 
        hashCode = prime * hashCode + ((getNewUserName() == null) ? 0 : getNewUserName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateUserRequest == false) return false;
        UpdateUserRequest other = (UpdateUserRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getNewPath() == null ^ this.getNewPath() == null) return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false) return false; 
        if (other.getNewUserName() == null ^ this.getNewUserName() == null) return false;
        if (other.getNewUserName() != null && other.getNewUserName().equals(this.getNewUserName()) == false) return false; 
        return true;
    }
    
}
    