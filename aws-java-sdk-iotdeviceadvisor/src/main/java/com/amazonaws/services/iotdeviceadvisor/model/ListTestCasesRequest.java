/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestCasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all the qualification test cases in the test suite.
     * </p>
     */
    private Boolean intendedForQualification;
    /**
     * <p>
     * Requests the test cases max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Requests the test cases next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists all the qualification test cases in the test suite.
     * </p>
     * 
     * @param intendedForQualification
     *        Lists all the qualification test cases in the test suite.
     */

    public void setIntendedForQualification(Boolean intendedForQualification) {
        this.intendedForQualification = intendedForQualification;
    }

    /**
     * <p>
     * Lists all the qualification test cases in the test suite.
     * </p>
     * 
     * @return Lists all the qualification test cases in the test suite.
     */

    public Boolean getIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Lists all the qualification test cases in the test suite.
     * </p>
     * 
     * @param intendedForQualification
     *        Lists all the qualification test cases in the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withIntendedForQualification(Boolean intendedForQualification) {
        setIntendedForQualification(intendedForQualification);
        return this;
    }

    /**
     * <p>
     * Lists all the qualification test cases in the test suite.
     * </p>
     * 
     * @return Lists all the qualification test cases in the test suite.
     */

    public Boolean isIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Requests the test cases max results.
     * </p>
     * 
     * @param maxResults
     *        Requests the test cases max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Requests the test cases max results.
     * </p>
     * 
     * @return Requests the test cases max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Requests the test cases max results.
     * </p>
     * 
     * @param maxResults
     *        Requests the test cases max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Requests the test cases next token.
     * </p>
     * 
     * @param nextToken
     *        Requests the test cases next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Requests the test cases next token.
     * </p>
     * 
     * @return Requests the test cases next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Requests the test cases next token.
     * </p>
     * 
     * @param nextToken
     *        Requests the test cases next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withNextToken(String nextToken) {
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
        if (getIntendedForQualification() != null)
            sb.append("IntendedForQualification: ").append(getIntendedForQualification()).append(",");
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

        if (obj instanceof ListTestCasesRequest == false)
            return false;
        ListTestCasesRequest other = (ListTestCasesRequest) obj;
        if (other.getIntendedForQualification() == null ^ this.getIntendedForQualification() == null)
            return false;
        if (other.getIntendedForQualification() != null && other.getIntendedForQualification().equals(this.getIntendedForQualification()) == false)
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

        hashCode = prime * hashCode + ((getIntendedForQualification() == null) ? 0 : getIntendedForQualification().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestCasesRequest clone() {
        return (ListTestCasesRequest) super.clone();
    }

}
