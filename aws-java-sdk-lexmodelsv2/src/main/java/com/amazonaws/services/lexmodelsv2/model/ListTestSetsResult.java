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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The selected test sets in a list of test sets.
     * </p>
     */
    private java.util.List<TestSetSummary> testSets;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestSets operation. If
     * the nextToken field is present, you send the contents as the nextToken parameter of a ListTestSets operation
     * request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The selected test sets in a list of test sets.
     * </p>
     * 
     * @return The selected test sets in a list of test sets.
     */

    public java.util.List<TestSetSummary> getTestSets() {
        return testSets;
    }

    /**
     * <p>
     * The selected test sets in a list of test sets.
     * </p>
     * 
     * @param testSets
     *        The selected test sets in a list of test sets.
     */

    public void setTestSets(java.util.Collection<TestSetSummary> testSets) {
        if (testSets == null) {
            this.testSets = null;
            return;
        }

        this.testSets = new java.util.ArrayList<TestSetSummary>(testSets);
    }

    /**
     * <p>
     * The selected test sets in a list of test sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestSets(java.util.Collection)} or {@link #withTestSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param testSets
     *        The selected test sets in a list of test sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetsResult withTestSets(TestSetSummary... testSets) {
        if (this.testSets == null) {
            setTestSets(new java.util.ArrayList<TestSetSummary>(testSets.length));
        }
        for (TestSetSummary ele : testSets) {
            this.testSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selected test sets in a list of test sets.
     * </p>
     * 
     * @param testSets
     *        The selected test sets in a list of test sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetsResult withTestSets(java.util.Collection<TestSetSummary> testSets) {
        setTestSets(testSets);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestSets operation. If
     * the nextToken field is present, you send the contents as the nextToken parameter of a ListTestSets operation
     * request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the ListTestSets
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestSets operation request to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestSets operation. If
     * the nextToken field is present, you send the contents as the nextToken parameter of a ListTestSets operation
     * request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the ListTestSets
     *         operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *         ListTestSets operation request to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListTestSets operation. If
     * the nextToken field is present, you send the contents as the nextToken parameter of a ListTestSets operation
     * request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the ListTestSets
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestSets operation request to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetsResult withNextToken(String nextToken) {
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
        if (getTestSets() != null)
            sb.append("TestSets: ").append(getTestSets()).append(",");
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

        if (obj instanceof ListTestSetsResult == false)
            return false;
        ListTestSetsResult other = (ListTestSetsResult) obj;
        if (other.getTestSets() == null ^ this.getTestSets() == null)
            return false;
        if (other.getTestSets() != null && other.getTestSets().equals(this.getTestSets()) == false)
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

        hashCode = prime * hashCode + ((getTestSets() == null) ? 0 : getTestSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestSetsResult clone() {
        try {
            return (ListTestSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
