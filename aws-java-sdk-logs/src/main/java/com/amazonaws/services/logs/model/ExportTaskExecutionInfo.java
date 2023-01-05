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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the status of an export task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ExportTaskExecutionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTaskExecutionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The completion time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     */
    private Long completionTime;

    /**
     * <p>
     * The creation time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the export task, expressed as the number of milliseconds after
     *        <code>Jan 1, 1970 00:00:00 UTC</code>.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @return The creation time of the export task, expressed as the number of milliseconds after
     *         <code>Jan 1, 1970 00:00:00 UTC</code>.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the export task, expressed as the number of milliseconds after
     *        <code>Jan 1, 1970 00:00:00 UTC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskExecutionInfo withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @param completionTime
     *        The completion time of the export task, expressed as the number of milliseconds after
     *        <code>Jan 1, 1970 00:00:00 UTC</code>.
     */

    public void setCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @return The completion time of the export task, expressed as the number of milliseconds after
     *         <code>Jan 1, 1970 00:00:00 UTC</code>.
     */

    public Long getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of milliseconds after
     * <code>Jan 1, 1970 00:00:00 UTC</code>.
     * </p>
     * 
     * @param completionTime
     *        The completion time of the export task, expressed as the number of milliseconds after
     *        <code>Jan 1, 1970 00:00:00 UTC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskExecutionInfo withCompletionTime(Long completionTime) {
        setCompletionTime(completionTime);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.ExportTaskExecutionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
