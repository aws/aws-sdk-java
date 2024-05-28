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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response containing search results from a completed archive search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveSearchResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of email result objects matching the search criteria.
     * </p>
     */
    private java.util.List<Row> rows;

    /**
     * <p>
     * The list of email result objects matching the search criteria.
     * </p>
     * 
     * @return The list of email result objects matching the search criteria.
     */

    public java.util.List<Row> getRows() {
        return rows;
    }

    /**
     * <p>
     * The list of email result objects matching the search criteria.
     * </p>
     * 
     * @param rows
     *        The list of email result objects matching the search criteria.
     */

    public void setRows(java.util.Collection<Row> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<Row>(rows);
    }

    /**
     * <p>
     * The list of email result objects matching the search criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        The list of email result objects matching the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveSearchResultsResult withRows(Row... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<Row>(rows.length));
        }
        for (Row ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of email result objects matching the search criteria.
     * </p>
     * 
     * @param rows
     *        The list of email result objects matching the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveSearchResultsResult withRows(java.util.Collection<Row> rows) {
        setRows(rows);
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
        if (getRows() != null)
            sb.append("Rows: ").append(getRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveSearchResultsResult == false)
            return false;
        GetArchiveSearchResultsResult other = (GetArchiveSearchResultsResult) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveSearchResultsResult clone() {
        try {
            return (GetArchiveSearchResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
