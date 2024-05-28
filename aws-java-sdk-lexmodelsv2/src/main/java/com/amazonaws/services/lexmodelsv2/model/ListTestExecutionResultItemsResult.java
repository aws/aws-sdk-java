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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutionResultItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestExecutionResultItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of results from the test execution.
     * </p>
     */
    private TestExecutionResultItems testExecutionResults;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code> operation request
     * to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of results from the test execution.
     * </p>
     * 
     * @param testExecutionResults
     *        The list of results from the test execution.
     */

    public void setTestExecutionResults(TestExecutionResultItems testExecutionResults) {
        this.testExecutionResults = testExecutionResults;
    }

    /**
     * <p>
     * The list of results from the test execution.
     * </p>
     * 
     * @return The list of results from the test execution.
     */

    public TestExecutionResultItems getTestExecutionResults() {
        return this.testExecutionResults;
    }

    /**
     * <p>
     * The list of results from the test execution.
     * </p>
     * 
     * @param testExecutionResults
     *        The list of results from the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsResult withTestExecutionResults(TestExecutionResultItems testExecutionResults) {
        setTestExecutionResults(testExecutionResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code> operation request
     * to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you
     *        send the contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code>
     *        operation request to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code> operation request
     * to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you
     *         send the contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code>
     *         operation request to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code> operation request
     * to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListTestExecutionResultItems</code> operation. If the <code>nextToken</code> field is present, you
     *        send the contents as the <code>nextToken</code> parameter of a <code>ListTestExecutionResultItems</code>
     *        operation request to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionResultItemsResult withNextToken(String nextToken) {
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
        if (getTestExecutionResults() != null)
            sb.append("TestExecutionResults: ").append(getTestExecutionResults()).append(",");
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

        if (obj instanceof ListTestExecutionResultItemsResult == false)
            return false;
        ListTestExecutionResultItemsResult other = (ListTestExecutionResultItemsResult) obj;
        if (other.getTestExecutionResults() == null ^ this.getTestExecutionResults() == null)
            return false;
        if (other.getTestExecutionResults() != null && other.getTestExecutionResults().equals(this.getTestExecutionResults()) == false)
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

        hashCode = prime * hashCode + ((getTestExecutionResults() == null) ? 0 : getTestExecutionResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestExecutionResultItemsResult clone() {
        try {
            return (ListTestExecutionResultItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
