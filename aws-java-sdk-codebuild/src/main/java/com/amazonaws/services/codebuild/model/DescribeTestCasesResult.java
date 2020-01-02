/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned list of test cases.
     * </p>
     */
    private java.util.List<TestCase> testCases;

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, the maximum number of items that can be returned is the value specified in
     *         <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *         is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *         to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *         token that is returned, until no more next tokens are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned list of test cases.
     * </p>
     * 
     * @return The returned list of test cases.
     */

    public java.util.List<TestCase> getTestCases() {
        return testCases;
    }

    /**
     * <p>
     * The returned list of test cases.
     * </p>
     * 
     * @param testCases
     *        The returned list of test cases.
     */

    public void setTestCases(java.util.Collection<TestCase> testCases) {
        if (testCases == null) {
            this.testCases = null;
            return;
        }

        this.testCases = new java.util.ArrayList<TestCase>(testCases);
    }

    /**
     * <p>
     * The returned list of test cases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestCases(java.util.Collection)} or {@link #withTestCases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testCases
     *        The returned list of test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesResult withTestCases(TestCase... testCases) {
        if (this.testCases == null) {
            setTestCases(new java.util.ArrayList<TestCase>(testCases.length));
        }
        for (TestCase ele : testCases) {
            this.testCases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of test cases.
     * </p>
     * 
     * @param testCases
     *        The returned list of test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesResult withTestCases(java.util.Collection<TestCase> testCases) {
        setTestCases(testCases);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTestCases() != null)
            sb.append("TestCases: ").append(getTestCases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestCasesResult == false)
            return false;
        DescribeTestCasesResult other = (DescribeTestCasesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTestCases() == null ^ this.getTestCases() == null)
            return false;
        if (other.getTestCases() != null && other.getTestCases().equals(this.getTestCases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTestCases() == null) ? 0 : getTestCases().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestCasesResult clone() {
        try {
            return (DescribeTestCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
