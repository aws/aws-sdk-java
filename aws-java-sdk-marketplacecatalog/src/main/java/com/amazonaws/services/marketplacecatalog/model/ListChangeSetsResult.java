/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangeSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     */
    private java.util.List<ChangeSetSummaryListItem> changeSetSummaryList;
    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * 
     * @return Array of <code>ChangeSetSummaryListItem</code> objects.
     */

    public java.util.List<ChangeSetSummaryListItem> getChangeSetSummaryList() {
        return changeSetSummaryList;
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * 
     * @param changeSetSummaryList
     *        Array of <code>ChangeSetSummaryListItem</code> objects.
     */

    public void setChangeSetSummaryList(java.util.Collection<ChangeSetSummaryListItem> changeSetSummaryList) {
        if (changeSetSummaryList == null) {
            this.changeSetSummaryList = null;
            return;
        }

        this.changeSetSummaryList = new java.util.ArrayList<ChangeSetSummaryListItem>(changeSetSummaryList);
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeSetSummaryList(java.util.Collection)} or {@link #withChangeSetSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param changeSetSummaryList
     *        Array of <code>ChangeSetSummaryListItem</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withChangeSetSummaryList(ChangeSetSummaryListItem... changeSetSummaryList) {
        if (this.changeSetSummaryList == null) {
            setChangeSetSummaryList(new java.util.ArrayList<ChangeSetSummaryListItem>(changeSetSummaryList.length));
        }
        for (ChangeSetSummaryListItem ele : changeSetSummaryList) {
            this.changeSetSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * 
     * @param changeSetSummaryList
     *        Array of <code>ChangeSetSummaryListItem</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withChangeSetSummaryList(java.util.Collection<ChangeSetSummaryListItem> changeSetSummaryList) {
        setChangeSetSummaryList(changeSetSummaryList);
        return this;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @return The value of the next token, if it exists. Null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withNextToken(String nextToken) {
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
        if (getChangeSetSummaryList() != null)
            sb.append("ChangeSetSummaryList: ").append(getChangeSetSummaryList()).append(",");
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

        if (obj instanceof ListChangeSetsResult == false)
            return false;
        ListChangeSetsResult other = (ListChangeSetsResult) obj;
        if (other.getChangeSetSummaryList() == null ^ this.getChangeSetSummaryList() == null)
            return false;
        if (other.getChangeSetSummaryList() != null && other.getChangeSetSummaryList().equals(this.getChangeSetSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getChangeSetSummaryList() == null) ? 0 : getChangeSetSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChangeSetsResult clone() {
        try {
            return (ListChangeSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
