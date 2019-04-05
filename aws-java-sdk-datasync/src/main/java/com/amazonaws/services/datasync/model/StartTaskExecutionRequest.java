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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * StartTaskExecutionRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTaskExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task to start.
     * </p>
     */
    private String taskArn;

    private Options overrideOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task to start.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task to start.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task to start.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task to start.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task to start.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * @param overrideOptions
     */

    public void setOverrideOptions(Options overrideOptions) {
        this.overrideOptions = overrideOptions;
    }

    /**
     * @return
     */

    public Options getOverrideOptions() {
        return this.overrideOptions;
    }

    /**
     * @param overrideOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withOverrideOptions(Options overrideOptions) {
        setOverrideOptions(overrideOptions);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getOverrideOptions() != null)
            sb.append("OverrideOptions: ").append(getOverrideOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTaskExecutionRequest == false)
            return false;
        StartTaskExecutionRequest other = (StartTaskExecutionRequest) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getOverrideOptions() == null ^ this.getOverrideOptions() == null)
            return false;
        if (other.getOverrideOptions() != null && other.getOverrideOptions().equals(this.getOverrideOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getOverrideOptions() == null) ? 0 : getOverrideOptions().hashCode());
        return hashCode;
    }

    @Override
    public StartTaskExecutionRequest clone() {
        return (StartTaskExecutionRequest) super.clone();
    }

}
