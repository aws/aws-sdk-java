/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the result of a list tests request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTests" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the tests.
     * </p>
     */
    private java.util.List<Test> tests;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the tests.
     * </p>
     * 
     * @return Information about the tests.
     */

    public java.util.List<Test> getTests() {
        return tests;
    }

    /**
     * <p>
     * Information about the tests.
     * </p>
     * 
     * @param tests
     *        Information about the tests.
     */

    public void setTests(java.util.Collection<Test> tests) {
        if (tests == null) {
            this.tests = null;
            return;
        }

        this.tests = new java.util.ArrayList<Test>(tests);
    }

    /**
     * <p>
     * Information about the tests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTests(java.util.Collection)} or {@link #withTests(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tests
     *        Information about the tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestsResult withTests(Test... tests) {
        if (this.tests == null) {
            setTests(new java.util.ArrayList<Test>(tests.length));
        }
        for (Test ele : tests) {
            this.tests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tests.
     * </p>
     * 
     * @param tests
     *        Information about the tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestsResult withTests(java.util.Collection<Test> tests) {
        setTests(tests);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large, this is an identifier that is also
     *         returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestsResult withNextToken(String nextToken) {
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
        if (getTests() != null)
            sb.append("Tests: ").append(getTests()).append(",");
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

        if (obj instanceof ListTestsResult == false)
            return false;
        ListTestsResult other = (ListTestsResult) obj;
        if (other.getTests() == null ^ this.getTests() == null)
            return false;
        if (other.getTests() != null && other.getTests().equals(this.getTests()) == false)
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

        hashCode = prime * hashCode + ((getTests() == null) ? 0 : getTests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestsResult clone() {
        try {
            return (ListTestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
