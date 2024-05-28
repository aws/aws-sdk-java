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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of test executions.
     * </p>
     */
    private java.util.List<TestExecutionSummary> testExecutions;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestExecutions
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestExecutions operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of test executions.
     * </p>
     * 
     * @return The list of test executions.
     */

    public java.util.List<TestExecutionSummary> getTestExecutions() {
        return testExecutions;
    }

    /**
     * <p>
     * The list of test executions.
     * </p>
     * 
     * @param testExecutions
     *        The list of test executions.
     */

    public void setTestExecutions(java.util.Collection<TestExecutionSummary> testExecutions) {
        if (testExecutions == null) {
            this.testExecutions = null;
            return;
        }

        this.testExecutions = new java.util.ArrayList<TestExecutionSummary>(testExecutions);
    }

    /**
     * <p>
     * The list of test executions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestExecutions(java.util.Collection)} or {@link #withTestExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param testExecutions
     *        The list of test executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionsResult withTestExecutions(TestExecutionSummary... testExecutions) {
        if (this.testExecutions == null) {
            setTestExecutions(new java.util.ArrayList<TestExecutionSummary>(testExecutions.length));
        }
        for (TestExecutionSummary ele : testExecutions) {
            this.testExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of test executions.
     * </p>
     * 
     * @param testExecutions
     *        The list of test executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionsResult withTestExecutions(java.util.Collection<TestExecutionSummary> testExecutions) {
        setTestExecutions(testExecutions);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestExecutions
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestExecutions operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the ListTestExecutions
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestExecutions operation request to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestExecutions
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestExecutions operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the ListTestExecutions
     *         operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *         ListTestExecutions operation request to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestExecutions
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestExecutions operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the ListTestExecutions
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestExecutions operation request to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestExecutionsResult withNextToken(String nextToken) {
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
        if (getTestExecutions() != null)
            sb.append("TestExecutions: ").append(getTestExecutions()).append(",");
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

        if (obj instanceof ListTestExecutionsResult == false)
            return false;
        ListTestExecutionsResult other = (ListTestExecutionsResult) obj;
        if (other.getTestExecutions() == null ^ this.getTestExecutions() == null)
            return false;
        if (other.getTestExecutions() != null && other.getTestExecutions().equals(this.getTestExecutions()) == false)
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

        hashCode = prime * hashCode + ((getTestExecutions() == null) ? 0 : getTestExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestExecutionsResult clone() {
        try {
            return (ListTestExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
