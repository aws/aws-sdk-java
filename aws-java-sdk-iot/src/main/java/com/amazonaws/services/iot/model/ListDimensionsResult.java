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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDimensionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     */
    private java.util.List<String> dimensionNames;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * 
     * @return A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a
     *         dimension.
     */

    public java.util.List<String> getDimensionNames() {
        return dimensionNames;
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * 
     * @param dimensionNames
     *        A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a
     *        dimension.
     */

    public void setDimensionNames(java.util.Collection<String> dimensionNames) {
        if (dimensionNames == null) {
            this.dimensionNames = null;
            return;
        }

        this.dimensionNames = new java.util.ArrayList<String>(dimensionNames);
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionNames(java.util.Collection)} or {@link #withDimensionNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dimensionNames
     *        A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDimensionsResult withDimensionNames(String... dimensionNames) {
        if (this.dimensionNames == null) {
            setDimensionNames(new java.util.ArrayList<String>(dimensionNames.length));
        }
        for (String ele : dimensionNames) {
            this.dimensionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * 
     * @param dimensionNames
     *        A list of the names of the defined dimensions. Use <code>DescribeDimension</code> to get details for a
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDimensionsResult withDimensionNames(java.util.Collection<String> dimensionNames) {
        setDimensionNames(dimensionNames);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *         additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDimensionsResult withNextToken(String nextToken) {
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
        if (getDimensionNames() != null)
            sb.append("DimensionNames: ").append(getDimensionNames()).append(",");
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

        if (obj instanceof ListDimensionsResult == false)
            return false;
        ListDimensionsResult other = (ListDimensionsResult) obj;
        if (other.getDimensionNames() == null ^ this.getDimensionNames() == null)
            return false;
        if (other.getDimensionNames() != null && other.getDimensionNames().equals(this.getDimensionNames()) == false)
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

        hashCode = prime * hashCode + ((getDimensionNames() == null) ? 0 : getDimensionNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDimensionsResult clone() {
        try {
            return (ListDimensionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
