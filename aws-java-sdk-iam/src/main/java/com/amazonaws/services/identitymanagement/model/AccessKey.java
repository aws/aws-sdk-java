/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about an AWS access key.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> operations.
 * </p>
 * <note>
 * <p>
 * The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret
 * access key only when you first create an access key; you cannot recover the secret access key later. If you lose a
 * secret access key, you must create a new access key.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AccessKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessKey implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The ID for this access key.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The date when the access key was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * Default constructor for AccessKey object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public AccessKey() {
    }

    /**
     * Constructs a new AccessKey object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param userName
     *        The name of the IAM user that the access key is associated with.
     * @param accessKeyId
     *        The ID for this access key.
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @param secretAccessKey
     *        The secret key used to sign requests.
     */
    public AccessKey(String userName, String accessKeyId, String status, String secretAccessKey) {
        setUserName(userName);
        setAccessKeyId(accessKeyId);
        setStatus(status);
        setSecretAccessKey(secretAccessKey);
    }

    /**
     * Constructs a new AccessKey object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param userName
     *        The name of the IAM user that the access key is associated with.
     * @param accessKeyId
     *        The ID for this access key.
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @param secretAccessKey
     *        The secret key used to sign requests.
     */
    public AccessKey(String userName, String accessKeyId, StatusType status, String secretAccessKey) {
        setUserName(userName);
        setAccessKeyId(accessKeyId);
        setStatus(status.toString());
        setSecretAccessKey(secretAccessKey);
    }

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user that the access key is associated with.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * 
     * @return The name of the IAM user that the access key is associated with.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user that the access key is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * 
     * @param accessKeyId
     *        The ID for this access key.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * 
     * @return The ID for this access key.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * 
     * @param accessKeyId
     *        The ID for this access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @return The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *         <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public AccessKey withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key. <code>Active</code> means that the key is valid for API calls, while
     *        <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public AccessKey withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key used to sign requests.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @return The secret key used to sign requests.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key used to sign requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     * 
     * @param createDate
     *        The date when the access key was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     * 
     * @return The date when the access key was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     * 
     * @param createDate
     *        The date when the access key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKey == false)
            return false;
        AccessKey other = (AccessKey) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
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
    public AccessKey clone() {
        try {
            return (AccessKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
