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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSetOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackSetOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     */
    private StackSetOperation stackSetOperation;

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     * 
     * @param stackSetOperation
     *        The specified stack set operation.
     */

    public void setStackSetOperation(StackSetOperation stackSetOperation) {
        this.stackSetOperation = stackSetOperation;
    }

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     * 
     * @return The specified stack set operation.
     */

    public StackSetOperation getStackSetOperation() {
        return this.stackSetOperation;
    }

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     * 
     * @param stackSetOperation
     *        The specified stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackSetOperationResult withStackSetOperation(StackSetOperation stackSetOperation) {
        setStackSetOperation(stackSetOperation);
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
        if (getStackSetOperation() != null)
            sb.append("StackSetOperation: ").append(getStackSetOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackSetOperationResult == false)
            return false;
        DescribeStackSetOperationResult other = (DescribeStackSetOperationResult) obj;
        if (other.getStackSetOperation() == null ^ this.getStackSetOperation() == null)
            return false;
        if (other.getStackSetOperation() != null && other.getStackSetOperation().equals(this.getStackSetOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetOperation() == null) ? 0 : getStackSetOperation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackSetOperationResult clone() {
        try {
            return (DescribeStackSetOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
