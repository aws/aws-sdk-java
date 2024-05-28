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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecycleExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLifecycleExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lifecycle runtime instances for the specified resource.
     * </p>
     */
    private java.util.List<LifecycleExecution> lifecycleExecutions;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of lifecycle runtime instances for the specified resource.
     * </p>
     * 
     * @return A list of lifecycle runtime instances for the specified resource.
     */

    public java.util.List<LifecycleExecution> getLifecycleExecutions() {
        return lifecycleExecutions;
    }

    /**
     * <p>
     * A list of lifecycle runtime instances for the specified resource.
     * </p>
     * 
     * @param lifecycleExecutions
     *        A list of lifecycle runtime instances for the specified resource.
     */

    public void setLifecycleExecutions(java.util.Collection<LifecycleExecution> lifecycleExecutions) {
        if (lifecycleExecutions == null) {
            this.lifecycleExecutions = null;
            return;
        }

        this.lifecycleExecutions = new java.util.ArrayList<LifecycleExecution>(lifecycleExecutions);
    }

    /**
     * <p>
     * A list of lifecycle runtime instances for the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleExecutions(java.util.Collection)} or {@link #withLifecycleExecutions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleExecutions
     *        A list of lifecycle runtime instances for the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionsResult withLifecycleExecutions(LifecycleExecution... lifecycleExecutions) {
        if (this.lifecycleExecutions == null) {
            setLifecycleExecutions(new java.util.ArrayList<LifecycleExecution>(lifecycleExecutions.length));
        }
        for (LifecycleExecution ele : lifecycleExecutions) {
            this.lifecycleExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle runtime instances for the specified resource.
     * </p>
     * 
     * @param lifecycleExecutions
     *        A list of lifecycle runtime instances for the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionsResult withLifecycleExecutions(java.util.Collection<LifecycleExecution> lifecycleExecutions) {
        setLifecycleExecutions(lifecycleExecutions);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this field isn't empty, there are additional elements
     *         that the service hasn't included in this request. Use this token with the next request to retrieve
     *         additional objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionsResult withNextToken(String nextToken) {
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
        if (getLifecycleExecutions() != null)
            sb.append("LifecycleExecutions: ").append(getLifecycleExecutions()).append(",");
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

        if (obj instanceof ListLifecycleExecutionsResult == false)
            return false;
        ListLifecycleExecutionsResult other = (ListLifecycleExecutionsResult) obj;
        if (other.getLifecycleExecutions() == null ^ this.getLifecycleExecutions() == null)
            return false;
        if (other.getLifecycleExecutions() != null && other.getLifecycleExecutions().equals(this.getLifecycleExecutions()) == false)
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

        hashCode = prime * hashCode + ((getLifecycleExecutions() == null) ? 0 : getLifecycleExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLifecycleExecutionsResult clone() {
        try {
            return (ListLifecycleExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
