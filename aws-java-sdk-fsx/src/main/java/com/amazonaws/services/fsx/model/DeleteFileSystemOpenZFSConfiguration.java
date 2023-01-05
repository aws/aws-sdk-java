/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for the Amazon FSx for OpenZFS file system used in the <code>DeleteFileSystem</code>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystemOpenZFSConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileSystemOpenZFSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip taking a final backup, set this value to <code>true</code>.
     * </p>
     */
    private Boolean skipFinalBackup;
    /**
     * <p>
     * A list of tags to apply to the file system's final backup.
     * </p>
     */
    private java.util.List<Tag> finalBackupTags;
    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     */
    private java.util.List<String> options;

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip taking a final backup, set this value to <code>true</code>.
     * </p>
     * 
     * @param skipFinalBackup
     *        By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *        highly recommend taking the final backup. If you want to skip taking a final backup, set this value to
     *        <code>true</code>.
     */

    public void setSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip taking a final backup, set this value to <code>true</code>.
     * </p>
     * 
     * @return By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip taking a final backup, set this value to
     *         <code>true</code>.
     */

    public Boolean getSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip taking a final backup, set this value to <code>true</code>.
     * </p>
     * 
     * @param skipFinalBackup
     *        By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *        highly recommend taking the final backup. If you want to skip taking a final backup, set this value to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withSkipFinalBackup(Boolean skipFinalBackup) {
        setSkipFinalBackup(skipFinalBackup);
        return this;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip taking a final backup, set this value to <code>true</code>.
     * </p>
     * 
     * @return By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip taking a final backup, set this value to
     *         <code>true</code>.
     */

    public Boolean isSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * A list of tags to apply to the file system's final backup.
     * </p>
     * 
     * @return A list of tags to apply to the file system's final backup.
     */

    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * <p>
     * A list of tags to apply to the file system's final backup.
     * </p>
     * 
     * @param finalBackupTags
     *        A list of tags to apply to the file system's final backup.
     */

    public void setFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        if (finalBackupTags == null) {
            this.finalBackupTags = null;
            return;
        }

        this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags);
    }

    /**
     * <p>
     * A list of tags to apply to the file system's final backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalBackupTags(java.util.Collection)} or {@link #withFinalBackupTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param finalBackupTags
     *        A list of tags to apply to the file system's final backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withFinalBackupTags(Tag... finalBackupTags) {
        if (this.finalBackupTags == null) {
            setFinalBackupTags(new java.util.ArrayList<Tag>(finalBackupTags.length));
        }
        for (Tag ele : finalBackupTags) {
            this.finalBackupTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the file system's final backup.
     * </p>
     * 
     * @param finalBackupTags
     *        A list of tags to apply to the file system's final backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
        return this;
    }

    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     * 
     * @return To delete a file system if there are child volumes present below the root volume, use the string
     *         <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use
     *         this option, the delete request will fail.
     * @see DeleteFileSystemOpenZFSOption
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     * 
     * @param options
     *        To delete a file system if there are child volumes present below the root volume, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use
     *        this option, the delete request will fail.
     * @see DeleteFileSystemOpenZFSOption
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        To delete a file system if there are child volumes present below the root volume, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use
     *        this option, the delete request will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteFileSystemOpenZFSOption
     */

    public DeleteFileSystemOpenZFSConfiguration withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     * 
     * @param options
     *        To delete a file system if there are child volumes present below the root volume, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use
     *        this option, the delete request will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteFileSystemOpenZFSOption
     */

    public DeleteFileSystemOpenZFSConfiguration withOptions(java.util.Collection<String> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * To delete a file system if there are child volumes present below the root volume, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use this
     * option, the delete request will fail.
     * </p>
     * 
     * @param options
     *        To delete a file system if there are child volumes present below the root volume, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>. If your file system has child volumes and you don't use
     *        this option, the delete request will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteFileSystemOpenZFSOption
     */

    public DeleteFileSystemOpenZFSConfiguration withOptions(DeleteFileSystemOpenZFSOption... options) {
        java.util.ArrayList<String> optionsCopy = new java.util.ArrayList<String>(options.length);
        for (DeleteFileSystemOpenZFSOption value : options) {
            optionsCopy.add(value.toString());
        }
        if (getOptions() == null) {
            setOptions(optionsCopy);
        } else {
            getOptions().addAll(optionsCopy);
        }
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
        if (getSkipFinalBackup() != null)
            sb.append("SkipFinalBackup: ").append(getSkipFinalBackup()).append(",");
        if (getFinalBackupTags() != null)
            sb.append("FinalBackupTags: ").append(getFinalBackupTags()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemOpenZFSConfiguration == false)
            return false;
        DeleteFileSystemOpenZFSConfiguration other = (DeleteFileSystemOpenZFSConfiguration) obj;
        if (other.getSkipFinalBackup() == null ^ this.getSkipFinalBackup() == null)
            return false;
        if (other.getSkipFinalBackup() != null && other.getSkipFinalBackup().equals(this.getSkipFinalBackup()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipFinalBackup() == null) ? 0 : getSkipFinalBackup().hashCode());
        hashCode = prime * hashCode + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileSystemOpenZFSConfiguration clone() {
        try {
            return (DeleteFileSystemOpenZFSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteFileSystemOpenZFSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
