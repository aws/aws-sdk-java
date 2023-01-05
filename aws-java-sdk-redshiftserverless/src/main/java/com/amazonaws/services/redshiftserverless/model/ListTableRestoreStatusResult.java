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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableRestoreStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     * returns results on the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The array of returned <code>TableRestoreStatus</code> objects.
     * </p>
     */
    private java.util.List<TableRestoreStatus> tableRestoreStatuses;

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     * returns results on the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations.
     *        This will returns results on the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     * returns results on the next page.
     * </p>
     * 
     * @return If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations.
     *         This will returns results on the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     * returns results on the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListTableRestoreStatus</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations.
     *        This will returns results on the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The array of returned <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @return The array of returned <code>TableRestoreStatus</code> objects.
     */

    public java.util.List<TableRestoreStatus> getTableRestoreStatuses() {
        return tableRestoreStatuses;
    }

    /**
     * <p>
     * The array of returned <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param tableRestoreStatuses
     *        The array of returned <code>TableRestoreStatus</code> objects.
     */

    public void setTableRestoreStatuses(java.util.Collection<TableRestoreStatus> tableRestoreStatuses) {
        if (tableRestoreStatuses == null) {
            this.tableRestoreStatuses = null;
            return;
        }

        this.tableRestoreStatuses = new java.util.ArrayList<TableRestoreStatus>(tableRestoreStatuses);
    }

    /**
     * <p>
     * The array of returned <code>TableRestoreStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableRestoreStatuses(java.util.Collection)} or {@link #withTableRestoreStatuses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param tableRestoreStatuses
     *        The array of returned <code>TableRestoreStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusResult withTableRestoreStatuses(TableRestoreStatus... tableRestoreStatuses) {
        if (this.tableRestoreStatuses == null) {
            setTableRestoreStatuses(new java.util.ArrayList<TableRestoreStatus>(tableRestoreStatuses.length));
        }
        for (TableRestoreStatus ele : tableRestoreStatuses) {
            this.tableRestoreStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of returned <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param tableRestoreStatuses
     *        The array of returned <code>TableRestoreStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusResult withTableRestoreStatuses(java.util.Collection<TableRestoreStatus> tableRestoreStatuses) {
        setTableRestoreStatuses(tableRestoreStatuses);
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
        if (getTableRestoreStatuses() != null)
            sb.append("TableRestoreStatuses: ").append(getTableRestoreStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTableRestoreStatusResult == false)
            return false;
        ListTableRestoreStatusResult other = (ListTableRestoreStatusResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTableRestoreStatuses() == null ^ this.getTableRestoreStatuses() == null)
            return false;
        if (other.getTableRestoreStatuses() != null && other.getTableRestoreStatuses().equals(this.getTableRestoreStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTableRestoreStatuses() == null) ? 0 : getTableRestoreStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ListTableRestoreStatusResult clone() {
        try {
            return (ListTableRestoreStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
