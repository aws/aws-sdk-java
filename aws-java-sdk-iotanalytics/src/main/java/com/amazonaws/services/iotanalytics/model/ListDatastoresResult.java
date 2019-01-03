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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatastores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatastoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of "DatastoreSummary" objects.
     * </p>
     */
    private java.util.List<DatastoreSummary> datastoreSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of "DatastoreSummary" objects.
     * </p>
     * 
     * @return A list of "DatastoreSummary" objects.
     */

    public java.util.List<DatastoreSummary> getDatastoreSummaries() {
        return datastoreSummaries;
    }

    /**
     * <p>
     * A list of "DatastoreSummary" objects.
     * </p>
     * 
     * @param datastoreSummaries
     *        A list of "DatastoreSummary" objects.
     */

    public void setDatastoreSummaries(java.util.Collection<DatastoreSummary> datastoreSummaries) {
        if (datastoreSummaries == null) {
            this.datastoreSummaries = null;
            return;
        }

        this.datastoreSummaries = new java.util.ArrayList<DatastoreSummary>(datastoreSummaries);
    }

    /**
     * <p>
     * A list of "DatastoreSummary" objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatastoreSummaries(java.util.Collection)} or {@link #withDatastoreSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param datastoreSummaries
     *        A list of "DatastoreSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatastoresResult withDatastoreSummaries(DatastoreSummary... datastoreSummaries) {
        if (this.datastoreSummaries == null) {
            setDatastoreSummaries(new java.util.ArrayList<DatastoreSummary>(datastoreSummaries.length));
        }
        for (DatastoreSummary ele : datastoreSummaries) {
            this.datastoreSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "DatastoreSummary" objects.
     * </p>
     * 
     * @param datastoreSummaries
     *        A list of "DatastoreSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatastoresResult withDatastoreSummaries(java.util.Collection<DatastoreSummary> datastoreSummaries) {
        setDatastoreSummaries(datastoreSummaries);
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

    public ListDatastoresResult withNextToken(String nextToken) {
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
        if (getDatastoreSummaries() != null)
            sb.append("DatastoreSummaries: ").append(getDatastoreSummaries()).append(",");
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

        if (obj instanceof ListDatastoresResult == false)
            return false;
        ListDatastoresResult other = (ListDatastoresResult) obj;
        if (other.getDatastoreSummaries() == null ^ this.getDatastoreSummaries() == null)
            return false;
        if (other.getDatastoreSummaries() != null && other.getDatastoreSummaries().equals(this.getDatastoreSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDatastoreSummaries() == null) ? 0 : getDatastoreSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatastoresResult clone() {
        try {
            return (ListDatastoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
