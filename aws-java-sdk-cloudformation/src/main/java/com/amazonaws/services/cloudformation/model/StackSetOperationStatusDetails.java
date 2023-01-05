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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about the StackSet operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetOperationStatusDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperationStatusDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The number of stack instances for which the StackSet operation failed.
     * </p>
     */
    private Integer failedStackInstancesCount;

    /**
     * <p>
     * The number of stack instances for which the StackSet operation failed.
     * </p>
     * 
     * @param failedStackInstancesCount
     *        The number of stack instances for which the StackSet operation failed.
     */

    public void setFailedStackInstancesCount(Integer failedStackInstancesCount) {
        this.failedStackInstancesCount = failedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances for which the StackSet operation failed.
     * </p>
     * 
     * @return The number of stack instances for which the StackSet operation failed.
     */

    public Integer getFailedStackInstancesCount() {
        return this.failedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances for which the StackSet operation failed.
     * </p>
     * 
     * @param failedStackInstancesCount
     *        The number of stack instances for which the StackSet operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationStatusDetails withFailedStackInstancesCount(Integer failedStackInstancesCount) {
        setFailedStackInstancesCount(failedStackInstancesCount);
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
        if (getFailedStackInstancesCount() != null)
            sb.append("FailedStackInstancesCount: ").append(getFailedStackInstancesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationStatusDetails == false)
            return false;
        StackSetOperationStatusDetails other = (StackSetOperationStatusDetails) obj;
        if (other.getFailedStackInstancesCount() == null ^ this.getFailedStackInstancesCount() == null)
            return false;
        if (other.getFailedStackInstancesCount() != null && other.getFailedStackInstancesCount().equals(this.getFailedStackInstancesCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedStackInstancesCount() == null) ? 0 : getFailedStackInstancesCount().hashCode());
        return hashCode;
    }

    @Override
    public StackSetOperationStatusDetails clone() {
        try {
            return (StackSetOperationStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
