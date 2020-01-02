/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTaskRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of task runs that are associated with the transform.
     * </p>
     */
    private java.util.List<TaskRun> taskRuns;
    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of task runs that are associated with the transform.
     * </p>
     * 
     * @return A list of task runs that are associated with the transform.
     */

    public java.util.List<TaskRun> getTaskRuns() {
        return taskRuns;
    }

    /**
     * <p>
     * A list of task runs that are associated with the transform.
     * </p>
     * 
     * @param taskRuns
     *        A list of task runs that are associated with the transform.
     */

    public void setTaskRuns(java.util.Collection<TaskRun> taskRuns) {
        if (taskRuns == null) {
            this.taskRuns = null;
            return;
        }

        this.taskRuns = new java.util.ArrayList<TaskRun>(taskRuns);
    }

    /**
     * <p>
     * A list of task runs that are associated with the transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskRuns(java.util.Collection)} or {@link #withTaskRuns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskRuns
     *        A list of task runs that are associated with the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsResult withTaskRuns(TaskRun... taskRuns) {
        if (this.taskRuns == null) {
            setTaskRuns(new java.util.ArrayList<TaskRun>(taskRuns.length));
        }
        for (TaskRun ele : taskRuns) {
            this.taskRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of task runs that are associated with the transform.
     * </p>
     * 
     * @param taskRuns
     *        A list of task runs that are associated with the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsResult withTaskRuns(java.util.Collection<TaskRun> taskRuns) {
        setTaskRuns(taskRuns);
        return this;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @return A pagination token, if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTaskRuns() != null)
            sb.append("TaskRuns: ").append(getTaskRuns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTaskRunsResult == false)
            return false;
        GetMLTaskRunsResult other = (GetMLTaskRunsResult) obj;
        if (other.getTaskRuns() == null ^ this.getTaskRuns() == null)
            return false;
        if (other.getTaskRuns() != null && other.getTaskRuns().equals(this.getTaskRuns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskRuns() == null) ? 0 : getTaskRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetMLTaskRunsResult clone() {
        try {
            return (GetMLTaskRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
