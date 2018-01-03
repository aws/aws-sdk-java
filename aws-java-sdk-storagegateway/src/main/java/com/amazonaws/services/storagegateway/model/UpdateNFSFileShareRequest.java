/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UpdateNFSFileShareInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateNFSFileShare" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNFSFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     */
    private String fileShareARN;
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
     * The default values for the file share. Optional.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
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
     * The user mapped to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user
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
     * Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
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
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be updated.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file share to be updated.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
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

    public UpdateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
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

    public UpdateNFSFileShareRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        The default values for the file share. Optional.
     */

    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @return The default values for the file share. Optional.
     */

    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return this.nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * 
     * @param nFSFileShareDefaults
     *        The default values for the file share. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        setNFSFileShareDefaults(nFSFileShareDefaults);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *         S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *         Optional.
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by a file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
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

    public UpdateNFSFileShareRequest withClientList(String... clientList) {
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

    public UpdateNFSFileShareRequest withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * The user mapped to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user
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
     *        The user mapped to anonymous user. Valid options are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "RootSquash" - Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NoSquash" - No one is mapped to anonymous user
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
     * The user mapped to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user
     * </p>
     * </li>
     * <li>
     * <p>
     * "AllSquash" - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user mapped to anonymous user. Valid options are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         "RootSquash" - Only root is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NoSquash" - No one is mapped to anonymous user
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
     * The user mapped to anonymous user. Valid options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "RootSquash" - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * "NoSquash" - No one is mapped to anonymous user
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
     *        The user mapped to anonymous user. Valid options are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "RootSquash" - Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NoSquash" - No one is mapped to anonymous user
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AllSquash" - Everyone is mapped to anonymous user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withSquash(String squash) {
        setSquash(squash);
        return this;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     * </p>
     * 
     * @param readOnly
     *        Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     * </p>
     * 
     * @return Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     * </p>
     * 
     * @param readOnly
     *        Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
     * </p>
     * 
     * @return Sets the write status of a file share: "true" if the write status is read-only, otherwise "false".
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

    public UpdateNFSFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
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

        if (obj instanceof UpdateNFSFileShareRequest == false)
            return false;
        UpdateNFSFileShareRequest other = (UpdateNFSFileShareRequest) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
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

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode());
        hashCode = prime * hashCode + ((getSquash() == null) ? 0 : getSquash().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNFSFileShareRequest clone() {
        return (UpdateNFSFileShareRequest) super.clone();
    }

}
