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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIncomingTypedLinks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIncomingTypedLinksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns one or more typed link specifiers as output.
     * </p>
     */
    private java.util.List<TypedLinkSpecifier> linkSpecifiers;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns one or more typed link specifiers as output.
     * </p>
     * 
     * @return Returns one or more typed link specifiers as output.
     */

    public java.util.List<TypedLinkSpecifier> getLinkSpecifiers() {
        return linkSpecifiers;
    }

    /**
     * <p>
     * Returns one or more typed link specifiers as output.
     * </p>
     * 
     * @param linkSpecifiers
     *        Returns one or more typed link specifiers as output.
     */

    public void setLinkSpecifiers(java.util.Collection<TypedLinkSpecifier> linkSpecifiers) {
        if (linkSpecifiers == null) {
            this.linkSpecifiers = null;
            return;
        }

        this.linkSpecifiers = new java.util.ArrayList<TypedLinkSpecifier>(linkSpecifiers);
    }

    /**
     * <p>
     * Returns one or more typed link specifiers as output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinkSpecifiers(java.util.Collection)} or {@link #withLinkSpecifiers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param linkSpecifiers
     *        Returns one or more typed link specifiers as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncomingTypedLinksResult withLinkSpecifiers(TypedLinkSpecifier... linkSpecifiers) {
        if (this.linkSpecifiers == null) {
            setLinkSpecifiers(new java.util.ArrayList<TypedLinkSpecifier>(linkSpecifiers.length));
        }
        for (TypedLinkSpecifier ele : linkSpecifiers) {
            this.linkSpecifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns one or more typed link specifiers as output.
     * </p>
     * 
     * @param linkSpecifiers
     *        Returns one or more typed link specifiers as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncomingTypedLinksResult withLinkSpecifiers(java.util.Collection<TypedLinkSpecifier> linkSpecifiers) {
        setLinkSpecifiers(linkSpecifiers);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncomingTypedLinksResult withNextToken(String nextToken) {
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
        if (getLinkSpecifiers() != null)
            sb.append("LinkSpecifiers: ").append(getLinkSpecifiers()).append(",");
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

        if (obj instanceof ListIncomingTypedLinksResult == false)
            return false;
        ListIncomingTypedLinksResult other = (ListIncomingTypedLinksResult) obj;
        if (other.getLinkSpecifiers() == null ^ this.getLinkSpecifiers() == null)
            return false;
        if (other.getLinkSpecifiers() != null && other.getLinkSpecifiers().equals(this.getLinkSpecifiers()) == false)
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

        hashCode = prime * hashCode + ((getLinkSpecifiers() == null) ? 0 : getLinkSpecifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIncomingTypedLinksResult clone() {
        try {
            return (ListIncomingTypedLinksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
