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
 * <p>
 * The output for a <a>DescribeStackResource</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     * specified stack.
     * </p>
     */
    private StackResourceDetail stackResourceDetail;

    /**
     * <p>
     * A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     * specified stack.
     * </p>
     * 
     * @param stackResourceDetail
     *        A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     *        specified stack.
     */

    public void setStackResourceDetail(StackResourceDetail stackResourceDetail) {
        this.stackResourceDetail = stackResourceDetail;
    }

    /**
     * <p>
     * A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     * specified stack.
     * </p>
     * 
     * @return A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     *         specified stack.
     */

    public StackResourceDetail getStackResourceDetail() {
        return this.stackResourceDetail;
    }

    /**
     * <p>
     * A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     * specified stack.
     * </p>
     * 
     * @param stackResourceDetail
     *        A <code>StackResourceDetail</code> structure containing the description of the specified resource in the
     *        specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceResult withStackResourceDetail(StackResourceDetail stackResourceDetail) {
        setStackResourceDetail(stackResourceDetail);
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
        if (getStackResourceDetail() != null)
            sb.append("StackResourceDetail: ").append(getStackResourceDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackResourceResult == false)
            return false;
        DescribeStackResourceResult other = (DescribeStackResourceResult) obj;
        if (other.getStackResourceDetail() == null ^ this.getStackResourceDetail() == null)
            return false;
        if (other.getStackResourceDetail() != null && other.getStackResourceDetail().equals(this.getStackResourceDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackResourceDetail() == null) ? 0 : getStackResourceDetail().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackResourceResult clone() {
        try {
            return (DescribeStackResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
