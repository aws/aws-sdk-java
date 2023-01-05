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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDataSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * </p>
     */
    private java.util.List<DataSourceSummary> dataSourceSummaries;
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
     * A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * </p>
     * 
     * @return A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     */

    public java.util.List<DataSourceSummary> getDataSourceSummaries() {
        return dataSourceSummaries;
    }

    /**
     * <p>
     * A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     */

    public void setDataSourceSummaries(java.util.Collection<DataSourceSummary> dataSourceSummaries) {
        if (dataSourceSummaries == null) {
            this.dataSourceSummaries = null;
            return;
        }

        this.dataSourceSummaries = new java.util.ArrayList<DataSourceSummary>(dataSourceSummaries);
    }

    /**
     * <p>
     * A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceSummaries(java.util.Collection)} or {@link #withDataSourceSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesResult withDataSourceSummaries(DataSourceSummary... dataSourceSummaries) {
        if (this.dataSourceSummaries == null) {
            setDataSourceSummaries(new java.util.ArrayList<DataSourceSummary>(dataSourceSummaries.length));
        }
        for (DataSourceSummary ele : dataSourceSummaries) {
            this.dataSourceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A <code>DataSourceSummaries</code> object that returns a summary of a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesResult withDataSourceSummaries(java.util.Collection<DataSourceSummary> dataSourceSummaries) {
        setDataSourceSummaries(dataSourceSummaries);
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

    public SearchDataSourcesResult withNextToken(String nextToken) {
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

    public SearchDataSourcesResult withStatus(Integer status) {
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

    public SearchDataSourcesResult withRequestId(String requestId) {
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
        if (getDataSourceSummaries() != null)
            sb.append("DataSourceSummaries: ").append(getDataSourceSummaries()).append(",");
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

        if (obj instanceof SearchDataSourcesResult == false)
            return false;
        SearchDataSourcesResult other = (SearchDataSourcesResult) obj;
        if (other.getDataSourceSummaries() == null ^ this.getDataSourceSummaries() == null)
            return false;
        if (other.getDataSourceSummaries() != null && other.getDataSourceSummaries().equals(this.getDataSourceSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDataSourceSummaries() == null) ? 0 : getDataSourceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public SearchDataSourcesResult clone() {
        try {
            return (SearchDataSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
