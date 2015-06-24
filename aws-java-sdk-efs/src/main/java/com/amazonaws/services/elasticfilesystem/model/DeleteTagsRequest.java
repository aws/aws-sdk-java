/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteTagsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * String. The ID of the file system whose tags you want to delete.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * String. The ID of the file system whose tags you want to delete.
     * </p>
     * 
     * @param fileSystemId
     *        String. The ID of the file system whose tags you want to delete.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * String. The ID of the file system whose tags you want to delete.
     * </p>
     * 
     * @return String. The ID of the file system whose tags you want to delete.
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * String. The ID of the file system whose tags you want to delete.
     * </p>
     * 
     * @param fileSystemId
     *        String. The ID of the file system whose tags you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @return A list of tag keys to delete.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to delete.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(
                tagKeys);
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(
                    tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTagsRequest == false)
            return false;
        DeleteTagsRequest other = (DeleteTagsRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null
                && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTagsRequest clone() {
        return (DeleteTagsRequest) super.clone();
    }
}