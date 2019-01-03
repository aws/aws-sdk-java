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
 * The output for <a>ListStacks</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStacks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackSummary> stackSummaries;
    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page
     * exists, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * </p>
     * 
     * @return A list of <code>StackSummary</code> structures containing information about the specified stacks.
     */

    public java.util.List<StackSummary> getStackSummaries() {
        if (stackSummaries == null) {
            stackSummaries = new com.amazonaws.internal.SdkInternalList<StackSummary>();
        }
        return stackSummaries;
    }

    /**
     * <p>
     * A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * </p>
     * 
     * @param stackSummaries
     *        A list of <code>StackSummary</code> structures containing information about the specified stacks.
     */

    public void setStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        if (stackSummaries == null) {
            this.stackSummaries = null;
            return;
        }

        this.stackSummaries = new com.amazonaws.internal.SdkInternalList<StackSummary>(stackSummaries);
    }

    /**
     * <p>
     * A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackSummaries(java.util.Collection)} or {@link #withStackSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stackSummaries
     *        A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStacksResult withStackSummaries(StackSummary... stackSummaries) {
        if (this.stackSummaries == null) {
            setStackSummaries(new com.amazonaws.internal.SdkInternalList<StackSummary>(stackSummaries.length));
        }
        for (StackSummary ele : stackSummaries) {
            this.stackSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * </p>
     * 
     * @param stackSummaries
     *        A list of <code>StackSummary</code> structures containing information about the specified stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStacksResult withStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        setStackSummaries(stackSummaries);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional
     *        page exists, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @return If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional
     *         page exists, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional
     *        page exists, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStacksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStackSummaries() != null)
            sb.append("StackSummaries: ").append(getStackSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStacksResult == false)
            return false;
        ListStacksResult other = (ListStacksResult) obj;
        if (other.getStackSummaries() == null ^ this.getStackSummaries() == null)
            return false;
        if (other.getStackSummaries() != null && other.getStackSummaries().equals(this.getStackSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSummaries() == null) ? 0 : getStackSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStacksResult clone() {
        try {
            return (ListStacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
