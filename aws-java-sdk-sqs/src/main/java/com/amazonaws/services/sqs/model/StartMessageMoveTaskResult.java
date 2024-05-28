/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/StartMessageMoveTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMessageMoveTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier associated with a message movement task. You can use this identifier to cancel a specified message
     * movement task using the <code>CancelMessageMoveTask</code> action.
     * </p>
     */
    private String taskHandle;

    /**
     * <p>
     * An identifier associated with a message movement task. You can use this identifier to cancel a specified message
     * movement task using the <code>CancelMessageMoveTask</code> action.
     * </p>
     * 
     * @param taskHandle
     *        An identifier associated with a message movement task. You can use this identifier to cancel a specified
     *        message movement task using the <code>CancelMessageMoveTask</code> action.
     */

    public void setTaskHandle(String taskHandle) {
        this.taskHandle = taskHandle;
    }

    /**
     * <p>
     * An identifier associated with a message movement task. You can use this identifier to cancel a specified message
     * movement task using the <code>CancelMessageMoveTask</code> action.
     * </p>
     * 
     * @return An identifier associated with a message movement task. You can use this identifier to cancel a specified
     *         message movement task using the <code>CancelMessageMoveTask</code> action.
     */

    public String getTaskHandle() {
        return this.taskHandle;
    }

    /**
     * <p>
     * An identifier associated with a message movement task. You can use this identifier to cancel a specified message
     * movement task using the <code>CancelMessageMoveTask</code> action.
     * </p>
     * 
     * @param taskHandle
     *        An identifier associated with a message movement task. You can use this identifier to cancel a specified
     *        message movement task using the <code>CancelMessageMoveTask</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMessageMoveTaskResult withTaskHandle(String taskHandle) {
        setTaskHandle(taskHandle);
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
        if (getTaskHandle() != null)
            sb.append("TaskHandle: ").append(getTaskHandle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMessageMoveTaskResult == false)
            return false;
        StartMessageMoveTaskResult other = (StartMessageMoveTaskResult) obj;
        if (other.getTaskHandle() == null ^ this.getTaskHandle() == null)
            return false;
        if (other.getTaskHandle() != null && other.getTaskHandle().equals(this.getTaskHandle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskHandle() == null) ? 0 : getTaskHandle().hashCode());
        return hashCode;
    }

    @Override
    public StartMessageMoveTaskResult clone() {
        try {
            return (StartMessageMoveTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
