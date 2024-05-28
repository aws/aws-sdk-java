/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for the file uploader field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FileUploaderFieldConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileUploaderFieldConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values
     * for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For detailed
     * information about the permissions associated with each access level, see <a
     * href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     * <i>Amplify documentation</i>.
     * </p>
     */
    private String accessLevel;
    /**
     * <p>
     * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of
     * strings specifying the valid file extensions.
     * </p>
     */
    private java.util.List<String> acceptedFileTypes;
    /**
     * <p>
     * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is
     * <code>true</code> to display the image preview.
     * </p>
     */
    private Boolean showThumbnails;
    /**
     * <p>
     * Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a
     * chunk at a time.
     * </p>
     */
    private Boolean isResumable;
    /**
     * <p>
     * Specifies the maximum number of files that can be selected to upload. The default value is an unlimited number of
     * files.
     * </p>
     */
    private Integer maxFileCount;
    /**
     * <p>
     * The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file size.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values
     * for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For detailed
     * information about the permissions associated with each access level, see <a
     * href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     * <i>Amplify documentation</i>.
     * </p>
     * 
     * @param accessLevel
     *        The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid
     *        values for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For
     *        detailed information about the permissions associated with each access level, see <a
     *        href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     *        <i>Amplify documentation</i>.
     * @see StorageAccessLevel
     */

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * <p>
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values
     * for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For detailed
     * information about the permissions associated with each access level, see <a
     * href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     * <i>Amplify documentation</i>.
     * </p>
     * 
     * @return The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid
     *         values for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For
     *         detailed information about the permissions associated with each access level, see <a
     *         href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     *         <i>Amplify documentation</i>.
     * @see StorageAccessLevel
     */

    public String getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * <p>
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values
     * for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For detailed
     * information about the permissions associated with each access level, see <a
     * href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     * <i>Amplify documentation</i>.
     * </p>
     * 
     * @param accessLevel
     *        The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid
     *        values for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For
     *        detailed information about the permissions associated with each access level, see <a
     *        href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     *        <i>Amplify documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageAccessLevel
     */

    public FileUploaderFieldConfig withAccessLevel(String accessLevel) {
        setAccessLevel(accessLevel);
        return this;
    }

    /**
     * <p>
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values
     * for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For detailed
     * information about the permissions associated with each access level, see <a
     * href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     * <i>Amplify documentation</i>.
     * </p>
     * 
     * @param accessLevel
     *        The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid
     *        values for this property are <code>private</code>, <code>protected</code>, or <code>public</code>. For
     *        detailed information about the permissions associated with each access level, see <a
     *        href="https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/">File access levels</a> in the
     *        <i>Amplify documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageAccessLevel
     */

    public FileUploaderFieldConfig withAccessLevel(StorageAccessLevel accessLevel) {
        this.accessLevel = accessLevel.toString();
        return this;
    }

    /**
     * <p>
     * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of
     * strings specifying the valid file extensions.
     * </p>
     * 
     * @return The file types that are allowed to be uploaded by the file uploader. Provide this information in an array
     *         of strings specifying the valid file extensions.
     */

    public java.util.List<String> getAcceptedFileTypes() {
        return acceptedFileTypes;
    }

    /**
     * <p>
     * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of
     * strings specifying the valid file extensions.
     * </p>
     * 
     * @param acceptedFileTypes
     *        The file types that are allowed to be uploaded by the file uploader. Provide this information in an array
     *        of strings specifying the valid file extensions.
     */

    public void setAcceptedFileTypes(java.util.Collection<String> acceptedFileTypes) {
        if (acceptedFileTypes == null) {
            this.acceptedFileTypes = null;
            return;
        }

        this.acceptedFileTypes = new java.util.ArrayList<String>(acceptedFileTypes);
    }

    /**
     * <p>
     * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of
     * strings specifying the valid file extensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceptedFileTypes(java.util.Collection)} or {@link #withAcceptedFileTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param acceptedFileTypes
     *        The file types that are allowed to be uploaded by the file uploader. Provide this information in an array
     *        of strings specifying the valid file extensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withAcceptedFileTypes(String... acceptedFileTypes) {
        if (this.acceptedFileTypes == null) {
            setAcceptedFileTypes(new java.util.ArrayList<String>(acceptedFileTypes.length));
        }
        for (String ele : acceptedFileTypes) {
            this.acceptedFileTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of
     * strings specifying the valid file extensions.
     * </p>
     * 
     * @param acceptedFileTypes
     *        The file types that are allowed to be uploaded by the file uploader. Provide this information in an array
     *        of strings specifying the valid file extensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withAcceptedFileTypes(java.util.Collection<String> acceptedFileTypes) {
        setAcceptedFileTypes(acceptedFileTypes);
        return this;
    }

    /**
     * <p>
     * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is
     * <code>true</code> to display the image preview.
     * </p>
     * 
     * @param showThumbnails
     *        Specifies whether to display or hide the image preview after selecting a file for upload. The default
     *        value is <code>true</code> to display the image preview.
     */

    public void setShowThumbnails(Boolean showThumbnails) {
        this.showThumbnails = showThumbnails;
    }

    /**
     * <p>
     * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is
     * <code>true</code> to display the image preview.
     * </p>
     * 
     * @return Specifies whether to display or hide the image preview after selecting a file for upload. The default
     *         value is <code>true</code> to display the image preview.
     */

    public Boolean getShowThumbnails() {
        return this.showThumbnails;
    }

    /**
     * <p>
     * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is
     * <code>true</code> to display the image preview.
     * </p>
     * 
     * @param showThumbnails
     *        Specifies whether to display or hide the image preview after selecting a file for upload. The default
     *        value is <code>true</code> to display the image preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withShowThumbnails(Boolean showThumbnails) {
        setShowThumbnails(showThumbnails);
        return this;
    }

    /**
     * <p>
     * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is
     * <code>true</code> to display the image preview.
     * </p>
     * 
     * @return Specifies whether to display or hide the image preview after selecting a file for upload. The default
     *         value is <code>true</code> to display the image preview.
     */

    public Boolean isShowThumbnails() {
        return this.showThumbnails;
    }

    /**
     * <p>
     * Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a
     * chunk at a time.
     * </p>
     * 
     * @param isResumable
     *        Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to
     *        break the files into chunks before upload. The progress of the upload isn't continuous, because the file
     *        uploader uploads a chunk at a time.
     */

    public void setIsResumable(Boolean isResumable) {
        this.isResumable = isResumable;
    }

    /**
     * <p>
     * Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a
     * chunk at a time.
     * </p>
     * 
     * @return Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to
     *         break the files into chunks before upload. The progress of the upload isn't continuous, because the file
     *         uploader uploads a chunk at a time.
     */

    public Boolean getIsResumable() {
        return this.isResumable;
    }

    /**
     * <p>
     * Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a
     * chunk at a time.
     * </p>
     * 
     * @param isResumable
     *        Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to
     *        break the files into chunks before upload. The progress of the upload isn't continuous, because the file
     *        uploader uploads a chunk at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withIsResumable(Boolean isResumable) {
        setIsResumable(isResumable);
        return this;
    }

    /**
     * <p>
     * Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a
     * chunk at a time.
     * </p>
     * 
     * @return Allows the file upload operation to be paused and resumed. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>isResumable</code> is set to <code>true</code>, the file uploader uses a multipart upload to
     *         break the files into chunks before upload. The progress of the upload isn't continuous, because the file
     *         uploader uploads a chunk at a time.
     */

    public Boolean isResumable() {
        return this.isResumable;
    }

    /**
     * <p>
     * Specifies the maximum number of files that can be selected to upload. The default value is an unlimited number of
     * files.
     * </p>
     * 
     * @param maxFileCount
     *        Specifies the maximum number of files that can be selected to upload. The default value is an unlimited
     *        number of files.
     */

    public void setMaxFileCount(Integer maxFileCount) {
        this.maxFileCount = maxFileCount;
    }

    /**
     * <p>
     * Specifies the maximum number of files that can be selected to upload. The default value is an unlimited number of
     * files.
     * </p>
     * 
     * @return Specifies the maximum number of files that can be selected to upload. The default value is an unlimited
     *         number of files.
     */

    public Integer getMaxFileCount() {
        return this.maxFileCount;
    }

    /**
     * <p>
     * Specifies the maximum number of files that can be selected to upload. The default value is an unlimited number of
     * files.
     * </p>
     * 
     * @param maxFileCount
     *        Specifies the maximum number of files that can be selected to upload. The default value is an unlimited
     *        number of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withMaxFileCount(Integer maxFileCount) {
        setMaxFileCount(maxFileCount);
        return this;
    }

    /**
     * <p>
     * The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file size.
     * </p>
     * 
     * @param maxSize
     *        The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file
     *        size.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file size.
     * </p>
     * 
     * @return The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file
     *         size.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file size.
     * </p>
     * 
     * @param maxSize
     *        The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file
     *        size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileUploaderFieldConfig withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
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
        if (getAccessLevel() != null)
            sb.append("AccessLevel: ").append(getAccessLevel()).append(",");
        if (getAcceptedFileTypes() != null)
            sb.append("AcceptedFileTypes: ").append(getAcceptedFileTypes()).append(",");
        if (getShowThumbnails() != null)
            sb.append("ShowThumbnails: ").append(getShowThumbnails()).append(",");
        if (getIsResumable() != null)
            sb.append("IsResumable: ").append(getIsResumable()).append(",");
        if (getMaxFileCount() != null)
            sb.append("MaxFileCount: ").append(getMaxFileCount()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileUploaderFieldConfig == false)
            return false;
        FileUploaderFieldConfig other = (FileUploaderFieldConfig) obj;
        if (other.getAccessLevel() == null ^ this.getAccessLevel() == null)
            return false;
        if (other.getAccessLevel() != null && other.getAccessLevel().equals(this.getAccessLevel()) == false)
            return false;
        if (other.getAcceptedFileTypes() == null ^ this.getAcceptedFileTypes() == null)
            return false;
        if (other.getAcceptedFileTypes() != null && other.getAcceptedFileTypes().equals(this.getAcceptedFileTypes()) == false)
            return false;
        if (other.getShowThumbnails() == null ^ this.getShowThumbnails() == null)
            return false;
        if (other.getShowThumbnails() != null && other.getShowThumbnails().equals(this.getShowThumbnails()) == false)
            return false;
        if (other.getIsResumable() == null ^ this.getIsResumable() == null)
            return false;
        if (other.getIsResumable() != null && other.getIsResumable().equals(this.getIsResumable()) == false)
            return false;
        if (other.getMaxFileCount() == null ^ this.getMaxFileCount() == null)
            return false;
        if (other.getMaxFileCount() != null && other.getMaxFileCount().equals(this.getMaxFileCount()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLevel() == null) ? 0 : getAccessLevel().hashCode());
        hashCode = prime * hashCode + ((getAcceptedFileTypes() == null) ? 0 : getAcceptedFileTypes().hashCode());
        hashCode = prime * hashCode + ((getShowThumbnails() == null) ? 0 : getShowThumbnails().hashCode());
        hashCode = prime * hashCode + ((getIsResumable() == null) ? 0 : getIsResumable().hashCode());
        hashCode = prime * hashCode + ((getMaxFileCount() == null) ? 0 : getMaxFileCount().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        return hashCode;
    }

    @Override
    public FileUploaderFieldConfig clone() {
        try {
            return (FileUploaderFieldConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FileUploaderFieldConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
