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


/**
 * <p>
 * The AccessKey data type contains information about an AWS access key.
 * </p>
 * <p>
 * This data type is used as a response element in the actions CreateAccessKey and ListAccessKeys.
 * </p>
 */
public class AccessKey implements Serializable {

    /**
     * Name of the user the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
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
     * Default constructor for a new AccessKey object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AccessKey() {}
    
    /**
     * Constructs a new AccessKey object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user the key is associated with.
     * @param accessKeyId The ID for this access key.
     * @param status The status of the access key. <code>Active</code> means
     * the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * @param secretAccessKey The secret key used to sign requests.
     */
    public AccessKey(String userName, String accessKeyId, String status, String secretAccessKey) {
        setUserName(userName);
        setAccessKeyId(accessKeyId);
        setStatus(status);
        setSecretAccessKey(secretAccessKey);
    }

    /**
     * Constructs a new AccessKey object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user the key is associated with.
     * @param accessKeyId The ID for this access key.
     * @param status The status of the access key. <code>Active</code> means
     * the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * @param secretAccessKey The secret key used to sign requests.
     */
    public AccessKey(String userName, String accessKeyId, StatusType status, String secretAccessKey) {
        this.userName = userName;
        this.accessKeyId = accessKeyId;
        this.status = status.toString();
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * Name of the user the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user the key is associated with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user the key is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the key is associated with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user the key is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the key is associated with.
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
     * @see StatusType
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
     * @see StatusType
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
     * @see StatusType
     */
    public AccessKey withStatus(String status) {
        this.status = status;
        return this;
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
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
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
     * @see StatusType
     */
    public AccessKey withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getAccessKeyId() != null) sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSecretAccessKey() != null) sb.append("SecretAccessKey: " + getSecretAccessKey() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
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
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccessKey == false) return false;
        AccessKey other = (AccessKey)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null) return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null) return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
}
    