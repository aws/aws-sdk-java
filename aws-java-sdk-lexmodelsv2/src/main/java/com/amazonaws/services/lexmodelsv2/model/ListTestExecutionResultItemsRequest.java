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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutionResultItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestExecutionResultItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the test execution to list the result items.
     * </p>
     */
    private String testExecutionId;
    /**
     * <p>
     * The filter for the list of results from the test set execution.
     * </p>
     */
    private TestExecutionResultFilterBy resultFilterBy;
    /**
     * <p>
     * The maximum number of test execution result items to return in each page. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than specified
     * in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the test execution to list the result items.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the test execution to list the result items.
     */

    public void setTestExecutionId(String testExecutionId) {
        this.testExecutionId = testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the test execution to list the result items.
     * </p>
     * 
     * @return The unique identifier of the test execution to list the result items.
     */

    public String getTestExecutionId() {
        return this.testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the test execution to list the result items.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the test execution to list the result items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsRequest withTestExecutionId(String testExecutionId) {
        setTestExecutionId(testExecutionId);
        return this;
    }

    /**
     * <p>
     * The filter for the list of results from the test set execution.
     * </p>
     * 
     * @param resultFilterBy
     *        The filter for the list of results from the test set execution.
     */

    public void setResultFilterBy(TestExecutionResultFilterBy resultFilterBy) {
        this.resultFilterBy = resultFilterBy;
    }

    /**
     * <p>
     * The filter for the list of results from the test set execution.
     * </p>
     * 
     * @return The filter for the list of results from the test set execution.
     */

    public TestExecutionResultFilterBy getResultFilterBy() {
        return this.resultFilterBy;
    }

    /**
     * <p>
     * The filter for the list of results from the test set execution.
     * </p>
     * 
     * @param resultFilterBy
     *        The filter for the list of results from the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsRequest withResultFilterBy(TestExecutionResultFilterBy resultFilterBy) {
        setResultFilterBy(resultFilterBy);
        return this;
    }

    /**
     * <p>
     * The maximum number of test execution result items to return in each page. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test execution result items to return in each page. If there are fewer results than
     *        the max page size, only the actual number of results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of test execution result items to return in each page. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @return The maximum number of test execution result items to return in each page. If there are fewer results than
     *         the max page size, only the actual number of results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of test execution result items to return in each page. If there are fewer results than the max
     * page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test execution result items to return in each page. If there are fewer results than
     *        the max page size, only the actual number of results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than specified
     * in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than
     *        specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in
     *        the <code>nextToken</code> parameter to return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than specified
     * in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @return If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than
     *         specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token
     *         in the <code>nextToken</code> parameter to return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than specified
     * in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListTestExecutionResultItems</code> operation contains more results than
     *        specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in
     *        the <code>nextToken</code> parameter to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsRequest withNextToken(String nextToken) {
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
        if (getTestExecutionId() != null)
            sb.append("TestExecutionId: ").append(getTestExecutionId()).append(",");
        if (getResultFilterBy() != null)
            sb.append("ResultFilterBy: ").append(getResultFilterBy()).append(",");
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

        if (obj instanceof ListTestExecutionResultItemsRequest == false)
            return false;
        ListTestExecutionResultItemsRequest other = (ListTestExecutionResultItemsRequest) obj;
        if (other.getTestExecutionId() == null ^ this.getTestExecutionId() == null)
            return false;
        if (other.getTestExecutionId() != null && other.getTestExecutionId().equals(this.getTestExecutionId()) == false)
            return false;
        if (other.getResultFilterBy() == null ^ this.getResultFilterBy() == null)
            return false;
        if (other.getResultFilterBy() != null && other.getResultFilterBy().equals(this.getResultFilterBy()) == false)
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

        hashCode = prime * hashCode + ((getTestExecutionId() == null) ? 0 : getTestExecutionId().hashCode());
        hashCode = prime * hashCode + ((getResultFilterBy() == null) ? 0 : getResultFilterBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestExecutionResultItemsRequest clone() {
        return (ListTestExecutionResultItemsRequest) super.clone();
    }

}
