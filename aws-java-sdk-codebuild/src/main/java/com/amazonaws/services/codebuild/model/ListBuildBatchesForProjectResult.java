/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildBatchesForProject"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuildBatchesForProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that contains the batch build identifiers.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of strings that contains the batch build identifiers.
     * </p>
     * 
     * @return An array of strings that contains the batch build identifiers.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array of strings that contains the batch build identifiers.
     * </p>
     * 
     * @param ids
     *        An array of strings that contains the batch build identifiers.
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
     * An array of strings that contains the batch build identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        An array of strings that contains the batch build identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesForProjectResult withIds(String... ids) {
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
     * An array of strings that contains the batch build identifiers.
     * </p>
     * 
     * @param ids
     *        An array of strings that contains the batch build identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesForProjectResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to
     *        <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     * </p>
     * 
     * @return If there are more items to return, this contains a token that is passed to a subsequent call to
     *         <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to
     *        <code>ListBuildBatchesForProject</code> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesForProjectResult withNextToken(String nextToken) {
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

        if (obj instanceof ListBuildBatchesForProjectResult == false)
            return false;
        ListBuildBatchesForProjectResult other = (ListBuildBatchesForProjectResult) obj;
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
    public ListBuildBatchesForProjectResult clone() {
        try {
            return (ListBuildBatchesForProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
