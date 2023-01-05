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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDataSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * </p>
     */
    private java.util.List<DataSetSummary> dataSetSummaries;
    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * </p>
     * 
     * @return A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     */

    public java.util.List<DataSetSummary> getDataSetSummaries() {
        return dataSetSummaries;
    }

    /**
     * <p>
     * A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * </p>
     * 
     * @param dataSetSummaries
     *        A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     */

    public void setDataSetSummaries(java.util.Collection<DataSetSummary> dataSetSummaries) {
        if (dataSetSummaries == null) {
            this.dataSetSummaries = null;
            return;
        }

        this.dataSetSummaries = new java.util.ArrayList<DataSetSummary>(dataSetSummaries);
    }

    /**
     * <p>
     * A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetSummaries(java.util.Collection)} or {@link #withDataSetSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataSetSummaries
     *        A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSetsResult withDataSetSummaries(DataSetSummary... dataSetSummaries) {
        if (this.dataSetSummaries == null) {
            setDataSetSummaries(new java.util.ArrayList<DataSetSummary>(dataSetSummaries.length));
        }
        for (DataSetSummary ele : dataSetSummaries) {
            this.dataSetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * </p>
     * 
     * @param dataSetSummaries
     *        A <code>DataSetSummaries</code> object that returns a summary of a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSetsResult withDataSetSummaries(java.util.Collection<DataSetSummary> dataSetSummaries) {
        setDataSetSummaries(dataSetSummaries);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSetsResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSetsResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getDataSetSummaries() != null)
            sb.append("DataSetSummaries: ").append(getDataSetSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchDataSetsResult == false)
            return false;
        SearchDataSetsResult other = (SearchDataSetsResult) obj;
        if (other.getDataSetSummaries() == null ^ this.getDataSetSummaries() == null)
            return false;
        if (other.getDataSetSummaries() != null && other.getDataSetSummaries().equals(this.getDataSetSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetSummaries() == null) ? 0 : getDataSetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public SearchDataSetsResult clone() {
        try {
            return (SearchDataSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
