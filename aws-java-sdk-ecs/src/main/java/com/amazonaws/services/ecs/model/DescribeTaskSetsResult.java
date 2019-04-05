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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of task sets described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TaskSet> taskSets;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * 
     * @return The list of task sets described.
     */

    public java.util.List<TaskSet> getTaskSets() {
        if (taskSets == null) {
            taskSets = new com.amazonaws.internal.SdkInternalList<TaskSet>();
        }
        return taskSets;
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * 
     * @param taskSets
     *        The list of task sets described.
     */

    public void setTaskSets(java.util.Collection<TaskSet> taskSets) {
        if (taskSets == null) {
            this.taskSets = null;
            return;
        }

        this.taskSets = new com.amazonaws.internal.SdkInternalList<TaskSet>(taskSets);
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskSets(java.util.Collection)} or {@link #withTaskSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskSets
     *        The list of task sets described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsResult withTaskSets(TaskSet... taskSets) {
        if (this.taskSets == null) {
            setTaskSets(new com.amazonaws.internal.SdkInternalList<TaskSet>(taskSets.length));
        }
        for (TaskSet ele : taskSets) {
            this.taskSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * 
     * @param taskSets
     *        The list of task sets described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsResult withTaskSets(java.util.Collection<TaskSet> taskSets) {
        setTaskSets(taskSets);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getTaskSets() != null)
            sb.append("TaskSets: ").append(getTaskSets()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskSetsResult == false)
            return false;
        DescribeTaskSetsResult other = (DescribeTaskSetsResult) obj;
        if (other.getTaskSets() == null ^ this.getTaskSets() == null)
            return false;
        if (other.getTaskSets() != null && other.getTaskSets().equals(this.getTaskSets()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskSets() == null) ? 0 : getTaskSets().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskSetsResult clone() {
        try {
            return (DescribeTaskSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
