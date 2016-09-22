/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the status of an export task.
 * </p>
 */
public class ExportTaskExecutionInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A point in time when the export task got created.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * A point in time when the export task got completed.
     * </p>
     */
    private Long completionTime;

    /**
     * <p>
     * A point in time when the export task got created.
     * </p>
     * 
     * @param creationTime
     *        A point in time when the export task got created.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A point in time when the export task got created.
     * </p>
     * 
     * @return A point in time when the export task got created.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A point in time when the export task got created.
     * </p>
     * 
     * @param creationTime
     *        A point in time when the export task got created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskExecutionInfo withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A point in time when the export task got completed.
     * </p>
     * 
     * @param completionTime
     *        A point in time when the export task got completed.
     */

    public void setCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A point in time when the export task got completed.
     * </p>
     * 
     * @return A point in time when the export task got completed.
     */

    public Long getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A point in time when the export task got completed.
     * </p>
     * 
     * @param completionTime
     *        A point in time when the export task got completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskExecutionInfo withCompletionTime(Long completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskExecutionInfo == false)
            return false;
        ExportTaskExecutionInfo other = (ExportTaskExecutionInfo) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        return hashCode;
    }

    @Override
    public ExportTaskExecutionInfo clone() {
        try {
            return (ExportTaskExecutionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
