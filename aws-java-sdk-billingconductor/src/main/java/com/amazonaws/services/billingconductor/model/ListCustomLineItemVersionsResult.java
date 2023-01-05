/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>CustomLineItemVersionListElements</code> that are received.
     * </p>
     */
    private java.util.List<CustomLineItemVersionListElement> customLineItemVersions;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve custom line item versions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>CustomLineItemVersionListElements</code> that are received.
     * </p>
     * 
     * @return A list of <code>CustomLineItemVersionListElements</code> that are received.
     */

    public java.util.List<CustomLineItemVersionListElement> getCustomLineItemVersions() {
        return customLineItemVersions;
    }

    /**
     * <p>
     * A list of <code>CustomLineItemVersionListElements</code> that are received.
     * </p>
     * 
     * @param customLineItemVersions
     *        A list of <code>CustomLineItemVersionListElements</code> that are received.
     */

    public void setCustomLineItemVersions(java.util.Collection<CustomLineItemVersionListElement> customLineItemVersions) {
        if (customLineItemVersions == null) {
            this.customLineItemVersions = null;
            return;
        }

        this.customLineItemVersions = new java.util.ArrayList<CustomLineItemVersionListElement>(customLineItemVersions);
    }

    /**
     * <p>
     * A list of <code>CustomLineItemVersionListElements</code> that are received.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomLineItemVersions(java.util.Collection)} or
     * {@link #withCustomLineItemVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customLineItemVersions
     *        A list of <code>CustomLineItemVersionListElements</code> that are received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsResult withCustomLineItemVersions(CustomLineItemVersionListElement... customLineItemVersions) {
        if (this.customLineItemVersions == null) {
            setCustomLineItemVersions(new java.util.ArrayList<CustomLineItemVersionListElement>(customLineItemVersions.length));
        }
        for (CustomLineItemVersionListElement ele : customLineItemVersions) {
            this.customLineItemVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CustomLineItemVersionListElements</code> that are received.
     * </p>
     * 
     * @param customLineItemVersions
     *        A list of <code>CustomLineItemVersionListElements</code> that are received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsResult withCustomLineItemVersions(java.util.Collection<CustomLineItemVersionListElement> customLineItemVersions) {
        setCustomLineItemVersions(customLineItemVersions);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve custom line item versions.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to retrieve custom line item versions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve custom line item versions.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to retrieve custom line item versions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve custom line item versions.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to retrieve custom line item versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsResult withNextToken(String nextToken) {
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
        if (getCustomLineItemVersions() != null)
            sb.append("CustomLineItemVersions: ").append(getCustomLineItemVersions()).append(",");
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

        if (obj instanceof ListCustomLineItemVersionsResult == false)
            return false;
        ListCustomLineItemVersionsResult other = (ListCustomLineItemVersionsResult) obj;
        if (other.getCustomLineItemVersions() == null ^ this.getCustomLineItemVersions() == null)
            return false;
        if (other.getCustomLineItemVersions() != null && other.getCustomLineItemVersions().equals(this.getCustomLineItemVersions()) == false)
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

        hashCode = prime * hashCode + ((getCustomLineItemVersions() == null) ? 0 : getCustomLineItemVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemVersionsResult clone() {
        try {
            return (ListCustomLineItemVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
