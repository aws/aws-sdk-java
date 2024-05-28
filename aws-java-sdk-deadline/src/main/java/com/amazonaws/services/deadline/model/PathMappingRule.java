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
 * The details of a source and destination path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PathMappingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathMappingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination path.
     * </p>
     */
    private String destinationPath;
    /**
     * <p>
     * The source path.
     * </p>
     */
    private String sourcePath;
    /**
     * <p>
     * The source path format.
     * </p>
     */
    private String sourcePathFormat;

    /**
     * <p>
     * The destination path.
     * </p>
     * 
     * @param destinationPath
     *        The destination path.
     */

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    /**
     * <p>
     * The destination path.
     * </p>
     * 
     * @return The destination path.
     */

    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * <p>
     * The destination path.
     * </p>
     * 
     * @param destinationPath
     *        The destination path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMappingRule withDestinationPath(String destinationPath) {
        setDestinationPath(destinationPath);
        return this;
    }

    /**
     * <p>
     * The source path.
     * </p>
     * 
     * @param sourcePath
     *        The source path.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * The source path.
     * </p>
     * 
     * @return The source path.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * <p>
     * The source path.
     * </p>
     * 
     * @param sourcePath
     *        The source path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMappingRule withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * <p>
     * The source path format.
     * </p>
     * 
     * @param sourcePathFormat
     *        The source path format.
     * @see PathFormat
     */

    public void setSourcePathFormat(String sourcePathFormat) {
        this.sourcePathFormat = sourcePathFormat;
    }

    /**
     * <p>
     * The source path format.
     * </p>
     * 
     * @return The source path format.
     * @see PathFormat
     */

    public String getSourcePathFormat() {
        return this.sourcePathFormat;
    }

    /**
     * <p>
     * The source path format.
     * </p>
     * 
     * @param sourcePathFormat
     *        The source path format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathFormat
     */

    public PathMappingRule withSourcePathFormat(String sourcePathFormat) {
        setSourcePathFormat(sourcePathFormat);
        return this;
    }

    /**
     * <p>
     * The source path format.
     * </p>
     * 
     * @param sourcePathFormat
     *        The source path format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathFormat
     */

    public PathMappingRule withSourcePathFormat(PathFormat sourcePathFormat) {
        this.sourcePathFormat = sourcePathFormat.toString();
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
        if (getDestinationPath() != null)
            sb.append("DestinationPath: ").append(getDestinationPath()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getSourcePathFormat() != null)
            sb.append("SourcePathFormat: ").append(getSourcePathFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathMappingRule == false)
            return false;
        PathMappingRule other = (PathMappingRule) obj;
        if (other.getDestinationPath() == null ^ this.getDestinationPath() == null)
            return false;
        if (other.getDestinationPath() != null && other.getDestinationPath().equals(this.getDestinationPath()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getSourcePathFormat() == null ^ this.getSourcePathFormat() == null)
            return false;
        if (other.getSourcePathFormat() != null && other.getSourcePathFormat().equals(this.getSourcePathFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPath() == null) ? 0 : getDestinationPath().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getSourcePathFormat() == null) ? 0 : getSourcePathFormat().hashCode());
        return hashCode;
    }

    @Override
    public PathMappingRule clone() {
        try {
            return (PathMappingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.PathMappingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
