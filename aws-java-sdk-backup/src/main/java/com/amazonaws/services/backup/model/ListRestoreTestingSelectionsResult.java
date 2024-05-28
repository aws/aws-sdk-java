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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreTestingSelections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRestoreTestingSelectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the nexttoken.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned restore testing selections associated with the restore testing plan.
     * </p>
     */
    private java.util.List<RestoreTestingSelectionForList> restoreTestingSelections;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the nexttoken.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the nexttoken.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the nexttoken.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the nexttoken.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the nexttoken.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the nexttoken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreTestingSelectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned restore testing selections associated with the restore testing plan.
     * </p>
     * 
     * @return The returned restore testing selections associated with the restore testing plan.
     */

    public java.util.List<RestoreTestingSelectionForList> getRestoreTestingSelections() {
        return restoreTestingSelections;
    }

    /**
     * <p>
     * The returned restore testing selections associated with the restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelections
     *        The returned restore testing selections associated with the restore testing plan.
     */

    public void setRestoreTestingSelections(java.util.Collection<RestoreTestingSelectionForList> restoreTestingSelections) {
        if (restoreTestingSelections == null) {
            this.restoreTestingSelections = null;
            return;
        }

        this.restoreTestingSelections = new java.util.ArrayList<RestoreTestingSelectionForList>(restoreTestingSelections);
    }

    /**
     * <p>
     * The returned restore testing selections associated with the restore testing plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRestoreTestingSelections(java.util.Collection)} or
     * {@link #withRestoreTestingSelections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param restoreTestingSelections
     *        The returned restore testing selections associated with the restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreTestingSelectionsResult withRestoreTestingSelections(RestoreTestingSelectionForList... restoreTestingSelections) {
        if (this.restoreTestingSelections == null) {
            setRestoreTestingSelections(new java.util.ArrayList<RestoreTestingSelectionForList>(restoreTestingSelections.length));
        }
        for (RestoreTestingSelectionForList ele : restoreTestingSelections) {
            this.restoreTestingSelections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned restore testing selections associated with the restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelections
     *        The returned restore testing selections associated with the restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreTestingSelectionsResult withRestoreTestingSelections(java.util.Collection<RestoreTestingSelectionForList> restoreTestingSelections) {
        setRestoreTestingSelections(restoreTestingSelections);
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
        if (getRestoreTestingSelections() != null)
            sb.append("RestoreTestingSelections: ").append(getRestoreTestingSelections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRestoreTestingSelectionsResult == false)
            return false;
        ListRestoreTestingSelectionsResult other = (ListRestoreTestingSelectionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRestoreTestingSelections() == null ^ this.getRestoreTestingSelections() == null)
            return false;
        if (other.getRestoreTestingSelections() != null && other.getRestoreTestingSelections().equals(this.getRestoreTestingSelections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelections() == null) ? 0 : getRestoreTestingSelections().hashCode());
        return hashCode;
    }

    @Override
    public ListRestoreTestingSelectionsResult clone() {
        try {
            return (ListRestoreTestingSelectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
