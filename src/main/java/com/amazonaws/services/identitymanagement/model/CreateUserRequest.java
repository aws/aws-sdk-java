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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createUser(CreateUserRequest) CreateUser operation}.
 * <p>
 * Creates a new user for your account.
 * </p>
 * <p>
 * For information about limitations on the number of users you can
 * create, see Limitations on AWS IAM Entities in the <a
 * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
 * Management User Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createUser(CreateUserRequest)
 */
public class CreateUserRequest extends AmazonWebServiceRequest {

    /**
     * The user's path. For more information about paths, see Identifiers for
     * Users and Groups in the AWS AWS Identity and Access Management User
     * Guide. <p>This parameter is optional. If it is not included, it
     * defaults to /.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * Name of the user to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The user's path. For more information about paths, see Identifiers for
     * Users and Groups in the AWS AWS Identity and Access Management User
     * Guide. <p>This parameter is optional. If it is not included, it
     * defaults to /.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return The user's path. For more information about paths, see Identifiers for
     *         Users and Groups in the AWS AWS Identity and Access Management User
     *         Guide. <p>This parameter is optional. If it is not included, it
     *         defaults to /.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The user's path. For more information about paths, see Identifiers for
     * Users and Groups in the AWS AWS Identity and Access Management User
     * Guide. <p>This parameter is optional. If it is not included, it
     * defaults to /.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The user's path. For more information about paths, see Identifiers for
     *         Users and Groups in the AWS AWS Identity and Access Management User
     *         Guide. <p>This parameter is optional. If it is not included, it
     *         defaults to /.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The user's path. For more information about paths, see Identifiers for
     * Users and Groups in the AWS AWS Identity and Access Management User
     * Guide. <p>This parameter is optional. If it is not included, it
     * defaults to /.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The user's path. For more information about paths, see Identifiers for
     *         Users and Groups in the AWS AWS Identity and Access Management User
     *         Guide. <p>This parameter is optional. If it is not included, it
     *         defaults to /.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateUserRequest withPath(String path) {
        this.path = path;
        return this;
    }
    
    
    /**
     * Name of the user to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user to create.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to create.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to create.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateUserRequest withUserName(String userName) {
        this.userName = userName;
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
        sb.append("Path: " + path + ", ");
        sb.append("UserName: " + userName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    