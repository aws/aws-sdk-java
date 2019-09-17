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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metrics data returned from a <code>GetMetricData</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HistoricalMetricResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoricalMetricResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     */
    private Dimensions dimensions;
    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     */
    private java.util.List<HistoricalMetricData> collections;

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     * 
     * @param dimensions
     *        The <code>Dimensions</code> for the metrics.
     */

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     * 
     * @return The <code>Dimensions</code> for the metrics.
     */

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     * 
     * @param dimensions
     *        The <code>Dimensions</code> for the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetricResult withDimensions(Dimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * 
     * @return A list of <code>HistoricalMetricData</code> objects.
     */

    public java.util.List<HistoricalMetricData> getCollections() {
        return collections;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * 
     * @param collections
     *        A list of <code>HistoricalMetricData</code> objects.
     */

    public void setCollections(java.util.Collection<HistoricalMetricData> collections) {
        if (collections == null) {
            this.collections = null;
            return;
        }

        this.collections = new java.util.ArrayList<HistoricalMetricData>(collections);
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollections(java.util.Collection)} or {@link #withCollections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param collections
     *        A list of <code>HistoricalMetricData</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetricResult withCollections(HistoricalMetricData... collections) {
        if (this.collections == null) {
            setCollections(new java.util.ArrayList<HistoricalMetricData>(collections.length));
        }
        for (HistoricalMetricData ele : collections) {
            this.collections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * 
     * @param collections
     *        A list of <code>HistoricalMetricData</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetricResult withCollections(java.util.Collection<HistoricalMetricData> collections) {
        setCollections(collections);
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
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getCollections() != null)
            sb.append("Collections: ").append(getCollections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoricalMetricResult == false)
            return false;
        HistoricalMetricResult other = (HistoricalMetricResult) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getCollections() == null ^ this.getCollections() == null)
            return false;
        if (other.getCollections() != null && other.getCollections().equals(this.getCollections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getCollections() == null) ? 0 : getCollections().hashCode());
        return hashCode;
    }

    @Override
    public HistoricalMetricResult clone() {
        try {
            return (HistoricalMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HistoricalMetricResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
