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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsByResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that contain detailed information about recovery points of the specified resource type.
     * </p>
     */
    private java.util.List<RecoveryPointByResource> recoveryPoints;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery points of the specified resource type.
     * </p>
     * 
     * @return An array of objects that contain detailed information about recovery points of the specified resource
     *         type.
     */

    public java.util.List<RecoveryPointByResource> getRecoveryPoints() {
        return recoveryPoints;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery points of the specified resource type.
     * </p>
     * 
     * @param recoveryPoints
     *        An array of objects that contain detailed information about recovery points of the specified resource
     *        type.
     */

    public void setRecoveryPoints(java.util.Collection<RecoveryPointByResource> recoveryPoints) {
        if (recoveryPoints == null) {
            this.recoveryPoints = null;
            return;
        }

        this.recoveryPoints = new java.util.ArrayList<RecoveryPointByResource>(recoveryPoints);
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery points of the specified resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryPoints(java.util.Collection)} or {@link #withRecoveryPoints(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recoveryPoints
     *        An array of objects that contain detailed information about recovery points of the specified resource
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceResult withRecoveryPoints(RecoveryPointByResource... recoveryPoints) {
        if (this.recoveryPoints == null) {
            setRecoveryPoints(new java.util.ArrayList<RecoveryPointByResource>(recoveryPoints.length));
        }
        for (RecoveryPointByResource ele : recoveryPoints) {
            this.recoveryPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery points of the specified resource type.
     * </p>
     * 
     * @param recoveryPoints
     *        An array of objects that contain detailed information about recovery points of the specified resource
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceResult withRecoveryPoints(java.util.Collection<RecoveryPointByResource> recoveryPoints) {
        setRecoveryPoints(recoveryPoints);
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
        if (getRecoveryPoints() != null)
            sb.append("RecoveryPoints: ").append(getRecoveryPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByResourceResult == false)
            return false;
        ListRecoveryPointsByResourceResult other = (ListRecoveryPointsByResourceResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecoveryPoints() == null ^ this.getRecoveryPoints() == null)
            return false;
        if (other.getRecoveryPoints() != null && other.getRecoveryPoints().equals(this.getRecoveryPoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPoints() == null) ? 0 : getRecoveryPoints().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsByResourceResult clone() {
        try {
            return (ListRecoveryPointsByResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
