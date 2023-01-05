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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSignalCatalogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of information about each signal catalog.
     * </p>
     */
    private java.util.List<SignalCatalogSummary> summaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of information about each signal catalog.
     * </p>
     * 
     * @return A list of information about each signal catalog.
     */

    public java.util.List<SignalCatalogSummary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * A list of information about each signal catalog.
     * </p>
     * 
     * @param summaries
     *        A list of information about each signal catalog.
     */

    public void setSummaries(java.util.Collection<SignalCatalogSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<SignalCatalogSummary>(summaries);
    }

    /**
     * <p>
     * A list of information about each signal catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of information about each signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalCatalogsResult withSummaries(SignalCatalogSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new java.util.ArrayList<SignalCatalogSummary>(summaries.length));
        }
        for (SignalCatalogSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about each signal catalog.
     * </p>
     * 
     * @param summaries
     *        A list of information about each signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalCatalogsResult withSummaries(java.util.Collection<SignalCatalogSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalCatalogsResult withNextToken(String nextToken) {
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
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

        if (obj instanceof ListSignalCatalogsResult == false)
            return false;
        ListSignalCatalogsResult other = (ListSignalCatalogsResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSignalCatalogsResult clone() {
        try {
            return (ListSignalCatalogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
