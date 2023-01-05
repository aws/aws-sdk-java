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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyAggregatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries per
     * request.
     * </p>
     */
    private java.util.List<BatchGetAssetPropertyAggregatesEntry> entries;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request. A result set is returned in the two cases,
     * whichever occurs first.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result set is less than 1 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum value
     * of <code>maxResults</code> is 4000.
     * </p>
     * </li>
     * </ul>
     */
    private Integer maxResults;

    /**
     * <p>
     * The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries per
     * request.
     * </p>
     * 
     * @return The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries
     *         per request.
     */

    public java.util.List<BatchGetAssetPropertyAggregatesEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries per
     * request.
     * </p>
     * 
     * @param entries
     *        The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries
     *        per request.
     */

    public void setEntries(java.util.Collection<BatchGetAssetPropertyAggregatesEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchGetAssetPropertyAggregatesEntry>(entries);
    }

    /**
     * <p>
     * The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries per
     * request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries
     *        per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesRequest withEntries(BatchGetAssetPropertyAggregatesEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<BatchGetAssetPropertyAggregatesEntry>(entries.length));
        }
        for (BatchGetAssetPropertyAggregatesEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries per
     * request.
     * </p>
     * 
     * @param entries
     *        The list of asset property aggregate entries for the batch get request. You can specify up to 16 entries
     *        per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesRequest withEntries(java.util.Collection<BatchGetAssetPropertyAggregatesEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. A result set is returned in the two cases,
     * whichever occurs first.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result set is less than 1 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum value
     * of <code>maxResults</code> is 4000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. A result set is returned in the two
     *        cases, whichever occurs first.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The size of the result set is less than 1 MB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum
     *        value of <code>maxResults</code> is 4000.
     *        </p>
     *        </li>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. A result set is returned in the two cases,
     * whichever occurs first.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result set is less than 1 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum value
     * of <code>maxResults</code> is 4000.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The maximum number of results to return for each paginated request. A result set is returned in the two
     *         cases, whichever occurs first.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The size of the result set is less than 1 MB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The number of data points in the result set is less than the value of <code>maxResults</code>. The
     *         maximum value of <code>maxResults</code> is 4000.
     *         </p>
     *         </li>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. A result set is returned in the two cases,
     * whichever occurs first.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result set is less than 1 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum value
     * of <code>maxResults</code> is 4000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. A result set is returned in the two
     *        cases, whichever occurs first.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The size of the result set is less than 1 MB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The number of data points in the result set is less than the value of <code>maxResults</code>. The maximum
     *        value of <code>maxResults</code> is 4000.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesRequest withMaxResults(Integer maxResults) {
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
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

        if (obj instanceof BatchGetAssetPropertyAggregatesRequest == false)
            return false;
        BatchGetAssetPropertyAggregatesRequest other = (BatchGetAssetPropertyAggregatesRequest) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
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

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyAggregatesRequest clone() {
        return (BatchGetAssetPropertyAggregatesRequest) super.clone();
    }

}
