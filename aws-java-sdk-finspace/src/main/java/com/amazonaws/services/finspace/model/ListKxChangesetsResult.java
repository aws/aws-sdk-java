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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxChangesets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxChangesetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of changesets for a database.
     * </p>
     */
    private java.util.List<KxChangesetListEntry> kxChangesets;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of changesets for a database.
     * </p>
     * 
     * @return A list of changesets for a database.
     */

    public java.util.List<KxChangesetListEntry> getKxChangesets() {
        return kxChangesets;
    }

    /**
     * <p>
     * A list of changesets for a database.
     * </p>
     * 
     * @param kxChangesets
     *        A list of changesets for a database.
     */

    public void setKxChangesets(java.util.Collection<KxChangesetListEntry> kxChangesets) {
        if (kxChangesets == null) {
            this.kxChangesets = null;
            return;
        }

        this.kxChangesets = new java.util.ArrayList<KxChangesetListEntry>(kxChangesets);
    }

    /**
     * <p>
     * A list of changesets for a database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKxChangesets(java.util.Collection)} or {@link #withKxChangesets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param kxChangesets
     *        A list of changesets for a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxChangesetsResult withKxChangesets(KxChangesetListEntry... kxChangesets) {
        if (this.kxChangesets == null) {
            setKxChangesets(new java.util.ArrayList<KxChangesetListEntry>(kxChangesets.length));
        }
        for (KxChangesetListEntry ele : kxChangesets) {
            this.kxChangesets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of changesets for a database.
     * </p>
     * 
     * @param kxChangesets
     *        A list of changesets for a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxChangesetsResult withKxChangesets(java.util.Collection<KxChangesetListEntry> kxChangesets) {
        setKxChangesets(kxChangesets);
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

    public ListKxChangesetsResult withNextToken(String nextToken) {
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
        if (getKxChangesets() != null)
            sb.append("KxChangesets: ").append(getKxChangesets()).append(",");
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

        if (obj instanceof ListKxChangesetsResult == false)
            return false;
        ListKxChangesetsResult other = (ListKxChangesetsResult) obj;
        if (other.getKxChangesets() == null ^ this.getKxChangesets() == null)
            return false;
        if (other.getKxChangesets() != null && other.getKxChangesets().equals(this.getKxChangesets()) == false)
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

        hashCode = prime * hashCode + ((getKxChangesets() == null) ? 0 : getKxChangesets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxChangesetsResult clone() {
        try {
            return (ListKxChangesetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
