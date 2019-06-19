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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateTapesInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTapesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     */
    private String clientToken;
    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     */
    private Integer numTapesToCreate;
    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     */
    private String tapeBarcodePrefix;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with.
     *         Use the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *         <p>
     *         The size must be aligned by gigabyte (1024*1024*1024 byte).
     *         </p>
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.</p> <note>
     *        <p>
     *        Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *        </p>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @return A unique identifier that you use to retry a request. If you retry a request, use the same
     *         <code>ClientToken</code> you specified in the initial request.</p> <note>
     *         <p>
     *         Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *         </p>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.</p> <note>
     *        <p>
     *        Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @param numTapesToCreate
     *        The number of virtual tapes that you want to create.
     */

    public void setNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @return The number of virtual tapes that you want to create.
     */

    public Integer getNumTapesToCreate() {
        return this.numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @param numTapesToCreate
     *        The number of virtual tapes that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withNumTapesToCreate(Integer numTapesToCreate) {
        setNumTapesToCreate(numTapesToCreate);
        return this;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     */

    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @return A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *         barcode unique.</p> <note>
     *         <p>
     *         The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *         </p>
     */

    public String getTapeBarcodePrefix() {
        return this.tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTapeBarcodePrefix(String tapeBarcodePrefix) {
        setTapeBarcodePrefix(tapeBarcodePrefix);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *        can only be set when KMSEncrypted is true. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *         can only be set when KMSEncrypted is true. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *        can only be set when KMSEncrypted is true. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @return The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *         the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *         tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *         the pool.</p>
     *         <p>
     *         Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @return A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.</p> <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and
     *         the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters,
     *         and the maximum length for a tag's value is 256.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: ").append(getTapeSizeInBytes()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getNumTapesToCreate() != null)
            sb.append("NumTapesToCreate: ").append(getNumTapesToCreate()).append(",");
        if (getTapeBarcodePrefix() != null)
            sb.append("TapeBarcodePrefix: ").append(getTapeBarcodePrefix()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapesRequest == false)
            return false;
        CreateTapesRequest other = (CreateTapesRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNumTapesToCreate() == null ^ this.getNumTapesToCreate() == null)
            return false;
        if (other.getNumTapesToCreate() != null && other.getNumTapesToCreate().equals(this.getNumTapesToCreate()) == false)
            return false;
        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null)
            return false;
        if (other.getTapeBarcodePrefix() != null && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNumTapesToCreate() == null) ? 0 : getNumTapesToCreate().hashCode());
        hashCode = prime * hashCode + ((getTapeBarcodePrefix() == null) ? 0 : getTapeBarcodePrefix().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapesRequest clone() {
        return (CreateTapesRequest) super.clone();
    }

}
