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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a folder in a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Folder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Folder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * The fully-qualified path of the folder in the repository.
     * </p>
     */
    private String absolutePath;
    /**
     * <p>
     * The relative path of the specified folder from the folder where the query originated.
     * </p>
     */
    private String relativePath;

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the folder.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * </p>
     * 
     * @return The full SHA-1 pointer of the tree information for the commit that contains the folder.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Folder withTreeId(String treeId) {
        setTreeId(treeId);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path of the folder in the repository.
     * </p>
     * 
     * @param absolutePath
     *        The fully-qualified path of the folder in the repository.
     */

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The fully-qualified path of the folder in the repository.
     * </p>
     * 
     * @return The fully-qualified path of the folder in the repository.
     */

    public String getAbsolutePath() {
        return this.absolutePath;
    }

    /**
     * <p>
     * The fully-qualified path of the folder in the repository.
     * </p>
     * 
     * @param absolutePath
     *        The fully-qualified path of the folder in the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Folder withAbsolutePath(String absolutePath) {
        setAbsolutePath(absolutePath);
        return this;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query originated.
     * </p>
     * 
     * @param relativePath
     *        The relative path of the specified folder from the folder where the query originated.
     */

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query originated.
     * </p>
     * 
     * @return The relative path of the specified folder from the folder where the query originated.
     */

    public String getRelativePath() {
        return this.relativePath;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query originated.
     * </p>
     * 
     * @param relativePath
     *        The relative path of the specified folder from the folder where the query originated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Folder withRelativePath(String relativePath) {
        setRelativePath(relativePath);
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
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId()).append(",");
        if (getAbsolutePath() != null)
            sb.append("AbsolutePath: ").append(getAbsolutePath()).append(",");
        if (getRelativePath() != null)
            sb.append("RelativePath: ").append(getRelativePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Folder == false)
            return false;
        Folder other = (Folder) obj;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        return hashCode;
    }

    @Override
    public Folder clone() {
        try {
            return (Folder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.FolderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
