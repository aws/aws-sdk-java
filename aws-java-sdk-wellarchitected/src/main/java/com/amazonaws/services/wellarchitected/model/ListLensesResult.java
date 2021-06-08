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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Output of a list lenses call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLenses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLensesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<LensSummary> lensSummaries;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<LensSummary> getLensSummaries() {
        return lensSummaries;
    }

    /**
     * @param lensSummaries
     */

    public void setLensSummaries(java.util.Collection<LensSummary> lensSummaries) {
        if (lensSummaries == null) {
            this.lensSummaries = null;
            return;
        }

        this.lensSummaries = new java.util.ArrayList<LensSummary>(lensSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensSummaries(java.util.Collection)} or {@link #withLensSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lensSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensesResult withLensSummaries(LensSummary... lensSummaries) {
        if (this.lensSummaries == null) {
            setLensSummaries(new java.util.ArrayList<LensSummary>(lensSummaries.length));
        }
        for (LensSummary ele : lensSummaries) {
            this.lensSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param lensSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensesResult withLensSummaries(java.util.Collection<LensSummary> lensSummaries) {
        setLensSummaries(lensSummaries);
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

    public ListLensesResult withNextToken(String nextToken) {
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
        if (getLensSummaries() != null)
            sb.append("LensSummaries: ").append(getLensSummaries()).append(",");
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

        if (obj instanceof ListLensesResult == false)
            return false;
        ListLensesResult other = (ListLensesResult) obj;
        if (other.getLensSummaries() == null ^ this.getLensSummaries() == null)
            return false;
        if (other.getLensSummaries() != null && other.getLensSummaries().equals(this.getLensSummaries()) == false)
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

        hashCode = prime * hashCode + ((getLensSummaries() == null) ? 0 : getLensSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLensesResult clone() {
        try {
            return (ListLensesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
