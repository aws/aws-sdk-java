/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectMitigationActionsTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The description of a task.
     * </p>
     */
    private DetectMitigationActionsTaskSummary taskSummary;

    /**
     * <p>
     * The description of a task.
     * </p>
     * 
     * @param taskSummary
     *        The description of a task.
     */

    public void setTaskSummary(DetectMitigationActionsTaskSummary taskSummary) {
        this.taskSummary = taskSummary;
    }

    /**
     * <p>
     * The description of a task.
     * </p>
     * 
     * @return The description of a task.
     */

    public DetectMitigationActionsTaskSummary getTaskSummary() {
        return this.taskSummary;
    }

    /**
     * <p>
     * The description of a task.
     * </p>
     * 
     * @param taskSummary
     *        The description of a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectMitigationActionsTaskResult withTaskSummary(DetectMitigationActionsTaskSummary taskSummary) {
        setTaskSummary(taskSummary);
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
        if (getTaskSummary() != null)
            sb.append("TaskSummary: ").append(getTaskSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectMitigationActionsTaskResult == false)
            return false;
        DescribeDetectMitigationActionsTaskResult other = (DescribeDetectMitigationActionsTaskResult) obj;
        if (other.getTaskSummary() == null ^ this.getTaskSummary() == null)
            return false;
        if (other.getTaskSummary() != null && other.getTaskSummary().equals(this.getTaskSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskSummary() == null) ? 0 : getTaskSummary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectMitigationActionsTaskResult clone() {
        try {
            return (DescribeDetectMitigationActionsTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
