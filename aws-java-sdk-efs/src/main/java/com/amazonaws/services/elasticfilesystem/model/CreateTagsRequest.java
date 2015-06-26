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
public class CreateTagsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * </p>
     * 
     * @param fileSystemId
     *        String. The ID of the file system whose tags you want to modify.
     *        This operation modifies only the tags and not the file system.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * </p>
     * 
     * @return String. The ID of the file system whose tags you want to modify.
     *         This operation modifies only the tags and not the file system.
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * </p>
     * 
     * @param fileSystemId
     *        String. The ID of the file system whose tags you want to modify.
     *        This operation modifies only the tags and not the file system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * 
     * @return An array of <code>Tag</code> objects to add. Each
     *         <code>Tag</code> object is a key-value pair.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *        object is a key-value pair.
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
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *        object is a key-value pair.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
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
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *        object is a key-value pair.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
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
                + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTagsRequest clone() {
        return (CreateTagsRequest) super.clone();
    }
}