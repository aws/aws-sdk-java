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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Windows file permissions and ownership information assigned, by default, to native S3 objects when file gateway
 * discovers them in S3 buckets. This operation is only supported for file gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SMBFileShareInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMBFileShareInfo implements Serializable, Cloneable, StructuredPojo {

    private String fileShareARN;

    private String fileShareId;

    private String fileShareStatus;

    private String gatewayARN;
    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;

    private String kMSKey;
    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     */
    private String path;

    private String role;

    private String locationARN;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are
     * <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field is not
     * populated, the default value <code>S3_STANDARD</code> is used. Optional.
     * </p>
     */
    private String defaultStorageClass;

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
     * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it
     * is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission.
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

    private String authentication;
    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * @param fileShareARN
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * @return
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * @param fileShareARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * @param fileShareId
     */

    public void setFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
    }

    /**
     * @return
     */

    public String getFileShareId() {
        return this.fileShareId;
    }

    /**
     * @param fileShareId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withFileShareId(String fileShareId) {
        setFileShareId(fileShareId);
        return this;
    }

    /**
     * @param fileShareStatus
     */

    public void setFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
    }

    /**
     * @return
     */

    public String getFileShareStatus() {
        return this.fileShareStatus;
    }

    /**
     * @param fileShareStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withFileShareStatus(String fileShareStatus) {
        setFileShareStatus(fileShareStatus);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * @param kMSKey
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * @return
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * @param kMSKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     * 
     * @param path
     *        The file share path used by the SMB client to identify the mount point.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     * 
     * @return The file share path used by the SMB client to identify the mount point.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     * 
     * @param path
     *        The file share path used by the SMB client to identify the mount point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * @param role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return
     */

    public String getRole() {
        return this.role;
    }

    /**
     * @param role
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * @param locationARN
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * @return
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * @param locationARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withLocationARN(String locationARN) {
        setLocationARN(locationARN);
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

    public SMBFileShareInfo withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * @param objectACL
     * @see ObjectACL
     */

    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * @return
     * @see ObjectACL
     */

    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * @param objectACL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public SMBFileShareInfo withObjectACL(String objectACL) {
        setObjectACL(objectACL);
        return this;
    }

    /**
     * @param objectACL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public SMBFileShareInfo withObjectACL(ObjectACL objectACL) {
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

    public SMBFileShareInfo withReadOnly(Boolean readOnly) {
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

    public SMBFileShareInfo withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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

    public SMBFileShareInfo withRequesterPays(Boolean requesterPays) {
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
     * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it
     * is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * 
     * @param sMBACLEnabled
     *        If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share.
     *        If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX
     *        permission.
     */

    public void setSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it
     * is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * 
     * @return If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file
     *         share. If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX
     *         permission.
     */

    public Boolean getSMBACLEnabled() {
        return this.sMBACLEnabled;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it
     * is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * 
     * @param sMBACLEnabled
     *        If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share.
     *        If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX
     *        permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withSMBACLEnabled(Boolean sMBACLEnabled) {
        setSMBACLEnabled(sMBACLEnabled);
        return this;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it
     * is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * 
     * @return If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file
     *         share. If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX
     *         permission.
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

    public SMBFileShareInfo withValidUserList(String... validUserList) {
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

    public SMBFileShareInfo withValidUserList(java.util.Collection<String> validUserList) {
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

    public SMBFileShareInfo withInvalidUserList(String... invalidUserList) {
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

    public SMBFileShareInfo withInvalidUserList(java.util.Collection<String> invalidUserList) {
        setInvalidUserList(invalidUserList);
        return this;
    }

    /**
     * @param authentication
     */

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * @return
     */

    public String getAuthentication() {
        return this.authentication;
    }

    /**
     * @param authentication
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withAuthentication(String authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @return A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *         key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *         <code>ListTagsForResource</code> API operation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
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
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBFileShareInfo withTags(java.util.Collection<Tag> tags) {
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getFileShareId() != null)
            sb.append("FileShareId: ").append(getFileShareId()).append(",");
        if (getFileShareStatus() != null)
            sb.append("FileShareStatus: ").append(getFileShareStatus()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
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
            sb.append("InvalidUserList: ").append(getInvalidUserList()).append(",");
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
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

        if (obj instanceof SMBFileShareInfo == false)
            return false;
        SMBFileShareInfo other = (SMBFileShareInfo) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFileShareId() == null ^ this.getFileShareId() == null)
            return false;
        if (other.getFileShareId() != null && other.getFileShareId().equals(this.getFileShareId()) == false)
            return false;
        if (other.getFileShareStatus() == null ^ this.getFileShareStatus() == null)
            return false;
        if (other.getFileShareStatus() != null && other.getFileShareStatus().equals(this.getFileShareStatus()) == false)
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
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
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

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getFileShareId() == null) ? 0 : getFileShareId().hashCode());
        hashCode = prime * hashCode + ((getFileShareStatus() == null) ? 0 : getFileShareStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getSMBACLEnabled() == null) ? 0 : getSMBACLEnabled().hashCode());
        hashCode = prime * hashCode + ((getValidUserList() == null) ? 0 : getValidUserList().hashCode());
        hashCode = prime * hashCode + ((getInvalidUserList() == null) ? 0 : getInvalidUserList().hashCode());
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SMBFileShareInfo clone() {
        try {
            return (SMBFileShareInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.SMBFileShareInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
