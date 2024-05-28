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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetListElements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetListElementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list elements.
     * </p>
     */
    private java.util.List<String> elements;
    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list elements.
     * </p>
     * 
     * @return The list elements.
     */

    public java.util.List<String> getElements() {
        return elements;
    }

    /**
     * <p>
     * The list elements.
     * </p>
     * 
     * @param elements
     *        The list elements.
     */

    public void setElements(java.util.Collection<String> elements) {
        if (elements == null) {
            this.elements = null;
            return;
        }

        this.elements = new java.util.ArrayList<String>(elements);
    }

    /**
     * <p>
     * The list elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The list elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListElementsResult withElements(String... elements) {
        if (this.elements == null) {
            setElements(new java.util.ArrayList<String>(elements.length));
        }
        for (String ele : elements) {
            this.elements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list elements.
     * </p>
     * 
     * @param elements
     *        The list elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListElementsResult withElements(java.util.Collection<String> elements) {
        setElements(elements);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @return The next page token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListElementsResult withNextToken(String nextToken) {
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
        if (getElements() != null)
            sb.append("Elements: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetListElementsResult == false)
            return false;
        GetListElementsResult other = (GetListElementsResult) obj;
        if (other.getElements() == null ^ this.getElements() == null)
            return false;
        if (other.getElements() != null && other.getElements().equals(this.getElements()) == false)
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

        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetListElementsResult clone() {
        try {
            return (GetListElementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
