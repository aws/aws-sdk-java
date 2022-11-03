/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTrustAnchors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrustAnchorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of trust anchors.
     * </p>
     */
    private java.util.List<TrustAnchorDetail> trustAnchors;

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous operation did not show all
     *         results. To get the next results, call the operation again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustAnchorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of trust anchors.
     * </p>
     * 
     * @return A list of trust anchors.
     */

    public java.util.List<TrustAnchorDetail> getTrustAnchors() {
        return trustAnchors;
    }

    /**
     * <p>
     * A list of trust anchors.
     * </p>
     * 
     * @param trustAnchors
     *        A list of trust anchors.
     */

    public void setTrustAnchors(java.util.Collection<TrustAnchorDetail> trustAnchors) {
        if (trustAnchors == null) {
            this.trustAnchors = null;
            return;
        }

        this.trustAnchors = new java.util.ArrayList<TrustAnchorDetail>(trustAnchors);
    }

    /**
     * <p>
     * A list of trust anchors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustAnchors(java.util.Collection)} or {@link #withTrustAnchors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trustAnchors
     *        A list of trust anchors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustAnchorsResult withTrustAnchors(TrustAnchorDetail... trustAnchors) {
        if (this.trustAnchors == null) {
            setTrustAnchors(new java.util.ArrayList<TrustAnchorDetail>(trustAnchors.length));
        }
        for (TrustAnchorDetail ele : trustAnchors) {
            this.trustAnchors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of trust anchors.
     * </p>
     * 
     * @param trustAnchors
     *        A list of trust anchors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustAnchorsResult withTrustAnchors(java.util.Collection<TrustAnchorDetail> trustAnchors) {
        setTrustAnchors(trustAnchors);
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
        if (getTrustAnchors() != null)
            sb.append("TrustAnchors: ").append(getTrustAnchors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrustAnchorsResult == false)
            return false;
        ListTrustAnchorsResult other = (ListTrustAnchorsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrustAnchors() == null ^ this.getTrustAnchors() == null)
            return false;
        if (other.getTrustAnchors() != null && other.getTrustAnchors().equals(this.getTrustAnchors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchors() == null) ? 0 : getTrustAnchors().hashCode());
        return hashCode;
    }

    @Override
    public ListTrustAnchorsResult clone() {
        try {
            return (ListTrustAnchorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
