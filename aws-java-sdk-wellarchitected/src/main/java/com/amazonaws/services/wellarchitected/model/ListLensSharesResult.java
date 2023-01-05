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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLensSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lens share summaries.
     * </p>
     */
    private java.util.List<LensShareSummary> lensShareSummaries;

    private String nextToken;

    /**
     * <p>
     * A list of lens share summaries.
     * </p>
     * 
     * @return A list of lens share summaries.
     */

    public java.util.List<LensShareSummary> getLensShareSummaries() {
        return lensShareSummaries;
    }

    /**
     * <p>
     * A list of lens share summaries.
     * </p>
     * 
     * @param lensShareSummaries
     *        A list of lens share summaries.
     */

    public void setLensShareSummaries(java.util.Collection<LensShareSummary> lensShareSummaries) {
        if (lensShareSummaries == null) {
            this.lensShareSummaries = null;
            return;
        }

        this.lensShareSummaries = new java.util.ArrayList<LensShareSummary>(lensShareSummaries);
    }

    /**
     * <p>
     * A list of lens share summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensShareSummaries(java.util.Collection)} or {@link #withLensShareSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lensShareSummaries
     *        A list of lens share summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesResult withLensShareSummaries(LensShareSummary... lensShareSummaries) {
        if (this.lensShareSummaries == null) {
            setLensShareSummaries(new java.util.ArrayList<LensShareSummary>(lensShareSummaries.length));
        }
        for (LensShareSummary ele : lensShareSummaries) {
            this.lensShareSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lens share summaries.
     * </p>
     * 
     * @param lensShareSummaries
     *        A list of lens share summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesResult withLensShareSummaries(java.util.Collection<LensShareSummary> lensShareSummaries) {
        setLensShareSummaries(lensShareSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesResult withNextToken(String nextToken) {
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
        if (getLensShareSummaries() != null)
            sb.append("LensShareSummaries: ").append(getLensShareSummaries()).append(",");
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

        if (obj instanceof ListLensSharesResult == false)
            return false;
        ListLensSharesResult other = (ListLensSharesResult) obj;
        if (other.getLensShareSummaries() == null ^ this.getLensShareSummaries() == null)
            return false;
        if (other.getLensShareSummaries() != null && other.getLensShareSummaries().equals(this.getLensShareSummaries()) == false)
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

        hashCode = prime * hashCode + ((getLensShareSummaries() == null) ? 0 : getLensShareSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLensSharesResult clone() {
        try {
            return (ListLensSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
