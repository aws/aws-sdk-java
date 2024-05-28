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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDocumentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application id the documents are attached to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index the documents are attached to.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data sources the documents are attached to.
     * </p>
     */
    private java.util.List<String> dataSourceIds;
    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of documents to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the application id the documents are attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application id the documents are attached to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application id the documents are attached to.
     * </p>
     * 
     * @return The identifier of the application id the documents are attached to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application id the documents are attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application id the documents are attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index the documents are attached to.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index the documents are attached to.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index the documents are attached to.
     * </p>
     * 
     * @return The identifier of the index the documents are attached to.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index the documents are attached to.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index the documents are attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data sources the documents are attached to.
     * </p>
     * 
     * @return The identifier of the data sources the documents are attached to.
     */

    public java.util.List<String> getDataSourceIds() {
        return dataSourceIds;
    }

    /**
     * <p>
     * The identifier of the data sources the documents are attached to.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources the documents are attached to.
     */

    public void setDataSourceIds(java.util.Collection<String> dataSourceIds) {
        if (dataSourceIds == null) {
            this.dataSourceIds = null;
            return;
        }

        this.dataSourceIds = new java.util.ArrayList<String>(dataSourceIds);
    }

    /**
     * <p>
     * The identifier of the data sources the documents are attached to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceIds(java.util.Collection)} or {@link #withDataSourceIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources the documents are attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withDataSourceIds(String... dataSourceIds) {
        if (this.dataSourceIds == null) {
            setDataSourceIds(new java.util.ArrayList<String>(dataSourceIds.length));
        }
        for (String ele : dataSourceIds) {
            this.dataSourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the data sources the documents are attached to.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources the documents are attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withDataSourceIds(java.util.Collection<String> dataSourceIds) {
        setDataSourceIds(dataSourceIds);
        return this;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of documents.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @return If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *         Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *         next set of documents.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of documents to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of documents to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of documents to return.
     * </p>
     * 
     * @return The maximum number of documents to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of documents to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of documents to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDataSourceIds() != null)
            sb.append("DataSourceIds: ").append(getDataSourceIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDocumentsRequest == false)
            return false;
        ListDocumentsRequest other = (ListDocumentsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceIds() == null ^ this.getDataSourceIds() == null)
            return false;
        if (other.getDataSourceIds() != null && other.getDataSourceIds().equals(this.getDataSourceIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceIds() == null) ? 0 : getDataSourceIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDocumentsRequest clone() {
        return (ListDocumentsRequest) super.clone();
    }

}
