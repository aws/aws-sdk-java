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
 * The output for a <a>ListStackResources</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackResourceSummary</code> structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackResourceSummary> stackResourceSummaries;
    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page
     * exists, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackResourceSummary</code> structures.
     * </p>
     * 
     * @return A list of <code>StackResourceSummary</code> structures.
     */

    public java.util.List<StackResourceSummary> getStackResourceSummaries() {
        if (stackResourceSummaries == null) {
            stackResourceSummaries = new com.amazonaws.internal.SdkInternalList<StackResourceSummary>();
        }
        return stackResourceSummaries;
    }

    /**
     * <p>
     * A list of <code>StackResourceSummary</code> structures.
     * </p>
     * 
     * @param stackResourceSummaries
     *        A list of <code>StackResourceSummary</code> structures.
     */

    public void setStackResourceSummaries(java.util.Collection<StackResourceSummary> stackResourceSummaries) {
        if (stackResourceSummaries == null) {
            this.stackResourceSummaries = null;
            return;
        }

        this.stackResourceSummaries = new com.amazonaws.internal.SdkInternalList<StackResourceSummary>(stackResourceSummaries);
    }

    /**
     * <p>
     * A list of <code>StackResourceSummary</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackResourceSummaries(java.util.Collection)} or
     * {@link #withStackResourceSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param stackResourceSummaries
     *        A list of <code>StackResourceSummary</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackResourcesResult withStackResourceSummaries(StackResourceSummary... stackResourceSummaries) {
        if (this.stackResourceSummaries == null) {
            setStackResourceSummaries(new com.amazonaws.internal.SdkInternalList<StackResourceSummary>(stackResourceSummaries.length));
        }
        for (StackResourceSummary ele : stackResourceSummaries) {
            this.stackResourceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackResourceSummary</code> structures.
     * </p>
     * 
     * @param stackResourceSummaries
     *        A list of <code>StackResourceSummary</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackResourcesResult withStackResourceSummaries(java.util.Collection<StackResourceSummary> stackResourceSummaries) {
        setStackResourceSummaries(stackResourceSummaries);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional
     *        page exists, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @return If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional
     *         page exists, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional
     *        page exists, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackResourcesResult withNextToken(String nextToken) {
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
        if (getStackResourceSummaries() != null)
            sb.append("StackResourceSummaries: ").append(getStackResourceSummaries()).append(",");
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

        if (obj instanceof ListStackResourcesResult == false)
            return false;
        ListStackResourcesResult other = (ListStackResourcesResult) obj;
        if (other.getStackResourceSummaries() == null ^ this.getStackResourceSummaries() == null)
            return false;
        if (other.getStackResourceSummaries() != null && other.getStackResourceSummaries().equals(this.getStackResourceSummaries()) == false)
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

        hashCode = prime * hashCode + ((getStackResourceSummaries() == null) ? 0 : getStackResourceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStackResourcesResult clone() {
        try {
            return (ListStackResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
