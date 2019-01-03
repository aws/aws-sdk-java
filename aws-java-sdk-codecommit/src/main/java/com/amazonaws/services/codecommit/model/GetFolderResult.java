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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFolderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full commit ID used as a reference for which version of the folder content is returned.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The fully-qualified path of the folder whose contents are returned.
     * </p>
     */
    private String folderPath;
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the folder.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * The list of folders that exist beneath the specified folder, if any.
     * </p>
     */
    private java.util.List<Folder> subFolders;
    /**
     * <p>
     * The list of files that exist in the specified folder, if any.
     * </p>
     */
    private java.util.List<File> files;
    /**
     * <p>
     * The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * </p>
     */
    private java.util.List<SymbolicLink> symbolicLinks;
    /**
     * <p>
     * The list of submodules that exist in the specified folder, if any.
     * </p>
     */
    private java.util.List<SubModule> subModules;

    /**
     * <p>
     * The full commit ID used as a reference for which version of the folder content is returned.
     * </p>
     * 
     * @param commitId
     *        The full commit ID used as a reference for which version of the folder content is returned.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID used as a reference for which version of the folder content is returned.
     * </p>
     * 
     * @return The full commit ID used as a reference for which version of the folder content is returned.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full commit ID used as a reference for which version of the folder content is returned.
     * </p>
     * 
     * @param commitId
     *        The full commit ID used as a reference for which version of the folder content is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path of the folder whose contents are returned.
     * </p>
     * 
     * @param folderPath
     *        The fully-qualified path of the folder whose contents are returned.
     */

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * <p>
     * The fully-qualified path of the folder whose contents are returned.
     * </p>
     * 
     * @return The fully-qualified path of the folder whose contents are returned.
     */

    public String getFolderPath() {
        return this.folderPath;
    }

    /**
     * <p>
     * The fully-qualified path of the folder whose contents are returned.
     * </p>
     * 
     * @param folderPath
     *        The fully-qualified path of the folder whose contents are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withFolderPath(String folderPath) {
        setFolderPath(folderPath);
        return this;
    }

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

    public GetFolderResult withTreeId(String treeId) {
        setTreeId(treeId);
        return this;
    }

    /**
     * <p>
     * The list of folders that exist beneath the specified folder, if any.
     * </p>
     * 
     * @return The list of folders that exist beneath the specified folder, if any.
     */

    public java.util.List<Folder> getSubFolders() {
        return subFolders;
    }

    /**
     * <p>
     * The list of folders that exist beneath the specified folder, if any.
     * </p>
     * 
     * @param subFolders
     *        The list of folders that exist beneath the specified folder, if any.
     */

    public void setSubFolders(java.util.Collection<Folder> subFolders) {
        if (subFolders == null) {
            this.subFolders = null;
            return;
        }

        this.subFolders = new java.util.ArrayList<Folder>(subFolders);
    }

    /**
     * <p>
     * The list of folders that exist beneath the specified folder, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubFolders(java.util.Collection)} or {@link #withSubFolders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subFolders
     *        The list of folders that exist beneath the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSubFolders(Folder... subFolders) {
        if (this.subFolders == null) {
            setSubFolders(new java.util.ArrayList<Folder>(subFolders.length));
        }
        for (Folder ele : subFolders) {
            this.subFolders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of folders that exist beneath the specified folder, if any.
     * </p>
     * 
     * @param subFolders
     *        The list of folders that exist beneath the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSubFolders(java.util.Collection<Folder> subFolders) {
        setSubFolders(subFolders);
        return this;
    }

    /**
     * <p>
     * The list of files that exist in the specified folder, if any.
     * </p>
     * 
     * @return The list of files that exist in the specified folder, if any.
     */

    public java.util.List<File> getFiles() {
        return files;
    }

    /**
     * <p>
     * The list of files that exist in the specified folder, if any.
     * </p>
     * 
     * @param files
     *        The list of files that exist in the specified folder, if any.
     */

    public void setFiles(java.util.Collection<File> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<File>(files);
    }

    /**
     * <p>
     * The list of files that exist in the specified folder, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        The list of files that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withFiles(File... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<File>(files.length));
        }
        for (File ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of files that exist in the specified folder, if any.
     * </p>
     * 
     * @param files
     *        The list of files that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withFiles(java.util.Collection<File> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * </p>
     * 
     * @return The list of symbolic links to other files and folders that exist in the specified folder, if any.
     */

    public java.util.List<SymbolicLink> getSymbolicLinks() {
        return symbolicLinks;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * </p>
     * 
     * @param symbolicLinks
     *        The list of symbolic links to other files and folders that exist in the specified folder, if any.
     */

    public void setSymbolicLinks(java.util.Collection<SymbolicLink> symbolicLinks) {
        if (symbolicLinks == null) {
            this.symbolicLinks = null;
            return;
        }

        this.symbolicLinks = new java.util.ArrayList<SymbolicLink>(symbolicLinks);
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSymbolicLinks(java.util.Collection)} or {@link #withSymbolicLinks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param symbolicLinks
     *        The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSymbolicLinks(SymbolicLink... symbolicLinks) {
        if (this.symbolicLinks == null) {
            setSymbolicLinks(new java.util.ArrayList<SymbolicLink>(symbolicLinks.length));
        }
        for (SymbolicLink ele : symbolicLinks) {
            this.symbolicLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * </p>
     * 
     * @param symbolicLinks
     *        The list of symbolic links to other files and folders that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSymbolicLinks(java.util.Collection<SymbolicLink> symbolicLinks) {
        setSymbolicLinks(symbolicLinks);
        return this;
    }

    /**
     * <p>
     * The list of submodules that exist in the specified folder, if any.
     * </p>
     * 
     * @return The list of submodules that exist in the specified folder, if any.
     */

    public java.util.List<SubModule> getSubModules() {
        return subModules;
    }

    /**
     * <p>
     * The list of submodules that exist in the specified folder, if any.
     * </p>
     * 
     * @param subModules
     *        The list of submodules that exist in the specified folder, if any.
     */

    public void setSubModules(java.util.Collection<SubModule> subModules) {
        if (subModules == null) {
            this.subModules = null;
            return;
        }

        this.subModules = new java.util.ArrayList<SubModule>(subModules);
    }

    /**
     * <p>
     * The list of submodules that exist in the specified folder, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubModules(java.util.Collection)} or {@link #withSubModules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subModules
     *        The list of submodules that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSubModules(SubModule... subModules) {
        if (this.subModules == null) {
            setSubModules(new java.util.ArrayList<SubModule>(subModules.length));
        }
        for (SubModule ele : subModules) {
            this.subModules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of submodules that exist in the specified folder, if any.
     * </p>
     * 
     * @param subModules
     *        The list of submodules that exist in the specified folder, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withSubModules(java.util.Collection<SubModule> subModules) {
        setSubModules(subModules);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getFolderPath() != null)
            sb.append("FolderPath: ").append(getFolderPath()).append(",");
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId()).append(",");
        if (getSubFolders() != null)
            sb.append("SubFolders: ").append(getSubFolders()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getSymbolicLinks() != null)
            sb.append("SymbolicLinks: ").append(getSymbolicLinks()).append(",");
        if (getSubModules() != null)
            sb.append("SubModules: ").append(getSubModules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderResult == false)
            return false;
        GetFolderResult other = (GetFolderResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getFolderPath() == null ^ this.getFolderPath() == null)
            return false;
        if (other.getFolderPath() != null && other.getFolderPath().equals(this.getFolderPath()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getSubFolders() == null ^ this.getSubFolders() == null)
            return false;
        if (other.getSubFolders() != null && other.getSubFolders().equals(this.getSubFolders()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getSymbolicLinks() == null ^ this.getSymbolicLinks() == null)
            return false;
        if (other.getSymbolicLinks() != null && other.getSymbolicLinks().equals(this.getSymbolicLinks()) == false)
            return false;
        if (other.getSubModules() == null ^ this.getSubModules() == null)
            return false;
        if (other.getSubModules() != null && other.getSubModules().equals(this.getSubModules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getFolderPath() == null) ? 0 : getFolderPath().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getSubFolders() == null) ? 0 : getSubFolders().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getSymbolicLinks() == null) ? 0 : getSymbolicLinks().hashCode());
        hashCode = prime * hashCode + ((getSubModules() == null) ? 0 : getSubModules().hashCode());
        return hashCode;
    }

    @Override
    public GetFolderResult clone() {
        try {
            return (GetFolderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
