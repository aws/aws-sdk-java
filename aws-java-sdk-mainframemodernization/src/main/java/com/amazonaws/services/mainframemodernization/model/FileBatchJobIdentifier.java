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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A batch job identifier in which the batch job to run is identified by the file name and the relative path to the file
 * name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/FileBatchJobIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileBatchJobIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file name for the batch job identifier.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The relative path to the file name for the batch job identifier.
     * </p>
     */
    private String folderPath;

    /**
     * <p>
     * The file name for the batch job identifier.
     * </p>
     * 
     * @param fileName
     *        The file name for the batch job identifier.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The file name for the batch job identifier.
     * </p>
     * 
     * @return The file name for the batch job identifier.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The file name for the batch job identifier.
     * </p>
     * 
     * @param fileName
     *        The file name for the batch job identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileBatchJobIdentifier withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The relative path to the file name for the batch job identifier.
     * </p>
     * 
     * @param folderPath
     *        The relative path to the file name for the batch job identifier.
     */

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * <p>
     * The relative path to the file name for the batch job identifier.
     * </p>
     * 
     * @return The relative path to the file name for the batch job identifier.
     */

    public String getFolderPath() {
        return this.folderPath;
    }

    /**
     * <p>
     * The relative path to the file name for the batch job identifier.
     * </p>
     * 
     * @param folderPath
     *        The relative path to the file name for the batch job identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileBatchJobIdentifier withFolderPath(String folderPath) {
        setFolderPath(folderPath);
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
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getFolderPath() != null)
            sb.append("FolderPath: ").append(getFolderPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileBatchJobIdentifier == false)
            return false;
        FileBatchJobIdentifier other = (FileBatchJobIdentifier) obj;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFolderPath() == null ^ this.getFolderPath() == null)
            return false;
        if (other.getFolderPath() != null && other.getFolderPath().equals(this.getFolderPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getFolderPath() == null) ? 0 : getFolderPath().hashCode());
        return hashCode;
    }

    @Override
    public FileBatchJobIdentifier clone() {
        try {
            return (FileBatchJobIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.FileBatchJobIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
