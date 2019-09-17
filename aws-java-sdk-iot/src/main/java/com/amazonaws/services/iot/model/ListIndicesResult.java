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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The index names.
     * </p>
     */
    private java.util.List<String> indexNames;
    /**
     * <p>
     * The token used to get the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The index names.
     * </p>
     * 
     * @return The index names.
     */

    public java.util.List<String> getIndexNames() {
        return indexNames;
    }

    /**
     * <p>
     * The index names.
     * </p>
     * 
     * @param indexNames
     *        The index names.
     */

    public void setIndexNames(java.util.Collection<String> indexNames) {
        if (indexNames == null) {
            this.indexNames = null;
            return;
        }

        this.indexNames = new java.util.ArrayList<String>(indexNames);
    }

    /**
     * <p>
     * The index names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexNames(java.util.Collection)} or {@link #withIndexNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param indexNames
     *        The index names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withIndexNames(String... indexNames) {
        if (this.indexNames == null) {
            setIndexNames(new java.util.ArrayList<String>(indexNames.length));
        }
        for (String ele : indexNames) {
            this.indexNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The index names.
     * </p>
     * 
     * @param indexNames
     *        The index names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withIndexNames(java.util.Collection<String> indexNames) {
        setIndexNames(indexNames);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withNextToken(String nextToken) {
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
        if (getIndexNames() != null)
            sb.append("IndexNames: ").append(getIndexNames()).append(",");
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

        if (obj instanceof ListIndicesResult == false)
            return false;
        ListIndicesResult other = (ListIndicesResult) obj;
        if (other.getIndexNames() == null ^ this.getIndexNames() == null)
            return false;
        if (other.getIndexNames() != null && other.getIndexNames().equals(this.getIndexNames()) == false)
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

        hashCode = prime * hashCode + ((getIndexNames() == null) ? 0 : getIndexNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIndicesResult clone() {
        try {
            return (ListIndicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
