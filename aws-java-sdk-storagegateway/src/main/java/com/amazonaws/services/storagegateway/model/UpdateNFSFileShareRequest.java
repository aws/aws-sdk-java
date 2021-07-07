/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or <code>false</code> to
     * use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
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
     * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     */
    private String defaultStorageClass;
    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway
     * puts objects into. The default value is <code>private</code>.
     * </p>
     */
    private String objectACL;
    /**
     * <p>
     * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     * addresses or valid CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clientList;
    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     */
    private String squash;
    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean guessMIMETypeEnabled;
    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean requesterPays;
    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     */
    private String fileShareName;
    /**
     * <p>
     * specifies refresh cache information for the file share.
     * </p>
     */
    private CacheAttributes cacheAttributes;
    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     */
    private String notificationPolicy;

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
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or <code>false</code> to
     * use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param kMSEncrypted
     *        Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or
     *        <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or <code>false</code> to
     * use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or
     *         <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or <code>false</code> to
     * use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param kMSEncrypted
     *        Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or
     *        <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or <code>false</code> to
     * use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to use Amazon S3 server-side encryption with your own KMS key, or
     *         <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *        encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *        <code>KMSEncrypted</code> is <code>true</code>. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *         encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *         <code>KMSEncrypted</code> is <code>true</code>. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *        encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *        <code>KMSEncrypted</code> is <code>true</code>. Optional.
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
     * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default
     *        value is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *        <p>
     *        Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code>
     *        | <code>S3_ONEZONE_IA</code>
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default
     *         value is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *         <p>
     *         Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> |
     *         <code>S3_STANDARD_IA</code> | <code>S3_ONEZONE_IA</code>
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default
     *        value is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *        <p>
     *        Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code>
     *        | <code>S3_ONEZONE_IA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway
     * puts objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File
     *        Gateway puts objects into. The default value is <code>private</code>.
     * @see ObjectACL
     */

    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway
     * puts objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @return A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File
     *         Gateway puts objects into. The default value is <code>private</code>.
     * @see ObjectACL
     */

    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway
     * puts objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File
     *        Gateway puts objects into. The default value is <code>private</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateNFSFileShareRequest withObjectACL(String objectACL) {
        setObjectACL(objectACL);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway
     * puts objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File
     *        Gateway puts objects into. The default value is <code>private</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateNFSFileShareRequest withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     * addresses or valid CIDR blocks.
     * </p>
     * 
     * @return The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
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
     * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     * addresses or valid CIDR blocks.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
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
     * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     * addresses or valid CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientList(java.util.Collection)} or {@link #withClientList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
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
     * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     * addresses or valid CIDR blocks.
     * </p>
     * 
     * @param clientList
     *        The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP
     *        addresses or valid CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param squash
     *        The user mapped to anonymous user.</p>
     *        <p>
     *        Valid values are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RootSquash</code>: Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NoSquash</code>: No one is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AllSquash</code>: Everyone is mapped to anonymous user.
     *        </p>
     *        </li>
     */

    public void setSquash(String squash) {
        this.squash = squash;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user mapped to anonymous user.</p>
     *         <p>
     *         Valid values are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RootSquash</code>: Only root is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NoSquash</code>: No one is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllSquash</code>: Everyone is mapped to anonymous user.
     *         </p>
     *         </li>
     */

    public String getSquash() {
        return this.squash;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param squash
     *        The user mapped to anonymous user.</p>
     *        <p>
     *        Valid values are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RootSquash</code>: Only root is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NoSquash</code>: No one is mapped to anonymous user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AllSquash</code>: Everyone is mapped to anonymous user.
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
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *         status to read-only, otherwise set to <code>false</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *         status to read-only, otherwise set to <code>false</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *        value is <code>true</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *         value is <code>true</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *        value is <code>true</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        setGuessMIMETypeEnabled(guessMIMETypeEnabled);
        return this;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *         value is <code>true</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *        owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *         owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *        owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withRequesterPays(Boolean requesterPays) {
        setRequesterPays(requesterPays);
        return this;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *         owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @param fileShareName
     *        The name of the file share. Optional.</p> <note>
     *        <p>
     *        <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *        </p>
     */

    public void setFileShareName(String fileShareName) {
        this.fileShareName = fileShareName;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @return The name of the file share. Optional.</p> <note>
     *         <p>
     *         <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *         </p>
     */

    public String getFileShareName() {
        return this.fileShareName;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @param fileShareName
     *        The name of the file share. Optional.</p> <note>
     *        <p>
     *        <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withFileShareName(String fileShareName) {
        setFileShareName(fileShareName);
        return this;
    }

    /**
     * <p>
     * specifies refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        specifies refresh cache information for the file share.
     */

    public void setCacheAttributes(CacheAttributes cacheAttributes) {
        this.cacheAttributes = cacheAttributes;
    }

    /**
     * <p>
     * specifies refresh cache information for the file share.
     * </p>
     * 
     * @return specifies refresh cache information for the file share.
     */

    public CacheAttributes getCacheAttributes() {
        return this.cacheAttributes;
    }

    /**
     * <p>
     * specifies refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        specifies refresh cache information for the file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withCacheAttributes(CacheAttributes cacheAttributes) {
        setCacheAttributes(cacheAttributes);
        return this;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @param notificationPolicy
     *        The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *        seconds to wait after the last point in time a client wrote to a file before generating an
     *        <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *        to set this parameter for as long as possible to avoid generating multiple notifications for the same file
     *        in a small time period.</p> <note>
     *        <p>
     *        <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *        the timing of the notification.
     *        </p>
     *        </note>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *        to 60.
     *        </p>
     *        <p>
     *        <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *        </p>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> off.
     *        </p>
     *        <p>
     *        <code>{}</code>
     */

    public void setNotificationPolicy(String notificationPolicy) {
        this.notificationPolicy = notificationPolicy;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @return The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *         seconds to wait after the last point in time a client wrote to a file before generating an
     *         <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *         to set this parameter for as long as possible to avoid generating multiple notifications for the same
     *         file in a small time period.</p> <note>
     *         <p>
     *         <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *         the timing of the notification.
     *         </p>
     *         </note>
     *         <p>
     *         The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *         to 60.
     *         </p>
     *         <p>
     *         <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *         </p>
     *         <p>
     *         The following example sets <code>NotificationPolicy</code> off.
     *         </p>
     *         <p>
     *         <code>{}</code>
     */

    public String getNotificationPolicy() {
        return this.notificationPolicy;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @param notificationPolicy
     *        The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *        seconds to wait after the last point in time a client wrote to a file before generating an
     *        <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *        to set this parameter for as long as possible to avoid generating multiple notifications for the same file
     *        in a small time period.</p> <note>
     *        <p>
     *        <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *        the timing of the notification.
     *        </p>
     *        </note>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *        to 60.
     *        </p>
     *        <p>
     *        <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *        </p>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> off.
     *        </p>
     *        <p>
     *        <code>{}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNFSFileShareRequest withNotificationPolicy(String notificationPolicy) {
        setNotificationPolicy(notificationPolicy);
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
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass()).append(",");
        if (getObjectACL() != null)
            sb.append("ObjectACL: ").append(getObjectACL()).append(",");
        if (getClientList() != null)
            sb.append("ClientList: ").append(getClientList()).append(",");
        if (getSquash() != null)
            sb.append("Squash: ").append(getSquash()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: ").append(getGuessMIMETypeEnabled()).append(",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: ").append(getRequesterPays()).append(",");
        if (getFileShareName() != null)
            sb.append("FileShareName: ").append(getFileShareName()).append(",");
        if (getCacheAttributes() != null)
            sb.append("CacheAttributes: ").append(getCacheAttributes()).append(",");
        if (getNotificationPolicy() != null)
            sb.append("NotificationPolicy: ").append(getNotificationPolicy());
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
        if (other.getObjectACL() == null ^ this.getObjectACL() == null)
            return false;
        if (other.getObjectACL() != null && other.getObjectACL().equals(this.getObjectACL()) == false)
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
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null)
            return false;
        if (other.getRequesterPays() != null && other.getRequesterPays().equals(this.getRequesterPays()) == false)
            return false;
        if (other.getFileShareName() == null ^ this.getFileShareName() == null)
            return false;
        if (other.getFileShareName() != null && other.getFileShareName().equals(this.getFileShareName()) == false)
            return false;
        if (other.getCacheAttributes() == null ^ this.getCacheAttributes() == null)
            return false;
        if (other.getCacheAttributes() != null && other.getCacheAttributes().equals(this.getCacheAttributes()) == false)
            return false;
        if (other.getNotificationPolicy() == null ^ this.getNotificationPolicy() == null)
            return false;
        if (other.getNotificationPolicy() != null && other.getNotificationPolicy().equals(this.getNotificationPolicy()) == false)
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
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode());
        hashCode = prime * hashCode + ((getSquash() == null) ? 0 : getSquash().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getFileShareName() == null) ? 0 : getFileShareName().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        hashCode = prime * hashCode + ((getNotificationPolicy() == null) ? 0 : getNotificationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNFSFileShareRequest clone() {
        return (UpdateNFSFileShareRequest) super.clone();
    }

}
