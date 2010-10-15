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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccessKey(UpdateAccessKeyRequest) UpdateAccessKey operation}.
 * <p>
 * Changes the status of the specified access key from Active to
 * Inactive, or vice versa. This action can be used to disable a User's
 * key as part of a key rotation workflow.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the UserName is
 * determined implicitly based on the AWS Access Key ID used to sign the
 * request. Because this action works for access keys under the AWS
 * Account, this API can be used to manage root credentials even if the
 * AWS Account has no associated Users.
 * </p>
 * <p>
 * For information about rotating keys, see <a
 * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
 * Managing Keys and Certificates </a> in <i>Using AWS Identity and
 * Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccessKey(UpdateAccessKeyRequest)
 */
public class UpdateAccessKeyRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The Access Key ID of the Secret Access Key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * The status you want to assign to the Secret Access Key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * Name of the User whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User whose key you want to update.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose key you want to update.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose key you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose key you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAccessKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The Access Key ID of the Secret Access Key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The Access Key ID of the Secret Access Key you want to update.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * The Access Key ID of the Secret Access Key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The Access Key ID of the Secret Access Key you want to update.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * The Access Key ID of the Secret Access Key you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The Access Key ID of the Secret Access Key you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAccessKeyRequest withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    
    /**
     * The status you want to assign to the Secret Access Key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status you want to assign to the Secret Access Key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @see statusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status you want to assign to the Secret Access Key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the Secret Access Key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @see statusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status you want to assign to the Secret Access Key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the Secret Access Key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see statusType
     */
    public UpdateAccessKeyRequest withStatus(String status) {
        this.status = status;
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
        sb.append("AccessKeyId: " + accessKeyId + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    