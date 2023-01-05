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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the file paths that were affected by the threat.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FilePaths" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilePaths implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to the infected or suspicious file on the resource it was detected on.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The name of the infected or suspicious file corresponding to the hash.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The hash value for the infected or suspicious file.
     * </p>
     */
    private String hash;

    /**
     * <p>
     * Path to the infected or suspicious file on the resource it was detected on.
     * </p>
     * 
     * @param filePath
     *        Path to the infected or suspicious file on the resource it was detected on.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * Path to the infected or suspicious file on the resource it was detected on.
     * </p>
     * 
     * @return Path to the infected or suspicious file on the resource it was detected on.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * Path to the infected or suspicious file on the resource it was detected on.
     * </p>
     * 
     * @param filePath
     *        Path to the infected or suspicious file on the resource it was detected on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePaths withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The name of the infected or suspicious file corresponding to the hash.
     * </p>
     * 
     * @param fileName
     *        The name of the infected or suspicious file corresponding to the hash.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the infected or suspicious file corresponding to the hash.
     * </p>
     * 
     * @return The name of the infected or suspicious file corresponding to the hash.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The name of the infected or suspicious file corresponding to the hash.
     * </p>
     * 
     * @param fileName
     *        The name of the infected or suspicious file corresponding to the hash.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePaths withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     * </p>
     * 
     * @param resourceId
     *        The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     * </p>
     * 
     * @param resourceId
     *        The Amazon Resource Name (ARN) of the resource on which the threat was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePaths withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The hash value for the infected or suspicious file.
     * </p>
     * 
     * @param hash
     *        The hash value for the infected or suspicious file.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The hash value for the infected or suspicious file.
     * </p>
     * 
     * @return The hash value for the infected or suspicious file.
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * The hash value for the infected or suspicious file.
     * </p>
     * 
     * @param hash
     *        The hash value for the infected or suspicious file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePaths withHash(String hash) {
        setHash(hash);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilePaths == false)
            return false;
        FilePaths other = (FilePaths) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        return hashCode;
    }

    @Override
    public FilePaths clone() {
        try {
            return (FilePaths) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FilePathsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
