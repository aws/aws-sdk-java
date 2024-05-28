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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The CIS scans.
     * </p>
     */
    private java.util.List<CisScan> scans;

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @return The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The CIS scans.
     * </p>
     * 
     * @return The CIS scans.
     */

    public java.util.List<CisScan> getScans() {
        return scans;
    }

    /**
     * <p>
     * The CIS scans.
     * </p>
     * 
     * @param scans
     *        The CIS scans.
     */

    public void setScans(java.util.Collection<CisScan> scans) {
        if (scans == null) {
            this.scans = null;
            return;
        }

        this.scans = new java.util.ArrayList<CisScan>(scans);
    }

    /**
     * <p>
     * The CIS scans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScans(java.util.Collection)} or {@link #withScans(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scans
     *        The CIS scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansResult withScans(CisScan... scans) {
        if (this.scans == null) {
            setScans(new java.util.ArrayList<CisScan>(scans.length));
        }
        for (CisScan ele : scans) {
            this.scans.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CIS scans.
     * </p>
     * 
     * @param scans
     *        The CIS scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansResult withScans(java.util.Collection<CisScan> scans) {
        setScans(scans);
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
        if (getScans() != null)
            sb.append("Scans: ").append(getScans());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCisScansResult == false)
            return false;
        ListCisScansResult other = (ListCisScansResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScans() == null ^ this.getScans() == null)
            return false;
        if (other.getScans() != null && other.getScans().equals(this.getScans()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScans() == null) ? 0 : getScans().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScansResult clone() {
        try {
            return (ListCisScansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
