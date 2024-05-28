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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again, adding the next
     * token to the call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of compute fleet names.
     * </p>
     */
    private java.util.List<String> fleets;

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again, adding the next
     * token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *        string called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again, adding the next
     * token to the call.
     * </p>
     * 
     * @return If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *         string called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again,
     *         adding the next token to the call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string
     * called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again, adding the next
     * token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 100 items in the list, only the first 100 items are returned, along with a unique
     *        string called a <i>nextToken</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of compute fleet names.
     * </p>
     * 
     * @return The list of compute fleet names.
     */

    public java.util.List<String> getFleets() {
        return fleets;
    }

    /**
     * <p>
     * The list of compute fleet names.
     * </p>
     * 
     * @param fleets
     *        The list of compute fleet names.
     */

    public void setFleets(java.util.Collection<String> fleets) {
        if (fleets == null) {
            this.fleets = null;
            return;
        }

        this.fleets = new java.util.ArrayList<String>(fleets);
    }

    /**
     * <p>
     * The list of compute fleet names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleets(java.util.Collection)} or {@link #withFleets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fleets
     *        The list of compute fleet names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleets(String... fleets) {
        if (this.fleets == null) {
            setFleets(new java.util.ArrayList<String>(fleets.length));
        }
        for (String ele : fleets) {
            this.fleets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of compute fleet names.
     * </p>
     * 
     * @param fleets
     *        The list of compute fleet names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleets(java.util.Collection<String> fleets) {
        setFleets(fleets);
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
        if (getFleets() != null)
            sb.append("Fleets: ").append(getFleets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetsResult == false)
            return false;
        ListFleetsResult other = (ListFleetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFleets() == null ^ this.getFleets() == null)
            return false;
        if (other.getFleets() != null && other.getFleets().equals(this.getFleets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFleets() == null) ? 0 : getFleets().hashCode());
        return hashCode;
    }

    @Override
    public ListFleetsResult clone() {
        try {
            return (ListFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
