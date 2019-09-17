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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for ReportTaskProgress.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportTaskProgressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Field> fields;

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @param taskId
     *        The ID of the task assigned to the task runner. This value is provided in the response for
     *        <a>PollForTask</a>.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @return The ID of the task assigned to the task runner. This value is provided in the response for
     *         <a>PollForTask</a>.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @param taskId
     *        The ID of the task assigned to the task runner. This value is provided in the response for
     *        <a>PollForTask</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskProgressRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * </p>
     * 
     * @return Key-value pairs that define the properties of the ReportTaskProgressInput object.
     */

    public java.util.List<Field> getFields() {
        if (fields == null) {
            fields = new com.amazonaws.internal.SdkInternalList<Field>();
        }
        return fields;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the ReportTaskProgressInput object.
     */

    public void setFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new com.amazonaws.internal.SdkInternalList<Field>(fields);
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskProgressRequest withFields(Field... fields) {
        if (this.fields == null) {
            setFields(new com.amazonaws.internal.SdkInternalList<Field>(fields.length));
        }
        for (Field ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the ReportTaskProgressInput object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskProgressRequest withFields(java.util.Collection<Field> fields) {
        setFields(fields);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportTaskProgressRequest == false)
            return false;
        ReportTaskProgressRequest other = (ReportTaskProgressRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public ReportTaskProgressRequest clone() {
        return (ReportTaskProgressRequest) super.clone();
    }

}
