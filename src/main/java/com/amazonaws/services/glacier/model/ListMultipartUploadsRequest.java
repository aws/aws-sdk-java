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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#listMultipartUploads(ListMultipartUploadsRequest) ListMultipartUploads operation}.
 * <p>
 * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a multipart upload that has been
 * initiated by an InitiateMultipartUpload request, but has not yet been completed or aborted. The list returned in the List Multipart Upload response
 * has no guaranteed order.
 * </p>
 * <p>
 * The List Multipart Uploads operation supports pagination. By default, this operation returns up to 1,000 multipart uploads in the response. You should
 * always check the response for a <code>marker</code> at which to continue the list; if there are no more items the <code>marker</code> is
 * <code>null</code> .
 * To return a list of multipart uploads that begins at a specific upload, set the <code>marker</code> request parameter to the value you obtained
 * from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response by specifying the <code>limit</code>
 * parameter in the request.
 * </p>
 * <p>
 * Note the difference between this operation and listing parts (ListParts). The List Multipart Uploads operation lists all multipart uploads for a vault
 * and does not require a multipart upload ID. The List Parts operation requires a multipart upload ID since parts are associated with a single upload.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and the underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/working-with-archives.html"> Working with Archives in Amazon Glacier </a> and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-multipart-list-uploads.html"> List Multipart Uploads </a> in the <i>Amazon
 * Glacier Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#listMultipartUploads(ListMultipartUploadsRequest)
 */
public class ListMultipartUploadsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * An opaque string used for pagination. This value specifies the upload
     * at which the listing of uploads should begin. Get the marker value
     * from a previous List Uploads response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Uploads request.
     */
    private String uploadIdMarker;

    /**
     * Specifies the maximum number of uploads returned in the response body.
     * If this value is not specified, the List Uploads operation returns up
     * to 1,000 uploads.
     */
    private String limit;

    /**
     * Default constructor for a new ListMultipartUploadsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListMultipartUploadsRequest() {}
    
    /**
     * Constructs a new ListMultipartUploadsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     */
    public ListMultipartUploadsRequest(String vaultName) {
        setVaultName(vaultName);
    }

    /**
     * Constructs a new ListMultipartUploadsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     */
    public ListMultipartUploadsRequest(String accountId, String vaultName) {
        setAccountId(accountId);
        setVaultName(vaultName);
    }

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @return The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The name of the vault.
     *
     * @return The name of the vault.
     */
    public String getVaultName() {
        return vaultName;
    }
    
    /**
     * The name of the vault.
     *
     * @param vaultName The name of the vault.
     */
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }
    
    /**
     * The name of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultName The name of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * An opaque string used for pagination. This value specifies the upload
     * at which the listing of uploads should begin. Get the marker value
     * from a previous List Uploads response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Uploads request.
     *
     * @return An opaque string used for pagination. This value specifies the upload
     *         at which the listing of uploads should begin. Get the marker value
     *         from a previous List Uploads response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Uploads request.
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the upload
     * at which the listing of uploads should begin. Get the marker value
     * from a previous List Uploads response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Uploads request.
     *
     * @param uploadIdMarker An opaque string used for pagination. This value specifies the upload
     *         at which the listing of uploads should begin. Get the marker value
     *         from a previous List Uploads response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Uploads request.
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the upload
     * at which the listing of uploads should begin. Get the marker value
     * from a previous List Uploads response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Uploads request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadIdMarker An opaque string used for pagination. This value specifies the upload
     *         at which the listing of uploads should begin. Get the marker value
     *         from a previous List Uploads response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Uploads request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsRequest withUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }

    /**
     * Specifies the maximum number of uploads returned in the response body.
     * If this value is not specified, the List Uploads operation returns up
     * to 1,000 uploads.
     *
     * @return Specifies the maximum number of uploads returned in the response body.
     *         If this value is not specified, the List Uploads operation returns up
     *         to 1,000 uploads.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * Specifies the maximum number of uploads returned in the response body.
     * If this value is not specified, the List Uploads operation returns up
     * to 1,000 uploads.
     *
     * @param limit Specifies the maximum number of uploads returned in the response body.
     *         If this value is not specified, the List Uploads operation returns up
     *         to 1,000 uploads.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies the maximum number of uploads returned in the response body.
     * If this value is not specified, the List Uploads operation returns up
     * to 1,000 uploads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit Specifies the maximum number of uploads returned in the response body.
     *         If this value is not specified, the List Uploads operation returns up
     *         to 1,000 uploads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsRequest withLimit(String limit) {
        this.limit = limit;
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
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getUploadIdMarker() != null) sb.append("UploadIdMarker: " + getUploadIdMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getUploadIdMarker() == null) ? 0 : getUploadIdMarker().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListMultipartUploadsRequest == false) return false;
        ListMultipartUploadsRequest other = (ListMultipartUploadsRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getUploadIdMarker() == null ^ this.getUploadIdMarker() == null) return false;
        if (other.getUploadIdMarker() != null && other.getUploadIdMarker().equals(this.getUploadIdMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    