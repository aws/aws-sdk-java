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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createTags(CreateTagsRequest) CreateTags operation}.
 * <p>
 * Creates or overwrites tags associated with a file system. Each tag is
 * a key-value pair. If a tag key specified in the request already exists
 * on the file system, this operation overwrites its value with the value
 * provided in the request. If you add the "Name" tag to your file
 * system, Amazon EFS returns it in the response to the
 * DescribeFileSystems API.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>elasticfilesystem:CreateTags</code> action.
 * </p>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createTags(CreateTagsRequest)
 */
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     */
    private String fileSystemId;

    /**
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     * object is a key-value pair.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @return String. The ID of the file system whose tags you want to modify. This
     *         operation modifies only the tags and not the file system.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    
    /**
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId String. The ID of the file system whose tags you want to modify. This
     *         operation modifies only the tags and not the file system.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
    
    /**
     * String. The ID of the file system whose tags you want to modify. This
     * operation modifies only the tags and not the file system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId String. The ID of the file system whose tags you want to modify. This
     *         operation modifies only the tags and not the file system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     * object is a key-value pair.
     *
     * @return An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *         object is a key-value pair.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     * object is a key-value pair.
     *
     * @param tags An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *         object is a key-value pair.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     * object is a key-value pair.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *         object is a key-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     * object is a key-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags An array of <code>Tag</code> objects to add. Each <code>Tag</code>
     *         object is a key-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getFileSystemId() != null) sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTagsRequest == false) return false;
        CreateTagsRequest other = (CreateTagsRequest)obj;
        
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null) return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTagsRequest clone() {
        
            return (CreateTagsRequest) super.clone();
    }

}
    