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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an import snapshot task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportSnapshotTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSnapshotTask implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * Describes an import snapshot task.
     * </p>
     */
    private SnapshotTaskDetail snapshotTaskDetail;

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @param description
     *        A description of the import snapshot task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @return A description of the import snapshot task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @param description
     *        A description of the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotTask withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import snapshot task.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @return The ID of the import snapshot task.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotTask withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * Describes an import snapshot task.
     * </p>
     * 
     * @param snapshotTaskDetail
     *        Describes an import snapshot task.
     */

    public void setSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
    }

    /**
     * <p>
     * Describes an import snapshot task.
     * </p>
     * 
     * @return Describes an import snapshot task.
     */

    public SnapshotTaskDetail getSnapshotTaskDetail() {
        return this.snapshotTaskDetail;
    }

    /**
     * <p>
     * Describes an import snapshot task.
     * </p>
     * 
     * @param snapshotTaskDetail
     *        Describes an import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotTask withSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        setSnapshotTaskDetail(snapshotTaskDetail);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId()).append(",");
        if (getSnapshotTaskDetail() != null)
            sb.append("SnapshotTaskDetail: ").append(getSnapshotTaskDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSnapshotTask == false)
            return false;
        ImportSnapshotTask other = (ImportSnapshotTask) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getSnapshotTaskDetail() == null ^ this.getSnapshotTaskDetail() == null)
            return false;
        if (other.getSnapshotTaskDetail() != null && other.getSnapshotTaskDetail().equals(this.getSnapshotTaskDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotTaskDetail() == null) ? 0 : getSnapshotTaskDetail().hashCode());
        return hashCode;
    }

    @Override
    public ImportSnapshotTask clone() {
        try {
            return (ImportSnapshotTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
