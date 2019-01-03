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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuilds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuildsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of build IDs, with each build ID representing a single build.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @return A list of build IDs, with each build ID representing a single build.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param ids
     *        A list of build IDs, with each build ID representing a single build.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of build IDs, with each build ID representing a single build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        A list of build IDs, with each build ID representing a single build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsResult withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param ids
     *        A list of build IDs, with each build ID representing a single build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @return If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *         string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *         adding the next token to the call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsResult withNextToken(String nextToken) {
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
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

        if (obj instanceof ListBuildsResult == false)
            return false;
        ListBuildsResult other = (ListBuildsResult) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
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

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuildsResult clone() {
        try {
            return (ListBuildsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
