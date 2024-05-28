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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains information about a data source.
     * </p>
     */
    private java.util.List<DataSourceSummary> dataSourceSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects, each of which contains information about a data source.
     * </p>
     * 
     * @return A list of objects, each of which contains information about a data source.
     */

    public java.util.List<DataSourceSummary> getDataSourceSummaries() {
        return dataSourceSummaries;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a data source.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A list of objects, each of which contains information about a data source.
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
     * A list of objects, each of which contains information about a data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceSummaries(java.util.Collection)} or {@link #withDataSourceSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A list of objects, each of which contains information about a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSourceSummaries(DataSourceSummary... dataSourceSummaries) {
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
     * A list of objects, each of which contains information about a data source.
     * </p>
     * 
     * @param dataSourceSummaries
     *        A list of objects, each of which contains information about a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSourceSummaries(java.util.Collection<DataSourceSummary> dataSourceSummaries) {
        setDataSourceSummaries(dataSourceSummaries);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         use this token when making another request in the <code>nextToken</code> field to return the next batch
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
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
        if (getDataSourceSummaries() != null)
            sb.append("DataSourceSummaries: ").append(getDataSourceSummaries()).append(",");
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
        if (other.getDataSourceSummaries() == null ^ this.getDataSourceSummaries() == null)
            return false;
        if (other.getDataSourceSummaries() != null && other.getDataSourceSummaries().equals(this.getDataSourceSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDataSourceSummaries() == null) ? 0 : getDataSourceSummaries().hashCode());
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
