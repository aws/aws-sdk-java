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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#listParts(ListPartsRequest) ListParts operation}.
 * <p>
 * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make this request at any time during an
 * in-progress multipart upload before you complete the upload (see CompleteMultipartUpload. List Parts returns an error for completed uploads. The list
 * returned in the List Parts response is sorted by part range.
 * </p>
 * <p>
 * The List Parts operation supports pagination. By default, this operation returns up to 1,000 uploaded parts in the response. You should always check
 * the response for a <code>marker</code> at which to continue the list; if there are no more items the <code>marker</code> is <code>null</code> .
 * To return a list of parts that begins at a specific part, set the <code>marker</code> request parameter to the value you obtained from a previous
 * List Parts request. You can also limit the number of parts returned in the response by specifying the <code>limit</code> parameter in the request.
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
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-multipart-list-parts.html"> List Parts </a> in the <i>Amazon Glacier Developer
 * Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#listParts(ListPartsRequest)
 */
public class ListPartsRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The upload ID of the multipart upload.
     */
    private String uploadId;

    /**
     * An opaque string used for pagination. This value specifies the part at
     * which the listing of parts should begin. Get the marker value from the
     * response of a previous List Parts response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Parts request.
     */
    private String marker;

    /**
     * Specifies the maximum number of parts returned in the response body.
     * If this value is not specified, the List Parts operation returns up to
     * 1,000 uploads.
     */
    private String limit;

    /**
     * Default constructor for a new ListPartsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListPartsRequest() {}
    
    /**
     * Constructs a new ListPartsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param uploadId The upload ID of the multipart upload.
     */
    public ListPartsRequest(String vaultName, String uploadId) {
        setVaultName(vaultName);
        setUploadId(uploadId);
    }

    /**
     * Constructs a new ListPartsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param uploadId The upload ID of the multipart upload.
     */
    public ListPartsRequest(String accountId, String vaultName, String uploadId) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setUploadId(uploadId);
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
    public ListPartsRequest withAccountId(String accountId) {
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
    public ListPartsRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The upload ID of the multipart upload.
     *
     * @return The upload ID of the multipart upload.
     */
    public String getUploadId() {
        return uploadId;
    }
    
    /**
     * The upload ID of the multipart upload.
     *
     * @param uploadId The upload ID of the multipart upload.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
    
    /**
     * The upload ID of the multipart upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadId The upload ID of the multipart upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * An opaque string used for pagination. This value specifies the part at
     * which the listing of parts should begin. Get the marker value from the
     * response of a previous List Parts response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Parts request.
     *
     * @return An opaque string used for pagination. This value specifies the part at
     *         which the listing of parts should begin. Get the marker value from the
     *         response of a previous List Parts response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Parts request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the part at
     * which the listing of parts should begin. Get the marker value from the
     * response of a previous List Parts response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Parts request.
     *
     * @param marker An opaque string used for pagination. This value specifies the part at
     *         which the listing of parts should begin. Get the marker value from the
     *         response of a previous List Parts response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Parts request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the part at
     * which the listing of parts should begin. Get the marker value from the
     * response of a previous List Parts response. You need only include the
     * marker if you are continuing the pagination of results started in a
     * previous List Parts request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string used for pagination. This value specifies the part at
     *         which the listing of parts should begin. Get the marker value from the
     *         response of a previous List Parts response. You need only include the
     *         marker if you are continuing the pagination of results started in a
     *         previous List Parts request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies the maximum number of parts returned in the response body.
     * If this value is not specified, the List Parts operation returns up to
     * 1,000 uploads.
     *
     * @return Specifies the maximum number of parts returned in the response body.
     *         If this value is not specified, the List Parts operation returns up to
     *         1,000 uploads.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * Specifies the maximum number of parts returned in the response body.
     * If this value is not specified, the List Parts operation returns up to
     * 1,000 uploads.
     *
     * @param limit Specifies the maximum number of parts returned in the response body.
     *         If this value is not specified, the List Parts operation returns up to
     *         1,000 uploads.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies the maximum number of parts returned in the response body.
     * If this value is not specified, the List Parts operation returns up to
     * 1,000 uploads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit Specifies the maximum number of parts returned in the response body.
     *         If this value is not specified, the List Parts operation returns up to
     *         1,000 uploads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsRequest withLimit(String limit) {
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
        if (getUploadId() != null) sb.append("UploadId: " + getUploadId() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
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
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPartsRequest == false) return false;
        ListPartsRequest other = (ListPartsRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    