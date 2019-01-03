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
 * Returns information about the location of a change or comment in the comparison between two commits or a pull
 * request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the file being compared, including its extension and subdirectory, if any.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The position of a change within a compared file, in line number format.
     * </p>
     */
    private Long filePosition;
    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     * comparison.
     * </p>
     */
    private String relativeFileVersion;

    /**
     * <p>
     * The name of the file being compared, including its extension and subdirectory, if any.
     * </p>
     * 
     * @param filePath
     *        The name of the file being compared, including its extension and subdirectory, if any.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The name of the file being compared, including its extension and subdirectory, if any.
     * </p>
     * 
     * @return The name of the file being compared, including its extension and subdirectory, if any.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The name of the file being compared, including its extension and subdirectory, if any.
     * </p>
     * 
     * @param filePath
     *        The name of the file being compared, including its extension and subdirectory, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The position of a change within a compared file, in line number format.
     * </p>
     * 
     * @param filePosition
     *        The position of a change within a compared file, in line number format.
     */

    public void setFilePosition(Long filePosition) {
        this.filePosition = filePosition;
    }

    /**
     * <p>
     * The position of a change within a compared file, in line number format.
     * </p>
     * 
     * @return The position of a change within a compared file, in line number format.
     */

    public Long getFilePosition() {
        return this.filePosition;
    }

    /**
     * <p>
     * The position of a change within a compared file, in line number format.
     * </p>
     * 
     * @param filePosition
     *        The position of a change within a compared file, in line number format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withFilePosition(Long filePosition) {
        setFilePosition(filePosition);
        return this;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     * comparison.
     * </p>
     * 
     * @param relativeFileVersion
     *        In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     *        comparison.
     * @see RelativeFileVersionEnum
     */

    public void setRelativeFileVersion(String relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     * comparison.
     * </p>
     * 
     * @return In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     *         comparison.
     * @see RelativeFileVersionEnum
     */

    public String getRelativeFileVersion() {
        return this.relativeFileVersion;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     * comparison.
     * </p>
     * 
     * @param relativeFileVersion
     *        In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     *        comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeFileVersionEnum
     */

    public Location withRelativeFileVersion(String relativeFileVersion) {
        setRelativeFileVersion(relativeFileVersion);
        return this;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     * comparison.
     * </p>
     * 
     * @param relativeFileVersion
     *        In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that
     *        comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeFileVersionEnum
     */

    public Location withRelativeFileVersion(RelativeFileVersionEnum relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion.toString();
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
        if (getFilePosition() != null)
            sb.append("FilePosition: ").append(getFilePosition()).append(",");
        if (getRelativeFileVersion() != null)
            sb.append("RelativeFileVersion: ").append(getRelativeFileVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFilePosition() == null ^ this.getFilePosition() == null)
            return false;
        if (other.getFilePosition() != null && other.getFilePosition().equals(this.getFilePosition()) == false)
            return false;
        if (other.getRelativeFileVersion() == null ^ this.getRelativeFileVersion() == null)
            return false;
        if (other.getRelativeFileVersion() != null && other.getRelativeFileVersion().equals(this.getRelativeFileVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFilePosition() == null) ? 0 : getFilePosition().hashCode());
        hashCode = prime * hashCode + ((getRelativeFileVersion() == null) ? 0 : getRelativeFileVersion().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
