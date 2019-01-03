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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MappingEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the source table.
     * </p>
     */
    private String sourceTable;
    /**
     * <p>
     * The source path.
     * </p>
     */
    private String sourcePath;
    /**
     * <p>
     * The source type.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The target table.
     * </p>
     */
    private String targetTable;
    /**
     * <p>
     * The target path.
     * </p>
     */
    private String targetPath;
    /**
     * <p>
     * The target type.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @param sourceTable
     *        The name of the source table.
     */

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @return The name of the source table.
     */

    public String getSourceTable() {
        return this.sourceTable;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @param sourceTable
     *        The name of the source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingEntry withSourceTable(String sourceTable) {
        setSourceTable(sourceTable);
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

    public MappingEntry withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @return The source type.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingEntry withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The target table.
     * </p>
     * 
     * @param targetTable
     *        The target table.
     */

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * <p>
     * The target table.
     * </p>
     * 
     * @return The target table.
     */

    public String getTargetTable() {
        return this.targetTable;
    }

    /**
     * <p>
     * The target table.
     * </p>
     * 
     * @param targetTable
     *        The target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingEntry withTargetTable(String targetTable) {
        setTargetTable(targetTable);
        return this;
    }

    /**
     * <p>
     * The target path.
     * </p>
     * 
     * @param targetPath
     *        The target path.
     */

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    /**
     * <p>
     * The target path.
     * </p>
     * 
     * @return The target path.
     */

    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * <p>
     * The target path.
     * </p>
     * 
     * @param targetPath
     *        The target path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingEntry withTargetPath(String targetPath) {
        setTargetPath(targetPath);
        return this;
    }

    /**
     * <p>
     * The target type.
     * </p>
     * 
     * @param targetType
     *        The target type.
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The target type.
     * </p>
     * 
     * @return The target type.
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The target type.
     * </p>
     * 
     * @param targetType
     *        The target type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingEntry withTargetType(String targetType) {
        setTargetType(targetType);
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
        if (getSourceTable() != null)
            sb.append("SourceTable: ").append(getSourceTable()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getTargetTable() != null)
            sb.append("TargetTable: ").append(getTargetTable()).append(",");
        if (getTargetPath() != null)
            sb.append("TargetPath: ").append(getTargetPath()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingEntry == false)
            return false;
        MappingEntry other = (MappingEntry) obj;
        if (other.getSourceTable() == null ^ this.getSourceTable() == null)
            return false;
        if (other.getSourceTable() != null && other.getSourceTable().equals(this.getSourceTable()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        if (other.getTargetPath() == null ^ this.getTargetPath() == null)
            return false;
        if (other.getTargetPath() != null && other.getTargetPath().equals(this.getTargetPath()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceTable() == null) ? 0 : getSourceTable().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        hashCode = prime * hashCode + ((getTargetPath() == null) ? 0 : getTargetPath().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public MappingEntry clone() {
        try {
            return (MappingEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MappingEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
