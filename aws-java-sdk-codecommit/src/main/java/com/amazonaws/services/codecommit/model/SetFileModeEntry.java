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
 * Information about the file mode changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/SetFileModeEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetFileModeEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The file mode for the file.
     * </p>
     */
    private String fileMode;

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file, including the name of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @return The full path to the file, including the name of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file, including the name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetFileModeEntry withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * 
     * @param fileMode
     *        The file mode for the file.
     * @see FileModeTypeEnum
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * 
     * @return The file mode for the file.
     * @see FileModeTypeEnum
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * 
     * @param fileMode
     *        The file mode for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public SetFileModeEntry withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * 
     * @param fileMode
     *        The file mode for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public SetFileModeEntry withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
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
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetFileModeEntry == false)
            return false;
        SetFileModeEntry other = (SetFileModeEntry) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public SetFileModeEntry clone() {
        try {
            return (SetFileModeEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.SetFileModeEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
