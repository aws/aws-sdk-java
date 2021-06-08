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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for the Amazon FSx for Lustre file system being deleted in the <code>DeleteFileSystem</code>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystemLustreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileSystemLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are deleting.
     * By default, Amazon FSx will not take a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. (Default = true)
     * </p>
     */
    private Boolean skipFinalBackup;
    /**
     * <p>
     * Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags to the
     * final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and you specify
     * one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy any existing file
     * system tags to the backup.
     * </p>
     */
    private java.util.List<Tag> finalBackupTags;

    /**
     * <p>
     * Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are deleting.
     * By default, Amazon FSx will not take a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. (Default = true)
     * </p>
     * 
     * @param skipFinalBackup
     *        Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are
     *        deleting. By default, Amazon FSx will not take a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. (Default = true)
     */

    public void setSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
    }

    /**
     * <p>
     * Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are deleting.
     * By default, Amazon FSx will not take a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. (Default = true)
     * </p>
     * 
     * @return Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are
     *         deleting. By default, Amazon FSx will not take a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. (Default = true)
     */

    public Boolean getSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are deleting.
     * By default, Amazon FSx will not take a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. (Default = true)
     * </p>
     * 
     * @param skipFinalBackup
     *        Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are
     *        deleting. By default, Amazon FSx will not take a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. (Default = true)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemLustreConfiguration withSkipFinalBackup(Boolean skipFinalBackup) {
        setSkipFinalBackup(skipFinalBackup);
        return this;
    }

    /**
     * <p>
     * Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are deleting.
     * By default, Amazon FSx will not take a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. (Default = true)
     * </p>
     * 
     * @return Set <code>SkipFinalBackup</code> to false if you want to take a final backup of the file system you are
     *         deleting. By default, Amazon FSx will not take a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. (Default = true)
     */

    public Boolean isSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags to the
     * final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and you specify
     * one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy any existing file
     * system tags to the backup.
     * </p>
     * 
     * @return Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags
     *         to the final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and
     *         you specify one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not
     *         copy any existing file system tags to the backup.
     */

    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * <p>
     * Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags to the
     * final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and you specify
     * one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy any existing file
     * system tags to the backup.
     * </p>
     * 
     * @param finalBackupTags
     *        Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags
     *        to the final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and
     *        you specify one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy
     *        any existing file system tags to the backup.
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
     * Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags to the
     * final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and you specify
     * one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy any existing file
     * system tags to the backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalBackupTags(java.util.Collection)} or {@link #withFinalBackupTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param finalBackupTags
     *        Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags
     *        to the final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and
     *        you specify one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy
     *        any existing file system tags to the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemLustreConfiguration withFinalBackupTags(Tag... finalBackupTags) {
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
     * Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags to the
     * final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and you specify
     * one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy any existing file
     * system tags to the backup.
     * </p>
     * 
     * @param finalBackupTags
     *        Use if <code>SkipFinalBackup</code> is set to <code>false</code>, and you want to apply an array of tags
     *        to the final backup. If you have set the file system property <code>CopyTagsToBackups</code> to true, and
     *        you specify one or more <code>FinalBackupTags</code> when deleting a file system, Amazon FSx will not copy
     *        any existing file system tags to the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemLustreConfiguration withFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
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
            sb.append("FinalBackupTags: ").append(getFinalBackupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemLustreConfiguration == false)
            return false;
        DeleteFileSystemLustreConfiguration other = (DeleteFileSystemLustreConfiguration) obj;
        if (other.getSkipFinalBackup() == null ^ this.getSkipFinalBackup() == null)
            return false;
        if (other.getSkipFinalBackup() != null && other.getSkipFinalBackup().equals(this.getSkipFinalBackup()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipFinalBackup() == null) ? 0 : getSkipFinalBackup().hashCode());
        hashCode = prime * hashCode + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileSystemLustreConfiguration clone() {
        try {
            return (DeleteFileSystemLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteFileSystemLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
