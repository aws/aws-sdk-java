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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date-time for the beginning and end of the time window for the search metrics data.
     * </p>
     */
    private TimeRange snapShotTimeFilter;
    /**
     * <p>
     * The column headers for the search metrics data.
     * </p>
     */
    private java.util.List<String> snapshotsDataHeader;
    /**
     * <p>
     * The search metrics data. The data returned depends on the metric type you requested.
     * </p>
     */
    private java.util.List<java.util.List<String>> snapshotsData;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of search metrics data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The date-time for the beginning and end of the time window for the search metrics data.
     * </p>
     * 
     * @param snapShotTimeFilter
     *        The date-time for the beginning and end of the time window for the search metrics data.
     */

    public void setSnapShotTimeFilter(TimeRange snapShotTimeFilter) {
        this.snapShotTimeFilter = snapShotTimeFilter;
    }

    /**
     * <p>
     * The date-time for the beginning and end of the time window for the search metrics data.
     * </p>
     * 
     * @return The date-time for the beginning and end of the time window for the search metrics data.
     */

    public TimeRange getSnapShotTimeFilter() {
        return this.snapShotTimeFilter;
    }

    /**
     * <p>
     * The date-time for the beginning and end of the time window for the search metrics data.
     * </p>
     * 
     * @param snapShotTimeFilter
     *        The date-time for the beginning and end of the time window for the search metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withSnapShotTimeFilter(TimeRange snapShotTimeFilter) {
        setSnapShotTimeFilter(snapShotTimeFilter);
        return this;
    }

    /**
     * <p>
     * The column headers for the search metrics data.
     * </p>
     * 
     * @return The column headers for the search metrics data.
     */

    public java.util.List<String> getSnapshotsDataHeader() {
        return snapshotsDataHeader;
    }

    /**
     * <p>
     * The column headers for the search metrics data.
     * </p>
     * 
     * @param snapshotsDataHeader
     *        The column headers for the search metrics data.
     */

    public void setSnapshotsDataHeader(java.util.Collection<String> snapshotsDataHeader) {
        if (snapshotsDataHeader == null) {
            this.snapshotsDataHeader = null;
            return;
        }

        this.snapshotsDataHeader = new java.util.ArrayList<String>(snapshotsDataHeader);
    }

    /**
     * <p>
     * The column headers for the search metrics data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotsDataHeader(java.util.Collection)} or {@link #withSnapshotsDataHeader(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param snapshotsDataHeader
     *        The column headers for the search metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withSnapshotsDataHeader(String... snapshotsDataHeader) {
        if (this.snapshotsDataHeader == null) {
            setSnapshotsDataHeader(new java.util.ArrayList<String>(snapshotsDataHeader.length));
        }
        for (String ele : snapshotsDataHeader) {
            this.snapshotsDataHeader.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column headers for the search metrics data.
     * </p>
     * 
     * @param snapshotsDataHeader
     *        The column headers for the search metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withSnapshotsDataHeader(java.util.Collection<String> snapshotsDataHeader) {
        setSnapshotsDataHeader(snapshotsDataHeader);
        return this;
    }

    /**
     * <p>
     * The search metrics data. The data returned depends on the metric type you requested.
     * </p>
     * 
     * @return The search metrics data. The data returned depends on the metric type you requested.
     */

    public java.util.List<java.util.List<String>> getSnapshotsData() {
        return snapshotsData;
    }

    /**
     * <p>
     * The search metrics data. The data returned depends on the metric type you requested.
     * </p>
     * 
     * @param snapshotsData
     *        The search metrics data. The data returned depends on the metric type you requested.
     */

    public void setSnapshotsData(java.util.Collection<java.util.List<String>> snapshotsData) {
        if (snapshotsData == null) {
            this.snapshotsData = null;
            return;
        }

        this.snapshotsData = new java.util.ArrayList<java.util.List<String>>(snapshotsData);
    }

    /**
     * <p>
     * The search metrics data. The data returned depends on the metric type you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotsData(java.util.Collection)} or {@link #withSnapshotsData(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param snapshotsData
     *        The search metrics data. The data returned depends on the metric type you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withSnapshotsData(java.util.List<String>... snapshotsData) {
        if (this.snapshotsData == null) {
            setSnapshotsData(new java.util.ArrayList<java.util.List<String>>(snapshotsData.length));
        }
        for (java.util.List<String> ele : snapshotsData) {
            this.snapshotsData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The search metrics data. The data returned depends on the metric type you requested.
     * </p>
     * 
     * @param snapshotsData
     *        The search metrics data. The data returned depends on the metric type you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withSnapshotsData(java.util.Collection<java.util.List<String>> snapshotsData) {
        setSnapshotsData(snapshotsData);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of search metrics data.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *        retrieve the next set of search metrics data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of search metrics data.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *         retrieve the next set of search metrics data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of search metrics data.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *        retrieve the next set of search metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsResult withNextToken(String nextToken) {
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
        if (getSnapShotTimeFilter() != null)
            sb.append("SnapShotTimeFilter: ").append(getSnapShotTimeFilter()).append(",");
        if (getSnapshotsDataHeader() != null)
            sb.append("SnapshotsDataHeader: ").append(getSnapshotsDataHeader()).append(",");
        if (getSnapshotsData() != null)
            sb.append("SnapshotsData: ").append(getSnapshotsData()).append(",");
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

        if (obj instanceof GetSnapshotsResult == false)
            return false;
        GetSnapshotsResult other = (GetSnapshotsResult) obj;
        if (other.getSnapShotTimeFilter() == null ^ this.getSnapShotTimeFilter() == null)
            return false;
        if (other.getSnapShotTimeFilter() != null && other.getSnapShotTimeFilter().equals(this.getSnapShotTimeFilter()) == false)
            return false;
        if (other.getSnapshotsDataHeader() == null ^ this.getSnapshotsDataHeader() == null)
            return false;
        if (other.getSnapshotsDataHeader() != null && other.getSnapshotsDataHeader().equals(this.getSnapshotsDataHeader()) == false)
            return false;
        if (other.getSnapshotsData() == null ^ this.getSnapshotsData() == null)
            return false;
        if (other.getSnapshotsData() != null && other.getSnapshotsData().equals(this.getSnapshotsData()) == false)
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

        hashCode = prime * hashCode + ((getSnapShotTimeFilter() == null) ? 0 : getSnapShotTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getSnapshotsDataHeader() == null) ? 0 : getSnapshotsDataHeader().hashCode());
        hashCode = prime * hashCode + ((getSnapshotsData() == null) ? 0 : getSnapshotsData().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotsResult clone() {
        try {
            return (GetSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
