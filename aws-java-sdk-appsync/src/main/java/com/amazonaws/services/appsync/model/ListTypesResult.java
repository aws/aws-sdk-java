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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>Type</code> objects.
     * </p>
     */
    private java.util.List<Type> types;
    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>Type</code> objects.
     * </p>
     * 
     * @return The <code>Type</code> objects.
     */

    public java.util.List<Type> getTypes() {
        return types;
    }

    /**
     * <p>
     * The <code>Type</code> objects.
     * </p>
     * 
     * @param types
     *        The <code>Type</code> objects.
     */

    public void setTypes(java.util.Collection<Type> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<Type>(types);
    }

    /**
     * <p>
     * The <code>Type</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The <code>Type</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypesResult withTypes(Type... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<Type>(types.length));
        }
        for (Type ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Type</code> objects.
     * </p>
     * 
     * @param types
     *        The <code>Type</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypesResult withTypes(java.util.Collection<Type> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier to be passed in the next request to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypesResult withNextToken(String nextToken) {
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
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
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

        if (obj instanceof ListTypesResult == false)
            return false;
        ListTypesResult other = (ListTypesResult) obj;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
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

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTypesResult clone() {
        try {
            return (ListTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
