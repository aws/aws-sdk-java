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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAddons" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAddonsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of available add-ons.
     * </p>
     */
    private java.util.List<String> addons;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * A list of available add-ons.
     * </p>
     * 
     * @return A list of available add-ons.
     */

    public java.util.List<String> getAddons() {
        return addons;
    }

    /**
     * <p>
     * A list of available add-ons.
     * </p>
     * 
     * @param addons
     *        A list of available add-ons.
     */

    public void setAddons(java.util.Collection<String> addons) {
        if (addons == null) {
            this.addons = null;
            return;
        }

        this.addons = new java.util.ArrayList<String>(addons);
    }

    /**
     * <p>
     * A list of available add-ons.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddons(java.util.Collection)} or {@link #withAddons(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param addons
     *        A list of available add-ons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonsResult withAddons(String... addons) {
        if (this.addons == null) {
            setAddons(new java.util.ArrayList<String>(addons.length));
        }
        for (String ele : addons) {
            this.addons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available add-ons.
     * </p>
     * 
     * @param addons
     *        A list of available add-ons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonsResult withAddons(java.util.Collection<String> addons) {
        setAddons(addons);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAddonsResponse</code> where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonsResult withNextToken(String nextToken) {
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
        if (getAddons() != null)
            sb.append("Addons: ").append(getAddons()).append(",");
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

        if (obj instanceof ListAddonsResult == false)
            return false;
        ListAddonsResult other = (ListAddonsResult) obj;
        if (other.getAddons() == null ^ this.getAddons() == null)
            return false;
        if (other.getAddons() != null && other.getAddons().equals(this.getAddons()) == false)
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

        hashCode = prime * hashCode + ((getAddons() == null) ? 0 : getAddons().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAddonsResult clone() {
        try {
            return (ListAddonsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
