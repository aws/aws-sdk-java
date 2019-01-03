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

/**
 * <p>
 * Contains the response to a <code>DescribeStacks</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStacks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Stack</code> objects that describe the stacks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Stack> stacks;

    /**
     * <p>
     * An array of <code>Stack</code> objects that describe the stacks.
     * </p>
     * 
     * @return An array of <code>Stack</code> objects that describe the stacks.
     */

    public java.util.List<Stack> getStacks() {
        if (stacks == null) {
            stacks = new com.amazonaws.internal.SdkInternalList<Stack>();
        }
        return stacks;
    }

    /**
     * <p>
     * An array of <code>Stack</code> objects that describe the stacks.
     * </p>
     * 
     * @param stacks
     *        An array of <code>Stack</code> objects that describe the stacks.
     */

    public void setStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
            return;
        }

        this.stacks = new com.amazonaws.internal.SdkInternalList<Stack>(stacks);
    }

    /**
     * <p>
     * An array of <code>Stack</code> objects that describe the stacks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStacks(java.util.Collection)} or {@link #withStacks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stacks
     *        An array of <code>Stack</code> objects that describe the stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksResult withStacks(Stack... stacks) {
        if (this.stacks == null) {
            setStacks(new com.amazonaws.internal.SdkInternalList<Stack>(stacks.length));
        }
        for (Stack ele : stacks) {
            this.stacks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Stack</code> objects that describe the stacks.
     * </p>
     * 
     * @param stacks
     *        An array of <code>Stack</code> objects that describe the stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksResult withStacks(java.util.Collection<Stack> stacks) {
        setStacks(stacks);
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
        if (getStacks() != null)
            sb.append("Stacks: ").append(getStacks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStacksResult == false)
            return false;
        DescribeStacksResult other = (DescribeStacksResult) obj;
        if (other.getStacks() == null ^ this.getStacks() == null)
            return false;
        if (other.getStacks() != null && other.getStacks().equals(this.getStacks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStacks() == null) ? 0 : getStacks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStacksResult clone() {
        try {
            return (DescribeStacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
