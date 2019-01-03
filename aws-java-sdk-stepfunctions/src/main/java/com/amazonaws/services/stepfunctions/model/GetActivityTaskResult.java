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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetActivityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetActivityTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     * <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress or
     * completion of the task.
     * </p>
     */
    private String taskToken;
    /**
     * <p>
     * The string that contains the JSON input data for the task.
     * </p>
     */
    private String input;

    /**
     * <p>
     * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     * <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress or
     * completion of the task.
     * </p>
     * 
     * @param taskToken
     *        A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     *        <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress
     *        or completion of the task.
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     * <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress or
     * completion of the task.
     * </p>
     * 
     * @return A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     *         <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the
     *         progress or completion of the task.
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     * <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress or
     * completion of the task.
     * </p>
     * 
     * @param taskToken
     *        A token that identifies the scheduled task. This token must be copied and included in subsequent calls to
     *        <a>SendTaskHeartbeat</a>, <a>SendTaskSuccess</a> or <a>SendTaskFailure</a> in order to report the progress
     *        or completion of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActivityTaskResult withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the task.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the task.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the task.
     * </p>
     * 
     * @return The string that contains the JSON input data for the task.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the task.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActivityTaskResult withInput(String input) {
        setInput(input);
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
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetActivityTaskResult == false)
            return false;
        GetActivityTaskResult other = (GetActivityTaskResult) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public GetActivityTaskResult clone() {
        try {
            return (GetActivityTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
