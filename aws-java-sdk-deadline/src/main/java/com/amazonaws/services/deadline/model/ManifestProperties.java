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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the manifest that links a job's source information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ManifestProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManifestProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file system location name.
     * </p>
     */
    private String fileSystemLocationName;
    /**
     * <p>
     * The has value of the file.
     * </p>
     */
    private String inputManifestHash;
    /**
     * <p>
     * The file path.
     * </p>
     */
    private String inputManifestPath;
    /**
     * <p>
     * The file path relative to the directory.
     * </p>
     */
    private java.util.List<String> outputRelativeDirectories;
    /**
     * <p>
     * The file's root path.
     * </p>
     */
    private String rootPath;
    /**
     * <p>
     * The format of the root path.
     * </p>
     */
    private String rootPathFormat;

    /**
     * <p>
     * The file system location name.
     * </p>
     * 
     * @param fileSystemLocationName
     *        The file system location name.
     */

    public void setFileSystemLocationName(String fileSystemLocationName) {
        this.fileSystemLocationName = fileSystemLocationName;
    }

    /**
     * <p>
     * The file system location name.
     * </p>
     * 
     * @return The file system location name.
     */

    public String getFileSystemLocationName() {
        return this.fileSystemLocationName;
    }

    /**
     * <p>
     * The file system location name.
     * </p>
     * 
     * @param fileSystemLocationName
     *        The file system location name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withFileSystemLocationName(String fileSystemLocationName) {
        setFileSystemLocationName(fileSystemLocationName);
        return this;
    }

    /**
     * <p>
     * The has value of the file.
     * </p>
     * 
     * @param inputManifestHash
     *        The has value of the file.
     */

    public void setInputManifestHash(String inputManifestHash) {
        this.inputManifestHash = inputManifestHash;
    }

    /**
     * <p>
     * The has value of the file.
     * </p>
     * 
     * @return The has value of the file.
     */

    public String getInputManifestHash() {
        return this.inputManifestHash;
    }

    /**
     * <p>
     * The has value of the file.
     * </p>
     * 
     * @param inputManifestHash
     *        The has value of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withInputManifestHash(String inputManifestHash) {
        setInputManifestHash(inputManifestHash);
        return this;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @param inputManifestPath
     *        The file path.
     */

    public void setInputManifestPath(String inputManifestPath) {
        this.inputManifestPath = inputManifestPath;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @return The file path.
     */

    public String getInputManifestPath() {
        return this.inputManifestPath;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @param inputManifestPath
     *        The file path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withInputManifestPath(String inputManifestPath) {
        setInputManifestPath(inputManifestPath);
        return this;
    }

    /**
     * <p>
     * The file path relative to the directory.
     * </p>
     * 
     * @return The file path relative to the directory.
     */

    public java.util.List<String> getOutputRelativeDirectories() {
        return outputRelativeDirectories;
    }

    /**
     * <p>
     * The file path relative to the directory.
     * </p>
     * 
     * @param outputRelativeDirectories
     *        The file path relative to the directory.
     */

    public void setOutputRelativeDirectories(java.util.Collection<String> outputRelativeDirectories) {
        if (outputRelativeDirectories == null) {
            this.outputRelativeDirectories = null;
            return;
        }

        this.outputRelativeDirectories = new java.util.ArrayList<String>(outputRelativeDirectories);
    }

    /**
     * <p>
     * The file path relative to the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputRelativeDirectories(java.util.Collection)} or
     * {@link #withOutputRelativeDirectories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param outputRelativeDirectories
     *        The file path relative to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withOutputRelativeDirectories(String... outputRelativeDirectories) {
        if (this.outputRelativeDirectories == null) {
            setOutputRelativeDirectories(new java.util.ArrayList<String>(outputRelativeDirectories.length));
        }
        for (String ele : outputRelativeDirectories) {
            this.outputRelativeDirectories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file path relative to the directory.
     * </p>
     * 
     * @param outputRelativeDirectories
     *        The file path relative to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withOutputRelativeDirectories(java.util.Collection<String> outputRelativeDirectories) {
        setOutputRelativeDirectories(outputRelativeDirectories);
        return this;
    }

    /**
     * <p>
     * The file's root path.
     * </p>
     * 
     * @param rootPath
     *        The file's root path.
     */

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    /**
     * <p>
     * The file's root path.
     * </p>
     * 
     * @return The file's root path.
     */

    public String getRootPath() {
        return this.rootPath;
    }

    /**
     * <p>
     * The file's root path.
     * </p>
     * 
     * @param rootPath
     *        The file's root path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestProperties withRootPath(String rootPath) {
        setRootPath(rootPath);
        return this;
    }

    /**
     * <p>
     * The format of the root path.
     * </p>
     * 
     * @param rootPathFormat
     *        The format of the root path.
     * @see PathFormat
     */

    public void setRootPathFormat(String rootPathFormat) {
        this.rootPathFormat = rootPathFormat;
    }

    /**
     * <p>
     * The format of the root path.
     * </p>
     * 
     * @return The format of the root path.
     * @see PathFormat
     */

    public String getRootPathFormat() {
        return this.rootPathFormat;
    }

    /**
     * <p>
     * The format of the root path.
     * </p>
     * 
     * @param rootPathFormat
     *        The format of the root path.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathFormat
     */

    public ManifestProperties withRootPathFormat(String rootPathFormat) {
        setRootPathFormat(rootPathFormat);
        return this;
    }

    /**
     * <p>
     * The format of the root path.
     * </p>
     * 
     * @param rootPathFormat
     *        The format of the root path.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathFormat
     */

    public ManifestProperties withRootPathFormat(PathFormat rootPathFormat) {
        this.rootPathFormat = rootPathFormat.toString();
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
        if (getFileSystemLocationName() != null)
            sb.append("FileSystemLocationName: ").append("***Sensitive Data Redacted***").append(",");
        if (getInputManifestHash() != null)
            sb.append("InputManifestHash: ").append(getInputManifestHash()).append(",");
        if (getInputManifestPath() != null)
            sb.append("InputManifestPath: ").append(getInputManifestPath()).append(",");
        if (getOutputRelativeDirectories() != null)
            sb.append("OutputRelativeDirectories: ").append(getOutputRelativeDirectories()).append(",");
        if (getRootPath() != null)
            sb.append("RootPath: ").append(getRootPath()).append(",");
        if (getRootPathFormat() != null)
            sb.append("RootPathFormat: ").append(getRootPathFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManifestProperties == false)
            return false;
        ManifestProperties other = (ManifestProperties) obj;
        if (other.getFileSystemLocationName() == null ^ this.getFileSystemLocationName() == null)
            return false;
        if (other.getFileSystemLocationName() != null && other.getFileSystemLocationName().equals(this.getFileSystemLocationName()) == false)
            return false;
        if (other.getInputManifestHash() == null ^ this.getInputManifestHash() == null)
            return false;
        if (other.getInputManifestHash() != null && other.getInputManifestHash().equals(this.getInputManifestHash()) == false)
            return false;
        if (other.getInputManifestPath() == null ^ this.getInputManifestPath() == null)
            return false;
        if (other.getInputManifestPath() != null && other.getInputManifestPath().equals(this.getInputManifestPath()) == false)
            return false;
        if (other.getOutputRelativeDirectories() == null ^ this.getOutputRelativeDirectories() == null)
            return false;
        if (other.getOutputRelativeDirectories() != null && other.getOutputRelativeDirectories().equals(this.getOutputRelativeDirectories()) == false)
            return false;
        if (other.getRootPath() == null ^ this.getRootPath() == null)
            return false;
        if (other.getRootPath() != null && other.getRootPath().equals(this.getRootPath()) == false)
            return false;
        if (other.getRootPathFormat() == null ^ this.getRootPathFormat() == null)
            return false;
        if (other.getRootPathFormat() != null && other.getRootPathFormat().equals(this.getRootPathFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemLocationName() == null) ? 0 : getFileSystemLocationName().hashCode());
        hashCode = prime * hashCode + ((getInputManifestHash() == null) ? 0 : getInputManifestHash().hashCode());
        hashCode = prime * hashCode + ((getInputManifestPath() == null) ? 0 : getInputManifestPath().hashCode());
        hashCode = prime * hashCode + ((getOutputRelativeDirectories() == null) ? 0 : getOutputRelativeDirectories().hashCode());
        hashCode = prime * hashCode + ((getRootPath() == null) ? 0 : getRootPath().hashCode());
        hashCode = prime * hashCode + ((getRootPathFormat() == null) ? 0 : getRootPathFormat().hashCode());
        return hashCode;
    }

    @Override
    public ManifestProperties clone() {
        try {
            return (ManifestProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.ManifestPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
