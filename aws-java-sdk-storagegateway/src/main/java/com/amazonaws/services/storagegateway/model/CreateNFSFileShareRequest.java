/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateNFSFileShareInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateNFSFileShare" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNFSFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * File share default values. Optional.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     */
    private String locationARN;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     */
    private String defaultStorageClass;
    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses
     * or valid CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clientList;
    /**
     * <p>
     * Maps a user to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "AllSquash" - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     */
    private String squash;
    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME type
     * guessing, and otherwise "false".
     * </p>
     */
    private Boolean guessMIMETypeEnabled;

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
     * </p>
     * 
     * @param clientToken
     *        A unique string value that you supply that is used by file gateway to ensure idempotent file share
     *        creation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
     * </p>
     * 
     * @return A unique string value that you supply that is used by file gateway to ensure idempotent file share
     *         creation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
     * </p>
     * 
     * @param clientToken
     *        A unique string value that you supply that is used by file gateway to ensure idempotent file share
     *        creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        File share default values. Optional.
     */

    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     * 
     * @return File share default values. Optional.
     */

    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return this.nFSFileShareDefaults;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        File share default values. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        setNFSFileShareDefaults(nFSFileShareDefaults);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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

    public CreateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
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
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @param kMSKey
     *        The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *        true. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @return The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *         true. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is true.
     * Optional.
     * </p>
     * 
     * @param kMSKey
     *        The KMS key used for Amazon S3 server side encryption. This value can only be set when KmsEncrypted is
     *        true. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * 
     * @param role
     *        The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses
     *        the underlying storage.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses
     *         the underlying storage.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * 
     * @param role
     *        The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses
     *        the underlying storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * 
     * @param locationARN
     *        The ARN of the backed storage used for storing file data.
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * 
     * @return The ARN of the backed storage used for storing file data.
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * 
     * @param locationARN
     *        The ARN of the backed storage used for storing file data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withLocationARN(String locationARN) {
        setLocationARN(locationARN);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *         S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *         Optional.
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses
     * or valid CIDR blocks.
     * </p>
     * 
     * @return The list of clients that are allowed to access the file gateway. The list must contain either valid IP
     *         addresses or valid CIDR blocks.
     */

    public java.util.List<String> getClientList() {
        if (clientList == null) {
            clientList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clientList;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses
     * or valid CIDR blocks.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the file gateway. The list must contain either valid IP
     *        addresses or valid CIDR blocks.
     */

    public void setClientList(java.util.Collection<String> clientList) {
        if (clientList == null) {
            this.clientList = null;
            return;
        }

        this.clientList = new com.amazonaws.internal.SdkInternalList<String>(clientList);
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses
     * or valid CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientList(java.util.Collection)} or {@link #withClientList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the file gateway. The list must contain either valid IP
     *        addresses or valid CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withClientList(String... clientList) {
        if (this.clientList == null) {
            setClientList(new com.amazonaws.internal.SdkInternalList<String>(clientList.length));
        }
        for (String ele : clientList) {
            this.clientList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses
     * or valid CIDR blocks.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the file gateway. The list must contain either valid IP
     *        addresses or valid CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * Maps a user to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "AllSquash" - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param squash
     *        Maps a user to anonymous user. Valid options are the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "RootSquash" - Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NoSquash" - No one is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AllSquash" - Everyone is mapped to anonymous user.
     *        </p>
     *        </li>
     */

    public void setSquash(String squash) {
        this.squash = squash;
    }

    /**
     * <p>
     * Maps a user to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "AllSquash" - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Maps a user to anonymous user. Valid options are the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "RootSquash" - Only root is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NoSquash" - No one is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "AllSquash" - Everyone is mapped to anonymous user.
     *         </p>
     *         </li>
     */

    public String getSquash() {
        return this.squash;
    }

    /**
     * <p>
     * Maps a user to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "AllSquash" - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param squash
     *        Maps a user to anonymous user. Valid options are the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "RootSquash" - Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NoSquash" - No one is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AllSquash" - Everyone is mapped to anonymous user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withSquash(String squash) {
        setSquash(squash);
        return this;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * </p>
     * 
     * @param readOnly
     *        Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * </p>
     * 
     * @return Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * </p>
     * 
     * @param readOnly
     *        Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     * </p>
     * 
     * @return Sets the write status of a file share: "true" if the write status is read-only, and otherwise "false".
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME type
     * guessing, and otherwise "false".
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME
     *        type guessing, and otherwise "false".
     */

    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME type
     * guessing, and otherwise "false".
     * </p>
     * 
     * @return Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME
     *         type guessing, and otherwise "false".
     */

    public Boolean getGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME type
     * guessing, and otherwise "false".
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME
     *        type guessing, and otherwise "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNFSFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        setGuessMIMETypeEnabled(guessMIMETypeEnabled);
        return this;
    }

    /**
     * <p>
     * Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME type
     * guessing, and otherwise "false".
     * </p>
     * 
     * @return Enables guessing of the MIME type for uploaded objects based on file extensions: "true" to enable MIME
     *         type guessing, and otherwise "false".
     */

    public Boolean isGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass()).append(",");
        if (getClientList() != null)
            sb.append("ClientList: ").append(getClientList()).append(",");
        if (getSquash() != null)
            sb.append("Squash: ").append(getSquash()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: ").append(getGuessMIMETypeEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNFSFileShareRequest == false)
            return false;
        CreateNFSFileShareRequest other = (CreateNFSFileShareRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        if (other.getClientList() == null ^ this.getClientList() == null)
            return false;
        if (other.getClientList() != null && other.getClientList().equals(this.getClientList()) == false)
            return false;
        if (other.getSquash() == null ^ this.getSquash() == null)
            return false;
        if (other.getSquash() != null && other.getSquash().equals(this.getSquash()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getGuessMIMETypeEnabled() == null ^ this.getGuessMIMETypeEnabled() == null)
            return false;
        if (other.getGuessMIMETypeEnabled() != null && other.getGuessMIMETypeEnabled().equals(this.getGuessMIMETypeEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode());
        hashCode = prime * hashCode + ((getSquash() == null) ? 0 : getSquash().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateNFSFileShareRequest clone() {
        return (CreateNFSFileShareRequest) super.clone();
    }

}
