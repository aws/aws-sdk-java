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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataViewsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of Dataviews.
     * </p>
     */
    private java.util.List<DataViewSummary> dataViews;

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

    public ListDataViewsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of Dataviews.
     * </p>
     * 
     * @return A list of Dataviews.
     */

    public java.util.List<DataViewSummary> getDataViews() {
        return dataViews;
    }

    /**
     * <p>
     * A list of Dataviews.
     * </p>
     * 
     * @param dataViews
     *        A list of Dataviews.
     */

    public void setDataViews(java.util.Collection<DataViewSummary> dataViews) {
        if (dataViews == null) {
            this.dataViews = null;
            return;
        }

        this.dataViews = new java.util.ArrayList<DataViewSummary>(dataViews);
    }

    /**
     * <p>
     * A list of Dataviews.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataViews(java.util.Collection)} or {@link #withDataViews(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataViews
     *        A list of Dataviews.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataViewsResult withDataViews(DataViewSummary... dataViews) {
        if (this.dataViews == null) {
            setDataViews(new java.util.ArrayList<DataViewSummary>(dataViews.length));
        }
        for (DataViewSummary ele : dataViews) {
            this.dataViews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Dataviews.
     * </p>
     * 
     * @param dataViews
     *        A list of Dataviews.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataViewsResult withDataViews(java.util.Collection<DataViewSummary> dataViews) {
        setDataViews(dataViews);
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
        if (getDataViews() != null)
            sb.append("DataViews: ").append(getDataViews());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataViewsResult == false)
            return false;
        ListDataViewsResult other = (ListDataViewsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDataViews() == null ^ this.getDataViews() == null)
            return false;
        if (other.getDataViews() != null && other.getDataViews().equals(this.getDataViews()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDataViews() == null) ? 0 : getDataViews().hashCode());
        return hashCode;
    }

    @Override
    public ListDataViewsResult clone() {
        try {
            return (ListDataViewsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
