/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepDependencies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStepDependenciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The dependencies on the list.
     * </p>
     */
    private java.util.List<StepDependency> dependencies;
    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The dependencies on the list.
     * </p>
     * 
     * @return The dependencies on the list.
     */

    public java.util.List<StepDependency> getDependencies() {
        return dependencies;
    }

    /**
     * <p>
     * The dependencies on the list.
     * </p>
     * 
     * @param dependencies
     *        The dependencies on the list.
     */

    public void setDependencies(java.util.Collection<StepDependency> dependencies) {
        if (dependencies == null) {
            this.dependencies = null;
            return;
        }

        this.dependencies = new java.util.ArrayList<StepDependency>(dependencies);
    }

    /**
     * <p>
     * The dependencies on the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependencies(java.util.Collection)} or {@link #withDependencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependencies
     *        The dependencies on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepDependenciesResult withDependencies(StepDependency... dependencies) {
        if (this.dependencies == null) {
            setDependencies(new java.util.ArrayList<StepDependency>(dependencies.length));
        }
        for (StepDependency ele : dependencies) {
            this.dependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dependencies on the list.
     * </p>
     * 
     * @param dependencies
     *        The dependencies on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepDependenciesResult withDependencies(java.util.Collection<StepDependency> dependencies) {
        setDependencies(dependencies);
        return this;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @return If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepDependenciesResult withNextToken(String nextToken) {
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
        if (getDependencies() != null)
            sb.append("Dependencies: ").append(getDependencies()).append(",");
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

        if (obj instanceof ListStepDependenciesResult == false)
            return false;
        ListStepDependenciesResult other = (ListStepDependenciesResult) obj;
        if (other.getDependencies() == null ^ this.getDependencies() == null)
            return false;
        if (other.getDependencies() != null && other.getDependencies().equals(this.getDependencies()) == false)
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

        hashCode = prime * hashCode + ((getDependencies() == null) ? 0 : getDependencies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStepDependenciesResult clone() {
        try {
            return (ListStepDependenciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
