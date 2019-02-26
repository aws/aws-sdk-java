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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultipartUploadsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;
    /**
     * <p>
     * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List
     * Uploads operation returns up to 50 uploads.
     * </p>
     */
    private String limit;
    /**
     * <p>
     * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should
     * begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are
     * continuing the pagination of results started in a previous List Uploads request.
     * </p>
     */
    private String uploadIdMarker;

    /**
     * Default constructor for ListMultipartUploadsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ListMultipartUploadsRequest() {
    }

    /**
     * Constructs a new ListMultipartUploadsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     */
    public ListMultipartUploadsRequest(String vaultName) {
        setVaultName(vaultName);
    }

    /**
     * Constructs a new ListMultipartUploadsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     */
    public ListMultipartUploadsRequest(String accountId, String vaultName) {
        setAccountId(accountId);
        setVaultName(vaultName);
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *         specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *         uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *         ID, do not include any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     */

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @return The name of the vault.
     */

    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List
     * Uploads operation returns up to 50 uploads.
     * </p>
     * 
     * @param limit
     *        Specifies the maximum number of uploads returned in the response body. If this value is not specified, the
     *        List Uploads operation returns up to 50 uploads.
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List
     * Uploads operation returns up to 50 uploads.
     * </p>
     * 
     * @return Specifies the maximum number of uploads returned in the response body. If this value is not specified,
     *         the List Uploads operation returns up to 50 uploads.
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List
     * Uploads operation returns up to 50 uploads.
     * </p>
     * 
     * @param limit
     *        Specifies the maximum number of uploads returned in the response body. If this value is not specified, the
     *        List Uploads operation returns up to 50 uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsRequest withLimit(String limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should
     * begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are
     * continuing the pagination of results started in a previous List Uploads request.
     * </p>
     * 
     * @param uploadIdMarker
     *        An opaque string used for pagination. This value specifies the upload at which the listing of uploads
     *        should begin. Get the marker value from a previous List Uploads response. You need only include the marker
     *        if you are continuing the pagination of results started in a previous List Uploads request.
     */

    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should
     * begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are
     * continuing the pagination of results started in a previous List Uploads request.
     * </p>
     * 
     * @return An opaque string used for pagination. This value specifies the upload at which the listing of uploads
     *         should begin. Get the marker value from a previous List Uploads response. You need only include the
     *         marker if you are continuing the pagination of results started in a previous List Uploads request.
     */

    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should
     * begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are
     * continuing the pagination of results started in a previous List Uploads request.
     * </p>
     * 
     * @param uploadIdMarker
     *        An opaque string used for pagination. This value specifies the upload at which the listing of uploads
     *        should begin. Get the marker value from a previous List Uploads response. You need only include the marker
     *        if you are continuing the pagination of results started in a previous List Uploads request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsRequest withUploadIdMarker(String uploadIdMarker) {
        setUploadIdMarker(uploadIdMarker);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getVaultName() != null)
            sb.append("VaultName: ").append(getVaultName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getUploadIdMarker() != null)
            sb.append("UploadIdMarker: ").append(getUploadIdMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultipartUploadsRequest == false)
            return false;
        ListMultipartUploadsRequest other = (ListMultipartUploadsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getUploadIdMarker() == null ^ this.getUploadIdMarker() == null)
            return false;
        if (other.getUploadIdMarker() != null && other.getUploadIdMarker().equals(this.getUploadIdMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getUploadIdMarker() == null) ? 0 : getUploadIdMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListMultipartUploadsRequest clone() {
        return (ListMultipartUploadsRequest) super.clone();
    }

}
