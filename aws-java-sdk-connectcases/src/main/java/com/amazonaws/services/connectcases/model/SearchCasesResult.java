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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of case documents where each case contains the properties <code>CaseId</code> and <code>Fields</code>
     * where each field is a complex union structure.
     * </p>
     */
    private java.util.List<SearchCasesResponseItem> cases;
    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of case documents where each case contains the properties <code>CaseId</code> and <code>Fields</code>
     * where each field is a complex union structure.
     * </p>
     * 
     * @return A list of case documents where each case contains the properties <code>CaseId</code> and
     *         <code>Fields</code> where each field is a complex union structure.
     */

    public java.util.List<SearchCasesResponseItem> getCases() {
        return cases;
    }

    /**
     * <p>
     * A list of case documents where each case contains the properties <code>CaseId</code> and <code>Fields</code>
     * where each field is a complex union structure.
     * </p>
     * 
     * @param cases
     *        A list of case documents where each case contains the properties <code>CaseId</code> and
     *        <code>Fields</code> where each field is a complex union structure.
     */

    public void setCases(java.util.Collection<SearchCasesResponseItem> cases) {
        if (cases == null) {
            this.cases = null;
            return;
        }

        this.cases = new java.util.ArrayList<SearchCasesResponseItem>(cases);
    }

    /**
     * <p>
     * A list of case documents where each case contains the properties <code>CaseId</code> and <code>Fields</code>
     * where each field is a complex union structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCases(java.util.Collection)} or {@link #withCases(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cases
     *        A list of case documents where each case contains the properties <code>CaseId</code> and
     *        <code>Fields</code> where each field is a complex union structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesResult withCases(SearchCasesResponseItem... cases) {
        if (this.cases == null) {
            setCases(new java.util.ArrayList<SearchCasesResponseItem>(cases.length));
        }
        for (SearchCasesResponseItem ele : cases) {
            this.cases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of case documents where each case contains the properties <code>CaseId</code> and <code>Fields</code>
     * where each field is a complex union structure.
     * </p>
     * 
     * @param cases
     *        A list of case documents where each case contains the properties <code>CaseId</code> and
     *        <code>Fields</code> where each field is a complex union structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesResult withCases(java.util.Collection<SearchCasesResponseItem> cases) {
        setCases(cases);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesResult withNextToken(String nextToken) {
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

        if (obj instanceof SearchCasesResult == false)
            return false;
        SearchCasesResult other = (SearchCasesResult) obj;
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
    public SearchCasesResult clone() {
        try {
            return (SearchCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
