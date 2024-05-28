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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a version of a file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/FileVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileVersion implements Serializable, Cloneable, StructuredPojo {

    private Commit commit;
    /**
     * <p>
     * The blob ID of the object that represents the content of the file in this version.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The name and path of the file at which this blob is indexed which contains the data for this version of the file.
     * This value will vary between file versions if a file is renamed or if its path changes.
     * </p>
     */
    private String path;
    /**
     * <p>
     * An array of commit IDs that contain more recent versions of this file. If there are no additional versions of the
     * file, this array will be empty.
     * </p>
     */
    private java.util.List<String> revisionChildren;

    /**
     * @param commit
     */

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    /**
     * @return
     */

    public Commit getCommit() {
        return this.commit;
    }

    /**
     * @param commit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileVersion withCommit(Commit commit) {
        setCommit(commit);
        return this;
    }

    /**
     * <p>
     * The blob ID of the object that represents the content of the file in this version.
     * </p>
     * 
     * @param blobId
     *        The blob ID of the object that represents the content of the file in this version.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the content of the file in this version.
     * </p>
     * 
     * @return The blob ID of the object that represents the content of the file in this version.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the content of the file in this version.
     * </p>
     * 
     * @param blobId
     *        The blob ID of the object that represents the content of the file in this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileVersion withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The name and path of the file at which this blob is indexed which contains the data for this version of the file.
     * This value will vary between file versions if a file is renamed or if its path changes.
     * </p>
     * 
     * @param path
     *        The name and path of the file at which this blob is indexed which contains the data for this version of
     *        the file. This value will vary between file versions if a file is renamed or if its path changes.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The name and path of the file at which this blob is indexed which contains the data for this version of the file.
     * This value will vary between file versions if a file is renamed or if its path changes.
     * </p>
     * 
     * @return The name and path of the file at which this blob is indexed which contains the data for this version of
     *         the file. This value will vary between file versions if a file is renamed or if its path changes.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The name and path of the file at which this blob is indexed which contains the data for this version of the file.
     * This value will vary between file versions if a file is renamed or if its path changes.
     * </p>
     * 
     * @param path
     *        The name and path of the file at which this blob is indexed which contains the data for this version of
     *        the file. This value will vary between file versions if a file is renamed or if its path changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileVersion withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * An array of commit IDs that contain more recent versions of this file. If there are no additional versions of the
     * file, this array will be empty.
     * </p>
     * 
     * @return An array of commit IDs that contain more recent versions of this file. If there are no additional
     *         versions of the file, this array will be empty.
     */

    public java.util.List<String> getRevisionChildren() {
        return revisionChildren;
    }

    /**
     * <p>
     * An array of commit IDs that contain more recent versions of this file. If there are no additional versions of the
     * file, this array will be empty.
     * </p>
     * 
     * @param revisionChildren
     *        An array of commit IDs that contain more recent versions of this file. If there are no additional versions
     *        of the file, this array will be empty.
     */

    public void setRevisionChildren(java.util.Collection<String> revisionChildren) {
        if (revisionChildren == null) {
            this.revisionChildren = null;
            return;
        }

        this.revisionChildren = new java.util.ArrayList<String>(revisionChildren);
    }

    /**
     * <p>
     * An array of commit IDs that contain more recent versions of this file. If there are no additional versions of the
     * file, this array will be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisionChildren(java.util.Collection)} or {@link #withRevisionChildren(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param revisionChildren
     *        An array of commit IDs that contain more recent versions of this file. If there are no additional versions
     *        of the file, this array will be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileVersion withRevisionChildren(String... revisionChildren) {
        if (this.revisionChildren == null) {
            setRevisionChildren(new java.util.ArrayList<String>(revisionChildren.length));
        }
        for (String ele : revisionChildren) {
            this.revisionChildren.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of commit IDs that contain more recent versions of this file. If there are no additional versions of the
     * file, this array will be empty.
     * </p>
     * 
     * @param revisionChildren
     *        An array of commit IDs that contain more recent versions of this file. If there are no additional versions
     *        of the file, this array will be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileVersion withRevisionChildren(java.util.Collection<String> revisionChildren) {
        setRevisionChildren(revisionChildren);
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
        if (getCommit() != null)
            sb.append("Commit: ").append(getCommit()).append(",");
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRevisionChildren() != null)
            sb.append("RevisionChildren: ").append(getRevisionChildren());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileVersion == false)
            return false;
        FileVersion other = (FileVersion) obj;
        if (other.getCommit() == null ^ this.getCommit() == null)
            return false;
        if (other.getCommit() != null && other.getCommit().equals(this.getCommit()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRevisionChildren() == null ^ this.getRevisionChildren() == null)
            return false;
        if (other.getRevisionChildren() != null && other.getRevisionChildren().equals(this.getRevisionChildren()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommit() == null) ? 0 : getCommit().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRevisionChildren() == null) ? 0 : getRevisionChildren().hashCode());
        return hashCode;
    }

    @Override
    public FileVersion clone() {
        try {
            return (FileVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.FileVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
