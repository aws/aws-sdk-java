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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSetRecords" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestSetRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the test set to list its test set records.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The maximum number of test set records to return in each page. If there are fewer records than the max page size,
     * only the actual number of records are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the ListTestSetRecords operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the test set to list its test set records.
     * </p>
     * 
     * @param testSetId
     *        The identifier of the test set to list its test set records.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The identifier of the test set to list its test set records.
     * </p>
     * 
     * @return The identifier of the test set to list its test set records.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The identifier of the test set to list its test set records.
     * </p>
     * 
     * @param testSetId
     *        The identifier of the test set to list its test set records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsRequest withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The maximum number of test set records to return in each page. If there are fewer records than the max page size,
     * only the actual number of records are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test set records to return in each page. If there are fewer records than the max
     *        page size, only the actual number of records are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of test set records to return in each page. If there are fewer records than the max page size,
     * only the actual number of records are returned.
     * </p>
     * 
     * @return The maximum number of test set records to return in each page. If there are fewer records than the max
     *         page size, only the actual number of records are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of test set records to return in each page. If there are fewer records than the max page size,
     * only the actual number of records are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test set records to return in each page. If there are fewer records than the max
     *        page size, only the actual number of records are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the ListTestSetRecords operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListTestSetRecords operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *        return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListTestSetRecords operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @return If the response from the ListTestSetRecords operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *         return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListTestSetRecords operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListTestSetRecords operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *        return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsRequest withNextToken(String nextToken) {
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
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListTestSetRecordsRequest == false)
            return false;
        ListTestSetRecordsRequest other = (ListTestSetRecordsRequest) obj;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestSetRecordsRequest clone() {
        return (ListTestSetRecordsRequest) super.clone();
    }

}
