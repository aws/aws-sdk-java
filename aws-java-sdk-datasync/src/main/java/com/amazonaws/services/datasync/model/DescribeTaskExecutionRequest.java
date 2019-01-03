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
 * DescribeTaskExecutionRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that is being executed.
     * </p>
     */
    private String taskExecutionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that is being executed.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of the task that is being executed.
     */

    public void setTaskExecutionArn(String taskExecutionArn) {
        this.taskExecutionArn = taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that is being executed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task that is being executed.
     */

    public String getTaskExecutionArn() {
        return this.taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that is being executed.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of the task that is being executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionRequest withTaskExecutionArn(String taskExecutionArn) {
        setTaskExecutionArn(taskExecutionArn);
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
        if (getTaskExecutionArn() != null)
            sb.append("TaskExecutionArn: ").append(getTaskExecutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskExecutionRequest == false)
            return false;
        DescribeTaskExecutionRequest other = (DescribeTaskExecutionRequest) obj;
        if (other.getTaskExecutionArn() == null ^ this.getTaskExecutionArn() == null)
            return false;
        if (other.getTaskExecutionArn() != null && other.getTaskExecutionArn().equals(this.getTaskExecutionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskExecutionArn() == null) ? 0 : getTaskExecutionArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskExecutionRequest clone() {
        return (DescribeTaskExecutionRequest) super.clone();
    }

}
