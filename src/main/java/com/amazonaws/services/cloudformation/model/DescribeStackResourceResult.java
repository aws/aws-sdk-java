/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The output for a DescribeStackResource action.
 * </p>
 */
public class DescribeStackResourceResult implements Serializable {

    /**
     * A <code>StackResourceDetail</code> structure containing the
     * description of the specified resource in the specified stack.
     */
    private StackResourceDetail stackResourceDetail;

    /**
     * A <code>StackResourceDetail</code> structure containing the
     * description of the specified resource in the specified stack.
     *
     * @return A <code>StackResourceDetail</code> structure containing the
     *         description of the specified resource in the specified stack.
     */
    public StackResourceDetail getStackResourceDetail() {
        return stackResourceDetail;
    }
    
    /**
     * A <code>StackResourceDetail</code> structure containing the
     * description of the specified resource in the specified stack.
     *
     * @param stackResourceDetail A <code>StackResourceDetail</code> structure containing the
     *         description of the specified resource in the specified stack.
     */
    public void setStackResourceDetail(StackResourceDetail stackResourceDetail) {
        this.stackResourceDetail = stackResourceDetail;
    }
    
    /**
     * A <code>StackResourceDetail</code> structure containing the
     * description of the specified resource in the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackResourceDetail A <code>StackResourceDetail</code> structure containing the
     *         description of the specified resource in the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackResourceResult withStackResourceDetail(StackResourceDetail stackResourceDetail) {
        this.stackResourceDetail = stackResourceDetail;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackResourceDetail() != null) sb.append("StackResourceDetail: " + getStackResourceDetail() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackResourceDetail() == null) ? 0 : getStackResourceDetail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStackResourceResult == false) return false;
        DescribeStackResourceResult other = (DescribeStackResourceResult)obj;
        
        if (other.getStackResourceDetail() == null ^ this.getStackResourceDetail() == null) return false;
        if (other.getStackResourceDetail() != null && other.getStackResourceDetail().equals(this.getStackResourceDetail()) == false) return false; 
        return true;
    }
    
}
    