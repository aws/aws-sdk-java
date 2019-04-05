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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListRecordHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecordHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The records, in reverse chronological order.
     * </p>
     */
    private java.util.List<RecordDetail> recordDetails;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The records, in reverse chronological order.
     * </p>
     * 
     * @return The records, in reverse chronological order.
     */

    public java.util.List<RecordDetail> getRecordDetails() {
        return recordDetails;
    }

    /**
     * <p>
     * The records, in reverse chronological order.
     * </p>
     * 
     * @param recordDetails
     *        The records, in reverse chronological order.
     */

    public void setRecordDetails(java.util.Collection<RecordDetail> recordDetails) {
        if (recordDetails == null) {
            this.recordDetails = null;
            return;
        }

        this.recordDetails = new java.util.ArrayList<RecordDetail>(recordDetails);
    }

    /**
     * <p>
     * The records, in reverse chronological order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordDetails(java.util.Collection)} or {@link #withRecordDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recordDetails
     *        The records, in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordHistoryResult withRecordDetails(RecordDetail... recordDetails) {
        if (this.recordDetails == null) {
            setRecordDetails(new java.util.ArrayList<RecordDetail>(recordDetails.length));
        }
        for (RecordDetail ele : recordDetails) {
            this.recordDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The records, in reverse chronological order.
     * </p>
     * 
     * @param recordDetails
     *        The records, in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordHistoryResult withRecordDetails(java.util.Collection<RecordDetail> recordDetails) {
        setRecordDetails(recordDetails);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordHistoryResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getRecordDetails() != null)
            sb.append("RecordDetails: ").append(getRecordDetails()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecordHistoryResult == false)
            return false;
        ListRecordHistoryResult other = (ListRecordHistoryResult) obj;
        if (other.getRecordDetails() == null ^ this.getRecordDetails() == null)
            return false;
        if (other.getRecordDetails() != null && other.getRecordDetails().equals(this.getRecordDetails()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordDetails() == null) ? 0 : getRecordDetails().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecordHistoryResult clone() {
        try {
            return (ListRecordHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
