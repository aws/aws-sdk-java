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
 * Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The upload ID of the multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin.
     * Get the marker value from the response of a previous List Parts response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List Parts request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer
     * than the specified limit, but the number of returned parts never exceeds the limit.
     * </p>
     */
    private String limit;

    /**
     * Default constructor for ListPartsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public ListPartsRequest() {
    }

    /**
     * Constructs a new ListPartsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param uploadId
     *        The upload ID of the multipart upload.
     */
    public ListPartsRequest(String vaultName, String uploadId) {
        setVaultName(vaultName);
        setUploadId(uploadId);
    }

    /**
     * Constructs a new ListPartsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     * @param uploadId
     *        The upload ID of the multipart upload.
     */
    public ListPartsRequest(String accountId, String vaultName, String uploadId) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setUploadId(uploadId);
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

    public ListPartsRequest withAccountId(String accountId) {
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

    public ListPartsRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID of the multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @return The upload ID of the multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID of the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin.
     * Get the marker value from the response of a previous List Parts response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List Parts request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination. This value specifies the part at which the listing of parts should
     *        begin. Get the marker value from the response of a previous List Parts response. You need only include the
     *        marker if you are continuing the pagination of results started in a previous List Parts request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin.
     * Get the marker value from the response of a previous List Parts response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List Parts request.
     * </p>
     * 
     * @return An opaque string used for pagination. This value specifies the part at which the listing of parts should
     *         begin. Get the marker value from the response of a previous List Parts response. You need only include
     *         the marker if you are continuing the pagination of results started in a previous List Parts request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin.
     * Get the marker value from the response of a previous List Parts response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List Parts request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination. This value specifies the part at which the listing of parts should
     *        begin. Get the marker value from the response of a previous List Parts response. You need only include the
     *        marker if you are continuing the pagination of results started in a previous List Parts request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer
     * than the specified limit, but the number of returned parts never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be
     *        fewer than the specified limit, but the number of returned parts never exceeds the limit.
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer
     * than the specified limit, but the number of returned parts never exceeds the limit.
     * </p>
     * 
     * @return The maximum number of parts to be returned. The default limit is 50. The number of parts returned might
     *         be fewer than the specified limit, but the number of returned parts never exceeds the limit.
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer
     * than the specified limit, but the number of returned parts never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be
     *        fewer than the specified limit, but the number of returned parts never exceeds the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsRequest withLimit(String limit) {
        setLimit(limit);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPartsRequest == false)
            return false;
        ListPartsRequest other = (ListPartsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
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
    public ListPartsRequest clone() {
        return (ListPartsRequest) super.clone();
    }

}
