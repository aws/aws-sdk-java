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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns an array of <a>CaseDetails</a> objects and a <code>nextToken</code> that defines a point for pagination in
 * the result set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details for the cases that match the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CaseDetails> cases;
    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details for the cases that match the request.
     * </p>
     * 
     * @return The details for the cases that match the request.
     */

    public java.util.List<CaseDetails> getCases() {
        if (cases == null) {
            cases = new com.amazonaws.internal.SdkInternalList<CaseDetails>();
        }
        return cases;
    }

    /**
     * <p>
     * The details for the cases that match the request.
     * </p>
     * 
     * @param cases
     *        The details for the cases that match the request.
     */

    public void setCases(java.util.Collection<CaseDetails> cases) {
        if (cases == null) {
            this.cases = null;
            return;
        }

        this.cases = new com.amazonaws.internal.SdkInternalList<CaseDetails>(cases);
    }

    /**
     * <p>
     * The details for the cases that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCases(java.util.Collection)} or {@link #withCases(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cases
     *        The details for the cases that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesResult withCases(CaseDetails... cases) {
        if (this.cases == null) {
            setCases(new com.amazonaws.internal.SdkInternalList<CaseDetails>(cases.length));
        }
        for (CaseDetails ele : cases) {
            this.cases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details for the cases that match the request.
     * </p>
     * 
     * @param cases
     *        The details for the cases that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesResult withCases(java.util.Collection<CaseDetails> cases) {
        setCases(cases);
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @return A resumption point for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesResult withNextToken(String nextToken) {
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
        if (getCases() != null)
            sb.append("Cases: ").append(getCases()).append(",");
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

        if (obj instanceof DescribeCasesResult == false)
            return false;
        DescribeCasesResult other = (DescribeCasesResult) obj;
        if (other.getCases() == null ^ this.getCases() == null)
            return false;
        if (other.getCases() != null && other.getCases().equals(this.getCases()) == false)
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

        hashCode = prime * hashCode + ((getCases() == null) ? 0 : getCases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCasesResult clone() {
        try {
            return (DescribeCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
