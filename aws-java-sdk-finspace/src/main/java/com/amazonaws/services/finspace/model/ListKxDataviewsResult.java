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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxDataviews" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxDataviewsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of kdb dataviews that are currently active for the given database.
     * </p>
     */
    private java.util.List<KxDataviewListEntry> kxDataviews;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of kdb dataviews that are currently active for the given database.
     * </p>
     * 
     * @return The list of kdb dataviews that are currently active for the given database.
     */

    public java.util.List<KxDataviewListEntry> getKxDataviews() {
        return kxDataviews;
    }

    /**
     * <p>
     * The list of kdb dataviews that are currently active for the given database.
     * </p>
     * 
     * @param kxDataviews
     *        The list of kdb dataviews that are currently active for the given database.
     */

    public void setKxDataviews(java.util.Collection<KxDataviewListEntry> kxDataviews) {
        if (kxDataviews == null) {
            this.kxDataviews = null;
            return;
        }

        this.kxDataviews = new java.util.ArrayList<KxDataviewListEntry>(kxDataviews);
    }

    /**
     * <p>
     * The list of kdb dataviews that are currently active for the given database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKxDataviews(java.util.Collection)} or {@link #withKxDataviews(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param kxDataviews
     *        The list of kdb dataviews that are currently active for the given database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxDataviewsResult withKxDataviews(KxDataviewListEntry... kxDataviews) {
        if (this.kxDataviews == null) {
            setKxDataviews(new java.util.ArrayList<KxDataviewListEntry>(kxDataviews.length));
        }
        for (KxDataviewListEntry ele : kxDataviews) {
            this.kxDataviews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of kdb dataviews that are currently active for the given database.
     * </p>
     * 
     * @param kxDataviews
     *        The list of kdb dataviews that are currently active for the given database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxDataviewsResult withKxDataviews(java.util.Collection<KxDataviewListEntry> kxDataviews) {
        setKxDataviews(kxDataviews);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxDataviewsResult withNextToken(String nextToken) {
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
        if (getKxDataviews() != null)
            sb.append("KxDataviews: ").append(getKxDataviews()).append(",");
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

        if (obj instanceof ListKxDataviewsResult == false)
            return false;
        ListKxDataviewsResult other = (ListKxDataviewsResult) obj;
        if (other.getKxDataviews() == null ^ this.getKxDataviews() == null)
            return false;
        if (other.getKxDataviews() != null && other.getKxDataviews().equals(this.getKxDataviews()) == false)
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

        hashCode = prime * hashCode + ((getKxDataviews() == null) ? 0 : getKxDataviews().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxDataviewsResult clone() {
        try {
            return (ListKxDataviewsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
