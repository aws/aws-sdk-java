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
 * UpdateSMBFileShareInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShare" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSMBFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
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
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are
     * <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is not
     * populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * </p>
     */
    private String defaultStorageClass;
    /**
     * <p>
     * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is "private".
     * </p>
     */
    private String objectACL;
    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if the write status is read-only, and
     * otherwise false.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * true to enable MIME type guessing, and otherwise to false. The default value is true.
     * </p>
     */
    private Boolean guessMIMETypeEnabled;
    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3
     * bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     */
    private Boolean requesterPays;
    /**
     * <p>
     * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file
     * and directory permissions to the POSIX permissions.
     * </p>
     */
    private Boolean sMBACLEnabled;
    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> validUserList;
    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidUserList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withFileShareARN(String fileShareARN) {
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

    public UpdateSMBFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
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

    public UpdateSMBFileShareRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are
     * <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is not
     * populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values
     *        are <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is
     *        not populated, the default value <code>S3_STANDARD</code> is used. Optional.
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are
     * <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is not
     * populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values
     *         are <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field
     *         is not populated, the default value <code>S3_STANDARD</code> is used. Optional.
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are
     * <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is not
     * populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values
     *        are <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is
     *        not populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is "private".
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     *        objects into. The default value is "private".
     * @see ObjectACL
     */

    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is "private".
     * </p>
     * 
     * @return A value that sets the access control list permission for objects in the S3 bucket that a file gateway
     *         puts objects into. The default value is "private".
     * @see ObjectACL
     */

    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is "private".
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     *        objects into. The default value is "private".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateSMBFileShareRequest withObjectACL(String objectACL) {
        setObjectACL(objectACL);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is "private".
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts
     *        objects into. The default value is "private".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateSMBFileShareRequest withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if the write status is read-only, and
     * otherwise false.
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. This value is true if the write status is read-only,
     *        and otherwise false.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if the write status is read-only, and
     * otherwise false.
     * </p>
     * 
     * @return A value that sets the write status of a file share. This value is true if the write status is read-only,
     *         and otherwise false.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if the write status is read-only, and
     * otherwise false.
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. This value is true if the write status is read-only,
     *        and otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if the write status is read-only, and
     * otherwise false.
     * </p>
     * 
     * @return A value that sets the write status of a file share. This value is true if the write status is read-only,
     *         and otherwise false.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * true to enable MIME type guessing, and otherwise to false. The default value is true.
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to true to enable MIME type guessing, and otherwise to false. The default value is true.
     */

    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * true to enable MIME type guessing, and otherwise to false. The default value is true.
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to true to enable MIME type guessing, and otherwise to false. The default value is true.
     */

    public Boolean getGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * true to enable MIME type guessing, and otherwise to false. The default value is true.
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to true to enable MIME type guessing, and otherwise to false. The default value is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        setGuessMIMETypeEnabled(guessMIMETypeEnabled);
        return this;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * true to enable MIME type guessing, and otherwise to false. The default value is true.
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to true to enable MIME type guessing, and otherwise to false. The default value is true.
     */

    public Boolean isGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3
     * bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     *        However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     */

    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3
     * bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     *         However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     */

    public Boolean getRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3
     * bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     *        However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withRequesterPays(Boolean requesterPays) {
        setRequesterPays(requesterPays);
        return this;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3
     * bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     *         However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     */

    public Boolean isRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file
     * and directory permissions to the POSIX permissions.
     * </p>
     * 
     * @param sMBACLEnabled
     *        Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to
     *        map file and directory permissions to the POSIX permissions.
     */

    public void setSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file
     * and directory permissions to the POSIX permissions.
     * </p>
     * 
     * @return Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to
     *         map file and directory permissions to the POSIX permissions.
     */

    public Boolean getSMBACLEnabled() {
        return this.sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file
     * and directory permissions to the POSIX permissions.
     * </p>
     * 
     * @param sMBACLEnabled
     *        Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to
     *        map file and directory permissions to the POSIX permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withSMBACLEnabled(Boolean sMBACLEnabled) {
        setSMBACLEnabled(sMBACLEnabled);
        return this;
    }

    /**
     * <p>
     * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file
     * and directory permissions to the POSIX permissions.
     * </p>
     * 
     * @return Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to
     *         map file and directory permissions to the POSIX permissions.
     */

    public Boolean isSMBACLEnabled() {
        return this.sMBACLEnabled;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @return A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *         be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is
     *         set to <code>ActiveDirectory</code>.
     */

    public java.util.List<String> getValidUserList() {
        if (validUserList == null) {
            validUserList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return validUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is
     *        set to <code>ActiveDirectory</code>.
     */

    public void setValidUserList(java.util.Collection<String> validUserList) {
        if (validUserList == null) {
            this.validUserList = null;
            return;
        }

        this.validUserList = new com.amazonaws.internal.SdkInternalList<String>(validUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidUserList(java.util.Collection)} or {@link #withValidUserList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is
     *        set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withValidUserList(String... validUserList) {
        if (this.validUserList == null) {
            setValidUserList(new com.amazonaws.internal.SdkInternalList<String>(validUserList.length));
        }
        for (String ele : validUserList) {
            this.validUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is
     *        set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withValidUserList(java.util.Collection<String> validUserList) {
        setValidUserList(validUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @return A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *         must be prefixed with the @ character. For example <code>@group1</code>. Can only be set if
     *         Authentication is set to <code>ActiveDirectory</code>.
     */

    public java.util.List<String> getInvalidUserList() {
        if (invalidUserList == null) {
            invalidUserList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication
     *        is set to <code>ActiveDirectory</code>.
     */

    public void setInvalidUserList(java.util.Collection<String> invalidUserList) {
        if (invalidUserList == null) {
            this.invalidUserList = null;
            return;
        }

        this.invalidUserList = new com.amazonaws.internal.SdkInternalList<String>(invalidUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidUserList(java.util.Collection)} or {@link #withInvalidUserList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication
     *        is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withInvalidUserList(String... invalidUserList) {
        if (this.invalidUserList == null) {
            setInvalidUserList(new com.amazonaws.internal.SdkInternalList<String>(invalidUserList.length));
        }
        for (String ele : invalidUserList) {
            this.invalidUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. For example <code>@group1</code>. Can only be set if Authentication
     *        is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withInvalidUserList(java.util.Collection<String> invalidUserList) {
        setInvalidUserList(invalidUserList);
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass()).append(",");
        if (getObjectACL() != null)
            sb.append("ObjectACL: ").append(getObjectACL()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: ").append(getGuessMIMETypeEnabled()).append(",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: ").append(getRequesterPays()).append(",");
        if (getSMBACLEnabled() != null)
            sb.append("SMBACLEnabled: ").append(getSMBACLEnabled()).append(",");
        if (getValidUserList() != null)
            sb.append("ValidUserList: ").append(getValidUserList()).append(",");
        if (getInvalidUserList() != null)
            sb.append("InvalidUserList: ").append(getInvalidUserList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBFileShareRequest == false)
            return false;
        UpdateSMBFileShareRequest other = (UpdateSMBFileShareRequest) obj;
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
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        if (other.getObjectACL() == null ^ this.getObjectACL() == null)
            return false;
        if (other.getObjectACL() != null && other.getObjectACL().equals(this.getObjectACL()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getGuessMIMETypeEnabled() == null ^ this.getGuessMIMETypeEnabled() == null)
            return false;
        if (other.getGuessMIMETypeEnabled() != null && other.getGuessMIMETypeEnabled().equals(this.getGuessMIMETypeEnabled()) == false)
            return false;
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null)
            return false;
        if (other.getRequesterPays() != null && other.getRequesterPays().equals(this.getRequesterPays()) == false)
            return false;
        if (other.getSMBACLEnabled() == null ^ this.getSMBACLEnabled() == null)
            return false;
        if (other.getSMBACLEnabled() != null && other.getSMBACLEnabled().equals(this.getSMBACLEnabled()) == false)
            return false;
        if (other.getValidUserList() == null ^ this.getValidUserList() == null)
            return false;
        if (other.getValidUserList() != null && other.getValidUserList().equals(this.getValidUserList()) == false)
            return false;
        if (other.getInvalidUserList() == null ^ this.getInvalidUserList() == null)
            return false;
        if (other.getInvalidUserList() != null && other.getInvalidUserList().equals(this.getInvalidUserList()) == false)
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
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getSMBACLEnabled() == null) ? 0 : getSMBACLEnabled().hashCode());
        hashCode = prime * hashCode + ((getValidUserList() == null) ? 0 : getValidUserList().hashCode());
        hashCode = prime * hashCode + ((getInvalidUserList() == null) ? 0 : getInvalidUserList().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSMBFileShareRequest clone() {
        return (UpdateSMBFileShareRequest) super.clone();
    }

}
