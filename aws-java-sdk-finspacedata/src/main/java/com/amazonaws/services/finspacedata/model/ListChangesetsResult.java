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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response to ListChangesetsResponse. This returns a list of dataset changesets that match the query criteria.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangesetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Changesets found.
     * </p>
     */
    private java.util.List<ChangesetSummary> changesets;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of Changesets found.
     * </p>
     * 
     * @return List of Changesets found.
     */

    public java.util.List<ChangesetSummary> getChangesets() {
        return changesets;
    }

    /**
     * <p>
     * List of Changesets found.
     * </p>
     * 
     * @param changesets
     *        List of Changesets found.
     */

    public void setChangesets(java.util.Collection<ChangesetSummary> changesets) {
        if (changesets == null) {
            this.changesets = null;
            return;
        }

        this.changesets = new java.util.ArrayList<ChangesetSummary>(changesets);
    }

    /**
     * <p>
     * List of Changesets found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangesets(java.util.Collection)} or {@link #withChangesets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param changesets
     *        List of Changesets found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangesetsResult withChangesets(ChangesetSummary... changesets) {
        if (this.changesets == null) {
            setChangesets(new java.util.ArrayList<ChangesetSummary>(changesets.length));
        }
        for (ChangesetSummary ele : changesets) {
            this.changesets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Changesets found.
     * </p>
     * 
     * @param changesets
     *        List of Changesets found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangesetsResult withChangesets(java.util.Collection<ChangesetSummary> changesets) {
        setChangesets(changesets);
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

    public ListChangesetsResult withNextToken(String nextToken) {
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
        if (getChangesets() != null)
            sb.append("Changesets: ").append(getChangesets()).append(",");
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

        if (obj instanceof ListChangesetsResult == false)
            return false;
        ListChangesetsResult other = (ListChangesetsResult) obj;
        if (other.getChangesets() == null ^ this.getChangesets() == null)
            return false;
        if (other.getChangesets() != null && other.getChangesets().equals(this.getChangesets()) == false)
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

        hashCode = prime * hashCode + ((getChangesets() == null) ? 0 : getChangesets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChangesetsResult clone() {
        try {
            return (ListChangesetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
