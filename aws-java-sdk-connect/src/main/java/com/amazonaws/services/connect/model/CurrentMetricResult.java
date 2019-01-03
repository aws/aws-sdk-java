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
 * A <code>CurrentMetricResult</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CurrentMetricResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentMetricResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     */
    private Dimensions dimensions;
    /**
     * <p>
     * The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     */
    private java.util.List<CurrentMetricData> collections;

    /**
     * <p>
     * The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @param dimensions
     *        The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     */

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @return The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     */

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @param dimensions
     *        The <code>Dimensions</code> for the <code>CurrentMetricResult</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentMetricResult withDimensions(Dimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @return The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     */

    public java.util.List<CurrentMetricData> getCollections() {
        return collections;
    }

    /**
     * <p>
     * The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @param collections
     *        The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     */

    public void setCollections(java.util.Collection<CurrentMetricData> collections) {
        if (collections == null) {
            this.collections = null;
            return;
        }

        this.collections = new java.util.ArrayList<CurrentMetricData>(collections);
    }

    /**
     * <p>
     * The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollections(java.util.Collection)} or {@link #withCollections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param collections
     *        The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentMetricResult withCollections(CurrentMetricData... collections) {
        if (this.collections == null) {
            setCollections(new java.util.ArrayList<CurrentMetricData>(collections.length));
        }
        for (CurrentMetricData ele : collections) {
            this.collections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * </p>
     * 
     * @param collections
     *        The <code>Collections</code> for the <code>CurrentMetricResult</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentMetricResult withCollections(java.util.Collection<CurrentMetricData> collections) {
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

        if (obj instanceof CurrentMetricResult == false)
            return false;
        CurrentMetricResult other = (CurrentMetricResult) obj;
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
    public CurrentMetricResult clone() {
        try {
            return (CurrentMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CurrentMetricResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
