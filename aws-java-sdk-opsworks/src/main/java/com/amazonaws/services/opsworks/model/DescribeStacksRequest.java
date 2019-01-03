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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStacks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStacksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     * <code>DescribeStacks</code> returns a description of every stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackIds;

    /**
     * <p>
     * An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     * <code>DescribeStacks</code> returns a description of every stack.
     * </p>
     * 
     * @return An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     *         <code>DescribeStacks</code> returns a description of every stack.
     */

    public java.util.List<String> getStackIds() {
        if (stackIds == null) {
            stackIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stackIds;
    }

    /**
     * <p>
     * An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     * <code>DescribeStacks</code> returns a description of every stack.
     * </p>
     * 
     * @param stackIds
     *        An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     *        <code>DescribeStacks</code> returns a description of every stack.
     */

    public void setStackIds(java.util.Collection<String> stackIds) {
        if (stackIds == null) {
            this.stackIds = null;
            return;
        }

        this.stackIds = new com.amazonaws.internal.SdkInternalList<String>(stackIds);
    }

    /**
     * <p>
     * An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     * <code>DescribeStacks</code> returns a description of every stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackIds(java.util.Collection)} or {@link #withStackIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param stackIds
     *        An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     *        <code>DescribeStacks</code> returns a description of every stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksRequest withStackIds(String... stackIds) {
        if (this.stackIds == null) {
            setStackIds(new com.amazonaws.internal.SdkInternalList<String>(stackIds.length));
        }
        for (String ele : stackIds) {
            this.stackIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     * <code>DescribeStacks</code> returns a description of every stack.
     * </p>
     * 
     * @param stackIds
     *        An array of stack IDs that specify the stacks to be described. If you omit this parameter,
     *        <code>DescribeStacks</code> returns a description of every stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksRequest withStackIds(java.util.Collection<String> stackIds) {
        setStackIds(stackIds);
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
        if (getStackIds() != null)
            sb.append("StackIds: ").append(getStackIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStacksRequest == false)
            return false;
        DescribeStacksRequest other = (DescribeStacksRequest) obj;
        if (other.getStackIds() == null ^ this.getStackIds() == null)
            return false;
        if (other.getStackIds() != null && other.getStackIds().equals(this.getStackIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackIds() == null) ? 0 : getStackIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStacksRequest clone() {
        return (DescribeStacksRequest) super.clone();
    }

}
