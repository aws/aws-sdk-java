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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetInterpolatedAssetPropertyValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInterpolatedAssetPropertyValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The requested interpolated values.
     * </p>
     */
    private java.util.List<InterpolatedAssetPropertyValue> interpolatedAssetPropertyValues;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested interpolated values.
     * </p>
     * 
     * @return The requested interpolated values.
     */

    public java.util.List<InterpolatedAssetPropertyValue> getInterpolatedAssetPropertyValues() {
        return interpolatedAssetPropertyValues;
    }

    /**
     * <p>
     * The requested interpolated values.
     * </p>
     * 
     * @param interpolatedAssetPropertyValues
     *        The requested interpolated values.
     */

    public void setInterpolatedAssetPropertyValues(java.util.Collection<InterpolatedAssetPropertyValue> interpolatedAssetPropertyValues) {
        if (interpolatedAssetPropertyValues == null) {
            this.interpolatedAssetPropertyValues = null;
            return;
        }

        this.interpolatedAssetPropertyValues = new java.util.ArrayList<InterpolatedAssetPropertyValue>(interpolatedAssetPropertyValues);
    }

    /**
     * <p>
     * The requested interpolated values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInterpolatedAssetPropertyValues(java.util.Collection)} or
     * {@link #withInterpolatedAssetPropertyValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param interpolatedAssetPropertyValues
     *        The requested interpolated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesResult withInterpolatedAssetPropertyValues(InterpolatedAssetPropertyValue... interpolatedAssetPropertyValues) {
        if (this.interpolatedAssetPropertyValues == null) {
            setInterpolatedAssetPropertyValues(new java.util.ArrayList<InterpolatedAssetPropertyValue>(interpolatedAssetPropertyValues.length));
        }
        for (InterpolatedAssetPropertyValue ele : interpolatedAssetPropertyValues) {
            this.interpolatedAssetPropertyValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested interpolated values.
     * </p>
     * 
     * @param interpolatedAssetPropertyValues
     *        The requested interpolated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesResult withInterpolatedAssetPropertyValues(
            java.util.Collection<InterpolatedAssetPropertyValue> interpolatedAssetPropertyValues) {
        setInterpolatedAssetPropertyValues(interpolatedAssetPropertyValues);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesResult withNextToken(String nextToken) {
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
        if (getInterpolatedAssetPropertyValues() != null)
            sb.append("InterpolatedAssetPropertyValues: ").append(getInterpolatedAssetPropertyValues()).append(",");
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

        if (obj instanceof GetInterpolatedAssetPropertyValuesResult == false)
            return false;
        GetInterpolatedAssetPropertyValuesResult other = (GetInterpolatedAssetPropertyValuesResult) obj;
        if (other.getInterpolatedAssetPropertyValues() == null ^ this.getInterpolatedAssetPropertyValues() == null)
            return false;
        if (other.getInterpolatedAssetPropertyValues() != null
                && other.getInterpolatedAssetPropertyValues().equals(this.getInterpolatedAssetPropertyValues()) == false)
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

        hashCode = prime * hashCode + ((getInterpolatedAssetPropertyValues() == null) ? 0 : getInterpolatedAssetPropertyValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInterpolatedAssetPropertyValuesResult clone() {
        try {
            return (GetInterpolatedAssetPropertyValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
