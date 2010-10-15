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

/**
 * <p>
 * The AccessKey data type contains information about an AWS access key.
 * </p>
 * <p>
 * This data type is used as a response element in the actions
 * CreateAccessKey and ListAccessKeys.
 * </p>
 */
public class AccessKey {

    /**
     * Name of the User the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The ID for this access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * The status of the access key. <code>Active</code> means the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * The secret key used to sign requests.
     */
    private String secretAccessKey;

    /**
     * The date when the access key was created.
     */
    private java.util.Date createDate;

    /**
     * Name of the User the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User the key is associated with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the key is associated with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User the key is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the key is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AccessKey withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The ID for this access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The ID for this access key.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * The ID for this access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The ID for this access key.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * The ID for this access key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The ID for this access key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AccessKey withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    
    /**
     * The status of the access key. <code>Active</code> means the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status of the access key. <code>Active</code> means the key is
     *         valid for API calls, while <code>Inactive</code> means it is not.
     *
     * @see statusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the access key. <code>Active</code> means the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the access key. <code>Active</code> means the key is
     *         valid for API calls, while <code>Inactive</code> means it is not.
     *
     * @see statusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the access key. <code>Active</code> means the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the access key. <code>Active</code> means the key is
     *         valid for API calls, while <code>Inactive</code> means it is not.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see statusType
     */
    public AccessKey withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * The secret key used to sign requests.
     *
     * @return The secret key used to sign requests.
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }
    
    /**
     * The secret key used to sign requests.
     *
     * @param secretAccessKey The secret key used to sign requests.
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }
    
    /**
     * The secret key used to sign requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretAccessKey The secret key used to sign requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AccessKey withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
    
    /**
     * The date when the access key was created.
     *
     * @return The date when the access key was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date when the access key was created.
     *
     * @param createDate The date when the access key was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date when the access key was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date when the access key was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AccessKey withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        sb.append("SecretAccessKey: " + secretAccessKey + ", ");
        sb.append("CreateDate: " + createDate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    