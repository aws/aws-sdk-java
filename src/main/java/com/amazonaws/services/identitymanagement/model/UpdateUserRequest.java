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
 * Updates the name and/or the path of the specified user.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You should understand the implications of changing a
 * user's path or name. For more information, see Renaming Users and
 * Groups in the AWS Identity and Access Management User Guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateUser(UpdateUserRequest)
 */
public class UpdateUserRequest extends AmazonWebServiceRequest {

    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * New path for the user. Include this only if you're changing the user's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * New name for the user. Include this only if you're changing the user's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String newUserName;

    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user to update. If you're changing the name of the user,
     *         this is the original name.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to update. If you're changing the name of the user,
     *         this is the original name.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user to update. If you're changing the name of the user,
     * this is the original name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to update. If you're changing the name of the user,
     *         this is the original name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * New path for the user. Include this only if you're changing the user's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return New path for the user. Include this only if you're changing the user's
     *         path.
     */
    public String getNewPath() {
        return newPath;
    }
    
    /**
     * New path for the user. Include this only if you're changing the user's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the user. Include this only if you're changing the user's
     *         path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }
    
    /**
     * New path for the user. Include this only if you're changing the user's
     * path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the user. Include this only if you're changing the user's
     *         path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateUserRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }
    
    
    /**
     * New name for the user. Include this only if you're changing the user's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return New name for the user. Include this only if you're changing the user's
     *         name.
     */
    public String getNewUserName() {
        return newUserName;
    }
    
    /**
     * New name for the user. Include this only if you're changing the user's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the user. Include this only if you're changing the user's
     *         name.
     */
    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }
    
    /**
     * New name for the user. Include this only if you're changing the user's
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newUserName New name for the user. Include this only if you're changing the user's
     *         name.
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
    