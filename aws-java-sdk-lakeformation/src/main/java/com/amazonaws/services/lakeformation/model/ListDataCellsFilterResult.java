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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListDataCellsFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataCellsFilterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>DataCellFilter</code> structures.
     * </p>
     */
    private java.util.List<DataCellsFilter> dataCellsFilters;
    /**
     * <p>
     * A continuation token, if not all requested data cell filters have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>DataCellFilter</code> structures.
     * </p>
     * 
     * @return A list of <code>DataCellFilter</code> structures.
     */

    public java.util.List<DataCellsFilter> getDataCellsFilters() {
        return dataCellsFilters;
    }

    /**
     * <p>
     * A list of <code>DataCellFilter</code> structures.
     * </p>
     * 
     * @param dataCellsFilters
     *        A list of <code>DataCellFilter</code> structures.
     */

    public void setDataCellsFilters(java.util.Collection<DataCellsFilter> dataCellsFilters) {
        if (dataCellsFilters == null) {
            this.dataCellsFilters = null;
            return;
        }

        this.dataCellsFilters = new java.util.ArrayList<DataCellsFilter>(dataCellsFilters);
    }

    /**
     * <p>
     * A list of <code>DataCellFilter</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataCellsFilters(java.util.Collection)} or {@link #withDataCellsFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataCellsFilters
     *        A list of <code>DataCellFilter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterResult withDataCellsFilters(DataCellsFilter... dataCellsFilters) {
        if (this.dataCellsFilters == null) {
            setDataCellsFilters(new java.util.ArrayList<DataCellsFilter>(dataCellsFilters.length));
        }
        for (DataCellsFilter ele : dataCellsFilters) {
            this.dataCellsFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataCellFilter</code> structures.
     * </p>
     * 
     * @param dataCellsFilters
     *        A list of <code>DataCellFilter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterResult withDataCellsFilters(java.util.Collection<DataCellsFilter> dataCellsFilters) {
        setDataCellsFilters(dataCellsFilters);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all requested data cell filters have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all requested data cell filters have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested data cell filters have been returned.
     * </p>
     * 
     * @return A continuation token, if not all requested data cell filters have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested data cell filters have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all requested data cell filters have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterResult withNextToken(String nextToken) {
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
        if (getDataCellsFilters() != null)
            sb.append("DataCellsFilters: ").append(getDataCellsFilters()).append(",");
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

        if (obj instanceof ListDataCellsFilterResult == false)
            return false;
        ListDataCellsFilterResult other = (ListDataCellsFilterResult) obj;
        if (other.getDataCellsFilters() == null ^ this.getDataCellsFilters() == null)
            return false;
        if (other.getDataCellsFilters() != null && other.getDataCellsFilters().equals(this.getDataCellsFilters()) == false)
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

        hashCode = prime * hashCode + ((getDataCellsFilters() == null) ? 0 : getDataCellsFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataCellsFilterResult clone() {
        try {
            return (ListDataCellsFilterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
