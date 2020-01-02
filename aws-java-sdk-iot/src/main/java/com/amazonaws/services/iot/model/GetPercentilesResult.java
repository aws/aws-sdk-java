/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetPercentilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     */
    private java.util.List<PercentPair> percentiles;

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * 
     * @return The percentile values of the aggregated fields.
     */

    public java.util.List<PercentPair> getPercentiles() {
        return percentiles;
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * 
     * @param percentiles
     *        The percentile values of the aggregated fields.
     */

    public void setPercentiles(java.util.Collection<PercentPair> percentiles) {
        if (percentiles == null) {
            this.percentiles = null;
            return;
        }

        this.percentiles = new java.util.ArrayList<PercentPair>(percentiles);
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPercentiles(java.util.Collection)} or {@link #withPercentiles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param percentiles
     *        The percentile values of the aggregated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesResult withPercentiles(PercentPair... percentiles) {
        if (this.percentiles == null) {
            setPercentiles(new java.util.ArrayList<PercentPair>(percentiles.length));
        }
        for (PercentPair ele : percentiles) {
            this.percentiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * 
     * @param percentiles
     *        The percentile values of the aggregated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesResult withPercentiles(java.util.Collection<PercentPair> percentiles) {
        setPercentiles(percentiles);
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
        if (getPercentiles() != null)
            sb.append("Percentiles: ").append(getPercentiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPercentilesResult == false)
            return false;
        GetPercentilesResult other = (GetPercentilesResult) obj;
        if (other.getPercentiles() == null ^ this.getPercentiles() == null)
            return false;
        if (other.getPercentiles() != null && other.getPercentiles().equals(this.getPercentiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentiles() == null) ? 0 : getPercentiles().hashCode());
        return hashCode;
    }

    @Override
    public GetPercentilesResult clone() {
        try {
            return (GetPercentilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
