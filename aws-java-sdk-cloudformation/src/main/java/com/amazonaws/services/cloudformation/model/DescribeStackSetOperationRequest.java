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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSetOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackSetOperationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID of the stack set for the stack operation.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * The name or the unique stack ID of the stack set for the stack operation.
     * </p>
     * 
     * @param stackSetName
     *        The name or the unique stack ID of the stack set for the stack operation.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or the unique stack ID of the stack set for the stack operation.
     * </p>
     * 
     * @return The name or the unique stack ID of the stack set for the stack operation.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or the unique stack ID of the stack set for the stack operation.
     * </p>
     * 
     * @param stackSetName
     *        The name or the unique stack ID of the stack set for the stack operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackSetOperationRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the stack set operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @return The unique ID of the stack set operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackSetOperationRequest withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackSetOperationRequest == false)
            return false;
        DescribeStackSetOperationRequest other = (DescribeStackSetOperationRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackSetOperationRequest clone() {
        return (DescribeStackSetOperationRequest) super.clone();
    }

}
