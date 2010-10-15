/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateUser(UpdateUserRequest) UpdateUser operation}.
 * <p>
 * Updates the name and/or the path of the specified User.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You should understand the implications of changing a
 * User's path or name. For more information, see Renaming Users and
 * Groups in Using AWS Identity and Access Management.
 * </p>
 * <p>
 * <b>NOTE:</b>To change a User name the requester must have appropriate
 * permissions on both the source object and the target object. For
 * example, to change Bob to Robert, the entity making the request must
 * have permission on Bob and Robert, or must have permission on all (*).
 * For more information about permissions, see Permissions and Policies.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateUser(UpdateUserRequest)
 */
public class UpdateUserRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User to update. If you're changing the name of the User,
     * this is the original User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * New path for the User. Include this parameter only if you're changing
     * the User's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * New name for the User. Include this parameter only if you're changing
     * the User's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String newUserName;

    /**
     * Name of the User to update. If you're changing the name of the User,
     * this is the original User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User to update. If you're changing the name of the User,
     *         this is the original User name.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User to update. If you're changing the name of the User,
     * this is the original User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to update. If you're changing the name of the User,
     *         this is the original User name.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User to update. If you're changing the name of the User,
     * this is the original User name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to update. If you're changing the name of the User,
     *         this is the original User name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * New path for the User. Include this parameter only if you're changing
     * the User's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return New path for the User. Include this parameter only if you're changing
     *         the User's path.
     */
    public String getNewPath() {
        return newPath;
    }
    
    /**
     * New path for the User. Include this parameter only if you're changing
     * the User's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the User. Include this parameter only if you're changing
     *         the User's path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }
    
    /**
     * New path for the User. Include this parameter only if you're changing
     * the User's path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the User. Include this parameter only if you're changing
     *         the User's path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateUserRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }
    
    
    /**
     * New name for the User. Include this parameter only if you're changing
     * the User's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return New name for the User. Include this parameter only if you're changing
     *         the User's name.
     */
    public String getNewUserName() {
        return newUserName;
    }
    
    /**
     * New name for the User. Include this parameter only if you're changing
     * the User's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the User. Include this parameter only if you're changing
     *         the User's name.
     */
    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }
    
    /**
     * New name for the User. Include this parameter only if you're changing
     * the User's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the User. Include this parameter only if you're changing
     *         the User's name.
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
        sb.append("UserName: " + userName + ", ");
        sb.append("NewPath: " + newPath + ", ");
        sb.append("NewUserName: " + newUserName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    