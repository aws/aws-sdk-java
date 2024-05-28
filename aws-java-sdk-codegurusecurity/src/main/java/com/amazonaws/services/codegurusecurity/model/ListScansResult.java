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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListScans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results after
     * the current page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * </p>
     */
    private java.util.List<ScanSummary> summaries;

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results after
     * the current page.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results
     *        after the current page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results after
     * the current page.
     * </p>
     * 
     * @return A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing
     *         results after the current page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results after
     * the current page.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. You can use this in future calls to <code>ListScans</code> to continue listing results
     *        after the current page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScansResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * </p>
     * 
     * @return A list of <code>ScanSummary</code> objects with information about all scans in an account.
     */

    public java.util.List<ScanSummary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ScanSummary</code> objects with information about all scans in an account.
     */

    public void setSummaries(java.util.Collection<ScanSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<ScanSummary>(summaries);
    }

    /**
     * <p>
     * A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScansResult withSummaries(ScanSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new java.util.ArrayList<ScanSummary>(summaries.length));
        }
        for (ScanSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ScanSummary</code> objects with information about all scans in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScansResult withSummaries(java.util.Collection<ScanSummary> summaries) {
        setSummaries(summaries);
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScansResult == false)
            return false;
        ListScansResult other = (ListScansResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListScansResult clone() {
        try {
            return (ListScansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
