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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of environment identifiers.
     * </p>
     */
    private java.util.List<String> environmentIds;

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @return If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *         string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *         adding the next token to the call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of environment identifiers.
     * </p>
     * 
     * @return The list of environment identifiers.
     */

    public java.util.List<String> getEnvironmentIds() {
        return environmentIds;
    }

    /**
     * <p>
     * The list of environment identifiers.
     * </p>
     * 
     * @param environmentIds
     *        The list of environment identifiers.
     */

    public void setEnvironmentIds(java.util.Collection<String> environmentIds) {
        if (environmentIds == null) {
            this.environmentIds = null;
            return;
        }

        this.environmentIds = new java.util.ArrayList<String>(environmentIds);
    }

    /**
     * <p>
     * The list of environment identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentIds(java.util.Collection)} or {@link #withEnvironmentIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param environmentIds
     *        The list of environment identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironmentIds(String... environmentIds) {
        if (this.environmentIds == null) {
            setEnvironmentIds(new java.util.ArrayList<String>(environmentIds.length));
        }
        for (String ele : environmentIds) {
            this.environmentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of environment identifiers.
     * </p>
     * 
     * @param environmentIds
     *        The list of environment identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironmentIds(java.util.Collection<String> environmentIds) {
        setEnvironmentIds(environmentIds);
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
        if (getEnvironmentIds() != null)
            sb.append("EnvironmentIds: ").append(getEnvironmentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentsResult == false)
            return false;
        ListEnvironmentsResult other = (ListEnvironmentsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getEnvironmentIds() == null ^ this.getEnvironmentIds() == null)
            return false;
        if (other.getEnvironmentIds() != null && other.getEnvironmentIds().equals(this.getEnvironmentIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIds() == null) ? 0 : getEnvironmentIds().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentsResult clone() {
        try {
            return (ListEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
