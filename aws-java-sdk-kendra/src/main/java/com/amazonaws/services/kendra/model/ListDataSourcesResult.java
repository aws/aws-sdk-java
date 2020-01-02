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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     */
    private java.util.List<DataSourceSummary> summaryItems;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of data sources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * 
     * @return An array of summary information for one or more data sources.
     */

    public java.util.List<DataSourceSummary> getSummaryItems() {
        return summaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more data sources.
     */

    public void setSummaryItems(java.util.Collection<DataSourceSummary> summaryItems) {
        if (summaryItems == null) {
            this.summaryItems = null;
            return;
        }

        this.summaryItems = new java.util.ArrayList<DataSourceSummary>(summaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryItems(java.util.Collection)} or {@link #withSummaryItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withSummaryItems(DataSourceSummary... summaryItems) {
        if (this.summaryItems == null) {
            setSummaryItems(new java.util.ArrayList<DataSourceSummary>(summaryItems.length));
        }
        for (DataSourceSummary ele : summaryItems) {
            this.summaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withSummaryItems(java.util.Collection<DataSourceSummary> summaryItems) {
        setSummaryItems(summaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of data sources.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of data sources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of data sources.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *         to retrieve the next set of data sources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of data sources.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withNextToken(String nextToken) {
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
        if (getSummaryItems() != null)
            sb.append("SummaryItems: ").append(getSummaryItems()).append(",");
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

        if (obj instanceof ListDataSourcesResult == false)
            return false;
        ListDataSourcesResult other = (ListDataSourcesResult) obj;
        if (other.getSummaryItems() == null ^ this.getSummaryItems() == null)
            return false;
        if (other.getSummaryItems() != null && other.getSummaryItems().equals(this.getSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getSummaryItems() == null) ? 0 : getSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourcesResult clone() {
        try {
            return (ListDataSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
