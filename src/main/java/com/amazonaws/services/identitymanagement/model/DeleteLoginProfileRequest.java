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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteLoginProfile(DeleteLoginProfileRequest) DeleteLoginProfile operation}.
 * <p>
 * Deletes the login profile for the specified User, which terminates the
 * User's ability to access AWS services through the IAM login page.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Deleting a User's login profile does not prevent a
 * User from accessing IAM through the command line interface or the API.
 * To prevent all User access you must also either make the access key
 * inactive or delete it. For more information about making keys
 * inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.
 * </p>
 * <p>
 * <b>NOTE:</b>In the full release you will be able to use IAM to access
 * your services through the AWS Management Console. Although this
 * feature is not currently available, you can create login profiles for
 * your Users now. Then, when this feature is implemented, your Users can
 * use IAM to access your services through the AWS Management Console.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteLoginProfile(DeleteLoginProfileRequest)
 */
public class DeleteLoginProfileRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User whose login profile you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Name of the User whose login profile you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User whose login profile you want to delete.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User whose login profile you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose login profile you want to delete.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose login profile you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose login profile you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteLoginProfileRequest withUserName(String userName) {
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
        sb.append("UserName: " + userName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    