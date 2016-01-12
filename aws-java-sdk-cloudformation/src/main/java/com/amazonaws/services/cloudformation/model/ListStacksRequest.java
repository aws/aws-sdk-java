/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for <a>ListStacks</a> action.
 * </p>
 */
public class ListStacksRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * String that identifies the start of the next list of stacks, if there is
     * one.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackStatusFilters;

    /**
     * <p>
     * String that identifies the start of the next list of stacks, if there is
     * one.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param nextToken
     *        String that identifies the start of the next list of stacks, if
     *        there is one.</p>
     *        <p>
     *        Default: There is no default value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String that identifies the start of the next list of stacks, if there is
     * one.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @return String that identifies the start of the next list of stacks, if
     *         there is one.</p>
     *         <p>
     *         Default: There is no default value.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String that identifies the start of the next list of stacks, if there is
     * one.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param nextToken
     *        String that identifies the start of the next list of stacks, if
     *        there is one.</p>
     *        <p>
     *        Default: There is no default value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListStacksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @return Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the
     *         <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     * @see StackStatus
     */
    public java.util.List<String> getStackStatusFilters() {
        if (stackStatusFilters == null) {
            stackStatusFilters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stackStatusFilters;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status
     *        codes to list only stacks with the specified status codes. For a
     *        complete list of stack status codes, see the
     *        <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     * @see StackStatus
     */
    public void setStackStatusFilters(
            java.util.Collection<String> stackStatusFilters) {
        if (stackStatusFilters == null) {
            this.stackStatusFilters = null;
            return;
        }

        this.stackStatusFilters = new com.amazonaws.internal.SdkInternalList<String>(
                stackStatusFilters);
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStackStatusFilters(java.util.Collection)} or
     * {@link #withStackStatusFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status
     *        codes to list only stacks with the specified status codes. For a
     *        complete list of stack status codes, see the
     *        <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public ListStacksRequest withStackStatusFilters(
            String... stackStatusFilters) {
        if (this.stackStatusFilters == null) {
            setStackStatusFilters(new com.amazonaws.internal.SdkInternalList<String>(
                    stackStatusFilters.length));
        }
        for (String ele : stackStatusFilters) {
            this.stackStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status
     *        codes to list only stacks with the specified status codes. For a
     *        complete list of stack status codes, see the
     *        <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public ListStacksRequest withStackStatusFilters(
            java.util.Collection<String> stackStatusFilters) {
        setStackStatusFilters(stackStatusFilters);
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status
     *        codes to list only stacks with the specified status codes. For a
     *        complete list of stack status codes, see the
     *        <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public ListStacksRequest withStackStatusFilters(
            StackStatus... stackStatusFilters) {
        com.amazonaws.internal.SdkInternalList<String> stackStatusFiltersCopy = new com.amazonaws.internal.SdkInternalList<String>(
                stackStatusFilters.length);
        for (StackStatus value : stackStatusFilters) {
            stackStatusFiltersCopy.add(value.toString());
        }
        if (getStackStatusFilters() == null) {
            setStackStatusFilters(stackStatusFiltersCopy);
        } else {
            getStackStatusFilters().addAll(stackStatusFiltersCopy);
        }
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStackStatusFilters() != null)
            sb.append("StackStatusFilters: " + getStackStatusFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStacksRequest == false)
            return false;
        ListStacksRequest other = (ListStacksRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStackStatusFilters() == null
                ^ this.getStackStatusFilters() == null)
            return false;
        if (other.getStackStatusFilters() != null
                && other.getStackStatusFilters().equals(
                        this.getStackStatusFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackStatusFilters() == null) ? 0
                        : getStackStatusFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListStacksRequest clone() {
        return (ListStacksRequest) super.clone();
    }
}