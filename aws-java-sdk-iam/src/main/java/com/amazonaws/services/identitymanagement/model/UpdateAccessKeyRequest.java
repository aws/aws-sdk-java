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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateAccessKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     */
    private String status;

    /**
     * Default constructor for UpdateAccessKeyRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public UpdateAccessKeyRequest() {
    }

    /**
     * Constructs a new UpdateAccessKeyRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     */
    public UpdateAccessKeyRequest(String accessKeyId, String status) {
        setAccessKeyId(accessKeyId);
        setStatus(status);
    }

    /**
     * Constructs a new UpdateAccessKeyRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     */
    public UpdateAccessKeyRequest(String accessKeyId, StatusType status) {
        setAccessKeyId(accessKeyId);
        setStatus(status.toString());
    }

    /**
     * Constructs a new UpdateAccessKeyRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param userName
     *        The name of the user whose key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     */
    public UpdateAccessKeyRequest(String userName, String accessKeyId, String status) {
        setUserName(userName);
        setAccessKeyId(accessKeyId);
        setStatus(status);
    }

    /**
     * Constructs a new UpdateAccessKeyRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param userName
     *        The name of the user whose key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     */
    public UpdateAccessKeyRequest(String userName, String accessKeyId, StatusType status) {
        setUserName(userName);
        setAccessKeyId(accessKeyId);
        setStatus(status.toString());
    }

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the user whose key you want to update.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessKeyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @return The access key ID of the secret access key you want to update.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that can consist of any upper or lowercased letter or digit.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID of the secret access key you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessKeyRequest withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @return The status you want to assign to the secret access key. <code>Active</code> means that the key can be
     *         used for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateAccessKeyRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for
     * API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the secret access key. <code>Active</code> means that the key can be used
     *        for API calls to AWS, while <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateAccessKeyRequest withStatus(StatusType status) {
        this.status = status.toString();
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessKeyRequest == false)
            return false;
        UpdateAccessKeyRequest other = (UpdateAccessKeyRequest) obj;
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
        return true;
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
    public UpdateAccessKeyRequest clone() {
        return (UpdateAccessKeyRequest) super.clone();
    }

}
