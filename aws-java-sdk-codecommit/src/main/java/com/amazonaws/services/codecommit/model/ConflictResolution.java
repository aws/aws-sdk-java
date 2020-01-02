/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ConflictResolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictResolution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<ReplaceContentEntry> replaceContents;
    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<DeleteFileEntry> deleteFiles;
    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<SetFileModeEntry> setFileModes;

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * 
     * @return Files to have content replaced as part of the merge conflict resolution.
     */

    public java.util.List<ReplaceContentEntry> getReplaceContents() {
        return replaceContents;
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * 
     * @param replaceContents
     *        Files to have content replaced as part of the merge conflict resolution.
     */

    public void setReplaceContents(java.util.Collection<ReplaceContentEntry> replaceContents) {
        if (replaceContents == null) {
            this.replaceContents = null;
            return;
        }

        this.replaceContents = new java.util.ArrayList<ReplaceContentEntry>(replaceContents);
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplaceContents(java.util.Collection)} or {@link #withReplaceContents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replaceContents
     *        Files to have content replaced as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withReplaceContents(ReplaceContentEntry... replaceContents) {
        if (this.replaceContents == null) {
            setReplaceContents(new java.util.ArrayList<ReplaceContentEntry>(replaceContents.length));
        }
        for (ReplaceContentEntry ele : replaceContents) {
            this.replaceContents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * 
     * @param replaceContents
     *        Files to have content replaced as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withReplaceContents(java.util.Collection<ReplaceContentEntry> replaceContents) {
        setReplaceContents(replaceContents);
        return this;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * 
     * @return Files to be deleted as part of the merge conflict resolution.
     */

    public java.util.List<DeleteFileEntry> getDeleteFiles() {
        return deleteFiles;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * 
     * @param deleteFiles
     *        Files to be deleted as part of the merge conflict resolution.
     */

    public void setDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        if (deleteFiles == null) {
            this.deleteFiles = null;
            return;
        }

        this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles);
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleteFiles(java.util.Collection)} or {@link #withDeleteFiles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deleteFiles
     *        Files to be deleted as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withDeleteFiles(DeleteFileEntry... deleteFiles) {
        if (this.deleteFiles == null) {
            setDeleteFiles(new java.util.ArrayList<DeleteFileEntry>(deleteFiles.length));
        }
        for (DeleteFileEntry ele : deleteFiles) {
            this.deleteFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * 
     * @param deleteFiles
     *        Files to be deleted as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        setDeleteFiles(deleteFiles);
        return this;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * 
     * @return File modes that are set as part of the merge conflict resolution.
     */

    public java.util.List<SetFileModeEntry> getSetFileModes() {
        return setFileModes;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * 
     * @param setFileModes
     *        File modes that are set as part of the merge conflict resolution.
     */

    public void setSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        if (setFileModes == null) {
            this.setFileModes = null;
            return;
        }

        this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes);
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSetFileModes(java.util.Collection)} or {@link #withSetFileModes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param setFileModes
     *        File modes that are set as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withSetFileModes(SetFileModeEntry... setFileModes) {
        if (this.setFileModes == null) {
            setSetFileModes(new java.util.ArrayList<SetFileModeEntry>(setFileModes.length));
        }
        for (SetFileModeEntry ele : setFileModes) {
            this.setFileModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * 
     * @param setFileModes
     *        File modes that are set as part of the merge conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        setSetFileModes(setFileModes);
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
        if (getReplaceContents() != null)
            sb.append("ReplaceContents: ").append(getReplaceContents()).append(",");
        if (getDeleteFiles() != null)
            sb.append("DeleteFiles: ").append(getDeleteFiles()).append(",");
        if (getSetFileModes() != null)
            sb.append("SetFileModes: ").append(getSetFileModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictResolution == false)
            return false;
        ConflictResolution other = (ConflictResolution) obj;
        if (other.getReplaceContents() == null ^ this.getReplaceContents() == null)
            return false;
        if (other.getReplaceContents() != null && other.getReplaceContents().equals(this.getReplaceContents()) == false)
            return false;
        if (other.getDeleteFiles() == null ^ this.getDeleteFiles() == null)
            return false;
        if (other.getDeleteFiles() != null && other.getDeleteFiles().equals(this.getDeleteFiles()) == false)
            return false;
        if (other.getSetFileModes() == null ^ this.getSetFileModes() == null)
            return false;
        if (other.getSetFileModes() != null && other.getSetFileModes().equals(this.getSetFileModes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplaceContents() == null) ? 0 : getReplaceContents().hashCode());
        hashCode = prime * hashCode + ((getDeleteFiles() == null) ? 0 : getDeleteFiles().hashCode());
        hashCode = prime * hashCode + ((getSetFileModes() == null) ? 0 : getSetFileModes().hashCode());
        return hashCode;
    }

    @Override
    public ConflictResolution clone() {
        try {
            return (ConflictResolution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ConflictResolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
