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
 * <p>
 * The input for <a>ListStacks</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStacks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStacksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackStatusFilters;

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of stacks that you want to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to retrieve.
     * </p>
     * 
     * @return A string that identifies the next page of stacks that you want to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of stacks that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStacksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @return Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the
     *         specified status codes. For a complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
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
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the
     *        specified status codes. For a complete list of stack status codes, see the <code>StackStatus</code>
     *        parameter of the <a>Stack</a> data type.
     * @see StackStatus
     */

    public void setStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        if (stackStatusFilters == null) {
            this.stackStatusFilters = null;
            return;
        }

        this.stackStatusFilters = new com.amazonaws.internal.SdkInternalList<String>(stackStatusFilters);
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackStatusFilters(java.util.Collection)} or {@link #withStackStatusFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the
     *        specified status codes. For a complete list of stack status codes, see the <code>StackStatus</code>
     *        parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public ListStacksRequest withStackStatusFilters(String... stackStatusFilters) {
        if (this.stackStatusFilters == null) {
            setStackStatusFilters(new com.amazonaws.internal.SdkInternalList<String>(stackStatusFilters.length));
        }
        for (String ele : stackStatusFilters) {
            this.stackStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the
     *        specified status codes. For a complete list of stack status codes, see the <code>StackStatus</code>
     *        parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public ListStacksRequest withStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        setStackStatusFilters(stackStatusFilters);
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified
     * status codes. For a complete list of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * 
     * @param stackStatusFilters
     *        Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the
     *        specified status codes. For a complete list of stack status codes, see the <code>StackStatus</code>
     *        parameter of the <a>Stack</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public ListStacksRequest withStackStatusFilters(StackStatus... stackStatusFilters) {
        com.amazonaws.internal.SdkInternalList<String> stackStatusFiltersCopy = new com.amazonaws.internal.SdkInternalList<String>(stackStatusFilters.length);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStackStatusFilters() != null)
            sb.append("StackStatusFilters: ").append(getStackStatusFilters());
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
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStackStatusFilters() == null ^ this.getStackStatusFilters() == null)
            return false;
        if (other.getStackStatusFilters() != null && other.getStackStatusFilters().equals(this.getStackStatusFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStackStatusFilters() == null) ? 0 : getStackStatusFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListStacksRequest clone() {
        return (ListStacksRequest) super.clone();
    }

}
