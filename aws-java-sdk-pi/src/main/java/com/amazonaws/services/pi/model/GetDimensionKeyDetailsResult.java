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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetDimensionKeyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDimensionKeyDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details for the requested dimensions.
     * </p>
     */
    private java.util.List<DimensionKeyDetail> dimensions;

    /**
     * <p>
     * The details for the requested dimensions.
     * </p>
     * 
     * @return The details for the requested dimensions.
     */

    public java.util.List<DimensionKeyDetail> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The details for the requested dimensions.
     * </p>
     * 
     * @param dimensions
     *        The details for the requested dimensions.
     */

    public void setDimensions(java.util.Collection<DimensionKeyDetail> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<DimensionKeyDetail>(dimensions);
    }

    /**
     * <p>
     * The details for the requested dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The details for the requested dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsResult withDimensions(DimensionKeyDetail... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<DimensionKeyDetail>(dimensions.length));
        }
        for (DimensionKeyDetail ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details for the requested dimensions.
     * </p>
     * 
     * @param dimensions
     *        The details for the requested dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsResult withDimensions(java.util.Collection<DimensionKeyDetail> dimensions) {
        setDimensions(dimensions);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDimensionKeyDetailsResult == false)
            return false;
        GetDimensionKeyDetailsResult other = (GetDimensionKeyDetailsResult) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public GetDimensionKeyDetailsResult clone() {
        try {
            return (GetDimensionKeyDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
