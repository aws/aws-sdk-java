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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccessKey(UpdateAccessKeyRequest) UpdateAccessKey operation}.
 * <p>
 * Changes the status of the specified access key from Active to Inactive, or vice versa. This action can be used to disable a user's key as part of a
 * key rotation work flow.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS access key ID used to sign the request.
 * Because this action works for access keys under the AWS account, this API can be used to manage root credentials even if the AWS account has no
 * associated users.
 * </p>
 * <p>
 * For information about rotating keys, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html"> Managing Keys
 * and Certificates </a> in <i>Using AWS Identity and Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccessKey(UpdateAccessKeyRequest)
 */
public class UpdateAccessKeyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The access key ID of the secret access key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * Default constructor for a new UpdateAccessKeyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateAccessKeyRequest() {}
    
    /**
     * Constructs a new UpdateAccessKeyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accessKeyId The access key ID of the secret access key you want
     * to update.
     * @param status The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     */
    public UpdateAccessKeyRequest(String accessKeyId, String status) {
        setAccessKeyId(accessKeyId);
        setStatus(status);
    }

    /**
     * Constructs a new UpdateAccessKeyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accessKeyId The access key ID of the secret access key you want
     * to update.
     * @param status The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     */
    public UpdateAccessKeyRequest(String accessKeyId, StatusType status) {
        this.accessKeyId = accessKeyId;
        this.status = status.toString();
    }

    /**
     * Name of the user whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user whose key you want to update.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user whose key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose key you want to update.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user whose key you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose key you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccessKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The access key ID of the secret access key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The access key ID of the secret access key you want to update.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * The access key ID of the secret access key you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The access key ID of the secret access key you want to update.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * The access key ID of the secret access key you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The access key ID of the secret access key you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccessKeyRequest withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status you want to assign to the secret access key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the secret access key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the secret access key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StatusType
     */
    public UpdateAccessKeyRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the secret access key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }
    
    /**
     * The status you want to assign to the secret access key.
     * <code>Active</code> means the key can be used for API calls to AWS,
     * while <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the secret access key.
     *         <code>Active</code> means the key can be used for API calls to AWS,
     *         while <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StatusType
     */
    public UpdateAccessKeyRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getAccessKeyId() != null) sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAccessKeyRequest == false) return false;
        UpdateAccessKeyRequest other = (UpdateAccessKeyRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null) return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    